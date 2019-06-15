package com.ali.hyacinth.ims.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.controller.ImsController;
import com.ali.hyacinth.ims.controller.ImsPersonController;
import com.ali.hyacinth.ims.controller.ImsProductController;
import com.ali.hyacinth.ims.controller.ImsTransactionController;
import com.ali.hyacinth.ims.controller.InvalidInputException;
import com.ali.hyacinth.ims.controller.TOCustomer;
import com.ali.hyacinth.ims.resource.ImsResource;
import com.ali.hyacinth.ims.transferobjects.Receipt;
import com.ali.hyacinth.ims.transferobjects.TOProduct;
import com.ali.hyacinth.ims.transferobjects.TOProductTransaction;
import com.ali.hyacinth.ims.transferobjects.TOTransaction;

import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JTextArea;

public class ImsPage extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String error = "";
	private String productTransactionName = "";
	private int productIndex;
	private int countRefresh = 1;

	private JPanel contentPane;
	private JPanel productsPanel;
	private JPanel transactionsPanel;
	private JPanel accountsPanel;
	private JPanel dashBoardPanel;
	private JLayeredPane layeredPane;
	private JLabel lblDashboard;
	private JLabel lblAccounts;
	private JLabel lblTransaction;
	private JLabel lblProducts;
	private JTextField textFieldProductName;
	private JTextField textFieldProductPrice;
	private JTextField textFieldProductQuantity;
	private JTextField textFieldUpdateProductName;
	private JTextField textFieldUpdateProductPrice;
	private JTextField textFieldUpdateProductQuantity;
	private JComboBox<String> comboBoxProduct;
	private JLabel lblErrorMEssage;
	
	//data elements
	//Products
	private HashMap<Integer, String> products;
	private JTable tableProducts;
	private HashMap<Integer, String> transactionProducts;
	
	//Customers
	private HashMap<Integer, String> customers;
	private HashMap<Integer, String> customerTransactions;
	

	private JButton btnLogout;
	private JTextField textFieldCustomerName;
	private JTextField textFieldCustomerID;
	private JTextField textFieldUpdateCustomerName;
	private JTextField textFieldUpdateCustomerID;
	private JComboBox<String> comboBoxCustomer;
	private JTextField textFieldTransactionCustomerID;
	private JTextField textFieldTransactionProductQuantity;
	private JComboBox<String> comboBoxTransactionProduct;
	private JTextField textFieldAmountPaid;
	private JLabel lblItemPrice;
	private JTable tableTransaction;
	private JLabel lblCurrentCustomer;
	private JTextField textFieldUpdateQuantity;
	private JLabel lblTotalAmount;
	private JTextArea textArea;
	private JPanel receiptPanel;
	private JTable tableCustomers;
	private JTextField textFieldCurrentPaid;
	private JTextField textFieldUpdatePaid;
	private JLabel lblTotalBalance;

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
		//setUndecorated(true);	
		
		//set frame icon
		Image iconImg = new ImageIcon(this.getClass().getResource("/motorcyclist-icon.png")).getImage();
		setIconImage(iconImg);
		
		//setIconImage(/com.ali.hyacinth.ims/images/motorcycle.png);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1145, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel heading = new JPanel();
		heading.setBackground(new Color(47, 79, 79));
		heading.setBounds(0, 0, 1123, 91);
		contentPane.add(heading);
		
		JLabel lblDedonMotorsInventory = new JLabel("De-Don Motors Inventory Management System");
		lblDedonMotorsInventory.setBounds(293, 0, 568, 36);
		lblDedonMotorsInventory.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblDedonMotorsInventory.setForeground(Color.WHITE);
		heading.setLayout(null);
		
		JLabel lblInGodWe = new JLabel("In God We Trust");
		lblInGodWe.setBounds(513, 34, 162, 27);
		lblInGodWe.setHorizontalAlignment(SwingConstants.CENTER);
		lblInGodWe.setForeground(Color.BLUE);
		lblInGodWe.setFont(new Font("Tahoma", Font.ITALIC, 22));
		heading.add(lblInGodWe);
		heading.add(lblDedonMotorsInventory);
		
		lblErrorMEssage = new JLabel("");
		lblErrorMEssage.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblErrorMEssage.setForeground(Color.RED);
		lblErrorMEssage.setBounds(296, 71, 618, 20);
		heading.add(lblErrorMEssage);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(85, 107, 47));
		panel.setBounds(0, 91, 291, 508);
		contentPane.add(panel);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblWelcome.setForeground(Color.MAGENTA);
		
		lblDashboard = new JLabel("Dashboard");
		//lblDashboard.setOpaque(true);
		lblDashboard.setBackground(new Color(85, 107, 47));
		lblDashboard.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				error = "";
				layeredPane.removeAll();
				layeredPane.add(dashBoardPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblDashboard.setForeground(Color.WHITE);
				lblProducts.setForeground(Color.GREEN);
				lblAccounts.setForeground(Color.GREEN);
				lblTransaction.setForeground(Color.GREEN);
			}
		});
		lblDashboard.setForeground(Color.WHITE);
		lblDashboard.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		lblProducts = new JLabel("Products");
		lblProducts.setBackground(new Color(85, 107, 47));
		//lblProducts.setOpaque(true);
		lblProducts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				error = "";
				layeredPane.removeAll();
				layeredPane.add(productsPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblDashboard.setForeground(Color.GREEN);
				lblProducts.setForeground(Color.WHITE);
				lblAccounts.setForeground(Color.GREEN);
				lblTransaction.setForeground(Color.GREEN);
				
				refreshProductTable();
			}
		});
		lblProducts.setForeground(Color.GREEN);
		lblProducts.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		lblTransaction = new JLabel("Transactions");
		//lblTransaction.setOpaque(true);
		lblTransaction.setBackground(new Color(85, 107, 47));
		lblTransaction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				error = "";
				layeredPane.removeAll();
				layeredPane.add(transactionsPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblDashboard.setForeground(Color.GREEN);
				lblProducts.setForeground(Color.GREEN);
				lblAccounts.setForeground(Color.GREEN);
				lblTransaction.setForeground(Color.white);
				
				refreshTransactionPanel();
			}
		});
		lblTransaction.setForeground(Color.GREEN);
		lblTransaction.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		lblAccounts = new JLabel("Accounts");
		//lblAccounts.setOpaque(true);
		//lblAccounts.setBackground(new Color(85, 107, 47));
		lblAccounts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				error = "";
				layeredPane.removeAll();
				layeredPane.add(accountsPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblDashboard.setForeground(Color.GREEN);
				lblProducts.setForeground(Color.GREEN);
				lblAccounts.setForeground(Color.WHITE);
				lblTransaction.setForeground(Color.GREEN);
				
				refreshCustomerPanel();
			}
		});
		lblAccounts.setForeground(Color.GREEN);
		lblAccounts.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ImsResource.save(ImsApplication.getIms());
				} catch (InvalidInputException e1) {
					error = e1.getMessage();
				}
				refreshProductPanel();
			}
		});
		btnSave.setForeground(new Color(255, 0, 255));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnSave.setBorder(new LineBorder(new Color(0, 0, 255)));
		
		btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(ImsApplication.getFrame(), 
						"Do you really want to log out?", "Logout confirmation.", 
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (option == 0) {
					try {
						ImsController.logout();
						LoginPage frame = new LoginPage();
						frame.setVisible(true);
						ImsApplication.getFrame().setVisible(false);
						ImsApplication.setFrame(frame);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnLogout.setBorder(new LineBorder(new Color(0, 0, 255)));
		btnLogout.setForeground(new Color(255, 0, 255));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 24));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblProducts, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(lblDashboard, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
							.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(btnLogout)
										.addGap(18)
										.addComponent(btnSave))
									.addComponent(lblTransaction, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblAccounts, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblWelcome, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE))
								.addGap(16)))))
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
					.addGap(50)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLogout)
						.addComponent(btnSave))
					.addGap(116))
		);
		panel.setLayout(gl_panel);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(293, 90, 830, 509);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		dashBoardPanel = new JPanel();
		layeredPane.add(dashBoardPanel, "name_866715194326100");
		
		JTextArea txtrWarmlyWelcomeTo = new JTextArea();
		txtrWarmlyWelcomeTo.setForeground(new Color(128, 128, 0));
		txtrWarmlyWelcomeTo.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtrWarmlyWelcomeTo.setText("Warmly welcome to De Don Motors Inventory \r\nManagement Application. Please, feel free explore \r\nand thoroughly test the app and get to me with the\r\n comhrehensive feed back including bugs!");
		GroupLayout gl_dashBoardPanel = new GroupLayout(dashBoardPanel);
		gl_dashBoardPanel.setHorizontalGroup(
			gl_dashBoardPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_dashBoardPanel.createSequentialGroup()
					.addGap(59)
					.addComponent(txtrWarmlyWelcomeTo, GroupLayout.PREFERRED_SIZE, 639, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(132, Short.MAX_VALUE))
		);
		gl_dashBoardPanel.setVerticalGroup(
			gl_dashBoardPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_dashBoardPanel.createSequentialGroup()
					.addGap(65)
					.addComponent(txtrWarmlyWelcomeTo, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(190, Short.MAX_VALUE))
		);
		dashBoardPanel.setLayout(gl_dashBoardPanel);
		
		productsPanel = new JPanel();
		layeredPane.add(productsPanel, "name_866723336924500");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 255)));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblClickEachColumn = new JLabel("Click each column to sort the items");
		lblClickEachColumn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_productsPanel = new GroupLayout(productsPanel);
		gl_productsPanel.setHorizontalGroup(
			gl_productsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_productsPanel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_productsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblClickEachColumn, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		gl_productsPanel.setVerticalGroup(
			gl_productsPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
				.addGroup(gl_productsPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(lblClickEachColumn, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		tableProducts = new JTable();
		tableProducts.setAutoCreateRowSorter(true);
		tableProducts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		tableProducts.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Price", "Quantity"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				String.class, Float.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tableProducts);
		
		JLabel lblNewLabel = new JLabel("Add Product");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 24));
		lblNewLabel.setBounds(73, 18, 158, 20);
		
		textFieldProductName = new JTextField();
		textFieldProductName.setBounds(88, 54, 200, 26);
		textFieldProductName.setBorder(new LineBorder(new Color(0, 0, 255)));
		textFieldProductName.setColumns(10);
		
		textFieldProductPrice = new JTextField();
		textFieldProductPrice.setBorder(new LineBorder(new Color(0, 0, 255)));
		textFieldProductPrice.setBounds(88, 98, 200, 26);
		textFieldProductPrice.setColumns(10);
		
		textFieldProductQuantity = new JTextField();
		textFieldProductQuantity.setBorder(new LineBorder(new Color(0, 0, 255)));
		textFieldProductQuantity.setBounds(88, 142, 200, 26);
		textFieldProductQuantity.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(13, 57, 41, 20);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(13, 101, 34, 20);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setBounds(13, 145, 60, 20);
		
		JButton btnAddProduct = new JButton("ADD PRODUCT");
		btnAddProduct.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		btnAddProduct.setBounds(88, 177, 143, 29);
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
					quantity = Integer.parseInt(textFieldProductQuantity.getText());
				}
				catch (NumberFormatException e) {
					error = error + "Quantity figure needs to be a integer value! ";
				}
				
				String name = textFieldProductName.getText();
				
				error.trim();
				
				if (error.length() == 0) {
					try {
						//ImsProductController.createProduct(name, price, quantity);
						ImsProductController.callCreateProduct();
					} catch (InvalidInputException e) {
						error = e.getMessage();
					}
				}
				
				refreshProductPanel();
				refreshProductTable();
			}
		});
		panel_1.setLayout(null);
		panel_1.add(lblNewLabel);
		panel_1.add(lblNewLabel_1);
		panel_1.add(lblPrice);
		panel_1.add(lblNewLabel_2);
		panel_1.add(btnAddProduct);
		panel_1.add(textFieldProductQuantity);
		panel_1.add(textFieldProductPrice);
		panel_1.add(textFieldProductName);
		
		JLabel lblUpdateProduct = new JLabel("Products");
		lblUpdateProduct.setForeground(new Color(0, 128, 0));
		lblUpdateProduct.setFont(new Font("Segoe UI Symbol", Font.BOLD, 24));
		lblUpdateProduct.setBounds(94, 242, 158, 29);
		panel_1.add(lblUpdateProduct);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 255));
		separator_1.setBounds(0, 230, 324, 20);
		panel_1.add(separator_1);
		
		comboBoxProduct = new JComboBox<String>();
		comboBoxProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				error = "";
				int selectedIndex = comboBoxProduct.getSelectedIndex();
				String productName = products.get(selectedIndex);
				if (productName != null) {
					for (TOProduct p : ImsProductController.getProducts()) {
						if (productName.equals(p.getName())) {
							textFieldUpdateProductName.setText(productName);
							textFieldUpdateProductPrice.setText(""+p.getItemPrice());
							textFieldUpdateProductQuantity.setText(""+p.getQuantity());
						}
					}
				}
			}
		});
		comboBoxProduct.setBorder(new LineBorder(new Color(0, 0, 255)));
		comboBoxProduct.setBounds(88, 277, 200, 26);
		panel_1.add(comboBoxProduct);
		
		textFieldUpdateProductName = new JTextField();
		textFieldUpdateProductName.setBorder(new LineBorder(new Color(0, 0, 255)));
		textFieldUpdateProductName.setBounds(88, 319, 200, 26);
		panel_1.add(textFieldUpdateProductName);
		textFieldUpdateProductName.setColumns(10);
		
		textFieldUpdateProductPrice = new JTextField();
		textFieldUpdateProductPrice.setBorder(new LineBorder(new Color(0, 0, 255)));
		textFieldUpdateProductPrice.setBounds(88, 361, 200, 26);
		panel_1.add(textFieldUpdateProductPrice);
		textFieldUpdateProductPrice.setColumns(10);
		
		textFieldUpdateProductQuantity = new JTextField();
		textFieldUpdateProductQuantity.setBorder(new LineBorder(new Color(0, 0, 255)));
		textFieldUpdateProductQuantity.setBounds(88, 403, 200, 26);
		panel_1.add(textFieldUpdateProductQuantity);
		textFieldUpdateProductQuantity.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Product");
		lblNewLabel_3.setBounds(13, 280, 69, 20);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setBounds(13, 322, 69, 20);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblPrice_1 = new JLabel("Price");
		lblPrice_1.setBounds(13, 364, 69, 20);
		panel_1.add(lblPrice_1);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(13, 409, 69, 20);
		panel_1.add(lblQuantity);
		
		JButton btnUpdateProduct = new JButton("UPDATE");
		btnUpdateProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				error = "";
				float updatePrice = 0;
				try {
					updatePrice = Float.parseFloat(textFieldUpdateProductPrice.getText());
				}
				catch (NumberFormatException e) {
					error = "Price figure needs to be a numerical value! ";
				}
				int updateQuantity = 0;
				try {
					updateQuantity = Integer.parseInt(textFieldUpdateProductQuantity.getText());
				}
				catch (NumberFormatException e) {
					error = error + "Quantity figure needs to be a integer value! ";
				}
				
				String newName = textFieldUpdateProductName.getText();
				
				try {
					int selectedIndex = comboBoxProduct.getSelectedIndex();
					String oldName = products.get(selectedIndex);
					ImsProductController.updateProductPrice(oldName, updatePrice);
					ImsProductController.updateProductQuantity(oldName, updateQuantity);
					ImsProductController.updateProductName(oldName, newName);
				} catch (InvalidInputException e) {
					error = e.getMessage();
				}
				refreshProductTable();
				refreshProductPanel();
			}
		});
		btnUpdateProduct.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		btnUpdateProduct.setBounds(88, 437, 102, 29);
		panel_1.add(btnUpdateProduct);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				error = "";
				int selectedIndex = comboBoxProduct.getSelectedIndex();
				String productName = products.get(selectedIndex);
				try {
					ImsProductController.deleteProduct(productName);
				} catch (InvalidInputException er) {
					error = er.getMessage();
				}
				refreshProductPanel();
				refreshProductTable();
			}
		});
		btnDelete.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		btnDelete.setBounds(199, 437, 89, 29);
		panel_1.add(btnDelete);
		productsPanel.setLayout(gl_productsPanel);
		
		transactionsPanel = new JPanel();
		layeredPane.add(transactionsPanel, "name_866726102302000");
		transactionsPanel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 321, 509);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 255)));
		transactionsPanel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCustomerId_1 = new JLabel("Customer ID");
		lblCustomerId_1.setBounds(15, 31, 98, 20);
		panel_3.add(lblCustomerId_1);
		
		textFieldTransactionCustomerID = new JTextField();
		textFieldTransactionCustomerID.setBounds(128, 28, 178, 26);
		panel_3.add(textFieldTransactionCustomerID);
		textFieldTransactionCustomerID.setColumns(10);
		
		JButton btnOk = new JButton("SIGN IN");
		btnOk.setBorder(new LineBorder(new Color(128, 0, 0)));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				error = "";
				String customerID = textFieldTransactionCustomerID.getText();
				if (customerID.trim().length() < 0) {
					error = "Please enter the customer ID.";
				}
				if (error.length() == 0) {
					try {
						ImsTransactionController.createTransaction(customerID, 
								ImsApplication.getCurrentEmployee().getUserName());
						String cName = ImsApplication.getCurrentCustomer().getPerson().getName();
						lblCurrentCustomer.setText(cName);
					} catch (InvalidInputException e) {
						error = e.getMessage();
					}
				}
				refreshTransactionPanel();
			}
		});
		btnOk.setBounds(128, 61, 80, 29);
		panel_3.add(btnOk);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 101, 321, 10);
		panel_3.add(separator_3);
		
		JLabel lblAddProductsFor = new JLabel("Add Products for Purchase");
		lblAddProductsFor.setBounds(15, 127, 193, 20);
		panel_3.add(lblAddProductsFor);
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setBounds(15, 178, 69, 20);
		panel_3.add(lblProduct);
		
		comboBoxTransactionProduct = new JComboBox<String>();
		comboBoxTransactionProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				error = "";
				int selectedIndex = comboBoxTransactionProduct.getSelectedIndex();
				String productName = transactionProducts.get(selectedIndex);
				if (selectedIndex > 0) {
					for (TOProduct p : ImsProductController.getProducts()) {
						if (p.getName().equals(productName)) {
							lblItemPrice.setText(""+p.getItemPrice());
						}
					}
				}
			}
		});
		comboBoxTransactionProduct.setBounds(128, 175, 178, 26);
		panel_3.add(comboBoxTransactionProduct);
		
		JLabel lblQuantity_1 = new JLabel("Quantity");
		lblQuantity_1.setBounds(15, 226, 69, 20);
		panel_3.add(lblQuantity_1);
		
		textFieldTransactionProductQuantity = new JTextField();
		textFieldTransactionProductQuantity.setBounds(128, 223, 178, 26);
		panel_3.add(textFieldTransactionProductQuantity);
		textFieldTransactionProductQuantity.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBorder(new LineBorder(new Color(128, 0, 0)));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				error = "";
				int selectedIndex = comboBoxTransactionProduct.getSelectedIndex();
				int quantity = 0; 
				if (selectedIndex < 0) {
					error = "Product needs to be selected for transaction";
				} 
				try {
					quantity = Integer.parseInt(textFieldTransactionProductQuantity.getText());
				}
				catch (NumberFormatException e) {
					error = "Quantity number needs to be a numerical value! ";
				}
				if (error.length() == 0) {
					String productName = transactionProducts.get(selectedIndex);
					int option = JOptionPane.showConfirmDialog(ImsApplication.getFrame(), 
							"Confirm to add "+productName+"("+quantity+")", 
							"Confirm adding product", JOptionPane.OK_CANCEL_OPTION);
					if (option == 0) {
						try {
							ImsTransactionController.addTransactionProduct(productName, quantity);
						} catch (InvalidInputException e1) {
							error = e1.getMessage();
						}
					}
				} 
				refreshTransactionPanel();
				refreshTransactionTable();
			}
		});
		btnAdd.setBounds(128, 265, 115, 29);
		panel_3.add(btnAdd);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 309, 321, 10);
		panel_3.add(separator_4);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBorder(new LineBorder(new Color(128, 0, 0)));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				error = "";
				float amountPaid = 0;
				if (ImsApplication.getCurrentCustomer() == null) {
					error = "There is no custonmer logged in.";
				}
				try {
					amountPaid = Float.parseFloat(textFieldAmountPaid.getText());
				}
				catch (NumberFormatException e) {
					error = "Amount needs to be a numerical value! ";
				}
				if (error.length() == 0) {
					try {
						int option = JOptionPane.showConfirmDialog(ImsApplication.getFrame(), "Confirm submission?", 
								"Submission status", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
						if (option == 0) {
							Receipt receipt = ImsTransactionController.purchase(amountPaid);
							showReceipt(receipt);
							ImsApplication.setCurrentCustomer(null);
							lblCurrentCustomer.setText("");
						}
					} catch (InvalidInputException e1) {
						error = e1.getMessage();
					}
				}
				refreshTransactionPanel();
			}
		});
		btnSubmit.setBounds(128, 380, 115, 29);
		panel_3.add(btnSubmit);
		
		JLabel lblAmoundpaid = new JLabel("AmoundPaid");
		lblAmoundpaid.setBounds(15, 335, 115, 20);
		panel_3.add(lblAmoundpaid);
		
		textFieldAmountPaid = new JTextField();
		textFieldAmountPaid.setBounds(128, 335, 178, 26);
		panel_3.add(textFieldAmountPaid);
		textFieldAmountPaid.setColumns(10);
		
		lblItemPrice = new JLabel("");
		lblItemPrice.setForeground(new Color(0, 0, 255));
		lblItemPrice.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblItemPrice.setBounds(208, 127, 98, 32);
		panel_3.add(lblItemPrice);
		
		JButton btnSignOut = new JButton("SIGN OUT");
		btnSignOut.setBorder(new LineBorder(new Color(128, 0, 0)));
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(ImsApplication.getFrame(), 
						"Have you submitted or cleared the transaction?", "Logout confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
				if(option == 0) {
					ImsApplication.setCurrentCustomer(null);
					ImsApplication.setCurrentTransaction(null);
					JOptionPane.showMessageDialog(ImsApplication.getFrame(), "Successfully logged out.");
					lblCurrentCustomer.setText("");
				}
				refreshTransactionPanel();	
			}
		});
		btnSignOut.setBounds(215, 61, 91, 29);
		panel_3.add(btnSignOut);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBorder(new LineBorder(new Color(128, 0, 0)));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				error = "";
				if (ImsApplication.getCurrentCustomer() == null) {
					error = "There is no custonmer logged in.";
				}
				if (error.length() == 0) {
					int option = JOptionPane.showConfirmDialog(ImsApplication.getFrame(), 
							"Do you really want to clear the selection?", 
							"CLear status", JOptionPane.YES_NO_CANCEL_OPTION);
					if (option == 0) {
						try {
							ImsTransactionController.clearTransactionSelections();
						} catch (InvalidInputException e1) {
							error = e1.getMessage();
						}
					}
					refreshTransactionPanel();
					refreshTransactionTable();
				}
				
			}
		});
		btnClear.setBounds(128, 456, 115, 29);
		panel_3.add(btnClear);
		
		lblCurrentCustomer = new JLabel("");
		lblCurrentCustomer.setForeground(new Color(128, 128, 128));
		lblCurrentCustomer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCurrentCustomer.setBounds(128, 0, 178, 20);
		panel_3.add(lblCurrentCustomer);
		
		JButton btnShowReceipt = new JButton("SHOW RECEIPT");
		btnShowReceipt.setBorder(new LineBorder(new Color(128, 0, 0)));
		btnShowReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				error = "";
				if (ImsApplication.getCurrentCustomer() == null) {
					error = "There is no custonmer logged in.";
				}
				if (error.length() == 0) {
					try {
						Receipt receipt = ImsTransactionController.purchase();
						showReceipt(receipt);
					} catch (InvalidInputException e1) {
						error = e1.getMessage();
					}
				}
				
				refreshTransactionPanel();
			}
		});
		btnShowReceipt.setBounds(128, 422, 115, 29);
		panel_3.add(btnShowReceipt);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		scrollPane_1.setBounds(336, 0, 479, 454);
		transactionsPanel.add(scrollPane_1);
		
		tableTransaction = new JTable();
		tableTransaction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) tableTransaction.getModel();
				int selectedRow = tableTransaction.getSelectedRow();
				
				productTransactionName = model.getValueAt(selectedRow, 0).toString();
				String quantity = model.getValueAt(selectedRow, 1).toString();
				textFieldUpdateQuantity.setText(quantity);
			}
		});
		tableTransaction.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "QUANTITY", "UNIT PRICE", "AMOUNT"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Float.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(tableTransaction);
		
		JButton btnUpdateQuantity = new JButton("Update");
		btnUpdateQuantity.setBorder(new LineBorder(new Color(128, 0, 0)));
		btnUpdateQuantity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				error = "";
				int quantity = 0;
				try {
					quantity = Integer.parseInt(textFieldUpdateQuantity.getText());
				}
				catch (NumberFormatException e) {
					error = "Quantity figure needs to be a numerical value! ";
				}
				error.trim();
				if (error.length() == 0) {
					try {
						ImsTransactionController.updateQuantityTransaction(productTransactionName, quantity);
					} catch (InvalidInputException e) {
						error = e.getMessage();
					}
				}
				refreshTransactionTable();
			}
		});
		btnUpdateQuantity.setBounds(470, 464, 111, 29);
		transactionsPanel.add(btnUpdateQuantity);
		
		textFieldUpdateQuantity = new JTextField();
		textFieldUpdateQuantity.setBounds(596, 465, 102, 26);
		transactionsPanel.add(textFieldUpdateQuantity);
		textFieldUpdateQuantity.setColumns(10);
		
		lblTotalAmount = new JLabel("");
		lblTotalAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotalAmount.setBounds(713, 468, 102, 20);
		transactionsPanel.add(lblTotalAmount);
		
		JButton btnRemove = new JButton("REMOVE");
		btnRemove.setBorder(new LineBorder(new Color(128, 0, 0)));
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				error = "";
				try {
					ImsTransactionController.deleteProductTransaction(productTransactionName);
				} catch (InvalidInputException e) {
					error = e.getMessage();
				}
				refreshTransactionTable();
			}
		});
		btnRemove.setBounds(336, 464, 111, 29);
		transactionsPanel.add(btnRemove);
		
		accountsPanel = new JPanel();
		layeredPane.add(accountsPanel, "name_866729209042000");
		accountsPanel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 255)));
		panel_2.setBounds(0, 0, 338, 493);
		accountsPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblRegisterCustomer = new JLabel("Register Customer");
		lblRegisterCustomer.setFont(new Font("Segoe UI Symbol", Font.BOLD, 24));
		lblRegisterCustomer.setForeground(new Color(0, 128, 0));
		lblRegisterCustomer.setBounds(62, 16, 231, 30);
		panel_2.add(lblRegisterCustomer);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(15, 62, 69, 20);
		panel_2.add(lblName);
		
		textFieldCustomerName = new JTextField();
		textFieldCustomerName.setBounds(131, 62, 192, 26);
		panel_2.add(textFieldCustomerName);
		textFieldCustomerName.setColumns(10);
		
		JLabel lblUserName = new JLabel("Customer ID");
		lblUserName.setBounds(15, 109, 90, 20);
		panel_2.add(lblUserName);
		
		textFieldCustomerID = new JTextField();
		textFieldCustomerID.setBounds(131, 104, 192, 26);
		panel_2.add(textFieldCustomerID);
		textFieldCustomerID.setColumns(10);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				error = "";
				String id = textFieldCustomerID.getText();
				String name = textFieldCustomerName.getText();
				try {
					ImsPersonController.createCustomer(id, name);
				} catch (InvalidInputException e) {
					error = e.getMessage();
				}
				refreshCustomerPanel();
			}
		});
		btnRegister.setBorder(new LineBorder(new Color(128, 0, 0)));
		btnRegister.setBounds(131, 150, 115, 29);
		panel_2.add(btnRegister);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 0, 255));
		separator_2.setBorder(null);
		separator_2.setBounds(0, 196, 338, 9);
		panel_2.add(separator_2);
		
		JLabel lblCustomerDetails = new JLabel("Customer Details");
		lblCustomerDetails.setForeground(new Color(0, 128, 0));
		lblCustomerDetails.setFont(new Font("Segoe UI Symbol", Font.BOLD, 24));
		lblCustomerDetails.setBounds(62, 210, 231, 30);
		panel_2.add(lblCustomerDetails);
		
		comboBoxCustomer = new JComboBox<String>();
		comboBoxCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				error = "";
				int index = comboBoxCustomer.getSelectedIndex();
				String selectedID = customers.get(index);
				List<TOCustomer> customers = ImsPersonController.getCustomers();
				for (TOCustomer c : customers) {
					if (c.getId().equals(selectedID)) {
						textFieldUpdateCustomerName.setText(c.getName());	
						textFieldUpdateCustomerID.setText(c.getId());
						refreshCustomerTable();
						countRefresh++;
						}
				}
				//refreshCustomerPanel();
			}
		});
		comboBoxCustomer.setBounds(131, 252, 192, 26);
		panel_2.add(comboBoxCustomer);
		
		JLabel lblCustomer = new JLabel("Customer");
		lblCustomer.setBounds(15, 256, 69, 20);
		panel_2.add(lblCustomer);
		
		textFieldUpdateCustomerName = new JTextField();
		textFieldUpdateCustomerName.setBounds(131, 294, 192, 26);
		panel_2.add(textFieldUpdateCustomerName);
		textFieldUpdateCustomerName.setColumns(10);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(15, 297, 69, 20);
		panel_2.add(lblName_1);
		
		textFieldUpdateCustomerID = new JTextField();
		textFieldUpdateCustomerID.setBounds(131, 336, 192, 26);
		panel_2.add(textFieldUpdateCustomerID);
		textFieldUpdateCustomerID.setColumns(10);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setBounds(15, 339, 101, 20);
		panel_2.add(lblCustomerId);
		
		JButton btnDelete_1 = new JButton("DELETE");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				error = "";
				int selectedIndex = comboBoxCustomer.getSelectedIndex();
				String id = customers.get(selectedIndex);
				try {
					ImsPersonController.deleteCustomer(id);
				} catch (InvalidInputException e1) {
					error = e1.getMessage();
				}
			}
		});
		btnDelete_1.setBorder(new LineBorder(new Color(128, 0, 0)));
		btnDelete_1.setBounds(233, 378, 90, 29);
		panel_2.add(btnDelete_1);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				error = "";
				String newID = textFieldUpdateCustomerID.getText();
				String newName = textFieldUpdateCustomerName.getText();
				
				int index = comboBoxCustomer.getSelectedIndex();
				String oldID = customers.get(index);
				try {
					ImsPersonController.upDateCustomerName(oldID, newName);
					ImsPersonController.upDateCustomerID(oldID, newID);
				} catch (InvalidInputException e1) {
					error = e1.getMessage();
				}
				refreshCustomerPanel();
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*error = "";
				String newID = textFieldUpdateCustomerID.getText();
				String newName = textFieldUpdateCustomerName.getText();
				
				int index = comboBoxCustomer.getSelectedIndex();
				String oldID = customers.get(index);
				try {
					ImsPersonController.upDateCustomerName(oldID, newName);
					ImsPersonController.upDateCustomerID(oldID, newID);
				} catch (InvalidInputException e1) {
					error = e1.getMessage();
				}
				refreshCustomerPanel();*/
			}
		});
		btnUpdate.setBorder(new LineBorder(new Color(128, 0, 0)));
		btnUpdate.setBounds(131, 378, 93, 29);
		panel_2.add(btnUpdate);
		
		JLabel lblTransactions = new JLabel("Transactions");
		lblTransactions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTransactions.setBounds(353, 16, 239, 20);
		accountsPanel.add(lblTransactions);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(353, 52, 433, 385);
		accountsPanel.add(scrollPane_3);
		
		tableCustomers = new JTable();
		tableCustomers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) tableCustomers.getModel();
				int selectedRow = tableCustomers.getSelectedRow();
				
				productIndex = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
				String amountPaid = model.getValueAt(selectedRow, 3).toString();
				textFieldCurrentPaid.setText(amountPaid);
			}
		});
		tableCustomers.setAutoCreateRowSorter(true);
		tableCustomers.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NO", "DATE", "TOTAL AMOUNT", "AMOUNT PAID", "BALANCE"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableCustomers.getColumnModel().getColumn(4).setResizable(false);
		scrollPane_3.setViewportView(tableCustomers);
		
		JButton btnUpdate_1 = new JButton("UPDATE");
		btnUpdate_1.setBorder(new LineBorder(new Color(128, 0, 0)));
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				error = "";
				if (textFieldUpdateCustomerID.getText().length() == 0) {
					error = "Please select a customer before the update.";
				}
				if (error.length() == 0) {
					try {
						String transactionID = customerTransactions.get(productIndex);
						float newAmount = Float.parseFloat(textFieldUpdatePaid.getText());
						ImsTransactionController.updateAmountPaidTransaction(transactionID, newAmount);
					} catch (InvalidInputException e) {
						error = e.getMessage();
					}
				}
				refreshCustomerTable();
			}
		});
		btnUpdate_1.setBounds(497, 473, 115, 20);
		accountsPanel.add(btnUpdate_1);
		
		textFieldCurrentPaid = new JTextField();
		textFieldCurrentPaid.setBounds(363, 448, 124, 20);
		accountsPanel.add(textFieldCurrentPaid);
		textFieldCurrentPaid.setColumns(10);
		
		lblTotalBalance = new JLabel("");
		lblTotalBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotalBalance.setBounds(644, 457, 105, 20);
		accountsPanel.add(lblTotalBalance);
		
		textFieldUpdatePaid = new JTextField();
		textFieldUpdatePaid.setBounds(497, 448, 115, 20);
		accountsPanel.add(textFieldUpdatePaid);
		textFieldUpdatePaid.setColumns(10);
		
		JLabel lblCurrentPaid = new JLabel("AMOUNT PAID");
		lblCurrentPaid.setBorder(new LineBorder(new Color(128, 0, 0)));
		lblCurrentPaid.setBounds(373, 476, 101, 14);
		accountsPanel.add(lblCurrentPaid);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(290, 312, 314, 11);
		contentPane.add(separator);
		
		receiptPanel = new JPanel();
		layeredPane.add(receiptPanel, "name_408138955056000");
		receiptPanel.setLayout(null);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					textArea.print();
				} catch (PrinterException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnPrint.setBounds(15, 36, 115, 29);
		receiptPanel.add(btnPrint);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(transactionsPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblDashboard.setBackground(new Color(85, 107, 47));
				lblProducts.setBackground(new Color(85, 107, 47));
				lblAccounts.setBackground(new Color(85, 107, 47));
				lblTransaction.setBackground(Color.LIGHT_GRAY);
			}
		});
		btnClose.setBounds(15, 89, 115, 29);
		receiptPanel.add(btnClose);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(169, 16, 632, 477);
		receiptPanel.add(scrollPane_2);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textArea.setEditable(false);
		scrollPane_2.setViewportView(textArea);
		
		refreshProductPanel();
		refreshCustomerPanel();
		refreshTransactionPanel();
		refreshTransactionTable();
	}
	
	private void refreshProductTable() {
		
		if (error == null || error.length() == 0) {
			List<TOProduct> products = ImsProductController.getProducts();
			DefaultTableModel model = (DefaultTableModel) tableProducts.getModel();
			model.setRowCount(0);
			for (TOProduct p : products) {
				model.addRow(new Object[] {p.getName(), p.getItemPrice(), p.getQuantity()});
			}
		}
		
	}
	
	private void refreshTransactionTable() {
		lblErrorMEssage.setText(error);
		if (error == null || error.length() == 0) {
			List<TOProductTransaction> products = ImsTransactionController.getTOProductTransaction();
			DefaultTableModel model = (DefaultTableModel) tableTransaction.getModel();
			model.setRowCount(0);
			for (TOProductTransaction tp : products) {
				model.addRow(new Object[] {tp.getProductName(), tp.getQuantity(), tp.getUnitPrice(), tp.getPrice()});
			}
			
			if (ImsApplication.getCurrentTransaction() != null) {
				lblTotalAmount.setText(""+ImsApplication.getCurrentTransaction()
				.getTotalAmount());
			}
			textFieldUpdateQuantity.setText("");
		}
		
	}
	
	private void refreshCustomerTable() {
		lblErrorMEssage.setText(error);
		
		if (error == null || error.length() == 0) {
			customerTransactions = new HashMap<Integer, String>();
			List<TOTransaction> toTransactions = 
					ImsTransactionController.getCustomerTransactions(textFieldUpdateCustomerID.getText());
			DefaultTableModel model = (DefaultTableModel) tableCustomers.getModel();
			model.setRowCount(0);
			//set the size and alignment of NO column
			TableColumnModel columnModel = tableCustomers.getColumnModel();
			columnModel.getColumn(0).setPreferredWidth(6);
			DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
			centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
			tableCustomers.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
			
			//set the alignment of balance column
			DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
			leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
			tableCustomers.getColumnModel().getColumn(4).setCellRenderer(leftRenderer);
			
			//set the alignment of the date column
			tableCustomers.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
			float totalBalance = 0.0f;
			if (countRefresh > 1) {
				productIndex = 1;
				for (TOTransaction tT : toTransactions) {
					Date date = tT.getDate();
					String cleanDate = date.toString();
					String truncateDate = cleanDate.substring(4, 10);
					truncateDate = truncateDate + " " + cleanDate.substring(24);
					model.addRow(new Object[] {productIndex, truncateDate, tT.getTotalAmount(), 
							tT.getAmountPaid(), tT.getBalance()});
					totalBalance = (float) (totalBalance + tT.getBalance());
					customerTransactions.put(productIndex, tT.getId());
					productIndex++;
				}
			}
			
			textFieldCurrentPaid.setText("");
			lblTotalBalance.setText(""+totalBalance);
			textFieldUpdatePaid.setText("");
		}
		
	}
	
	private void refreshProductPanel() {
		lblErrorMEssage.setText(error);
		
		if (error == null || error.length() == 0) {
			
			//populate product page with data
			//Add Product
			textFieldProductName.setText("");
			textFieldProductPrice.setText("");
			textFieldProductQuantity.setText("");
			
			//Update product
			products = new HashMap<Integer, String>();
			//comboBoxProduct.removeAll();
			int index = 0;
			List<String> names = new ArrayList<String>();
			names.clear();
			comboBoxProduct.removeAllItems();
			for (TOProduct p : ImsProductController.getProducts()) {
				names.add(p.getName());
			}
			Collections.sort(names);
			for (String name : names) {
				products.put(index, name);
				comboBoxProduct.addItem(name);
				index++;
			}
			comboBoxProduct.setSelectedIndex(-1);
			
			textFieldUpdateProductName.setText("");
			textFieldUpdateProductPrice.setText("");
			textFieldUpdateProductQuantity.setText("");
			
		}
	}
	
	private void refreshCustomerPanel() {
		lblErrorMEssage.setText(error);
		
		if (error == null || error.length() == 0) {
			
			//populate customer page with data
			textFieldCustomerName.setText("");
			textFieldCustomerID.setText("");
			
			//Update customer
			customers = new HashMap<Integer, String>();
			int index = 0;
			List<String> customerIDs = new ArrayList<String>();
			customerIDs.clear();
			comboBoxCustomer.removeAllItems();
			for (TOCustomer c : ImsPersonController.getCustomers()) {
				customerIDs.add(c.getId());
			}
			Collections.sort(customerIDs);
			for (String id : customerIDs) {
				customers.put(index, id);
				comboBoxCustomer.addItem(id);
				index++;
			}
			comboBoxCustomer.setSelectedIndex(-1);
			
			textFieldUpdateCustomerName.setText("");
			textFieldUpdateCustomerID.setText("");
			
		}
	}
	
	private void refreshTransactionPanel() {
		lblErrorMEssage.setText(error);
		
		if (error == null || error.length() == 0) {
			
			
			textFieldTransactionCustomerID.setText("");
			textFieldTransactionProductQuantity.setText("");
			textFieldAmountPaid.setText("");
			lblItemPrice.setText("");
			
			
			//Update transaction
			transactionProducts = new HashMap<Integer, String>();
			int index = 0;
			List<String> names = new ArrayList<String>();
			names.clear();
			comboBoxTransactionProduct.removeAllItems();
			for (TOProduct p : ImsProductController.getProducts()) {
				names.add(p.getName());
			}
			Collections.sort(names);
			for (String name : names) {
				transactionProducts.put(index, name);
				comboBoxTransactionProduct.addItem(name);
				index++;
			}
			comboBoxTransactionProduct.setSelectedIndex(-1);
			
		}
	}
	
	private void showReceipt(Receipt receipt) {
		textArea.setText("");
		textArea.setAlignmentX(CENTER_ALIGNMENT);
		
		textArea.append(" *****************************************************************\n");
		textArea.append("	DE DON MOTORS CO. L.T.D\n");
		textArea.append("	     IN GOD WE TRUST\n");
		textArea.append("	      LET LOVE LEAD\n");
		textArea.append("	            AVATA\n");
		textArea.append(" SOLE AGENT OF AVATA SPECIAL QUALITY AND DIAMON TIRES\n");
		textArea.append(" (Head Office: Techiman, B/A along Kintampo Road Before Toll Booth)\n");
		textArea.append(" Box 405 Wa. U.W/R Ghana\n");
		textArea.append(" Tel: 0243679200 / 0209380084 / 0202981814 / 0209784545 / 0553552147\n");
		textArea.append(" Branches:\n");
		textArea.append(" Wa Along Wa Poly Road   Kumasi Alaba Fulani Chief House\n");
		textArea.append(" Opposite Katori");
		textArea.append(" Tel: 0244485813 / 0246017637\n");
		textArea.append(" Kumasi Alaba Fulani Chief House\n");
		textArea.append(" Tel: 0551939054\n");
		textArea.append(" Email: dedon.motors@yahoo.com / dedonmotors@gmail.com\n");
		textArea.append(" *****************************************************************\n\n");
		
		textArea.setAlignmentY(LEFT_ALIGNMENT);
		textArea.append(" Customer Name: "+ ImsApplication.getCurrentCustomer().getPerson().getName()+"\n");
		String date = receipt.getDate().toString();
		date = date.substring(0, 10) + " " + date.substring(24);
		textArea.append(" Date: "+ date +"\n");
		textArea.append(" NO   ");
		textArea.append("NAME\t\t");
		textArea.append("QUANTITY\t");
		textArea.append("UNIT PRICE\t");
		textArea.append("AMOUNT\n");
		int count = 1;
		for (TOProductTransaction pTransaction : receipt.getPTransactions()) {
			textArea.append(" "+count+"   ");
			textArea.append(pTransaction.getProductName()+"\t");
			textArea.append(""+pTransaction.getQuantity()+"\t");
			textArea.append(""+pTransaction.getUnitPrice()+"\t");
			//textArea.append(""+pTransaction.getPrice() * pTransaction.getQuantity()+"\n\n");
			textArea.append(""+pTransaction.getPrice()+"\n");
			count++;
		}
		//textArea.setAlignmentY(RIGHT_ALIGNMENT);
		textArea.append(" \n*****************************************************************\n");
		textArea.append(" Total Amount : "+receipt.getTotalAmount() + "\n");
		textArea.append(" Amount Paid : "+receipt.getAmoundPaid()+ "\n");
		float balance = (float) (receipt.getTotalAmount() - receipt.getAmoundPaid());
		textArea.append(" Balance : "+balance+ "\n");
		
		layeredPane.removeAll();
		layeredPane.add(receiptPanel);
		layeredPane.repaint();
		layeredPane.revalidate();
		lblDashboard.setBackground(new Color(85, 107, 47));
		lblProducts.setBackground(new Color(85, 107, 47));
		lblAccounts.setBackground(new Color(85, 107, 47));
		lblTransaction.setBackground(new Color(85, 107, 47));
	}
}
