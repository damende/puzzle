/**
 */
package vm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vm.AbstractSyntax;
import vm.VmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vm.impl.AbstractSyntaxImpl#getEcorePath <em>Ecore Path</em>}</li>
 *   <li>{@link vm.impl.AbstractSyntaxImpl#getEcoreProject <em>Ecore Project</em>}</li>
 *   <li>{@link vm.impl.AbstractSyntaxImpl#getEcoreRequiredInterfacePath <em>Ecore Required Interface Path</em>}</li>
 *   <li>{@link vm.impl.AbstractSyntaxImpl#getEcoreProvidedInterfacePath <em>Ecore Provided Interface Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractSyntaxImpl extends MinimalEObjectImpl.Container implements AbstractSyntax {
	/**
	 * The default value of the '{@link #getEcorePath() <em>Ecore Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcorePath()
	 * @generated
	 * @ordered
	 */
	protected static final String ECORE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcorePath() <em>Ecore Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcorePath()
	 * @generated
	 * @ordered
	 */
	protected String ecorePath = ECORE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEcoreProject() <em>Ecore Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreProject()
	 * @generated
	 * @ordered
	 */
	protected static final String ECORE_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcoreProject() <em>Ecore Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreProject()
	 * @generated
	 * @ordered
	 */
	protected String ecoreProject = ECORE_PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEcoreRequiredInterfacePath() <em>Ecore Required Interface Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreRequiredInterfacePath()
	 * @generated
	 * @ordered
	 */
	protected static final String ECORE_REQUIRED_INTERFACE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcoreRequiredInterfacePath() <em>Ecore Required Interface Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreRequiredInterfacePath()
	 * @generated
	 * @ordered
	 */
	protected String ecoreRequiredInterfacePath = ECORE_REQUIRED_INTERFACE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEcoreProvidedInterfacePath() <em>Ecore Provided Interface Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreProvidedInterfacePath()
	 * @generated
	 * @ordered
	 */
	protected static final String ECORE_PROVIDED_INTERFACE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcoreProvidedInterfacePath() <em>Ecore Provided Interface Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreProvidedInterfacePath()
	 * @generated
	 * @ordered
	 */
	protected String ecoreProvidedInterfacePath = ECORE_PROVIDED_INTERFACE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSyntaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.ABSTRACT_SYNTAX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcorePath() {
		return ecorePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcorePath(String newEcorePath) {
		String oldEcorePath = ecorePath;
		ecorePath = newEcorePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.ABSTRACT_SYNTAX__ECORE_PATH, oldEcorePath, ecorePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcoreProject() {
		return ecoreProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreProject(String newEcoreProject) {
		String oldEcoreProject = ecoreProject;
		ecoreProject = newEcoreProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.ABSTRACT_SYNTAX__ECORE_PROJECT, oldEcoreProject, ecoreProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcoreRequiredInterfacePath() {
		return ecoreRequiredInterfacePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreRequiredInterfacePath(String newEcoreRequiredInterfacePath) {
		String oldEcoreRequiredInterfacePath = ecoreRequiredInterfacePath;
		ecoreRequiredInterfacePath = newEcoreRequiredInterfacePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.ABSTRACT_SYNTAX__ECORE_REQUIRED_INTERFACE_PATH, oldEcoreRequiredInterfacePath, ecoreRequiredInterfacePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcoreProvidedInterfacePath() {
		return ecoreProvidedInterfacePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreProvidedInterfacePath(String newEcoreProvidedInterfacePath) {
		String oldEcoreProvidedInterfacePath = ecoreProvidedInterfacePath;
		ecoreProvidedInterfacePath = newEcoreProvidedInterfacePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.ABSTRACT_SYNTAX__ECORE_PROVIDED_INTERFACE_PATH, oldEcoreProvidedInterfacePath, ecoreProvidedInterfacePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmPackage.ABSTRACT_SYNTAX__ECORE_PATH:
				return getEcorePath();
			case VmPackage.ABSTRACT_SYNTAX__ECORE_PROJECT:
				return getEcoreProject();
			case VmPackage.ABSTRACT_SYNTAX__ECORE_REQUIRED_INTERFACE_PATH:
				return getEcoreRequiredInterfacePath();
			case VmPackage.ABSTRACT_SYNTAX__ECORE_PROVIDED_INTERFACE_PATH:
				return getEcoreProvidedInterfacePath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VmPackage.ABSTRACT_SYNTAX__ECORE_PATH:
				setEcorePath((String)newValue);
				return;
			case VmPackage.ABSTRACT_SYNTAX__ECORE_PROJECT:
				setEcoreProject((String)newValue);
				return;
			case VmPackage.ABSTRACT_SYNTAX__ECORE_REQUIRED_INTERFACE_PATH:
				setEcoreRequiredInterfacePath((String)newValue);
				return;
			case VmPackage.ABSTRACT_SYNTAX__ECORE_PROVIDED_INTERFACE_PATH:
				setEcoreProvidedInterfacePath((String)newValue);
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
			case VmPackage.ABSTRACT_SYNTAX__ECORE_PATH:
				setEcorePath(ECORE_PATH_EDEFAULT);
				return;
			case VmPackage.ABSTRACT_SYNTAX__ECORE_PROJECT:
				setEcoreProject(ECORE_PROJECT_EDEFAULT);
				return;
			case VmPackage.ABSTRACT_SYNTAX__ECORE_REQUIRED_INTERFACE_PATH:
				setEcoreRequiredInterfacePath(ECORE_REQUIRED_INTERFACE_PATH_EDEFAULT);
				return;
			case VmPackage.ABSTRACT_SYNTAX__ECORE_PROVIDED_INTERFACE_PATH:
				setEcoreProvidedInterfacePath(ECORE_PROVIDED_INTERFACE_PATH_EDEFAULT);
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
			case VmPackage.ABSTRACT_SYNTAX__ECORE_PATH:
				return ECORE_PATH_EDEFAULT == null ? ecorePath != null : !ECORE_PATH_EDEFAULT.equals(ecorePath);
			case VmPackage.ABSTRACT_SYNTAX__ECORE_PROJECT:
				return ECORE_PROJECT_EDEFAULT == null ? ecoreProject != null : !ECORE_PROJECT_EDEFAULT.equals(ecoreProject);
			case VmPackage.ABSTRACT_SYNTAX__ECORE_REQUIRED_INTERFACE_PATH:
				return ECORE_REQUIRED_INTERFACE_PATH_EDEFAULT == null ? ecoreRequiredInterfacePath != null : !ECORE_REQUIRED_INTERFACE_PATH_EDEFAULT.equals(ecoreRequiredInterfacePath);
			case VmPackage.ABSTRACT_SYNTAX__ECORE_PROVIDED_INTERFACE_PATH:
				return ECORE_PROVIDED_INTERFACE_PATH_EDEFAULT == null ? ecoreProvidedInterfacePath != null : !ECORE_PROVIDED_INTERFACE_PATH_EDEFAULT.equals(ecoreProvidedInterfacePath);
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
		result.append(" (ecorePath: ");
		result.append(ecorePath);
		result.append(", ecoreProject: ");
		result.append(ecoreProject);
		result.append(", ecoreRequiredInterfacePath: ");
		result.append(ecoreRequiredInterfacePath);
		result.append(", ecoreProvidedInterfacePath: ");
		result.append(ecoreProvidedInterfacePath);
		result.append(')');
		return result.toString();
	}

} //AbstractSyntaxImpl
