package main;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.*;


public class Arknight_Price_Calculator {
	private double Price;
	String hasil_total="0";
	private JFrame frmArknightOrundumPrice;
	private JTextField orundum_field;
	private JTextField originite_field;
	private JTextField hh1_field;
	private JTextField hh10_field;
	private JTextField price_field;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arknight_Price_Calculator window = new Arknight_Price_Calculator();
					window.frmArknightOrundumPrice.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Arknight_Price_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArknightOrundumPrice = new JFrame();
		frmArknightOrundumPrice.setResizable(false);
		frmArknightOrundumPrice.setTitle("Arknight Price Calculator");
		frmArknightOrundumPrice.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/main/Orundum.png")));
		frmArknightOrundumPrice.getContentPane().setBackground(Color.DARK_GRAY);
		frmArknightOrundumPrice.setBounds(100, 100, 700, 440);
		frmArknightOrundumPrice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArknightOrundumPrice.getContentPane().setLayout(null);
		
		//Load Gambar
		ImageIcon orundum = new ImageIcon(this.getClass().getResource("/main/Orundum.png"));
		ImageIcon originiteP = new ImageIcon(this.getClass().getResource("/main/Originite_Prime.png"));
		ImageIcon one_hh = new ImageIcon(this.getClass().getResource("/main/Headhunting_Permit.png"));
		ImageIcon ten_hh = new ImageIcon(this.getClass().getResource("/main/Ten-roll_Headhunting_Permit.png"));
		
		//resize
		Image image = orundum.getImage(); // transform it 
		Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		orundum = new ImageIcon(newimg);
		
		image = originiteP.getImage(); 
		newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); 
		originiteP = new ImageIcon(newimg);
		
		image = one_hh.getImage(); 
		newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); 
		one_hh = new ImageIcon(newimg);
		
		image = ten_hh.getImage(); 
		newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); 
		ten_hh = new ImageIcon(newimg);
		
		JLabel orundum_lbl = new JLabel("");
		orundum_lbl.setIcon(orundum);
		orundum_lbl.setBounds(40, 32, 50, 50);
		frmArknightOrundumPrice.getContentPane().add(orundum_lbl);
		
		JLabel originite_lbl = new JLabel("");
		originite_lbl.setIcon(originiteP);
		originite_lbl.setBounds(40, 92, 50, 50);
		frmArknightOrundumPrice.getContentPane().add(originite_lbl);
		
		JLabel onehh_lbl = new JLabel("");
		onehh_lbl.setIcon(one_hh);
		onehh_lbl.setBounds(40, 152, 50, 50);
		frmArknightOrundumPrice.getContentPane().add(onehh_lbl);
		
		JLabel tenhh_lbl = new JLabel("");
		tenhh_lbl.setIcon(ten_hh);
		tenhh_lbl.setBounds(40, 212, 50, 50);
		frmArknightOrundumPrice.getContentPane().add(tenhh_lbl);
		
		orundum_field = new JTextField();
		orundum_field.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		orundum_field.setText("0");
		orundum_field.setBounds(100, 42, 200, 30);
		frmArknightOrundumPrice.getContentPane().add(orundum_field);
		orundum_field.setColumns(10);
		
		originite_field = new JTextField();
		originite_field.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		originite_field.setText("0");
		originite_field.setColumns(10);
		originite_field.setBounds(100, 102, 200, 30);
		frmArknightOrundumPrice.getContentPane().add(originite_field);
		
		hh1_field = new JTextField();
		hh1_field.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		hh1_field.setText("0");
		hh1_field.setColumns(10);
		hh1_field.setBounds(100, 162, 200, 30);
		frmArknightOrundumPrice.getContentPane().add(hh1_field);
		
		hh10_field = new JTextField();
		hh10_field.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		hh10_field.setText("0");
		hh10_field.setColumns(10);
		hh10_field.setBounds(100, 222, 200, 30);
		frmArknightOrundumPrice.getContentPane().add(hh10_field);
		
		
		
		price_field = new JTextField();
		price_field.setText("0");
		price_field.setColumns(10);
		price_field.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		price_field.setBounds(400, 141, 200, 30);
		frmArknightOrundumPrice.getContentPane().add(price_field);
		
		JLabel lblNewLabel = new JLabel("Price ($)");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(328, 141, 62, 30);
		frmArknightOrundumPrice.getContentPane().add(lblNewLabel);
		
		JButton month_card_btn = new JButton("Monthly Card");
		month_card_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orundum_field.setText("6000");
				originite_field.setText("6");
				price_field.setText("4.99");
				
				hh1_field.setText("0");
				hh10_field.setText("0");
			}
		});
		month_card_btn.setBounds(400, 99, 200, 20);
		frmArknightOrundumPrice.getContentPane().add(month_card_btn);
		
		JButton month_hh_btn = new JButton("Monthly Headhunting Pack");
		month_hh_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				originite_field.setText("42");
				hh10_field.setText("1");
				price_field.setText("25.99");
				
				hh1_field.setText("0");
				orundum_field.setText("0");
			}
		});
		month_hh_btn.setBounds(400, 39, 200, 20);
		frmArknightOrundumPrice.getContentPane().add(month_hh_btn);
		
		JButton starter_hh_btn = new JButton("Starter Headhunting Pack");
		starter_hh_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hh10_field.setText("2");
				price_field.setText("19.99");
				
				hh1_field.setText("0");
				orundum_field.setText("0");
				originite_field.setText("0");
			}
		});
		starter_hh_btn.setBounds(400, 69, 200, 20);
		frmArknightOrundumPrice.getContentPane().add(starter_hh_btn);
		
		
		JLabel hasil_lbl = new JLabel("Orundum / Dollar : "+hasil_total);
		hasil_lbl.setForeground(Color.WHITE);
		hasil_lbl.setBackground(Color.DARK_GRAY);
		hasil_lbl.setFont(new Font("Arial", Font.BOLD, 16));
		hasil_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		hasil_lbl.setBounds(10, 315, 664, 50);
		frmArknightOrundumPrice.getContentPane().add(hasil_lbl);
		
		JButton calcu_btn = new JButton("Calculate");
		calcu_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Price=Double.parseDouble(price_field.getText());
				
				int price_int=(int) Price;
				int or_int=Integer.parseInt(orundum_field.getText());
				int op_int=Integer.parseInt(originite_field.getText());
				int hh1_int=Integer.parseInt(hh1_field.getText());
				int hh10_int=Integer.parseInt(hh10_field.getText());
				
				int total=((or_int) + (op_int*180) + (hh1_int*600) + (hh10_int*6000)) / price_int;
				hasil_total=String.valueOf(total);
				hasil_lbl.setText("Orundum / Dollar : "+hasil_total);
			}
		});
		calcu_btn.setFont(new Font("Dubai Light", Font.PLAIN, 16));
		calcu_btn.setBounds(400, 182, 200, 80);
		frmArknightOrundumPrice.getContentPane().add(calcu_btn);
	}
}
