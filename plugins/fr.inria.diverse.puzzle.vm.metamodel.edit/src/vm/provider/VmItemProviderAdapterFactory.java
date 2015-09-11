/**
 */
package vm.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import vm.util.VmAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VmItemProviderAdapterFactory extends VmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link vm.PFeatureModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PFeatureModelItemProvider pFeatureModelItemProvider;

	/**
	 * This creates an adapter for a {@link vm.PFeatureModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPFeatureModelAdapter() {
		if (pFeatureModelItemProvider == null) {
			pFeatureModelItemProvider = new PFeatureModelItemProvider(this);
		}

		return pFeatureModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vm.PFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PFeatureItemProvider pFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link vm.PFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPFeatureAdapter() {
		if (pFeatureItemProvider == null) {
			pFeatureItemProvider = new PFeatureItemProvider(this);
		}

		return pFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vm.PFeatureGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PFeatureGroupItemProvider pFeatureGroupItemProvider;

	/**
	 * This creates an adapter for a {@link vm.PFeatureGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPFeatureGroupAdapter() {
		if (pFeatureGroupItemProvider == null) {
			pFeatureGroupItemProvider = new PFeatureGroupItemProvider(this);
		}

		return pFeatureGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vm.PConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PConstraintItemProvider pConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link vm.PConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPConstraintAdapter() {
		if (pConstraintItemProvider == null) {
			pConstraintItemProvider = new PConstraintItemProvider(this);
		}

		return pConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vm.PFeatureRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PFeatureRefItemProvider pFeatureRefItemProvider;

	/**
	 * This creates an adapter for a {@link vm.PFeatureRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPFeatureRefAdapter() {
		if (pFeatureRefItemProvider == null) {
			pFeatureRefItemProvider = new PFeatureRefItemProvider(this);
		}

		return pFeatureRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vm.PUnaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PUnaryExpressionItemProvider pUnaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link vm.PUnaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPUnaryExpressionAdapter() {
		if (pUnaryExpressionItemProvider == null) {
			pUnaryExpressionItemProvider = new PUnaryExpressionItemProvider(this);
		}

		return pUnaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vm.PBinaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PBinaryExpressionItemProvider pBinaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link vm.PBinaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPBinaryExpressionAdapter() {
		if (pBinaryExpressionItemProvider == null) {
			pBinaryExpressionItemProvider = new PBinaryExpressionItemProvider(this);
		}

		return pBinaryExpressionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (pFeatureModelItemProvider != null) pFeatureModelItemProvider.dispose();
		if (pFeatureItemProvider != null) pFeatureItemProvider.dispose();
		if (pFeatureGroupItemProvider != null) pFeatureGroupItemProvider.dispose();
		if (pConstraintItemProvider != null) pConstraintItemProvider.dispose();
		if (pFeatureRefItemProvider != null) pFeatureRefItemProvider.dispose();
		if (pUnaryExpressionItemProvider != null) pUnaryExpressionItemProvider.dispose();
		if (pBinaryExpressionItemProvider != null) pBinaryExpressionItemProvider.dispose();
	}

}