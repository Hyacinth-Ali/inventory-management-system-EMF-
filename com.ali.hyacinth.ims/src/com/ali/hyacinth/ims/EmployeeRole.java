/**
 */
package com.ali.hyacinth.ims;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.EmployeeRole#getUserName <em>User Name</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.EmployeeRole#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getEmployeeRole()
 * @model abstract="true"
 * @generated
 */
public interface EmployeeRole extends PersonRole {
	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see com.ali.hyacinth.ims.ImsPackage#getEmployeeRole_UserName()
	 * @model id="true"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.EmployeeRole#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see com.ali.hyacinth.ims.ImsPackage#getEmployeeRole_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.EmployeeRole#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // EmployeeRole
