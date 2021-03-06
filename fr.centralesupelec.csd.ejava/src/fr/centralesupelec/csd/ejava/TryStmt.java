/**
 *  Copyright (c) 2021 CentraleSupélec.
 *  This program and the accompanying materials are made
 *  available under the terms of the Apache License version 2.0
 *  which accompanies this distribution, and is available at
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *  Web site:
 *      https://github.com/marcadetd/javaparser.ecore
 * 
 */
package fr.centralesupelec.csd.ejava;

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
 *   <li>{@link fr.centralesupelec.csd.ejava.TryStmt#getResources <em>Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.TryStmt#getTryBlock <em>Try Block</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.TryStmt#getCatchClauses <em>Catch Clauses</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.TryStmt#getFinallyBlock <em>Finally Block</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getTryStmt()
 * @model
 * @generated
 */
public interface TryStmt extends Statement {
    /**
     * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.ejava.Expression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resources</em>' containment reference list.
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getTryStmt_Resources()
     * @model containment="true"
     * @generated
     */
    EList< Expression > getResources();

    /**
     * Returns the value of the '<em><b>Try Block</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Try Block</em>' containment reference.
     * @see #setTryBlock(BlockStmt)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getTryStmt_TryBlock()
     * @model containment="true"
     * @generated
     */
    BlockStmt getTryBlock();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.TryStmt#getTryBlock <em>Try Block</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Try Block</em>' containment reference.
     * @see #getTryBlock()
     * @generated
     */
    void setTryBlock( BlockStmt value );

    /**
     * Returns the value of the '<em><b>Catch Clauses</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.ejava.CatchClause}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Catch Clauses</em>' containment reference list.
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getTryStmt_CatchClauses()
     * @model containment="true"
     * @generated
     */
    EList< CatchClause > getCatchClauses();

    /**
     * Returns the value of the '<em><b>Finally Block</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Finally Block</em>' containment reference.
     * @see #setFinallyBlock(BlockStmt)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getTryStmt_FinallyBlock()
     * @model containment="true"
     * @generated
     */
    BlockStmt getFinallyBlock();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.TryStmt#getFinallyBlock <em>Finally Block</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Finally Block</em>' containment reference.
     * @see #getFinallyBlock()
     * @generated
     */
    void setFinallyBlock( BlockStmt value );

} // TryStmt
