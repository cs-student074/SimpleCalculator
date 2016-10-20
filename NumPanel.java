package myCalculator;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class NumPanel extends JPanel {
	private JLabel num1Label, num2Label;
	private JTextField num1Field, num2Field;
	
	public NumPanel() {
		setLayout(new GridLayout(2,2,30,30));	
		num1Label = new JLabel("Number 1");
		num2Label = new JLabel("Number 2");
		num1Field = new JTextField();
		num2Field = new JTextField();
		add(num1Label);
		add(num1Field);
		add(num2Label);
		add(num2Field);
		}
	
	public String getNum1() {
		return num1Field.getText();
	}
	
	public String getNum2() {
		return num2Field.getText();
	}
}
