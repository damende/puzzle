/**
 */
package fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fsm.State#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link fsm.State#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link fsm.State#getExitAction <em>Exit Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see fsm.FsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends AbstractState {

	/**
	 * Returns the value of the '<em><b>Entry Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Action</em>' containment reference.
	 * @see #setEntryAction(Block)
	 * @see fsm.FsmPackage#getState_EntryAction()
	 * @model containment="true"
	 * @generated
	 */
	Block getEntryAction();

	/**
	 * Sets the value of the '{@link fsm.State#getEntryAction <em>Entry Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Action</em>' containment reference.
	 * @see #getEntryAction()
	 * @generated
	 */
	void setEntryAction(Block value);

	/**
	 * Returns the value of the '<em><b>Do Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Action</em>' containment reference.
	 * @see #setDoAction(Block)
	 * @see fsm.FsmPackage#getState_DoAction()
	 * @model containment="true"
	 * @generated
	 */
	Block getDoAction();

	/**
	 * Sets the value of the '{@link fsm.State#getDoAction <em>Do Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Action</em>' containment reference.
	 * @see #getDoAction()
	 * @generated
	 */
	void setDoAction(Block value);

	/**
	 * Returns the value of the '<em><b>Exit Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Action</em>' containment reference.
	 * @see #setExitAction(Block)
	 * @see fsm.FsmPackage#getState_ExitAction()
	 * @model containment="true"
	 * @generated
	 */
	Block getExitAction();

	/**
	 * Sets the value of the '{@link fsm.State#getExitAction <em>Exit Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Action</em>' containment reference.
	 * @see #getExitAction()
	 * @generated
	 */
	void setExitAction(Block value);
} // State