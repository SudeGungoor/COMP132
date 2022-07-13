// Java swing GUI example 
// with JOptionPane 

package gui_examples;

import javax.swing.JOptionPane;

public class TestOptionPane {

	public static void main(String[] args) {
		
		// get user input from JOptionPane input dialogs
		String number1 = JOptionPane.showInputDialog("First number ? ");
		String number2 = JOptionPane.showInputDialog("Second number ? ");

		try {
		
		// convert String inputs to Integers to use in calculation
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);

		int mult = n1 * n2;
		
		// display result in a JOptionPane message dialog
		JOptionPane.showMessageDialog(null, "Multiplication of  " + n1 + " and " + n2 + " is: " 
										+ mult, "Multiplication of two numbers", JOptionPane.PLAIN_MESSAGE);
		

		} // end of try block
		catch(NumberFormatException e)
 		{
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Entered value not valid");
		}
	
	}

}
