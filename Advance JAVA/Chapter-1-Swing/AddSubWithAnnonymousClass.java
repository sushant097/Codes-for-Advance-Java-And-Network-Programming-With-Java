package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddSubWithAnnonymousClass 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AddSubExample();
	}

}

class AddSubExample extends JFrame
{
	JTextField t1, t2;
	JButton b,b1;
	JLabel l;
	
	public AddSubExample()
	{
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		b = new JButton("ADD");
		b1 = new JButton("Subtract");
		l = new JLabel("Result");
		
		add(t1);
		add(t2);
		add(b);
		add(b1);
		add(l);
		
		/*
		//Action Listener
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int num1, num2, result;
				
				// getting integer numbers from textField
				num1 = Integer.parseInt(t1.getText());
				num2 = Integer.parseInt(t2.getText());
				
				// add two numbers
				result = num1 + num2;
				
				// Add result to label
				l.setText(result + "");
				
			}
			
		});
		*/

		//Action Listener lambda 
		b.addActionListener(ae -> {
				// TODO Auto-generated method stub
				int num1, num2, result;
				
				// getting integer numbers from textField
				num1 = Integer.parseInt(t1.getText());
				num2 = Integer.parseInt(t2.getText());
				
				// add two numbers
				result = num1 + num2;
				
				// Add result to label
				l.setText(result + "");
				
			
			
		});
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int num1, num2, result;
				
				// getting integer numbers from textField
				num1 = Integer.parseInt(t1.getText());
				num2 = Integer.parseInt(t2.getText());
				
				// add two numbers
				result = num1 - num2;
				
				// Add result to label
				l.setText(result + "");
			}
			
		});
		
		setLayout(new FlowLayout()); // try to occupy middle space of JFrame
		setVisible(true);
		setSize(400, 400);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
		
		
	}
}
