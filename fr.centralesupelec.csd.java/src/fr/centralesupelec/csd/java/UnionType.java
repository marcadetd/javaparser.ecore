/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.UnionType#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getUnionType()
 * @model
 * @generated
 */
public interface UnionType extends Type, NodeWithAnnotations {
	/**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.ReferenceType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getUnionType_Elements()
     * @model containment="true"
     * @generated
     */
	EList<ReferenceType> getElements();

} // UnionType
