package swingDemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameInsideJFrame extends JFrame
{
	JButton b;
	
	public JFrameInsideJFrame() 
	{
		b = new JButton("Open Login Page");
		b.setBackground(Color.GREEN);
		b.setForeground(Color.CYAN);
		b.setBounds(200, 200, 150, 150);
		
		
		// add ActionListener
		// When button b is clicked, it called another Frame of Login Class of LoginExampleWithAnnonymousClass.java
		b.addActionListener(e -> {
			new Login();// open new Login JFrame
			dispose(); // close the current JFrame
		});
		
		
		add(b);
		setVisible(true);
		setSize(400, 400);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
		
		
	}
	public static void main(String[] args) 
	{
		new JFrameInsideJFrame();

	}

}


