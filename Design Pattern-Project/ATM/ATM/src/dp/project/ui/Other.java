package dp.project.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Other {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Other window = new Other();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Other() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOtherAmount = new JLabel("Other Amount");
		lblOtherAmount.setBounds(10, 11, 200, 50);
		frame.getContentPane().add(lblOtherAmount);
		
		textField = new JTextField();
		textField.setBounds(62, 125, 148, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount:");
		lblAmount.setBounds(62, 80, 200, 50);
		frame.getContentPane().add(lblAmount);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setBounds(219, 212, 160, 50);
		frame.getContentPane().add(btnWithdraw);
	}
}
