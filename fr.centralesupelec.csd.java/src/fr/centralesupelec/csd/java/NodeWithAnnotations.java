/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Annotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithAnnotations#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithAnnotations()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithAnnotations extends EObject {
	/**
     * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.AnnotationExpr}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Annotations</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithAnnotations_Annotations()
     * @model containment="true"
     * @generated
     */
	EList<AnnotationExpr> getAnnotations();

} // NodeWithAnnotations
