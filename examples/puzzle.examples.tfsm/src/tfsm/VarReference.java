/**
 */
package tfsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tfsm.VarReference#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see tfsm.TfsmPackage#getVarReference()
 * @model
 * @generated
 */
public interface VarReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see tfsm.TfsmPackage#getVarReference_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link tfsm.VarReference#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // VarReference