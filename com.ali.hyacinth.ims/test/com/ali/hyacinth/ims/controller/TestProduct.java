package com.ali.hyacinth.ims.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsFactory;
import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.util.ImsResourceFactoryImpl;
import com.ali.hyacinth.ims.util.ResourceHelper;
import com.ali.hyacinth.ims.controller.Constants;
import com.ali.hyacinth.ims.resource.ImsResource;

class TestProduct {

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
		
		try {
			ImsController.createProduct(name, price);
		} catch (InvalidInputException e) {
			// check that no error occurred
			fail();
		}
		
		// check model in memory
		checkResultProduct(name, price, ims, 1);
		
	}
	
	private void checkResultProduct(String name, float price, IMS ims, int numberOfProducts) {
		assertEquals(numberOfProducts, ims.getProducts().size());
		if (numberOfProducts > 0) {
			assertEquals(name, ims.getProducts().get(0).getName());
			assertEquals(0, ims.getProducts().get(0).getItems().size());
		}
	}
	
	@Test
	public void testCheck() {
		IMS ims = ImsApplication.getIms();
		String name = "product2";
		float price = 200;
		
		try {
			ImsController.createProduct(name, price);
		} catch (InvalidInputException e) {
			// check that no error occurred
			fail();
		}
		// check model in memory
				checkResultProduct(name, price, ims, 1);
	}

}
