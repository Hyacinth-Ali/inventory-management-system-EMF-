/**
 */
package com.ali.hyacinth.ims.impl;

import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.Person;
import com.ali.hyacinth.ims.PersonRole;
import com.ali.hyacinth.ims.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.impl.PersonImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.PersonImpl#getSales <em>Sales</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.PersonImpl#getPurchases <em>Purchases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends NamedElementImpl implements Person {
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonRole> roles;

	/**
	 * The cached value of the '{@link #getSales() <em>Sales</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSales()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> sales;

	/**
	 * The cached value of the '{@link #getPurchases() <em>Purchases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchases()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> purchases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImsPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonRole> getRoles() {
		if (roles == null) {
			roles = new EObjectWithInverseResolvingEList<PersonRole>(PersonRole.class, this, ImsPackage.PERSON__ROLES, ImsPackage.PERSON_ROLE__PERSON);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getSales() {
		if (sales == null) {
			sales = new EObjectWithInverseResolvingEList<Transaction>(Transaction.class, this, ImsPackage.PERSON__SALES, ImsPackage.TRANSACTION__SELLER);
		}
		return sales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getPurchases() {
		if (purchases == null) {
			purchases = new EObjectWithInverseResolvingEList<Transaction>(Transaction.class, this, ImsPackage.PERSON__PURCHASES, ImsPackage.TRANSACTION__BUYER);
		}
		return purchases;
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
			case ImsPackage.PERSON__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
			case ImsPackage.PERSON__SALES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSales()).basicAdd(otherEnd, msgs);
			case ImsPackage.PERSON__PURCHASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPurchases()).basicAdd(otherEnd, msgs);
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
			case ImsPackage.PERSON__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case ImsPackage.PERSON__SALES:
				return ((InternalEList<?>)getSales()).basicRemove(otherEnd, msgs);
			case ImsPackage.PERSON__PURCHASES:
				return ((InternalEList<?>)getPurchases()).basicRemove(otherEnd, msgs);
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
			case ImsPackage.PERSON__ROLES:
				return getRoles();
			case ImsPackage.PERSON__SALES:
				return getSales();
			case ImsPackage.PERSON__PURCHASES:
				return getPurchases();
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
			case ImsPackage.PERSON__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends PersonRole>)newValue);
				return;
			case ImsPackage.PERSON__SALES:
				getSales().clear();
				getSales().addAll((Collection<? extends Transaction>)newValue);
				return;
			case ImsPackage.PERSON__PURCHASES:
				getPurchases().clear();
				getPurchases().addAll((Collection<? extends Transaction>)newValue);
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
			case ImsPackage.PERSON__ROLES:
				getRoles().clear();
				return;
			case ImsPackage.PERSON__SALES:
				getSales().clear();
				return;
			case ImsPackage.PERSON__PURCHASES:
				getPurchases().clear();
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
			case ImsPackage.PERSON__ROLES:
				return roles != null && !roles.isEmpty();
			case ImsPackage.PERSON__SALES:
				return sales != null && !sales.isEmpty();
			case ImsPackage.PERSON__PURCHASES:
				return purchases != null && !purchases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonImpl
