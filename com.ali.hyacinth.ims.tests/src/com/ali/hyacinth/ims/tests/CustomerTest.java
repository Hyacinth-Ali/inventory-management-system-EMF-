/**
 */
package com.ali.hyacinth.ims.tests;

import com.ali.hyacinth.ims.Customer;
import com.ali.hyacinth.ims.ImsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerTest extends PersonRoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CustomerTest.class);
	}

	/**
	 * Constructs a new Customer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Customer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Customer getFixture() {
		return (Customer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImsFactory.eINSTANCE.createCustomer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CustomerTest
