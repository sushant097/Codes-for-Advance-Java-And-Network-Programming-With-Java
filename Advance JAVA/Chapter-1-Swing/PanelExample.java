package swingDemo;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExample 
{
	public static void main(String[] args) {
		new PanelDemo();
	}

}

class PanelDemo extends JFrame
{
	JPanel panel, panel2;
	JButton b1, b2;
	
	PanelDemo()
	{
		JPanel panel = new JPanel();
		panel.setBounds(40,80,200,200);  
		panel.setBackground(Color.black);
//		panel.setLayout(new FlowLayout());
		JPanel panel2 = new JPanel();
		panel2.setBounds(210,210,150,150);
		panel2.setBackground(Color.orange);
		
		
		JButton b1 = new JButton("Click me!");
		JButton b2 = new JButton("Touch me!");
		
		
		// For button b1
		b1.setBounds(50, 100, 80, 3);
		b1.setBackground(Color.yellow);
		
		// For button b2
		b2.setBounds(100, 100, 80, 3);
		b2.setBackground(Color.green);
		
		// Add to the panel
		panel.add(b1);
		panel2.add(b2);
		
		
		// Add panel to the JFrame
		add(panel);	
		add(panel2);
		
		setLayout(null); 
		setVisible(true);
		setSize(400, 400);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
		
		
	}
}
