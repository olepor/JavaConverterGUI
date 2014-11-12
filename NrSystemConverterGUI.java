import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NrSystemConverterGUI{
    
    JFrame frame;
    JPanel panel;
    JPanel panel2;
    JPanel panel3;
    JTextField textField, textField2;
    JLabel text, finalOutput;
    JButton button, button2;

    String input, base;

    NumberSystemConverter converter = new NumberSystemConverter();

    public NrSystemConverterGUI(){
	frame = new JFrame("Nr System Converter 0.0");
	panel = new JPanel();
	panel2 = new JPanel();
	panel3 = new JPanel();
	textField = new JTextField();
	textField2 = new JTextField();
	text = new JLabel();
	finalOutput = new JLabel();
	button = new JButton();
	button2 = new JButton();

	textField.setText("Enter the number you would like to convert");
	textField2.setText("Enter the base");
	text.setText("Please enter a number to convert");
	button.setText("Convert from base b to dec");
	button2.setText("Convert from dec to base b");

	// Two "methods" for getting the textInput from the buttons
	// Button converts from base to decimal
	// Button2 converts from decimal to an entered base
	button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		    input = textField.getText();
		    base = textField2.getText();
		    int out = converter.convertNToDec(input, Integer.parseInt(base));
		    finalOutput.setText("The final answer converted is: " + out);
		    
		}
	    });

	button2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		    input = textField.getText();
		    base = textField2.getText();
		    input = converter.convertNrToBase(Integer.parseInt(input), Integer.parseInt(base));
		    finalOutput.setText("The final answer converted is: " + input);
		}
	    });

	panel.add(textField);
	panel.add(textField2);
	panel.add(finalOutput, BorderLayout.SOUTH);
	panel2.add(text);
	panel3.add(button);
	panel3.add(button2);

	frame.add(panel, BorderLayout.CENTER);
	frame.add(panel2, BorderLayout.NORTH);
	frame.add(panel3, BorderLayout.SOUTH);
	frame.setSize(450, 450);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
    }
	
	public static void main(String[] args) {
	    NrSystemConverterGUI gui = new NrSystemConverterGUI();
	}
	
}
