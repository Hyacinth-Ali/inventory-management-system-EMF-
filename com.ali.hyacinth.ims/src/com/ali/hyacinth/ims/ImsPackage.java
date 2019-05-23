/**
 */
package com.ali.hyacinth.ims;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ali.hyacinth.ims.ImsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ImsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ims";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hyacinth.com/ims";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ims";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImsPackage eINSTANCE = com.ali.hyacinth.ims.impl.ImsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.NamedElementImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.ProductImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Item Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ITEM_PRICE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__QUANTITY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Producttransaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCTTRANSACTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TRANSACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.PersonImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SALES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Purchases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PURCHASES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.PersonRoleImpl <em>Person Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.PersonRoleImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getPersonRole()
	 * @generated
	 */
	int PERSON_ROLE = 9;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__PERSON = 0;

	/**
	 * The number of structural features of the '<em>Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.EmployeeRoleImpl <em>Employee Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.EmployeeRoleImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getEmployeeRole()
	 * @generated
	 */
	int EMPLOYEE_ROLE = 8;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_ROLE__PERSON = PERSON_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_ROLE__USER_NAME = PERSON_ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_ROLE__PASSWORD = PERSON_ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Employee Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_ROLE_FEATURE_COUNT = PERSON_ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Employee Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_ROLE_OPERATION_COUNT = PERSON_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.RegularEmployeeImpl <em>Regular Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.RegularEmployeeImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getRegularEmployee()
	 * @generated
	 */
	int REGULAR_EMPLOYEE = 3;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EMPLOYEE__PERSON = EMPLOYEE_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EMPLOYEE__USER_NAME = EMPLOYEE_ROLE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EMPLOYEE__PASSWORD = EMPLOYEE_ROLE__PASSWORD;

	/**
	 * The number of structural features of the '<em>Regular Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EMPLOYEE_FEATURE_COUNT = EMPLOYEE_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_EMPLOYEE_OPERATION_COUNT = EMPLOYEE_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.ManagerImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__PERSON = EMPLOYEE_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__USER_NAME = EMPLOYEE_ROLE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__PASSWORD = EMPLOYEE_ROLE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__AUDIT = EMPLOYEE_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = EMPLOYEE_ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = EMPLOYEE_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.TransactionImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 5;

	/**
	 * The feature id for the '<em><b>Seller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__SELLER = 0;

	/**
	 * The feature id for the '<em><b>Buyer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__BUYER = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DATE = 2;

	/**
	 * The feature id for the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TOTAL_AMOUNT = 3;

	/**
	 * The feature id for the '<em><b>Amount Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__AMOUNT_PAID = 4;

	/**
	 * The feature id for the '<em><b>Amount Unpaid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__AMOUNT_UNPAID = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ID = 6;

	/**
	 * The feature id for the '<em><b>Producttransactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PRODUCTTRANSACTIONS = 7;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PRODUCTS = 8;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.AuditImpl <em>Audit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.AuditImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getAudit()
	 * @generated
	 */
	int AUDIT = 6;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT__TRANSACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT__ORDERS = 1;

	/**
	 * The number of structural features of the '<em>Audit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Audit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.CustomerImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 7;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PERSON = PERSON_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Debt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__DEBT = PERSON_ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMER_ID = PERSON_ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = PERSON_ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = PERSON_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.SupplierImpl <em>Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.SupplierImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getSupplier()
	 * @generated
	 */
	int SUPPLIER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.OrderImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 11;

	/**
	 * The feature id for the '<em><b>Ordered Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDERED_DATE = 0;

	/**
	 * The feature id for the '<em><b>Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ARRIVAL_DATE = 1;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__SUPPLIER = 2;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRODUCTS = 3;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.IMSImpl <em>IMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.IMSImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getIMS()
	 * @generated
	 */
	int IMS = 12;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Suppliers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__SUPPLIERS = 1;

	/**
	 * The feature id for the '<em><b>Managers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__MANAGERS = 2;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__ORDERS = 3;

	/**
	 * The feature id for the '<em><b>Audits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__AUDITS = 4;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__PERSONS = 5;

	/**
	 * The feature id for the '<em><b>Regularemployees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__REGULAREMPLOYEES = 6;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__CUSTOMERS = 7;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__TRANSACTIONS = 8;

	/**
	 * The feature id for the '<em><b>Producttransactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__PRODUCTTRANSACTIONS = 9;

	/**
	 * The number of structural features of the '<em>IMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>IMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.impl.ProductTransactionImpl <em>Product Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.impl.ProductTransactionImpl
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getProductTransaction()
	 * @generated
	 */
	int PRODUCT_TRANSACTION = 13;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TRANSACTION__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TRANSACTION__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TRANSACTION__PRODUCT = 2;

	/**
	 * The number of structural features of the '<em>Product Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TRANSACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ali.hyacinth.ims.ItemStatus <em>Item Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ali.hyacinth.ims.ItemStatus
	 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getItemStatus()
	 * @generated
	 */
	int ITEM_STATUS = 14;


	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.ali.hyacinth.ims.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ali.hyacinth.ims.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see com.ali.hyacinth.ims.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.Product#getItemPrice <em>Item Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Price</em>'.
	 * @see com.ali.hyacinth.ims.Product#getItemPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ItemPrice();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.Product#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.ali.hyacinth.ims.Product#getId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.Product#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see com.ali.hyacinth.ims.Product#getQuantity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Quantity();

	/**
	 * Returns the meta object for the reference '{@link com.ali.hyacinth.ims.Product#getProducttransaction <em>Producttransaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Producttransaction</em>'.
	 * @see com.ali.hyacinth.ims.Product#getProducttransaction()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Producttransaction();

	/**
	 * Returns the meta object for the reference list '{@link com.ali.hyacinth.ims.Product#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see com.ali.hyacinth.ims.Product#getTransactions()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Transactions();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see com.ali.hyacinth.ims.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the reference list '{@link com.ali.hyacinth.ims.Person#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see com.ali.hyacinth.ims.Person#getRoles()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Roles();

	/**
	 * Returns the meta object for the reference list '{@link com.ali.hyacinth.ims.Person#getSales <em>Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales</em>'.
	 * @see com.ali.hyacinth.ims.Person#getSales()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Sales();

	/**
	 * Returns the meta object for the reference list '{@link com.ali.hyacinth.ims.Person#getPurchases <em>Purchases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Purchases</em>'.
	 * @see com.ali.hyacinth.ims.Person#getPurchases()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Purchases();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.RegularEmployee <em>Regular Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Employee</em>'.
	 * @see com.ali.hyacinth.ims.RegularEmployee
	 * @generated
	 */
	EClass getRegularEmployee();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see com.ali.hyacinth.ims.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the reference '{@link com.ali.hyacinth.ims.Manager#getAudit <em>Audit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Audit</em>'.
	 * @see com.ali.hyacinth.ims.Manager#getAudit()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Audit();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see com.ali.hyacinth.ims.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the reference '{@link com.ali.hyacinth.ims.Transaction#getSeller <em>Seller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seller</em>'.
	 * @see com.ali.hyacinth.ims.Transaction#getSeller()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Seller();

	/**
	 * Returns the meta object for the reference '{@link com.ali.hyacinth.ims.Transaction#getBuyer <em>Buyer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buyer</em>'.
	 * @see com.ali.hyacinth.ims.Transaction#getBuyer()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Buyer();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.Transaction#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.ali.hyacinth.ims.Transaction#getDate()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Date();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.Transaction#getTotalAmount <em>Total Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Amount</em>'.
	 * @see com.ali.hyacinth.ims.Transaction#getTotalAmount()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_TotalAmount();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.Transaction#getAmountPaid <em>Amount Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Paid</em>'.
	 * @see com.ali.hyacinth.ims.Transaction#getAmountPaid()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_AmountPaid();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.Transaction#getAmountUnpaid <em>Amount Unpaid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Unpaid</em>'.
	 * @see com.ali.hyacinth.ims.Transaction#getAmountUnpaid()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_AmountUnpaid();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.Transaction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.ali.hyacinth.ims.Transaction#getId()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ali.hyacinth.ims.Transaction#getProducttransactions <em>Producttransactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Producttransactions</em>'.
	 * @see com.ali.hyacinth.ims.Transaction#getProducttransactions()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Producttransactions();

	/**
	 * Returns the meta object for the reference list '{@link com.ali.hyacinth.ims.Transaction#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see com.ali.hyacinth.ims.Transaction#getProducts()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Products();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.Audit <em>Audit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audit</em>'.
	 * @see com.ali.hyacinth.ims.Audit
	 * @generated
	 */
	EClass getAudit();

	/**
	 * Returns the meta object for the reference list '{@link com.ali.hyacinth.ims.Audit#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see com.ali.hyacinth.ims.Audit#getTransactions()
	 * @see #getAudit()
	 * @generated
	 */
	EReference getAudit_Transactions();

	/**
	 * Returns the meta object for the reference list '{@link com.ali.hyacinth.ims.Audit#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orders</em>'.
	 * @see com.ali.hyacinth.ims.Audit#getOrders()
	 * @see #getAudit()
	 * @generated
	 */
	EReference getAudit_Orders();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see com.ali.hyacinth.ims.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.Customer#getDebt <em>Debt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debt</em>'.
	 * @see com.ali.hyacinth.ims.Customer#getDebt()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Debt();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.Customer#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see com.ali.hyacinth.ims.Customer#getCustomerID()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CustomerID();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.EmployeeRole <em>Employee Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee Role</em>'.
	 * @see com.ali.hyacinth.ims.EmployeeRole
	 * @generated
	 */
	EClass getEmployeeRole();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.EmployeeRole#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see com.ali.hyacinth.ims.EmployeeRole#getUserName()
	 * @see #getEmployeeRole()
	 * @generated
	 */
	EAttribute getEmployeeRole_UserName();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.EmployeeRole#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.ali.hyacinth.ims.EmployeeRole#getPassword()
	 * @see #getEmployeeRole()
	 * @generated
	 */
	EAttribute getEmployeeRole_Password();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.PersonRole <em>Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Role</em>'.
	 * @see com.ali.hyacinth.ims.PersonRole
	 * @generated
	 */
	EClass getPersonRole();

	/**
	 * Returns the meta object for the reference '{@link com.ali.hyacinth.ims.PersonRole#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see com.ali.hyacinth.ims.PersonRole#getPerson()
	 * @see #getPersonRole()
	 * @generated
	 */
	EReference getPersonRole_Person();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier</em>'.
	 * @see com.ali.hyacinth.ims.Supplier
	 * @generated
	 */
	EClass getSupplier();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see com.ali.hyacinth.ims.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.Order#getOrderedDate <em>Ordered Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered Date</em>'.
	 * @see com.ali.hyacinth.ims.Order#getOrderedDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderedDate();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.Order#getArrivalDate <em>Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Date</em>'.
	 * @see com.ali.hyacinth.ims.Order#getArrivalDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_ArrivalDate();

	/**
	 * Returns the meta object for the reference '{@link com.ali.hyacinth.ims.Order#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier</em>'.
	 * @see com.ali.hyacinth.ims.Order#getSupplier()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Supplier();

	/**
	 * Returns the meta object for the reference list '{@link com.ali.hyacinth.ims.Order#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see com.ali.hyacinth.ims.Order#getProducts()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Products();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.IMS <em>IMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMS</em>'.
	 * @see com.ali.hyacinth.ims.IMS
	 * @generated
	 */
	EClass getIMS();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ali.hyacinth.ims.IMS#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see com.ali.hyacinth.ims.IMS#getProducts()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ali.hyacinth.ims.IMS#getSuppliers <em>Suppliers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Suppliers</em>'.
	 * @see com.ali.hyacinth.ims.IMS#getSuppliers()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Suppliers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ali.hyacinth.ims.IMS#getManagers <em>Managers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Managers</em>'.
	 * @see com.ali.hyacinth.ims.IMS#getManagers()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Managers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ali.hyacinth.ims.IMS#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see com.ali.hyacinth.ims.IMS#getOrders()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ali.hyacinth.ims.IMS#getAudits <em>Audits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audits</em>'.
	 * @see com.ali.hyacinth.ims.IMS#getAudits()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Audits();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ali.hyacinth.ims.IMS#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see com.ali.hyacinth.ims.IMS#getPersons()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ali.hyacinth.ims.IMS#getRegularemployees <em>Regularemployees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regularemployees</em>'.
	 * @see com.ali.hyacinth.ims.IMS#getRegularemployees()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Regularemployees();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ali.hyacinth.ims.IMS#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see com.ali.hyacinth.ims.IMS#getCustomers()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ali.hyacinth.ims.IMS#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transactions</em>'.
	 * @see com.ali.hyacinth.ims.IMS#getTransactions()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Transactions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ali.hyacinth.ims.IMS#getProducttransactions <em>Producttransactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Producttransactions</em>'.
	 * @see com.ali.hyacinth.ims.IMS#getProducttransactions()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Producttransactions();

	/**
	 * Returns the meta object for class '{@link com.ali.hyacinth.ims.ProductTransaction <em>Product Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Transaction</em>'.
	 * @see com.ali.hyacinth.ims.ProductTransaction
	 * @generated
	 */
	EClass getProductTransaction();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.ProductTransaction#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see com.ali.hyacinth.ims.ProductTransaction#getPrice()
	 * @see #getProductTransaction()
	 * @generated
	 */
	EAttribute getProductTransaction_Price();

	/**
	 * Returns the meta object for the attribute '{@link com.ali.hyacinth.ims.ProductTransaction#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see com.ali.hyacinth.ims.ProductTransaction#getQuantity()
	 * @see #getProductTransaction()
	 * @generated
	 */
	EAttribute getProductTransaction_Quantity();

	/**
	 * Returns the meta object for the reference '{@link com.ali.hyacinth.ims.ProductTransaction#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see com.ali.hyacinth.ims.ProductTransaction#getProduct()
	 * @see #getProductTransaction()
	 * @generated
	 */
	EReference getProductTransaction_Product();

	/**
	 * Returns the meta object for enum '{@link com.ali.hyacinth.ims.ItemStatus <em>Item Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Item Status</em>'.
	 * @see com.ali.hyacinth.ims.ItemStatus
	 * @generated
	 */
	EEnum getItemStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImsFactory getImsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.NamedElementImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.ProductImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Item Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ITEM_PRICE = eINSTANCE.getProduct_ItemPrice();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ID = eINSTANCE.getProduct_Id();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__QUANTITY = eINSTANCE.getProduct_Quantity();

		/**
		 * The meta object literal for the '<em><b>Producttransaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCTTRANSACTION = eINSTANCE.getProduct_Producttransaction();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__TRANSACTIONS = eINSTANCE.getProduct_Transactions();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.PersonImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ROLES = eINSTANCE.getPerson_Roles();

		/**
		 * The meta object literal for the '<em><b>Sales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__SALES = eINSTANCE.getPerson_Sales();

		/**
		 * The meta object literal for the '<em><b>Purchases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PURCHASES = eINSTANCE.getPerson_Purchases();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.RegularEmployeeImpl <em>Regular Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.RegularEmployeeImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getRegularEmployee()
		 * @generated
		 */
		EClass REGULAR_EMPLOYEE = eINSTANCE.getRegularEmployee();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.ManagerImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Audit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__AUDIT = eINSTANCE.getManager_Audit();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.TransactionImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Seller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__SELLER = eINSTANCE.getTransaction_Seller();

		/**
		 * The meta object literal for the '<em><b>Buyer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__BUYER = eINSTANCE.getTransaction_Buyer();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__DATE = eINSTANCE.getTransaction_Date();

		/**
		 * The meta object literal for the '<em><b>Total Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__TOTAL_AMOUNT = eINSTANCE.getTransaction_TotalAmount();

		/**
		 * The meta object literal for the '<em><b>Amount Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__AMOUNT_PAID = eINSTANCE.getTransaction_AmountPaid();

		/**
		 * The meta object literal for the '<em><b>Amount Unpaid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__AMOUNT_UNPAID = eINSTANCE.getTransaction_AmountUnpaid();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__ID = eINSTANCE.getTransaction_Id();

		/**
		 * The meta object literal for the '<em><b>Producttransactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__PRODUCTTRANSACTIONS = eINSTANCE.getTransaction_Producttransactions();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__PRODUCTS = eINSTANCE.getTransaction_Products();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.AuditImpl <em>Audit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.AuditImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getAudit()
		 * @generated
		 */
		EClass AUDIT = eINSTANCE.getAudit();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIT__TRANSACTIONS = eINSTANCE.getAudit_Transactions();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIT__ORDERS = eINSTANCE.getAudit_Orders();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.CustomerImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Debt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__DEBT = eINSTANCE.getCustomer_Debt();

		/**
		 * The meta object literal for the '<em><b>Customer ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CUSTOMER_ID = eINSTANCE.getCustomer_CustomerID();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.EmployeeRoleImpl <em>Employee Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.EmployeeRoleImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getEmployeeRole()
		 * @generated
		 */
		EClass EMPLOYEE_ROLE = eINSTANCE.getEmployeeRole();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE_ROLE__USER_NAME = eINSTANCE.getEmployeeRole_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE_ROLE__PASSWORD = eINSTANCE.getEmployeeRole_Password();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.PersonRoleImpl <em>Person Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.PersonRoleImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getPersonRole()
		 * @generated
		 */
		EClass PERSON_ROLE = eINSTANCE.getPersonRole();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_ROLE__PERSON = eINSTANCE.getPersonRole_Person();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.SupplierImpl <em>Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.SupplierImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getSupplier()
		 * @generated
		 */
		EClass SUPPLIER = eINSTANCE.getSupplier();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.OrderImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Ordered Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDERED_DATE = eINSTANCE.getOrder_OrderedDate();

		/**
		 * The meta object literal for the '<em><b>Arrival Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ARRIVAL_DATE = eINSTANCE.getOrder_ArrivalDate();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__SUPPLIER = eINSTANCE.getOrder_Supplier();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__PRODUCTS = eINSTANCE.getOrder_Products();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.IMSImpl <em>IMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.IMSImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getIMS()
		 * @generated
		 */
		EClass IMS = eINSTANCE.getIMS();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__PRODUCTS = eINSTANCE.getIMS_Products();

		/**
		 * The meta object literal for the '<em><b>Suppliers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__SUPPLIERS = eINSTANCE.getIMS_Suppliers();

		/**
		 * The meta object literal for the '<em><b>Managers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__MANAGERS = eINSTANCE.getIMS_Managers();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__ORDERS = eINSTANCE.getIMS_Orders();

		/**
		 * The meta object literal for the '<em><b>Audits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__AUDITS = eINSTANCE.getIMS_Audits();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__PERSONS = eINSTANCE.getIMS_Persons();

		/**
		 * The meta object literal for the '<em><b>Regularemployees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__REGULAREMPLOYEES = eINSTANCE.getIMS_Regularemployees();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__CUSTOMERS = eINSTANCE.getIMS_Customers();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__TRANSACTIONS = eINSTANCE.getIMS_Transactions();

		/**
		 * The meta object literal for the '<em><b>Producttransactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__PRODUCTTRANSACTIONS = eINSTANCE.getIMS_Producttransactions();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.impl.ProductTransactionImpl <em>Product Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.impl.ProductTransactionImpl
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getProductTransaction()
		 * @generated
		 */
		EClass PRODUCT_TRANSACTION = eINSTANCE.getProductTransaction();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TRANSACTION__PRICE = eINSTANCE.getProductTransaction_Price();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TRANSACTION__QUANTITY = eINSTANCE.getProductTransaction_Quantity();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TRANSACTION__PRODUCT = eINSTANCE.getProductTransaction_Product();

		/**
		 * The meta object literal for the '{@link com.ali.hyacinth.ims.ItemStatus <em>Item Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ali.hyacinth.ims.ItemStatus
		 * @see com.ali.hyacinth.ims.impl.ImsPackageImpl#getItemStatus()
		 * @generated
		 */
		EEnum ITEM_STATUS = eINSTANCE.getItemStatus();

	}

} //ImsPackage
