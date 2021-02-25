/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.AssertStmt#getCheck <em>Check</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.AssertStmt#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getAssertStmt()
 * @model
 * @generated
 */
public interface AssertStmt extends Statement {
	/**
     * Returns the value of the '<em><b>Check</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Check</em>' containment reference.
     * @see #setCheck(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getAssertStmt_Check()
     * @model containment="true"
     * @generated
     */
	Expression getCheck();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.AssertStmt#getCheck <em>Check</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Check</em>' containment reference.
     * @see #getCheck()
     * @generated
     */
	void setCheck(Expression value);

	/**
     * Returns the value of the '<em><b>Message</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Message</em>' containment reference.
     * @see #setMessage(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getAssertStmt_Message()
     * @model containment="true"
     * @generated
     */
	Expression getMessage();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.AssertStmt#getMessage <em>Message</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' containment reference.
     * @see #getMessage()
     * @generated
     */
	void setMessage(Expression value);

} // AssertStmt
