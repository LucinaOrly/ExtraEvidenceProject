import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class GUI implements ActionListener{
	int count = 0;

	private JFrame frame = new JFrame();
	private JButton button = new JButton("Button");
	private JLabel label = new JLabel("Number of clicks = 0");
	private JPanel panel = new JPanel();

	public GUI() {

		button.addActionListener(this);

	
		panel.setBorder(BorderFactory.createEmptyBorder(300,300,100,300));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our Gui");
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks = " + count);
	}

	public static void main(String[] args) {
		new GUI();
	}
}
