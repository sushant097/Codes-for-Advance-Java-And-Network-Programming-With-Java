package swingDemo;

import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

public class Display2DShapeNextMethod 
{
	JFrame f;
	JPanel panel;
	Graphics graphics; // declare graphics variable
	
	public Display2DShapeNextMethod() 
	{
		f = new JFrame("Jframe graphics");
		panel = new JPanel();
		graphics = panel.getGraphics();
		
		// draw rectangle
		graphics.setColor(Color.RED);
		graphics.fillRect(10, 100, 100, 100);
		graphics.setColor(Color.BLACK);
		graphics.drawRect(10, 100, 100, 100);
		
		// draw square
		graphics.setColor(Color.BLUE);
		graphics.fillOval(120, 100, 100, 100);
		graphics.setColor(Color.BLACK);
		graphics.drawOval(120, 100, 100, 100);
		
		
		//add panel 
		f.add(panel);

		f.setLayout(new FlowLayout()); // try to occupy middle space of JFrame
		f.setVisible(true);
		f.setSize(400, 400);
		// For the proper operation of closing Frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Display2DShapeNextMethod();
	}

}
