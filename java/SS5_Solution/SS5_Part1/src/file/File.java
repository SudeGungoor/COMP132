package file;

import java.util.*;

import exceptions.CopyingNotAllowedException;

public abstract class File {
	
	private String name;
	private long size;
	private Date dateCreated;
		 
    public File(String fName, long fSize) {
        this.setName(fName);
        this.size = fSize;
        this.dateCreated = new Date();
    }
    
	public long getSize() {
		return this.size;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String fileName) {
		if(fileName.contains(" ")) {
			fileName = fileName.replace(" ", "");
		}
		this.name=fileName;
	}

	public Date getCreationDate() {
		return this.dateCreated;
	}
	
	public abstract void onClick();

	public static void callPolymorphicMethods(File[] files) {
		for(int i=0; i<files.length; i++) {
			System.out.println("\nFile: " + files[i].getName());
			files[i].onClick();
			
			if(files[i] instanceof Openable)
				System.out.println("Open with: " + ((Openable)files[i]).opensWith());
			if(files[i] instanceof TextFile)
				((TextFile)files[i]).clear();
			else if(files[i] instanceof BinaryFile) {
				try{
					BinaryFile cp = ((BinaryFile)files[i]).getCopy();
					System.out.println("Copied. ");
					cp.onClick();
				} catch(CopyingNotAllowedException e) {
					System.out.println("CopyingNotAllowedException: " + e.getMessage());
				}
			}
		}
	}
	
	// will be called by the subclass toString() methods
	public String toString() {
	    String res = "File name: " + this.getName() + "\n";
	    res +=  "File size: " + this.getSize() + "\n";
	    res += "Date created: " + this.dateCreated.toString() + "\n";    
	    
	    return res;
	}
}
