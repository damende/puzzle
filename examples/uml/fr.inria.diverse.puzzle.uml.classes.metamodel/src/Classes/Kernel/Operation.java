/**
 */
package Classes.Kernel;

import Classes.Interfaces.Interface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Kernel.Operation#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link Classes.Kernel.Operation#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link Classes.Kernel.Operation#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link Classes.Kernel.Operation#getUpper <em>Upper</em>}</li>
 *   <li>{@link Classes.Kernel.Operation#getLower <em>Lower</em>}</li>
 *   <li>{@link Classes.Kernel.Operation#getType <em>Type</em>}</li>
 *   <li>{@link Classes.Kernel.Operation#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link Classes.Kernel.Operation#getBodyCondition <em>Body Condition</em>}</li>
 *   <li>{@link Classes.Kernel.Operation#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link Classes.Kernel.Operation#getClass_ <em>Class</em>}</li>
 *   <li>{@link Classes.Kernel.Operation#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Classes.Kernel.Operation#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Kernel.KernelPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends BehavioralFeature {
	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(boolean)
	 * @see Classes.Kernel.KernelPackage#getOperation_IsQuery()
	 * @model
	 * @generated
	 */
	boolean isIsQuery();

	/**
	 * Sets the value of the '{@link Classes.Kernel.Operation#isIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #isIsQuery()
	 * @generated
	 */
	void setIsQuery(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see Classes.Kernel.KernelPackage#getOperation_IsOrdered()
	 * @model
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link Classes.Kernel.Operation#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see Classes.Kernel.KernelPackage#getOperation_IsUnique()
	 * @model
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link Classes.Kernel.Operation#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see Classes.Kernel.KernelPackage#getOperation_Upper()
	 * @model
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link Classes.Kernel.Operation#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see Classes.Kernel.KernelPackage#getOperation_Lower()
	 * @model
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link Classes.Kernel.Operation#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see Classes.Kernel.KernelPackage#getOperation_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link Classes.Kernel.Operation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Kernel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see Classes.Kernel.KernelPackage#getOperation_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Body Condition</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Kernel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Condition</em>' containment reference list.
	 * @see Classes.Kernel.KernelPackage#getOperation_BodyCondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getBodyCondition();

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Kernel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference list.
	 * @see Classes.Kernel.KernelPackage#getOperation_Postcondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getPostcondition();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Classes.Kernel.Class#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass(Classes.Kernel.Class)
	 * @see Classes.Kernel.KernelPackage#getOperation_Class()
	 * @see Classes.Kernel.Class#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false"
	 * @generated
	 */
	Classes.Kernel.Class getClass_();

	/**
	 * Sets the value of the '{@link Classes.Kernel.Operation#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(Classes.Kernel.Class value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Classes.Kernel.DataType#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' container reference.
	 * @see #setDataType(DataType)
	 * @see Classes.Kernel.KernelPackage#getOperation_DataType()
	 * @see Classes.Kernel.DataType#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link Classes.Kernel.Operation#getDataType <em>Data Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' container reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Classes.Interfaces.Interface#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(Interface)
	 * @see Classes.Kernel.KernelPackage#getOperation_Interface()
	 * @see Classes.Interfaces.Interface#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link Classes.Kernel.Operation#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // Operation
