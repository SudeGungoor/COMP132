// Java swing GUI design example 
// JFrame, JTextField, JComboBox, JButton
// FlowLayout, ActionListener, ActionEvent

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Converter extends JFrame{

	private JTextField text1;
	private JTextField text2;
	private JButton button;
	private JComboBox<String> combo1;
	private JComboBox<String> combo2;
	
	//Elements of the combo box
	private static final String[] names = {"kg", "lb", "mile", "km"}; 
	
	public Converter()
	{
		//Create buttons, text fields etc.
		super("A unit conversion tool");
				
		setLayout(new FlowLayout());
		
		text1 = new JTextField("Enter a value");
		add(text1);
		
		text2 = new JTextField(15);
		text2.setEditable(false);
		add(text2);
		
		button = new JButton("Convert");
		add(button);
		
		combo1 = new JComboBox<String>(names);
		add(combo1);
		
		combo2 = new JComboBox<String>(names);
		add(combo2);
		
		ButtonHandler handler = new ButtonHandler();
		button.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener
	{
		// Perform the conversion here
		public void actionPerformed(ActionEvent event)
		{
			try{
				double num = Double.parseDouble(text1.getText());
				String first = (String) combo1.getSelectedItem();
				String second = (String) combo2.getSelectedItem();
				String result;
				if(first == second)
				{
					result = ((Double)num).toString();
				}
				else if(first == "kg" && second == "lb")
				{
					result = ((Double)(num*2.2046)).toString();
				}
				else if(first == "lb" && second == "kg")
				{
					result = ((Double)(num*0.4535)).toString();
				}
				else if(first == "mile" && second == "km")
				{
					result = ((Double)(num*1.6093)).toString();
				}
				else if(first == "km" && second == "mile")
				{
					result = ((Double)(num*0.6213)).toString();
				}
				else{
					result = "Cannot convert!";
				}	
				text2.setText(result);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e.getMessage());
				text2.setText("Value is not valid!");
			}

		}
	}

}
