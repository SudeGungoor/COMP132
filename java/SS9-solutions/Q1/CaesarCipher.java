import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class CaesarCipher {

	public  Scanner input;
	private Formatter output; 

	public void EncryptFile(int key)
	{
		while (input.hasNextLine())
		{
			String in=input.next();
			String out=encrypt(in,key);
			output.format("%s%n", out);
		}
	}

	public void decryptFile(int key)
	{
		while (input.hasNext())
		{
			String in=input.nextLine();
			String out=decrypt(in,key);
			output.format("%s%n", out);
			System.out.println(out);
		}
	}

	public  void openFiles(String inputFile, String outputFile)
	{
		try
		{
			input=new Scanner(Paths.get(inputFile));
		}
		catch(IOException ioException)
		{
			System.err.println("Error opening input file. Terminating.");
			System.exit(1);
		}

		try
		{
			output = new Formatter(outputFile); // open the file
		}
		catch (SecurityException securityException)
		{
			System.err.println("Write permission denied. Terminating.");
			System.exit(1); // terminate the program
		}
		catch (FileNotFoundException fileNotFoundException)
		{
			System.err.println("Error opening file. Terminating.");
			System.exit(1); // terminate the program
		}

	}	

	public  String encrypt(String plainText, int key)
	{
		String temp="";
		for (int i=0;i<plainText.length();i++)
		{
			char t=(char) (plainText.charAt(i)+key);
			temp=temp+t;
		}
		return temp;
	}
	
	public  String decrypt(String cipherText, int key)
	{
		String temp="";
		for (int i=0;i<cipherText.length();i++)
		{
			char t=(char) (cipherText.charAt(i)-key);
			temp=temp+t;
		}
		return temp;
	}
	
	public void closeFiles()
	{
		input.close();
		output.close();
	}

}
