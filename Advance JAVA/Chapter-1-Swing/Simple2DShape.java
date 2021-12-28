package swingDemo;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Simple2DShape extends JFrame {
	
	JPanel draw = new DrawCircle();
	
	public Simple2DShape()	
	{
		add(draw);
//		setLayout(new FlowLayout()); // try to occupy middle space of JFrame
		setVisible(true);
		setSize(400, 400);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Simple2DShape();
	}

}

class DrawCircle extends JPanel
{
	 	
	public void paint(Graphics g) {
		g.drawLine(0,0, 400, 400);
	}
}
