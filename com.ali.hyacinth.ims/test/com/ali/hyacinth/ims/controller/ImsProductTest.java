package com.ali.hyacinth.ims.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.io.File;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ali.hyacinth.ims.Customer;
import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.Manager;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.util.ImsResourceFactoryImpl;
import com.ali.hyacinth.ims.util.ResourceHelper;


import com.ali.hyacinth.ims.controller.Constants;
import com.ali.hyacinth.ims.resource.ImsResource;

class ImsProductTest {

	//private static IMS ims = null;
	@BeforeAll
	public static void setUpOnce() {
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
	
	@BeforeEach
	public void setUp() {
		// clear all data
		IMS ims = ImsApplication.getIms();
		Collection<? extends EObject> objects = ims.eContents();
		EcoreUtil.deleteAll(objects, true);
		//
	}
	
	/*@AfterEach
	public void after() {
		ImsApplication.unloadIms();
	}*/
	
	@AfterAll
	public static void tearDown() {
		ImsApplication.unloadIms();
	}
	
	@Test
	public void testCreateProductSuccess() {
		IMS ims = ImsApplication.getIms();
		String name = Constants.PRODUCT_NAME;
		float price = 100;
		int quantity = 100;
		
		try {
			ImsProductController.createProduct(name, price, quantity);
		} catch (InvalidInputException e) {
			// check that no error occurred
			fail();
		}
		
		// check model in memory
		checkResultProduct(name, price, quantity, ims, 1, 0);
		
	}
	
	private void checkResultProduct(String name, float price, int quantity, IMS ims, 
			int numberOfProducts, int numberOfItems) {
		assertEquals(numberOfProducts, ims.getProducts().size());
		if (numberOfProducts > 0) {
			assertEquals(name, ims.getProducts().get(0).getName());
			assertEquals(quantity, ims.getProducts().get(0).getQuantity());
			assertEquals(1, ims.eContents().size());
		} 
	}			
				
	@Test
	public void testCreateProductNull() {
		IMS ims = ImsApplication.getIms();
		String name = null;
		float price = 100;
		int quantity = 100;
		String error = "";
		try {
			ImsProductController.createProduct(name, price, quantity);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		// check error
		assertEquals("The name of a product cannot be empty.", error);
		// check no change in memory
		checkResultProduct(name, price, quantity, ims, 0, 0);
	}
	
	@Test
	public void testDeleteProductSucces() {
		IMS ims = ImsApplication.getIms();
		String name = Constants.PRODUCT_NAME;
		float price = Constants.PRODUCT_PRICE;
		int quantity = 100;
		
		try {
			ImsProductController.createProduct(name, price, quantity);
		} catch (InvalidInputException e) {
			//check that no error occured.
			fail(); 
		}
		//check model in memory
		checkResultProduct(name, price, quantity, ims, 1, 0);
		
		try {
			ImsProductController.deleteProduct(name);
		} catch (InvalidInputException e) {
			//check that no error occured.
			fail();
		}
		
		//check model in memory
		checkResultProduct(name, price, quantity, ims, 0, 0);
	}
	
	@Test
	public void testCreateProductEmpty() {
		IMS ims = ImsApplication.getIms();		
		String name = "";
		float price = 100;
		int quantity = 100;

		String error = null;
		try {
			ImsProductController.createProduct(name, price, quantity);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		// check error
		assertEquals("The name of a product cannot be empty.", error);
		// check no change in memory
		checkResultProduct(name, price, quantity, ims, 0, 0);
	}
	
	@Test
	public void testCreateProductZeroPrice() {
		IMS ims = ImsApplication.getIms();		
		String name = "product";
		float price = 0;
		int quantity = 100;

		String error = null;
		
		try {
			ImsProductController.createProduct(name, price, quantity);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		// check error
		assertEquals("The price of a product cannot be zero", error);
		// check no change in memory
		checkResultProduct(name, price, quantity, ims, 0, 0);
	}
	
	@Test
	public void testCreateProductZeroQuantity() {
		IMS ims = ImsApplication.getIms();		
		String name = "product";
		float price = 100;
		int quantity = 0;

		String error = null;
		
		try {
			ImsProductController.createProduct(name, price, quantity);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		// check error
		assertEquals("Quantity of a product cannot be less than one.", error);
		// check no change in memory
		checkResultProduct(name, price, quantity, ims, 0, 0);
	}
	
	@Test
	public void testCreateProductNegativeQuantity() {
		IMS ims = ImsApplication.getIms();		
		String name = "product";
		float price = 100;
		int quantity = -10;

		String error = null;
		
		try {
			ImsProductController.createProduct(name, price, quantity);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		// check error
		assertEquals("Quantity of a product cannot be less than one.", error);
		// check no change in memory
		checkResultProduct(name, price, quantity, ims, 0, 0);
	}
	
	@Test
	public void testCreateProductNegativePrice() {
		IMS ims = ImsApplication.getIms();		
		String name = "product";
		float price = -12;
		int quantity = 100;

		String error = null;
		
		try {
			ImsProductController.createProduct(name, price, quantity);
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		// check error
		assertEquals("The price of a product cannot be negative.", error);
		// check no change in memory
		checkResultProduct(name, price, quantity, ims, 0, 0);
	}


}
