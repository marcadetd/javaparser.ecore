/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.IfStmt#getThenStmt <em>Then Stmt</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.IfStmt#getElseStmt <em>Else Stmt</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getIfStmt()
 * @model
 * @generated
 */
public interface IfStmt extends Statement, NodeWithCondition {
	/**
     * Returns the value of the '<em><b>Then Stmt</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Then Stmt</em>' containment reference.
     * @see #setThenStmt(Statement)
     * @see fr.centralesupelec.csd.java.JavaPackage#getIfStmt_ThenStmt()
     * @model containment="true"
     * @generated
     */
	Statement getThenStmt();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.IfStmt#getThenStmt <em>Then Stmt</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Then Stmt</em>' containment reference.
     * @see #getThenStmt()
     * @generated
     */
	void setThenStmt(Statement value);

	/**
     * Returns the value of the '<em><b>Else Stmt</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Else Stmt</em>' containment reference.
     * @see #setElseStmt(Statement)
     * @see fr.centralesupelec.csd.java.JavaPackage#getIfStmt_ElseStmt()
     * @model containment="true"
     * @generated
     */
	Statement getElseStmt();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.IfStmt#getElseStmt <em>Else Stmt</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Else Stmt</em>' containment reference.
     * @see #getElseStmt()
     * @generated
     */
	void setElseStmt(Statement value);

} // IfStmt
