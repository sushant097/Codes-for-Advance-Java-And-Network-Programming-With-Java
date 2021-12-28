package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LoginExample2 {
	
	public static void main(String[] args) {
		new Login2();
	}

}

class Login2 extends JFrame
{
	JLabel l1, l2, result, info;
	JTextField t;
	JPasswordField p;
	JButton b;
	JRadioButton r1, r2;
	JCheckBox c1, c2, c3;
	
	public Login2()
	{
		l1 = new JLabel("Username: ");
		l2 = new JLabel("Password: ");
		
		info = new JLabel("Info: ");
		
		result = new JLabel("");
		t = new JTextField(20);
		p = new JPasswordField(20);
		b = new JButton("Login");
		
		// Initialize radio buttons
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		
		//logical grouping of radio buttons
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		// Initialize check boxes
		c1 = new JCheckBox("C");
		c2 = new JCheckBox("Dot Net");
		c3 = new JCheckBox("Advance Java");
		
		// Add ItemListener
		
		r1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(r1.isSelected()) {
					JOptionPane.showMessageDialog(null, "You select Male", "Gender Select" , JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "You select Female.", "Gender Select" , JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		});
		
		c1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				System.out.println("Subject C is " + (e.getStateChange() == ItemEvent.SELECTED
	                    ? "SELECTED" : "DESELECTED"));	
				info.setText("Subject C is " + (e.getStateChange() == ItemEvent.SELECTED
	                    ? "SELECTED" : "DESELECTED"));
			}
			
		});
		
		c2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Subject Dot Net is " + (e.getStateChange() == ItemEvent.SELECTED
	                    ? "SELECTED" : "DESELECTED"));	
				info.setText("Subject Dot Net is " + (e.getStateChange() == ItemEvent.SELECTED
	                    ? "SELECTED" : "DESELECTED"));
				
			}
			
		});
		
		c3.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				System.out.println("Subject Advance Java is " + (e.getStateChange() == ItemEvent.SELECTED
	                    ? "SELECTED" : "DESELECTED"));	
				info.setText("Subject Advance Java is " + (e.getStateChange() == ItemEvent.SELECTED
	                    ? "SELECTED" : "DESELECTED"));
			}
			
		});
		
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String result = "";
				if(r1.isSelected()) {
					result = "Mr. "+ t.getText();
				}else {
					result = result + "Ms. " + t.getText();
				}
				
				result = result + " Your subjects selected are: ";
				
				if(c1.isSelected()) {
					result = result + "C, ";
				}
				if(c2.isSelected()) {
					result = result + "Dot Net, ";
				}
				if(c3.isSelected()) {
					result = result + "Advance Java,";
				}
				
				info.setText(result);
				
			}
			
		});
		add(l1);
		add(t);
		add(l2);
		add(p);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(c3);
		add(b);
		add(result);
		add(info);
		
		setLayout(new FlowLayout()); // try to occupy middle space of JFrame
		setVisible(true);
		setSize(400, 400);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
		
	}
}