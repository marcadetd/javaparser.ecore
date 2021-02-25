/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Default Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithDefaultModifier#isDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithDefaultModifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithDefaultModifier extends NodeWithModifiers {
	/**
     * Returns the value of the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Default</em>' attribute.
     * @see #setDefault(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithDefaultModifier_Default()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
	boolean isDefault();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithDefaultModifier#isDefault <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default</em>' attribute.
     * @see #isDefault()
     * @generated
     */
	void setDefault(boolean value);

} // NodeWithDefaultModifier
