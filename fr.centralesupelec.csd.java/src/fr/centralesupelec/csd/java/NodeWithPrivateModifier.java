/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Private Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithPrivateModifier#isPrivate <em>Private</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithPrivateModifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithPrivateModifier extends NodeWithModifiers {
	/**
     * Returns the value of the '<em><b>Private</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Private</em>' attribute.
     * @see #setPrivate(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithPrivateModifier_Private()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
	boolean isPrivate();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithPrivateModifier#isPrivate <em>Private</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Private</em>' attribute.
     * @see #isPrivate()
     * @generated
     */
	void setPrivate(boolean value);

} // NodeWithPrivateModifier
