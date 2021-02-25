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
 * A representation of the model object '<em><b>For Each Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.ForEachStmt#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.ForEachStmt#getIterable <em>Iterable</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getForEachStmt()
 * @model
 * @generated
 */
public interface ForEachStmt extends Statement, NodeWithBody {
    /**
     * Returns the value of the '<em><b>Variable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable</em>' containment reference.
     * @see #setVariable(VariableDeclarationExpr)
     * @see fr.centralesupelec.csd.java.JavaPackage#getForEachStmt_Variable()
     * @model containment="true"
     * @generated
     */
    VariableDeclarationExpr getVariable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ForEachStmt#getVariable <em>Variable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' containment reference.
     * @see #getVariable()
     * @generated
     */
    void setVariable( VariableDeclarationExpr value );

    /**
     * Returns the value of the '<em><b>Iterable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Iterable</em>' containment reference.
     * @see #setIterable(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getForEachStmt_Iterable()
     * @model containment="true"
     * @generated
     */
    Expression getIterable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ForEachStmt#getIterable <em>Iterable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iterable</em>' containment reference.
     * @see #getIterable()
     * @generated
     */
    void setIterable( Expression value );

} // ForEachStmt
