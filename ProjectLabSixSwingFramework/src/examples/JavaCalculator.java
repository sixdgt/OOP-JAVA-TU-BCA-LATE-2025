package examples;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaCalculator {
	public JavaCalculator() {
		// for frame
		JFrame frame = new JFrame();
		frame.setTitle("Java Calculator");
		frame.setBounds(300, 50, 400, 500);
		BorderLayout bl = new BorderLayout(20, 10); // horizontal gap & vertical gap
		frame.setLayout(bl); // setting border layout on frame
		
		// for top panel
		JPanel top_panel = new JPanel();
		top_panel.setLayout(new BoxLayout(top_panel, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel("Java Calculator");
		JTextField output = new JTextField();
		top_panel.add(title);
		top_panel.add(output);
		
		// for button panel
		JPanel button_panel = new JPanel();
		button_panel.setLayout(new GridLayout(6, 3, 10, 10));
		
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton zero = new JButton("0");
		JButton back_space = new JButton("<-");
		JButton equals_to = new JButton("=");
		JButton sum = new JButton("+");
		JButton subtract = new JButton("-");
		JButton multiply = new JButton("*");
		JButton divide = new JButton("/");
		JButton mod = new JButton("%");
		JButton sqrt = new JButton("sqrt");
		button_panel.add(one);
		button_panel.add(two);
		button_panel.add(three);
		button_panel.add(four);
		button_panel.add(five);
		button_panel.add(six);
		button_panel.add(seven);
		button_panel.add(eight);
		button_panel.add(nine);
		button_panel.add(zero);
		button_panel.add(back_space);
		button_panel.add(equals_to);
		button_panel.add(sum);
		button_panel.add(subtract);
		button_panel.add(multiply);
		button_panel.add(divide);
		button_panel.add(mod);
		button_panel.add(sqrt);
		
		// adding panel to frame
		frame.add(top_panel, bl.NORTH); // BorderLayout North: top
		frame.add(button_panel, bl.CENTER); // BorderLayout Center
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String args[]) {
		JavaCalculator jc = new JavaCalculator();
	}
}
