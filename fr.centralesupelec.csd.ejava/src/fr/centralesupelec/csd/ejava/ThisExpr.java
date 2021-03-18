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
 * A representation of the model object '<em><b>This Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.ThisExpr#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getThisExpr()
 * @model
 * @generated
 */
public interface ThisExpr extends Expression {
    /**
     * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Name</em>' containment reference.
     * @see #setTypeName(Name)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getThisExpr_TypeName()
     * @model containment="true"
     * @generated
     */
    Name getTypeName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.ThisExpr#getTypeName <em>Type Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type Name</em>' containment reference.
     * @see #getTypeName()
     * @generated
     */
    void setTypeName( Name value );

} // ThisExpr
