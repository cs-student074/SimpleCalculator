

import java.awt.GridLayout;
import javax.swing.*;

public class OperatorPanel extends JPanel{
	private JButton plusOperator;
	private JButton minusOperator;
	private JButton multiplyOperator;
	private JButton divideOperator;
	
	OperatorPanel(){
		setLayout(new GridLayout(1,4,10,20));
		plusOperator = new JButton("+");
		minusOperator = new JButton("-");
		multiplyOperator = new JButton("*");
		divideOperator = new JButton("/");
		add(plusOperator);
		add(minusOperator);
		add(multiplyOperator);
		add(divideOperator);
	}
	
	
}
