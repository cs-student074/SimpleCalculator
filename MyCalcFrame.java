package myCalculator;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.BorderLayout;

public class MyCalcFrame extends JFrame implements ActionListener{
	
	JButton addButton, subButton, multButton, divButton;
	ResultPanel panel3;
	NumPanel panel1;
	public MyCalcFrame() {
	addButton = new JButton("+");
	subButton = new JButton("-");
	multButton = new JButton("*");
	divButton = new JButton("/");
	System.out.println("MyCalc is being created");
	setLayout(new BorderLayout(20,50));
	panel1 = new NumPanel();
	panel1.setPreferredSize(new Dimension(100,100));
	add(panel1, BorderLayout.NORTH);
	
	addButton.addActionListener(this);
	subButton.addActionListener(this);
	multButton.addActionListener(this);
	divButton.addActionListener(this);
	JPanel panel2 = new JPanel();
	panel2.setPreferredSize(new Dimension(100,70));
	panel2.add(addButton);
	panel2.add(subButton);
	panel2.add(multButton);
	panel2.add(divButton);
	add(panel2,BorderLayout.CENTER);
	

	panel3 = new ResultPanel();
	panel3.setPreferredSize(new Dimension(100,30));
	add(panel3, BorderLayout.SOUTH);
	
	

	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addButton){
			int num1 = Integer.parseInt(panel1.getNum1());
			int num2 = Integer.parseInt(panel1.getNum2());
			int add = num1+num2;
			panel3.setText(Integer.toString(add));
		}
		else if(e.getSource() == subButton){
			int num1 = Integer.parseInt(panel1.getNum1());
			int num2 = Integer.parseInt(panel1.getNum2());
			int sub = num1 - num2;
			panel3.setText(Integer.toString(sub));
		}
		else if(e.getSource() == multButton){
			int num1 = Integer.parseInt(panel1.getNum1());
			int num2 = Integer.parseInt(panel1.getNum2());
			int mult = num1 * num2;
			panel3.setText(Integer.toString(mult));
		}
		else if(e.getSource() == divButton){
			int num1 = Integer.parseInt(panel1.getNum1());
			int num2 = Integer.parseInt(panel1.getNum2());
			int div = num1 / num2;
			panel3.setText(Integer.toString(div));
		}
	}
}
