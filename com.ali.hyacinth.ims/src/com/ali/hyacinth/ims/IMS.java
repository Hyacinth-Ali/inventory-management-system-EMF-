/**
 */
package com.ali.hyacinth.ims;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getItem <em>Item</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getProducts <em>Products</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getSuppliers <em>Suppliers</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getManagers <em>Managers</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getOrders <em>Orders</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getAudits <em>Audits</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getPersons <em>Persons</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getRegularemployees <em>Regularemployees</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getCustomers <em>Customers</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getReceipts <em>Receipts</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getIMS()
 * @model
 * @generated
 */
public interface IMS extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItem();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Suppliers</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Supplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppliers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppliers</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_Suppliers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Supplier> getSuppliers();

	/**
	 * Returns the value of the '<em><b>Managers</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Manager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managers</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_Managers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Manager> getManagers();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Audits</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Audit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audits</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_Audits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Audit> getAudits();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Regularemployees</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.RegularEmployee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regularemployees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regularemployees</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_Regularemployees()
	 * @model containment="true"
	 * @generated
	 */
	EList<RegularEmployee> getRegularemployees();

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Transaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_Transactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transaction> getTransactions();

	/**
	 * Returns the value of the '<em><b>Receipts</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Receipt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipts</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_Receipts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Receipt> getReceipts();

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.IMS#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // IMS
