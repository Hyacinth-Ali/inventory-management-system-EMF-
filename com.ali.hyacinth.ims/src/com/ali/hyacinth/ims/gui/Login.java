package com.ali.hyacinth.ims.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JPasswordField password;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPanel register;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 655, 425);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel login = new JPanel();
		login.setBackground(Color.LIGHT_GRAY);
		layeredPane.add(login, "name_501219560393400");
		login.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLogin.setBounds(198, 70, 254, 20);
		login.add(lblLogin);
		
		userName = new JTextField();
		userName.setBounds(297, 113, 314, 41);
		login.add(userName);
		userName.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(297, 170, 314, 41);
		login.add(password);
		
		JLabel lblErroeMessage = new JLabel("Erroe Message");
		lblErroeMessage.setForeground(Color.RED);
		lblErroeMessage.setBounds(296, 291, 315, 20);
		login.add(lblErroeMessage);
		
		JButton btnLogin = new JButton("SIGN IN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogin.setBounds(297, 246, 115, 29);
		login.add(btnLogin);
		
		JButton btnLogout = new JButton("LOG OUT");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogout.setBounds(467, 246, 115, 29);
		login.add(btnLogout);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(register);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnRegister.setBounds(467, 347, 115, 29);
		login.add(btnRegister);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		lblNewLabel.setBounds(135, 16, 36, 48);
		login.add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(Color.BLACK);
		lblUserName.setBounds(198, 114, 94, 40);
		login.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setBounds(198, 170, 94, 40);
		login.add(lblPassword);
		
		register = new JPanel();
		register.setBackground(Color.LIGHT_GRAY);
		layeredPane.add(register, "name_501308693384700");
		register.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(204, 104, 264, 39);
		register.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(204, 159, 264, 29);
		register.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(204, 204, 264, 29);
		register.add(passwordField_1);
		
		JButton btnRegisterMainPage = new JButton("REGISTER");
		btnRegisterMainPage.setForeground(Color.BLACK);
		btnRegisterMainPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(login);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnRegisterMainPage.setBounds(269, 265, 115, 29);
		register.add(btnRegisterMainPage);
		
		JLabel lblUserName_1 = new JLabel("User Name");
		lblUserName_1.setForeground(Color.BLACK);
		lblUserName_1.setBounds(47, 113, 142, 20);
		register.add(lblUserName_1);
		
		JLabel lblPassword_1 = new JLabel("Password\r\n");
		lblPassword_1.setForeground(Color.BLACK);
		lblPassword_1.setBounds(47, 163, 142, 20);
		register.add(lblPassword_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setForeground(Color.BLACK);
		lblConfirmPassword.setBounds(47, 208, 142, 20);
		register.add(lblConfirmPassword);
		
		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRegister.setBounds(100, 16, 404, 68);
		register.add(lblRegister);
		setLocationRelativeTo(null);
		
		setUndecorated(true);
	}
}
