/**
 */
package StateMachines.BehaviorStateMachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StateMachines.BehaviorStateMachines.StateMachine#getRegion <em>Region</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.StateMachine#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.StateMachine#getSubmachineState <em>Submachine State</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.StateMachine#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends Behavior {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link StateMachines.BehaviorStateMachines.Region}.
	 * It is bidirectional and its opposite is '{@link StateMachines.BehaviorStateMachines.Region#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getStateMachine_Region()
	 * @see StateMachines.BehaviorStateMachines.Region#getStateMachine
	 * @model opposite="stateMachine" containment="true" required="true"
	 * @generated
	 */
	EList<Region> getRegion();

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link StateMachines.BehaviorStateMachines.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getStateMachine_ConnectionPoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pseudostate> getConnectionPoint();

	/**
	 * Returns the value of the '<em><b>Submachine State</b></em>' reference list.
	 * The list contents are of type {@link StateMachines.BehaviorStateMachines.State}.
	 * It is bidirectional and its opposite is '{@link StateMachines.BehaviorStateMachines.State#getSubmachine <em>Submachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submachine State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submachine State</em>' reference list.
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getStateMachine_SubmachineState()
	 * @see StateMachines.BehaviorStateMachines.State#getSubmachine
	 * @model opposite="submachine"
	 * @generated
	 */
	EList<State> getSubmachineState();

	/**
	 * Returns the value of the '<em><b>Extended State Machine</b></em>' reference list.
	 * The list contents are of type {@link StateMachines.BehaviorStateMachines.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended State Machine</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended State Machine</em>' reference list.
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getStateMachine_ExtendedStateMachine()
	 * @model
	 * @generated
	 */
	EList<StateMachine> getExtendedStateMachine();

} // StateMachine