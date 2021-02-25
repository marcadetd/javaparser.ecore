/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Abstract Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithAbstractModifier#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithAbstractModifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithAbstractModifier extends NodeWithModifiers {
	/**
     * Returns the value of the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract</em>' attribute.
     * @see #setAbstract(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithAbstractModifier_Abstract()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
	boolean isAbstract();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithAbstractModifier#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract</em>' attribute.
     * @see #isAbstract()
     * @generated
     */
	void setAbstract(boolean value);

} // NodeWithAbstractModifier
