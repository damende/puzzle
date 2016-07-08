/**
 */
package Classes.Kernel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Kernel.DirectedRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link Classes.Kernel.DirectedRelationship#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Kernel.KernelPackage#getDirectedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface DirectedRelationship extends Relationship {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link Classes.Kernel.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see Classes.Kernel.KernelPackage#getDirectedRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<Element> getTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link Classes.Kernel.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see Classes.Kernel.KernelPackage#getDirectedRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	EList<Element> getSource();

} // DirectedRelationship
