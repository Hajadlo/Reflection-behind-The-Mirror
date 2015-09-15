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

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtNick;
	private JTextField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNickname = new JLabel("Nickname");
		lblNickname.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNickname.setBounds(20, 10, 180, 50);
		contentPane.add(lblNickname);
		
		txtNick = new JTextField();
		txtNick.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNick.setBounds(20, 70, 180, 50);
		contentPane.add(txtNick);
		txtNick.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblPassword.setBounds(20, 130, 180, 50);
		contentPane.add(lblPassword);
		
		txtPass = new JTextField();
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPass.setColumns(10);
		txtPass.setBounds(20, 190, 180, 50);
		contentPane.add(txtPass);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnLogin.setBounds(20, 250, 180, 50);
		contentPane.add(btnLogin);
	}

}
