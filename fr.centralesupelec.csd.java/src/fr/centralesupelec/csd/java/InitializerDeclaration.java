/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initializer Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.InitializerDeclaration#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getInitializerDeclaration()
 * @model
 * @generated
 */
public interface InitializerDeclaration extends BodyDeclaration, NodeWithJavadoc, NodeWithBlockStmt {
	/**
     * Returns the value of the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Static</em>' attribute.
     * @see #setStatic(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getInitializerDeclaration_Static()
     * @model
     * @generated
     */
	boolean isStatic();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.InitializerDeclaration#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' attribute.
     * @see #isStatic()
     * @generated
     */
	void setStatic(boolean value);

} // InitializerDeclaration
