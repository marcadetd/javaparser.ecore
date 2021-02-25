/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Statements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithStatements#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithStatements()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithStatements extends EObject {

	/**
     * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.Statement}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Statements</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithStatements_Statements()
     * @model containment="true"
     * @generated
     */
	EList<Statement> getStatements();
} // NodeWithStatements
