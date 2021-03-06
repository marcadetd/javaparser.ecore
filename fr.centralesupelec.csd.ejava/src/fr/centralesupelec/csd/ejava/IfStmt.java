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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.IfStmt#getThenStmt <em>Then Stmt</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.IfStmt#getElseStmt <em>Else Stmt</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getIfStmt()
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
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getIfStmt_ThenStmt()
     * @model containment="true"
     * @generated
     */
    Statement getThenStmt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.IfStmt#getThenStmt <em>Then Stmt</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Then Stmt</em>' containment reference.
     * @see #getThenStmt()
     * @generated
     */
    void setThenStmt( Statement value );

    /**
     * Returns the value of the '<em><b>Else Stmt</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Else Stmt</em>' containment reference.
     * @see #setElseStmt(Statement)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getIfStmt_ElseStmt()
     * @model containment="true"
     * @generated
     */
    Statement getElseStmt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.IfStmt#getElseStmt <em>Else Stmt</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Else Stmt</em>' containment reference.
     * @see #getElseStmt()
     * @generated
     */
    void setElseStmt( Statement value );

} // IfStmt
