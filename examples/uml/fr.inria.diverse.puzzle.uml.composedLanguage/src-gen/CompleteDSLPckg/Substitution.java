/**
 */
package CompleteDSLPckg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}</li>
 *   <li>{@link CompleteDSLPckg.Substitution#getContract <em>Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getSubstitution()
 * @model
 * @generated
 */
public interface Substitution extends Realization {
	/**
	 * Returns the value of the '<em><b>Substituting Classifier</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Classifier#getSubstitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substituting Classifier</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substituting Classifier</em>' container reference.
	 * @see #setSubstitutingClassifier(Classifier)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getSubstitution_SubstitutingClassifier()
	 * @see CompleteDSLPckg.Classifier#getSubstitution
	 * @model opposite="substitution" required="true" transient="false"
	 * @generated
	 */
	Classifier getSubstitutingClassifier();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substituting Classifier</em>' container reference.
	 * @see #getSubstitutingClassifier()
	 * @generated
	 */
	void setSubstitutingClassifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference.
	 * @see #setContract(Classifier)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getSubstitution_Contract()
	 * @model required="true"
	 * @generated
	 */
	Classifier getContract();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Substitution#getContract <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Classifier value);

} // Substitution
