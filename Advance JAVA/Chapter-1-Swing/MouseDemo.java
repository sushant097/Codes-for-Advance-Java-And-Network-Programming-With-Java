package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MouseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListen();
	}

}

class MouseListen extends JFrame{
	
	
	public MouseListen() {
		
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				System.out.println(x +" , "+ y);
//				System.out.println("Mouse Pressed");
			}
			public void mouseClicked(MouseEvent e){
//				System.out.println("Mouse Clicked!");
			}
			
		});
		
		
		setLayout(new FlowLayout()); // try to occupy middle space of JFrame
		setVisible(true);
		setSize(400, 400);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
	}
}
