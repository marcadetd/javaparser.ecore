/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Extends</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithExtends#getExtendedTypes <em>Extended Types</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithExtends()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithExtends extends EObject {

	/**
     * Returns the value of the '<em><b>Extended Types</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.ClassOrInterfaceType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Extended Types</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithExtends_ExtendedTypes()
     * @model containment="true"
     * @generated
     */
	EList<ClassOrInterfaceType> getExtendedTypes();
} // NodeWithExtends
