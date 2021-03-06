import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SimpleGUI {

	private JFrame frame;
	private JTextField nameTextField;
	private JLabel lblNewLabel;
	private JTextField ageTextField;
	private final JLabel studentLabel = new JLabel("I am a student at Year Up");
	private JButton btnNewButton;
	private JButton whoButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleGUI window = new SimpleGUI();
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
	public SimpleGUI() {
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
		
		JLabel nameLabel = new JLabel("My name is");
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		nameLabel.setBounds(11, 16, 145, 50);
		frame.getContentPane().add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(165, 15, 200, 50);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		lblNewLabel = new JLabel("I am");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(59, 81, 80, 33);
		frame.getContentPane().add(lblNewLabel);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(165, 71, 200, 50);
		frame.getContentPane().add(ageTextField);
		ageTextField.setColumns(10);
		studentLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		studentLabel.setBounds(35, 124, 357, 50);
		frame.getContentPane().add(studentLabel);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(107, 197, 200, -2);
		frame.getContentPane().add(btnNewButton);
		
		whoButton = new JButton("Who are you?");
		whoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (whoButton.getText().equals("Who are you?"))
				{
					nameTextField.setText("Rosalyn Lyons");
					ageTextField.setText("25");
					whoButton.setText("Clear me!");
				}
				else if (whoButton.getText().equals("Clear me!"))
				{
					nameTextField.setText("");
					ageTextField.setText("");
					whoButton.setText("Who are you?");
				}
			}
		});
		whoButton.setBounds(86, 163, 200, 50);
		frame.getContentPane().add(whoButton);
	}
}
