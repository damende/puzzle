/**
 */
package Multivar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Multivar.MultivarPackage
 * @generated
 */
public interface MultivarFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultivarFactory eINSTANCE = Multivar.impl.MultivarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Language Product Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Product Line</em>'.
	 * @generated
	 */
	LanguageProductLine createLanguageProductLine();

	/**
	 * Returns a new object of class '<em>Product Line Variability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Line Variability</em>'.
	 * @generated
	 */
	ProductLineVariability createProductLineVariability();

	/**
	 * Returns a new object of class '<em>Language Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Feature</em>'.
	 * @generated
	 */
	LanguageFeature createLanguageFeature();

	/**
	 * Returns a new object of class '<em>Mandatory Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mandatory Child</em>'.
	 * @generated
	 */
	MandatoryChild createMandatoryChild();

	/**
	 * Returns a new object of class '<em>Optional Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optional Child</em>'.
	 * @generated
	 */
	OptionalChild createOptionalChild();

	/**
	 * Returns a new object of class '<em>Or Group Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Group Child</em>'.
	 * @generated
	 */
	OrGroupChild createOrGroupChild();

	/**
	 * Returns a new object of class '<em>Alternative Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative Group</em>'.
	 * @generated
	 */
	AlternativeGroup createAlternativeGroup();

	/**
	 * Returns a new object of class '<em>Language Variability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Variability</em>'.
	 * @generated
	 */
	LanguageVariability createLanguageVariability();

	/**
	 * Returns a new object of class '<em>Variability Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variability Point</em>'.
	 * @generated
	 */
	VariabilityPoint createVariabilityPoint();

	/**
	 * Returns a new object of class '<em>Variation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variation</em>'.
	 * @generated
	 */
	Variation createVariation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MultivarPackage getMultivarPackage();

} //MultivarFactory