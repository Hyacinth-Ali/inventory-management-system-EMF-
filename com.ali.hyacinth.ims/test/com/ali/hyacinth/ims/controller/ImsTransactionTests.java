package com.ali.hyacinth.ims.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.ali.hyacinth.ims.Customer;
import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.Manager;
import com.ali.hyacinth.ims.Person;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.resource.ImsResource;
import com.ali.hyacinth.ims.util.ImsResourceFactoryImpl;
import com.ali.hyacinth.ims.util.ResourceHelper;

class ImsTransactionTests {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// set the data base
		String filename = Constants.TEST_FILE_NAME;
		ImsResource.setFilename(filename);
				
		//Delete existing ims
		File fileToBeDeleted = new File(Constants.COMPLETE_FILE_PATH);
		fileToBeDeleted.delete();
				
		/**
		* Initialize ims package
		*/
		ImsPackage.eINSTANCE.eClass();
		
		/**
		* Set resource factory
		*/
		ResourceHelper.INSTANCE.addResourceFactory("ims", new ImsResourceFactoryImpl());
		        
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		ImsApplication.unloadIms();
	}

	@BeforeEach
	void setUp() throws Exception {
		// clear all data
		IMS ims = ImsApplication.getIms();
		Collection<? extends EObject> objects = ims.eContents();
		EcoreUtil.deleteAll(objects, true);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void testCreateTransactionSuccess() throws InvalidInputException {
		IMS ims = ImsApplication.getIms();
		String name = "john";
		String userName = "manager1";
		String password = "12456";
		String customerID = "customer1";
		String productName = "product";
		float totalAmount = 100f;
		float amountPaid = 100f;
		float amountUnpaid = 10f;
		String id = "_GnUEsHH6Eem3Hp-Jh3HlXg";
		float price = 45f;
		Date date = new Date();
		
		try {
			ImsPersonController.createPerson(name);
			ImsPersonController.createPerson(name);
			ImsPersonController.addManager(userName, password, ims.getPersons().get(0));
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(1));
			ImsProductController.createProduct(productName, price);
			ImsProductController.addExistingItems(ims.getProducts().get(0), 5);
		} catch (RuntimeException e) {
			fail();
		}
		
		Customer customer = ims.getCustomers().get(0);
		Manager manager = ims.getManagers().get(0);
		Product product = ims.getProducts().get(0);
		
		try {
			ImsTransactionController.createTransaction(date, customerID, userName);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check error
		//assertEquals("The price of a product cannot be negative.", error);
		// check no change in memory
		checkResultTransaction(customer, manager, product, ims, date, totalAmount, 
				amountPaid, id, amountUnpaid, 1, 0, 0);
	}
	
	@Test
	public void testCreateTransactionWrongCustomer() throws InvalidInputException {
		IMS ims = ImsApplication.getIms();
		String name = "john";
		String userName = "manager1";
		String password = "12456";
		String customerID = "customer1";
		String customerID2 = "12457896";
		String productName = "product";
		float totalAmount = 100f;
		float amountPaid = 100f;
		float amountUnpaid = 10f;
		String id = "_GnUEsHH6Eem3Hp-Jh3HlXg";
		float price = 45f;
		Date date = new Date();
		
		String error = "";
		
		try {
			ImsPersonController.createPerson(name);
			ImsPersonController.createPerson(name);
			ImsPersonController.addManager(userName, password, ims.getPersons().get(0));
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(1));
			ImsProductController.createProduct(productName, price);
			ImsProductController.addExistingItems(ims.getProducts().get(0), 5);
		} catch (RuntimeException e) {
			fail();
		}
		
		Customer customer = ims.getCustomers().get(0);
		Manager manager = ims.getManagers().get(0);
		Product product = ims.getProducts().get(0);
		
		try {
			ImsTransactionController.createTransaction(date, customerID2, userName);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		// check error
		assertEquals("The customer does not exist, register first.", error);
		// check no change in memory
		checkResultTransaction(customer, manager, product, ims, date, totalAmount, 
				amountPaid, id, amountUnpaid, 0, 0, 0);
	}
	
	@Test
	public void testCreateTransactionEmptyCustomer() throws InvalidInputException {
		IMS ims = ImsApplication.getIms();
		String name = "john";
		String userName = "manager1";
		String password = "12456";
		String customerID = "customer1";
		String customerID2 = "12457896";
		String productName = "product";
		float totalAmount = 100f;
		float amountPaid = 100f;
		float amountUnpaid = 10f;
		String id = "_GnUEsHH6Eem3Hp-Jh3HlXg";
		float price = 45f;
		Date date = new Date();
		
		String error = "";
		
		try {
			ImsPersonController.createPerson(name);
			ImsPersonController.createPerson(name);
			ImsPersonController.addManager(userName, password, ims.getPersons().get(0));
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(1));
			ImsProductController.createProduct(productName, price);
			ImsProductController.addExistingItems(ims.getProducts().get(0), 5);
		} catch (RuntimeException e) {
			fail();
		}
		
		Customer customer = ims.getCustomers().get(0);
		Manager manager = ims.getManagers().get(0);
		Product product = ims.getProducts().get(0);
		
		try {
			ImsTransactionController.createTransaction(date, "", userName);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		// check error
		assertEquals("Select customer first.", error);
		// check no change in memory
		checkResultTransaction(customer, manager, product, ims, date, totalAmount, 
				amountPaid, id, amountUnpaid, 0, 0, 0);
	}
	
	@Test
	public void testCreateTransactionNullCustomer() throws InvalidInputException {
		IMS ims = ImsApplication.getIms();
		String name = "john";
		String userName = "manager1";
		String password = "12456";
		String customerID = "customer1";
		String customerID2 = "12457896";
		String productName = "product";
		float totalAmount = 100f;
		float amountPaid = 100f;
		float amountUnpaid = 10f;
		String id = "_GnUEsHH6Eem3Hp-Jh3HlXg";
		float price = 45f;
		Date date = new Date();
		
		String error = "";
		
		try {
			ImsPersonController.createPerson(name);
			ImsPersonController.createPerson(name);
			ImsPersonController.addManager(userName, password, ims.getPersons().get(0));
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(1));
			ImsProductController.createProduct(productName, price);
			ImsProductController.addExistingItems(ims.getProducts().get(0), 5);
		} catch (RuntimeException e) {
			fail();
		}
		
		Customer customer = ims.getCustomers().get(0);
		Manager manager = ims.getManagers().get(0);
		Product product = ims.getProducts().get(0);
		
		try {
			ImsTransactionController.createTransaction(date, null, userName);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		// check error
		assertEquals("Select customer first.", error);
		// check no change in memory
		checkResultTransaction(customer, manager, product, ims, date, totalAmount, 
				amountPaid, id, amountUnpaid, 0, 0, 0);
	}
	
	@Test
	public void testCreateTransactionWrongManager() throws InvalidInputException {
		IMS ims = ImsApplication.getIms();
		String name = "john";
		String userName = "manager1";
		String password = "12456";
		String customerID = "customer1";
		String userName2 = "12457896";
		String productName = "product";
		float totalAmount = 100f;
		float amountPaid = 100f;
		float amountUnpaid = 10f;
		String id = "_GnUEsHH6Eem3Hp-Jh3HlXg";
		float price = 45f;
		Date date = new Date();
		
		String error = "";
		
		try {
			ImsPersonController.createPerson(name);
			ImsPersonController.createPerson(name);
			ImsPersonController.addManager(userName, password, ims.getPersons().get(0));
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(1));
			ImsProductController.createProduct(productName, price);
			ImsProductController.addExistingItems(ims.getProducts().get(0), 5);
		} catch (RuntimeException e) {
			fail();
		}
		
		Customer customer = ims.getCustomers().get(0);
		Manager manager = ims.getManagers().get(0);
		Product product = ims.getProducts().get(0);
		
		try {
			ImsTransactionController.createTransaction(date, customerID, userName2);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		// check error
		assertEquals("You need a manager to create a transaction.", error);
		// check no change in memory
		checkResultTransaction(customer, manager, product, ims, date, totalAmount, 
				amountPaid, id, amountUnpaid, 0, 0, 0);
	}
	
	@Test
	public void testCreateTransactionEmptyManager() throws InvalidInputException {
		IMS ims = ImsApplication.getIms();
		String name = "john";
		String userName = "manager1";
		String password = "12456";
		String customerID = "customer1";
		String customerID2 = "12457896";
		String productName = "product";
		float totalAmount = 100f;
		float amountPaid = 100f;
		float amountUnpaid = 10f;
		String id = "_GnUEsHH6Eem3Hp-Jh3HlXg";
		float price = 45f;
		Date date = new Date();
		
		String error = "";
		
		try {
			ImsPersonController.createPerson(name);
			ImsPersonController.createPerson(name);
			ImsPersonController.addManager(userName, password, ims.getPersons().get(0));
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(1));
			ImsProductController.createProduct(productName, price);
			ImsProductController.addExistingItems(ims.getProducts().get(0), 5);
		} catch (RuntimeException e) {
			fail();
		}
		
		Customer customer = ims.getCustomers().get(0);
		Manager manager = ims.getManagers().get(0);
		Product product = ims.getProducts().get(0);
		
		try {
			ImsTransactionController.createTransaction(date, customerID, "");
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		// check error
		assertEquals("Select manager first.", error);
		// check no change in memory
		checkResultTransaction(customer, manager, product, ims, date, totalAmount, 
				amountPaid, id, amountUnpaid, 0, 0, 0);
	}
	
	@Test
	public void testCreateTransactionNullManager() throws InvalidInputException {
		IMS ims = ImsApplication.getIms();
		String name = "john";
		String userName = "manager1";
		String password = "12456";
		String customerID = "customer1";
		String customerID2 = "12457896";
		String productName = "product";
		float totalAmount = 100f;
		float amountPaid = 100f;
		float amountUnpaid = 10f;
		String id = "_GnUEsHH6Eem3Hp-Jh3HlXg";
		float price = 45f;
		Date date = new Date();
		
		String error = "";
		
		try {
			ImsPersonController.createPerson(name);
			ImsPersonController.createPerson(name);
			ImsPersonController.addManager(userName, password, ims.getPersons().get(0));
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(1));
			ImsProductController.createProduct(productName, price);
			ImsProductController.addExistingItems(ims.getProducts().get(0), 5);
		} catch (RuntimeException e) {
			fail();
		}
		
		Customer customer = ims.getCustomers().get(0);
		Manager manager = ims.getManagers().get(0);
		Product product = ims.getProducts().get(0);
		
		try {
			ImsTransactionController.createTransaction(date, customerID, null);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		// check error
		assertEquals("Select manager first.", error);
		// check no change in memory
		checkResultTransaction(customer, manager, product, ims, date, totalAmount, 
				amountPaid, id, amountUnpaid, 0, 0, 0);
	}
	
	
	
	@Test
	public void testaddProductTransactionSuccess() throws InvalidInputException {
		IMS ims = ImsApplication.getIms();
		String name = "john";
		String userName = "manager1";
		String password = "12456";
		String customerID = "customer1";
		String productName = "product";
		float totalAmount = 100f;
		float amountPaid = 100f;
		float amountUnpaid = 10f;
		String id = "_GnUEsHH6Eem3Hp-Jh3HlXg";
		float price = 45f;
		Date date = new Date();
		
		try {
			ImsPersonController.createPerson(name);
			ImsPersonController.createPerson(name);
			ImsPersonController.addManager(userName, password, ims.getPersons().get(0));
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(1));
			ImsProductController.createProduct(productName, price);
			ImsProductController.addExistingItems(ims.getProducts().get(0), 5);
		} catch (RuntimeException e) {
			fail();
		}
		
		Customer customer = ims.getCustomers().get(0);
		Manager manager = ims.getManagers().get(0);
		Product product = ims.getProducts().get(0);
		
		try {
			ImsTransactionController.createTransaction(date, customerID, userName);
			ImsTransactionController.addTransactionProduct(ims.getTransactions().get(0), 
					product, 4);
		} catch (RuntimeException e) {
			fail();
		}
		
		// check error
		//assertEquals("The price of a product cannot be negative.", error);
		// check no change in memory
		checkResultTransaction(customer, manager, product, ims, date, totalAmount, 
				amountPaid, id, amountUnpaid, 1, 1, 1);
	}
	
	@Test
	public void testaddProductTransactionNegativeQuantity() throws InvalidInputException {
		IMS ims = ImsApplication.getIms();
		String name = "john";
		String userName = "manager1";
		String password = "12456";
		String customerID = "customer1";
		String productName = "product";
		float totalAmount = 100f;
		float amountPaid = 100f;
		float amountUnpaid = 10f;
		String id = "_GnUEsHH6Eem3Hp-Jh3HlXg";
		float price = 45f;
		Date date = new Date();
		
		String error = "";
		
		try {
			ImsPersonController.createPerson(name);
			ImsPersonController.createPerson(name);
			ImsPersonController.addManager(userName, password, ims.getPersons().get(0));
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(1));
			ImsProductController.createProduct(productName, price);
			ImsProductController.addExistingItems(ims.getProducts().get(0), 5);
		} catch (RuntimeException e) {
			fail();
		}
		
		Customer customer = ims.getCustomers().get(0);
		Manager manager = ims.getManagers().get(0);
		Product product = ims.getProducts().get(0);
		
		try {
			ImsTransactionController.createTransaction(date, customerID, userName);
			ImsTransactionController.addTransactionProduct(ims.getTransactions().get(0), product, -4);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		// check error
		assertEquals("Quantity of items must be greater than zero.", error);
		// check no change in memory
		checkResultTransaction(customer, manager, product, ims, date, totalAmount, 
				amountPaid, id, amountUnpaid, 1, 0, 0);
	}
	
	@Test
	public void testaddProductTransactionZeroQuantity() throws InvalidInputException {
		IMS ims = ImsApplication.getIms();
		String name = "john";
		String userName = "manager1";
		String password = "12456";
		String customerID = "customer1";
		String productName = "product";
		float totalAmount = 100f;
		float amountPaid = 100f;
		float amountUnpaid = 10f;
		String id = "_GnUEsHH6Eem3Hp-Jh3HlXg";
		float price = 45f;
		Date date = new Date();
		
		String error = "";
		
		try {
			ImsPersonController.createPerson(name);
			ImsPersonController.createPerson(name);
			ImsPersonController.addManager(userName, password, ims.getPersons().get(0));
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(1));
			ImsProductController.createProduct(productName, price);
			ImsProductController.addExistingItems(ims.getProducts().get(0), 5);
		} catch (RuntimeException e) {
			fail();
		}
		
		Customer customer = ims.getCustomers().get(0);
		Manager manager = ims.getManagers().get(0);
		Product product = ims.getProducts().get(0);
		
		try {
			ImsTransactionController.createTransaction(date, customerID, userName);
			ImsTransactionController.addTransactionProduct(ims.getTransactions().get(0), product, 0);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		// check error
		assertEquals("Quantity of items must be greater than zero.", error);
		// check no change in memory
		checkResultTransaction(customer, manager, product, ims, date, totalAmount, 
				amountPaid, id, amountUnpaid, 1, 0, 0);
	}
	
	@Test
	public void testaddProductTransactionExcessQuantity() throws InvalidInputException {
		IMS ims = ImsApplication.getIms();
		String name = "john";
		String userName = "manager1";
		String password = "12456";
		String customerID = "customer1";
		String productName = "product";
		float totalAmount = 100f;
		float amountPaid = 100f;
		float amountUnpaid = 10f;
		String id = "_GnUEsHH6Eem3Hp-Jh3HlXg";
		float price = 45f;
		Date date = new Date();
		
		String error = "";
		
		try {
			ImsPersonController.createPerson(name);
			ImsPersonController.createPerson(name);
			ImsPersonController.addManager(userName, password, ims.getPersons().get(0));
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(1));
			ImsProductController.createProduct(productName, price);
			ImsProductController.addExistingItems(ims.getProducts().get(0), 5);
		} catch (RuntimeException e) {
			fail();
		}
		
		Customer customer = ims.getCustomers().get(0);
		Manager manager = ims.getManagers().get(0);
		Product product = ims.getProducts().get(0);
		
		try {
			ImsTransactionController.createTransaction(date, customerID, userName);
			ImsTransactionController.addTransactionProduct(ims.getTransactions().get(0), product, 10);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		// check error
		assertEquals("Sorry! we do not have enough product in store.", error);
		// check no change in memory
		checkResultTransaction(customer, manager, product, ims, date, totalAmount, 
				amountPaid, id, amountUnpaid, 1, 0, 0);
	}
	
	private void checkResultTransaction(Customer c, Manager m, Product p, IMS ims,
			Date date, float amt, float amtPaid, String id, 
			float amtUnpaid, int numberOfTrans, int numberOfPT, int numberOfP) {
		assertEquals(numberOfTrans, ims.getTransactions().size());
		if (numberOfTrans > 0) {
			assertEquals(numberOfPT, ims.getTransactions().get(0).getProducttransactions().size());
			assertEquals(date, ims.getTransactions().get(0).getDate());
			//assertEquals(id, ims.getTransactions().get(0).getId());
			assertEquals(2, ims.getPersons().size());
		}
	}


}
