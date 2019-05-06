package com.ali.hyacinth.ims.controller;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsFactory;
import com.ali.hyacinth.ims.Item;
import com.ali.hyacinth.ims.ItemStatus;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.resource.ImsResource;

public class ImsProductController {
	
	/**
	 * Creates an instance of a product.
	 * @param name of the product.
	 * @param price of an item of the product
	 * @throws InvalidInputException and exception that can be thrown.
	 */
	public static void createProduct(String name, float price) throws InvalidInputException {
		String error = "";
		if (name == null || name.equals("")) {
			error = "The name of a product cannot be empty.";
		}
		if (price < 0) {
			error = "The price of a product cannot be negative.";
		}
		if (price == 0) {
			error = "The price of a product cannot be zero";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		IMS ims = ImsApplication.getIms();
		for (Product p : ims.getProducts()) {
			if (p.getName().equals(name)) {
				throw new InvalidInputException("The product already exist.");
			}
		}
		try {
			Product product = ImsFactory.eINSTANCE.createProduct();
			product.setName(name);
			product.setPrice(price);
			ims.getProducts().add(product);
			ImsResource.save(ims);
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
		
	}
	
	/**
	 * Adds items to existing product for a new order.
	 * @param product to be added items
	 * @param quantity number of items
	 * @throws InvalidInputException
	 */
	public static void addOrderItems(Product product, int quantity) throws InvalidInputException {
		
		if (quantity < 0) {
			throw new InvalidInputException("Quantity of product cannot be negative");
		}
		try {
			for (int count = 1; count <= quantity; quantity++) {
				Item item = ImsFactory.eINSTANCE.createItem();
				//The default value anyway
				item.setStatus(ItemStatus.ORDERED);
				product.getItems().add(item);
			}
			ImsResource.save((IMS)product.eContainer());
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
		
	}
	
	/**
	 * Adds items to existing product items.
	 * @param product to be added items
	 * @param quantity number of items
	 * @throws InvalidInputException
	 */
	public static void addExistingItems(Product product, int quantity) throws InvalidInputException {
		
		if (quantity < 0) {
			throw new InvalidInputException("Quantity of product cannot be negative");
		}
		
		try {
			for (int count = 1; count <= quantity; quantity++) {
				Item item = ImsFactory.eINSTANCE.createItem();
				//The default value anyway
				item.setStatus(ItemStatus.IN_STORE);
				product.getItems().add(item);
			}
			ImsResource.save((IMS)product.eContainer());
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
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
			EcoreUtil.delete(product, true);
			try {
				ImsResource.save((ImsApplication.getIms()));
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
		} else {
			throw new InvalidInputException("The product does not exist.");
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
				ImsResource.save((IMS)product.eContainer());
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
	public static void updateProductPrice(String name, float newPrice) throws InvalidInputException {
		Product product = findProduct(name);
		if (product != null) {
			try {
				product.setPrice(newPrice);
				ImsResource.save((IMS)product.eContainer());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		}
	}
	
	/******************************/
	//Product Controllers, End
	/******************************/
	
	

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
