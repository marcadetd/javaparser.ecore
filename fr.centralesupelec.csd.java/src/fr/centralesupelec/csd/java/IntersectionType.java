/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intersection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.IntersectionType#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getIntersectionType()
 * @model
 * @generated
 */
public interface IntersectionType extends Type, NodeWithAnnotations {
	/**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.ReferenceType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getIntersectionType_Elements()
     * @model containment="true"
     * @generated
     */
	EList<ReferenceType> getElements();

} // IntersectionType
