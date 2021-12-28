package swingDemo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstGUI {

	public static void main(String[] args) {
		new WindowFrame();
	}	
}

class WindowFrame extends JFrame{
	public WindowFrame() {
		JButton b1 = new JButton("Click me!"); // creating the new button 
		JButton b2 = new JButton("Touch me!"); // creating the new button 
		
		add(b1); // add the button in the JFrame
		add(b2);
		
		setSize(400, 400); // set the size of the JFrame window
		// it helps to arrange components in  the container
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}