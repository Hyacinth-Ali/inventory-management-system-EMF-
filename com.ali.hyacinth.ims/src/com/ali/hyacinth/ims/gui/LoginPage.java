package com.ali.hyacinth.ims.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.controller.ImsController;
import com.ali.hyacinth.ims.controller.ImsPersonController;
import com.ali.hyacinth.ims.controller.InvalidInputException;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JPasswordField passwordField;
	private JLabel errorMessage;
	private String error = "";

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		//setUndecorated(true);
		UIManager.put("OptionPane.messageForeground", Color.green);
		Image iconImg = new ImageIcon(this.getClass().getResource("/motorcyclist-icon.png")).getImage();
		setIconImage(iconImg);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 515);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new LineBorder(Color.WHITE, 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		Image motorcycle = new ImageIcon(this.getClass().getResource("/motorcycle.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(motorcycle));
		lblNewLabel.setBounds(31, 63, 302, 274);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
		panel.setBounds(358, 92, 569, 327);
		contentPane.add(panel);
		
		JLabel lblUserLogin = new JLabel("User Login");
		Image img = new ImageIcon(this.getClass().getResource("/person-icon.png")).getImage();
		lblUserLogin.setIcon(new ImageIcon(img));
		//validate();
		lblUserLogin.setForeground(Color.WHITE);
		lblUserLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		userName = new JTextField();
		userName.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUserName.setForeground(Color.WHITE);
		
		passwordField = new JPasswordField();
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel usericon = new JLabel("");
		Image userIcon = new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		usericon.setIcon(new ImageIcon(userIcon));
		
		JLabel passwordIcon = new JLabel("");
		Image password = new ImageIcon(this.getClass().getResource("/password.png")).getImage();
		passwordIcon.setIcon(new ImageIcon(password));
		Image okay = new ImageIcon(this.getClass().getResource("/okay.png")).getImage();
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(ImsApplication.getFrame(), "Successfully logged out", 
						"Logout status", JOptionPane.INFORMATION_MESSAGE);				
				dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogout.setBackground(Color.GRAY);
		btnLogout.setForeground(Color.WHITE);
		Image logout = new ImageIcon(this.getClass().getResource("/logout.png")).getImage();
		btnLogout.setIcon(new ImageIcon(logout));
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//clear error
				error = "";
				String name = userName.getText();
				char[] pass = passwordField.getPassword();
				String password = new String(pass);
				
				boolean loggedIn = true;
				
				if (name != null && name.length() > 0) {
					if (password != null && password.length() > 0) {
						try {
							ImsController.login(name, password);
						} catch (InvalidInputException e) {
							loggedIn = false;
							error = e.getMessage();
						}
					} else {
						loggedIn = false;
						error = "You can't log in with empty password";
					}
				} else {
					loggedIn = false;
					error = "You can't log in with empty user name";
				}
				if(loggedIn) {
					/**
					 * Launch the main page.
					 */
					try {
						ImsPage frame = new ImsPage();
						frame.setVisible(true);
						ImsApplication.getFrame().setVisible(false);
						ImsApplication.setFrame(frame);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				//update visuals
				refreshData();
			}
		});
		btnLogin.setBackground(Color.GRAY);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		Image login = new ImageIcon(this.getClass().getResource("/okay.png")).getImage();
		btnLogin.setIcon(new ImageIcon(login));
		
		errorMessage = new JLabel("Error Mesages");
		errorMessage.setForeground(Color.RED);
		errorMessage.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RegisterPage frame= new RegisterPage();
							frame.setVisible(true);
							ImsApplication.getFrame().setVisible(false);
							ImsApplication.setFrame(frame);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		Image register = new ImageIcon(this.getClass().getResource("/register.png")).getImage();
		btnRegister.setIcon(new ImageIcon(register));
		btnRegister.setBackground(Color.GRAY);
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(178)
										.addComponent(lblUserLogin, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(29)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblUserName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(52)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
											.addComponent(userName, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_panel.createSequentialGroup()
												.addGap(6)
												.addComponent(btnLogin)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
											.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(passwordIcon, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
											.addComponent(usericon, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))))
								.addGap(76))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(errorMessage, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
								.addGap(50)))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(btnRegister)
							.addGap(127))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblUserLogin, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUserName)
								.addComponent(userName, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
						.addComponent(usericon, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPassword)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(passwordIcon, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addComponent(errorMessage)
					.addGap(18)
					.addComponent(btnRegister)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblDedonMotorsInventory = new JLabel("DE-DON MOTORS INVENTORY SYSTEM");
		lblDedonMotorsInventory.setForeground(Color.WHITE);
		lblDedonMotorsInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblDedonMotorsInventory.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblDedonMotorsInventory.setBounds(403, 16, 488, 60);
		contentPane.add(lblDedonMotorsInventory);
		
		//setUndecorated(true);
		
		refreshData();
	}
	
	private void refreshData() {
		//error
		errorMessage.setText(error);
		
		//clear contents
		userName.setText("");
		passwordField.setText("");
	}
}
