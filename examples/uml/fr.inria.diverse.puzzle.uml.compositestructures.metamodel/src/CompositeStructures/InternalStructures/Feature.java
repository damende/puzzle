/**
 */
package CompositeStructures.InternalStructures;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompositeStructures.InternalStructures.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompositeStructures.InternalStructures.InternalStructuresPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Featuring Classifier</b></em>' reference list.
	 * The list contents are of type {@link CompositeStructures.InternalStructures.Classifier}.
	 * It is bidirectional and its opposite is '{@link CompositeStructures.InternalStructures.Classifier#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featuring Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuring Classifier</em>' reference list.
	 * @see CompositeStructures.InternalStructures.InternalStructuresPackage#getFeature_FeaturingClassifier()
	 * @see CompositeStructures.InternalStructures.Classifier#getFeature
	 * @model opposite="feature"
	 * @generated
	 */
	EList<Classifier> getFeaturingClassifier();

} // Feature
