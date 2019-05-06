/**
 */
package com.ali.hyacinth.ims.impl;

import com.ali.hyacinth.ims.Audit;
import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.Order;
import com.ali.hyacinth.ims.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.impl.AuditImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.AuditImpl#getOrders <em>Orders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditImpl extends MinimalEObjectImpl.Container implements Audit {
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
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> orders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImsPackage.Literals.AUDIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new EObjectResolvingEList<Transaction>(Transaction.class, this, ImsPackage.AUDIT__TRANSACTIONS);
		}
		return transactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Order> getOrders() {
		if (orders == null) {
			orders = new EObjectResolvingEList<Order>(Order.class, this, ImsPackage.AUDIT__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImsPackage.AUDIT__TRANSACTIONS:
				return getTransactions();
			case ImsPackage.AUDIT__ORDERS:
				return getOrders();
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
			case ImsPackage.AUDIT__TRANSACTIONS:
				getTransactions().clear();
				getTransactions().addAll((Collection<? extends Transaction>)newValue);
				return;
			case ImsPackage.AUDIT__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Order>)newValue);
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
			case ImsPackage.AUDIT__TRANSACTIONS:
				getTransactions().clear();
				return;
			case ImsPackage.AUDIT__ORDERS:
				getOrders().clear();
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
			case ImsPackage.AUDIT__TRANSACTIONS:
				return transactions != null && !transactions.isEmpty();
			case ImsPackage.AUDIT__ORDERS:
				return orders != null && !orders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditImpl
