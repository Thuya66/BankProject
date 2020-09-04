package iBank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class design_patten {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					design_patten window = new design_patten();
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
	public design_patten() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 524, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_sample = new JLabel("Sample Text");
		lbl_sample.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lbl_sample.setBounds(10, 31, 200, 50);
		frame.getContentPane().add(lbl_sample);
		
		JLabel lbl_label = new JLabel("Sample Label");
		lbl_label.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		lbl_label.setBounds(241, 31, 200, 50);
		frame.getContentPane().add(lbl_label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnNewButton.setBounds(10, 103, 200, 50);
		frame.getContentPane().add(btnNewButton);
	}
}
