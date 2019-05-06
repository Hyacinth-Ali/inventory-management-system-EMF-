package com.ali.hyacinth.ims.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.resource.ImsResource;
import com.ali.hyacinth.ims.util.ImsResourceFactoryImpl;
import com.ali.hyacinth.ims.util.ResourceHelper;



class PersonTests {

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
	public void testCreatePersonSuccess() {
		IMS ims = ImsApplication.getIms();
		String name = "person";
		
		try {
			ImsPersonController.createPerson(name);
		} catch (InvalidInputException e) {
			// check that no error occurred
			fail();
		}
		// check model in memory
		checkResultPerson(name, ims, 1);
	}
	
	@Test
	public void testCreateUserNull() {
		IMS ims = ImsApplication.getIms();
		String name = null;
		String error = "";
		
		try {
			ImsPersonController.createPerson(name);
		} catch (InvalidInputException e) {
			// check that no error occurred
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The name of a person cannot be empty.");
		// check model in memory
		checkResultPerson(name, ims, 0);
	}
	
	@Test
	public void testDeletePersonSucces() {
		IMS ims = ImsApplication.getIms();
		String name = "user";
		
		try {
			ImsPersonController.createPerson(name);
		} catch (InvalidInputException e) {
			//check that no error occured.
			fail(); 
		}
		//check model in memory
		checkResultPerson(name, ims, 1);
		
		try {
			ImsPersonController.deletePerson(ims.getPersons().get(0));
		} catch (InvalidInputException e) {
			//check that no error occured.
			fail();
		}
		
		//check model in memory
		checkResultPerson(name, ims, 0);
	}
	
	private void checkResultPerson(String name, IMS ims, int numberOfPersons) {
		assertEquals(numberOfPersons, ims.getPersons().size());
		if (numberOfPersons > 0) {
			assertEquals(name, ims.getPersons().get(0).getName());
			assertEquals(0, ims.getPersons().get(0).getRoles().size());
			assertEquals(1, ims.eContents().size());
		}
	}
	
	
	@Test
	public void testCreateUserEmpty() {
		IMS ims = ImsApplication.getIms();		
		String name = "";

		String error = null;
		try {
			ImsPersonController.createPerson(name);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		// check error
		assertEquals("The name of a person cannot be empty.", error);
		// check no change in memory
		checkResultPerson(name, ims, 0);
	}
	
	/**
	 * Customer.
	 */
	

	@Test
	public void testCreateCustomerSuccess() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "customer1";
		
		try {
			ImsPersonController.createCustomer(name);
		} catch (InvalidInputException e) {
			fail();
		}		
		try {
			ImsController.createCustomer(customerID, ims.getUser(0));
		} catch (InvalidInputException e) {
			fail();
		}
		// check model in memory
		checkResultCustomer(userName, customerID, ims, 1, 1);
	}
	
	@Test
	public void testCreateCustomerDuplicateID() {
		IMS ims = ImsApplication.getIms();
		String userName = "customer";
		String customerID = "customer1";
		
		String error = "";
		
		try {
			ImsController.createUser(userName);
		} catch (InvalidInputException e) {
			fail();
		}	
		// check model in memory
		checkResultCustomer(userName, customerID, ims, 1, 0);
		try {
			ImsController.createCustomer(customerID, ims.getUser(0));
		} catch (InvalidInputException e) {
			fail();
		}
		// check model in memory
		checkResultCustomer(userName, customerID, ims, 1, 1);
		
		try {
			ImsController.createCustomer(customerID, ims.getUser(0));
		}catch (InvalidInputException e) {
			error = e.getMessage();
		}
		//check error
		assertEquals("A customer with the same ID already exist", error);
		// check model in memory
		checkResultCustomer(userName, customerID, ims, 1, 1);
	}

	
	@Test
	public void testCreateCustomerNullID() {
		IMS ims = ImsApplication.getIms();
		String userName = "customer";
		String customerID = null;
		String error = "";
		try {
			ImsController.createUser(userName);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(userName, customerID, ims, 1, 0);
		try {
			ImsController.createCustomer(customerID, ims.getUser(0));
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
			error = e.getMessage();
		}	
		// check model in memory
		checkResultCustomer(userName, customerID, ims, 1, 0);
	
		//check error
		assertEquals("The ID of a customer cannot be empty", error);
	
	}
	
	@Test
	public void testCreateCustomerEmptyID() {
		IMS ims = ImsApplication.getIms();
		String userName = "customer";
		String customerID = "";
		String error = "";
		User user = null;
		try {
			ImsController.createUser(userName);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(userName, customerID, ims, 1, 0);
		user = ims.getUser(0);
		try {
			ImsController.createCustomer(customerID, user);
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
			error = e.getMessage();
		}	
		// check model in memory
		checkResultCustomer(userName, customerID, ims, 1, 0);
	
		//check error
		assertEquals("The ID of a customer cannot be empty", error);
	}
	
	@Test
	public void testDeleteCustomerSucces() {
		IMS ims = ImsApplication.getIms();
		String userName = "customer";
		String customerID = "customer1";
		User user = null;
		
		try {
			ImsController.createUser(userName);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(userName, customerID, ims, 1, 0);
		user = ims.getUser(0);
		try {
			ImsController.createCustomer(customerID, user);
		} catch (InvalidInputException e) {
			fail();
		}	
		// check model in memory
		checkResultCustomer(userName, customerID, ims, 1, 1);
		
		try {
			ImsController.deleteCustomer(customerID);
		} catch (InvalidInputException e) {
			fail();
		}	
		
		//check model in memory
		checkResultCustomer(userName, customerID, ims, 1, 0);
	}
	
	private void checkResultCustomer(String name, String customerID, IMS ims, int numberOfUsers, int numberOfCustomers) {
		assertEquals(numberOfUsers, ims.getUsers().size());
		assertEquals(numberOfCustomers, ims.getCustomers().size());
		if (numberOfCustomers > 0) {
			assertEquals(name, ims.getUser(0).getName());
			assertEquals(customerID, ims.getCustomer(0).getCustomerID());
			assertEquals(0, ims.getCustomer(0).getTransactions().size());
		}
		assertEquals(0, ims.getTransactions().size());
	}

	

}
