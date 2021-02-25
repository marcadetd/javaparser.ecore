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
package fr.centralesupelec.csd.java;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.LabeledStmt#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getLabeledStmt()
 * @model
 * @generated
 */
public interface LabeledStmt extends Statement, NodeWithLabel {
    /**
     * Returns the value of the '<em><b>Statement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Statement</em>' containment reference.
     * @see #setStatement(Statement)
     * @see fr.centralesupelec.csd.java.JavaPackage#getLabeledStmt_Statement()
     * @model containment="true"
     * @generated
     */
    Statement getStatement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.LabeledStmt#getStatement <em>Statement</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Statement</em>' containment reference.
     * @see #getStatement()
     * @generated
     */
    void setStatement( Statement value );

} // LabeledStmt
