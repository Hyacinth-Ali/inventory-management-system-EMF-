/**
 */
package com.ali.hyacinth.ims.tests;

import com.ali.hyacinth.ims.ImsFactory;
import com.ali.hyacinth.ims.Supplier;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SupplierTest extends NameElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SupplierTest.class);
	}

	/**
	 * Constructs a new Supplier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Supplier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Supplier getFixture() {
		return (Supplier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImsFactory.eINSTANCE.createSupplier());
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

} //SupplierTest
