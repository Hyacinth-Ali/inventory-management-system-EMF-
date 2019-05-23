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
 *   <li>{@link com.ali.hyacinth.ims.Product#getItemPrice <em>Item Price</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Product#getId <em>Id</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Product#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Product#getProducttransaction <em>Producttransaction</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Product#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends NamedElement {
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
	 * @see com.ali.hyacinth.ims.ImsPackage#getProduct_Quantity()
	 * @model required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Product#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Producttransaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.ali.hyacinth.ims.ProductTransaction#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producttransaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producttransaction</em>' reference.
	 * @see #setProducttransaction(ProductTransaction)
	 * @see com.ali.hyacinth.ims.ImsPackage#getProduct_Producttransaction()
	 * @see com.ali.hyacinth.ims.ProductTransaction#getProduct
	 * @model opposite="product"
	 * @generated
	 */
	ProductTransaction getProducttransaction();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Product#getProducttransaction <em>Producttransaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producttransaction</em>' reference.
	 * @see #getProducttransaction()
	 * @generated
	 */
	void setProducttransaction(ProductTransaction value);

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Transaction}.
	 * It is bidirectional and its opposite is '{@link com.ali.hyacinth.ims.Transaction#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getProduct_Transactions()
	 * @see com.ali.hyacinth.ims.Transaction#getProducts
	 * @model opposite="products"
	 * @generated
	 */
	EList<Transaction> getTransactions();

} // Product
