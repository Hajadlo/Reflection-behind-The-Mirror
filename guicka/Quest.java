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
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class Quest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quest frame = new Quest();
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
	public Quest() {
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
		
		TextArea textGuide = new TextArea();
		textGuide.setBackground(SystemColor.info);
		textGuide.setText("Hello, my friend! I'll be your guide in this game!");
		textGuide.setFont(new Font("Arial", Font.PLAIN, 15));
		textGuide.setEditable(false);
		textGuide.setBounds(550, 550, 450, 160);
		contentPane.add(textGuide);
		
		JLabel lblQuests = new JLabel("Quests");
		lblQuests.setVerticalAlignment(SwingConstants.TOP);
		lblQuests.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuests.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblQuests.setBounds(20, 250, 100, 40);
		contentPane.add(lblQuests);
		
		JTextArea textLore = new JTextArea();
		textLore.setWrapStyleWord(true);
		textLore.setText("This is the page for going on quests. Choose between 3 quests. Each quest gives you different amount of XP's and gold. Sometimes you can find an item.");
		textLore.setLineWrap(true);
		textLore.setFont(new Font("Arial", Font.PLAIN, 20));
		textLore.setEditable(false);
		textLore.setBackground(SystemColor.menu);
		textLore.setBounds(20, 100, 400, 100);
		contentPane.add(textLore);
	}
}
