// Java swing GUI design example 
// JFrame: provides basic window features

package gui_examples;

import javax.swing.JFrame;

public class TestGUI {

	public static void main(String[] args) {
		
/*
 		JFrame frame = new JFrame("Comp132 Swing example!");
 
		frame.setSize(300, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// to terminate app when the JFrame is closed.
		// when JFrame window is closed, the program automatically terminates.
*/
		
		Comp132Frame myframe = new Comp132Frame();
		
		myframe.setSize(400, 500);
		myframe.setVisible(true);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
