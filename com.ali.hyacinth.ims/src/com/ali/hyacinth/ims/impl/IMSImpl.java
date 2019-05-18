/**
 */
package com.ali.hyacinth.ims.impl;

import com.ali.hyacinth.ims.Audit;
import com.ali.hyacinth.ims.Customer;
import com.ali.hyacinth.ims.IMS;
import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.Manager;
import com.ali.hyacinth.ims.Order;
import com.ali.hyacinth.ims.Person;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.ProductTransaction;
import com.ali.hyacinth.ims.RegularEmployee;
import com.ali.hyacinth.ims.Supplier;
import com.ali.hyacinth.ims.Transaction;

import java.util.Calendar;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.impl.IMSImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.IMSImpl#getSuppliers <em>Suppliers</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.IMSImpl#getManagers <em>Managers</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.IMSImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.IMSImpl#getAudits <em>Audits</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.IMSImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.IMSImpl#getRegularemployees <em>Regularemployees</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.IMSImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.IMSImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.impl.IMSImpl#getProducttransactions <em>Producttransactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IMSImpl extends MinimalEObjectImpl.Container implements IMS {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The cached value of the '{@link #getSuppliers() <em>Suppliers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected EList<Supplier> suppliers;

	/**
	 * The cached value of the '{@link #getManagers() <em>Managers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagers()
	 * @generated
	 * @ordered
	 */
	protected EList<Manager> managers;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> orders;

	/**
	 * The cached value of the '{@link #getAudits() <em>Audits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudits()
	 * @generated
	 * @ordered
	 */
	protected EList<Audit> audits;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getRegularemployees() <em>Regularemployees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularemployees()
	 * @generated
	 * @ordered
	 */
	protected EList<RegularEmployee> regularemployees;

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

	/**
	 * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> transactions;

	/**
	 * The cached value of the '{@link #getProducttransactions() <em>Producttransactions</em>}' containment reference list.
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
	protected IMSImpl() {
		super();
	}
	
	public java.util.Date getCurrentDate() {
	    java.util.Calendar cal = java.util.Calendar.getInstance();
	    cal.set(Calendar.HOUR_OF_DAY, 0);
	    cal.set(Calendar.MINUTE, 0);
	    cal.set(Calendar.SECOND, 0);
	    cal.set(Calendar.MILLISECOND, 0);
	    java.util.Date date = cal.getTime();
	    return date;
	  }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImsPackage.Literals.IMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<Product>(Product.class, this, ImsPackage.IMS__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Supplier> getSuppliers() {
		if (suppliers == null) {
			suppliers = new EObjectContainmentEList<Supplier>(Supplier.class, this, ImsPackage.IMS__SUPPLIERS);
		}
		return suppliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Manager> getManagers() {
		if (managers == null) {
			managers = new EObjectContainmentEList<Manager>(Manager.class, this, ImsPackage.IMS__MANAGERS);
		}
		return managers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Order> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentEList<Order>(Order.class, this, ImsPackage.IMS__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Audit> getAudits() {
		if (audits == null) {
			audits = new EObjectContainmentEList<Audit>(Audit.class, this, ImsPackage.IMS__AUDITS);
		}
		return audits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, ImsPackage.IMS__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularEmployee> getRegularemployees() {
		if (regularemployees == null) {
			regularemployees = new EObjectContainmentEList<RegularEmployee>(RegularEmployee.class, this, ImsPackage.IMS__REGULAREMPLOYEES);
		}
		return regularemployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<Customer>(Customer.class, this, ImsPackage.IMS__CUSTOMERS);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new EObjectContainmentEList<Transaction>(Transaction.class, this, ImsPackage.IMS__TRANSACTIONS);
		}
		return transactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductTransaction> getProducttransactions() {
		if (producttransactions == null) {
			producttransactions = new EObjectContainmentEList<ProductTransaction>(ProductTransaction.class, this, ImsPackage.IMS__PRODUCTTRANSACTIONS);
		}
		return producttransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImsPackage.IMS__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case ImsPackage.IMS__SUPPLIERS:
				return ((InternalEList<?>)getSuppliers()).basicRemove(otherEnd, msgs);
			case ImsPackage.IMS__MANAGERS:
				return ((InternalEList<?>)getManagers()).basicRemove(otherEnd, msgs);
			case ImsPackage.IMS__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
			case ImsPackage.IMS__AUDITS:
				return ((InternalEList<?>)getAudits()).basicRemove(otherEnd, msgs);
			case ImsPackage.IMS__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
			case ImsPackage.IMS__REGULAREMPLOYEES:
				return ((InternalEList<?>)getRegularemployees()).basicRemove(otherEnd, msgs);
			case ImsPackage.IMS__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
			case ImsPackage.IMS__TRANSACTIONS:
				return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
			case ImsPackage.IMS__PRODUCTTRANSACTIONS:
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
			case ImsPackage.IMS__PRODUCTS:
				return getProducts();
			case ImsPackage.IMS__SUPPLIERS:
				return getSuppliers();
			case ImsPackage.IMS__MANAGERS:
				return getManagers();
			case ImsPackage.IMS__ORDERS:
				return getOrders();
			case ImsPackage.IMS__AUDITS:
				return getAudits();
			case ImsPackage.IMS__PERSONS:
				return getPersons();
			case ImsPackage.IMS__REGULAREMPLOYEES:
				return getRegularemployees();
			case ImsPackage.IMS__CUSTOMERS:
				return getCustomers();
			case ImsPackage.IMS__TRANSACTIONS:
				return getTransactions();
			case ImsPackage.IMS__PRODUCTTRANSACTIONS:
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
			case ImsPackage.IMS__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case ImsPackage.IMS__SUPPLIERS:
				getSuppliers().clear();
				getSuppliers().addAll((Collection<? extends Supplier>)newValue);
				return;
			case ImsPackage.IMS__MANAGERS:
				getManagers().clear();
				getManagers().addAll((Collection<? extends Manager>)newValue);
				return;
			case ImsPackage.IMS__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Order>)newValue);
				return;
			case ImsPackage.IMS__AUDITS:
				getAudits().clear();
				getAudits().addAll((Collection<? extends Audit>)newValue);
				return;
			case ImsPackage.IMS__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case ImsPackage.IMS__REGULAREMPLOYEES:
				getRegularemployees().clear();
				getRegularemployees().addAll((Collection<? extends RegularEmployee>)newValue);
				return;
			case ImsPackage.IMS__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
				return;
			case ImsPackage.IMS__TRANSACTIONS:
				getTransactions().clear();
				getTransactions().addAll((Collection<? extends Transaction>)newValue);
				return;
			case ImsPackage.IMS__PRODUCTTRANSACTIONS:
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
			case ImsPackage.IMS__PRODUCTS:
				getProducts().clear();
				return;
			case ImsPackage.IMS__SUPPLIERS:
				getSuppliers().clear();
				return;
			case ImsPackage.IMS__MANAGERS:
				getManagers().clear();
				return;
			case ImsPackage.IMS__ORDERS:
				getOrders().clear();
				return;
			case ImsPackage.IMS__AUDITS:
				getAudits().clear();
				return;
			case ImsPackage.IMS__PERSONS:
				getPersons().clear();
				return;
			case ImsPackage.IMS__REGULAREMPLOYEES:
				getRegularemployees().clear();
				return;
			case ImsPackage.IMS__CUSTOMERS:
				getCustomers().clear();
				return;
			case ImsPackage.IMS__TRANSACTIONS:
				getTransactions().clear();
				return;
			case ImsPackage.IMS__PRODUCTTRANSACTIONS:
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
			case ImsPackage.IMS__PRODUCTS:
				return products != null && !products.isEmpty();
			case ImsPackage.IMS__SUPPLIERS:
				return suppliers != null && !suppliers.isEmpty();
			case ImsPackage.IMS__MANAGERS:
				return managers != null && !managers.isEmpty();
			case ImsPackage.IMS__ORDERS:
				return orders != null && !orders.isEmpty();
			case ImsPackage.IMS__AUDITS:
				return audits != null && !audits.isEmpty();
			case ImsPackage.IMS__PERSONS:
				return persons != null && !persons.isEmpty();
			case ImsPackage.IMS__REGULAREMPLOYEES:
				return regularemployees != null && !regularemployees.isEmpty();
			case ImsPackage.IMS__CUSTOMERS:
				return customers != null && !customers.isEmpty();
			case ImsPackage.IMS__TRANSACTIONS:
				return transactions != null && !transactions.isEmpty();
			case ImsPackage.IMS__PRODUCTTRANSACTIONS:
				return producttransactions != null && !producttransactions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IMSImpl
