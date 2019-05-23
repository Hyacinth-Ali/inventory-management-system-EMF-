/**
 */
package com.ali.hyacinth.ims;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.ProductTransaction#getPrice <em>Price</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.ProductTransaction#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.ProductTransaction#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getProductTransaction()
 * @model
 * @generated
 */
public interface ProductTransaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see com.ali.hyacinth.ims.ImsPackage#getProductTransaction_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.ProductTransaction#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see com.ali.hyacinth.ims.ImsPackage#getProductTransaction_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.ProductTransaction#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.ali.hyacinth.ims.Product#getProducttransaction <em>Producttransaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see com.ali.hyacinth.ims.ImsPackage#getProductTransaction_Product()
	 * @see com.ali.hyacinth.ims.Product#getProducttransaction
	 * @model opposite="producttransaction" required="true"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.ProductTransaction#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

} // ProductTransaction
