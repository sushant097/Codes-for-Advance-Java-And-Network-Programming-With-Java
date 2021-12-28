package swingDemo;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayImage extends JFrame {

	JLabel l;
	BufferedImage image = null;

	public DisplayImage(String filepath) {
		try {
			image = ImageIO.read(new File(filepath));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		ImageIcon icon = new ImageIcon(image);
		l = new JLabel();
		l.setIcon(icon);
		add(l);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant

	}

	public static void main(String[] args) {
		new DisplayImage("path_to_your_file"); // add full path 
	}

}
