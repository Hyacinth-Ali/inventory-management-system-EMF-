/**
 */
package com.ali.hyacinth.ims.impl;

import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.Item;
import com.ali.hyacinth.ims.Product;

import com.ali.hyacinth.ims.TransactionItem;
import com.ali.hyacinth.ims.TransactionPrice;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductImpl#getItems <em>Items</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductImpl#getTransactionitem <em>Transactionitem</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductImpl#getTransactionprice <em>Transactionprice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends NamedElementImpl implements Product {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

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
	 * The cached value of the '{@link #getTransactionitem() <em>Transactionitem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionitem()
	 * @generated
	 * @ordered
	 */
	protected TransactionItem transactionitem;

	/**
	 * The cached value of the '{@link #getTransactionprice() <em>Transactionprice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionprice()
	 * @generated
	 * @ordered
	 */
	protected TransactionPrice transactionprice;

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
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, ImsPackage.PRODUCT__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.PRODUCT__PRICE, oldPrice, price));
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
	public TransactionItem getTransactionitem() {
		if (transactionitem != null && transactionitem.eIsProxy()) {
			InternalEObject oldTransactionitem = (InternalEObject)transactionitem;
			transactionitem = (TransactionItem)eResolveProxy(oldTransactionitem);
			if (transactionitem != oldTransactionitem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsPackage.PRODUCT__TRANSACTIONITEM, oldTransactionitem, transactionitem));
			}
		}
		return transactionitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionItem basicGetTransactionitem() {
		return transactionitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionitem(TransactionItem newTransactionitem) {
		TransactionItem oldTransactionitem = transactionitem;
		transactionitem = newTransactionitem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.PRODUCT__TRANSACTIONITEM, oldTransactionitem, transactionitem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionPrice getTransactionprice() {
		if (transactionprice != null && transactionprice.eIsProxy()) {
			InternalEObject oldTransactionprice = (InternalEObject)transactionprice;
			transactionprice = (TransactionPrice)eResolveProxy(oldTransactionprice);
			if (transactionprice != oldTransactionprice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsPackage.PRODUCT__TRANSACTIONPRICE, oldTransactionprice, transactionprice));
			}
		}
		return transactionprice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionPrice basicGetTransactionprice() {
		return transactionprice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionprice(TransactionPrice newTransactionprice) {
		TransactionPrice oldTransactionprice = transactionprice;
		transactionprice = newTransactionprice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.PRODUCT__TRANSACTIONPRICE, oldTransactionprice, transactionprice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImsPackage.PRODUCT__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case ImsPackage.PRODUCT__ITEMS:
				return getItems();
			case ImsPackage.PRODUCT__PRICE:
				return getPrice();
			case ImsPackage.PRODUCT__ID:
				return getId();
			case ImsPackage.PRODUCT__TRANSACTIONITEM:
				if (resolve) return getTransactionitem();
				return basicGetTransactionitem();
			case ImsPackage.PRODUCT__TRANSACTIONPRICE:
				if (resolve) return getTransactionprice();
				return basicGetTransactionprice();
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
			case ImsPackage.PRODUCT__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case ImsPackage.PRODUCT__PRICE:
				setPrice((Float)newValue);
				return;
			case ImsPackage.PRODUCT__ID:
				setId((String)newValue);
				return;
			case ImsPackage.PRODUCT__TRANSACTIONITEM:
				setTransactionitem((TransactionItem)newValue);
				return;
			case ImsPackage.PRODUCT__TRANSACTIONPRICE:
				setTransactionprice((TransactionPrice)newValue);
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
			case ImsPackage.PRODUCT__ITEMS:
				getItems().clear();
				return;
			case ImsPackage.PRODUCT__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ImsPackage.PRODUCT__ID:
				setId(ID_EDEFAULT);
				return;
			case ImsPackage.PRODUCT__TRANSACTIONITEM:
				setTransactionitem((TransactionItem)null);
				return;
			case ImsPackage.PRODUCT__TRANSACTIONPRICE:
				setTransactionprice((TransactionPrice)null);
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
			case ImsPackage.PRODUCT__ITEMS:
				return items != null && !items.isEmpty();
			case ImsPackage.PRODUCT__PRICE:
				return price != PRICE_EDEFAULT;
			case ImsPackage.PRODUCT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ImsPackage.PRODUCT__TRANSACTIONITEM:
				return transactionitem != null;
			case ImsPackage.PRODUCT__TRANSACTIONPRICE:
				return transactionprice != null;
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
		result.append(" (price: ");
		result.append(price);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
