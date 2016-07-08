/**
 */
package Classes.Dependencies;

import Classes.Kernel.DirectedRelationship;
import Classes.Kernel.NamedElement;
import Classes.Kernel.PackageableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Dependencies.Dependency#getClient <em>Client</em>}</li>
 *   <li>{@link Classes.Dependencies.Dependency#getSupplier <em>Supplier</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Dependencies.DependenciesPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends PackageableElement, DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference list.
	 * The list contents are of type {@link Classes.Kernel.NamedElement}.
	 * It is bidirectional and its opposite is '{@link Classes.Kernel.NamedElement#getClientDependency <em>Client Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference list.
	 * @see Classes.Dependencies.DependenciesPackage#getDependency_Client()
	 * @see Classes.Kernel.NamedElement#getClientDependency
	 * @model opposite="clientDependency" required="true"
	 * @generated
	 */
	EList<NamedElement> getClient();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference list.
	 * The list contents are of type {@link Classes.Kernel.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference list.
	 * @see Classes.Dependencies.DependenciesPackage#getDependency_Supplier()
	 * @model required="true"
	 * @generated
	 */
	EList<NamedElement> getSupplier();

} // Dependency