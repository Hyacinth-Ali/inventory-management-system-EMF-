/**
 */
package com.ali.hyacinth.ims;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.Audit#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Audit#getOrders <em>Orders</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getAudit()
 * @model
 * @generated
 */
public interface Audit extends EObject {
	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Transaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getAudit_Transactions()
	 * @model
	 * @generated
	 */
	EList<Transaction> getTransactions();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getAudit_Orders()
	 * @model
	 * @generated
	 */
	EList<Order> getOrders();

} // Audit
