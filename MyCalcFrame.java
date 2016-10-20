import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;

public class MyCalcFrame extends JFrame implements ActionListener{
	
	JButton addButton, subButton, multButton, divButton;
	ResultPanel panel3;
	NumPanel panel1;
	
	public MyCalcFrame() {
	//create the buttons for panel2
	addButton = new JButton("+");
	subButton = new JButton("-");
	multButton = new JButton("*");
	divButton = new JButton("/");
	//add the action listeners to the buttons
	addButton.addActionListener(this);
	subButton.addActionListener(this);
	multButton.addActionListener(this);
	divButton.addActionListener(this);
	
	//create panel 1 from the NumPanel class
	System.out.println("MyCalc is being created");
	setLayout(new BorderLayout(20,50));
	panel1 = new NumPanel();
	panel1.setPreferredSize(new Dimension(100,100));
	add(panel1, BorderLayout.NORTH);
	
	//add the buttons to panel 2
	JPanel panel2 = new JPanel();
	panel2.setPreferredSize(new Dimension(100,70));
	panel2.add(addButton);
	panel2.add(subButton);
	panel2.add(multButton);
	panel2.add(divButton);
	add(panel2,BorderLayout.CENTER);
	//adjust the button colors and fonts
	addButton.setBackground(new Color(51,204,0));
	addButton.setFont(new Font("Verdana", Font.BOLD, 20));
	addButton.setForeground(Color.WHITE);
	subButton.setBackground(new Color(204,0,51));
	subButton.setFont(new Font("Verdana", Font.BOLD, 20));
	subButton.setForeground(Color.WHITE);
	multButton.setBackground(new Color(51,102,255));
	multButton.setFont(new Font("Verdana", Font.BOLD, 20));
	multButton.setForeground(Color.WHITE);
	divButton.setBackground(new Color(204,153,0));
	divButton.setFont(new Font("Verdana", Font.BOLD, 20));
	divButton.setForeground(Color.WHITE);
	//create panel 3 from the ResultPanel class
	panel3 = new ResultPanel();
	panel3.setPreferredSize(new Dimension(100,30));
	add(panel3, BorderLayout.SOUTH);
	}
	
	//create the actions when the buttons are clicked
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
