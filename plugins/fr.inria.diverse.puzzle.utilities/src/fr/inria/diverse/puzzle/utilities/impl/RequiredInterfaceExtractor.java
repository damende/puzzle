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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;

import fr.inria.diverse.k3.sle.common.utils.EcoreQueries;

/**
 * Service to extract the required interface of a metamodel from the annotations @Required
 * @author David Mendez-Acuna
 */
public class RequiredInterfaceExtractor {

	// ----------------------------------------------------------
	// Attributes
	// ----------------------------------------------------------
	
	private static RequiredInterfaceExtractor instance;
	
	// ----------------------------------------------------------
	// Constructor and singleton
	// ----------------------------------------------------------
	
	private RequiredInterfaceExtractor(){}
	
	public static RequiredInterfaceExtractor getInstance(){
		if(instance == null)
			instance = new RequiredInterfaceExtractor();
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
			requiredInterface.getEClassifiers().add(this.cloneEClass(EcoreFactory.eINSTANCE, annotatedEClass));
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
			if(!(eAttribute.getEType() instanceof EEnum)) newAttribute.setEType(eAttribute.getEType());
			newClass.getEStructuralFeatures().add(newAttribute);
			
			for(EAnnotation annotation : eAttribute.getEAnnotations()){
				EAnnotation newEAnnotation = ecoreFactory.createEAnnotation();
				newEAnnotation.setSource(annotation.getSource());
				newAttribute.getEAnnotations().add(newEAnnotation);
			}
		}
		
		//Clone the references
		for (EReference eReference : oldClass.getEReferences()) {
			EReference newEReference = ecoreFactory.createEReference();
			newEReference.setName(eReference.getName());
			newEReference.setLowerBound(eReference.getLowerBound());
			newEReference.setUpperBound(eReference.getUpperBound());
			newEReference.setContainment(eReference.isContainment());
			newEReference.setChangeable(eReference.isChangeable());
			newEReference.setDerived(eReference.isDerived());
			newClass.getEStructuralFeatures().add(newEReference);
			
			for(EAnnotation eAnnotation : eReference.getEAnnotations()){
				EAnnotation newEAnnotation = ecoreFactory.createEAnnotation();
				newEAnnotation.setSource(eAnnotation.getSource());
				newEReference.getEAnnotations().add(newEAnnotation);
			}
		}
		
		//Clone the operations
		for (EOperation operation : oldClass.getEOperations()) {
				EOperation newOperation = ecoreFactory.createEOperation();
				newOperation.setName(operation.getName());
				EClassifier operationType = EcoreQueries.searchNativeTypeByName(operation.getEType().getName());
				newOperation.setEType(operationType);
				
				// Clone the parameters of the operation... 
				for(EParameter _parameter : operation.getEParameters()){
					EParameter newParameter = ecoreFactory.createEParameter();
					newParameter.setName(_parameter.getName());
					newParameter.setOrdered(_parameter.isOrdered());
					newParameter.setUnique(_parameter.isUnique());
					newParameter.setLowerBound(_parameter.getLowerBound());
					newParameter.setUpperBound(_parameter.getUpperBound());
					EClassifier eType = EcoreQueries.searchNativeTypeByName(_parameter.getEType().getName());
					newParameter.setEType(eType);
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