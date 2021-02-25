/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Protected Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithProtectedModifier#isProtected <em>Protected</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithProtectedModifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithProtectedModifier extends NodeWithModifiers {
	/**
     * Returns the value of the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Protected</em>' attribute.
     * @see #setProtected(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithProtectedModifier_Protected()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
	boolean isProtected();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithProtectedModifier#isProtected <em>Protected</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Protected</em>' attribute.
     * @see #isProtected()
     * @generated
     */
	void setProtected(boolean value);

} // NodeWithProtectedModifier
