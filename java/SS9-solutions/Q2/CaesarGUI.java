import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CaesarGUI extends JFrame{
	private JLabel inputLabel;
	private JLabel outputLabel;
	private JLabel keyLabel;
	private JTextField inputField;
	private JTextField outputField;
	private JTextField keyField;
	private JButton encryptButton;
	private JButton decryptButton;
	public CaesarGUI()
	{
		super(" Caesar Cipher ");
		inputLabel=new JLabel("Enter input file name");
		outputLabel=new JLabel("Enter output file name");
		keyLabel=new JLabel("Key");
		inputField=new JTextField();
		outputField=new JTextField();
		keyField=new JTextField();
		encryptButton=new JButton("Encrypt");
		decryptButton=new JButton("Decrypt");
		setLayout(new GridLayout(4,2));
		add(inputLabel);
		add(inputField);
		add(outputLabel);
		add(outputField);
		add(keyLabel);
		add(keyField);
		add(encryptButton);
		add(decryptButton);

		encryptButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String in=inputField.getText();
				String out=outputField.getText();
				int key=Integer.parseInt(keyField.getText());

				CaesarCipher cc=new CaesarCipher();
				cc.openFiles(in, out);
				cc.EncryptFile(key);
				cc.closeFiles();	
			}

		}

				);
		decryptButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String in=inputField.getText();
				String out=outputField.getText();
				int key=Integer.parseInt(keyField.getText());

				CaesarCipher cc=new CaesarCipher();
				cc.openFiles(in, out);
				cc.decryptFile(key);
				cc.closeFiles();	
			}

		}

				);	

	}	
	public static void main(String[] args)
	{
		CaesarGUI cg=new CaesarGUI();
		cg.setVisible(true);
		cg.setSize(300, 300);
		cg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}



}
