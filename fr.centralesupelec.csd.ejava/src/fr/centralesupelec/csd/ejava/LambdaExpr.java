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
 * A representation of the model object '<em><b>Lambda Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.LambdaExpr#isEnclosingParameters <em>Enclosing Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.LambdaExpr#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getLambdaExpr()
 * @model
 * @generated
 */
public interface LambdaExpr extends Expression, NodeWithParameters {
    /**
     * Returns the value of the '<em><b>Enclosing Parameters</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enclosing Parameters</em>' attribute.
     * @see #setEnclosingParameters(boolean)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getLambdaExpr_EnclosingParameters()
     * @model
     * @generated
     */
    boolean isEnclosingParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.LambdaExpr#isEnclosingParameters <em>Enclosing Parameters</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enclosing Parameters</em>' attribute.
     * @see #isEnclosingParameters()
     * @generated
     */
    void setEnclosingParameters( boolean value );

    /**
     * Returns the value of the '<em><b>Body</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Body</em>' reference.
     * @see #setBody(Statement)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getLambdaExpr_Body()
     * @model
     * @generated
     */
    Statement getBody();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.LambdaExpr#getBody <em>Body</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' reference.
     * @see #getBody()
     * @generated
     */
    void setBody( Statement value );

} // LambdaExpr
