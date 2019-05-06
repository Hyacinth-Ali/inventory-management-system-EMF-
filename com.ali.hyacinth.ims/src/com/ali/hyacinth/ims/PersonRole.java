/**
 */
package com.ali.hyacinth.ims;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ali.hyacinth.ims.PersonRole#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see com.ali.hyacinth.ims.ImsPackage#getPersonRole()
 * @model abstract="true"
 * @generated
 */
public interface PersonRole extends EObject {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.ali.hyacinth.ims.Person#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see com.ali.hyacinth.ims.ImsPackage#getPersonRole_Person()
	 * @see com.ali.hyacinth.ims.Person#getRoles
	 * @model opposite="roles" required="true"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link com.ali.hyacinth.ims.PersonRole#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // PersonRole
