package swingDemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleWith2DGraphics extends JFrame
{
	SmileGraphics sg = new SmileGraphics();

	public SimpleWith2DGraphics() 
	{
		add(sg);
		setSize(220, 240);
		setVisible(true);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
	}
	
	public static void main(String[] args) {
		new SimpleWith2DGraphics();
	}
	
}

class SmileGraphics extends JPanel
{
	
	public void paint(Graphics g) 
	{
		g.setColor(Color.blue); 
        g.fillRect(0, 0, 200, 200); // x, y, width, height
        
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 100, 100);
        
        g.setColor(Color.red);
        g.drawArc(75, 100, 50, 33, -20, -140);

        g.setColor(Color.black);
        g.fillOval(76, 83, 8, 10);
        g.fillOval(116, 83, 8, 10);        
        
        g.setColor(Color.orange);
        g.fillPolygon(new int[]{100, 95, 105}, new int[]{95, 115, 115}, 3); // x-points, y-points, no. of points
        
        g.setColor(Color.green);
        Font f = new Font("Serif", Font.BOLD, 30);
        g.setFont(f);
        g.drawString("Hello World", 3, 199);
		
	}
	
}
