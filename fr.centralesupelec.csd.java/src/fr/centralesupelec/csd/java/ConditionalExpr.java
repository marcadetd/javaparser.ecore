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
 * A representation of the model object '<em><b>Conditional Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.ConditionalExpr#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.ConditionalExpr#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getConditionalExpr()
 * @model
 * @generated
 */
public interface ConditionalExpr extends Expression, NodeWithCondition {
    /**
     * Returns the value of the '<em><b>Then Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Then Expr</em>' containment reference.
     * @see #setThenExpr(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getConditionalExpr_ThenExpr()
     * @model containment="true"
     * @generated
     */
    Expression getThenExpr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ConditionalExpr#getThenExpr <em>Then Expr</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Then Expr</em>' containment reference.
     * @see #getThenExpr()
     * @generated
     */
    void setThenExpr( Expression value );

    /**
     * Returns the value of the '<em><b>Else Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Else Expr</em>' containment reference.
     * @see #setElseExpr(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getConditionalExpr_ElseExpr()
     * @model containment="true"
     * @generated
     */
    Expression getElseExpr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ConditionalExpr#getElseExpr <em>Else Expr</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Else Expr</em>' containment reference.
     * @see #getElseExpr()
     * @generated
     */
    void setElseExpr( Expression value );

} // ConditionalExpr
