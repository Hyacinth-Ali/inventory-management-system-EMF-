package com.ali.hyacinth.ims.controller;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.ali.hyacinth.ims.Customer;
import com.ali.hyacinth.ims.EmployeeRole;
import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsFactory;
import com.ali.hyacinth.ims.Manager;
import com.ali.hyacinth.ims.Person;
import com.ali.hyacinth.ims.PersonRole;
import com.ali.hyacinth.ims.Transaction;
import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.resource.ImsResource;


public class ImsPersonController {
	
	/******************************/
	//Customer Controllers, Begin
	/******************************/
	
	/**
	 * Query method for Customer
	 * @return list of customers
	 */
	public static List<TOCustomer> getCustomers() {
		ArrayList<TOCustomer> customers = new ArrayList<TOCustomer>();
		for (Person person : ImsApplication.getIms().getPersons()) {
			for (PersonRole role : person.getRoles()) {
				if (role instanceof Customer) {
					Customer c = (Customer)role;
					TOCustomer toCustomer = new TOCustomer(c.getCustomerID(), person.getName());
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
		float amount = 0;
		Customer customer = findCustomer(id);
		if (customer != null) {
			for (Transaction transaction : customer.getPerson().getPurchases()) {
				amount += transaction.getAmountUnpaid();
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
			if (id.equals(customer.getCustomerID())) {
				c = customer;
				break;
			}
		}
		return c;
	}
	
	 /**
	  * Creates an instance of a customer, this method is called when neither the person 
	  * nor customer exist.
	  * @param customerID of the customer
	  * @param person associated with customer role.
	  * @throws InvalidInputException
	  */
	public static void createCustomer(String customerID, String name) throws InvalidInputException{
		IMS ims = ImsApplication.getIms();
		Person person = null;
		Customer c = null;
		String error = "";
		
		if (customerID == null || customerID.length() == 0) {
			error = "The ID of a customer cannot be empty";
		}
		if (name == null || name.length() == 0) {
			error = "The name of a customer cannot be empty.";
		}
		if (!isCustomerIdUnique(customerID)) {
			error = "This id " + customerID + " already exist";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		try {
			person = ImsFactory.eINSTANCE.createPerson();
			person.setName(name);
			c = ImsFactory.eINSTANCE.createCustomer();
			c.setCustomerID(customerID);
			c.setPerson(person);
			ims.getPersons().add(person);
			ims.getCustomers().add(c);
			ImsResource.save(ims);
		} catch (RuntimeException e) {
			if (person != null) {
				EcoreUtil.delete(person, true);
			}
			if (c != null) {
				EcoreUtil.delete(c, true);
			}
			error = e.getMessage();
			throw new InvalidInputException(error);
		}
		
	}
	
	/**
	  * Adds customer to existing person
	  * @param customerID of the customer
	  * @param person associated with customer role.
	  * @throws InvalidInputException
	  */
	public static void addCustomer(String customerID, Person person) throws InvalidInputException{
		IMS ims = ImsApplication.getIms();
		Customer c = null;
		String error = "";
		
		if (customerID == null || customerID.length() == 0) {
			error = "The ID of a customer cannot be empty";
		} else if (!isCustomerIdUnique(customerID)) {
			error = "This id " + customerID + " already exist";
		} else {
			for (PersonRole role : person.getRoles()) {
				if (role instanceof Customer) {
					error = "This person already exist as a customer.";
				}
			}
		}
		
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		try {
			c = ImsFactory.eINSTANCE.createCustomer();
			c.setCustomerID(customerID);
			c.setPerson(person);
			ims.getCustomers().add(c);
			ImsResource.save(ims);
		} catch (RuntimeException e) {
			if (c != null) {
				EcoreUtil.delete(c, true);
			}
			error = e.getMessage();
			throw new InvalidInputException(error);
		}
		
	}
	/**
	 * Determine the uniqueness of a customer ID.
	 * @param id
	 * @return
	 */
	private static boolean isCustomerIdUnique(String id) {
		for (Customer c : ImsApplication.getIms().getCustomers()) {
			if (id.equals(c.getCustomerID())) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Deletes object of a customer.
	 * @param id of the customer.
	 * @throws InvalidInputException
	 */
	public static void deleteCustomer(String id) throws InvalidInputException{
		
		Customer customer = findCustomer(id);
		if (customer != null) {
			if (customer.getPerson().getRoles().size() == 1) {
				EcoreUtil.delete(customer.getPerson());
				EcoreUtil.delete(customer);
			} else {
				EcoreUtil.delete(customer);
			}
			
		} else {
			throw new InvalidInputException("The customer does not exist.");
		}
		try {
			ImsResource.save(ImsApplication.getIms());
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
		
		String error = "";
		if (oldID == null || oldID.length() == 0) {
			error = "The current ID cannot be empty";
		}
		if (newID == null || newID.length() == 0) {
			error = "The ID of a customer cannot be empty";
		}
		for (Customer c : ImsApplication.getIms().getCustomers()) {
			if (c.getCustomerID().equals(newID)) {
				error = "The customer ID already exist.";
			}
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		//find the customer
		Customer customer = findCustomer(oldID);
		//confirm that the customer exist
		if (customer != null) {
			try {
				customer.setCustomerID(newID);
				ImsResource.save(ImsApplication.getIms());
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
		
		String error = "";
		
		if (id == null || id.length() == 0) {
			error = "The current ID cannot be empty";
		}
		if (newName == null || newName.length() == 0) {
			error = "The name of a customer cannot be empty";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		Customer customer = findCustomer(id);
		
		if (customer != null) {
			try {
				customer.getPerson().setName(newName);
				ImsResource.save(ImsApplication.getIms());
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
	// Person Controllers, Begin
	/**********************************/
 
	/**
	 * Delete instance of a person and all its roles
	 * @param person to be deleted
	 * @throws InvalidInputException
	 */
	public static void deletePerson(Person person) throws InvalidInputException{
		try {
			EcoreUtil.delete(person);
			ImsResource.save(ImsApplication.getIms());
		} catch(RuntimeException e) {
			throw new InvalidInputException (e.getMessage());
		}
	}
	
	/**
	 * Creates object of a Person
	 * @param name of the person
	 * @throws InvalidInputException
	 */
	public static void createPerson(String name) throws InvalidInputException {
		
		if (name == null || name == "" ) {
			throw new InvalidInputException("The name of a person cannot be empty.");
		}
		IMS ims = ImsApplication.getIms();
		
		try {
			Person person = ImsFactory.eINSTANCE.createPerson();
			person.setName(name);
			ims.getPersons().add(person);
			ImsResource.save(ImsApplication.getIms());
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
	}
	
	/**
	 * Updates the name of a Person.
	 * @param person whose name is to be updated
	 * @param newName
	 * @throws InvalidInputException
	 */
	public static void updatePerson(Person person, String newName) throws InvalidInputException {
		
		if (newName == null || newName.length() == 0) {
			throw new InvalidInputException("The name of a person cannot be empty");
		}
		
		try {
			person.setName(newName);
			ImsResource.save(ImsApplication.getIms());
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
	}
	
	/*********************************/
	// Person Controllers, End
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
		for (Person person : ImsApplication.getIms().getPersons()) {
			for (PersonRole role : person.getRoles()) {
				if (role instanceof Manager) {
					Manager m = (Manager)role;
					TOManager toManager = new TOManager(m.getPerson().getName(),
							m.getUserName());
					managers.add(toManager);
				}
			}
			
		}
		return managers;
	}
	
	/**
	 * Helper method for finding a manager.
	 * @param personName of the manager
	 * @return the manager
	 */
	public static Manager findManager(String userName) {
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
	  * Adds manager to existing person
	  * @param customerID of the customer
	  * @param person associated with customer role.
	  * @throws InvalidInputException
	  */
	public static void addManager(String userName, String password, Person person) throws InvalidInputException{
		IMS ims = ImsApplication.getIms();
		Manager m = null;
		String error = "";
		
		if (userName == null || userName.length() == 0) {
			error = "The user name of a manager cannot be empty";
		}
		else if (password == null || password.length() == 0) {
			error = "The password of a manager cannot be empty";
		}
		else if (!isManagerUsernameUnique(userName)) {
			error = "This user name : " + userName + " already exist";
		} else {
			for (PersonRole role : person.getRoles()) {
				if (role instanceof Manager) {
					error = "This person already exist as a manger.";
				}
			}
		}
		
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		try {
			m = ImsFactory.eINSTANCE.createManager();
			m.setUserName(userName);
			m.setPassword(password);
			m.setPerson(person);
			ims.getManagers().add(m);
			ImsResource.save(ims);
		} catch (RuntimeException e) {
			if (m != null) {
				EcoreUtil.delete(m, true);
			}
			error = e.getMessage();
			throw new InvalidInputException(error);
		}
		
	}
	
	/**
	 * Determine the uniqueness of a manager username.
	 * @param userName
	 * @return 
	 */
	private static boolean isManagerUsernameUnique(String userName) {
		for (Manager m : ImsApplication.getIms().getManagers()) {
			if (userName.equals(m.getUserName())) {
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * Create an object of a Manager when the person does not exist.
	 * @param personName of the manager
	 * @param password of the manager
	 * @param person to be associated with the manager.
	 * @throws InvalidInputException
	 */
	public static void createManager(String name, String userName, String password) throws InvalidInputException{
		IMS ims = ImsApplication.getIms();
		EmployeeRole employee = ImsApplication.getCurrentEmployee();
		String error = "";
		Manager m = null;
		Person p = null;
		
		if (name == null || name.length() == 0) {
			error = "The name of a person cannot be empty.";
		} else if (password == null || password == "") {
			error = "You cannot create a manager with empty password.";
		} else if (userName == null || userName.length() == 0) {
			error = "The user name of a manager cannot be empty.";
		} else if (!isManagerUsernameUnique(userName)) {
			error = "The user name, " + userName + ",  already exist.";
		} else {
			if (employee != null) {
				error = "Cannot register a new employee while an employee is logged in.";
			}
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		try {
			p = ImsFactory.eINSTANCE.createPerson();
			p.setName(name);
			m = ImsFactory.eINSTANCE.createManager();
			m.setPassword(password);
			m.setUserName(userName);
			m.setPerson(p);
			ims.getPersons().add(p);
			ims.getManagers().add(m);
			ImsResource.save(ims);
		} catch (RuntimeException e) {
			if (p != null) {
				EcoreUtil.delete(p);
			}
			if (m != null) {
				EcoreUtil.delete(m);
			}
			throw new InvalidInputException(e.getMessage());
		}
		
	}
	
	/**
	 * Deletes a manager from the system.
	 * @param personName of the manager
	 * @throws InvalidInputException
	 */
	public static void deleteManager(String userName) throws InvalidInputException{
		
		Manager manager = findManager(userName);
		if (manager != null) {
			if (manager.getPerson().getRoles().size() == 1) {
				EcoreUtil.delete(manager.getPerson());
				EcoreUtil.delete(manager);
			} else {
				EcoreUtil.delete(manager);
			}
			
		} else {
			throw new InvalidInputException("The manager does not exist.");
		}
		try {
			ImsResource.save(ImsApplication.getIms());
		} catch (RuntimeException e) {
			throw new InvalidInputException (e.getMessage());
		}
	}
	
	/**
	 * Updates the name of a manager
	 * @param oldPersonName of the manager
	 * @param newPersonName of the manager
	 * @throws InvalidInputException
	 */
	public static void upDateManagerUsername(String oldUserName, String newUserName) 
			throws InvalidInputException {
		
		String error = "";
		
		if (oldUserName == null || oldUserName.length() == 0) {
			error = "The current user name of the manager cannot be empty";
		}
		if (newUserName == null || newUserName.length() == 0) {
			error = "The user name of a manager cannot be empty";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		Manager manager = findManager(oldUserName);
		if (manager != null) {
			try {
				manager.setUserName(newUserName);
				ImsResource.save(ImsApplication.getIms());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		} else {
			throw new InvalidInputException("The manager does not exist.");
		}
		
	}
	
	/**
	 * Updates the password of a manager
	 * @param oldPersonName of the manager
	 * @param newPassword of the manager
	 * @throws InvalidInputException
	 */
	public static void upDateManagerPassword(String userName, String newPassword) 
			throws InvalidInputException {
		String error = "";
		
		if (userName == null || userName.length() == 0) {
			error = "The current user name of the manager cannot be empty";
		}
		if (newPassword == null || newPassword.length() == 0) {
			error = "The password of a manager cannot be empty";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		Manager manager = findManager(userName);
		if (manager != null) {
			try {
				manager.setPassword(newPassword);
				ImsResource.save(ImsApplication.getIms());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		} else {
			throw new InvalidInputException("The manager does not exist.");
		}
		
	}
	
	/**
	 * Updates the name of a manager.
	 * @param oldPersonName of the manager
	 * @param newName of the manager
	 * @throws InvalidInputException
	 */
	public static void upDateManagerName(String userName, String newName) 
			throws InvalidInputException {
		
		String error = "";
		
		if (userName == null || userName.length() == 0) {
			error = "The current user name of the manager cannot be empty";
		}
		if (newName == null || newName.length() == 0) {
			error = "The name of a manager cannot be empty";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		Manager manager = findManager(userName);
		if (manager != null) {
			try {
				manager.getPerson().setName(newName);
				ImsResource.save(ImsApplication.getIms());
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

}
