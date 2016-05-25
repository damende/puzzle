package fr.inria.diverse.puzzle.utilities.impl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

/**
 * Service to extract the required interface of a metamodel from the annotations @Required
 * @author David Mendez-Acuna
 */
public class ExtractRequiredInterface {

	// ----------------------------------------------------------
	// Attributes
	// ----------------------------------------------------------
	
	private static ExtractRequiredInterface instance;
	
	// ----------------------------------------------------------
	// Constructor and singleton
	// ----------------------------------------------------------
	
	private ExtractRequiredInterface(){}
	
	public static ExtractRequiredInterface getInstance(){
		if(instance == null)
			instance = new ExtractRequiredInterface();
		return instance;
	}
	
	// ----------------------------------------------------------
	// Methods
	// ----------------------------------------------------------
	
	/**
	 * Computes the required interface of the metamodel in the paramter from the annotations @Required
	 * @param metamodel. Input metamodel.
	 * @return
	 */
	public EPackage extractRequiredInterface(EPackage metamodel){
		EPackage requiredInterface = EcoreFactory.eINSTANCE.createEPackage();
		requiredInterface.setName(metamodel.getName() + "Req");
		requiredInterface.setNsPrefix(metamodel.getNsPrefix() + "Req");
		requiredInterface.setNsURI(metamodel.getNsURI() + "Req");
		
		
		
		return requiredInterface;
	}
}
