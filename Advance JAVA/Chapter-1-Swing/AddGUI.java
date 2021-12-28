package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddGUI 
{
	public static void main(String[] args) {
		new AddTwoNumbers();
	}

}

class AddTwoNumbers extends JFrame implements ActionListener{
	 JFrame f;
	 JTextField t1, t2;
	 JButton b, b1;
	 JLabel l;
	 
	 public AddTwoNumbers()
	 {
		 t1 = new JTextField(10);
		 t2 = new JTextField(10);
		 b = new JButton("ADD");
		 b1 = new JButton("Subtract");
		 l = new JLabel("Result");
		 
		 add(t1);
		 add(t2);
		 add(b);
		 add(b1);
		 add(l);
		 
		 b1.addActionListener(this);
		 b.addActionListener(this);
		 
		setLayout(new FlowLayout()); // try to occupy middle space of JFrame
		setVisible(true);
		setSize(400, 400);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
		 
	 }
	
	 public void actionPerformed(ActionEvent e) {
		 int num1, num2, result;
		 num1 = Integer.parseInt(t1.getText());
		 num2 = Integer.parseInt(t2.getText());
		 
		 if(e.getSource() == b) { // b.isSelected()
			 result = num1 + num2;
			 l.setText(result + ""); // Integer.toString(result)
		 }
		
		 else {
			 result = num1 - num2;
			 l.setText(result + "");
		 }
		 
	 }

	
}
