/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Simple Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithSimpleName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithSimpleName()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithSimpleName extends EObject {

	/**
     * Returns the value of the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' containment reference.
     * @see #setName(SimpleName)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithSimpleName_Name()
     * @model containment="true"
     * @generated
     */
	SimpleName getName();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithSimpleName#getName <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' containment reference.
     * @see #getName()
     * @generated
     */
	void setName(SimpleName value);
} // NodeWithSimpleName
