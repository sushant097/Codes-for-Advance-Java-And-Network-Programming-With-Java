package swingDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JTextAreaExample 
{
	public static void main(String[] args) 
	{
		new AreaExample();

	}
}

class AreaExample{
	JLabel l1,l2;
	JTextArea area;
	JButton b;
	
	public AreaExample()
	{
		JFrame f = new JFrame();
		 l1=new JLabel();
		 l1.setBounds(50,25,100,30);
		 l2=new JLabel();
		 l2.setBounds(160,25,100,30);
		 area=new JTextArea();
		 area.setBounds(20,75,250,200);
		 b=new JButton("Count Words");
		 b.setBounds(100,300,120,30);
		 b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = area.getText();
				String words[]=text.split("\\s");
				l1.setText("Words: "+words.length);
				l2.setText("Characters: "+text.length()); 

			}
			 
		 });
		 f.add(l1);f.add(l2);f.add(area);f.add(b);
		 f.setSize(450,450);
		 f.setLayout(null);
		 f.setVisible(true);
	}
}
