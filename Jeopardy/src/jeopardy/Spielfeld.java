package jeopardy;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.EventQueue;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Spielfeld extends JFrame {

	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int spieler1;
	int spieler2;
	int count;
	int sum = 0;
	int sum1 = 0;
	private JPanel contentPane;
	JLabel lblFilm = new JLabel("");
	JLabel lblTipp1 = new JLabel("");
	JLabel lblTipp2 = new JLabel("");
	JLabel lblTipp3 = new JLabel("");
	JLabel lblLoesung = new JLabel("");
	JLabel lblBild1 = new JLabel("");
	JLabel lblBild2 = new JLabel("");
	JLabel lblBild3 = new JLabel("");
	JLabel lblshowres = new JLabel("");
	JLabel lblshowres2 = new JLabel("");
	
	private JTextField tfpkt1;
	private JTextField tfpkt2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Spielfeld frame = new Spielfeld();
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
	public Spielfeld() {
		Icon icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9,icon10,icon11,icon12,icon13,icon14,icon15,icon16,icon17,icon18,icon19,icon20;
		
		
		icon1 = new ImageIcon(getClass().getResource("picasso.png"));
		icon2 = new ImageIcon(getClass().getResource("picasso2.png"));
		icon3 = new ImageIcon(getClass().getResource("picasso3.png"));
		icon4 = new ImageIcon(getClass().getResource("Rembrandt1.png"));
		icon5 = new ImageIcon(getClass().getResource("Rembrandt2.png"));
		icon6 = new ImageIcon(getClass().getResource("Rembrandt3.png"));
		icon7 = new ImageIcon(getClass().getResource("munich1.png"));
		icon8 = new ImageIcon(getClass().getResource("munich2.png"));
		icon9 = new ImageIcon(getClass().getResource("munich3.png"));
		icon10 = new ImageIcon(getClass().getResource("dali1.png"));
		icon11 = new ImageIcon(getClass().getResource("dali2.png"));
		icon12 = new ImageIcon(getClass().getResource("dali3.png"));
		icon13 = new ImageIcon(getClass().getResource("rubens1.png"));
		icon14 = new ImageIcon(getClass().getResource("rubens2.png"));
		icon15 = new ImageIcon(getClass().getResource("rubens3.png"));
		icon16 = new ImageIcon(getClass().getResource("Kada1.png"));
		icon17 = new ImageIcon(getClass().getResource("will2.png"));
		icon18 = new ImageIcon(getClass().getResource("dino3.png"));
		icon19 = new ImageIcon(getClass().getResource("vegas4.png"));
		icon20 = new ImageIcon(getClass().getResource("majowski5.png"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 930);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKategorie_1 = new JLabel("Filmzitate");
		lblKategorie_1.setBackground(Color.GRAY);
		lblKategorie_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKategorie_1.setBounds(66, 9, 65, 14);
		contentPane.add(lblKategorie_1);
		
		JLabel lblKategorie_2 = new JLabel("K\u00FCnstler");
		lblKategorie_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKategorie_2.setBounds(235, 11, 60, 14);
		contentPane.add(lblKategorie_2);
		
		JLabel lblKategorie_3 = new JLabel("Musik");
		lblKategorie_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKategorie_3.setBounds(405, 9, 39, 14);
		contentPane.add(lblKategorie_3);
		
		JLabel lblKategorie_4 = new JLabel("\"Promis\"");
		lblKategorie_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKategorie_4.setBounds(555, 10, 65, 12);
		contentPane.add(lblKategorie_4);
		
		JLabel lblKategorie_5 = new JLabel("Cocktails");
		lblKategorie_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKategorie_5.setBounds(707, 9, 65, 14);
		contentPane.add(lblKategorie_5);
		
		JButton btn20_1 = new JButton("20");
		btn20_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn20_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count = 1;
				btn20_1.setBackground(Color.WHITE );
				btn20_1.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Film wird gesucht?");
				settext();
				
			}
		});
		btn20_1.setBackground(new Color(255, 215, 0));
		btn20_1.setBounds(33, 36, 140, 80);
		contentPane.add(btn20_1);
		
		JButton btn20_2 = new JButton("20");
		btn20_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn20_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 6;
				btn20_2.setBackground(Color.WHITE );
				btn20_2.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Künstler wird gesucht?");
				settext();
			}
		});
		btn20_2.setBackground(new Color(60, 179, 113));
		btn20_2.setBounds(193, 36, 140, 80);
		contentPane.add(btn20_2);
		
		JButton btn20_3 = new JButton("20");
		btn20_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn20_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 11;
				btn20_3.setBackground(Color.WHITE );
				btn20_3.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Künstler und Song wird gesucht?");
				settext();
			}
		});
		btn20_3.setBackground(new Color(218, 112, 214));
		btn20_3.setBounds(353, 36, 140, 80);
		contentPane.add(btn20_3);
		
		JButton btn20_4 = new JButton("20");
		btn20_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn20_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 16;
				btn20_4.setBackground(Color.WHITE );
				btn20_4.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher 'Promi' wird gesucht?");
				settext();
			}
		});
		btn20_4.setBackground(new Color(255, 0, 0));
		btn20_4.setBounds(513, 36, 140, 80);
		contentPane.add(btn20_4);
		
		JButton btn20_5 = new JButton("20");
		btn20_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn20_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 21;
				btn20_5.setBackground(Color.WHITE );
				btn20_5.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Cocktail wird gesucht?");
				settext();
			}
		});
		btn20_5.setBackground(new Color(0, 206, 209));
		btn20_5.setBounds(673, 36, 140, 80);
		contentPane.add(btn20_5);
		
		JButton btn40_1 = new JButton("40");
		btn40_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn40_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 2;
				btn40_1.setBackground(Color.WHITE );
				btn40_1.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Film wird gesucht?");
				settext();
			}
		});
		btn40_1.setBackground(new Color(255, 215, 0));
		btn40_1.setBounds(33, 127, 140, 80);
		contentPane.add(btn40_1);
		
		JButton btn40_2 = new JButton("40");
		btn40_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn40_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 7;
				btn40_2.setBackground(Color.WHITE );
				btn40_2.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Künstler wird gesucht?");
				settext();
			}
		});
		btn40_2.setBackground(new Color(60, 179, 113));
		btn40_2.setBounds(193, 127, 140, 80);
		contentPane.add(btn40_2);
		
		JButton btn40_3 = new JButton("40");
		btn40_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn40_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 12;
				btn40_3.setBackground(Color.WHITE );
				btn40_3.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Künstler und Song wird gesucht?");
				settext();
			}
		});
		btn40_3.setBackground(new Color(218, 112, 214));
		btn40_3.setBounds(353, 127, 140, 80);
		contentPane.add(btn40_3);
		
		JButton btn40_4 = new JButton("40");
		btn40_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn40_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 17;
				btn40_4.setBackground(Color.WHITE );
				btn40_4.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher 'Promi' wird gesucht?");
				settext();
			}
		});
		btn40_4.setBackground(new Color(255, 0, 0));
		btn40_4.setBounds(513, 127, 140, 80);
		contentPane.add(btn40_4);
		
		JButton btn40_5 = new JButton("40");
		btn40_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn40_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 22;
				btn40_5.setBackground(Color.WHITE );
				btn40_5.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Cocktail wird gesucht?");
				settext();
			}
		});
		btn40_5.setBackground(new Color(64, 224, 208));
		btn40_5.setBounds(673, 127, 140, 80);
		contentPane.add(btn40_5);
		
		JButton btn60_1 = new JButton("60");
		btn60_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn60_1.setBackground(new Color(255, 215, 0));
		btn60_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 3;
				btn60_1.setBackground(Color.WHITE );
				btn60_1.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Film wird gesucht?");
				settext();
			}
		});
		btn60_1.setBounds(33, 218, 140, 80);
		contentPane.add(btn60_1);
		
		JButton btn60_2 = new JButton("60");
		btn60_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn60_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 8;
				btn60_2.setBackground(Color.WHITE );
				btn60_2.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Künstler wird gesucht?");
				settext();
			}
		});
		btn60_2.setBackground(new Color(60, 179, 113));
		btn60_2.setBounds(193, 218, 140, 80);
		contentPane.add(btn60_2);
		
		JButton btn60_3 = new JButton("60");
		btn60_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn60_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 13;
				btn60_3.setBackground(Color.WHITE );
				btn60_3.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Künstler und Song wird gesucht?");
				settext();
			}
		});
		btn60_3.setBackground(new Color(218, 112, 214));
		btn60_3.setBounds(353, 218, 140, 80);
		contentPane.add(btn60_3);
		
		JButton btn60_4 = new JButton("60");
		btn60_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn60_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 18;
				btn60_4.setBackground(Color.WHITE );
				btn60_4.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher 'Promi' wird gesucht?");
				settext();
			}
		});
		btn60_4.setBackground(new Color(255, 0, 0));
		btn60_4.setBounds(513, 218, 140, 80);
		contentPane.add(btn60_4);
		
		JButton btn60_5 = new JButton("60");
		btn60_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn60_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 23;
				btn60_5.setBackground(Color.WHITE );
				btn60_5.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Cocktail wird gesucht?");
				settext();
			}
		});
		btn60_5.setBackground(new Color(64, 224, 208));
		btn60_5.setBounds(673, 218, 140, 80);
		contentPane.add(btn60_5);
		
		JButton btn80_1 = new JButton("80");
		btn80_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn80_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 4;
				btn80_1.setBackground(Color.WHITE );
				btn80_1.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Film wird gesucht?");
				settext();
			}
		});
		btn80_1.setBackground(new Color(255, 215, 0));
		btn80_1.setBounds(33, 309, 140, 80);
		contentPane.add(btn80_1);
		
		JButton btn80_2 = new JButton("80");
		btn80_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn80_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 9;
				btn80_2.setBackground(Color.WHITE );
				btn80_2.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Künstler wird gesucht?");
				settext();
			}
		});
		btn80_2.setBackground(new Color(60, 179, 113));
		btn80_2.setBounds(193, 309, 140, 80);
		contentPane.add(btn80_2);
		
		JButton btn80_3 = new JButton("80");
		btn80_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn80_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 14;
				btn80_3.setBackground(Color.WHITE );
				btn80_3.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Künstler und Song wird gesucht?");
				settext();
			}
		});
		btn80_3.setBackground(new Color(218, 112, 214));
		btn80_3.setBounds(353, 309, 140, 80);
		contentPane.add(btn80_3);
		
		JButton btn80_4 = new JButton("80");
		btn80_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn80_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 19;
				btn80_4.setBackground(Color.WHITE );
				btn80_4.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher 'Promi' wird gesucht?");
				settext();
			}
		});
		btn80_4.setBackground(new Color(255, 0, 0));
		btn80_4.setBounds(513, 309, 140, 80);
		contentPane.add(btn80_4);
		
		JButton btn80_5 = new JButton("80");
		btn80_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn80_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 24;
				btn80_5.setBackground(Color.WHITE );
				btn80_5.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Cocktail wird gesucht?");
				settext();
			}
		});
		btn80_5.setBackground(new Color(64, 224, 208));
		btn80_5.setBounds(673, 309, 140, 80);
		contentPane.add(btn80_5);
		
		JButton btn100_1 = new JButton("100");
		btn100_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn100_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 5;
				btn100_1.setBackground(Color.WHITE );
				btn100_1.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Film wird gesucht?");
				settext();
			}
		});
		btn100_1.setBackground(new Color(255, 215, 0));
		btn100_1.setBounds(33, 400, 140, 80);
		contentPane.add(btn100_1);
		
		JButton btn100_2 = new JButton("100");
		btn100_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn100_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 10;
				btn100_2.setBackground(Color.WHITE );
				btn100_2.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Künstler wird gesucht?");
				settext();
			}
		});
		btn100_2.setBackground(new Color(60, 179, 113));
		btn100_2.setBounds(193, 400, 140, 80);
		contentPane.add(btn100_2);
		
		JButton btn100_3 = new JButton("100");
		btn100_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn100_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 15;
				btn100_3.setBackground(Color.WHITE );
				btn100_3.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Künstler und Song wird gesucht?");
				settext();
			}
		});
		btn100_3.setBackground(new Color(218, 112, 214));
		btn100_3.setBounds(353, 400, 140, 80);
		contentPane.add(btn100_3);
		
		JButton btn100_4 = new JButton("100");
		btn100_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn100_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 20;
				btn100_4.setBackground(Color.WHITE );
				btn100_4.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher 'Promi' wird gesucht?");
				settext();
			}
		});
		btn100_4.setBackground(new Color(255, 0, 0));
		btn100_4.setBounds(513, 400, 140, 80);
		contentPane.add(btn100_4);
		
		JButton btn100_5 = new JButton("100");
		btn100_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn100_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 25;
				btn100_5.setBackground(Color.WHITE );
				btn100_5.setEnabled(false);
				//lblFilm.setEnabled(true);
				lblFilm.setVisible(true);
				lblFilm.setText("Welcher Cocktail wird gesucht?");
				settext();
			}
		});
		btn100_5.setBackground(new Color(64, 224, 208));
		btn100_5.setBounds(673, 400, 140, 80);
		contentPane.add(btn100_5);
		lblFilm.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		lblFilm.setForeground(Color.MAGENTA);
		lblFilm.setBackground(new Color(255, 255, 255));
		lblFilm.setBounds(33, 503, 283, 27);
		lblFilm.setVisible(false);
		contentPane.add(lblFilm);
		
		JLabel lblFilmzitat_1 = new JLabel("");
		lblFilmzitat_1.setBounds(85, 643, 46, 14);
		contentPane.add(lblFilmzitat_1);
		lblTipp1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		lblTipp1.setBounds(33, 541, 1030, 23);
		contentPane.add(lblTipp1);
		lblTipp2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		lblTipp2.setBounds(33, 575, 1030, 23);
		contentPane.add(lblTipp2);
		lblTipp3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
	
		lblTipp3.setBounds(33, 609, 1030, 23);
		contentPane.add(lblTipp3);
		
		JButton btnTipp1 = new JButton("Tipp1");
		btnTipp1.setBackground(new Color(0, 153, 204));
		btnTipp1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(count) {
				case 1:
					lblTipp1.setText("Hamburger! Der Grundstein eines jeden nahrhaften Frühstücks.");
					break;
				case 2:
					lblTipp1.setText("Es muss die Lotion in den Korb legen.");
					break;
				case 3:
					lblTipp1.setText("Das beleidigt meine Intelligenz.");
					break;
				case 4:
					lblTipp1.setText("Geh in nen Pornoschuppen,das macht müde." );
					break;
				case 5:
					lblTipp1.setText("Aber Männer folgen nun mal keinem Titel. Nur dem Mut folgen sie." );
					break;
				case 6:
					lblBild1.setIcon(icon1);
					break;
				case 7:
					lblBild1.setIcon(icon4);
					break;
				case 8:
					lblBild1.setIcon(icon7);
					break;
				case 9:
					lblBild1.setIcon(icon10);
					break;
				case 10:
					lblBild1.setIcon(icon13);
					break;
				case 11:
					lblTipp1.setText("The reason I breathe is you");
					break;
				case 12:
					lblTipp1.setText("You brought me fame and fortune and everything that goes with it");
					break;
				case 13: 
					lblTipp1.setText("Und es dröhnt in meinen Ohren");
					break;
				case 14: 
					lblTipp1.setText("I hear the drums echoing tonight");
					break;
				case 15: 
					lblTipp1.setText("I let it fall, my heart," + "And as it fell you rose to claim it");
					break;
				case 16:
					lblBild1.setIcon(icon16);
					break;
				case 17:
					lblBild1.setIcon(icon17);
					break;
				case 18:
					lblBild1.setIcon(icon18);
					break;
				case 19:
					lblBild1.setIcon(icon19);
					break;
				case 20:
					lblBild1.setIcon(icon20);
					break;
				case 21:
					lblTipp1.setText("Weißer Rum | Ananassaft | Kokosmilch | Schlagsahne");
					break;
				case 22:
					lblTipp1.setText("Weißer Rum | Limettensaft | Zuckersirup | Rohrzucker | Sodawasser | Minzblätter");
					break;
				case 23:
					lblTipp1.setText("Tequila | Wodka | Triple Sec | Gin | Zitronensaft | Gomme Sirup | Cola");
					break;
				case 24: 
					lblTipp1.setText(" Wodka | Limettensaft | Triple Sec oder Cointreau | Cranberrysaft ");
					break;
				case 25: 
					lblTipp1.setText(" Whiskey | Wermut | Angostura | Cocktailkirsche ");
					break;
					
			}
			}
		});
		btnTipp1.setBounds(33, 692, 91, 23);
		contentPane.add(btnTipp1);
		
		JButton btnTipp2 = new JButton("Tipp2");
		btnTipp2.setBackground(new Color(0, 153, 204));
		btnTipp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(count) {
				case 1:
					lblTipp2.setText("Oh Nein, Ich habe Marvin ins Gesicht geschossen.");
					break;
				case 2:
					lblTipp2.setText("Ich kann deine Fotze riechen.");
					break;
				case 3:
					lblTipp2.setText("Das ist eine sizilianische Botschaft.Sie bedeutet. Luca Brasi liegt jetzt bei den Fischen.");
					break;
				case 4:
					lblTipp2.setText("Das hier ist der schnelle Andy. Er ist Reisender in Knallfröschen.");
					break;
				case 5:
					lblTipp2.setText("Das Dumme an Schottland ist, dass es voller Schotten ist.");
					break;
				case 6:
					lblBild2.setIcon(icon2);
					break;
				case 7:
					lblBild2.setIcon(icon5);
					break;
				case 8:
					lblBild2.setIcon(icon8);
					break;
				case 9:
					lblBild2.setIcon(icon11);
					break;
				case 10:
					lblBild2.setIcon(icon14);
					break;
				case 11:
					lblTipp2.setText("Give me a sign");
					break;
				case 12:
					lblTipp2.setText("I've paid my dues");
					break;
				case 13: 
					lblTipp2.setText("Wie ein Pfeil zieht sie vorbei");
					break;
				case 14: 
					lblTipp2.setText("It's gonna take a lot to drag me away from you");
					break;
				case 15: 
					lblTipp2.setText("Watched it pour as I touched your face");
					break;
				}
			}
		});
		btnTipp2.setBounds(160, 692, 91, 23);
		contentPane.add(btnTipp2);
		
		JButton btnTipp3 = new JButton("Tipp3");
		btnTipp3.setBackground(new Color(0, 153, 204));
		btnTipp3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(count) {
				case 1:
					lblTipp3.setText("Das ist ein leckerer Burger.");
					break;
				case 2:
					lblTipp3.setText("Quid pro Quo, ja oder nein?.");
					break;
				case 3:
					lblTipp3.setText("Ein Sizilianer darf am Hochzeitstag seiner Tochter keinem eine Bitte abschlagen.");
					break;
				case 4:
					lblTipp3.setText("Redest Du mit mir? Du laberst mich an? Du laberst MICH an?? Kann es sein, daß Du mich meinst, Du redest mit mir? Ich bin der einzige, der hier ist...!");
					break;
				case 5:
					lblTipp3.setText("Ja sie mögen uns unser Leben nehmen, aber niemals nehemen sie uns unsere - Freiheit!");
					break;
				case 6:
					lblBild3.setIcon(icon3);
					break;
				case 7:
					lblBild3.setIcon(icon6);
					break;
				case 8:
					lblBild3.setIcon(icon9);
					break;
				case 9:
					lblBild3.setIcon(icon12);
					break;
				case 10:
					lblBild3.setIcon(icon15);
					break;
				case 11:
					lblTipp3.setText("My loneliness is killing me (and I)");
					break;
				case 12:
					lblTipp3.setText("And we'll keep on fighting 'til the end");
					break;
				case 13: 
					lblTipp3.setText("Muss die Freiheit wohl grenzenlos sein");
					break;
				case 14: 
					lblTipp3.setText("I bless the rains down in Africa");
					break;
				case 15: 
					lblTipp3.setText("Well, it burned while I cried 'Cause I heard it screaming Out your name");
					break;
				}
			}
		});
		btnTipp3.setBounds(289, 692, 91, 23);
		contentPane.add(btnTipp3);
		
		JButton btnLoesung = new JButton("L\u00F6sung");
		btnLoesung.setBackground(new Color(0, 255, 255));
		btnLoesung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(count) {
				case 1:
					lblLoesung.setText("Pulp Fiction");
					break;
				case 2:
					lblLoesung.setText("Das Schweigen der Lämmer");
					break;
				case 3:
					lblLoesung.setText("Der Pate - Teil 1");
					break;
				case 4:
					lblLoesung.setText("Taxi Driver");
					break;
				case 5:
					lblLoesung.setText("Braveheart");
					break;
				case 6:
					lblLoesung.setText("Pablo Picasso");
					break;
				case 7:
					lblLoesung.setText("Rembrandt van Rijn");
					break;
				case 8:
					lblLoesung.setText("Edvard Munch");
					break;
				case 9:
					lblLoesung.setText("Salvador Dali");
					break;
				case 10:
					lblLoesung.setText("Peter Paul Rubens");
					break;
				case 11:
					lblLoesung.setText("Britney Spears - Hit Me Baby One More Time ");
					break;
				case 12:
					lblLoesung.setText("Queen - We Are the Champions ");
					break;
				case 13:
					lblLoesung.setText("Reinhard Mey - Über den Wolken");
					break;
				case 14:
					lblLoesung.setText("Toto - Africa");
					break;
				case 15:
					lblLoesung.setText("Adele - Set Fire to the Rain");
					break;
				case 16:
					lblLoesung.setText("Kader Loth");
					break;
				case 17:
					lblLoesung.setText("Florentin Will");
					break;
				case 18:
					lblLoesung.setText("Earl Sneed Sinclair");
					break;
				case 19:
					lblLoesung.setText("Sophia Vegas");
					break;
				case 20:
					lblLoesung.setText("Markus Majowski");
					break;
				case 21:
					lblLoesung.setText("Piña Colada");
					break;
				case 22:
					lblLoesung.setText("Mojito");
					break;
				case 23:
					lblLoesung.setText("Long Island Iced Tea");
					break;
				case 24:
					lblLoesung.setText("Cosmopolitan");
					break;
				case 25:
					lblLoesung.setText("Manhatten");
					break;
			}
				
				lblFilm.setVisible(false);
			}
		});
		btnLoesung.setBounds(415, 692, 91, 23);
		contentPane.add(btnLoesung);
		lblLoesung.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		lblLoesung.setBounds(33, 655, 359, 26);
		contentPane.add(lblLoesung);
		
		
		lblBild1.setBounds(863, 37, 200, 133);
		contentPane.add(lblBild1);
		
		
		lblBild3.setBounds(863, 347, 200, 133);
		contentPane.add(lblBild3);
		
		
		lblBild2.setBounds(863, 192, 200, 133);
		contentPane.add(lblBild2);
		
		JLabel lblpkt1 = new JLabel("Team 1 - Punkte");
		lblpkt1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblpkt1.setBounds(43, 765, 119, 14);
		contentPane.add(lblpkt1);
		
		tfpkt1 = new JTextField();
		tfpkt1.setBounds(53, 790, 86, 20);
		contentPane.add(tfpkt1);
		tfpkt1.setColumns(10);
		
		JButton btnaddpkt1 = new JButton("Points - Team1");
		btnaddpkt1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnaddpkt1.setBackground(new Color(255, 0, 0));
		btnaddpkt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				spieler1 = Integer.parseInt(tfpkt1.getText());
				sum += spieler1;
				lblshowres.setText(Integer.toString(sum));;
				tfpkt1.requestFocus();
				tfpkt1.setText("");
			}
		});
		btnaddpkt1.setBounds(21, 821, 140, 23);
		contentPane.add(btnaddpkt1);
		lblshowres.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		lblshowres.setBounds(84, 855, 25, 14);
		contentPane.add(lblshowres);
		
		JLabel lblpkt2 = new JLabel("Team 2 - Punkte");
		lblpkt2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblpkt2.setBounds(207, 765, 115, 14);
		contentPane.add(lblpkt2);
		
		tfpkt2 = new JTextField();
		tfpkt2.setColumns(10);
		tfpkt2.setBounds(218, 790, 86, 20);
		contentPane.add(tfpkt2);
		
		JButton btnaddpkt2 = new JButton("Points - Team2");
		btnaddpkt2.setBackground(new Color(255, 255, 0));
		btnaddpkt2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnaddpkt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spieler2 = Integer.parseInt(tfpkt2.getText());
				sum1 += spieler2;
				lblshowres2.setText(Integer.toString(sum1));;
				tfpkt2.requestFocus();
				tfpkt2.setText("");
			}
		});
		btnaddpkt2.setBounds(193, 821, 140, 23);
		contentPane.add(btnaddpkt2);
		lblshowres2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
	
		lblshowres2.setBounds(248, 855, 25, 14);
		contentPane.add(lblshowres2);
		
	
		
		
		
	}
	void settext() {
		lblTipp1.setText("");
		lblTipp2.setText("");
		lblTipp3.setText("");
		lblBild1.setIcon(null);
		lblBild2.setIcon(null);
		lblBild3.setIcon(null);
		lblLoesung.setText("");
	}
}
