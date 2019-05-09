/**
 */
package com.ali.hyacinth.ims.util;

import com.ali.hyacinth.ims.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.ali.hyacinth.ims.ImsPackage
 * @generated
 */
public class ImsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ImsValidator INSTANCE = new ImsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.ali.hyacinth.ims";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ImsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ImsPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case ImsPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case ImsPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case ImsPackage.REGULAR_EMPLOYEE:
				return validateRegularEmployee((RegularEmployee)value, diagnostics, context);
			case ImsPackage.MANAGER:
				return validateManager((Manager)value, diagnostics, context);
			case ImsPackage.TRANSACTION:
				return validateTransaction((Transaction)value, diagnostics, context);
			case ImsPackage.AUDIT:
				return validateAudit((Audit)value, diagnostics, context);
			case ImsPackage.CUSTOMER:
				return validateCustomer((Customer)value, diagnostics, context);
			case ImsPackage.EMPLOYEE_ROLE:
				return validateEmployeeRole((EmployeeRole)value, diagnostics, context);
			case ImsPackage.PERSON_ROLE:
				return validatePersonRole((PersonRole)value, diagnostics, context);
			case ImsPackage.SUPPLIER:
				return validateSupplier((Supplier)value, diagnostics, context);
			case ImsPackage.ORDER:
				return validateOrder((Order)value, diagnostics, context);
			case ImsPackage.IMS:
				return validateIMS((IMS)value, diagnostics, context);
			case ImsPackage.PRODUCT_TRANSACTION:
				return validateProductTransaction((ProductTransaction)value, diagnostics, context);
			case ImsPackage.ITEM_STATUS:
				return validateItemStatus((ItemStatus)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(product, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularEmployee(RegularEmployee regularEmployee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regularEmployee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(manager, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransaction(Transaction transaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudit(Audit audit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(audit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployeeRole(EmployeeRole employeeRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(employeeRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonRole(PersonRole personRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplier(Supplier supplier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(order, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIMS(IMS ims, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ims, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ims, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ims, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ims, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ims, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ims, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ims, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ims, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ims, diagnostics, context);
		if (result || diagnostics != null) result &= validateIMS_oneKindRolePerPerson(ims, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneKindRolePerPerson constraint of '<em>IMS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IMS__ONE_KIND_ROLE_PER_PERSON__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'A person cannot play more than one kind of role.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\tself.customers -> forAll(c1, c2 | c1.person <> c2.person)\n" +
		"}.status";

	/**
	 * Validates the oneKindRolePerPerson constraint of '<em>IMS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIMS_oneKindRolePerPerson(IMS ims, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ImsPackage.Literals.IMS,
				 ims,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "oneKindRolePerPerson",
				 IMS__ONE_KIND_ROLE_PER_PERSON__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductTransaction(ProductTransaction productTransaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productTransaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemStatus(ItemStatus itemStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ImsValidator
