package myCalculator;
import java.awt.GridLayout;
import javax.swing.*;

public class ResultPanel extends JPanel{
	private JLabel resultLabel;
	private JTextField resultField;
	
	ResultPanel(){
		setLayout(new GridLayout(1,2,30,0));	
		resultLabel = new JLabel("Result");
		resultField = new JTextField();
		add(resultLabel);
		add(resultField);
	}
	
	public void setText(String s){
		resultField.setText(s);
	}
	
}
