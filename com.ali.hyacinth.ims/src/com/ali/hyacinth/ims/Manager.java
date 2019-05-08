/**
 */
package com.ali.hyacinth.ims;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.Manager#getAudit <em>Audit</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends EmployeeRole {

	/**
	 * Returns the value of the '<em><b>Audit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audit</em>' reference.
	 * @see #setAudit(Audit)
	 * @see com.ali.hyacinth.ims.ImsPackage#getManager_Audit()
	 * @model
	 * @generated
	 */
	Audit getAudit();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Manager#getAudit <em>Audit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit</em>' reference.
	 * @see #getAudit()
	 * @generated
	 */
	void setAudit(Audit value);
} // Manager
