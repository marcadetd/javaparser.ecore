/**
 */
package fr.centralesupelec.csd.java;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.LambdaExpr#isEnclosingParameters <em>Enclosing Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.LambdaExpr#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getLambdaExpr()
 * @model
 * @generated
 */
public interface LambdaExpr extends Expression, NodeWithParameters {
	/**
     * Returns the value of the '<em><b>Enclosing Parameters</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Enclosing Parameters</em>' attribute.
     * @see #setEnclosingParameters(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getLambdaExpr_EnclosingParameters()
     * @model
     * @generated
     */
	boolean isEnclosingParameters();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.LambdaExpr#isEnclosingParameters <em>Enclosing Parameters</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enclosing Parameters</em>' attribute.
     * @see #isEnclosingParameters()
     * @generated
     */
	void setEnclosingParameters(boolean value);

	/**
     * Returns the value of the '<em><b>Body</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Body</em>' reference.
     * @see #setBody(Statement)
     * @see fr.centralesupelec.csd.java.JavaPackage#getLambdaExpr_Body()
     * @model
     * @generated
     */
	Statement getBody();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.LambdaExpr#getBody <em>Body</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' reference.
     * @see #getBody()
     * @generated
     */
	void setBody(Statement value);

} // LambdaExpr
