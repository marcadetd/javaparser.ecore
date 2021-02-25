/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Block Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithBlockStmt#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithBlockStmt()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithBlockStmt extends EObject {

	/**
     * Returns the value of the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Body</em>' containment reference.
     * @see #setBody(BlockStmt)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithBlockStmt_Body()
     * @model containment="true"
     * @generated
     */
	BlockStmt getBody();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithBlockStmt#getBody <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' containment reference.
     * @see #getBody()
     * @generated
     */
	void setBody(BlockStmt value);
} // NodeWithBlockStmt
