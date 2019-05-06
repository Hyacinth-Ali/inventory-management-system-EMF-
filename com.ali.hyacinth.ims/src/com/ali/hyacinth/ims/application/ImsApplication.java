package com.ali.hyacinth.ims.application;

import org.eclipse.emf.ecore.resource.Resource;

import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsFactory;
import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.resource.ImsResource;
import com.ali.hyacinth.ims.util.ImsResourceFactoryImpl;
import com.ali.hyacinth.ims.util.ResourceHelper;


public class ImsApplication {
	
	private static IMS ims;

	public static void main(String[] args) {
		/**
		 * Initialize ims package
		 */
		ImsPackage.eINSTANCE.eClass();
		
		/**
         * Set resource factory
         */
        ResourceHelper.INSTANCE.addResourceFactory("ims", new ImsResourceFactoryImpl());   
		
		/**
		 * Start application
		 */

	}
	
	/**
	 * Get ims from data base or create new one if doesn't exist.
	 * @return ims
	 */
	public static IMS getIms() {
		if (ims == null) {
			//load from resource
			ims = ImsResource.load();
		}  
        return ims;
		
	}
	
	/**
	 * unloads ims from data base.
	 * @return ims
	 */
	public static void unloadIms() {
		if (ims != null) {
			if (ims.eResource() != null) {
				Resource resource = ims.eResource();
				resource.unload();
			}
		}
		
	}

	
	/**
	 * Saves model in resource
	 * @param ims to be saved
	 *//*
	public static void save(IMS ims) {
		String file = "resource/" + ims.getFileName() + ".ims";
		ResourceHelper.INSTANCE.saveResource(ims, file);
		currentIMS = ims;
	}

	public static String getFileName() {
		return fileName;
	}*/
	
	

}
