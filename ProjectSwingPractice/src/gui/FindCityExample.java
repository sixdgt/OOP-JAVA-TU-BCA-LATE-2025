package gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class FindCityExample implements ActionListener{
	JFrame frame;
	JButton btn_find;
	JTextField text_city;
	JLabel lbl_title, lbl_message;
	JPanel panel;
	// constructor
	public FindCityExample() {
		frame = new JFrame(); // it will create Frame
		frame.setTitle("City Name Finder"); // it will set Frame title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // it will close the Frame
		frame.setBounds(100, 200, 400, 200); // it will set the coordinate of frame
		// x-axis, y-asix, width, height
		lbl_title = new JLabel("Enter the city name");
		lbl_message = new JLabel("Your result will be shown here...");
		btn_find = new JButton("Find City");
		btn_find.addActionListener(this);
		text_city = new JTextField();
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(lbl_title);
		panel.add(text_city);
		panel.add(lbl_message);
		panel.add(btn_find);
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public static void main(String args[]) {
		FindCityExample city = new FindCityExample();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btn_find) {
			String cities[] = {"KATHMANDU", "POKHARA", "DHARAN", "LALITPUR", "BIRATNAGAR", "DHANGADI", "JHAPA"};
			String input_city = this.text_city.getText().toUpperCase();
			for (String name : cities) {
				if (input_city.equals(name)) {
					this.lbl_message.setText("Hurrah!! Found the city");
					this.lbl_message.setForeground(Color.BLUE);
					break;
				} else {
					this.lbl_message.setText("Sad!! City not available :(");
					this.lbl_message.setForeground(Color.RED);
				}
			}
		}
	}
}
