/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Access Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.ArrayAccessExpr#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.ArrayAccessExpr#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getArrayAccessExpr()
 * @model
 * @generated
 */
public interface ArrayAccessExpr extends Expression {
	/**
     * Returns the value of the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' containment reference.
     * @see #setName(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getArrayAccessExpr_Name()
     * @model containment="true"
     * @generated
     */
	Expression getName();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ArrayAccessExpr#getName <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' containment reference.
     * @see #getName()
     * @generated
     */
	void setName(Expression value);

	/**
     * Returns the value of the '<em><b>Index</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Index</em>' containment reference.
     * @see #setIndex(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getArrayAccessExpr_Index()
     * @model containment="true"
     * @generated
     */
	Expression getIndex();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ArrayAccessExpr#getIndex <em>Index</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Index</em>' containment reference.
     * @see #getIndex()
     * @generated
     */
	void setIndex(Expression value);

} // ArrayAccessExpr
