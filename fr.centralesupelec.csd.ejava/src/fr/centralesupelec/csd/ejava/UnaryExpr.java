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
 * A representation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.UnaryExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getUnaryExpr()
 * @model
 * @generated
 */
public interface UnaryExpr extends Expression, NodeWithExpression {
    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.csd.ejava.UnaryOperator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see fr.centralesupelec.csd.ejava.UnaryOperator
     * @see #setOperator(UnaryOperator)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getUnaryExpr_Operator()
     * @model
     * @generated
     */
    UnaryOperator getOperator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.UnaryExpr#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see fr.centralesupelec.csd.ejava.UnaryOperator
     * @see #getOperator()
     * @generated
     */
    void setOperator( UnaryOperator value );

} // UnaryExpr
