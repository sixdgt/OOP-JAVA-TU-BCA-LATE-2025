package examples.action;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener{
	JTextField txt_num_one, txt_num_two;
	JButton btn_sum, btn_subtract;
	
	public SimpleCalculator() {
		// Frame Properties
		setTitle("Simple Calculator");
		setBounds(100, 150, 300, 400);
		setLayout(new GridLayout(4, 2, 10, 20));
		// Components
		JLabel title = new JLabel("Simple Calculator: ");
		JLabel subtitle = new JLabel("Swing Framework");
		JLabel lbl_num_one = new JLabel("Number One: ");
		JLabel lbl_num_two = new JLabel("Number Two: ");
		
		txt_num_one = new JTextField();
		txt_num_two = new JTextField();
		
		btn_sum = new JButton("SUM");
		btn_subtract = new JButton("SUBTRACT");
		// adding buttons to event source
		btn_sum.addActionListener(this);
		btn_subtract.addActionListener(this);
		// adding components to frame
		add(title);
		add(subtitle);
		add(lbl_num_one);
		add(txt_num_one);
		add(lbl_num_two);
		add(txt_num_two);
		add(btn_sum);
		add(btn_subtract);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// sum of two number from input
		if(e.getSource() == this.btn_sum) {
			try {
				double num_one = Double.parseDouble(this.txt_num_one.getText());
				double num_two = Double.parseDouble(this.txt_num_two.getText());
				double sum = num_one + num_two;
				JOptionPane.showMessageDialog(rootPane, "Sum of two number: " + sum);
			} catch(NumberFormatException ne) {
				JOptionPane.showMessageDialog(rootPane, "Please enter numeric value only");
			}
			// difference of two number from input
		} else if (e.getSource() == this.btn_subtract) {
			try {
				double num_one = Double.parseDouble(this.txt_num_one.getText());
				double num_two = Double.parseDouble(this.txt_num_two.getText());
				double subtract = num_one - num_two;
				JOptionPane.showMessageDialog(rootPane, "Difference of two number: " + subtract);
			} catch(NumberFormatException ne) {
				JOptionPane.showMessageDialog(rootPane, "Please enter numeric value only");
			}
		}
	}
	
	public static void main(String args[]) {
		SimpleCalculator sc = new SimpleCalculator();
	}
}
