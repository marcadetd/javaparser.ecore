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
 * A representation of the model object '<em><b>Explicit Constructor Invocation Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.ExplicitConstructorInvocationStmt#isIsThis <em>Is This</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getExplicitConstructorInvocationStmt()
 * @model
 * @generated
 */
public interface ExplicitConstructorInvocationStmt
        extends Statement, NodeWithTypeArguments, NodeWithArguments, NodeWithExpression {
    /**
     * Returns the value of the '<em><b>Is This</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is This</em>' attribute.
     * @see #setIsThis(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getExplicitConstructorInvocationStmt_IsThis()
     * @model
     * @generated
     */
    boolean isIsThis();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ExplicitConstructorInvocationStmt#isIsThis <em>Is This</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is This</em>' attribute.
     * @see #isIsThis()
     * @generated
     */
    void setIsThis( boolean value );

} // ExplicitConstructorInvocationStmt
