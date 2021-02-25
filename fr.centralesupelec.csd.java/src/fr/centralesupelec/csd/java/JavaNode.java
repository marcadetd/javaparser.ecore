/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.JavaNode#getComment <em>Comment</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.JavaNode#getOrphanComments <em>Orphan Comments</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getJavaNode()
 * @model abstract="true"
 * @generated
 */
public interface JavaNode extends EObject {
    /**
     * Returns the value of the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Comment</em>' containment reference.
     * @see #setComment(Comment)
     * @see fr.centralesupelec.csd.java.JavaPackage#getJavaNode_Comment()
     * @model containment="true"
     * @generated
     */
    Comment getComment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.JavaNode#getComment <em>Comment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comment</em>' containment reference.
     * @see #getComment()
     * @generated
     */
    void setComment(Comment value);

    /**
     * Returns the value of the '<em><b>Orphan Comments</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.Comment}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Orphan Comments</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getJavaNode_OrphanComments()
     * @model containment="true"
     * @generated
     */
    EList<Comment> getOrphanComments();

} // JavaNode
