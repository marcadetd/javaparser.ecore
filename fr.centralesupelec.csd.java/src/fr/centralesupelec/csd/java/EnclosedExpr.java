/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enclosed Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.EnclosedExpr#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getEnclosedExpr()
 * @model
 * @generated
 */
public interface EnclosedExpr extends Expression {
	/**
     * Returns the value of the '<em><b>Inner</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Inner</em>' containment reference.
     * @see #setInner(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getEnclosedExpr_Inner()
     * @model containment="true"
     * @generated
     */
	Expression getInner();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.EnclosedExpr#getInner <em>Inner</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inner</em>' containment reference.
     * @see #getInner()
     * @generated
     */
	void setInner(Expression value);

} // EnclosedExpr
