/**
 */
package com.ali.hyacinth.ims;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.Product#getItems <em>Items</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Product#getItemPrice <em>Item Price</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Product#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getProduct_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Item Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Price</em>' attribute.
	 * @see #setItemPrice(float)
	 * @see com.ali.hyacinth.ims.ImsPackage#getProduct_ItemPrice()
	 * @model required="true"
	 * @generated
	 */
	float getItemPrice();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Product#getItemPrice <em>Item Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Price</em>' attribute.
	 * @see #getItemPrice()
	 * @generated
	 */
	void setItemPrice(float value);

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
	 * @see com.ali.hyacinth.ims.ImsPackage#getProduct_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Product#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Product
