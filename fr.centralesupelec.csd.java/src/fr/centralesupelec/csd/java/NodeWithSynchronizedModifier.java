/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Synchronized Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithSynchronizedModifier#isSynchronized <em>Synchronized</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithSynchronizedModifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithSynchronizedModifier extends NodeWithModifiers {
	/**
     * Returns the value of the '<em><b>Synchronized</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Synchronized</em>' attribute.
     * @see #setSynchronized(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithSynchronizedModifier_Synchronized()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
	boolean isSynchronized();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithSynchronizedModifier#isSynchronized <em>Synchronized</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synchronized</em>' attribute.
     * @see #isSynchronized()
     * @generated
     */
	void setSynchronized(boolean value);

} // NodeWithSynchronizedModifier
