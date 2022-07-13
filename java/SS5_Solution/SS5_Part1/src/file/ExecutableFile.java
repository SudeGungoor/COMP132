package file;

import java.util.Arrays;

import exceptions.CopyingNotAllowedException;

public class ExecutableFile extends BinaryFile {

	//contains the platform (Mac OS on Intel or Android on ARM) that the file can execute on.
	private String platform;
	private byte[] contents;
	
	//Constructor
	public ExecutableFile(String fName, long fSize, boolean canCopy, String platform, byte[] content) {
		super(fName, fSize, canCopy);
		this.platform = platform;
		this.contents = content;
	}
	
	@Override
	public String toString() {
		return "Type: Executable File \n" + super.toString() + "Platform: " + platform + "\n"; 
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public byte[] getContents() {
		return contents;
	}

	public void setContents(byte[] contents) {
		this.contents = contents;
	}

	@Override
	public void onClick() {
		System.out.println("On click: " + this.getName());
	}
	
	@Override
	public BinaryFile getCopy() throws CopyingNotAllowedException {
		ExecutableFile newInstance = null;
		
		if(this.getCanCopy()) {
			String newName=this.getName();
			if(newName.contains(".")) {
				int extensionIndex = newName.indexOf(".");
				newName = newName.substring(0, extensionIndex).concat("(copy)").concat(newName.substring(extensionIndex));
			} else
				newName += "(copy)";
			
			newInstance = new ExecutableFile(newName, this.getSize(), this.getCanCopy(), new String(this.platform), null);
			//make independent copy of byte[] (a reference type)
			byte[] newContents = new byte[this.contents.length];
			for(int i=0; i<this.contents.length; i++)
				newContents[i] = this.contents[i];
			newInstance.contents = newContents;
		
		} else
			throw new CopyingNotAllowedException("You cannot make a copy of this file due to the copyright law!");
		
		return newInstance;
	}
	

}
