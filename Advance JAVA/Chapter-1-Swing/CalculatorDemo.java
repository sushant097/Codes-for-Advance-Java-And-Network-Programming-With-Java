package swingDemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculatorDemo extends JFrame implements ActionListener {
	JButton one, two, three, four, five, six, seven, eight, nine, num0, add, sub, div, mult, equalto, exit, point,
			reset;
	JTextField textField;
	JLabel info;
	String s = "", ope = "";
	int flag = 0;
	double total1;
	double input1, input2;

	void total(double input1, double inout2, String ope) {
		try {
			String total;
			if (ope.equalsIgnoreCase("+")) {
				total1 = input1 + input2;
				total = Double.toString(total1);
				textField.setText(total);
			} else if (ope.equalsIgnoreCase("-")) {
				total1 = input1 - input2;
				total = Double.toString(total1);
				textField.setText(total);
			} else if (ope.equalsIgnoreCase("*")) {
				total1 = input1 * input2;
				total = Double.toString(total1);
				textField.setText(total);
			} else if (ope.equalsIgnoreCase("/")) {
				if (input2 == 0) {
					textField.setText("");
					info.setForeground(Color.red);
					info.setText("/ by Zero Error!");
					throw new java.lang.ArithmeticException("/ by zero");
				} else {
					total1 = input1 / input2;
					total = Double.toString(total1);
					textField.setText(total);
				}

			}
			// clearfields();
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}

	}

	public CalculatorDemo() {
		JPanel panel = new JPanel();
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		panel.setLayout(layout);
		JLabel jl = new JLabel(" My Demo Calculator ");
		info = new JLabel("");
		textField = new JTextField(15);
		textField.setEditable(false);// making non-editable text field
		textField.setBackground(Color.white);
		one = new JButton(" 1 ");
		two = new JButton(" 2 ");
		three = new JButton(" 3 ");
		four = new JButton(" 4 ");
		five = new JButton(" 5 ");
		six = new JButton(" 6 ");
		seven = new JButton(" 7 ");
		eight = new JButton(" 8 ");
		nine = new JButton(" 9 ");
		num0 = new JButton(" 0 ");
		add = new JButton(" + ");
		sub = new JButton(" - ");
		div = new JButton(" / ");
		mult = new JButton(" * ");
		equalto = new JButton(" = ");
		exit = new JButton(" Exit ");
		point = new JButton(" . ");
		reset = new JButton("C");
		reset.setBackground(Color.YELLOW);
		// listener
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		num0.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		equalto.addActionListener(this);
		exit.addActionListener(this);
		point.addActionListener(this);
		reset.addActionListener(this);
		
		// calculator header
		panel.add(jl, gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 4;
		// adding text field in grid
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(textField, gbc);		

		// adding digit and operator button
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		panel.add(num0, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		panel.add(one, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		panel.add(two, gbc);
		gbc.gridx = 3;
		gbc.gridy = 1;
		panel.add(reset, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(three, gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		panel.add(four, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		panel.add(five, gbc);
		gbc.gridx = 3;
		gbc.gridy = 2;
		panel.add(div, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(six, gbc);
		gbc.gridx = 1;
		gbc.gridy = 3;
		panel.add(seven, gbc);
		gbc.gridx = 2;
		gbc.gridy = 3;
		panel.add(eight, gbc);
		gbc.gridx = 3;
		gbc.gridy = 3;
		panel.add(mult, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		panel.add(nine, gbc);
		gbc.gridx = 1;
		gbc.gridy = 4;
		panel.add(add, gbc);
		gbc.gridx = 2;
		gbc.gridy = 4;
		panel.add(sub, gbc);
		gbc.gridx = 3;
		gbc.gridy = 4;
		panel.add(point, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 2; 
		panel.add(equalto, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 2; 
		panel.add(exit, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 7;
		panel.add(info, gbc);
		
		
		
		
		// add panel back to JFrame
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		setSize(265, 300);
		// For the proper operation of closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // static JFrame constant
	}

	// main function
	public static void main(String arg[]) {
		new CalculatorDemo();
	}

	// Overriding ActionListener Method
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == one) {
			textField.setText(s.concat("1"));
			s = textField.getText();
		} else if (o == two) {
			textField.setText(s.concat("2"));
			s = textField.getText();
		} else if (o == three) {
			textField.setText(s.concat("3"));
			s = textField.getText();
		} else if (o == four) {
			textField.setText(s.concat("4"));
			s = textField.getText();
		} else if (o == five) {
			textField.setText(s.concat("5"));
			s = textField.getText();
		} else if (o == six) {
			textField.setText(s.concat("6"));
			s = textField.getText();
		} else if (o == seven) {
			textField.setText(s.concat("7"));
			s = textField.getText();
		} else if (o == eight) {
			textField.setText(s.concat("8"));
			s = textField.getText();
		} else if (o == nine) {
			textField.setText(s.concat("9"));
			s = textField.getText();
		} else if (o == num0) {
			textField.setText(s.concat("0"));
			s = textField.getText();
		} else if (o == add) {
			textField.setText("");
			input1 = Double.parseDouble(s);
			System.out.println(input1);
			s = "";
			ope = "+";
		} else if (o == sub) {
			textField.setText("");
			input1 = Double.parseDouble(s);
			s = "";
			ope = "-";
		} else if (o == mult) {
			textField.setText("");
			input1 = Double.parseDouble(s);
			s = "";
			ope = "*";
		} else if (o == div) {
			textField.setText("");
			input1 = Double.parseDouble(s);
			s = "";
			ope = "/";
		} else if (o == equalto) {
			info.setText("");
			if (flag == 0) {
				input2 = Double.parseDouble(s);
				total(input1, input2, ope);
				flag = 1;
			} else if (flag == 1) {
				input2 = Double.parseDouble(s);
				total(input1, input2, ope);
			}
			System.out.println(input1);
		} else if (o == exit) {
			System.exit(0);
		} else if (o == point) {
			textField.setText(s.concat("."));
			s = textField.getText();
		}
		if (o == reset) {
			textField.setText("");
			s = textField.getText();
			total1 = 0;
		}
	}
}
