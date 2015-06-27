import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MyFirstApp {

	private JFrame frame;
	private JTextField nmaeMyTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstApp window = new MyFirstApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyFirstApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton nameMyNewButton = new JButton("Click Me");
		nameMyNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		nameMyNewButton.setToolTipText("CLICK ME NOW");
		nameMyNewButton.setForeground(Color.PINK);
		nameMyNewButton.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 20));
		nameMyNewButton.setBounds(120, 128, 171, 41);
		frame.getContentPane().add(nameMyNewButton);
		
		nmaeMyTextField = new JTextField();
		nmaeMyTextField.setToolTipText("");
		nmaeMyTextField.setText("Start Here");
		nmaeMyTextField.setHorizontalAlignment(SwingConstants.CENTER);
		nmaeMyTextField.setForeground(Color.PINK);
		nmaeMyTextField.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 22));
		nmaeMyTextField.setBounds(95, 61, 236, 39);
		frame.getContentPane().add(nmaeMyTextField);
		nmaeMyTextField.setColumns(10);
	}

}
