package com.ali.hyacinth.ims.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.controller.ImsPersonController;
import com.ali.hyacinth.ims.controller.InvalidInputException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldUserName;
	private JPasswordField passwordField;
	private JPasswordField passwordFieldConfirm;
	
	private String error = "";
	//private static RegisterPage frame;
	private JLabel errorMessage;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame= new RegisterPage();
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
	public RegisterPage() {
		//setUndecorated(true);
		
		//set frame icon
		Image iconImg = new ImageIcon(this.getClass().getResource("/motorcyclist-icon.png")).getImage();
		setIconImage(iconImg);
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 610);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDedonMotorsInventory = new JLabel("De-Don Motors Inventory Management System, Registration Page");
		lblDedonMotorsInventory.setForeground(Color.GREEN);
		lblDedonMotorsInventory.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblDedonMotorsInventory.setBounds(111, 16, 688, 20);
		contentPane.add(lblDedonMotorsInventory);
		
		JLabel lblNewLabel = new JLabel("");
		Image motorcycle = new ImageIcon(this.getClass().getResource("/motorcycle2.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(motorcycle));
		lblNewLabel.setBounds(0, 52, 275, 302);
		contentPane.add(lblNewLabel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(322, 73, 549, 447);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.WHITE, 3));
		panel.setBackground(Color.GRAY);
		layeredPane.add(panel, "name_782002476686600");
		
		JLabel lblUserRegistration = new JLabel("User Registration");
		lblUserRegistration.setForeground(Color.WHITE);
		Image img = new ImageIcon(this.getClass().getResource("/person-icon.png")).getImage();
		lblUserRegistration.setIcon(new ImageIcon(img));
		lblUserRegistration.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel name = new JLabel("Name");
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel userName = new JLabel("User Name");
		userName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		userName.setForeground(Color.WHITE);
		
		JLabel password = new JLabel("Password");
		password.setForeground(Color.WHITE);
		password.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel confirmPassword = new JLabel("Confirm Password");
		confirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		confirmPassword.setForeground(Color.WHITE);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldName.setColumns(10);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		passwordFieldConfirm = new JPasswordField();
		passwordFieldConfirm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		passwordField.setEchoChar('*');
		passwordFieldConfirm.setEchoChar('*');
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
					passwordFieldConfirm.setEchoChar((char)0);
				} else {
					passwordField.setEchoChar('*');
					passwordFieldConfirm.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBackground(Color.GRAY);
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerActionPerformed(e);
			}
		});
		register.setForeground(Color.WHITE);
		register.setFont(new Font("Tahoma", Font.PLAIN, 18));
		register.setBackground(Color.GRAY);
		Image registerIcon = new ImageIcon(this.getClass().getResource("/Register_icon.png")).getImage();
		register.setIcon(new ImageIcon(registerIcon));
		
		errorMessage = new JLabel("");
		errorMessage.setForeground(Color.RED);
		errorMessage.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							LoginPage frame = new LoginPage();
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
		Image registerBack = new ImageIcon(this.getClass().getResource("/back.png")).getImage();
		btnBack.setIcon(new ImageIcon(registerBack));
		btnBack.setBackground(Color.GRAY);
		btnBack.setForeground(Color.WHITE);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(33)
							.addComponent(errorMessage, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(186)
							.addComponent(lblUserRegistration))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(name, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(userName, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.addComponent(password))
							.addGap(39)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
								.addComponent(textFieldName, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
								.addComponent(textFieldUserName, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(confirmPassword)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(chckbxNewCheckBox)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(register)
									.addGap(15))
								.addComponent(passwordFieldConfirm, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))))
					.addGap(90))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBack)
					.addContainerGap(413, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUserRegistration)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(name))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(24)
							.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(8)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(13)
							.addComponent(userName))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(textFieldUserName, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(password)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(confirmPassword)
						.addComponent(passwordFieldConfirm, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox)
						.addComponent(register))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(errorMessage)
					.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addGap(25))
		);
		panel.setLayout(gl_panel);
		
		refreshData();
	}
	
	private void registerActionPerformed(ActionEvent e) {
		
		error = "";
		String name = textFieldName.getText().trim();
		String userName = textFieldUserName.getText().trim();
		char [] managerPassword1 = passwordField.getPassword();
		String password1 = new String(managerPassword1);
		char [] managerPassword2 = passwordFieldConfirm.getPassword();
		String password2 = new String(managerPassword2);
		boolean status = true;
		
		if (password1 == null || password1.length() == 0 
				|| password2 == null || password2.length() == 0) {
			error = "The password field is empty.";
		} else {
			if (password1.equals(password2)) {
				try {
					ImsPersonController.createManager(name, userName, password1);
				} catch (InvalidInputException er) {
					status = false;
					error = er.getMessage();
				}
				if(status) {
					JOptionPane.showMessageDialog(ImsApplication.getFrame(), "successfully registered", "Registration Status",
							JOptionPane.CLOSED_OPTION);
				}
			} else {
				error = "The two password are not equal.";
			}
		}
		refreshData();
	}
	
	private void refreshData() {
		//error
		errorMessage.setText(error);
		
		textFieldName.setText("");
		textFieldUserName.setText("");
		passwordField.setText("");
		passwordFieldConfirm.setText("");
	}
}
