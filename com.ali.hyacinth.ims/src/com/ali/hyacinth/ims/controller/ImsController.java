package com.ali.hyacinth.ims.controller;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsFactory;
import com.ali.hyacinth.ims.Item;
import com.ali.hyacinth.ims.ItemStatus;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.resource.ImsResource;

public class ImsController {
	
	/******************************/
	//Product Controller Begin
	/******************************/
	/**
	 * Creates an instance of a product.
	 * @param name of the product.
	 * @param price of an item of the product
	 * @throws InvalidInputException and exception that can be thrown.
	 */
	public static void createProduct(String name, float price) throws InvalidInputException {
		String error = "";
		if (name == null || name.equals("")) {
			error = "the name of a product cannot be empty.";
		}
		if (price < 0) {
			error = "The price of a product cannot be negative.";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		IMS ims = ImsApplication.getIms();
		Product product = ImsFactory.eINSTANCE.createProduct();
		product.setName(name);
		product.setPrice(price);
		ims.getProducts().add(product);
		
		/**
		 * Save model
		 */
		ImsResource.save(ims);
	}
	
	/**
	 * Adds items to existing product for a new order.
	 * @param product to be added items
	 * @param quantity number of items
	 * @throws InvalidInputException
	 */
	public static void addProductItems(Product product, int quantity) throws InvalidInputException {
		String error = "";
		
		if (product == null) {
			error = "Please create the product before initializing the quantity";
		}
		if (quantity < 0) {
			error = "Quantity of product cannot be negative";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		for (int count = 1; count <= quantity; quantity++) {
			Item item = ImsFactory.eINSTANCE.createItem();
			item.setStatus(ItemStatus.ORDERED);
			product.getItems().add(item);
		}
	}
	
	/**
	 * Change the status of an item to sold during purchase.
	 * @param product of the items
	 * @param quantity of the items to be removed
	 * @throws InvalidInputException
	 *//*
	public static void removeProductItems(Product product, int quantity) throws InvalidInputException {
		int itemsInStore = product.getItems().size();
		//check that quantity in store is more than demanding quantities.
		if (quantity > itemsInStore) {
			throw new InvalidInputException("quantity of " + product.getName() + " is more than what we have inn store.");
		} else {
			for (Item item : product.getItems()) {
				if (quantity > 0) {
					try {
						product.removeItem(item);
						ImsPersistence.save(ImsApplication.getIms());
						quantity--;
					} catch (RuntimeException e) {
						throw new InvalidInputException(e.getMessage());
					}
				}
				
			}
		}
		
	}*/
	
	/**
	 * Delete an instance of a product.
	 * @param name of the product.
	 */
	public static void deleteProduct(String name) throws InvalidInputException {
		Product product = findProduct(name);
		if (product != null) {
			product.delete();
			try {
				ImsPersistence.save(ImsApplication.getIms());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
		}
		
	}
	
	/**
	 * Helper method for finding a product.
	 * @param name unique name of the product
	 * @return the product.
	 */
	private static Product findProduct(String name) {
		Product p = null;
		IMS ims = ImsApplication.getIms();
		for (Product prod : ims.getProducts()) {
			if (prod.getName().equals(name)) {
				p = prod;
				break;
			}
		}
		return p;
	}
	
	/**
	 * Query method to retrieve products in data.
	 * @return product list
	 */
	public static List<TOProduct> getProducts() {
		ArrayList<TOProduct> products = new ArrayList<TOProduct>();
		for (Product p : ImsApplication.getIms().getProducts()) {
			TOProduct toProduct = new TOProduct(p.getName(), p.getPrice());
			products.add(toProduct);
		}
		return products;
	}
	
	/**
	 * Updates product name.
	 * @param oldName to change.
	 * @param newName to set.
	 * @throws InvalidInputException
	 */
	public static void updateProductName(String oldName, String newName) throws InvalidInputException {
		Product product = findProduct(oldName);
		if (product != null) {
			try {
				product.setName(newName);
				ImsPersistence.save(ImsApplication.getIms());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		}
	}
	
	/**
	 * Updates product price.
	 * @param name of the product.
	 * @param newPrice new price of the product.
	 * @throws InvalidInputException
	 */
	public static void updateProductPrice(String name, double newPrice) throws InvalidInputException {
		Product product = findProduct(name);
		if (product != null) {
			try {
				product.setPrice(newPrice);
				ImsPersistence.save(ImsApplication.getIms());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		}
	}
	
	/******************************/
	//Product Controllers, End
	/******************************/
	
	/******************************/
	//Customer Controllers, Begin
	/******************************/
	
	/**
	 * Query method for Customer
	 * @return list of customers
	 */
	public static List<TOCustomer> getCustomers() {
		ArrayList<TOCustomer> customers = new ArrayList<TOCustomer>();
		for (User user : ImsApplication.getIms().getUsers()) {
			for (UserRole role : user.getRoles()) {
				if (role instanceof Customer) {
					Customer c = (Customer)role;
					TOCustomer toCustomer = new TOCustomer(c.getCustomerID(), user.getName());
					customers.add(toCustomer);
				}
			}
			
		}
		return customers;
	}
	
	/**
	 * Retrieve debt of a customer.
	 * @param id of the customer
	 * @return the amount of the debt
	 * @throws InvalidInputException
	 */
	public static double getCustomerDebt(String id) throws InvalidInputException {
		double amount = 0;
		Customer customer = findCustomer(id);
		if (customer != null) {
			for (Transaction transaction : customer.getTransactions()) {
				amount += transaction.getUnpaidAmount();
			}
		} else {
			throw new InvalidInputException("The customer does not exist.");
		}
		return amount;
		
	}
	
	/**
	 * Helper method for finding a customer.
	 * @param id of the customer.
	 * @return the customer.
	 */
	private static Customer findCustomer(String id) {
		Customer c = null;
		for (Customer customer : ImsApplication.getIms().getCustomers()) {
			if (id == customer.getCustomerID()) {
				c = customer;
				break;
			}
		}
		return c;
	}
	
	 /**
	  * Creates an instance of a customer
	  * @param customerID of the customer
	  * @param user associated with customer role.
	  * @throws InvalidInputException
	  */
	public static void createCustomer(String customerID, User user) throws InvalidInputException{
		IMS ims = ImsApplication.getIms();
		String error = "";
		
		if (customerID == null) {
			throw new InvalidInputException("The ID of a customer cannot be empty");
		}
		
		try {
			ims.addCustomer(user, customerID);
			ImsPersistence.save(ims);
		} catch (RuntimeException e) {
			error = e.getMessage();
			if (user.getRoles().size() > 0) {
				ImsController.deleteUser(user);
			}
			if (error.equals("Cannot create due to duplicate customerID")) {
				error = "A customer with the same ID already exist";
			}
			throw new InvalidInputException(error);
		}
		
	}
	
	/**
	 * Deletes object of a customer.
	 * @param id of the customer.
	 * @throws InvalidInputException
	 */
	public static void deleteCustomer(String id) throws InvalidInputException{
		
		Customer customer = findCustomer(id);
		if (customer != null) {
			customer.delete();
		}
		try {
			ImsPersistence.save(ImsApplication.getIms());
		} catch (RuntimeException e) {
			throw new InvalidInputException (e.getMessage());
		}
	}
	
	/**
	 * Updates the id of a customer.
	 * @param oldID of the customer.
	 * @param newID of the customer.
	 * @throws InvalidInputException
	 */
	public static void upDateCustomerID(String oldID, String newID) 
			throws InvalidInputException {
		Customer customer = findCustomer(oldID);
		if (customer != null) {
			try {
				customer.setCustomerID(newID);
				ImsPersistence.save(ImsApplication.getIms());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		} else {
			throw new InvalidInputException("The customer does not exist.");
		}
		
	}
	
	/**
	 * Updates the name of a customer
	 * @param id of the customer.
	 * @param newName of the customer
	 * @throws InvalidInputException
	 */
	public static void upDateCustomerName(String id, String newName) 
			throws InvalidInputException {
		Customer customer = findCustomer(id);
		if (customer != null) {
			try {
				customer.getUser().setName(newName);
				ImsPersistence.save(ImsApplication.getIms());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		} else {
			throw new InvalidInputException("The customer does not exist.");
		}
		
	}
	
	/******************************/
	//Customer Controllers, End
	/******************************/
	
	/*********************************/
	// User Controllers, Begin
	/**********************************/
 
	/**
	 * Delete instance of a user and all its roles
	 * @param user to be deleted
	 * @throws InvalidInputException
	 */
	public static void deleteUser(User user) throws InvalidInputException{
		try {
			user.delete();
			ImsPersistence.save(ImsApplication.getIms());
		} catch(RuntimeException e) {
			throw new InvalidInputException (e.getMessage());
		}
	}
	
	/**
	 * Creates object of a user
	 * @param name of the user
	 * @throws InvalidInputException
	 */
	public static void createUser(String name) throws InvalidInputException {
		
		IMS ims = ImsApplication.getIms();
		
		try {
			ims.addUser(name);
			ImsPersistence.save(ImsApplication.getIms());
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
	}
	
	/**
	 * Updates the name of a user.
	 * @param user whose name is to be updated
	 * @param newName
	 * @throws InvalidInputException
	 */
	public static void updateUser(User user, String newName) throws InvalidInputException {
		try {
			user.setName(newName);
			ImsPersistence.save(ImsApplication.getIms());
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
	}
	
	/*********************************/
	// User Controllers, End
	/**********************************/
	
	/*********************************/
	// Manager Controllers, Begin
	/**********************************/
	
	/**
	 * Query method for retrieving managers
	 * @return list of Manager
	 */
	public static List<TOManager> getManagers() {
		ArrayList<TOManager> managers = new ArrayList<TOManager>();
		for (User user : ImsApplication.getIms().getUsers()) {
			for (UserRole role : user.getRoles()) {
				if (role instanceof Manager) {
					Manager m = (Manager)role;
					TOManager toManager = new TOManager(m.getUser().getName(), m.getUserName(),
							m.getPassword());
					managers.add(toManager);
				}
			}
			
		}
		return managers;
	}
	
	/**
	 * Helper method for finding a manager.
	 * @param userName of the manager
	 * @return the manager
	 */
	private static Manager findManager(String userName) {
		Manager manager = null;
		for (Manager m : ImsApplication.getIms().getManagers()) {
			if (userName.equals(m.getUserName())) {
				manager = m;
				break;
			}
		}
		return manager;
	}
	
	 /**
	 * 
	 * @param name of the customer.
	 * @param id of the customer.
	 * @throws InvalidInputException throws an exception.
	 */
	
	/**
	 * Create an object of a Manager.
	 * @param userName of the manager
	 * @param password of the manager
	 * @param user to be associated with the manager.
	 * @throws InvalidInputException
	 */
	public static void createManager(String userName, String password, User user) throws InvalidInputException{
		IMS ims = ImsApplication.getIms();
		String error = "";
		
		if (userName == null || userName == "") {
			error = "The manager user name cannot be empty";
		} else if (password == null || password == "") {
			error = "You cannot create a manager with empty password";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		try {
			ims.addManager(user, userName, password);
			ImsPersistence.save(ims);
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
		
	}
	
	/**
	 * Deletes a manager from the system.
	 * @param userName of the manager
	 * @throws InvalidInputException
	 */
	public static void deleteManager(String userName) throws InvalidInputException{
		
		Manager manager = findManager(userName);
		if (manager != null) {
			manager.delete();
		}
		try {
			ImsPersistence.save(ImsApplication.getIms());
		} catch (RuntimeException e) {
			throw new InvalidInputException (e.getMessage());
		}
	}
	
	/**
	 * Updates the user name of a manager
	 * @param oldUserName of the manager
	 * @param newUserName of the manager
	 * @throws InvalidInputException
	 */
	public static void upDateManagerUserName(String oldUserName, String newUserName) 
			throws InvalidInputException {
		Manager manager = findManager(oldUserName);
		if (manager != null) {
			try {
				manager.setUserName(newUserName);
				ImsPersistence.save(ImsApplication.getIms());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		} else {
			throw new InvalidInputException("The customer does not exist.");
		}
		
	}
	
	/**
	 * Updates the password of a manager
	 * @param oldUserName of the manager
	 * @param newPassword of the manager
	 * @throws InvalidInputException
	 */
	public static void upDateManagerPassword(String oldUserName, String newPassword) 
			throws InvalidInputException {
		Manager manager = findManager(oldUserName);
		if (manager != null) {
			try {
				manager.setPassword(newPassword);
				ImsPersistence.save(ImsApplication.getIms());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		} else {
			throw new InvalidInputException("The customer does not exist.");
		}
		
	}
	
	/**
	 * Updates the name of a manager.
	 * @param oldUserName of the manager
	 * @param newName of the manager
	 * @throws InvalidInputException
	 */
	public static void upDateManagerName(String oldUserName, String newName) 
			throws InvalidInputException {
		Manager manager = findManager(oldUserName);
		if (manager != null) {
			try {
				manager.getUser().setName(newName);
				ImsPersistence.save(ImsApplication.getIms());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		} else {
			throw new InvalidInputException("The manager does not exist.");
		}
		
	}
	
	
	
	/*********************************/
	// Manager Controllers, End
	/**********************************/
	

	/*********************************/
	// Transaction Controllers Begin
	/**********************************/
	
	/**
	 * Query method for list of a customer transactions.
	 * @param customer
	 * @return list of transactions
	 */
	public static List<TOTransaction> getCustomerTransactions(Customer customer) {
		ArrayList<TOTransaction> transactions = new ArrayList<TOTransaction>();
		for (Transaction t : customer.getTransactions()) {
			TOTransaction toTransaction = new TOTransaction(t.getId(), t.getDate(), t.getTotalAmount());
			toTransaction.setAmountPaid(t.getAmountPaid());
			transactions.add(toTransaction);
		}
		return transactions;
	}
	
	
	
	private static Transaction findTransaction(int id) {
		Transaction t = null;
		for (Transaction transaction : ImsApplication.getIms().getTransactions()) {
			if (id == transaction.getId()) {
				t = transaction;
				break;
			}
		}
		return t;
	}
	
	
	/**
	 * Creates a transaction
	 * @param date of the transaction
	 * @param customerID of the buyer
	 * @param managerUserName of the seller
	 * @throws InvalidInputException
	 */
	public static void createTransaction(Date date, String customerID, String managerUserName) throws InvalidInputException {
		IMS ims = ImsApplication.getIms();
		Customer c = findCustomer(customerID);
		Manager manager = findManager(managerUserName);
		String error = "";
		
		if (c == null) {
			error = "You need a customer to create a transaction.";
		} else if (manager == null) {
			error = "You need a manager to create a transaction.";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		try {
			ims.addTransaction(date, c, manager);
			ImsPersistence.save(ims);
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
	}
	
	/**
	 * Add products for a transaction.
	 * @param transaction to be added products
	 * @param product to be added to a transaction.
	 * @throws InvalidInputException
	 */
	public static void addTransactionProduct(Transaction transaction, Product product) throws InvalidInputException {
		String error = "";
		for (Product p : transaction.getProducts()) {
			if (p.equals(product)) {
				error = "The product has already been added to this transaction.";
				break;
			}
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		} else {
			transaction.addProduct(product);
		}
	}
	
	/**
	 * Deletes a transaction
	 * @param id of the transaction
	 * @throws InvalidInputException
	 */
	public static void deleteTransaction(int id) throws InvalidInputException{
		Transaction transaction = findTransaction(id);
		if (transaction != null) {
			transaction.delete();
		}
		try {
			ImsPersistence.save(ImsApplication.getIms());
		} catch (RuntimeException e) {
			throw new InvalidInputException (e.getMessage());
		}
	}
	
	/**
	 * First checkout details
	 * @param transaction
	 */
	private static void setCheckoutValues(Transaction transaction) {
		for (Product product : transaction.getProducts()) {
			double totalAmount = product.getPrice() * product.getItems().size();
			transaction.setTotalAmount(totalAmount);
		}
	}
	
	/**
	 * Query method for first checkout details
	 * @param id of the transaction.
	 * @return the transaction
	 * @throws InvalidInputException
	 */
	public static TOTransaction firstCheckOut(int id) throws InvalidInputException {
		Transaction transaction = findTransaction(id);
		TOTransaction toTransaction = null;
		if (transaction != null) {
			setCheckoutValues(transaction);
			toTransaction = new TOTransaction(transaction.getId(), transaction.getDate(), 
					transaction.getTotalAmount());
		} else {
			throw new InvalidInputException("The transaction does not exist.");
		}
		return toTransaction;
		
	}
	
	/**
	 * Final step to purchase products
	 * @param transaction of the purchase
	 * @param amountPaid paid for the transaction
	 * @throws InvalidInputException
	 */
	public static void lastCheckOutPurchase(Transaction transaction, double amountPaid) throws InvalidInputException {
		try {
			for (Product product : transaction.getProducts()) {
				double totalAmount = product.getPrice() * product.getItems().size();
				transaction.setTotalAmount(totalAmount);
				transaction.setAmountPaid(amountPaid);
				ImsPersistence.save(ImsApplication.getIms());
			}
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
	}
	
	/**
	 * Clears selection of a transaction.
	 * @param transaction
	 * @throws InvalidInputException
	 */
	public static void clearSelection(Transaction transaction) throws InvalidInputException {
		try {
			transaction.getProducts().clear();
			ImsPersistence.save(ImsApplication.getIms());
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
		
	}
	
	/*********************************/
	// Transaction Controllers End
	/**********************************/

}
