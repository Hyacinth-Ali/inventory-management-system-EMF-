/**
 */
package com.ali.hyacinth.ims;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.Item#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.ali.hyacinth.ims.ItemStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see com.ali.hyacinth.ims.ItemStatus
	 * @see #setStatus(ItemStatus)
	 * @see com.ali.hyacinth.ims.ImsPackage#getItem_Status()
	 * @model
	 * @generated
	 */
	ItemStatus getStatus();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.Item#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see com.ali.hyacinth.ims.ItemStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ItemStatus value);

} // Item
