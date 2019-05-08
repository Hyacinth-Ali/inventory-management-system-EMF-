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
import com.ali.hyacinth.ims.Person;
import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.resource.ImsResource;
import com.ali.hyacinth.ims.util.ImsResourceFactoryImpl;
import com.ali.hyacinth.ims.util.ResourceHelper;



class ImsPersonTests {

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
	public void testCreatePersonNull() {
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
		String name = "person";
		
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
		System.out.println(EcoreUtil.generateUUID());
		assertEquals(numberOfPersons, ims.getPersons().size());
		if (numberOfPersons > 0) {
			assertEquals(name, ims.getPersons().get(0).getName());
			assertEquals(0, ims.getPersons().get(0).getRoles().size());
			assertEquals(1, ims.eContents().size());
		}
	}
	
	
	@Test
	public void testCreatePersonEmpty() {
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
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
	}
	
	@Test
	public void testCreateCustomerDuplicateID() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "customer1";
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}	
		// check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		// check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		//check error
		assertEquals("This id " + customerID + " already exist", error);
		
	}

	
	@Test
	public void testCreateCustomerNullID() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = null;
		String error = "";
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}		
		checkResultCustomer(name, customerID, ims, 0, 0);
	
		//check error
		assertEquals("The ID of a customer cannot be empty", error);
	
	}
	
	@Test
	public void testCreateCustomerEmptyID() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "";
		String error = "";
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}		
		checkResultCustomer(name, customerID, ims, 0, 0);
	
		//check error
		assertEquals("The ID of a customer cannot be empty", error);
	}
	
	@Test
	public void testDeleteCustomerSucces() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "customer1";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.deleteCustomer(customerID);
		} catch (InvalidInputException e) {
			fail();
		}	
		
		//check model in memory
		checkResultCustomer(name, customerID, ims, 0, 0);
	}
	
	@Test
	public void testUpdateCustomerIDSucces() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "customer1";
		String newID = "customer2";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.upDateCustomerID(customerID, newID);
		} catch (InvalidInputException e) {
			fail();
		}	
		
		//check model in memory
		checkResultCustomer(name, newID, ims, 1, 1);
	}
	
	@Test
	public void testUpdateCustomerOldIDNull() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "customer1";
		String newID = "customer2";
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(name, customerID, ims, 1, 1);
		customerID = null;
		try {
			ImsPersonController.upDateCustomerID(customerID, newID);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		customerID = ims.getCustomers().get(0).getCustomerID();
		
		//check error
		assertEquals(error, "The current ID cannot be empty");
		
		//check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
	}
	
	@Test
	public void testUpdateCustomerNewIDNull() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "customer1";
		String newID = null;
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.upDateCustomerID(customerID, newID);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The ID of a customer cannot be empty");
		
		//check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
	}
	
	@Test
	public void testUpdateCustomerNewIDEmpty() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "customer1";
		String newID = "";
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.upDateCustomerID(customerID, newID);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The ID of a customer cannot be empty");
		
		//check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
	}
	
	@Test
	public void testUpdateCustomerIDNonExist() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "customer1";
		String newID = "12345";
		String customerID2 = "customer2";
		
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.upDateCustomerID(customerID2, newID);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The customer does not exist.");
		
		//check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
	}
	
	@Test
	public void testUpdateCustomerNameNonExist() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "customer1";
		String newName = "customer4";
		String customerID2 = "customer2";
		
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.upDateCustomerName(customerID2, newName);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The customer does not exist.");
		
		//check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
	}
	
	@Test
	public void testUpdateCustomerNullNewName() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "customer1";
		String newName = null;
		
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.upDateCustomerName(customerID, newName);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The name of a customer cannot be empty");
		
		//check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
	}
	
	
	@Test
	public void testUpdateCustomerNameSuccess() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "customer1";
		String newName = "customer2";
		
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.upDateCustomerName(customerID, newName);
		} catch (InvalidInputException e) {
			fail();
		}
		
		//check error
		//assertEquals(error, "The name of a customer cannot be empty");
		
		//check model in memory
		checkResultCustomer(newName, customerID, ims, 1, 1);
	}

	@Test
	public void testUpdateCustomerEmptyNewName() {
		IMS ims = ImsApplication.getIms();
		String oldName = "customer old";
		String customerID = "customer1";
		String newName = "";
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, oldName);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(oldName, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.upDateCustomerName(customerID, newName);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The name of a customer cannot be empty");
		
		//check model in memory
		checkResultCustomer(newName, customerID, ims, 1, 1);
	}

	
	@Test
	public void testUpdateCustomerOldIDEmpty() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String oldID = "customer1";
		String newID = "customer2";
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(oldID, name);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultCustomer(name, oldID, ims, 1, 1);
		oldID = "";
		try {
			ImsPersonController.upDateCustomerID(oldID, newID);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		oldID = ims.getCustomers().get(0).getCustomerID();
		
		//check error
		assertEquals(error, "The current ID cannot be empty");
		
		//check model in memory
		checkResultCustomer(name, oldID, ims, 1, 1);
	}
	
	/**
	 * Person remaining test, update person, update manager (3)
	 */
	/**
	 * 
	 * @param name
	 * @param customerID
	 * @param ims
	 * @param numberOfPersons
	 * @param numberOfCustomers
	 */
	
	
	private void checkResultCustomer(String name, String customerID, IMS ims, int numberOfPersons, int numberOfCustomers) {
		assertEquals(numberOfPersons, ims.getPersons().size());
		assertEquals(numberOfCustomers, ims.getCustomers().size());
		if (numberOfCustomers > 0) {
 			assertEquals(customerID, ims.getCustomers().get(0).getCustomerID());
			assertEquals(2, ims.eContents().size());
		}
		assertEquals(0, ims.getTransactions().size());
	}
	
	@Test
	public void testAddCustomerSuccess() {
		IMS ims = ImsApplication.getIms();
		String name = "person";
		String userName = "manager1";
		String customerID = "customer1";
		String password = "1234";
		
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultManager(name, userName, password, ims, 1, 1);
		
		try {
			ImsPersonController.addCustomer(customerID, ImsApplication.getIms().getPersons().get(0));
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultManagerandCustomer(name, userName, password, customerID, ims, 1, 1, 1);
	}
	
	@Test
	public void testAddCustomerNullID() {
		IMS ims = ImsApplication.getIms();
		String name = "person";
		String userName = "manager1";
		String customerID = null;
		String password = "1234";
		
		String error = "";
		
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultManager(name, userName, password, ims, 1, 1);
		
		try {
			ImsPersonController.addCustomer(customerID, ImsApplication.getIms().getPersons().get(0));
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The ID of a customer cannot be empty");
		
		// check model in memory
		checkResultManagerandCustomer(name, userName, password, customerID, ims, 1, 1, 0);
	}
	
	@Test
	public void testAddCustomerEmptyID() {
		IMS ims = ImsApplication.getIms();
		String name = "person";
		String userName = "manager1";
		String customerID = "";
		String password = "1234";
		
		String error = "";
		
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultManager(name, userName, password, ims, 1, 1);
		
		try {
			ImsPersonController.addCustomer(customerID, ImsApplication.getIms().getPersons().get(0));
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The ID of a customer cannot be empty");
		
		// check model in memory
		checkResultManagerandCustomer(name, userName, password, customerID, ims, 1, 1, 0);
	}
	
	@Test
	public void testAddManagerSuccess() {
		IMS ims = ImsApplication.getIms();
		String name = "person";
		String userName = "manager1";
		String customerID = "customer1";
		String password = "1234";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.addManager(userName, password, ImsApplication.getIms().getPersons().get(0));
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultManagerandCustomer(name, userName, password, customerID, ims, 1, 1, 1);
	}
	
	@Test
	public void testAddManagerNullPassword() {
		IMS ims = ImsApplication.getIms();
		String name = "person";
		String userName = "manager1";
		String customerID = "customer1";
		String password = null;
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.addManager(userName, password, ImsApplication.getIms().getPersons().get(0));
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		//check error
		assertEquals(error, "The password of a manager cannot be empty");
		// check model in memory
		checkResultManagerandCustomer(name, userName, password, customerID, ims, 1, 0, 1);
	}
	
	@Test
	public void testAddManagerEmptyPassword() {
		IMS ims = ImsApplication.getIms();
		String name = "person";
		String userName = "manager1";
		String customerID = "customer1";
		String password = "";
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.addManager(userName, password, ImsApplication.getIms().getPersons().get(0));
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		//check error
		assertEquals(error, "The password of a manager cannot be empty");
		// check model in memory
		checkResultManagerandCustomer(name, userName, password, customerID, ims, 1, 0, 1);
	}
	
	@Test
	public void testAddManagerNullUsername() {
		IMS ims = ImsApplication.getIms();
		String name = "person";
		String userName = null;
		String customerID = "customer1";
		String password = "12345";
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.addManager(userName, password, ImsApplication.getIms().getPersons().get(0));
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		//check error
		assertEquals(error, "The user name of a manager cannot be empty");
		// check model in memory
		checkResultManagerandCustomer(name, userName, password, customerID, ims, 1, 0, 1);
	}
	
	@Test
	public void testAddManagerEmptyUsername() {
		IMS ims = ImsApplication.getIms();
		String name = "person";
		String userName = "";
		String customerID = "customer1";
		String password = "12345";
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.addManager(userName, password, ImsApplication.getIms().getPersons().get(0));
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		//check error
		assertEquals(error, "The user name of a manager cannot be empty");
		// check model in memory
		checkResultManagerandCustomer(name, userName, password, customerID, ims, 1, 0, 1);
	}
	
	@Test
	public void testAddCustomerDuplicateID() {
		IMS ims = ImsApplication.getIms();
		String name = "person";
		String userName = "manager1";
		String customerID = "customer1";
		String password = "12345";
		
		String error = "";
		
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultManager(name, userName, password, ims, 1, 1);
		
		try {
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(0));
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}	
		// check model in memory
		checkResultManagerandCustomer(name, userName, password, customerID, ims, 1, 1, 1);
		
		try {
			ImsPersonController.addCustomer(customerID, ims.getPersons().get(0));
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}	
		// check model in memory
		checkResultManagerandCustomer(name, userName, password, customerID, ims, 1, 1, 1);
		
		//check error
		assertEquals("This id " + customerID + " already exist", error);
		
	}

	@Test
	public void testAddCustomerDouble() {
		IMS ims = ImsApplication.getIms();
		String name = "customer";
		String customerID = "customer1";
		String customerID2 = "customer2";
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}	
		// check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.addCustomer(customerID2, 
					ImsApplication.getIms().getPersons().get(0));
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		// check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		//check error
		assertEquals("This person already exist as a customer.", error);
		
	}
	
	@Test
	public void testAddManagerDuplicateUsernamer() {
		IMS ims = ImsApplication.getIms();
		String name = "person";
		String userName = "manager1";
		String customerID = "customer1";
		String password = "12345";
		
		String error = "";
		
		try {
			ImsPersonController.createCustomer(customerID, name);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultCustomer(name, customerID, ims, 1, 1);
		
		try {
			ImsPersonController.addManager(userName, password, ImsApplication.getIms().getPersons().get(0));
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultManagerandCustomer(name, userName, password, customerID, ims, 1, 1, 1);	
		
		try {
			ImsPersonController.addManager(userName, password, ImsApplication.getIms().getPersons().get(0));
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		//check error
		assertEquals(error, "This user name : " + userName + " already exist");
		// check model in memory
		checkResultManagerandCustomer(name, userName, password, customerID, ims, 1, 1, 1);	
	}
	
	/**
	 * Return here for adding customers, also name for customers and managers
	 */
	/**
	 * Manager
	 */
	@Test
	public void testCreateManagerSuccess() {
		IMS ims = ImsApplication.getIms();
		String name = "manager";
		String userName = "manager1";
		String password = "customer1";
		
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultManager(name, userName, password, ims, 1, 1);
	}
	
	@Test
	public void testAddManagerDouble() {
		IMS ims = ImsApplication.getIms();
		String name = "manager";
		String userName = "manager1";
		String password = "customer1";
		String userName2 = "manager2";
		
		String error = "";
		
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			fail();
		}
		
		// check model in memory
		checkResultManager(name, userName, password, ims, 1, 1);
		
		try {
			Person p = ImsApplication.getIms().getPersons().get(0);
			ImsPersonController.addManager(userName2, password, p);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		//check error
		assertEquals(error, "This person already exist as a manger.");
		
		// check model in memory
		checkResultManager(name, userName, password, ims, 1, 1);
	}
	
	@Test
	public void testCreateManagerDuplicateUserName() {
		IMS ims = ImsApplication.getIms();
		String name = "manager";
		String userName = "manager1";
		String password = "customer1";
		
		String error = "";
		
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			fail();
		}	
		// check model in memory
		checkResultManager(name, userName, password, ims, 1, 1);
		
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		// check model in memory
		checkResultManager(name, userName, password, ims, 1, 1);
		
		//check error
		assertEquals("The user name : " + userName + " already exist.", error);
		
	}

	
	@Test
	public void testCreateManagerNullUsername() {
		IMS ims = ImsApplication.getIms();
		String name = "manager";
		String userName = null;
		String password = "customer1";
		String error = "";
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}		
		checkResultManager(name, userName, password, ims, 0, 0);
	
		//check error
		assertEquals("The user name of a manager cannot be empty.", error);
	
	}

	@Test
	public void testCreateManagerEmptyUsername() {
		IMS ims = ImsApplication.getIms();
		String name = "manager";
		String userName = "";
		String password = "customer1";
		String error = "";
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}		
		checkResultManager(name, userName, password, ims, 0, 0);
	
		//check error
		assertEquals("The user name of a manager cannot be empty.", error);
	
	}
	
	@Test
	public void testCreateManagerNullPassword() {
		IMS ims = ImsApplication.getIms();
		String name = "manager";
		String userName = "manager1";
		String password = null;
		String error = "";
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}		
		checkResultManager(name, userName, password, ims, 0, 0);
	
		//check error
		assertEquals("You cannot create a manager with empty password.", error);
	}
	
	@Test
	public void testCreateManagerEmptyPassword() {
		IMS ims = ImsApplication.getIms();
		String name = "manager";
		String userName = "manager1";
		String password = "";
		String error = "";
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}		
		checkResultManager(name, userName, password, ims, 0, 0);
	
		//check error
		assertEquals("You cannot create a manager with empty password.", error);
	}
	
	@Test
	public void testDeleteManagerSucces() {
		IMS ims = ImsApplication.getIms();
		String name = "manager";
		String userName = "manager1";
		String password = "1234";
		
		try {
			ImsPersonController.createManager(name, userName, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(name, userName, password, ims, 1, 1);
		
		try {
			ImsPersonController.deleteManager(userName);
		} catch (InvalidInputException e) {
			fail();
		}	
		
		//check model in memory
		checkResultManager(name, userName, password, ims, 0, 0);
	}
	
	@Test
	public void testUpdateManagerOldUsernameEmpty() {
		IMS ims = ImsApplication.getIms();
		String oldUsername = "manager";
		String managerName = "manager1";
		String password = "12456";
		String newUsername = "manager3";
		String error = "";
		
		try {
			ImsPersonController.createManager(managerName, oldUsername, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, oldUsername, password, ims, 1, 1);
		oldUsername = "";
		try {
			ImsPersonController.upDateManagerUsername(oldUsername, newUsername);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		oldUsername = ims.getManagers().get(0).getUserName();
		
		//check error
		assertEquals(error, "The current user name of the manager cannot be empty");
		
		//check model in memory
		checkResultManager(managerName, oldUsername, password, ims, 1, 1);
	}
	
	@Test
	public void testUpdateManagerNewUsernameEmpty() {
		IMS ims = ImsApplication.getIms();
		String oldUsername = "manager";
		String managerName = "manager1";
		String password = "12456";
		String newUsername = "";
		String error = "";
		
		try {
			ImsPersonController.createManager(managerName, oldUsername, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, oldUsername, password, ims, 1, 1);
		try {
			ImsPersonController.upDateManagerUsername(oldUsername, newUsername);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The user name of a manager cannot be empty");
		
		//check model in memory
		checkResultManager(managerName, oldUsername, password, ims, 1, 1);
	}
	
	@Test
	public void testUpdateManagerOldUsernameNull() {
		IMS ims = ImsApplication.getIms();
		String oldUsername = "manager";
		String managerName = "manager1";
		String password = "12456";
		String newUsername = "manager3";
		String error = "";
		
		try {
			ImsPersonController.createManager(managerName, oldUsername, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, oldUsername, password, ims, 1, 1);
		oldUsername = null;
		try {
			ImsPersonController.upDateManagerUsername(oldUsername, newUsername);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		oldUsername = ims.getManagers().get(0).getUserName();
		
		//check error
		assertEquals(error, "The current user name of the manager cannot be empty");
		
		//check model in memory
		checkResultManager(managerName, oldUsername, password, ims, 1, 1);
	}
	
	@Test
	public void testUpdateManagerNewNameNull() {
		IMS ims = ImsApplication.getIms();
		String username = "manager";
		String managerName = "manager1";
		String password = "12456";
		String newName = null;
		String error = "";
		
		try {
			ImsPersonController.createManager(managerName, username, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, username, password, ims, 1, 1);
		try {
			ImsPersonController.upDateManagerName(username, newName);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The name of a manager cannot be empty");
		
		//check model in memory
		checkResultManager(managerName, username, password, ims, 1, 1);
	}
	
	@Test
	public void testUpdateManagerNewNameEmpty() {
		IMS ims = ImsApplication.getIms();
		String username = "manager";
		String managerName = "manager1";
		String password = "12456";
		String newName = "";
		String error = "";
		
		try {
			ImsPersonController.createManager(managerName, username, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, username, password, ims, 1, 1);
		try {
			ImsPersonController.upDateManagerName(username, newName);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The name of a manager cannot be empty");
		
		//check model in memory
		checkResultManager(managerName, username, password, ims, 1, 1);
	}
	
	@Test
	public void testUpdateManagerNewNameSuccess() {
		IMS ims = ImsApplication.getIms();
		String username = "manager";
		String managerName = "manager1";
		String password = "12456";
		String newName = "manager2";
		
		try {
			ImsPersonController.createManager(managerName, username, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, username, password, ims, 1, 1);
		try {
			ImsPersonController.upDateManagerName(username, newName);
		} catch (InvalidInputException e) {
			fail();
		}
		
		//check error
		//assertEquals(error, "The name of a manager cannot be empty");
		
		//check model in memory
		checkResultManager(newName, username, password, ims, 1, 1);
	}
	
	@Test
	public void testUpdateManagerNameNonExist() {
		IMS ims = ImsApplication.getIms();
		String username = "manager";
		String UserNameWrong = "customer3";
		String managerName = "manager1";
		String password = "12456";
		String newName = "manager2";
		
		String error = "";		
		try {
			ImsPersonController.createManager(managerName, username, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, username, password, ims, 1, 1);
		try {
			ImsPersonController.upDateManagerName(UserNameWrong, newName);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The manager does not exist.");
		
		//check model in memory
		checkResultManager(managerName, username, password, ims, 1, 1);
	}
	
	
	@Test
	public void testUpdateManagerUsernameSuccess() {
		IMS ims = ImsApplication.getIms();
		String oldUsername = "manager";
		String managerName = "manager1";
		String password = "12456";
		String newUsername = "manager2";
		
		try {
			ImsPersonController.createManager(managerName, oldUsername, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, oldUsername, password, ims, 1, 1);
		
		try {
			ImsPersonController.upDateManagerUsername(oldUsername, newUsername);
		} catch (InvalidInputException e) {
			fail();
		}
		
		//check error
		//assertEquals(error, "The user name of a manager cannot be empty");
		
		//check model in memory
		checkResultManager(managerName, newUsername, password, ims, 1, 1);
	}
	
	@Test
	public void testUpdateManagerUsernameNonExist() {
		IMS ims = ImsApplication.getIms();
		String oldUsername = "manager";
		String managerName = "manager1";
		String password = "12456";
		String newUsername = "manager2";
		String userNameNonExist = "managerNonExist";
		
		String error = "";
		
		try {
			ImsPersonController.createManager(managerName, oldUsername, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, oldUsername, password, ims, 1, 1);
		
		try {
			ImsPersonController.upDateManagerUsername(userNameNonExist, newUsername);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The manager does not exist.");
		
		//check model in memory
		checkResultManager(managerName, oldUsername, password, ims, 1, 1);
	}
	
	@Test
	public void testUpdateManagerNewPasswordEmpty() {
		IMS ims = ImsApplication.getIms();
		String username = "manager";
		String managerName = "manager1";
		String password = "12456";
		String newPassword = "";
		String error = "";
		
		try {
			ImsPersonController.createManager(managerName, username, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, username, password, ims, 1, 1);
		try {
			ImsPersonController.upDateManagerPassword(username, newPassword);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The password of a manager cannot be empty");
		
		//check model in memory
		checkResultManager(managerName, username, password, ims, 1, 1);
	}
	
	@Test
	public void testUpdateManagerNewPasswordNull() {
		IMS ims = ImsApplication.getIms();
		String username = "manager";
		String managerName = "manager1";
		String password = "12456";
		String newPassword = null;
		String error = "";
		
		try {
			ImsPersonController.createManager(managerName, username, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, username, password, ims, 1, 1);
		try {
			ImsPersonController.upDateManagerPassword(username, newPassword);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The password of a manager cannot be empty");
		
		//check model in memory
		checkResultManager(managerName, username, password, ims, 1, 1);
	}
	
	@Test
	public void testUpdateManagerNewPasswordSuccess() {
		IMS ims = ImsApplication.getIms();
		String username = "manager";
		String managerName = "manager1";
		String password = "12456";
		String newPassword = "1245689";
		
		try {
			ImsPersonController.createManager(managerName, username, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, username, password, ims, 1, 1);
		try {
			ImsPersonController.upDateManagerPassword(username, newPassword);
		} catch (InvalidInputException e) {
			fail();
		}
		
		//check error
		//assertEquals(error, "The password of a manager cannot be empty");
		
		//check model in memory
		checkResultManager(managerName, username, newPassword, ims, 1, 1);
	}
	
	@Test
	public void testUpdateManagerNewPasswordNonExist() {
		IMS ims = ImsApplication.getIms();
		String username = "manager";
		String usernameWrong = "managerwrong";
		String managerName = "manager1";
		String password = "12456";
		String newPassword = "1245689";
		
		String error = "";
		
		try {
			ImsPersonController.createManager(managerName, username, password);
		} catch (InvalidInputException e) {
			fail();
		}		
		checkResultManager(managerName, username, password, ims, 1, 1);
		try {
			ImsPersonController.upDateManagerPassword(usernameWrong, newPassword);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		//check error
		assertEquals(error, "The manager does not exist.");
		
		//check model in memory
		checkResultManager(managerName, username, password, ims, 1, 1);
	}



	private void checkResultManagerandCustomer(String name, String userName, String password, String customerID, 
			IMS ims, int numberOfPersons, int numberOfManagers, int numberOfCustomers) {
		assertEquals(numberOfPersons, ims.getPersons().size());
		assertEquals(numberOfManagers, ims.getManagers().size());
		assertEquals(numberOfCustomers, ims.getCustomers().size());
		if (numberOfManagers > 0 & numberOfCustomers > 0) {
			assertEquals(name, ims.getPersons().get(0).getName());
			assertEquals(userName, ims.getManagers().get(0).getUserName());
			assertEquals(password, ims.getManagers().get(0).getPassword());
			assertEquals(customerID, ims.getCustomers().get(0).getCustomerID());
			assertEquals(3, ims.eContents().size());
			assertEquals(2, ims.getPersons().get(0).getRoles().size());
		}
		if (numberOfManagers > 0) {
			assertEquals(name, ims.getPersons().get(0).getName());
			assertEquals(userName, ims.getManagers().get(0).getUserName());
			assertEquals(password, ims.getManagers().get(0).getPassword());
		}
		if (numberOfCustomers > 0) {
			assertEquals(name, ims.getPersons().get(0).getName());
			assertEquals(customerID, ims.getCustomers().get(0).getCustomerID());
		}
		assertEquals(0, ims.getTransactions().size());
	}
	
	private void checkResultManager(String name, String userName, String password, IMS ims, int numberOfPersons, int numberOfManagers) {
		assertEquals(numberOfPersons, ims.getPersons().size());
		assertEquals(numberOfManagers, ims.getManagers().size());
		if (numberOfManagers > 0) {
			assertEquals(name, ims.getPersons().get(0).getName());
			assertEquals(userName, ims.getManagers().get(0).getUserName());
			assertEquals(password, ims.getManagers().get(0).getPassword());
			assertEquals(2, ims.eContents().size());
		}
		assertEquals(0, ims.getTransactions().size());
	}

}
