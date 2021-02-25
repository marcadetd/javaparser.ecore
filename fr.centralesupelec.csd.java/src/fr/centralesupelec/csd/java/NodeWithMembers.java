/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Members</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithMembers#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithMembers()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithMembers extends EObject {

	/**
     * Returns the value of the '<em><b>Members</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.BodyDeclaration}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Members</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithMembers_Members()
     * @model containment="true"
     * @generated
     */
	EList<BodyDeclaration> getMembers();
} // NodeWithMembers
