package examples;
// here we will create form by creating JFrame object
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.Color;

import javax.swing.BoxLayout;

public class CustomerForm{
	public CustomerForm() {
		// JFrame
		JFrame frame = new JFrame();
		frame.setTitle("Customer Registration Form");
		frame.setBounds(150, 200, 300, 500);
		
		// JPanel
		JPanel panel = new JPanel();
		// Layout on Panel
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		// JLabel
		JLabel title = new JLabel("Customer Registration Form | 2026");
		JLabel lbl_full_name = new JLabel("Full Name: ");
		JLabel lbl_email = new JLabel("Email: ");
		JLabel lbl_contact = new JLabel("Contact: ");
		JLabel lbl_gender = new JLabel("Select Gender: ");
		JLabel lbl_address = new JLabel("Address: ");
		JLabel lbl_remarks = new JLabel("Remarks: ");
		
		// JTextField
		JTextField txt_full_name = new JTextField();
		JTextField txt_email = new JTextField();
		JTextField txt_contact = new JTextField();
		JTextField txt_address = new JTextField();
		JTextField txt_remarks = new JTextField();
		
		// JButton
		JButton register = new JButton("REGISTER");
		// note: must import Color class. 'import java.awt.Color'
		register.setBackground(Color.BLUE); // button background color
		register.setForeground(Color.WHITE); // button text color
		
		// JComboBox
		JComboBox<String> cmb_gender = new JComboBox<>();
		cmb_gender.addItem("Male");
		cmb_gender.addItem("Female");
		cmb_gender.addItem("Others");
		// Since we have added layout in our JPanel so we are adding all the components to it
		panel.add(title);
		panel.add(lbl_full_name);
		panel.add(txt_full_name);
		
		panel.add(lbl_email);
		panel.add(txt_email);
		
		panel.add(lbl_contact);
		panel.add(txt_contact);
		
		panel.add(lbl_gender);
		panel.add(cmb_gender);
		
		panel.add(lbl_address);
		panel.add(txt_address);
		
		panel.add(lbl_remarks);
		panel.add(txt_remarks);
		
		panel.add(register);
		
		// adding panel to frame
		frame.add(panel);
		// setting other frame properties
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // it will close the frame and stop program
		frame.setVisible(true); // it will display the frame on screen
	}
	
	public static void main(String args[]) {
		// creating object of our form class
		CustomerForm cf = new CustomerForm();
	}
}
