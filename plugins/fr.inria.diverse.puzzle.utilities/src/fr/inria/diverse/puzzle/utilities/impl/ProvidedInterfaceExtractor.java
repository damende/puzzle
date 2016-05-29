package fr.inria.diverse.puzzle.utilities.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;

/**
 * Service to extract the provided interface of a metamodel from the annotations @Provided
 * @author David Mendez-Acuna
 */
public class ProvidedInterfaceExtractor {

	// ----------------------------------------------------------
	// Attributes
	// ----------------------------------------------------------
	
	private static ProvidedInterfaceExtractor instance;
	
	// ----------------------------------------------------------
	// Constructor and singleton
	// ----------------------------------------------------------
	
	private ProvidedInterfaceExtractor(){}
	
	public static ProvidedInterfaceExtractor getInstance(){
		if(instance == null)
			instance = new ProvidedInterfaceExtractor();
		return instance;
	}
	
	// ----------------------------------------------------------
	// Methods
	// ----------------------------------------------------------
	
	/**
	 * Computes the provided interface of the metamodel in the paramter from the annotations @Required
	 * @param metamodel. Input metamodel.
	 * @return
	 */
	public EPackage extractProvidedInterface(EPackage metamodel){
		EPackage providedInterface = EcoreFactory.eINSTANCE.createEPackage();
		providedInterface.setName(metamodel.getName() + "Prov");
		providedInterface.setNsPrefix(metamodel.getNsPrefix() + "Prov");
		providedInterface.setNsURI(metamodel.getNsURI() + "Prov");
		
		ArrayList<EClass> annotatedEClasses = new ArrayList<EClass>();
		this.collectProvidedEClasses(annotatedEClasses, metamodel);
		
		for (EClass annotatedEClass : annotatedEClasses) {
			providedInterface.getEClassifiers().add(this.cloneEClass(EcoreFactory.eINSTANCE, annotatedEClass));
		}
		
		return providedInterface;
	}
	
	/**
	 * Collects the eclasses contained in the ePackage annotated with @Provided. 
	 * @param eClasses. Array to store the annotated classes
	 * @param ePackage. EPackage
	 */
	private void collectProvidedEClasses(ArrayList<EClass> eClasses, EPackage ePackage){
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if(eClassifier instanceof EClass){
				EClass eClass = (EClass) eClassifier;
				if(eClass.getEAnnotation("Provided") != null)
					eClasses.add(eClass);
			}
		}
		
		for (EPackage eSubPackage : ePackage.getESubpackages()) {
			this.collectProvidedEClasses(eClasses, eSubPackage);
		}
	}
	
	/**
	 * Clones a EClass in the parameter by using the ECORE factory.
	 * @param ecoreFactory
	 * @param oldClass
	 * @return newClass A clone of the target class.
	 */
	public EClass cloneEClass(EcoreFactory ecoreFactory, EClass oldClass) {
		EClass newClass = ecoreFactory.createEClass();
		newClass.setName(oldClass.getName());
		newClass.setAbstract(oldClass.isAbstract());
		newClass.setInterface(oldClass.isInterface());
		
		//Clone the attributes
		for (EAttribute eAttribute : oldClass.getEAttributes()) {
			EAttribute newAttribute = ecoreFactory.createEAttribute();
			newAttribute.setName(eAttribute.getName());
			if(!(eAttribute.getEType() instanceof EEnum)){
				newAttribute.setEType(eAttribute.getEType());
				newClass.getEStructuralFeatures().add(newAttribute);
			} 
			
			for(EAnnotation annotation : eAttribute.getEAnnotations()){
				EAnnotation newEAnnotation = ecoreFactory.createEAnnotation();
				newEAnnotation.setSource(annotation.getSource());
				newAttribute.getEAnnotations().add(newEAnnotation);
			}
		}
		
//		//Clone the references
//		for (EReference eReference : oldClass.getEReferences()) {
//			EReference newEReference = ecoreFactory.createEReference();
//			newEReference.setName(eReference.getName());
//			newEReference.setLowerBound(eReference.getLowerBound());
//			newEReference.setUpperBound(eReference.getUpperBound());
//			newEReference.setContainment(eReference.isContainment());
//			newEReference.setChangeable(eReference.isChangeable());
//			newEReference.setDerived(eReference.isDerived());
//			newClass.getEStructuralFeatures().add(newEReference);
//			
//			for(EAnnotation eAnnotation : eReference.getEAnnotations()){
//				EAnnotation newEAnnotation = ecoreFactory.createEAnnotation();
//				newEAnnotation.setSource(eAnnotation.getSource());
//				newEReference.getEAnnotations().add(newEAnnotation);
//			}
//		}
		
		//Clone the operations
		for (EOperation operation : oldClass.getEOperations()) {
				EOperation newOperation = ecoreFactory.createEOperation();
				newOperation.setName(operation.getName());
				
				// Clone the parameters of the operation... 
				for(EParameter _parameter : operation.getEParameters()){
					EParameter newParameter = ecoreFactory.createEParameter();
					newParameter.setName(_parameter.getName());
					newParameter.setOrdered(_parameter.isOrdered());
					newParameter.setUnique(_parameter.isUnique());
					newParameter.setLowerBound(_parameter.getLowerBound());
					newParameter.setUpperBound(_parameter.getUpperBound());
					newOperation.getEParameters().add(newParameter);
				}
				newClass.getEOperations().add(newOperation);
		}
		
		//Clone the annotations
		for(EAnnotation annotation : oldClass.getEAnnotations()){
			EAnnotation newEAnnotation = ecoreFactory.createEAnnotation();
			newEAnnotation.setSource(annotation.getSource());
			newClass.getEAnnotations().add(newEAnnotation);
		}
		return newClass;
	}
}