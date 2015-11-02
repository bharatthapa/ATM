package dp.project.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBalance {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBalance window = new CheckBalance();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CheckBalance() {
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
		
		JLabel lblYourCurrentBalance = new JLabel("Your Current Balance is:  ");
		lblYourCurrentBalance.setBounds(42, 81, 200, 50);
		frame.getContentPane().add(lblYourCurrentBalance);
	}

}
