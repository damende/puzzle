/**
 */
package CompositeStructures.Collaborations;

import CompositeStructures.InternalStructures.InternalStructuresPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CompositeStructures.Collaborations.CollaborationsFactory
 * @model kind="package"
 * @generated
 */
public interface CollaborationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Collaborations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.uml/CompositeStructures/Collaborations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Collaborations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollaborationsPackage eINSTANCE = CompositeStructures.Collaborations.impl.CollaborationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CompositeStructures.Collaborations.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.Collaborations.impl.ParameterImpl
	 * @see CompositeStructures.Collaborations.impl.CollaborationsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__END = InternalStructuresPackage.CONNECTABLE_ELEMENT__END;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = InternalStructuresPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = InternalStructuresPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.Collaborations.impl.CollaborationImpl <em>Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.Collaborations.impl.CollaborationImpl
	 * @see CompositeStructures.Collaborations.impl.CollaborationsPackageImpl#getCollaboration()
	 * @generated
	 */
	int COLLABORATION = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__FEATURE = InternalStructuresPackage.STRUCTURED_CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__COLLABORATION_USE = InternalStructuresPackage.STRUCTURED_CLASSIFIER__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__REPRESENTATION = InternalStructuresPackage.STRUCTURED_CLASSIFIER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__OWNED_CONNECTOR = InternalStructuresPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__ROLE = InternalStructuresPackage.STRUCTURED_CLASSIFIER__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__OWNED_ATTRIBUTE = InternalStructuresPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__PART = InternalStructuresPackage.STRUCTURED_CLASSIFIER__PART;

	/**
	 * The feature id for the '<em><b>Collaboration Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__COLLABORATION_ROLE = InternalStructuresPackage.STRUCTURED_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_FEATURE_COUNT = InternalStructuresPackage.STRUCTURED_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_OPERATION_COUNT = InternalStructuresPackage.STRUCTURED_CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.Collaborations.impl.BehavioredClassifierImpl <em>Behaviored Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.Collaborations.impl.BehavioredClassifierImpl
	 * @see CompositeStructures.Collaborations.impl.CollaborationsPackageImpl#getBehavioredClassifier()
	 * @generated
	 */
	int BEHAVIORED_CLASSIFIER = 2;

	/**
	 * The number of structural features of the '<em>Behaviored Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Behaviored Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORED_CLASSIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.Collaborations.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.Collaborations.impl.NamedElementImpl
	 * @see CompositeStructures.Collaborations.impl.CollaborationsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.Collaborations.impl.CollaborationUseImpl <em>Collaboration Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.Collaborations.impl.CollaborationUseImpl
	 * @see CompositeStructures.Collaborations.impl.CollaborationsPackageImpl#getCollaborationUse()
	 * @generated
	 */
	int COLLABORATION_USE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_USE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_USE__ROLE_BINDING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collaboration Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_USE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collaboration Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_USE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CompositeStructures.Collaborations.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompositeStructures.Collaborations.impl.DependencyImpl
	 * @see CompositeStructures.Collaborations.impl.CollaborationsPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 5;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CompositeStructures.Collaborations.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see CompositeStructures.Collaborations.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Collaborations.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration</em>'.
	 * @see CompositeStructures.Collaborations.Collaboration
	 * @generated
	 */
	EClass getCollaboration();

	/**
	 * Returns the meta object for the reference list '{@link CompositeStructures.Collaborations.Collaboration#getCollaborationRole <em>Collaboration Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collaboration Role</em>'.
	 * @see CompositeStructures.Collaborations.Collaboration#getCollaborationRole()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_CollaborationRole();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Collaborations.BehavioredClassifier <em>Behaviored Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviored Classifier</em>'.
	 * @see CompositeStructures.Collaborations.BehavioredClassifier
	 * @generated
	 */
	EClass getBehavioredClassifier();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Collaborations.CollaborationUse <em>Collaboration Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration Use</em>'.
	 * @see CompositeStructures.Collaborations.CollaborationUse
	 * @generated
	 */
	EClass getCollaborationUse();

	/**
	 * Returns the meta object for the reference '{@link CompositeStructures.Collaborations.CollaborationUse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see CompositeStructures.Collaborations.CollaborationUse#getType()
	 * @see #getCollaborationUse()
	 * @generated
	 */
	EReference getCollaborationUse_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link CompositeStructures.Collaborations.CollaborationUse#getRoleBinding <em>Role Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Binding</em>'.
	 * @see CompositeStructures.Collaborations.CollaborationUse#getRoleBinding()
	 * @see #getCollaborationUse()
	 * @generated
	 */
	EReference getCollaborationUse_RoleBinding();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Collaborations.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see CompositeStructures.Collaborations.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for class '{@link CompositeStructures.Collaborations.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see CompositeStructures.Collaborations.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollaborationsFactory getCollaborationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CompositeStructures.Collaborations.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.Collaborations.impl.ParameterImpl
		 * @see CompositeStructures.Collaborations.impl.CollaborationsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link CompositeStructures.Collaborations.impl.CollaborationImpl <em>Collaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.Collaborations.impl.CollaborationImpl
		 * @see CompositeStructures.Collaborations.impl.CollaborationsPackageImpl#getCollaboration()
		 * @generated
		 */
		EClass COLLABORATION = eINSTANCE.getCollaboration();

		/**
		 * The meta object literal for the '<em><b>Collaboration Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__COLLABORATION_ROLE = eINSTANCE.getCollaboration_CollaborationRole();

		/**
		 * The meta object literal for the '{@link CompositeStructures.Collaborations.impl.BehavioredClassifierImpl <em>Behaviored Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.Collaborations.impl.BehavioredClassifierImpl
		 * @see CompositeStructures.Collaborations.impl.CollaborationsPackageImpl#getBehavioredClassifier()
		 * @generated
		 */
		EClass BEHAVIORED_CLASSIFIER = eINSTANCE.getBehavioredClassifier();

		/**
		 * The meta object literal for the '{@link CompositeStructures.Collaborations.impl.CollaborationUseImpl <em>Collaboration Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.Collaborations.impl.CollaborationUseImpl
		 * @see CompositeStructures.Collaborations.impl.CollaborationsPackageImpl#getCollaborationUse()
		 * @generated
		 */
		EClass COLLABORATION_USE = eINSTANCE.getCollaborationUse();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_USE__TYPE = eINSTANCE.getCollaborationUse_Type();

		/**
		 * The meta object literal for the '<em><b>Role Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_USE__ROLE_BINDING = eINSTANCE.getCollaborationUse_RoleBinding();

		/**
		 * The meta object literal for the '{@link CompositeStructures.Collaborations.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.Collaborations.impl.NamedElementImpl
		 * @see CompositeStructures.Collaborations.impl.CollaborationsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '{@link CompositeStructures.Collaborations.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompositeStructures.Collaborations.impl.DependencyImpl
		 * @see CompositeStructures.Collaborations.impl.CollaborationsPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

	}

} //CollaborationsPackage
