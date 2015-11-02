package dp.project.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Withdraw {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdraw window = new Withdraw();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Withdraw() {
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
		
		JButton button = new JButton("$20");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(79, 88, 135, 50);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("$50");
		button_1.setBounds(374, 88, 147, 50);
		frame.getContentPane().add(button_1);
		
		JButton btnOtherAmount = new JButton("Other Amount");
		btnOtherAmount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Other oth = new Other();
			}
		});
		btnOtherAmount.setBounds(239, 191, 135, 68);
		frame.getContentPane().add(btnOtherAmount);
		
		JLabel label = new JLabel("New label");
		label.setBounds(-57, 0, 200, 50);
		frame.getContentPane().add(label);
		
		JLabel lblWithdraw = new JLabel("Withdraw");
		lblWithdraw.setBounds(31, 10, 200, 50);
		frame.getContentPane().add(lblWithdraw);
	}
}
