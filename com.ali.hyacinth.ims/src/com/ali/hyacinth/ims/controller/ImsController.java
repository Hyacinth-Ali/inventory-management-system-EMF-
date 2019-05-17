package com.ali.hyacinth.ims.controller;

import com.ali.hyacinth.ims.EmployeeRole;
import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.Manager;
import com.ali.hyacinth.ims.application.ImsApplication;
import com.ali.hyacinth.ims.resource.ImsResource;

public class ImsController {
	
	public static void saveIMS() throws InvalidInputException {
		EmployeeRole employee = ImsApplication.getCurrentEmployee();
		String error = "";
		if (!(employee instanceof Manager)) {
			error = "Manager privileges are required to save.";
		} 
		if (error.equals("")) {
			try {
				IMS ims = ImsApplication.getIms();
				ImsResource.save(ims);
				//ImsApplication.unloadIms();
			} catch (RuntimeException e) {
				throw new InvalidInputException(e.getMessage());
			}
		} else {
			throw new InvalidInputException(error);
		}
	}
	
	public static void login(String username, String password) throws InvalidInputException {
		EmployeeRole currentEmployee = ImsApplication.getCurrentEmployee();
		Manager manager = ImsPersonController.findManager(username);
		String error = "";
		//Person person = User.getWithUsername(username);
		if (currentEmployee != null) {
			error = "Cannot login while a person is already logged in.";
		} else if (manager == null) {
			error = "The manager does not exist.";
		} else {
			if (manager.getPassword().equals(password)) {
				ImsApplication.setCurrentEmployee(manager);
				ImsApplication.resetBlock223();
				return;	
			}
			error = "The username and password do not match.";
		}
		if (error.length() > 0) {
			throw new InvalidInputException(error);
		}
	}

	public static void logout() throws InvalidInputException {
		ImsResource.save(ImsApplication.getIms());
		ImsApplication.setCurrentEmployee(null);
	}

}
