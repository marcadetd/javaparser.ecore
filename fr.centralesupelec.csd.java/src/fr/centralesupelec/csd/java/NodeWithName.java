/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithName()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithName extends EObject {
	/**
     * Returns the value of the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' containment reference.
     * @see #setName(Name)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithName_Name()
     * @model containment="true"
     * @generated
     */
	Name getName();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithName#getName <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' containment reference.
     * @see #getName()
     * @generated
     */
	void setName(Name value);

} // NodeWithName
