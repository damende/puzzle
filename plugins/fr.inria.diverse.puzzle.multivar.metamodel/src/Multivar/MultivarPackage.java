/**
 */
package Multivar;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see Multivar.MultivarFactory
 * @model kind="package"
 * @generated
 */
public interface MultivarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Multivar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.puzzle.multivar.metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Multivar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultivarPackage eINSTANCE = Multivar.impl.MultivarPackageImpl.init();

	/**
	 * The meta object id for the '{@link Multivar.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Multivar.impl.NamedElementImpl
	 * @see Multivar.impl.MultivarPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Multivar.impl.LanguageProductLineImpl <em>Language Product Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Multivar.impl.LanguageProductLineImpl
	 * @see Multivar.impl.MultivarPackageImpl#getLanguageProductLine()
	 * @generated
	 */
	int LANGUAGE_PRODUCT_LINE = 1;

	/**
	 * The feature id for the '<em><b>Implementation File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PRODUCT_LINE__IMPLEMENTATION_FILE = 0;

	/**
	 * The feature id for the '<em><b>Product Line Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PRODUCT_LINE__PRODUCT_LINE_VARIABILITY = 1;

	/**
	 * The feature id for the '<em><b>Language Variability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PRODUCT_LINE__LANGUAGE_VARIABILITY = 2;

	/**
	 * The number of structural features of the '<em>Language Product Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PRODUCT_LINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Language Product Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PRODUCT_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Multivar.impl.ProductLineVariabilityImpl <em>Product Line Variability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Multivar.impl.ProductLineVariabilityImpl
	 * @see Multivar.impl.MultivarPackageImpl#getProductLineVariability()
	 * @generated
	 */
	int PRODUCT_LINE_VARIABILITY = 2;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LINE_VARIABILITY__ROOT_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LINE_VARIABILITY__FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Product Line Variability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LINE_VARIABILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product Line Variability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LINE_VARIABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Multivar.impl.LanguageFeatureImpl <em>Language Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Multivar.impl.LanguageFeatureImpl
	 * @see Multivar.impl.MultivarPackageImpl#getLanguageFeature()
	 * @generated
	 */
	int LANGUAGE_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__ABSTRACT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__MODULE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__DEPENDS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__EXCLUDES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE__CHILDREN = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Language Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Language Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Multivar.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Multivar.impl.RelationImpl
	 * @see Multivar.impl.MultivarPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 4;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Multivar.impl.MandatoryChildImpl <em>Mandatory Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Multivar.impl.MandatoryChildImpl
	 * @see Multivar.impl.MultivarPackageImpl#getMandatoryChild()
	 * @generated
	 */
	int MANDATORY_CHILD = 5;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CHILD__FEATURE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mandatory Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CHILD_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mandatory Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_CHILD_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Multivar.impl.OptionalChildImpl <em>Optional Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Multivar.impl.OptionalChildImpl
	 * @see Multivar.impl.MultivarPackageImpl#getOptionalChild()
	 * @generated
	 */
	int OPTIONAL_CHILD = 6;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_CHILD__FEATURE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Optional Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_CHILD_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Optional Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_CHILD_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Multivar.impl.OrGroupChildImpl <em>Or Group Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Multivar.impl.OrGroupChildImpl
	 * @see Multivar.impl.MultivarPackageImpl#getOrGroupChild()
	 * @generated
	 */
	int OR_GROUP_CHILD = 7;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP_CHILD__FEATURES = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Group Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP_CHILD_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Or Group Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP_CHILD_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Multivar.impl.AlternativeGroupImpl <em>Alternative Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Multivar.impl.AlternativeGroupImpl
	 * @see Multivar.impl.MultivarPackageImpl#getAlternativeGroup()
	 * @generated
	 */
	int ALTERNATIVE_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_GROUP__FEATURES = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_GROUP_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alternative Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_GROUP_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Multivar.impl.LanguageVariabilityImpl <em>Language Variability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Multivar.impl.LanguageVariabilityImpl
	 * @see Multivar.impl.MultivarPackageImpl#getLanguageVariability()
	 * @generated
	 */
	int LANGUAGE_VARIABILITY = 9;

	/**
	 * The feature id for the '<em><b>Variability Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_VARIABILITY__VARIABILITY_POINTS = 0;

	/**
	 * The number of structural features of the '<em>Language Variability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_VARIABILITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Language Variability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_VARIABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Multivar.impl.VariabilityPointImpl <em>Variability Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Multivar.impl.VariabilityPointImpl
	 * @see Multivar.impl.MultivarPackageImpl#getVariabilityPoint()
	 * @generated
	 */
	int VARIABILITY_POINT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_POINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_POINT__VARIATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Involved Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_POINT__INVOLVED_FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variability Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_POINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variability Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_POINT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Multivar.impl.VariationImpl <em>Variation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Multivar.impl.VariationImpl
	 * @see Multivar.impl.MultivarPackageImpl#getVariation()
	 * @generated
	 */
	int VARIATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__MODULE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__DEFAULT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Multivar.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see Multivar.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link Multivar.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Multivar.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link Multivar.LanguageProductLine <em>Language Product Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Product Line</em>'.
	 * @see Multivar.LanguageProductLine
	 * @generated
	 */
	EClass getLanguageProductLine();

	/**
	 * Returns the meta object for the attribute '{@link Multivar.LanguageProductLine#getImplementationFile <em>Implementation File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation File</em>'.
	 * @see Multivar.LanguageProductLine#getImplementationFile()
	 * @see #getLanguageProductLine()
	 * @generated
	 */
	EAttribute getLanguageProductLine_ImplementationFile();

	/**
	 * Returns the meta object for the containment reference '{@link Multivar.LanguageProductLine#getProductLineVariability <em>Product Line Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product Line Variability</em>'.
	 * @see Multivar.LanguageProductLine#getProductLineVariability()
	 * @see #getLanguageProductLine()
	 * @generated
	 */
	EReference getLanguageProductLine_ProductLineVariability();

	/**
	 * Returns the meta object for the containment reference '{@link Multivar.LanguageProductLine#getLanguageVariability <em>Language Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language Variability</em>'.
	 * @see Multivar.LanguageProductLine#getLanguageVariability()
	 * @see #getLanguageProductLine()
	 * @generated
	 */
	EReference getLanguageProductLine_LanguageVariability();

	/**
	 * Returns the meta object for class '{@link Multivar.ProductLineVariability <em>Product Line Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Line Variability</em>'.
	 * @see Multivar.ProductLineVariability
	 * @generated
	 */
	EClass getProductLineVariability();

	/**
	 * Returns the meta object for the reference '{@link Multivar.ProductLineVariability#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Feature</em>'.
	 * @see Multivar.ProductLineVariability#getRootFeature()
	 * @see #getProductLineVariability()
	 * @generated
	 */
	EReference getProductLineVariability_RootFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link Multivar.ProductLineVariability#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see Multivar.ProductLineVariability#getFeatures()
	 * @see #getProductLineVariability()
	 * @generated
	 */
	EReference getProductLineVariability_Features();

	/**
	 * Returns the meta object for class '{@link Multivar.LanguageFeature <em>Language Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Feature</em>'.
	 * @see Multivar.LanguageFeature
	 * @generated
	 */
	EClass getLanguageFeature();

	/**
	 * Returns the meta object for the attribute '{@link Multivar.LanguageFeature#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see Multivar.LanguageFeature#isAbstract()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EAttribute getLanguageFeature_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link Multivar.LanguageFeature#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see Multivar.LanguageFeature#getModule()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EAttribute getLanguageFeature_Module();

	/**
	 * Returns the meta object for the reference list '{@link Multivar.LanguageFeature#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends</em>'.
	 * @see Multivar.LanguageFeature#getDepends()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EReference getLanguageFeature_Depends();

	/**
	 * Returns the meta object for the reference list '{@link Multivar.LanguageFeature#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excludes</em>'.
	 * @see Multivar.LanguageFeature#getExcludes()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EReference getLanguageFeature_Excludes();

	/**
	 * Returns the meta object for the containment reference list '{@link Multivar.LanguageFeature#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see Multivar.LanguageFeature#getChildren()
	 * @see #getLanguageFeature()
	 * @generated
	 */
	EReference getLanguageFeature_Children();

	/**
	 * Returns the meta object for class '{@link Multivar.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see Multivar.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for class '{@link Multivar.MandatoryChild <em>Mandatory Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Child</em>'.
	 * @see Multivar.MandatoryChild
	 * @generated
	 */
	EClass getMandatoryChild();

	/**
	 * Returns the meta object for the reference '{@link Multivar.MandatoryChild#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see Multivar.MandatoryChild#getFeature()
	 * @see #getMandatoryChild()
	 * @generated
	 */
	EReference getMandatoryChild_Feature();

	/**
	 * Returns the meta object for class '{@link Multivar.OptionalChild <em>Optional Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Child</em>'.
	 * @see Multivar.OptionalChild
	 * @generated
	 */
	EClass getOptionalChild();

	/**
	 * Returns the meta object for the reference '{@link Multivar.OptionalChild#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see Multivar.OptionalChild#getFeature()
	 * @see #getOptionalChild()
	 * @generated
	 */
	EReference getOptionalChild_Feature();

	/**
	 * Returns the meta object for class '{@link Multivar.OrGroupChild <em>Or Group Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Group Child</em>'.
	 * @see Multivar.OrGroupChild
	 * @generated
	 */
	EClass getOrGroupChild();

	/**
	 * Returns the meta object for the reference list '{@link Multivar.OrGroupChild#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see Multivar.OrGroupChild#getFeatures()
	 * @see #getOrGroupChild()
	 * @generated
	 */
	EReference getOrGroupChild_Features();

	/**
	 * Returns the meta object for class '{@link Multivar.AlternativeGroup <em>Alternative Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Group</em>'.
	 * @see Multivar.AlternativeGroup
	 * @generated
	 */
	EClass getAlternativeGroup();

	/**
	 * Returns the meta object for the reference list '{@link Multivar.AlternativeGroup#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see Multivar.AlternativeGroup#getFeatures()
	 * @see #getAlternativeGroup()
	 * @generated
	 */
	EReference getAlternativeGroup_Features();

	/**
	 * Returns the meta object for class '{@link Multivar.LanguageVariability <em>Language Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Variability</em>'.
	 * @see Multivar.LanguageVariability
	 * @generated
	 */
	EClass getLanguageVariability();

	/**
	 * Returns the meta object for the containment reference list '{@link Multivar.LanguageVariability#getVariabilityPoints <em>Variability Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variability Points</em>'.
	 * @see Multivar.LanguageVariability#getVariabilityPoints()
	 * @see #getLanguageVariability()
	 * @generated
	 */
	EReference getLanguageVariability_VariabilityPoints();

	/**
	 * Returns the meta object for class '{@link Multivar.VariabilityPoint <em>Variability Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variability Point</em>'.
	 * @see Multivar.VariabilityPoint
	 * @generated
	 */
	EClass getVariabilityPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link Multivar.VariabilityPoint#getVariations <em>Variations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variations</em>'.
	 * @see Multivar.VariabilityPoint#getVariations()
	 * @see #getVariabilityPoint()
	 * @generated
	 */
	EReference getVariabilityPoint_Variations();

	/**
	 * Returns the meta object for the reference list '{@link Multivar.VariabilityPoint#getInvolvedFeatures <em>Involved Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Features</em>'.
	 * @see Multivar.VariabilityPoint#getInvolvedFeatures()
	 * @see #getVariabilityPoint()
	 * @generated
	 */
	EReference getVariabilityPoint_InvolvedFeatures();

	/**
	 * Returns the meta object for class '{@link Multivar.Variation <em>Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variation</em>'.
	 * @see Multivar.Variation
	 * @generated
	 */
	EClass getVariation();

	/**
	 * Returns the meta object for the attribute '{@link Multivar.Variation#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see Multivar.Variation#getModule()
	 * @see #getVariation()
	 * @generated
	 */
	EAttribute getVariation_Module();

	/**
	 * Returns the meta object for the attribute '{@link Multivar.Variation#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see Multivar.Variation#isDefault()
	 * @see #getVariation()
	 * @generated
	 */
	EAttribute getVariation_Default();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MultivarFactory getMultivarFactory();

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
		 * The meta object literal for the '{@link Multivar.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Multivar.impl.NamedElementImpl
		 * @see Multivar.impl.MultivarPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link Multivar.impl.LanguageProductLineImpl <em>Language Product Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Multivar.impl.LanguageProductLineImpl
		 * @see Multivar.impl.MultivarPackageImpl#getLanguageProductLine()
		 * @generated
		 */
		EClass LANGUAGE_PRODUCT_LINE = eINSTANCE.getLanguageProductLine();

		/**
		 * The meta object literal for the '<em><b>Implementation File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_PRODUCT_LINE__IMPLEMENTATION_FILE = eINSTANCE.getLanguageProductLine_ImplementationFile();

		/**
		 * The meta object literal for the '<em><b>Product Line Variability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_PRODUCT_LINE__PRODUCT_LINE_VARIABILITY = eINSTANCE.getLanguageProductLine_ProductLineVariability();

		/**
		 * The meta object literal for the '<em><b>Language Variability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_PRODUCT_LINE__LANGUAGE_VARIABILITY = eINSTANCE.getLanguageProductLine_LanguageVariability();

		/**
		 * The meta object literal for the '{@link Multivar.impl.ProductLineVariabilityImpl <em>Product Line Variability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Multivar.impl.ProductLineVariabilityImpl
		 * @see Multivar.impl.MultivarPackageImpl#getProductLineVariability()
		 * @generated
		 */
		EClass PRODUCT_LINE_VARIABILITY = eINSTANCE.getProductLineVariability();

		/**
		 * The meta object literal for the '<em><b>Root Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_LINE_VARIABILITY__ROOT_FEATURE = eINSTANCE.getProductLineVariability_RootFeature();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_LINE_VARIABILITY__FEATURES = eINSTANCE.getProductLineVariability_Features();

		/**
		 * The meta object literal for the '{@link Multivar.impl.LanguageFeatureImpl <em>Language Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Multivar.impl.LanguageFeatureImpl
		 * @see Multivar.impl.MultivarPackageImpl#getLanguageFeature()
		 * @generated
		 */
		EClass LANGUAGE_FEATURE = eINSTANCE.getLanguageFeature();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_FEATURE__ABSTRACT = eINSTANCE.getLanguageFeature_Abstract();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_FEATURE__MODULE = eINSTANCE.getLanguageFeature_Module();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE__DEPENDS = eINSTANCE.getLanguageFeature_Depends();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE__EXCLUDES = eINSTANCE.getLanguageFeature_Excludes();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_FEATURE__CHILDREN = eINSTANCE.getLanguageFeature_Children();

		/**
		 * The meta object literal for the '{@link Multivar.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Multivar.impl.RelationImpl
		 * @see Multivar.impl.MultivarPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '{@link Multivar.impl.MandatoryChildImpl <em>Mandatory Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Multivar.impl.MandatoryChildImpl
		 * @see Multivar.impl.MultivarPackageImpl#getMandatoryChild()
		 * @generated
		 */
		EClass MANDATORY_CHILD = eINSTANCE.getMandatoryChild();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANDATORY_CHILD__FEATURE = eINSTANCE.getMandatoryChild_Feature();

		/**
		 * The meta object literal for the '{@link Multivar.impl.OptionalChildImpl <em>Optional Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Multivar.impl.OptionalChildImpl
		 * @see Multivar.impl.MultivarPackageImpl#getOptionalChild()
		 * @generated
		 */
		EClass OPTIONAL_CHILD = eINSTANCE.getOptionalChild();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_CHILD__FEATURE = eINSTANCE.getOptionalChild_Feature();

		/**
		 * The meta object literal for the '{@link Multivar.impl.OrGroupChildImpl <em>Or Group Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Multivar.impl.OrGroupChildImpl
		 * @see Multivar.impl.MultivarPackageImpl#getOrGroupChild()
		 * @generated
		 */
		EClass OR_GROUP_CHILD = eINSTANCE.getOrGroupChild();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_GROUP_CHILD__FEATURES = eINSTANCE.getOrGroupChild_Features();

		/**
		 * The meta object literal for the '{@link Multivar.impl.AlternativeGroupImpl <em>Alternative Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Multivar.impl.AlternativeGroupImpl
		 * @see Multivar.impl.MultivarPackageImpl#getAlternativeGroup()
		 * @generated
		 */
		EClass ALTERNATIVE_GROUP = eINSTANCE.getAlternativeGroup();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_GROUP__FEATURES = eINSTANCE.getAlternativeGroup_Features();

		/**
		 * The meta object literal for the '{@link Multivar.impl.LanguageVariabilityImpl <em>Language Variability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Multivar.impl.LanguageVariabilityImpl
		 * @see Multivar.impl.MultivarPackageImpl#getLanguageVariability()
		 * @generated
		 */
		EClass LANGUAGE_VARIABILITY = eINSTANCE.getLanguageVariability();

		/**
		 * The meta object literal for the '<em><b>Variability Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_VARIABILITY__VARIABILITY_POINTS = eINSTANCE.getLanguageVariability_VariabilityPoints();

		/**
		 * The meta object literal for the '{@link Multivar.impl.VariabilityPointImpl <em>Variability Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Multivar.impl.VariabilityPointImpl
		 * @see Multivar.impl.MultivarPackageImpl#getVariabilityPoint()
		 * @generated
		 */
		EClass VARIABILITY_POINT = eINSTANCE.getVariabilityPoint();

		/**
		 * The meta object literal for the '<em><b>Variations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY_POINT__VARIATIONS = eINSTANCE.getVariabilityPoint_Variations();

		/**
		 * The meta object literal for the '<em><b>Involved Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY_POINT__INVOLVED_FEATURES = eINSTANCE.getVariabilityPoint_InvolvedFeatures();

		/**
		 * The meta object literal for the '{@link Multivar.impl.VariationImpl <em>Variation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Multivar.impl.VariationImpl
		 * @see Multivar.impl.MultivarPackageImpl#getVariation()
		 * @generated
		 */
		EClass VARIATION = eINSTANCE.getVariation();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIATION__MODULE = eINSTANCE.getVariation_Module();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIATION__DEFAULT = eINSTANCE.getVariation_Default();

	}

} //MultivarPackage