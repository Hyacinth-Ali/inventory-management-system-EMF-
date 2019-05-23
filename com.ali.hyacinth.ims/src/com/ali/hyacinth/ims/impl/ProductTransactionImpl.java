/**
 */
package com.ali.hyacinth.ims.impl;

import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.ProductTransaction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductTransactionImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductTransactionImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.ProductTransactionImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductTransactionImpl extends MinimalEObjectImpl.Container implements ProductTransaction {
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
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImsPackage.Literals.PRODUCT_TRANSACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.PRODUCT_TRANSACTION__PRICE, oldPrice, price));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.PRODUCT_TRANSACTION__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (Product)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsPackage.PRODUCT_TRANSACTION__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(Product newProduct, NotificationChain msgs) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImsPackage.PRODUCT_TRANSACTION__PRODUCT, oldProduct, newProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Product newProduct) {
		if (newProduct != product) {
			NotificationChain msgs = null;
			if (product != null)
				msgs = ((InternalEObject)product).eInverseRemove(this, ImsPackage.PRODUCT__PRODUCTTRANSACTION, Product.class, msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, ImsPackage.PRODUCT__PRODUCTTRANSACTION, Product.class, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.PRODUCT_TRANSACTION__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImsPackage.PRODUCT_TRANSACTION__PRODUCT:
				if (product != null)
					msgs = ((InternalEObject)product).eInverseRemove(this, ImsPackage.PRODUCT__PRODUCTTRANSACTION, Product.class, msgs);
				return basicSetProduct((Product)otherEnd, msgs);
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
			case ImsPackage.PRODUCT_TRANSACTION__PRODUCT:
				return basicSetProduct(null, msgs);
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
			case ImsPackage.PRODUCT_TRANSACTION__PRICE:
				return getPrice();
			case ImsPackage.PRODUCT_TRANSACTION__QUANTITY:
				return getQuantity();
			case ImsPackage.PRODUCT_TRANSACTION__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
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
			case ImsPackage.PRODUCT_TRANSACTION__PRICE:
				setPrice((Float)newValue);
				return;
			case ImsPackage.PRODUCT_TRANSACTION__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case ImsPackage.PRODUCT_TRANSACTION__PRODUCT:
				setProduct((Product)newValue);
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
			case ImsPackage.PRODUCT_TRANSACTION__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ImsPackage.PRODUCT_TRANSACTION__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ImsPackage.PRODUCT_TRANSACTION__PRODUCT:
				setProduct((Product)null);
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
			case ImsPackage.PRODUCT_TRANSACTION__PRICE:
				return price != PRICE_EDEFAULT;
			case ImsPackage.PRODUCT_TRANSACTION__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case ImsPackage.PRODUCT_TRANSACTION__PRODUCT:
				return product != null;
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
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //ProductTransactionImpl
