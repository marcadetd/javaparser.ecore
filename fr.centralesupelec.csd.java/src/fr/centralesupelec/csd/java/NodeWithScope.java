/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithScope#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithScope()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithScope<ScopeType> extends EObject {

	/**
     * Returns the value of the '<em><b>Scope</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Scope</em>' containment reference.
     * @see #setScope(Object)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithScope_Scope()
     * @model kind="reference" containment="true"
     * @generated
     */
	ScopeType getScope();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithScope#getScope <em>Scope</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' containment reference.
     * @see #getScope()
     * @generated
     */
	void setScope(ScopeType value);
} // NodeWithScope
