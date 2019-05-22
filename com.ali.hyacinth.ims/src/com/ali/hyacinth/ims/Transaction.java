/**
 */
package com.ali.hyacinth.ims;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.Transaction#getSeller <em>Seller</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Transaction#getBuyer <em>Buyer</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Transaction#getDate <em>Date</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Transaction#getTotalAmount <em>Total Amount</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Transaction#getAmountPaid <em>Amount Paid</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Transaction#getAmountUnpaid <em>Amount Unpaid</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Transaction#getId <em>Id</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Transaction#getProducttransactions <em>Producttransactions</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Transaction#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Seller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.ali.hyacinth.ims.Person#getSales <em>Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seller</em>' reference.
	 * @see #setSeller(Person)
	 * @see com.ali.hyacinth.ims.ImsPackage#getTransaction_Seller()
	 * @see com.ali.hyacinth.ims.Person#getSales
	 * @model opposite="sales" required="true"
	 * @generated
	 */
	Person getSeller();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Transaction#getSeller <em>Seller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seller</em>' reference.
	 * @see #getSeller()
	 * @generated
	 */
	void setSeller(Person value);

	/**
	 * Returns the value of the '<em><b>Buyer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.ali.hyacinth.ims.Person#getPurchases <em>Purchases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buyer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buyer</em>' reference.
	 * @see #setBuyer(Person)
	 * @see com.ali.hyacinth.ims.ImsPackage#getTransaction_Buyer()
	 * @see com.ali.hyacinth.ims.Person#getPurchases
	 * @model opposite="purchases" required="true"
	 * @generated
	 */
	Person getBuyer();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Transaction#getBuyer <em>Buyer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buyer</em>' reference.
	 * @see #getBuyer()
	 * @generated
	 */
	void setBuyer(Person value);

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
	 * @see com.ali.hyacinth.ims.ImsPackage#getTransaction_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Transaction#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Amount</em>' attribute.
	 * @see #setTotalAmount(float)
	 * @see com.ali.hyacinth.ims.ImsPackage#getTransaction_TotalAmount()
	 * @model required="true"
	 * @generated
	 */
	float getTotalAmount();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Transaction#getTotalAmount <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Amount</em>' attribute.
	 * @see #getTotalAmount()
	 * @generated
	 */
	void setTotalAmount(float value);

	/**
	 * Returns the value of the '<em><b>Amount Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Paid</em>' attribute.
	 * @see #setAmountPaid(float)
	 * @see com.ali.hyacinth.ims.ImsPackage#getTransaction_AmountPaid()
	 * @model required="true"
	 * @generated
	 */
	float getAmountPaid();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Transaction#getAmountPaid <em>Amount Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Paid</em>' attribute.
	 * @see #getAmountPaid()
	 * @generated
	 */
	void setAmountPaid(float value);

	/**
	 * Returns the value of the '<em><b>Amount Unpaid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Unpaid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Unpaid</em>' attribute.
	 * @see #setAmountUnpaid(float)
	 * @see com.ali.hyacinth.ims.ImsPackage#getTransaction_AmountUnpaid()
	 * @model required="true" derived="true"
	 * @generated
	 */
	float getAmountUnpaid();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Transaction#getAmountUnpaid <em>Amount Unpaid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Unpaid</em>' attribute.
	 * @see #getAmountUnpaid()
	 * @generated
	 */
	void setAmountUnpaid(float value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.ali.hyacinth.ims.ImsPackage#getTransaction_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Transaction#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Producttransactions</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.ProductTransaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producttransactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producttransactions</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getTransaction_Producttransactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductTransaction> getProducttransactions();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Product}.
	 * It is bidirectional and its opposite is '{@link com.ali.hyacinth.ims.Product#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getTransaction_Products()
	 * @see com.ali.hyacinth.ims.Product#getTransactions
	 * @model opposite="transactions"
	 * @generated
	 */
	EList<Product> getProducts();

} // Transaction
