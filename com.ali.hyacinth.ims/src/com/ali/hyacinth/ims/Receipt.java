/**
 */
package com.ali.hyacinth.ims;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.Receipt#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Receipt#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getReceipt()
 * @model
 * @generated
 */
public interface Receipt extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.ali.hyacinth.ims.Transaction#getReceipts <em>Receipts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' reference.
	 * @see #setTransaction(Transaction)
	 * @see com.ali.hyacinth.ims.ImsPackage#getReceipt_Transaction()
	 * @see com.ali.hyacinth.ims.Transaction#getReceipts
	 * @model opposite="receipts" required="true"
	 * @generated
	 */
	Transaction getTransaction();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Receipt#getTransaction <em>Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' reference.
	 * @see #getTransaction()
	 * @generated
	 */
	void setTransaction(Transaction value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see com.ali.hyacinth.ims.ImsPackage#getReceipt_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Receipt#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // Receipt
