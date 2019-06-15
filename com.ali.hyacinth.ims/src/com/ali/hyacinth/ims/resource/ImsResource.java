package com.ali.hyacinth.ims.resource;

import java.io.File;

import org.eclipse.emf.ecore.resource.Resource;

import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsFactory;
import com.ali.hyacinth.ims.controller.InvalidInputException;
import com.ali.hyacinth.ims.util.ResourceHelper;

public class ImsResource {
	
private static String filename = "vitalisdata";
	
	public static void save(IMS ims) throws InvalidInputException {
		try {
			String file = "resource/" + filename + ".ims";
			ResourceHelper.INSTANCE.saveResource(ims, file);
		} catch (RuntimeException e) {
			throw new InvalidInputException("Could not save data to file "+ filename + ".");
		}
		
	}
	
	public static IMS load() {
		String filePath = "resource/" + filename + ".ims";
		File file = new File(filePath);
		IMS ims = null;
		if (file.exists()) {
			Resource resource = ResourceHelper.INSTANCE.loadResource(filePath);
	        //Get the root object.
	        ims = (IMS) resource.getContents().get(0);
		} else {
			//create new model
			ims = ImsFactory.eINSTANCE.createIMS();
		}
        return ims;
	}
	
	public static void setFilename(String newFilename) {
		filename = newFilename;
	}


}
