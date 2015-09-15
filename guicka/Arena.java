package guicka;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Window.Type;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;
import javax.swing.JTable;

import java.awt.TextArea;

import javax.swing.JTextArea;

import java.awt.SystemColor;


public class Arena {

	private JFrame frmFrame;
	Frame arena = new Frame();
	Frame pub = new Frame();
	Frame quest = new Frame();
	Frame character = new Frame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arena arena = new Arena();
					arena.frmFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Arena() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFrame = new JFrame();
		frmFrame.setResizable(false);
		frmFrame.setTitle("Image behind The Mirror");
		frmFrame.setBounds(100, 100, 1024, 768);
		frmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFrame.getContentPane().setLayout(null);
		
		JButton btnChar = new JButton("Character");
		btnChar.setBounds(20, 10, 190, 50);
		btnChar.setFont(new Font("Tahoma", Font.PLAIN, 35));
		frmFrame.getContentPane().add(btnChar);
		btnChar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arena.setVisible(false);
				character.setVisible(true);
			}
		});
		
		JButton btnPub = new JButton("Pub");
		btnPub.setBounds(220, 10, 190, 50);
		btnPub.setFont(new Font("Tahoma", Font.PLAIN, 35));
		frmFrame.getContentPane().add(btnPub);
		btnPub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arena.setVisible(false);
				pub.setVisible(true);
			}
		});
		
		JButton btnArena = new JButton("Arena");
		btnArena.setBounds(420, 10, 190, 50);
		btnArena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnArena.setFont(new Font("Tahoma", Font.PLAIN, 35));
		frmFrame.getContentPane().add(btnArena);
		
		JButton btnQuest = new JButton("Quests");
		btnQuest.setBounds(620, 10, 190, 50);
		btnQuest.setFont(new Font("Tahoma", Font.PLAIN, 35));
		frmFrame.getContentPane().add(btnQuest);
		
		btnQuest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arena.setVisible(false);
				quest.setVisible(true);
			}
		});
		
		
		JButton btnOut = new JButton("Log out");
		btnOut.setBounds(820, 10, 190, 50);
		btnOut.setFont(new Font("Tahoma", Font.PLAIN, 35));
		frmFrame.getContentPane().add(btnOut);
		
		JLabel lblText = new JLabel("Opponents in the arena");
		lblText.setBounds(20, 250, 350, 40);
		lblText.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblText.setVerticalAlignment(SwingConstants.TOP);
		lblText.setHorizontalAlignment(SwingConstants.LEFT);
		frmFrame.getContentPane().add(lblText);
		
		JRadioButton rdbtnOpp1 = new JRadioButton("Opponent 1");
		rdbtnOpp1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnOpp1.setBounds(20, 350, 170, 25);
		frmFrame.getContentPane().add(rdbtnOpp1);
		
		JRadioButton rdbtnOpp2 = new JRadioButton("Opponent 2");
		rdbtnOpp2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnOpp2.setBounds(20, 450, 170, 25);
		frmFrame.getContentPane().add(rdbtnOpp2);
		
		JRadioButton rdbtnOpp3 = new JRadioButton("Opponent 3");
		rdbtnOpp3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnOpp3.setBounds(20, 550, 170, 25);
		frmFrame.getContentPane().add(rdbtnOpp3);
		
		JButton btnFight = new JButton("Fight");
		btnFight.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnFight.setBounds(20, 650, 150, 50);
		frmFrame.getContentPane().add(btnFight);
		
		JLabel lblTop = new JLabel("TOP5 arena");
		lblTop.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTop.setBounds(500, 80, 170, 40);
		frmFrame.getContentPane().add(lblTop);
		
		TextArea textGuide = new TextArea();
		textGuide.setBackground(SystemColor.info);
		textGuide.setText("Hello, my friend! I'll be your guide in this game!");
		textGuide.setEditable(false);
		textGuide.setFont(new Font("Arial", Font.PLAIN, 15));
		textGuide.setBounds(550, 550, 450, 160);
		frmFrame.getContentPane().add(textGuide);
		
		JTextArea textLore = new JTextArea();
		textLore.setBackground(SystemColor.menu);
		textLore.setWrapStyleWord(true);
		textLore.setText("This is the Arena. Here you can fight against other people. You can choose between 3 opponents. If you win, you'll gain XP's, some gold and arena rank. You can get to TOP5, where you gain gold passively.");
		textLore.setLineWrap(true);
		textLore.setFont(new Font("Arial", Font.PLAIN, 20));
		textLore.setEditable(false);
		textLore.setBounds(20, 100, 400, 120);
		frmFrame.getContentPane().add(textLore);
		frmFrame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmFrame.getContentPane(), btnChar, btnArena, btnQuest, btnPub, btnOut}));
	}
}
