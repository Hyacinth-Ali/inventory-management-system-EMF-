package com.ali.hyacinth.ims.controller;

import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsFactory;
import com.ali.hyacinth.ims.ItemStatus;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.resource.ImsResource;
import com.ali.hyacinth.ims.transferobjects.TOProduct;

public class ImsProductController {
	
	public static void callCreateProduct() throws InvalidInputException {
		String itemFile = "items/items.csv";
		File file = new File(itemFile);
		try {
			Scanner input = new Scanner(file);
			input.nextLine();
			while (input.hasNext()) {
				String items = input.nextLine();
				String[] values = items.split(",");
				String name = values[0].trim();
				int quantity = Integer.parseInt(values[1].trim());
				float price = Float.parseFloat(values[2].trim());
				//System.out.println(name +" " + quantity + " " + price);
				createProduct(name, price, quantity);
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Creates an instance of a product.
	 * @param name of the product.
	 * @param price of an item of the product
	 * @throws InvalidInputException and exception that can be thrown.
	 */
	public static void createProduct(String name, float price, int quantity) throws InvalidInputException {
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
		if (quantity <= 0) {
			error = "Quantity of a product cannot be less than one.";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		IMS ims = ImsApplication.getIms();
		for (Product p : ims.getProducts()) {
			if (p.getName().equals(name)) {
				System.out.println(name);
				throw new InvalidInputException("The product already exist.");
			}
		}
		try {
			Product product = ImsFactory.eINSTANCE.createProduct();
			product.setName(name);
			product.setItemPrice(price);
			product.setQuantity(quantity);
			ims.getProducts().add(product);
			//ImsResource.save(ims);
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
		
	}
	
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
	public static Product findProduct(String name) {
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
			TOProduct toProduct = new TOProduct();
			toProduct.setItemPrice(p.getItemPrice());
			toProduct.setName(p.getName());
			toProduct.setQuantity(p.getQuantity());
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
		String error = "";
		if (oldName == null || oldName.length() == 0) {
			error = "The name of a product cannot be empty.";
		} else if (newName == null || newName.length() == 0) {
			error = "Name of a product cannot be empty.";
		} 
		for (Product p : ImsApplication.getIms().getProducts()) {
			if (p.getName().equals(newName)) {
				error = "The product name already exist.";
			}
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		
		Product product = findProduct(oldName);
		if (product != null) {
			try {
				product.setName(newName);
				ImsResource.save((IMS)product.eContainer());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		} else {
			throw new InvalidInputException("The product does not exist.");
		}
	}
	
	/**
	 * Updates product price.
	 * @param name of the product.
	 * @param newPrice new price of the product.
	 * @throws InvalidInputException
	 */
	public static void updateProductPrice(String name, float newPrice) throws InvalidInputException {
		String error = "";
		if (name == null || name.length() == 0) {
			error = "The name of a product cannot be empty.";
		}
		if (newPrice <= 0) {
			error = "Price of a product cannot be less than zero or negative.";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		Product product = findProduct(name);
		if (product != null) {
			try {
				product.setItemPrice(newPrice);
				ImsResource.save((IMS)product.eContainer());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		} else {
			throw new InvalidInputException("The product does not exist");
		}
	}
	
	/**
	 * Updates product price.
	 * @param name of the product.
	 * @param newPrice new price of the product.
	 * @throws InvalidInputException
	 */
	public static void updateProductQuantity(String name, int newQuantity) throws InvalidInputException {
		String error = "";
		if (name == null || name.length() == 0) {
			error = "The name of a product cannot be empty.";
		}
		if (newQuantity <= 0) {
			error = "Quantity of a product cannot be less than zero or negative.";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		Product product = findProduct(name);
		if (product != null) {
			try {
				product.setQuantity(newQuantity);
				ImsResource.save((IMS)product.eContainer());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		} else {
			throw new InvalidInputException("The product does not exist");
		}
	}
	
	/**
	 * Updates product quantity.
	 * @param name of the product.
	 * @param newPrice new price of the product.
	 * @throws InvalidInputException
	 */
	public static void addProductItem(String name, int newQuantity) throws InvalidInputException {
		String error = "";
		if (name == null || name.length() == 0) {
			error = "The name of a product cannot be empty.";
		}
		if (newQuantity < 0) {
			error = "Quantity of a product cannot be less than zero.";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
		Product product = findProduct(name);
		if (product != null) {
			try {
				product.setQuantity(product.getQuantity() + newQuantity);
				ImsResource.save((IMS)product.eContainer());
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
			
		} else {
			throw new InvalidInputException("The product does not exist.");
		}
	}
	
}
