/**
 */
package Multivar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Variability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Multivar.LanguageVariability#getVariabilityPoints <em>Variability Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see Multivar.MultivarPackage#getLanguageVariability()
 * @model
 * @generated
 */
public interface LanguageVariability extends EObject {
	/**
	 * Returns the value of the '<em><b>Variability Points</b></em>' containment reference list.
	 * The list contents are of type {@link Multivar.VariabilityPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variability Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variability Points</em>' containment reference list.
	 * @see Multivar.MultivarPackage#getLanguageVariability_VariabilityPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariabilityPoint> getVariabilityPoints();

} // LanguageVariability