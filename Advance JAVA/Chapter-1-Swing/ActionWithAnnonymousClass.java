package swingDemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionWithAnnonymousClass 
{
	public static void main(String[] args) {
		new DemoAnnonymousClass();
	}

}

class DemoAnnonymousClass extends JFrame
{
	JTextField t1, t2;
	JButton b1, b2;
	JLabel l;
	
	public DemoAnnonymousClass()
	{
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		b1 = new JButton("Add");
		b2 = new JButton("Subtract");
		l = new JLabel("Result");
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(l);
		
		
//		b1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int num1, num2, result;
//				num1 = Integer.parseInt(t1.getText());
//				num2 = Integer.parseInt(t2.getText());
//				result = num1 + num2;
//				l.setText(result + "");
//				
//			}
//			
//		});
		
		b1.addActionListener(e -> {
				int num1, num2, result;
				num1 = Integer.parseInt(t1.getText());
				num2 = Integer.parseInt(t2.getText());
				result = num1 + num2;
				l.setText(result + "");
				
				
			}
			
		);
		
		
		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int num1, num2, result;
				num1 = Integer.parseInt(t1.getText());
				num2 = Integer.parseInt(t2.getText());
				result = num1 - num2;
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
