/**
 */
package com.ali.hyacinth.ims.impl;

import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.ProductTransaction;
import com.ali.hyacinth.ims.Transaction;
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
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductImpl#getTransactions <em>Transactions</em>}</li>
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
	 * The cached value of the '{@link #getProducttransactions() <em>Producttransactions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducttransactions()
	 * @generated
	 * @ordered
	 */
	protected ProductTransaction producttransactions;

	/**
	 * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> transactions;

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
	public ProductTransaction getProducttransactions() {
		if (producttransactions != null && producttransactions.eIsProxy()) {
			InternalEObject oldProducttransactions = (InternalEObject)producttransactions;
			producttransactions = (ProductTransaction)eResolveProxy(oldProducttransactions);
			if (producttransactions != oldProducttransactions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsPackage.PRODUCT__PRODUCTTRANSACTIONS, oldProducttransactions, producttransactions));
			}
		}
		return producttransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductTransaction basicGetProducttransactions() {
		return producttransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProducttransactions(ProductTransaction newProducttransactions, NotificationChain msgs) {
		ProductTransaction oldProducttransactions = producttransactions;
		producttransactions = newProducttransactions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImsPackage.PRODUCT__PRODUCTTRANSACTIONS, oldProducttransactions, newProducttransactions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducttransactions(ProductTransaction newProducttransactions) {
		if (newProducttransactions != producttransactions) {
			NotificationChain msgs = null;
			if (producttransactions != null)
				msgs = ((InternalEObject)producttransactions).eInverseRemove(this, ImsPackage.PRODUCT_TRANSACTION__PRODUCT, ProductTransaction.class, msgs);
			if (newProducttransactions != null)
				msgs = ((InternalEObject)newProducttransactions).eInverseAdd(this, ImsPackage.PRODUCT_TRANSACTION__PRODUCT, ProductTransaction.class, msgs);
			msgs = basicSetProducttransactions(newProducttransactions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.PRODUCT__PRODUCTTRANSACTIONS, newProducttransactions, newProducttransactions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new EObjectWithInverseResolvingEList.ManyInverse<Transaction>(Transaction.class, this, ImsPackage.PRODUCT__TRANSACTIONS, ImsPackage.TRANSACTION__PRODUCTS);
		}
		return transactions;
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
				if (producttransactions != null)
					msgs = ((InternalEObject)producttransactions).eInverseRemove(this, ImsPackage.PRODUCT_TRANSACTION__PRODUCT, ProductTransaction.class, msgs);
				return basicSetProducttransactions((ProductTransaction)otherEnd, msgs);
			case ImsPackage.PRODUCT__TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransactions()).basicAdd(otherEnd, msgs);
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
				return basicSetProducttransactions(null, msgs);
			case ImsPackage.PRODUCT__TRANSACTIONS:
				return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
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
				if (resolve) return getProducttransactions();
				return basicGetProducttransactions();
			case ImsPackage.PRODUCT__TRANSACTIONS:
				return getTransactions();
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
				setProducttransactions((ProductTransaction)newValue);
				return;
			case ImsPackage.PRODUCT__TRANSACTIONS:
				getTransactions().clear();
				getTransactions().addAll((Collection<? extends Transaction>)newValue);
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
				setProducttransactions((ProductTransaction)null);
				return;
			case ImsPackage.PRODUCT__TRANSACTIONS:
				getTransactions().clear();
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
				return producttransactions != null;
			case ImsPackage.PRODUCT__TRANSACTIONS:
				return transactions != null && !transactions.isEmpty();
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
