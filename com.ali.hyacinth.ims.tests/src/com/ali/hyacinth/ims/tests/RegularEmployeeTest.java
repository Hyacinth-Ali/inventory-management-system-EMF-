/**
 */
package com.ali.hyacinth.ims.tests;

import com.ali.hyacinth.ims.ImsFactory;
import com.ali.hyacinth.ims.RegularEmployee;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Regular Employee</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegularEmployeeTest extends EmployeeRoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegularEmployeeTest.class);
	}

	/**
	 * Constructs a new Regular Employee test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularEmployeeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Regular Employee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RegularEmployee getFixture() {
		return (RegularEmployee)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImsFactory.eINSTANCE.createRegularEmployee());
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

} //RegularEmployeeTest
