// Java swing GUI design example 
// with JFrame, JTextArea, JButton, 
// and BorderLayout, ActionListener, ActionEvent

package gui_examples;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Comp132Frame extends JFrame {

	private JTextArea textArea;
	private JButton button;
	
//	private JButton button2;
	
	// constructor sets up Graphical User Interface
	public Comp132Frame() {
		
		super("Comp132 GUI Frame Design");
		
		setLayout(new BorderLayout()); // Layout: specifies how components are arranged.

		textArea = new JTextArea();
		button = new JButton("Click here!");

//		button2 = new JButton("Click here 2!");
		
		// register anonymous action listener
		button.addActionListener(
				// An anonymous inner class is declared without a name 
				// and typically appears inside a method declaration.
				new ActionListener() // anonymous inner class
				{ 
					@Override
					public void actionPerformed(ActionEvent arg0) {
						textArea.append("Winter is coming!!! \n");
						// will be executed every time the button is pressed.

					}
				} // end anonymous inner class
		); // end call to addActionListener
	
		// register anonymous action listener
/*		button2.addActionListener(
				new ActionListener() // anonymous inner class
				{ 
					@Override
					public void actionPerformed(ActionEvent arg0) {
						textArea.append("Computer Science Education Week!!! \n");
						// will be executed every time the button is pressed.

					}
				} // end anonymous inner class
		); // end call to addActionListener
*/
		
		add(textArea, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		
//		add(button2, BorderLayout.NORTH);

	} // end of constructor
}
