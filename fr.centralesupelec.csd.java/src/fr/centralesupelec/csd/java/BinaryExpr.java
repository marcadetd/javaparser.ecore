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
 * A representation of the model object '<em><b>Binary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.BinaryExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.BinaryExpr#getRight <em>Right</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.BinaryExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getBinaryExpr()
 * @model
 * @generated
 */
public interface BinaryExpr extends Expression {
    /**
     * Returns the value of the '<em><b>Left</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Left</em>' containment reference.
     * @see #setLeft(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getBinaryExpr_Left()
     * @model containment="true"
     * @generated
     */
    Expression getLeft();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.BinaryExpr#getLeft <em>Left</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left</em>' containment reference.
     * @see #getLeft()
     * @generated
     */
    void setLeft( Expression value );

    /**
     * Returns the value of the '<em><b>Right</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Right</em>' containment reference.
     * @see #setRight(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getBinaryExpr_Right()
     * @model containment="true"
     * @generated
     */
    Expression getRight();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.BinaryExpr#getRight <em>Right</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Right</em>' containment reference.
     * @see #getRight()
     * @generated
     */
    void setRight( Expression value );

    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.csd.java.BinaryOperator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see fr.centralesupelec.csd.java.BinaryOperator
     * @see #setOperator(BinaryOperator)
     * @see fr.centralesupelec.csd.java.JavaPackage#getBinaryExpr_Operator()
     * @model
     * @generated
     */
    BinaryOperator getOperator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.BinaryExpr#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see fr.centralesupelec.csd.java.BinaryOperator
     * @see #getOperator()
     * @generated
     */
    void setOperator( BinaryOperator value );

} // BinaryExpr
