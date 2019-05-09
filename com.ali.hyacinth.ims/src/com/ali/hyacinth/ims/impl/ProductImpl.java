/**
 */
package com.ali.hyacinth.ims.impl;

import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.ProductTransaction;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductImpl#getItemPrice <em>Item Price</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductImpl#getProducttransactions <em>Producttransactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends NamedElementImpl implements Product {
	/**
	 * The default value of the '{@link #getItemPrice() <em>Item Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float ITEM_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getItemPrice() <em>Item Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemPrice()
	 * @generated
	 * @ordered
	 */
	protected float itemPrice = ITEM_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProducttransactions() <em>Producttransactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducttransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductTransaction> producttransactions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImsPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getItemPrice() {
		return itemPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemPrice(float newItemPrice) {
		float oldItemPrice = itemPrice;
		itemPrice = newItemPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.PRODUCT__ITEM_PRICE, oldItemPrice, itemPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.PRODUCT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.PRODUCT__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductTransaction> getProducttransactions() {
		if (producttransactions == null) {
			producttransactions = new EObjectWithInverseResolvingEList<ProductTransaction>(ProductTransaction.class, this, ImsPackage.PRODUCT__PRODUCTTRANSACTIONS, ImsPackage.PRODUCT_TRANSACTION__PRODUCT);
		}
		return producttransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImsPackage.PRODUCT__PRODUCTTRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducttransactions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImsPackage.PRODUCT__PRODUCTTRANSACTIONS:
				return ((InternalEList<?>)getProducttransactions()).basicRemove(otherEnd, msgs);
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
			case ImsPackage.PRODUCT__ITEM_PRICE:
				return getItemPrice();
			case ImsPackage.PRODUCT__ID:
				return getId();
			case ImsPackage.PRODUCT__QUANTITY:
				return getQuantity();
			case ImsPackage.PRODUCT__PRODUCTTRANSACTIONS:
				return getProducttransactions();
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
			case ImsPackage.PRODUCT__ITEM_PRICE:
				setItemPrice((Float)newValue);
				return;
			case ImsPackage.PRODUCT__ID:
				setId((String)newValue);
				return;
			case ImsPackage.PRODUCT__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case ImsPackage.PRODUCT__PRODUCTTRANSACTIONS:
				getProducttransactions().clear();
				getProducttransactions().addAll((Collection<? extends ProductTransaction>)newValue);
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
			case ImsPackage.PRODUCT__ITEM_PRICE:
				setItemPrice(ITEM_PRICE_EDEFAULT);
				return;
			case ImsPackage.PRODUCT__ID:
				setId(ID_EDEFAULT);
				return;
			case ImsPackage.PRODUCT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ImsPackage.PRODUCT__PRODUCTTRANSACTIONS:
				getProducttransactions().clear();
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
			case ImsPackage.PRODUCT__ITEM_PRICE:
				return itemPrice != ITEM_PRICE_EDEFAULT;
			case ImsPackage.PRODUCT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ImsPackage.PRODUCT__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case ImsPackage.PRODUCT__PRODUCTTRANSACTIONS:
				return producttransactions != null && !producttransactions.isEmpty();
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
		result.append(" (itemPrice: ");
		result.append(itemPrice);
		result.append(", id: ");
		result.append(id);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
