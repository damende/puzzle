/**
 */
package Activities.ExtraStructuredActivities;

import Activities.BasicActivities.ObjectNode;

import Activities.IntermediateActivities.Element;

import Activities.StructuredActivities.ExecutableNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.ExtraStructuredActivities.ExceptionHandler#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link Activities.ExtraStructuredActivities.ExceptionHandler#getProtectedNode <em>Protected Node</em>}</li>
 *   <li>{@link Activities.ExtraStructuredActivities.ExceptionHandler#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link Activities.ExtraStructuredActivities.ExceptionHandler#getExceptionType <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExceptionHandler()
 * @model
 * @generated
 */
public interface ExceptionHandler extends Element {
	/**
	 * Returns the value of the '<em><b>Handler Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Body</em>' reference.
	 * @see #setHandlerBody(ExecutableNode)
	 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExceptionHandler_HandlerBody()
	 * @model required="true"
	 * @generated
	 */
	ExecutableNode getHandlerBody();

	/**
	 * Sets the value of the '{@link Activities.ExtraStructuredActivities.ExceptionHandler#getHandlerBody <em>Handler Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Body</em>' reference.
	 * @see #getHandlerBody()
	 * @generated
	 */
	void setHandlerBody(ExecutableNode value);

	/**
	 * Returns the value of the '<em><b>Protected Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Activities.StructuredActivities.ExecutableNode#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected Node</em>' container reference.
	 * @see #setProtectedNode(ExecutableNode)
	 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExceptionHandler_ProtectedNode()
	 * @see Activities.StructuredActivities.ExecutableNode#getHandler
	 * @model opposite="handler" required="true" transient="false"
	 * @generated
	 */
	ExecutableNode getProtectedNode();

	/**
	 * Sets the value of the '{@link Activities.ExtraStructuredActivities.ExceptionHandler#getProtectedNode <em>Protected Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected Node</em>' container reference.
	 * @see #getProtectedNode()
	 * @generated
	 */
	void setProtectedNode(ExecutableNode value);

	/**
	 * Returns the value of the '<em><b>Exception Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Input</em>' reference.
	 * @see #setExceptionInput(ObjectNode)
	 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExceptionHandler_ExceptionInput()
	 * @model required="true"
	 * @generated
	 */
	ObjectNode getExceptionInput();

	/**
	 * Sets the value of the '{@link Activities.ExtraStructuredActivities.ExceptionHandler#getExceptionInput <em>Exception Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Input</em>' reference.
	 * @see #getExceptionInput()
	 * @generated
	 */
	void setExceptionInput(ObjectNode value);

	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' reference list.
	 * The list contents are of type {@link Activities.ExtraStructuredActivities.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Type</em>' reference list.
	 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExceptionHandler_ExceptionType()
	 * @model required="true"
	 * @generated
	 */
	EList<Classifier> getExceptionType();

} // ExceptionHandler