/**
 */
package CompleteDSLPckg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.JoinNode#isIsCombineDuplicate <em>Is Combine Duplicate</em>}</li>
 *   <li>{@link CompleteDSLPckg.JoinNode#getJoinSpec <em>Join Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getJoinNode()
 * @model
 * @generated
 */
public interface JoinNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Is Combine Duplicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Combine Duplicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #setIsCombineDuplicate(boolean)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getJoinNode_IsCombineDuplicate()
	 * @model
	 * @generated
	 */
	boolean isIsCombineDuplicate();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.JoinNode#isIsCombineDuplicate <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #isIsCombineDuplicate()
	 * @generated
	 */
	void setIsCombineDuplicate(boolean value);

	/**
	 * Returns the value of the '<em><b>Join Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Spec</em>' containment reference.
	 * @see #setJoinSpec(ValueSpecification)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getJoinNode_JoinSpec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueSpecification getJoinSpec();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.JoinNode#getJoinSpec <em>Join Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Spec</em>' containment reference.
	 * @see #getJoinSpec()
	 * @generated
	 */
	void setJoinSpec(ValueSpecification value);

} // JoinNode
