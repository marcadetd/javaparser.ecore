/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.BooleanLiteralExpr#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getBooleanLiteralExpr()
 * @model
 * @generated
 */
public interface BooleanLiteralExpr extends LiteralExpr {
	/**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getBooleanLiteralExpr_Value()
     * @model
     * @generated
     */
	boolean isValue();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.BooleanLiteralExpr#isValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #isValue()
     * @generated
     */
	void setValue(boolean value);

} // BooleanLiteralExpr
