package swingDemo;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;



public class KeyListenerExample 
{
	public static void main(String[] args){
		new KeyListenerDemo();
	}

}

//class which inherits Frame class and implements KeyListener interface  
class KeyListenerDemo extends JFrame implements KeyListener{
	// creating object of Label class   and TextArea class  
	 JLabel l;    
	 JTextArea area;   
	
	 // class constructor
	public KeyListenerDemo()
	{
		 // creating the label  
        l = new JLabel("");  
        l.setBounds (20, 50, 100, 20);    
        // creating the text area  
        area = new JTextArea(); 
        area.setBounds (20, 80, 300, 300);           
        // adding the KeyListener to the text area  
        area.addKeyListener(this);
        
        add(l);
        add(area);
        
        setLayout(null); // try to occupy middle space of JFrame
		setVisible(true);
		setSize(400, 400);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
		
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

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		 l.setText ("Key Typed"); 
		 l.setForeground(Color.BLUE);
	}
}
