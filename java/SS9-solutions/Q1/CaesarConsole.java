
public class CaesarConsole {

	public static void main(String[] args)
	{
		int key = 3; 
		CaesarCipher cc=new CaesarCipher();

		// Example Encryption with key
		cc.openFiles("alice.txt", "encrypt-alice.txt");
		cc.EncryptFile(key);
		cc.closeFiles();	

		// Example Decryption with key
		cc.openFiles("encrypt-alice.txt", "plaintext-alice.txt");
		cc.decryptFile(key);
		cc.closeFiles();	
	}

}
