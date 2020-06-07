package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CustomerAdder extends JPanel{
	
	WindowFrame frame;
	
	public CustomerAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPhone = new JLabel("Phone : ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		JLabel labelBook = new JLabel("Book : ", JLabel.TRAILING);
		JTextField fieldBook = new JTextField(10);
		labelBook.setLabelFor(fieldBook);
		panel.add(labelBook);
		panel.add(fieldBook);
		
		JLabel labelPeriod = new JLabel("Loan Period : ", JLabel.TRAILING);
		JTextField fieldPeriod = new JTextField(10);
		labelPeriod.setLabelFor(fieldPeriod);
		panel.add(labelPeriod);
		panel.add(fieldPeriod);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
	
		this.add(panel);
		this.setVisible(true);
	}
}
