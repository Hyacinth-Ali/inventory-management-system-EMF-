/**
 */
package com.ali.hyacinth.ims;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.Person#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Person#getSales <em>Sales</em>}</li>
 *   <li>{@link com.ali.hyacinth.ims.Person#getPurchases <em>Purchases</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.PersonRole}.
	 * It is bidirectional and its opposite is '{@link com.ali.hyacinth.ims.PersonRole#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getPerson_Roles()
	 * @see com.ali.hyacinth.ims.PersonRole#getPerson
	 * @model opposite="person" required="true" upper="3"
	 * @generated
	 */
	EList<PersonRole> getRoles();

	/**
	 * Returns the value of the '<em><b>Sales</b></em>' reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Transaction}.
	 * It is bidirectional and its opposite is '{@link com.ali.hyacinth.ims.Transaction#getSeller <em>Seller</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales</em>' reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getPerson_Sales()
	 * @see com.ali.hyacinth.ims.Transaction#getSeller
	 * @model opposite="seller"
	 * @generated
	 */
	EList<Transaction> getSales();

	/**
	 * Returns the value of the '<em><b>Purchases</b></em>' reference list.
	 * The list contents are of type {@link com.ali.hyacinth.ims.Transaction}.
	 * It is bidirectional and its opposite is '{@link com.ali.hyacinth.ims.Transaction#getBuyer <em>Buyer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchases</em>' reference list.
	 * @see com.ali.hyacinth.ims.ImsPackage#getPerson_Purchases()
	 * @see com.ali.hyacinth.ims.Transaction#getBuyer
	 * @model opposite="buyer"
	 * @generated
	 */
	EList<Transaction> getPurchases();

} // Person
