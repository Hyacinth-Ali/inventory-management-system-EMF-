/**
 */
package com.ali.hyacinth.ims.provider;


import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsFactory;
import com.ali.hyacinth.ims.ImsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.ali.hyacinth.ims.IMS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IMSItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMSItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFileNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the File Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IMS_fileName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IMS_fileName_feature", "_UI_IMS_type"),
				 ImsPackage.Literals.IMS__FILE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ImsPackage.Literals.IMS__ITEM);
			childrenFeatures.add(ImsPackage.Literals.IMS__PRODUCTS);
			childrenFeatures.add(ImsPackage.Literals.IMS__SUPPLIERS);
			childrenFeatures.add(ImsPackage.Literals.IMS__MANAGERS);
			childrenFeatures.add(ImsPackage.Literals.IMS__ORDERS);
			childrenFeatures.add(ImsPackage.Literals.IMS__AUDITS);
			childrenFeatures.add(ImsPackage.Literals.IMS__PERSONS);
			childrenFeatures.add(ImsPackage.Literals.IMS__REGULAREMPLOYEES);
			childrenFeatures.add(ImsPackage.Literals.IMS__CUSTOMERS);
			childrenFeatures.add(ImsPackage.Literals.IMS__TRANSACTIONS);
			childrenFeatures.add(ImsPackage.Literals.IMS__RECEIPTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns IMS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IMS"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IMS)object).getFileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IMS_type") :
			getString("_UI_IMS_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(IMS.class)) {
			case ImsPackage.IMS__FILE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ImsPackage.IMS__ITEM:
			case ImsPackage.IMS__PRODUCTS:
			case ImsPackage.IMS__SUPPLIERS:
			case ImsPackage.IMS__MANAGERS:
			case ImsPackage.IMS__ORDERS:
			case ImsPackage.IMS__AUDITS:
			case ImsPackage.IMS__PERSONS:
			case ImsPackage.IMS__REGULAREMPLOYEES:
			case ImsPackage.IMS__CUSTOMERS:
			case ImsPackage.IMS__TRANSACTIONS:
			case ImsPackage.IMS__RECEIPTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ImsPackage.Literals.IMS__ITEM,
				 ImsFactory.eINSTANCE.createItem()));

		newChildDescriptors.add
			(createChildParameter
				(ImsPackage.Literals.IMS__PRODUCTS,
				 ImsFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(ImsPackage.Literals.IMS__SUPPLIERS,
				 ImsFactory.eINSTANCE.createSupplier()));

		newChildDescriptors.add
			(createChildParameter
				(ImsPackage.Literals.IMS__MANAGERS,
				 ImsFactory.eINSTANCE.createManager()));

		newChildDescriptors.add
			(createChildParameter
				(ImsPackage.Literals.IMS__ORDERS,
				 ImsFactory.eINSTANCE.createOrder()));

		newChildDescriptors.add
			(createChildParameter
				(ImsPackage.Literals.IMS__AUDITS,
				 ImsFactory.eINSTANCE.createAudit()));

		newChildDescriptors.add
			(createChildParameter
				(ImsPackage.Literals.IMS__PERSONS,
				 ImsFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(ImsPackage.Literals.IMS__REGULAREMPLOYEES,
				 ImsFactory.eINSTANCE.createRegularEmployee()));

		newChildDescriptors.add
			(createChildParameter
				(ImsPackage.Literals.IMS__CUSTOMERS,
				 ImsFactory.eINSTANCE.createCustomer()));

		newChildDescriptors.add
			(createChildParameter
				(ImsPackage.Literals.IMS__TRANSACTIONS,
				 ImsFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(ImsPackage.Literals.IMS__RECEIPTS,
				 ImsFactory.eINSTANCE.createReceipt()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ImsEditPlugin.INSTANCE;
	}

}
