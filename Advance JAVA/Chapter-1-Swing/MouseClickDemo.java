package swingDemo;

import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.*;

public class MouseClickDemo extends MouseAdapter{
	
	JFrame f;
	
	public MouseClickDemo()
	{
		f = new JFrame("MouseClick");
		
		f.addMouseListener(this);
		f.setLayout(new FlowLayout()); // try to occupy middle space of JFrame
		f.setVisible(true);
		f.setSize(400, 400);
		// For the proper operation of closing Frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
		
	}
	public void mouseClicked(MouseEvent e){
//		System.out.println("Mouse Clicked!");
		
		Graphics g = f.getGraphics(); // Create the graphics object
		// set the color of the graphics
		g.setColor(Color.BLUE);
		// set the shape of graphics object
		g.fillOval(e.getX(), e.getY(), 20, 20);
		
		
	}
	
	

	public static void main(String[] args) {

		new MouseClickDemo();
	}
	
	
}

