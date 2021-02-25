/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithParameters#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithParameters()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithParameters extends EObject {

	/**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.Parameter}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithParameters_Parameters()
     * @model containment="true"
     * @generated
     */
	EList<Parameter> getParameters();
} // NodeWithParameters
