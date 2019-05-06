/**
 */
package com.ali.hyacinth.ims;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.Order#getOrderedDate <em>Ordered Date</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Order#getArrivalDate <em>Arrival Date</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Order#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Order#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Ordered Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered Date</em>' attribute.
	 * @see #setOrderedDate(Date)
	 * @see com.ali.hyacinth.ims.ImsPackage#getOrder_OrderedDate()
	 * @model required="true"
	 * @generated
	 */
	Date getOrderedDate();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Order#getOrderedDate <em>Ordered Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered Date</em>' attribute.
	 * @see #getOrderedDate()
	 * @generated
	 */
	void setOrderedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Date</em>' attribute.
	 * @see #setArrivalDate(Date)
	 * @see com.ali.hyacinth.ims.ImsPackage#getOrder_ArrivalDate()
	 * @model
	 * @generated
	 */
	Date getArrivalDate();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Order#getArrivalDate <em>Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Date</em>' attribute.
	 * @see #getArrivalDate()
	 * @generated
	 */
	void setArrivalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(Supplier)
	 * @see com.ali.hyacinth.ims.ImsPackage#getOrder_Supplier()
	 * @model
	 * @generated
	 */
	Supplier getSupplier();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Order#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(Supplier value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getOrder_Products()
	 * @model
	 * @generated
	 */
	EList<Product> getProducts();

} // Order
