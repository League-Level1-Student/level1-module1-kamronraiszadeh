package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class binaryconverter implements ActionListener {
	JTextField guy = new JTextField(20);
	public static void main(String[] args) {
		binaryconverter yug = new binaryconverter();
		yug.setup();
	}

	void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JButton button = new JButton("convert");
		button.addActionListener(this);
		frame.add(panel);
		panel.add(button);
		panel.add(guy);
		frame.setVisible(true);
		frame.pack();
	}
	
	

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
       String input = guy.getText();
       ;
       
       System.out.println(convert(input));
	}
}