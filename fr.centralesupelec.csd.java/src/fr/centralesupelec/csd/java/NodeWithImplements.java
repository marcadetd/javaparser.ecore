/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Implements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithImplements#getImplementedTypes <em>Implemented Types</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithImplements()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithImplements extends EObject {

	/**
     * Returns the value of the '<em><b>Implemented Types</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.ClassOrInterfaceType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Implemented Types</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithImplements_ImplementedTypes()
     * @model containment="true"
     * @generated
     */
	EList<ClassOrInterfaceType> getImplementedTypes();
} // NodeWithImplements
