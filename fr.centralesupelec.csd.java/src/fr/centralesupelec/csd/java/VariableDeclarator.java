/**
 */
package fr.centralesupelec.csd.java;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.VariableDeclarator#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getVariableDeclarator()
 * @model
 * @generated
 */
public interface VariableDeclarator extends JavaNode, NodeWithType<Type>, NodeWithSimpleName {
	/**
     * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Initializer</em>' containment reference.
     * @see #setInitializer(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getVariableDeclarator_Initializer()
     * @model containment="true"
     * @generated
     */
	Expression getInitializer();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.VariableDeclarator#getInitializer <em>Initializer</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initializer</em>' containment reference.
     * @see #getInitializer()
     * @generated
     */
	void setInitializer(Expression value);

} // VariableDeclarator
