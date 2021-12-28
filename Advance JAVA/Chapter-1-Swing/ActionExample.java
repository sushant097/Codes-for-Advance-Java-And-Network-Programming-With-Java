package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionDemo();
	}

}

class ActionDemo extends JFrame implements ActionListener
{
	JLabel l;
	JButton b, b2;
	public ActionDemo()
	{
		l = new JLabel("Action!");
		b = new JButton("CLick me!");
		b2 = new JButton("Touch me!");
		
		// Adding components in JFrame
		add(b);
		add(b2);
		add(l);
		
		// adding actionListener to the button b
		b.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(new FlowLayout()); // try to occupy middle space of JFrame
		setVisible(true);
		setSize(400, 400);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			l.setText("CLick me!");
			System.out.println("Button Clicked!");
		}
		else {
			l.setText("Touch me!");
			System.out.println("Button Touched!");
		}
		
		
	}
	
}
