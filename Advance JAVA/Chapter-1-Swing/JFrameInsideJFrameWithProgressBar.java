package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class JFrameInsideJFrameWithProgressBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new callAnotherGUI();
	}

}

class callAnotherGUI extends JFrame implements ActionListener{
	
	int i; // tracks the number of ticks in progress bar
	JProgressBar p;

	public callAnotherGUI() 
	{
		JButton b = new JButton("Login GUI");
		p = new JProgressBar(0, 20); // define number of ticks
		i = 0;
		// All the variables declare outside of anonymous class are final.
		Timer t = new Timer(30, this); // every 30 milliseconds it goes one tick of progress bar
		
		
		add(b);
		add(p);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.start();
			}
		});
		setLayout(new FlowLayout()); // try to occupy middle space of JFrame
		setVisible(true);
		setSize(400, 400);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
		
		/*Application:
		 * Loading Database takes some time and
		 * Using ProgressBar improves user experience.
		 * */
	}

	public void actionPerformed(ActionEvent e) {

		if (i==20) { // if it completes 20 tick of JProgress bar as defined above
			new Login(); // call another JFrame called Login
			dispose(); // close the current JFrame 
		}
		i++;
		p.setValue(i);
	}
	
}