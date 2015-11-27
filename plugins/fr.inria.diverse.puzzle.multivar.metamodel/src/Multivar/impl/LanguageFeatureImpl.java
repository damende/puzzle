/**
 */
package Multivar.impl;

import Multivar.LanguageFeature;
import Multivar.MultivarPackage;
import Multivar.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Multivar.impl.LanguageFeatureImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link Multivar.impl.LanguageFeatureImpl#getModule <em>Module</em>}</li>
 *   <li>{@link Multivar.impl.LanguageFeatureImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link Multivar.impl.LanguageFeatureImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link Multivar.impl.LanguageFeatureImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageFeatureImpl extends NamedElementImpl implements LanguageFeature {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected String module = MODULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepends() <em>Depends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageFeature> depends;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageFeature> excludes;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultivarPackage.Literals.LANGUAGE_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultivarPackage.LANGUAGE_FEATURE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(String newModule) {
		String oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultivarPackage.LANGUAGE_FEATURE__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageFeature> getDepends() {
		if (depends == null) {
			depends = new EObjectResolvingEList<LanguageFeature>(LanguageFeature.class, this, MultivarPackage.LANGUAGE_FEATURE__DEPENDS);
		}
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageFeature> getExcludes() {
		if (excludes == null) {
			excludes = new EObjectResolvingEList<LanguageFeature>(LanguageFeature.class, this, MultivarPackage.LANGUAGE_FEATURE__EXCLUDES);
		}
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Relation>(Relation.class, this, MultivarPackage.LANGUAGE_FEATURE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultivarPackage.LANGUAGE_FEATURE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MultivarPackage.LANGUAGE_FEATURE__ABSTRACT:
				return isAbstract();
			case MultivarPackage.LANGUAGE_FEATURE__MODULE:
				return getModule();
			case MultivarPackage.LANGUAGE_FEATURE__DEPENDS:
				return getDepends();
			case MultivarPackage.LANGUAGE_FEATURE__EXCLUDES:
				return getExcludes();
			case MultivarPackage.LANGUAGE_FEATURE__CHILDREN:
				return getChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MultivarPackage.LANGUAGE_FEATURE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case MultivarPackage.LANGUAGE_FEATURE__MODULE:
				setModule((String)newValue);
				return;
			case MultivarPackage.LANGUAGE_FEATURE__DEPENDS:
				getDepends().clear();
				getDepends().addAll((Collection<? extends LanguageFeature>)newValue);
				return;
			case MultivarPackage.LANGUAGE_FEATURE__EXCLUDES:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends LanguageFeature>)newValue);
				return;
			case MultivarPackage.LANGUAGE_FEATURE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Relation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MultivarPackage.LANGUAGE_FEATURE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case MultivarPackage.LANGUAGE_FEATURE__MODULE:
				setModule(MODULE_EDEFAULT);
				return;
			case MultivarPackage.LANGUAGE_FEATURE__DEPENDS:
				getDepends().clear();
				return;
			case MultivarPackage.LANGUAGE_FEATURE__EXCLUDES:
				getExcludes().clear();
				return;
			case MultivarPackage.LANGUAGE_FEATURE__CHILDREN:
				getChildren().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MultivarPackage.LANGUAGE_FEATURE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case MultivarPackage.LANGUAGE_FEATURE__MODULE:
				return MODULE_EDEFAULT == null ? module != null : !MODULE_EDEFAULT.equals(module);
			case MultivarPackage.LANGUAGE_FEATURE__DEPENDS:
				return depends != null && !depends.isEmpty();
			case MultivarPackage.LANGUAGE_FEATURE__EXCLUDES:
				return excludes != null && !excludes.isEmpty();
			case MultivarPackage.LANGUAGE_FEATURE__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", module: ");
		result.append(module);
		result.append(')');
		return result.toString();
	}

} //LanguageFeatureImpl