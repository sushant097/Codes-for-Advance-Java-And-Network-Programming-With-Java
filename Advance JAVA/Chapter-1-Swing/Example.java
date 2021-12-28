package swingDemo;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Example extends JFrame
{
	JFrame f;
	Example()
	{
		f = new JFrame("example"); //creating instance of JFrame and initialize its name 
		
		JButton b = new JButton("click"); // creating instance of button
		b.setBounds(130, 100, 100, 40); // x axis, y axis, width, height
		
		add(b);//adding button in a frame
		
		setSize(400, 400); // width and height of  a frame
		setLayout(null);// using no layout managers
		setVisible(true);//making frame visible
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
	}
	
	public static void main(String[] args) 
	{
		new Example(); 
	}

}




