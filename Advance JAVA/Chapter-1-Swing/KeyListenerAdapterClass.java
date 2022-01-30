package swingDemo;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/* TODO: Question (8 Marks)
 * Write a program to display Frame where user give two numbers as input,
 * when user press any key, show the sum of the input two numbers and
 * when user key release, show the difference of the two input numbers.
 * State any assumptions you made.
 * 
 * */

public class KeyListenerAdapterClass extends KeyAdapter
{
	JFrame f;
	JLabel l;
	JTextArea area;
	
	public KeyListenerAdapterClass()
	{
		// Initialize JFrame
		f = new JFrame("KeyListenerDemo");
		// creating the label  
        l = new JLabel("");  
        l.setBounds (20, 50, 100, 20);    
        // creating the text area  
        area = new JTextArea(); 
        area.setBounds (20, 80, 300, 300);           
        // adding the KeyListener to the text area  
        area.addKeyListener(this);
        
        f.add(l);
        f.add(area);
        
        f.setLayout(null); // try to occupy middle space of JFrame
		f.setVisible(true);
		f.setSize(400, 400);
		// For the proper operation of closing Frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 l.setText ("Key Pressed"); 
		 l.setForeground(Color.red);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 l.setText ("Key Released");
		 l.setForeground(Color.GREEN);
	}
	public static void main(String[] args){
		new KeyListenerAdapterClass();
	}

}
