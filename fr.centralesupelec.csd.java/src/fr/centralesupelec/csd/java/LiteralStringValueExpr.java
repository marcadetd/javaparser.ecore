/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal String Value Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.LiteralStringValueExpr#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getLiteralStringValueExpr()
 * @model abstract="true"
 * @generated
 */
public interface LiteralStringValueExpr extends LiteralExpr {
	/**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see fr.centralesupelec.csd.java.JavaPackage#getLiteralStringValueExpr_Value()
     * @model
     * @generated
     */
	String getValue();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.LiteralStringValueExpr#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
	void setValue(String value);

} // LiteralStringValueExpr
