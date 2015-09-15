package guicka;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField textNick;
	private JTextField textPass1;
	private JTextField textPass2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNick = new JLabel("Nickname");
		lblNick.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNick.setBounds(20, 10, 180, 50);
		contentPane.add(lblNick);
		
		textNick = new JTextField();
		textNick.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textNick.setColumns(10);
		textNick.setBounds(20, 70, 180, 50);
		contentPane.add(textNick);
		
		JLabel lblPass1 = new JLabel("Password");
		lblPass1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblPass1.setBounds(18, 130, 280, 50);
		contentPane.add(lblPass1);
		
		textPass1 = new JTextField();
		textPass1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPass1.setColumns(10);
		textPass1.setBounds(20, 190, 180, 50);
		contentPane.add(textPass1);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnRegister.setBounds(20, 370, 150, 50);
		contentPane.add(btnRegister);
		
		textPass2 = new JTextField();
		textPass2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPass2.setColumns(10);
		textPass2.setBounds(20, 310, 180, 50);
		contentPane.add(textPass2);
		
		JLabel lblPass2 = new JLabel("Confirm password");
		lblPass2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblPass2.setBounds(20, 250, 320, 50);
		contentPane.add(lblPass2);
	}
}
