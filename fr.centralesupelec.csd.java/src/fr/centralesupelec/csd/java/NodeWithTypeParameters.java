/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Type Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithTypeParameters#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithTypeParameters()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithTypeParameters extends EObject {

	/**
     * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.TypeParameter}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type Parameters</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithTypeParameters_TypeParameters()
     * @model containment="true"
     * @generated
     */
	EList<TypeParameter> getTypeParameters();
} // NodeWithTypeParameters
