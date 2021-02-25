/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithCondition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithCondition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithCondition extends EObject {

	/**
     * Returns the value of the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' containment reference.
     * @see #setCondition(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithCondition_Condition()
     * @model containment="true"
     * @generated
     */
	Expression getCondition();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithCondition#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
	void setCondition(Expression value);
} // NodeWithCondition
