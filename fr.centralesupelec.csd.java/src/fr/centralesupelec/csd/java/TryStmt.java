/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.TryStmt#getResources <em>Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.TryStmt#getTryBlock <em>Try Block</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.TryStmt#getCatchClauses <em>Catch Clauses</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.TryStmt#getFinallyBlock <em>Finally Block</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getTryStmt()
 * @model
 * @generated
 */
public interface TryStmt extends Statement {
	/**
     * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.Expression}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resources</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getTryStmt_Resources()
     * @model containment="true"
     * @generated
     */
	EList<Expression> getResources();

	/**
     * Returns the value of the '<em><b>Try Block</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Try Block</em>' containment reference.
     * @see #setTryBlock(BlockStmt)
     * @see fr.centralesupelec.csd.java.JavaPackage#getTryStmt_TryBlock()
     * @model containment="true"
     * @generated
     */
	BlockStmt getTryBlock();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.TryStmt#getTryBlock <em>Try Block</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Try Block</em>' containment reference.
     * @see #getTryBlock()
     * @generated
     */
	void setTryBlock(BlockStmt value);

	/**
     * Returns the value of the '<em><b>Catch Clauses</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.CatchClause}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Catch Clauses</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getTryStmt_CatchClauses()
     * @model containment="true"
     * @generated
     */
	EList<CatchClause> getCatchClauses();

	/**
     * Returns the value of the '<em><b>Finally Block</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Finally Block</em>' containment reference.
     * @see #setFinallyBlock(BlockStmt)
     * @see fr.centralesupelec.csd.java.JavaPackage#getTryStmt_FinallyBlock()
     * @model containment="true"
     * @generated
     */
	BlockStmt getFinallyBlock();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.TryStmt#getFinallyBlock <em>Finally Block</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Finally Block</em>' containment reference.
     * @see #getFinallyBlock()
     * @generated
     */
	void setFinallyBlock(BlockStmt value);

} // TryStmt
