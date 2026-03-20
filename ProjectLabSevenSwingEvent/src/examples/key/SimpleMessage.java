package examples.key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class SimpleMessage extends JFrame implements KeyListener{
	
	JLabel title, output;
	JTextField message;
	public SimpleMessage() {
		setTitle("Simple Message");
		setBounds(100, 140, 300, 250);
		setLayout(new GridLayout(3, 1, 10, 10));
		
		title = new JLabel("Type your message:");
		output = new JLabel("Output here: ");
		
		message = new JTextField();
		message.addKeyListener(this);
		
		add(title);
		add(message);
		add(output);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == this.message) {
			// it will work upon type action
			output.setText("Typing..." + message.getText());
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == this.message) {
			// it will work when the key is being pressed
			output.setText("Typing..." + message.getText());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == this.message) {
			output.setText("Output: "); // after releasing the key it will reset value with "Output"
		}
	}
	
	public static void main(String args[]) {
		SimpleMessage sm = new SimpleMessage();
	}
}
