/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Public Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithPublicModifier#isPublic <em>Public</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithPublicModifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithPublicModifier extends NodeWithModifiers {
	/**
     * Returns the value of the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Public</em>' attribute.
     * @see #setPublic(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithPublicModifier_Public()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
	boolean isPublic();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithPublicModifier#isPublic <em>Public</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Public</em>' attribute.
     * @see #isPublic()
     * @generated
     */
	void setPublic(boolean value);

} // NodeWithPublicModifier
