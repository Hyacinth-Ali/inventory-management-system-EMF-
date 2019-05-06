/**
 */
package com.ali.hyacinth.ims.impl;

import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.Order;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.Supplier;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.impl.OrderImpl#getOrderedDate <em>Ordered Date</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.OrderImpl#getArrivalDate <em>Arrival Date</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.OrderImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.OrderImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The default value of the '{@link #getOrderedDate() <em>Ordered Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ORDERED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderedDate() <em>Ordered Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedDate()
	 * @generated
	 * @ordered
	 */
	protected Date orderedDate = ORDERED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrivalDate() <em>Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ARRIVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivalDate() <em>Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected Date arrivalDate = ARRIVAL_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected Supplier supplier;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImsPackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOrderedDate() {
		return orderedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedDate(Date newOrderedDate) {
		Date oldOrderedDate = orderedDate;
		orderedDate = newOrderedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.ORDER__ORDERED_DATE, oldOrderedDate, orderedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalDate(Date newArrivalDate) {
		Date oldArrivalDate = arrivalDate;
		arrivalDate = newArrivalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.ORDER__ARRIVAL_DATE, oldArrivalDate, arrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier getSupplier() {
		if (supplier != null && supplier.eIsProxy()) {
			InternalEObject oldSupplier = (InternalEObject)supplier;
			supplier = (Supplier)eResolveProxy(oldSupplier);
			if (supplier != oldSupplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsPackage.ORDER__SUPPLIER, oldSupplier, supplier));
			}
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier basicGetSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(Supplier newSupplier) {
		Supplier oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.ORDER__SUPPLIER, oldSupplier, supplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectResolvingEList<Product>(Product.class, this, ImsPackage.ORDER__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImsPackage.ORDER__ORDERED_DATE:
				return getOrderedDate();
			case ImsPackage.ORDER__ARRIVAL_DATE:
				return getArrivalDate();
			case ImsPackage.ORDER__SUPPLIER:
				if (resolve) return getSupplier();
				return basicGetSupplier();
			case ImsPackage.ORDER__PRODUCTS:
				return getProducts();
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
			case ImsPackage.ORDER__ORDERED_DATE:
				setOrderedDate((Date)newValue);
				return;
			case ImsPackage.ORDER__ARRIVAL_DATE:
				setArrivalDate((Date)newValue);
				return;
			case ImsPackage.ORDER__SUPPLIER:
				setSupplier((Supplier)newValue);
				return;
			case ImsPackage.ORDER__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
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
			case ImsPackage.ORDER__ORDERED_DATE:
				setOrderedDate(ORDERED_DATE_EDEFAULT);
				return;
			case ImsPackage.ORDER__ARRIVAL_DATE:
				setArrivalDate(ARRIVAL_DATE_EDEFAULT);
				return;
			case ImsPackage.ORDER__SUPPLIER:
				setSupplier((Supplier)null);
				return;
			case ImsPackage.ORDER__PRODUCTS:
				getProducts().clear();
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
			case ImsPackage.ORDER__ORDERED_DATE:
				return ORDERED_DATE_EDEFAULT == null ? orderedDate != null : !ORDERED_DATE_EDEFAULT.equals(orderedDate);
			case ImsPackage.ORDER__ARRIVAL_DATE:
				return ARRIVAL_DATE_EDEFAULT == null ? arrivalDate != null : !ARRIVAL_DATE_EDEFAULT.equals(arrivalDate);
			case ImsPackage.ORDER__SUPPLIER:
				return supplier != null;
			case ImsPackage.ORDER__PRODUCTS:
				return products != null && !products.isEmpty();
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
		result.append(" (orderedDate: ");
		result.append(orderedDate);
		result.append(", arrivalDate: ");
		result.append(arrivalDate);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
