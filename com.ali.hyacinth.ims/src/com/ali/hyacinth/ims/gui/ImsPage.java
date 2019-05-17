package com.ali.hyacinth.ims.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.controller.ImsController;
import com.ali.hyacinth.ims.controller.ImsProductController;
import com.ali.hyacinth.ims.controller.InvalidInputException;
import com.ali.hyacinth.ims.resource.ImsResource;
import com.ali.hyacinth.ims.transferobjects.TOProduct;

import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ImsPage extends JFrame {
	
	private String error = "";

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
	private HashMap<Integer, String> products;
	private JTable tableProducts;
	private List<String> names = new ArrayList<String>();
	private JButton btnLogout;

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
		lblDashboard.setOpaque(true);
		lblDashboard.setBackground(new Color(85, 107, 47));
		lblDashboard.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(dashBoardPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblDashboard.setBackground(Color.LIGHT_GRAY);
				lblProducts.setBackground(new Color(85, 107, 47));
				lblAccounts.setBackground(new Color(85, 107, 47));
				lblTransaction.setBackground(new Color(85, 107, 47));
			}
		});
		lblDashboard.setForeground(Color.GREEN);
		lblDashboard.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		lblProducts = new JLabel("Products");
		lblProducts.setBackground(new Color(85, 107, 47));
		lblProducts.setOpaque(true);
		lblProducts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(productsPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblDashboard.setBackground(new Color(85, 107, 47));
				lblProducts.setBackground(Color.LIGHT_GRAY);
				lblAccounts.setBackground(new Color(85, 107, 47));
				lblTransaction.setBackground(new Color(85, 107, 47));
				
				refreshTable();
			}
		});
		lblProducts.setForeground(Color.GREEN);
		lblProducts.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		lblTransaction = new JLabel("Transactions");
		lblTransaction.setOpaque(true);
		lblTransaction.setBackground(new Color(85, 107, 47));
		lblTransaction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		lblTransaction.setForeground(Color.GREEN);
		lblTransaction.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		lblAccounts = new JLabel("Accounts");
		lblAccounts.setOpaque(true);
		lblAccounts.setBackground(new Color(85, 107, 47));
		lblAccounts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(accountsPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				lblDashboard.setBackground(new Color(85, 107, 47));
				lblProducts.setBackground(new Color(85, 107, 47));
				lblAccounts.setBackground(Color.LIGHT_GRAY);
				lblTransaction.setBackground(new Color(85, 107, 47));
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
		
		JLabel lblProductsPanel = new JLabel("Overview\r\n");
		GroupLayout gl_dashBoardPanel = new GroupLayout(dashBoardPanel);
		gl_dashBoardPanel.setHorizontalGroup(
			gl_dashBoardPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_dashBoardPanel.createSequentialGroup()
					.addGap(322)
					.addComponent(lblProductsPanel)
					.addContainerGap(439, Short.MAX_VALUE))
		);
		gl_dashBoardPanel.setVerticalGroup(
			gl_dashBoardPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_dashBoardPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblProductsPanel)
					.addContainerGap(473, Short.MAX_VALUE))
		);
		dashBoardPanel.setLayout(gl_dashBoardPanel);
		
		productsPanel = new JPanel();
		layeredPane.add(productsPanel, "name_866723336924500");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 255)));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_productsPanel = new GroupLayout(productsPanel);
		gl_productsPanel.setHorizontalGroup(
			gl_productsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_productsPanel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(42, Short.MAX_VALUE))
		);
		gl_productsPanel.setVerticalGroup(
			gl_productsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_productsPanel.createSequentialGroup()
					.addGap(16)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
		);
		
		tableProducts = new JTable();
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
						ImsProductController.createProduct(name, price, quantity);
					} catch (InvalidInputException e) {
						error = e.getMessage();
					}
				}
				
				refreshProductPanel();
				refreshTable();
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
				refreshTable();
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
				refreshTable();
			}
		});
		btnDelete.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		btnDelete.setBounds(199, 437, 89, 29);
		panel_1.add(btnDelete);
		productsPanel.setLayout(gl_productsPanel);
		
		transactionsPanel = new JPanel();
		layeredPane.add(transactionsPanel, "name_866726102302000");
		
		JLabel lblCustomerAccounts = new JLabel("Customer accounts");
		GroupLayout gl_transactionsPanel = new GroupLayout(transactionsPanel);
		gl_transactionsPanel.setHorizontalGroup(
			gl_transactionsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_transactionsPanel.createSequentialGroup()
					.addGap(318)
					.addComponent(lblCustomerAccounts)
					.addContainerGap(443, Short.MAX_VALUE))
		);
		gl_transactionsPanel.setVerticalGroup(
			gl_transactionsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_transactionsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCustomerAccounts)
					.addContainerGap(473, Short.MAX_VALUE))
		);
		transactionsPanel.setLayout(gl_transactionsPanel);
		
		accountsPanel = new JPanel();
		layeredPane.add(accountsPanel, "name_866729209042000");
		
		JLabel lblRegisterCustomers = new JLabel("Register Customers");
		GroupLayout gl_accountsPanel = new GroupLayout(accountsPanel);
		gl_accountsPanel.setHorizontalGroup(
			gl_accountsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_accountsPanel.createSequentialGroup()
					.addGap(337)
					.addComponent(lblRegisterCustomers)
					.addContainerGap(424, Short.MAX_VALUE))
		);
		gl_accountsPanel.setVerticalGroup(
			gl_accountsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_accountsPanel.createSequentialGroup()
					.addGap(28)
					.addComponent(lblRegisterCustomers)
					.addContainerGap(461, Short.MAX_VALUE))
		);
		accountsPanel.setLayout(gl_accountsPanel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(290, 312, 314, 11);
		contentPane.add(separator);
		
		tableProducts.setAutoCreateRowSorter(true);
		
		refreshProductPanel();
	}
	
	private void refreshTable() {
		
		if (error == null || error.length() == 0) {
			List<TOProduct> products = ImsProductController.getProducts();
			DefaultTableModel model = (DefaultTableModel) tableProducts.getModel();
			model.setRowCount(0);
			for (TOProduct p : products) {
				model.addRow(new Object[] {p.getName(), p.getItemPrice(), p.getQuantity()});
			}
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
			comboBoxProduct.removeAll();
			int index = 0;
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
}
