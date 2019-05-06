/**
 */
package com.ali.hyacinth.ims.impl;

import com.ali.hyacinth.ims.Customer;
import com.ali.hyacinth.ims.ImsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.impl.CustomerImpl#getDebt <em>Debt</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.CustomerImpl#getCustomerID <em>Customer ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends PersonRoleImpl implements Customer {
	/**
	 * The default value of the '{@link #getDebt() <em>Debt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebt()
	 * @generated
	 * @ordered
	 */
	protected static final float DEBT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDebt() <em>Debt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebt()
	 * @generated
	 * @ordered
	 */
	protected float debt = DEBT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerID() <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerID() <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerID()
	 * @generated
	 * @ordered
	 */
	protected String customerID = CUSTOMER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImsPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDebt() {
		return debt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebt(float newDebt) {
		float oldDebt = debt;
		debt = newDebt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.CUSTOMER__DEBT, oldDebt, debt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerID(String newCustomerID) {
		String oldCustomerID = customerID;
		customerID = newCustomerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImsPackage.CUSTOMER__CUSTOMER_ID, oldCustomerID, customerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImsPackage.CUSTOMER__DEBT:
				return getDebt();
			case ImsPackage.CUSTOMER__CUSTOMER_ID:
				return getCustomerID();
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
			case ImsPackage.CUSTOMER__DEBT:
				setDebt((Float)newValue);
				return;
			case ImsPackage.CUSTOMER__CUSTOMER_ID:
				setCustomerID((String)newValue);
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
			case ImsPackage.CUSTOMER__DEBT:
				setDebt(DEBT_EDEFAULT);
				return;
			case ImsPackage.CUSTOMER__CUSTOMER_ID:
				setCustomerID(CUSTOMER_ID_EDEFAULT);
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
			case ImsPackage.CUSTOMER__DEBT:
				return debt != DEBT_EDEFAULT;
			case ImsPackage.CUSTOMER__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? customerID != null : !CUSTOMER_ID_EDEFAULT.equals(customerID);
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
		result.append(" (debt: ");
		result.append(debt);
		result.append(", customerID: ");
		result.append(customerID);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
