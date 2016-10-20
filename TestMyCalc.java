import javax.swing.*;


public class TestMyCalc {

	public static void main(String[] args) {
		//create frame for calculator
		MyCalcFrame calc = new MyCalcFrame();
		calc.setSize(300,400);
		calc.setVisible(true);
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setTitle("My Calculator");
		System.out.println("Testing my calculator");
	}

}
