/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.TypeParameter#getTypeBound <em>Type Bound</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getTypeParameter()
 * @model
 * @generated
 */
public interface TypeParameter extends ReferenceType, SimpleName, NodeWithAnnotations {
	/**
     * Returns the value of the '<em><b>Type Bound</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.ClassOrInterfaceType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type Bound</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getTypeParameter_TypeBound()
     * @model containment="true"
     * @generated
     */
	EList<ClassOrInterfaceType> getTypeBound();

} // TypeParameter
