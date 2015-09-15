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
import javax.swing.JTextPane;

public class Char extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Char frame = new Char();
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
	public Char() {
		setResizable(false);
		setTitle("Image behind The Mirror");
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
		
		JTextArea textLore = new JTextArea();
		textLore.setWrapStyleWord(true);
		textLore.setText("This is the page of your character. Here you can see attributes. They can be leveled up, if you get enough XP's. There's also your inventory, you're able to equip/unequip your gear.");
		textLore.setLineWrap(true);
		textLore.setFont(new Font("Arial", Font.PLAIN, 20));
		textLore.setEditable(false);
		textLore.setBackground(SystemColor.menu);
		textLore.setBounds(20, 100, 400, 120);
		contentPane.add(textLore);
		
		JLabel lblAttributes = new JLabel("Attributes");
		lblAttributes.setVerticalAlignment(SwingConstants.TOP);
		lblAttributes.setHorizontalAlignment(SwingConstants.LEFT);
		lblAttributes.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAttributes.setBounds(20, 240, 129, 37);
		contentPane.add(lblAttributes);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(20, 300, 114, 37);
		contentPane.add(lblName);
		
		JLabel lblProffesion = new JLabel("Proffesion");
		lblProffesion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProffesion.setBounds(20, 350, 114, 37);
		contentPane.add(lblProffesion);
		
		JLabel lblHitPoints = new JLabel("Hit points");
		lblHitPoints.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHitPoints.setBounds(20, 400, 114, 37);
		contentPane.add(lblHitPoints);
		
		JLabel lblGold = new JLabel("Gold");
		lblGold.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGold.setBounds(20, 450, 114, 37);
		contentPane.add(lblGold);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLevel.setBounds(20, 500, 114, 37);
		contentPane.add(lblLevel);
		
		JLabel lblExperience = new JLabel("Experience");
		lblExperience.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblExperience.setBounds(20, 550, 114, 37);
		contentPane.add(lblExperience);
		
		JLabel lblStrength = new JLabel("Strength");
		lblStrength.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStrength.setBounds(270, 300, 100, 40);
		contentPane.add(lblStrength);
		
		JLabel lblInt = new JLabel("Intelligence");
		lblInt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInt.setBounds(270, 350, 110, 40);
		contentPane.add(lblInt);
		
		JLabel lblAttack = new JLabel("Attack");
		lblAttack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAttack.setBounds(270, 400, 110, 40);
		contentPane.add(lblAttack);
		
		JLabel lblDefence = new JLabel("Defence");
		lblDefence.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDefence.setBounds(270, 440, 114, 40);
		contentPane.add(lblDefence);
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setVerticalAlignment(SwingConstants.TOP);
		lblInventory.setHorizontalAlignment(SwingConstants.LEFT);
		lblInventory.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblInventory.setBounds(550, 110, 130, 40);
		contentPane.add(lblInventory);
		
		JLabel lblWeapon = new JLabel("Weapon");
		lblWeapon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWeapon.setBounds(550, 200, 100, 30);
		contentPane.add(lblWeapon);
		
		JLabel lblArmor = new JLabel("Armor");
		lblArmor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblArmor.setBounds(550, 300, 100, 30);
		contentPane.add(lblArmor);
		
		TextArea textGuide = new TextArea();
		textGuide.setBackground(SystemColor.info);
		textGuide.setText("Hello, my friend! I'll be your guide in this game!");
		textGuide.setFont(new Font("Arial", Font.PLAIN, 15));
		textGuide.setEditable(false);
		textGuide.setBounds(550, 550, 450, 160);
		contentPane.add(textGuide);
		
		JTextPane textName = new JTextPane();
		textName.setBounds(160, 300, 80, 40);
		contentPane.add(textName);
		
		JTextPane textProf = new JTextPane();
		textProf.setBounds(160, 350, 80, 40);
		contentPane.add(textProf);
		
		JTextPane textHP = new JTextPane();
		textHP.setBounds(160, 400, 80, 40);
		contentPane.add(textHP);
		
		JTextPane textGold = new JTextPane();
		textGold.setBounds(160, 450, 80, 40);
		contentPane.add(textGold);
		
		JTextPane textLevel = new JTextPane();
		textLevel.setBounds(160, 500, 80, 40);
		contentPane.add(textLevel);
		
		JTextPane textXP = new JTextPane();
		textXP.setBounds(160, 550, 80, 40);
		contentPane.add(textXP);
		
		JTextPane textStr = new JTextPane();
		textStr.setBounds(400, 300, 80, 40);
		contentPane.add(textStr);
		
		JTextPane textInt = new JTextPane();
		textInt.setBounds(400, 350, 80, 40);
		contentPane.add(textInt);
		
		JTextPane textAttack = new JTextPane();
		textAttack.setBounds(400, 400, 80, 40);
		contentPane.add(textAttack);
		
		JTextPane textDef = new JTextPane();
		textDef.setBounds(400, 450, 80, 40);
		contentPane.add(textDef);
	}
}
