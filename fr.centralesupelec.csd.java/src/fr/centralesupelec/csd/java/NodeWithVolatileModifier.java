/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Volatile Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithVolatileModifier#isVolatile <em>Volatile</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithVolatileModifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithVolatileModifier extends NodeWithModifiers {
	/**
     * Returns the value of the '<em><b>Volatile</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Volatile</em>' attribute.
     * @see #setVolatile(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithVolatileModifier_Volatile()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
	boolean isVolatile();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithVolatileModifier#isVolatile <em>Volatile</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Volatile</em>' attribute.
     * @see #isVolatile()
     * @generated
     */
	void setVolatile(boolean value);

} // NodeWithVolatileModifier
