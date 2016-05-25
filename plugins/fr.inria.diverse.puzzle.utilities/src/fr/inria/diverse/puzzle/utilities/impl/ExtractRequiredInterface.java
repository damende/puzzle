package fr.inria.diverse.puzzle.utilities.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
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
		
		ArrayList<EClass> annotatedEClasses = new ArrayList<EClass>();
		this.collectRequiredEClasses(annotatedEClasses, metamodel);
		
		for (EClass annotatedEClass : annotatedEClasses) {
			requiredInterface.getEClassifiers().add(annotatedEClass);
		}
		
		return requiredInterface;
	}
	
	/**
	 * Collects the eclasses contained in the ePackage annotated with @Required. 
	 * @param eClasses. Array to store the annotated classes
	 * @param ePackage. EPackage
	 */
	private void collectRequiredEClasses(ArrayList<EClass> eClasses, EPackage ePackage){
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if(eClassifier instanceof EClass){
				EClass eClass = (EClass) eClassifier;
				if(eClass.getEAnnotation("Required") != null)
					eClasses.add(eClass);
			}
		}
		
		for (EPackage eSubPackage : ePackage.getESubpackages()) {
			this.collectRequiredEClasses(eClasses, eSubPackage);
		}
	}
}
