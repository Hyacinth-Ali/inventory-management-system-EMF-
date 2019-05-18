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
 *   <li>{@link com.ali.hyacinth.ims.IMS#getProducts <em>Products</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getSuppliers <em>Suppliers</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getManagers <em>Managers</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getOrders <em>Orders</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getAudits <em>Audits</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getPersons <em>Persons</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getRegularemployees <em>Regularemployees</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getCustomers <em>Customers</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.IMS#getProducttransactions <em>Producttransactions</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getIMS()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneKindRolePerPerson'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot oneKindRolePerPerson='Tuple {\n\tmessage : String = \'A person cannot play more than one kind of role.\',\n\tstatus : Boolean = \n\t\tself.customers -&gt; forAll(c1, c2 | c1.person &lt;&gt; c2.person)\n}.status'"
 * @generated
 */
public interface IMS extends EObject {
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
	
	//current date
	java.util.Date getCurrentDate();

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
	 * Returns the value of the '<em><b>Producttransactions</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.ProductTransaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producttransactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producttransactions</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getIMS_Producttransactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductTransaction> getProducttransactions();

} // IMS
