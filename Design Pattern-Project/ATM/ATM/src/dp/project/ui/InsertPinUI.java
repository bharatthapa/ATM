package dp.project.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;

public class InsertPinUI {
	
	private JFrame frame;
	private JPasswordField passwordField;
	
	public String getPin(){
		return passwordField.getText();
	}
	
	public JFrame getFrame(){
		return frame;
	}

	/**
	 * Create the application.
	 */
	public InsertPinUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insert Pin");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 564, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPin = new JLabel("Pin");
		lblPin.setBounds(114, 139, 74, 35);
		frame.getContentPane().add(lblPin);
		
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(passwordField.getText()!=null)
				passwordField.getText();
				else
					return;
				frame.dispose();				
			}
		});
		btnNewButton.setBounds(213, 245, 157, 38);
		frame.getContentPane().add(btnNewButton);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(213, 134, 157, 45);
		frame.getContentPane().add(passwordField);
	}
}
