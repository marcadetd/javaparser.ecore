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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.ForStmt#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.ForStmt#getCompare <em>Compare</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.ForStmt#getUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getForStmt()
 * @model
 * @generated
 */
public interface ForStmt extends Statement, NodeWithBody {
    /**
     * Returns the value of the '<em><b>Initialization</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.Expression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initialization</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getForStmt_Initialization()
     * @model containment="true"
     * @generated
     */
    EList< Expression > getInitialization();

    /**
     * Returns the value of the '<em><b>Compare</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Compare</em>' containment reference.
     * @see #setCompare(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getForStmt_Compare()
     * @model containment="true"
     * @generated
     */
    Expression getCompare();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ForStmt#getCompare <em>Compare</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Compare</em>' containment reference.
     * @see #getCompare()
     * @generated
     */
    void setCompare( Expression value );

    /**
     * Returns the value of the '<em><b>Update</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.Expression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Update</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getForStmt_Update()
     * @model containment="true"
     * @generated
     */
    EList< Expression > getUpdate();

} // ForStmt
