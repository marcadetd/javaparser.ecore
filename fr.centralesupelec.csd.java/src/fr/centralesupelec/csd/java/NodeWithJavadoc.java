/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Javadoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithJavadoc#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithJavadoc()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithJavadoc extends EObject {

	/**
     * Returns the value of the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Comment</em>' containment reference.
     * @see #setComment(JavadocComment)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithJavadoc_Comment()
     * @model containment="true"
     * @generated
     */
	JavadocComment getComment();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithJavadoc#getComment <em>Comment</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comment</em>' containment reference.
     * @see #getComment()
     * @generated
     */
	void setComment(JavadocComment value);
} // NodeWithJavadoc
