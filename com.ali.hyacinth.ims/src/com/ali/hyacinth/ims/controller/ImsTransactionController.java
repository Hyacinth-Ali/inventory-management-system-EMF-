package com.ali.hyacinth.ims.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.ali.hyacinth.ims.Customer;
import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsFactory;
import com.ali.hyacinth.ims.Manager;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.Transaction;
import com.ali.hyacinth.ims.TransactionItem;
import com.ali.hyacinth.ims.TransactionPrice;
import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.transferobjects.TOProduct;
import com.ali.hyacinth.ims.transferobjects.TOTransactionComplete;
import com.ali.hyacinth.ims.transferobjects.TOTransactionItem;
import com.ali.hyacinth.ims.transferobjects.TOTransactionPrice;

public class ImsTransactionController {
	
	/**
	 * Query method for list of a customer transactions.
	 * @param customer
	 * @return list of transactions
	 * @throws InvalidInputException 
	 */
	public static List<TOTransaction> getCustomerTransactions(String customerID) throws InvalidInputException {
		
		Customer customer = findCustomer(customerID);
		ArrayList<TOTransaction> transactions = new ArrayList<TOTransaction>();
		if (customer != null) {
			for (Transaction t : customer.getPerson().getPurchases()) {
				TOTransaction toTransaction = new TOTransaction(t.getDate(), 
						t.getTotalAmount(), t.getAmountPaid());
				transactions.add(toTransaction);
			}
		} else {
			throw new InvalidInputException("The customer does not exist.");
		}
		
		return transactions;
	}
	
	private static Customer findCustomer(String id) {
		Customer c = null;
		for (Customer customer : ImsApplication.getIms().getCustomers()) {
			if (id.equals(customer.getCustomerID())) {
				c = customer;
				break;
			}
		}
		return c;
	}
	
	private static Manager findManager(String userName) {
		Manager m = null;
		for (Manager manager : ImsApplication.getIms().getManagers()) {
			if (userName.equals(manager.getUserName())) {
				m = manager;
				break;
			}
		}
		return m;
	}
	
	private static Transaction findTransaction(String id) {
		Transaction transaction =null;
		for (Transaction t : ImsApplication.getIms().getTransactions()) {
			if (t.getId().equals(id)) {
				transaction = t;
				break;
			}
		}
		return transaction;
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
			error = "The customer does not exist, register first.";
		} else if (manager == null) {
			error = "You need a manager to create a transaction.";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		try {
			Transaction transaction = ImsFactory.eINSTANCE.createTransaction();
			transaction.setDate(date);
			transaction.setId(EcoreUtil.generateUUID());
			transaction.setBuyer(c.getPerson());
			transaction.setSeller(manager.getPerson());
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
	public static void addTransactionProduct(Transaction transaction, Product product, int quantity) throws InvalidInputException {
		String error = "";
		
		if (quantity <= 0) {
			error = "Quantity of items must be greater than zero.";
		}
		for (Product p : transaction.getProducts()) {
			if (p.equals(product)) {
				error = "The product has already been added to this transaction, modify instead.";
			}
		}
		
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		TransactionItem item = ImsFactory.eINSTANCE.createTransactionItem();
		item.setQuantity(quantity);
		TransactionPrice transactionPrice = ImsFactory.eINSTANCE.createTransactionPrice();
		transactionPrice.setPrice(product.getPrice() * product.getTransactionitem().getQuantity());
		product.setTransactionitem(item);
		product.setTransactionprice(transactionPrice);
		transaction.getProducts().add(product);
	}
	
	/**
	 * Deletes a transaction
	 * @param id of the transaction
	 * @throws InvalidInputException
	 */
	/*public static void deleteTransaction(String id) throws InvalidInputException{
		Transaction transaction = findTransaction(id);
		if (transaction != null) {
			try {
				EcoreUtil.delete(transaction, true);
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
		} else {
			throw new InvalidInputException("The transaction does not exist.");
		}
	}*/
	
	/**
	 * Set the value of the total amount of the transaction.
	 * @param id of the transaction.
	 * @throws InvalidInputException 
	 */
	private static void setTransactionTotalAmount(String id) throws InvalidInputException {
		Transaction transaction = findTransaction(id);
		float totalAmount = 0.0f;
		if (transaction != null) {
			for (Product product : transaction.getProducts()) {
				float amount = product.getTransactionprice().getPrice();
				totalAmount += amount;
			}
		} else {
			throw new InvalidInputException("The transaction does not exist.");
		}
		
		transaction.setTotalAmount(totalAmount);
	}
	
	/**
	 * Query method for first checkout details
	 * @param id of the transaction.
	 * @return the transaction
	 * @throws InvalidInputException
	 */
	public static TOTransaction firstCheckOut(String id) throws InvalidInputException {
		
		Transaction transaction = findTransaction(id);
		TOTransaction toTransaction = null;
		if (transaction != null) {
			setTransactionTotalAmount(id);
			toTransaction = new TOTransaction(transaction.getDate(), transaction.getTotalAmount(), 
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
	public static TOTransactionComplete purchase(String id, float amountPaid) throws InvalidInputException {
		Transaction transaction = findTransaction(id);
		TOTransactionComplete tComplete = null;
		if (transaction != null) {
			transaction.setAmountPaid(amountPaid);
			tComplete = new TOTransactionComplete();
			tComplete.setTotalAmount(transaction.getTotalAmount());
			tComplete.setAmoundPaid(transaction.getAmountPaid());
			tComplete.setDate(transaction.getDate());
			try {
				for (Product product : transaction.getProducts()) {
					TOProduct tProduct = new TOProduct();
					tProduct.setName(product.getName());
					tProduct.setItemPrice(product.getPrice());
					
					TOTransactionPrice tPrice = new TOTransactionPrice();
					tPrice.setPrice(product.getTransactionprice().getPrice());
					
					TOTransactionItem tItem = new TOTransactionItem();
					tItem.setQuantity(product.getTransactionitem().getQuantity());
					
					tProduct.setItem(tItem);
					tProduct.setPrice(tPrice);
					
					tComplete.addProduct(tProduct);
				}
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
		}
		
		return tComplete;
		
	}
	
	/**
	 * Deletes a transaction
	 * @param id of the transaction
	 * @throws InvalidInputException
	 */
	public static void deleteTransaction(String id) throws InvalidInputException {
		Transaction transaction = findTransaction(id);
		if (transaction != null) {
			try {
				for (Product product : transaction.getProducts()) {
					EcoreUtil.delete(product.getTransactionitem());
					EcoreUtil.delete(product.getTransactionprice());
				}
				EcoreUtil.delete(transaction, true);
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
		} else {
			throw new InvalidInputException("The transaction does not exist.");
		}
		
	}


}
