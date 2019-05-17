package com.ali.hyacinth.ims.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ali.hyacinth.ims.controller.ImsProductController;
import com.ali.hyacinth.ims.controller.InvalidInputException;

import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImsPage extends JFrame {
	
	private String error = "";

	private JPanel contentPane;
	private JPanel transactionsPanel;
	private JPanel accountsPanel;
	private JPanel registerCustomerPanel;
	private JPanel productsPanel;
	private JLayeredPane layeredPane;
	private JLabel lblDashboard;
	private JLabel lblAccounts;
	private JLabel lblTransaction;
	private JLabel lblProducts;
	private JTextField textFieldProductName;
	private JTextField textFieldProductPrice;
	private JTextField textFieldProductQuantiy;

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImsPage frame = new ImsPage();
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
	public ImsPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1145, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel heading = new JPanel();
		heading.setBackground(Color.LIGHT_GRAY);
		heading.setBounds(0, 0, 1123, 91);
		contentPane.add(heading);
		
		JLabel lblDedonMotorsInventory = new JLabel("De-Don Motors Inventory Management System");
		lblDedonMotorsInventory.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblDedonMotorsInventory.setForeground(Color.WHITE);
		
		JLabel lblInGodWe = new JLabel("In God We Trust");
		lblInGodWe.setHorizontalAlignment(SwingConstants.CENTER);
		lblInGodWe.setForeground(Color.BLUE);
		lblInGodWe.setFont(new Font("Tahoma", Font.ITALIC, 22));
		GroupLayout gl_heading = new GroupLayout(heading);
		gl_heading.setHorizontalGroup(
			gl_heading.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_heading.createSequentialGroup()
					.addGap(297)
					.addComponent(lblDedonMotorsInventory))
				.addGroup(Alignment.TRAILING, gl_heading.createSequentialGroup()
					.addContainerGap(510, Short.MAX_VALUE)
					.addComponent(lblInGodWe)
					.addGap(451))
		);
		gl_heading.setVerticalGroup(
			gl_heading.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_heading.createSequentialGroup()
					.addGap(7)
					.addComponent(lblDedonMotorsInventory)
					.addGap(5)
					.addComponent(lblInGodWe)
					.addContainerGap())
		);
		heading.setLayout(gl_heading);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 91, 291, 508);
		contentPane.add(panel);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblWelcome.setForeground(Color.MAGENTA);
		
		lblDashboard = new JLabel("Dashboard");
		lblDashboard.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(productsPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblDashboard.setForeground(Color.WHITE);
				lblProducts.setForeground(Color.GREEN);
				lblAccounts.setForeground(Color.GREEN);
				lblTransaction.setForeground(Color.GREEN);
			}
		});
		lblDashboard.setForeground(Color.GREEN);
		lblDashboard.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		lblProducts = new JLabel("Products");
		lblProducts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(transactionsPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblProducts.setForeground(Color.WHITE);
				lblDashboard.setForeground(Color.GREEN);
				lblAccounts.setForeground(Color.GREEN);
				lblTransaction.setForeground(Color.GREEN);
			}
		});
		lblProducts.setForeground(Color.GREEN);
		lblProducts.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		lblTransaction = new JLabel("Transactions");
		lblTransaction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(accountsPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblDashboard.setForeground(Color.GREEN);
				lblProducts.setForeground(Color.GREEN);
				lblAccounts.setForeground(Color.GREEN);
				lblTransaction.setForeground(Color.WHITE);
			}
		});
		lblTransaction.setForeground(Color.GREEN);
		lblTransaction.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		lblAccounts = new JLabel("Accounts");
		lblAccounts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(registerCustomerPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblDashboard.setForeground(Color.GREEN);
				lblProducts.setForeground(Color.GREEN);
				lblTransaction.setForeground(Color.GREEN);
				lblAccounts.setForeground(Color.WHITE);
			}
		});
		lblAccounts.setForeground(Color.GREEN);
		lblAccounts.setFont(new Font("Tahoma", Font.BOLD, 24));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAccounts)
						.addComponent(lblTransaction)
						.addComponent(lblProducts)
						.addComponent(lblDashboard)
						.addComponent(lblWelcome))
					.addContainerGap(86, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblWelcome)
					.addGap(40)
					.addComponent(lblDashboard)
					.addGap(29)
					.addComponent(lblProducts)
					.addGap(36)
					.addComponent(lblTransaction)
					.addGap(34)
					.addComponent(lblAccounts)
					.addGap(278))
		);
		panel.setLayout(gl_panel);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(293, 90, 830, 509);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		productsPanel = new JPanel();
		layeredPane.add(productsPanel, "name_866715194326100");
		
		JLabel lblProductsPanel = new JLabel("Overview\r\n");
		GroupLayout gl_productsPanel = new GroupLayout(productsPanel);
		gl_productsPanel.setHorizontalGroup(
			gl_productsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_productsPanel.createSequentialGroup()
					.addGap(322)
					.addComponent(lblProductsPanel)
					.addContainerGap(439, Short.MAX_VALUE))
		);
		gl_productsPanel.setVerticalGroup(
			gl_productsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_productsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblProductsPanel)
					.addContainerGap(473, Short.MAX_VALUE))
		);
		productsPanel.setLayout(gl_productsPanel);
		
		transactionsPanel = new JPanel();
		layeredPane.add(transactionsPanel, "name_866723336924500");
		
		JLabel lblTransactionPanel = new JLabel("Transaction Panel");
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_transactionsPanel = new GroupLayout(transactionsPanel);
		gl_transactionsPanel.setHorizontalGroup(
			gl_transactionsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_transactionsPanel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
					.addComponent(lblTransactionPanel)
					.addGap(207))
		);
		gl_transactionsPanel.setVerticalGroup(
			gl_transactionsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_transactionsPanel.createSequentialGroup()
					.addGroup(gl_transactionsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_transactionsPanel.createSequentialGroup()
							.addGap(203)
							.addComponent(lblTransactionPanel))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 505, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("Add Product");
		
		textFieldProductName = new JTextField();
		textFieldProductName.setColumns(10);
		
		textFieldProductPrice = new JTextField();
		textFieldProductPrice.setColumns(10);
		
		textFieldProductQuantiy = new JTextField();
		textFieldProductQuantiy.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		
		JLabel lblPrice = new JLabel("Price");
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		
		JButton btnAddProduct = new JButton("ADD PRODUCT");
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				error = "";
				float price = 0;
				try {
					price = Float.parseFloat(textFieldProductPrice.getText());
				}
				catch (NumberFormatException e) {
					error = "Price figure needs to be a numerical value! ";
				}
				int quantity = 0;
				try {
					quantity = Integer.parseInt(textFieldProductQuantiy.getText());
				}
				catch (NumberFormatException e) {
					error = error + "Quantity figure needs to be a numerical value! ";
				}
				
				String name = textFieldProductName.getText();
				
				try {
					ImsProductController.createProduct(name, price, quantity);
				} catch (InvalidInputException e) {
					error = e.getMessage();
				}
				
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(103)
					.addComponent(lblNewLabel)
					.addContainerGap(121, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblPrice))
							.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAddProduct)
						.addComponent(textFieldProductQuantiy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldProductPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldProductName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(78))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldProductName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldProductPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrice))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldProductQuantiy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAddProduct)
					.addContainerGap(299, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		transactionsPanel.setLayout(gl_transactionsPanel);
		
		accountsPanel = new JPanel();
		layeredPane.add(accountsPanel, "name_866726102302000");
		
		JLabel lblCustomerAccounts = new JLabel("Customer accounts");
		GroupLayout gl_accountsPanel = new GroupLayout(accountsPanel);
		gl_accountsPanel.setHorizontalGroup(
			gl_accountsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_accountsPanel.createSequentialGroup()
					.addGap(318)
					.addComponent(lblCustomerAccounts)
					.addContainerGap(443, Short.MAX_VALUE))
		);
		gl_accountsPanel.setVerticalGroup(
			gl_accountsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_accountsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCustomerAccounts)
					.addContainerGap(473, Short.MAX_VALUE))
		);
		accountsPanel.setLayout(gl_accountsPanel);
		
		registerCustomerPanel = new JPanel();
		layeredPane.add(registerCustomerPanel, "name_866729209042000");
		
		JLabel lblRegisterCustomers = new JLabel("Register Customers");
		GroupLayout gl_registerCustomerPanel = new GroupLayout(registerCustomerPanel);
		gl_registerCustomerPanel.setHorizontalGroup(
			gl_registerCustomerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_registerCustomerPanel.createSequentialGroup()
					.addGap(337)
					.addComponent(lblRegisterCustomers)
					.addContainerGap(424, Short.MAX_VALUE))
		);
		gl_registerCustomerPanel.setVerticalGroup(
			gl_registerCustomerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_registerCustomerPanel.createSequentialGroup()
					.addGap(28)
					.addComponent(lblRegisterCustomers)
					.addContainerGap(461, Short.MAX_VALUE))
		);
		registerCustomerPanel.setLayout(gl_registerCustomerPanel);
	}
}
