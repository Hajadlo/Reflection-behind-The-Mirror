package guicka;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Pub extends JFrame {

	private JPanel contentPane;
	private JTextField textAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pub frame = new Pub();
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
	public Pub() {
		setTitle("Image behind The Mirror");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton charBtn = new JButton("Character");
		charBtn.setFont(new Font("Tahoma", Font.PLAIN, 35));
		charBtn.setBounds(20, 10, 190, 50);
		contentPane.add(charBtn);
		
		JButton pubBtn = new JButton("Pub");
		pubBtn.setFont(new Font("Tahoma", Font.PLAIN, 35));
		pubBtn.setBounds(220, 10, 190, 50);
		contentPane.add(pubBtn);
		
		JButton arenaBtn = new JButton("Arena");
		arenaBtn.setFont(new Font("Tahoma", Font.PLAIN, 35));
		arenaBtn.setBounds(420, 10, 190, 50);
		contentPane.add(arenaBtn);
		
		JButton questBtn = new JButton("Quests");
		questBtn.setFont(new Font("Tahoma", Font.PLAIN, 35));
		questBtn.setBounds(620, 10, 190, 50);
		contentPane.add(questBtn);
		
		
		JButton outBtn = new JButton("Log out");
		outBtn.setFont(new Font("Tahoma", Font.PLAIN, 35));
		outBtn.setBounds(820, 10, 190, 50);
		contentPane.add(outBtn);
		
		JLabel lblAct = new JLabel("Activities");
		lblAct.setVerticalAlignment(SwingConstants.TOP);
		lblAct.setHorizontalAlignment(SwingConstants.LEFT);
		lblAct.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAct.setBounds(20, 250, 150, 40);
		contentPane.add(lblAct);
		
		JRadioButton rdbtnWork = new JRadioButton("Work");
		rdbtnWork.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnWork.setBounds(18, 320, 100, 25);
		contentPane.add(rdbtnWork);
		
		JRadioButton rdbtnSleep = new JRadioButton("Sleep");
		rdbtnSleep.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnSleep.setBounds(18, 400, 100, 25);
		contentPane.add(rdbtnSleep);
		
		JRadioButton rdbtnHeal = new JRadioButton("Heal");
		rdbtnHeal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnHeal.setBounds(18, 480, 100, 25);
		contentPane.add(rdbtnHeal);
		
		JButton btnEngage = new JButton("Engage");
		btnEngage.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnEngage.setBounds(20, 600, 160, 50);
		contentPane.add(btnEngage);
		
		TextArea textArea = new TextArea();
		textArea.setBackground(SystemColor.info);
		textArea.setText("Hello, my friend! I'll be your guide in this game!");
		textArea.setFont(new Font("Arial", Font.PLAIN, 15));
		textArea.setEditable(false);
		textArea.setBounds(550, 550, 450, 160);
		contentPane.add(textArea);
		
		JTextArea textLore = new JTextArea();
		textLore.setBackground(SystemColor.menu);
		textLore.setWrapStyleWord(true);
		textLore.setText("This is the Pub. Here you can work for XP's, sleep to gain energy or heal up to gain HP's. You have to choose number of hours, below the choises.");
		textLore.setLineWrap(true);
		textLore.setFont(new Font("Arial", Font.PLAIN, 20));
		textLore.setEditable(false);
		textLore.setBounds(20, 100, 400, 120);
		contentPane.add(textLore);
		
		textAmount = new JTextField();
		textAmount.setHorizontalAlignment(SwingConstants.CENTER);
		textAmount.setToolTipText("");
		textAmount.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textAmount.setBounds(20, 520, 60, 50);
		contentPane.add(textAmount);
		textAmount.setColumns(10);
	}
}
