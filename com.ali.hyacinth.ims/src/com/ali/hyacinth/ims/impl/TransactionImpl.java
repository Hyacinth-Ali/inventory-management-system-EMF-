/**
 */
package com.ali.hyacinth.ims.impl;

import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.Person;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.Receipt;
import com.ali.hyacinth.ims.Transaction;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.impl.TransactionImpl#getSeller <em>Seller</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.TransactionImpl#getBuyer <em>Buyer</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.TransactionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.TransactionImpl#getTotalAmount <em>Total Amount</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.TransactionImpl#getAmountPaid <em>Amount Paid</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.TransactionImpl#getAmountUnpaid <em>Amount Unpaid</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.TransactionImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.TransactionImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.TransactionImpl#getReceipts <em>Receipts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends MinimalEObjectImpl.Container implements Transaction {
	/**
	 * The cached value of the '{@link #getSeller() <em>Seller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeller()
	 * @generated
	 * @ordered
	 */
	protected Person seller;

	/**
	 * The cached value of the '{@link #getBuyer() <em>Buyer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyer()
	 * @generated
	 * @ordered
	 */
	protected Person buyer;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected float totalAmount = TOTAL_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountPaid() <em>Amount Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_PAID_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmountPaid() <em>Amount Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected float amountPaid = AMOUNT_PAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountUnpaid() <em>Amount Unpaid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountUnpaid()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_UNPAID_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmountUnpaid() <em>Amount Unpaid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountUnpaid()
	 * @generated
	 * @ordered
	 */
	protected float amountUnpaid = AMOUNT_UNPAID_EDEFAULT;

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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceipts() <em>Receipts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceipts()
	 * @generated
	 * @ordered
	 */
	protected EList<Receipt> receipts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImsPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getSeller() {
		if (seller != null && seller.eIsProxy()) {
			InternalEObject oldSeller = (InternalEObject)seller;
			seller = (Person)eResolveProxy(oldSeller);
			if (seller != oldSeller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsPackage.TRANSACTION__SELLER, oldSeller, seller));
			}
		}
		return seller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetSeller() {
		return seller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeller(Person newSeller, NotificationChain msgs) {
		Person oldSeller = seller;
		seller = newSeller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImsPackage.TRANSACTION__SELLER, oldSeller, newSeller);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeller(Person newSeller) {
		if (newSeller != seller) {
			NotificationChain msgs = null;
			if (seller != null)
				msgs = ((InternalEObject)seller).eInverseRemove(this, ImsPackage.PERSON__SALES, Person.class, msgs);
			if (newSeller != null)
				msgs = ((InternalEObject)newSeller).eInverseAdd(this, ImsPackage.PERSON__SALES, Person.class, msgs);
			msgs = basicSetSeller(newSeller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.TRANSACTION__SELLER, newSeller, newSeller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getBuyer() {
		if (buyer != null && buyer.eIsProxy()) {
			InternalEObject oldBuyer = (InternalEObject)buyer;
			buyer = (Person)eResolveProxy(oldBuyer);
			if (buyer != oldBuyer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsPackage.TRANSACTION__BUYER, oldBuyer, buyer));
			}
		}
		return buyer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetBuyer() {
		return buyer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuyer(Person newBuyer, NotificationChain msgs) {
		Person oldBuyer = buyer;
		buyer = newBuyer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImsPackage.TRANSACTION__BUYER, oldBuyer, newBuyer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuyer(Person newBuyer) {
		if (newBuyer != buyer) {
			NotificationChain msgs = null;
			if (buyer != null)
				msgs = ((InternalEObject)buyer).eInverseRemove(this, ImsPackage.PERSON__PURCHASES, Person.class, msgs);
			if (newBuyer != null)
				msgs = ((InternalEObject)newBuyer).eInverseAdd(this, ImsPackage.PERSON__PURCHASES, Person.class, msgs);
			msgs = basicSetBuyer(newBuyer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.TRANSACTION__BUYER, newBuyer, newBuyer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.TRANSACTION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalAmount() {
		return totalAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalAmount(float newTotalAmount) {
		float oldTotalAmount = totalAmount;
		totalAmount = newTotalAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.TRANSACTION__TOTAL_AMOUNT, oldTotalAmount, totalAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmountPaid() {
		return amountPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountPaid(float newAmountPaid) {
		float oldAmountPaid = amountPaid;
		amountPaid = newAmountPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.TRANSACTION__AMOUNT_PAID, oldAmountPaid, amountPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmountUnpaid() {
		return amountUnpaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountUnpaid(float newAmountUnpaid) {
		float oldAmountUnpaid = amountUnpaid;
		amountUnpaid = newAmountUnpaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.TRANSACTION__AMOUNT_UNPAID, oldAmountUnpaid, amountUnpaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectResolvingEList<Product>(Product.class, this, ImsPackage.TRANSACTION__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.TRANSACTION__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Receipt> getReceipts() {
		if (receipts == null) {
			receipts = new EObjectWithInverseResolvingEList<Receipt>(Receipt.class, this, ImsPackage.TRANSACTION__RECEIPTS, ImsPackage.RECEIPT__TRANSACTION);
		}
		return receipts;
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
			case ImsPackage.TRANSACTION__SELLER:
				if (seller != null)
					msgs = ((InternalEObject)seller).eInverseRemove(this, ImsPackage.PERSON__SALES, Person.class, msgs);
				return basicSetSeller((Person)otherEnd, msgs);
			case ImsPackage.TRANSACTION__BUYER:
				if (buyer != null)
					msgs = ((InternalEObject)buyer).eInverseRemove(this, ImsPackage.PERSON__PURCHASES, Person.class, msgs);
				return basicSetBuyer((Person)otherEnd, msgs);
			case ImsPackage.TRANSACTION__RECEIPTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceipts()).basicAdd(otherEnd, msgs);
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
			case ImsPackage.TRANSACTION__SELLER:
				return basicSetSeller(null, msgs);
			case ImsPackage.TRANSACTION__BUYER:
				return basicSetBuyer(null, msgs);
			case ImsPackage.TRANSACTION__RECEIPTS:
				return ((InternalEList<?>)getReceipts()).basicRemove(otherEnd, msgs);
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
			case ImsPackage.TRANSACTION__SELLER:
				if (resolve) return getSeller();
				return basicGetSeller();
			case ImsPackage.TRANSACTION__BUYER:
				if (resolve) return getBuyer();
				return basicGetBuyer();
			case ImsPackage.TRANSACTION__DATE:
				return getDate();
			case ImsPackage.TRANSACTION__TOTAL_AMOUNT:
				return getTotalAmount();
			case ImsPackage.TRANSACTION__AMOUNT_PAID:
				return getAmountPaid();
			case ImsPackage.TRANSACTION__AMOUNT_UNPAID:
				return getAmountUnpaid();
			case ImsPackage.TRANSACTION__PRODUCTS:
				return getProducts();
			case ImsPackage.TRANSACTION__PRICE:
				return getPrice();
			case ImsPackage.TRANSACTION__RECEIPTS:
				return getReceipts();
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
			case ImsPackage.TRANSACTION__SELLER:
				setSeller((Person)newValue);
				return;
			case ImsPackage.TRANSACTION__BUYER:
				setBuyer((Person)newValue);
				return;
			case ImsPackage.TRANSACTION__DATE:
				setDate((Date)newValue);
				return;
			case ImsPackage.TRANSACTION__TOTAL_AMOUNT:
				setTotalAmount((Float)newValue);
				return;
			case ImsPackage.TRANSACTION__AMOUNT_PAID:
				setAmountPaid((Float)newValue);
				return;
			case ImsPackage.TRANSACTION__AMOUNT_UNPAID:
				setAmountUnpaid((Float)newValue);
				return;
			case ImsPackage.TRANSACTION__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case ImsPackage.TRANSACTION__PRICE:
				setPrice((Integer)newValue);
				return;
			case ImsPackage.TRANSACTION__RECEIPTS:
				getReceipts().clear();
				getReceipts().addAll((Collection<? extends Receipt>)newValue);
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
			case ImsPackage.TRANSACTION__SELLER:
				setSeller((Person)null);
				return;
			case ImsPackage.TRANSACTION__BUYER:
				setBuyer((Person)null);
				return;
			case ImsPackage.TRANSACTION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ImsPackage.TRANSACTION__TOTAL_AMOUNT:
				setTotalAmount(TOTAL_AMOUNT_EDEFAULT);
				return;
			case ImsPackage.TRANSACTION__AMOUNT_PAID:
				setAmountPaid(AMOUNT_PAID_EDEFAULT);
				return;
			case ImsPackage.TRANSACTION__AMOUNT_UNPAID:
				setAmountUnpaid(AMOUNT_UNPAID_EDEFAULT);
				return;
			case ImsPackage.TRANSACTION__PRODUCTS:
				getProducts().clear();
				return;
			case ImsPackage.TRANSACTION__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ImsPackage.TRANSACTION__RECEIPTS:
				getReceipts().clear();
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
			case ImsPackage.TRANSACTION__SELLER:
				return seller != null;
			case ImsPackage.TRANSACTION__BUYER:
				return buyer != null;
			case ImsPackage.TRANSACTION__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ImsPackage.TRANSACTION__TOTAL_AMOUNT:
				return totalAmount != TOTAL_AMOUNT_EDEFAULT;
			case ImsPackage.TRANSACTION__AMOUNT_PAID:
				return amountPaid != AMOUNT_PAID_EDEFAULT;
			case ImsPackage.TRANSACTION__AMOUNT_UNPAID:
				return amountUnpaid != AMOUNT_UNPAID_EDEFAULT;
			case ImsPackage.TRANSACTION__PRODUCTS:
				return products != null && !products.isEmpty();
			case ImsPackage.TRANSACTION__PRICE:
				return price != PRICE_EDEFAULT;
			case ImsPackage.TRANSACTION__RECEIPTS:
				return receipts != null && !receipts.isEmpty();
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
		result.append(" (date: ");
		result.append(date);
		result.append(", totalAmount: ");
		result.append(totalAmount);
		result.append(", amountPaid: ");
		result.append(amountPaid);
		result.append(", amountUnpaid: ");
		result.append(amountUnpaid);
		result.append(", price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //TransactionImpl
