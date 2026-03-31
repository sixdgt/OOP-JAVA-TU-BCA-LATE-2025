package examples.dtm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SwingDtmExample extends JFrame implements ActionListener{
	JLabel title;
	JButton show, btn_add, btn_remove;
	JTable tbl_customer;
	DefaultTableModel model;
	public SwingDtmExample() {
		setTitle("Swing JTable Example");
		setBounds(100, 120, 400, 300);
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		title = new JLabel("Swing JTable Example");
		
		show = new JButton("Show");
		btn_add = new JButton("Add");
		btn_remove = new JButton("Remove");
		
		show.addActionListener(this);
		btn_add.addActionListener(this);
		btn_remove.addActionListener(this);
		
		panel.add(title);
		panel.add(show);
		panel.add(btn_add);
		panel.add(btn_remove);
		// jtable
		String columns[] = {"S.NO", "Full Name", "Contact", "Address"};
		String data[][]= {
			    {"1", "Himal Bohora", "9876543210", "Kathmandu"},
			    {"2", "Mira Bhatta", "9876536521", "Lalitpur"},
			    {"3", "Niraj Magar", "9876543223", "Pokhara"},
			};
		
		model = new DefaultTableModel();
		// adding columns
		for(String col: columns) {
			model.addColumn(col);
		}
		// adding data
		for(int i=0; i< data.length; i++) {
			model.addRow(data[i]);
		}
		
		tbl_customer = new JTable();
		tbl_customer.setModel(model);
		
		JScrollPane scroll = new JScrollPane(tbl_customer);
		panel.add(scroll);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int is_selected = this.tbl_customer.getSelectedRow();
		if(e.getSource() == this.show) {
			if(is_selected < 0) {
				JOptionPane.showMessageDialog(rootPane, "Please select data first");
			} else {
				String customer = tbl_customer.getValueAt(is_selected, 1).toString();
				JOptionPane.showMessageDialog(rootPane, customer + " is selected");
			}
		} else if (e.getSource() == this.btn_add) {
			Object newData[] = {"4", "Binod Chaudhary", "9876543223", "Pokhara"};
			model.addRow(newData);
		} else if (e.getSource() == this.btn_remove) {
			if(is_selected < 0) {
				JOptionPane.showMessageDialog(rootPane, "Please select data first");
			} else {
				String customer = tbl_customer.getValueAt(is_selected, 1).toString();
				model.removeRow(is_selected);
				JOptionPane.showMessageDialog(rootPane, customer + " is removed");
			}
		}
	}
	
	public static void main(String args[]) {
		SwingDtmExample sj = new SwingDtmExample();
	}
}
