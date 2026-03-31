package examples.table;

import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class SwingJTableExample extends JFrame implements ActionListener{
	JLabel title;
	JButton show;
	JTable tbl_customer;
	public SwingJTableExample() {
		setTitle("Swing JTable Example");
		setBounds(100, 120, 400, 300);
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		title = new JLabel("Swing JTable Example");
		show = new JButton("Show");
		show.addActionListener(this);
		panel.add(title);
		panel.add(show);
		// jtable
		String columns[] = {"S.NO", "Full Name", "Contact", "Address"};
		String data[][] = {
			    {"1", "Himal Bohora", "9876543210", "Kathmandu"},
			    {"2", "Mira Bhatta", "9876536521", "Lalitpur"},
			    {"3", "Niraj Magar", "9876543223", "Pokhara"},
			    {"4", "Kamala Bajagain", "9876555210", "Biratnagar"},
			    {"5", "Suman Shrestha", "9876543234", "Bhaktapur"},
			    {"6", "Anita Karki", "9876543245", "Chitwan"},
			    {"7", "Ramesh Thapa", "9876543256", "Butwal"},
			    {"8", "Pooja Gurung", "9876543267", "Dharan"},
			    {"9", "Bikash Rai", "9876543278", "Itahari"},
			    {"10", "Sunita Tamang", "9876543289", "Hetauda"},
			    {"11", "Dipesh Adhikari", "9876543290", "Janakpur"},
			    {"12", "Nisha Khadka", "9876543301", "Nepalgunj"},
			    {"13", "Arjun Basnet", "9876543312", "Birgunj"},
			    {"14", "Sita Poudel", "9876543323", "Dang"},
			    {"15", "Manoj KC", "9876543334", "Gorkha"},
			    {"16", "Laxmi Oli", "9876543345", "Tulsipur"},
			    {"17", "Prakash Bista", "9876543356", "Dhangadhi"},
			    {"18", "Rita Acharya", "9876543367", "Banepa"},
			    {"19", "Kiran Neupane", "9876543378", "Birtamod"},
			    {"20", "Sarita Shah", "9876543389", "Rajbiraj"}
			};
		tbl_customer = new JTable(data, columns);
		JScrollPane scroll = new JScrollPane(tbl_customer);
		panel.add(scroll);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.show) {
			int is_selected = this.tbl_customer.getSelectedRow();
			if(is_selected < 0) {
				JOptionPane.showMessageDialog(rootPane, "Please select data first");
			} else {
				String customer = tbl_customer.getValueAt(is_selected, 1).toString();
				JOptionPane.showMessageDialog(rootPane, customer + " is selected");
			}
		}
	}
	
	public static void main(String args[]) {
		SwingJTableExample sj = new SwingJTableExample();
	}
}
