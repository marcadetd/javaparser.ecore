/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithVariables#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithVariables()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithVariables extends EObject {

	/**
     * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.VariableDeclarator}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Variables</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithVariables_Variables()
     * @model containment="true"
     * @generated
     */
	EList<VariableDeclarator> getVariables();
} // NodeWithVariables
