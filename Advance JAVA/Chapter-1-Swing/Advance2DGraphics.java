package swingDemo;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Advance2DGraphics extends JFrame
{
	SmileGraphics2 sg = new SmileGraphics2();

	public Advance2DGraphics() 
	{
		add(sg);
		setSize(220, 240);
		setVisible(true);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
	}
	
	public static void main(String[] args) {
		new Advance2DGraphics();
	}
	
}

class SmileGraphics2 extends JPanel
{
	int xy;
    int wh = 50;
    Color bgc = Color.blue;
    Color fgc = Color.white;
    Color xor = Color.green;
    
    public SmileGraphics2() {
    	setBackground(bgc);
        setForeground(fgc);
	}
    
	public void paint(Graphics g) 
	{
			super.paint(g);
		 	xy = 0;
         
	        g.setXORMode(bgc);
	        fRect(g, fgc);
	        fRect(g, fgc);
	        g.setXORMode(xor);
	        fRect(g, fgc);
	        fRect(g, fgc);
	        fRect(g, xor);
	        fRect(g, bgc);
	        fRect(g, bgc);
		
	}

	private void fRect(Graphics graph, Color c) {
		graph.setColor(bgc);
        graph.drawRect(xy, xy, wh, wh);
        graph.setColor(c);
        graph.fillRect(xy, xy, wh, wh);
        xy += (wh/2);
		
	}
	
}

// More on https://edux.pjwstk.edu.pl/mat/268/lec/lect5/lecture5.html