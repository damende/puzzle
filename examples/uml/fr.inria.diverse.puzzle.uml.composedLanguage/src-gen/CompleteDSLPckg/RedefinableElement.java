/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redefinable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.RedefinableElement#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link CompleteDSLPckg.RedefinableElement#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link CompleteDSLPckg.RedefinableElement#getRedefinitionContext <em>Redefinition Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getRedefinableElement()
 * @model abstract="true"
 * @generated
 */
public interface RedefinableElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Leaf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Leaf</em>' attribute.
	 * @see #setIsLeaf(boolean)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getRedefinableElement_IsLeaf()
	 * @model
	 * @generated
	 */
	boolean isIsLeaf();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.RedefinableElement#isIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #isIsLeaf()
	 * @generated
	 */
	void setIsLeaf(boolean value);

	/**
	 * Returns the value of the '<em><b>Redefined Element</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.RedefinableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Element</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getRedefinableElement_RedefinedElement()
	 * @model
	 * @generated
	 */
	EList<RedefinableElement> getRedefinedElement();

	/**
	 * Returns the value of the '<em><b>Redefinition Context</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefinition Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefinition Context</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getRedefinableElement_RedefinitionContext()
	 * @model
	 * @generated
	 */
	EList<Classifier> getRedefinitionContext();

} // RedefinableElement