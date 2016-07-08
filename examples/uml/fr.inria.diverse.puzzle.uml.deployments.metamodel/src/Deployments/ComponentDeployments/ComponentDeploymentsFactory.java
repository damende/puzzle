/**
 */
package Deployments.ComponentDeployments;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Deployments.ComponentDeployments.ComponentDeploymentsPackage
 * @generated
 */
public interface ComponentDeploymentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentDeploymentsFactory eINSTANCE = Deployments.ComponentDeployments.impl.ComponentDeploymentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Specification</em>'.
	 * @generated
	 */
	DeploymentSpecification createDeploymentSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentDeploymentsPackage getComponentDeploymentsPackage();

} //ComponentDeploymentsFactory
