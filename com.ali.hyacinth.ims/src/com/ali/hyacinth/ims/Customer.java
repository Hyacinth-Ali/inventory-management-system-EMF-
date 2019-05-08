/**
 */
package com.ali.hyacinth.ims;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.Customer#getDebt <em>Debt</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Customer#getCustomerID <em>Customer ID</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends PersonRole {
	/**
	 * Returns the value of the '<em><b>Debt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debt</em>' attribute.
	 * @see #setDebt(float)
	 * @see com.ali.hyacinth.ims.ImsPackage#getCustomer_Debt()
	 * @model required="true"
	 * @generated
	 */
	float getDebt();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Customer#getDebt <em>Debt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debt</em>' attribute.
	 * @see #getDebt()
	 * @generated
	 */
	void setDebt(float value);

	/**
	 * Returns the value of the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer ID</em>' attribute.
	 * @see #setCustomerID(String)
	 * @see com.ali.hyacinth.ims.ImsPackage#getCustomer_CustomerID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getCustomerID();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Customer#getCustomerID <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer ID</em>' attribute.
	 * @see #getCustomerID()
	 * @generated
	 */
	void setCustomerID(String value);

} // Customer
