/**
 */
package CompleteDSLPckg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.ArithmeticExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link CompleteDSLPckg.ArithmeticExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link CompleteDSLPckg.ArithmeticExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getArithmeticExpression()
 * @model
 * @generated
 */
public interface ArithmeticExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link CompleteDSLPckg.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see CompleteDSLPckg.ArithmeticOperator
	 * @see #setOperator(ArithmeticOperator)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getArithmeticExpression_Operator()
	 * @model
	 * @generated
	 */
	ArithmeticOperator getOperator();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ArithmeticExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see CompleteDSLPckg.ArithmeticOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ArithmeticOperator value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getArithmeticExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ArithmeticExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getArithmeticExpression_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ArithmeticExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // ArithmeticExpression