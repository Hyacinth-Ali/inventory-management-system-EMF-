/**
 */
package com.ali.hyacinth.ims.impl;

import com.ali.hyacinth.ims.Audit;
import com.ali.hyacinth.ims.Customer;
import com.ali.hyacinth.ims.EmployeeRole;
import com.ali.hyacinth.ims.ImsFactory;
import com.ali.hyacinth.ims.ImsPackage;
import com.ali.hyacinth.ims.ItemStatus;
import com.ali.hyacinth.ims.Manager;
import com.ali.hyacinth.ims.NamedElement;
import com.ali.hyacinth.ims.Order;
import com.ali.hyacinth.ims.Person;
import com.ali.hyacinth.ims.PersonRole;
import com.ali.hyacinth.ims.Product;
import com.ali.hyacinth.ims.ProductTransaction;
import com.ali.hyacinth.ims.RegularEmployee;
import com.ali.hyacinth.ims.Supplier;
import com.ali.hyacinth.ims.Transaction;
import com.ali.hyacinth.ims.util.ImsValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImsPackageImpl extends EPackageImpl implements ImsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularEmployeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum itemStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.ali.hyacinth.ims.ImsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImsPackageImpl() {
		super(eNS_URI, ImsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ImsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImsPackage init() {
		if (isInited) return (ImsPackage)EPackage.Registry.INSTANCE.getEPackage(ImsPackage.eNS_URI);

		// Obtain or create and register package
		ImsPackageImpl theImsPackage = (ImsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theImsPackage.createPackageContents();

		// Initialize created meta-data
		theImsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theImsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ImsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theImsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImsPackage.eNS_URI, theImsPackage);
		return theImsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_ItemPrice() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Id() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Quantity() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Producttransaction() {
		return (EReference)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Transactions() {
		return (EReference)productEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Roles() {
		return (EReference)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Sales() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Purchases() {
		return (EReference)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularEmployee() {
		return regularEmployeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManager() {
		return managerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_Audit() {
		return (EReference)managerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Seller() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Buyer() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Date() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_TotalAmount() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_AmountPaid() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_AmountUnpaid() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Id() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Producttransactions() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Products() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudit() {
		return auditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudit_Transactions() {
		return (EReference)auditEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudit_Orders() {
		return (EReference)auditEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Debt() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_CustomerID() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployeeRole() {
		return employeeRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployeeRole_UserName() {
		return (EAttribute)employeeRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployeeRole_Password() {
		return (EAttribute)employeeRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonRole() {
		return personRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonRole_Person() {
		return (EReference)personRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplier() {
		return supplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_OrderedDate() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_ArrivalDate() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Supplier() {
		return (EReference)orderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Products() {
		return (EReference)orderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIMS() {
		return imsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIMS_Products() {
		return (EReference)imsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIMS_Suppliers() {
		return (EReference)imsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIMS_Managers() {
		return (EReference)imsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIMS_Orders() {
		return (EReference)imsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIMS_Audits() {
		return (EReference)imsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIMS_Persons() {
		return (EReference)imsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIMS_Regularemployees() {
		return (EReference)imsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIMS_Customers() {
		return (EReference)imsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIMS_Transactions() {
		return (EReference)imsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIMS_Producttransactions() {
		return (EReference)imsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductTransaction() {
		return productTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductTransaction_Price() {
		return (EAttribute)productTransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductTransaction_Quantity() {
		return (EAttribute)productTransactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductTransaction_Product() {
		return (EReference)productTransactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getItemStatus() {
		return itemStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImsFactory getImsFactory() {
		return (ImsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__ITEM_PRICE);
		createEAttribute(productEClass, PRODUCT__ID);
		createEAttribute(productEClass, PRODUCT__QUANTITY);
		createEReference(productEClass, PRODUCT__PRODUCTTRANSACTION);
		createEReference(productEClass, PRODUCT__TRANSACTIONS);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__ROLES);
		createEReference(personEClass, PERSON__SALES);
		createEReference(personEClass, PERSON__PURCHASES);

		regularEmployeeEClass = createEClass(REGULAR_EMPLOYEE);

		managerEClass = createEClass(MANAGER);
		createEReference(managerEClass, MANAGER__AUDIT);

		transactionEClass = createEClass(TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__SELLER);
		createEReference(transactionEClass, TRANSACTION__BUYER);
		createEAttribute(transactionEClass, TRANSACTION__DATE);
		createEAttribute(transactionEClass, TRANSACTION__TOTAL_AMOUNT);
		createEAttribute(transactionEClass, TRANSACTION__AMOUNT_PAID);
		createEAttribute(transactionEClass, TRANSACTION__AMOUNT_UNPAID);
		createEAttribute(transactionEClass, TRANSACTION__ID);
		createEReference(transactionEClass, TRANSACTION__PRODUCTTRANSACTIONS);
		createEReference(transactionEClass, TRANSACTION__PRODUCTS);

		auditEClass = createEClass(AUDIT);
		createEReference(auditEClass, AUDIT__TRANSACTIONS);
		createEReference(auditEClass, AUDIT__ORDERS);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__DEBT);
		createEAttribute(customerEClass, CUSTOMER__CUSTOMER_ID);

		employeeRoleEClass = createEClass(EMPLOYEE_ROLE);
		createEAttribute(employeeRoleEClass, EMPLOYEE_ROLE__USER_NAME);
		createEAttribute(employeeRoleEClass, EMPLOYEE_ROLE__PASSWORD);

		personRoleEClass = createEClass(PERSON_ROLE);
		createEReference(personRoleEClass, PERSON_ROLE__PERSON);

		supplierEClass = createEClass(SUPPLIER);

		orderEClass = createEClass(ORDER);
		createEAttribute(orderEClass, ORDER__ORDERED_DATE);
		createEAttribute(orderEClass, ORDER__ARRIVAL_DATE);
		createEReference(orderEClass, ORDER__SUPPLIER);
		createEReference(orderEClass, ORDER__PRODUCTS);

		imsEClass = createEClass(IMS);
		createEReference(imsEClass, IMS__PRODUCTS);
		createEReference(imsEClass, IMS__SUPPLIERS);
		createEReference(imsEClass, IMS__MANAGERS);
		createEReference(imsEClass, IMS__ORDERS);
		createEReference(imsEClass, IMS__AUDITS);
		createEReference(imsEClass, IMS__PERSONS);
		createEReference(imsEClass, IMS__REGULAREMPLOYEES);
		createEReference(imsEClass, IMS__CUSTOMERS);
		createEReference(imsEClass, IMS__TRANSACTIONS);
		createEReference(imsEClass, IMS__PRODUCTTRANSACTIONS);

		productTransactionEClass = createEClass(PRODUCT_TRANSACTION);
		createEAttribute(productTransactionEClass, PRODUCT_TRANSACTION__PRICE);
		createEAttribute(productTransactionEClass, PRODUCT_TRANSACTION__QUANTITY);
		createEReference(productTransactionEClass, PRODUCT_TRANSACTION__PRODUCT);

		// Create enums
		itemStatusEEnum = createEEnum(ITEM_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		productEClass.getESuperTypes().add(this.getNamedElement());
		personEClass.getESuperTypes().add(this.getNamedElement());
		regularEmployeeEClass.getESuperTypes().add(this.getEmployeeRole());
		managerEClass.getESuperTypes().add(this.getEmployeeRole());
		customerEClass.getESuperTypes().add(this.getPersonRole());
		employeeRoleEClass.getESuperTypes().add(this.getPersonRole());
		supplierEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_ItemPrice(), ecorePackage.getEFloat(), "itemPrice", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Id(), ecorePackage.getEString(), "id", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Quantity(), ecorePackage.getEInt(), "quantity", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Producttransaction(), this.getProductTransaction(), this.getProductTransaction_Product(), "producttransaction", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Transactions(), this.getTransaction(), this.getTransaction_Products(), "transactions", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Roles(), this.getPersonRole(), this.getPersonRole_Person(), "roles", null, 1, 3, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Sales(), this.getTransaction(), this.getTransaction_Seller(), "sales", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Purchases(), this.getTransaction(), this.getTransaction_Buyer(), "purchases", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularEmployeeEClass, RegularEmployee.class, "RegularEmployee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManager_Audit(), this.getAudit(), null, "audit", null, 0, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransaction_Seller(), this.getPerson(), this.getPerson_Sales(), "seller", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Buyer(), this.getPerson(), this.getPerson_Purchases(), "buyer", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_TotalAmount(), ecorePackage.getEFloat(), "totalAmount", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_AmountPaid(), ecorePackage.getEFloat(), "amountPaid", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_AmountUnpaid(), ecorePackage.getEFloat(), "amountUnpaid", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Id(), ecorePackage.getEString(), "id", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Producttransactions(), this.getProductTransaction(), null, "producttransactions", null, 0, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Products(), this.getProduct(), this.getProduct_Transactions(), "products", null, 0, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditEClass, Audit.class, "Audit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAudit_Transactions(), this.getTransaction(), null, "transactions", null, 0, -1, Audit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudit_Orders(), this.getOrder(), null, "orders", null, 0, -1, Audit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_Debt(), ecorePackage.getEFloat(), "debt", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CustomerID(), ecorePackage.getEString(), "customerID", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeeRoleEClass, EmployeeRole.class, "EmployeeRole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployeeRole_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, EmployeeRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployeeRole_Password(), ecorePackage.getEString(), "password", null, 0, 1, EmployeeRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personRoleEClass, PersonRole.class, "PersonRole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonRole_Person(), this.getPerson(), this.getPerson_Roles(), "person", null, 1, 1, PersonRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supplierEClass, Supplier.class, "Supplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrder_OrderedDate(), ecorePackage.getEDate(), "orderedDate", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_ArrivalDate(), ecorePackage.getEDate(), "arrivalDate", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Supplier(), this.getSupplier(), null, "supplier", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Products(), this.getProduct(), null, "products", null, 0, -1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imsEClass, com.ali.hyacinth.ims.IMS.class, "IMS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIMS_Products(), this.getProduct(), null, "products", null, 0, -1, com.ali.hyacinth.ims.IMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIMS_Suppliers(), this.getSupplier(), null, "suppliers", null, 0, -1, com.ali.hyacinth.ims.IMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIMS_Managers(), this.getManager(), null, "managers", null, 0, -1, com.ali.hyacinth.ims.IMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIMS_Orders(), this.getOrder(), null, "orders", null, 0, -1, com.ali.hyacinth.ims.IMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIMS_Audits(), this.getAudit(), null, "audits", null, 0, -1, com.ali.hyacinth.ims.IMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIMS_Persons(), this.getPerson(), null, "persons", null, 0, -1, com.ali.hyacinth.ims.IMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIMS_Regularemployees(), this.getRegularEmployee(), null, "regularemployees", null, 0, -1, com.ali.hyacinth.ims.IMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIMS_Customers(), this.getCustomer(), null, "customers", null, 0, -1, com.ali.hyacinth.ims.IMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIMS_Transactions(), this.getTransaction(), null, "transactions", null, 0, -1, com.ali.hyacinth.ims.IMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIMS_Producttransactions(), this.getProductTransaction(), null, "producttransactions", null, 0, -1, com.ali.hyacinth.ims.IMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productTransactionEClass, ProductTransaction.class, "ProductTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductTransaction_Price(), ecorePackage.getEFloat(), "price", null, 0, 1, ProductTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductTransaction_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, ProductTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductTransaction_Product(), this.getProduct(), this.getProduct_Producttransaction(), "product", null, 1, 1, ProductTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(itemStatusEEnum, ItemStatus.class, "ItemStatus");
		addEEnumLiteral(itemStatusEEnum, ItemStatus.ORDERED);
		addEEnumLiteral(itemStatusEEnum, ItemStatus.IN_STORE);
		addEEnumLiteral(itemStatusEEnum, ItemStatus.SOLD);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (imsEClass, 
		   source, 
		   new String[] {
			 "constraints", "oneKindRolePerPerson"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (imsEClass, 
		   source, 
		   new String[] {
			 "oneKindRolePerPerson", "Tuple {\n\tmessage : String = \'A person cannot play more than one kind of role.\',\n\tstatus : Boolean = \n\t\tself.customers -> forAll(c1, c2 | c1.person <> c2.person)\n}.status"
		   });
	}

} //ImsPackageImpl
