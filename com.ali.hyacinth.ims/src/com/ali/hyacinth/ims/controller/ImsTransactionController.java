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
import com.ali.hyacinth.ims.ProductTransaction;
import com.ali.hyacinth.ims.Transaction;
import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.transferobjects.Receipt;
import com.ali.hyacinth.ims.transferobjects.TOProduct;
import com.ali.hyacinth.ims.transferobjects.TOProductTransaction;

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
	public static void createTransaction(String customerID, String managerUserName) throws InvalidInputException {
		String error = "";
		//get the current date
		Date date = ImsApplication.getIms().getCurrentDate();
		
		if (customerID == null || customerID.length() == 0) {
			error = "Please, enter the customer ID.";
		}
		if (managerUserName == null || managerUserName.length() == 0) {
			error = "Select manager first.";
		}
		
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		IMS ims = ImsApplication.getIms();
		Customer c = findCustomer(customerID);
		Manager manager = findManager(managerUserName);		
		
		if (c == null) {
			error = "The customer does not exist, register first.";
		} else if (manager == null) {
			error = "You need a manager to create a transaction.";
		} else if (c.getPerson().equals(manager.getPerson())) {
			error = "The same person cannot be both seller and buyer.";
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
			ims.getTransactions().add(transaction);
			ImsApplication.setCurrentTransaction(transaction);
			ImsApplication.setCurrentCustomer(c);
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
	}
	
	/**
	 * Add products for a transaction, ensure that number of item in store is more than the required quantity
	 * before calling this method.
	 * @param transaction to be added products
	 * @param product to be added to a transaction.
	 * @throws InvalidInputException
	 */
	public static void addTransactionProduct(String productName, int quantity) throws InvalidInputException {
		String error = "";
		
		Product product = ImsProductController.findProduct(productName);
		Transaction transaction = ImsApplication.getCurrentTransaction();
		if (transaction == null) {
			error = "The customer ID must be enetered before adding oroducts.";
		} else if (quantity <= 0) {
			error = "Quantity of items must be greater than zero.";
		} else if (product == null) {
			error = "The product does not exist.";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		if(quantity > product.getQuantity()) {
			error = "Sorry! we do not have enough product in store.";
		} 
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		ProductTransaction productTransaction = ImsFactory.eINSTANCE.createProductTransaction();
		productTransaction.setProduct(product);
		productTransaction.setQuantity(quantity);
		productTransaction.setPrice(quantity * product.getItemPrice());
		transaction.getProducttransactions().add(productTransaction);
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
			for (ProductTransaction productTransaction : transaction.getProducttransactions()) {
				float amount = productTransaction.getPrice();
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
	/*public static TOTransaction firstCheckOut(String id) throws InvalidInputException {
		
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
		
	}*/
	
	/**
	 * Final step to purchase products, generate receipt.
	 * @param transaction of the purchase
	 * @param amountPaid paid for the transaction
	 * @throws InvalidInputException
	 */
	public static Receipt purchase(String id, float amountPaid) throws InvalidInputException {
		String error = "";
		if (id == null || id.length() == 0) {
			error = "Please select an exisiting transaction to check out.";
		} else if (amountPaid <= 0) {
			error = "The amount to pay cannot be zero or negative.";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		Transaction transaction = ImsApplication.getCurrentTransaction();
		Receipt receipt = null;
		if (transaction != null) {
			transaction.setAmountPaid(amountPaid);
			receipt = new Receipt();
			receipt.setTotalAmount(transaction.getTotalAmount());
			receipt.setAmoundPaid(transaction.getAmountPaid());
			receipt.setDate(transaction.getDate());
			try {
				for (ProductTransaction pTransaction : transaction.getProducttransactions()) {
					TOProduct toProduct = new TOProduct();
					toProduct.setName(pTransaction.getProduct().getName());
					toProduct.setItemPrice(pTransaction.getProduct().getItemPrice());
					
					TOProductTransaction toPTransaction = new TOProductTransaction(toProduct);
					toPTransaction.setPrice(pTransaction.getPrice());
					toPTransaction.setQuantity(pTransaction.getQuantity());
					
					receipt.addPTransaction(toPTransaction);
					
					pTransaction.getProduct().setQuantity(pTransaction.getProduct().getQuantity() - 
							pTransaction.getQuantity());
				}
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
		}
		
		return receipt;
		
	}
	
	/**
	 * Check out a transaction.
	 * @param transaction of the purchase
	 * @param amountPaid paid for the transaction
	 * @throws InvalidInputException
	 */
	public static Receipt checkout(String id) throws InvalidInputException {
		Transaction transaction = findTransaction(id);
		Receipt receipt = null;
		if (transaction != null) {
			receipt = new Receipt();
			float totalamount = 0.0f;
			try {
				for (ProductTransaction pTransaction : transaction.getProducttransactions()) {
					TOProduct toProduct = new TOProduct();
					toProduct.setName(pTransaction.getProduct().getName());
					toProduct.setItemPrice(pTransaction.getProduct().getItemPrice());
					
					TOProductTransaction toPTransaction = new TOProductTransaction(toProduct);
					toPTransaction.setPrice(pTransaction.getPrice());
					toPTransaction.setQuantity(pTransaction.getQuantity());
					
					receipt.addPTransaction(toPTransaction);
					
					totalamount += toPTransaction.getPrice();
				}
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			receipt.setTotalAmount(totalamount);
			receipt.setDate(transaction.getDate());
		}
		
		return receipt;
		
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
				for (ProductTransaction productTransaction : transaction.getProducttransactions()) {
					EcoreUtil.delete(productTransaction);
				}
				EcoreUtil.delete(transaction, true);
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
		} else {
			throw new InvalidInputException("The transaction does not exist.");
		}
		
	}
	
	public static void updateTransaction(String id, Product product, int quantity) throws InvalidInputException {
		Transaction transaction = findTransaction(id);
		
		if (transaction != null) {
			for (ProductTransaction productTransaction : transaction.getProducttransactions()) {
				if (productTransaction.getProduct().equals(product)) {
					productTransaction.setQuantity(quantity);
				}
			}
		} else {
			throw new InvalidInputException("The transaction does not exist.");
		}
		
		
	}


}
