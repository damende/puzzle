/**
 */
package CompositeStructures.Collaborations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompositeStructures.Collaborations.CollaborationUse#getType <em>Type</em>}</li>
 *   <li>{@link CompositeStructures.Collaborations.CollaborationUse#getRoleBinding <em>Role Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompositeStructures.Collaborations.CollaborationsPackage#getCollaborationUse()
 * @model
 * @generated
 */
public interface CollaborationUse extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Collaboration)
	 * @see CompositeStructures.Collaborations.CollaborationsPackage#getCollaborationUse_Type()
	 * @model required="true"
	 * @generated
	 */
	Collaboration getType();

	/**
	 * Sets the value of the '{@link CompositeStructures.Collaborations.CollaborationUse#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Collaboration value);

	/**
	 * Returns the value of the '<em><b>Role Binding</b></em>' containment reference list.
	 * The list contents are of type {@link CompositeStructures.Collaborations.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Binding</em>' containment reference list.
	 * @see CompositeStructures.Collaborations.CollaborationsPackage#getCollaborationUse_RoleBinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getRoleBinding();

} // CollaborationUse