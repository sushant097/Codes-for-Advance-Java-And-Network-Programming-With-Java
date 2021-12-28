package swingDemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TwoDShapes extends JFrame
{
	MyPanel panel;
	 public TwoDShapes() {		 
		 
		panel = new MyPanel();
		
		add(panel);
		setVisible(true);
		setSize(400, 400);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
	}
	
	
	
	public static void main(String[] args) {
		new TwoDShapes();
	}
	

}

class MyPanel extends JPanel{
	
	public MyPanel(){
		
	}
	
	// Override method of JFrame
	public void paint(Graphics g) {
//		g.drawLine(0,0, 400, 400);
		g.drawString("Hello",40,40);  
        g.fillRect(130, 30,100, 80);  
        g.drawOval(30,130,50, 60);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);  
	        
		}
}


