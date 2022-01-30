package swingDemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/* 2020 BCA Advance Java TU Question: (10 marks)
 * Write a program to display Frame where user give two numbers as input,
 * when user pressed mouse, show the sum of the input two numbers and
 * when user release mouse, show the difference of the two input numbers.
 * State any assumptions you made.
 * 
 * */
public class MouseListenerAndEvents 
{
	public static void main(String[] args){
		new MouseRealeseAndPress();
	}

}

class MouseRealeseAndPress extends MouseAdapter
{
	JFrame f;
	JLabel l, num1, num2, result;
	JTextField t1, t2;
	public MouseRealeseAndPress(){
		f = new JFrame("MouseAdapterDemo");
		l = new JLabel("Nothing now!");
		l.setForeground(Color.red);
		num1 = new JLabel("Enter First Number: ");
		t1 = new JTextField("0",10);
		num2 = new JLabel("Enter Second Number: ");
		t2 = new JTextField("0",10);
		result = new JLabel("Result: ");

		
		// add label to frame
		f.add(l);
		f.add(num1);
		f.add(t1);
		f.add(num2);
		f.add(t2);
		f.add(result);

		// add mouse listener to frame
		f.addMouseListener(this);
		f.setLayout(new FlowLayout()); // try to occupy middle space of JFrame
		f.setVisible(true);
		f.setSize(400, 400);
		// For the proper operation of closing Frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Add Two Number");
		l.setForeground(Color.GREEN);
		float n1, n2, sum;
			n1 = Float.parseFloat(t1.getText());
			n2 = Float.parseFloat(t2.getText());
			sum = n1 + n2;
			result.setText("" + sum);
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Subtract Two Number");
		l.setForeground(Color.BLUE);
		float n1, n2, diff;
		n1 = Float.parseFloat(t1.getText());
		n2 = Float.parseFloat(t2.getText());
		diff = n1 - n2;
		result.setText("" + diff);
	}


	
	
}
