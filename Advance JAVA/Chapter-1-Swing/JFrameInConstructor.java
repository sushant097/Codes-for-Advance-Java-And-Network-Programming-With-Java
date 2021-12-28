package swingDemo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameInConstructor 
{
	public static void main(String[] args) 
	{
		new ExampleOfConstructorJFrame();
	}

}

class ExampleOfConstructorJFrame
{
	JFrame f;
	JButton b;
	
	public ExampleOfConstructorJFrame() 
	{
		f = new JFrame("Swing Demo");
		
		b = new JButton("Click me!");
		b.setBounds(20, 10, 150, 50); // x,y,w,h
		
		// add button to JFrame
		f.add(b);
		
		f.setLayout(null); // try to occupy middle space of JFrame
		f.setVisible(true);
		f.setSize(400, 400);
		// For the proper operation of closing Frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
		
	}
}