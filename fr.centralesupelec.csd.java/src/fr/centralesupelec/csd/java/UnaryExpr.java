/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.UnaryExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getUnaryExpr()
 * @model
 * @generated
 */
public interface UnaryExpr extends Expression, NodeWithExpression {
	/**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.csd.java.UnaryOperator}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see fr.centralesupelec.csd.java.UnaryOperator
     * @see #setOperator(UnaryOperator)
     * @see fr.centralesupelec.csd.java.JavaPackage#getUnaryExpr_Operator()
     * @model
     * @generated
     */
	UnaryOperator getOperator();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.UnaryExpr#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see fr.centralesupelec.csd.java.UnaryOperator
     * @see #getOperator()
     * @generated
     */
	void setOperator(UnaryOperator value);

} // UnaryExpr
