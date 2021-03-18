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
 * A representation of the model object '<em><b>Enclosed Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.EnclosedExpr#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getEnclosedExpr()
 * @model
 * @generated
 */
public interface EnclosedExpr extends Expression {
    /**
     * Returns the value of the '<em><b>Inner</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inner</em>' containment reference.
     * @see #setInner(Expression)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getEnclosedExpr_Inner()
     * @model containment="true"
     * @generated
     */
    Expression getInner();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.EnclosedExpr#getInner <em>Inner</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inner</em>' containment reference.
     * @see #getInner()
     * @generated
     */
    void setInner( Expression value );

} // EnclosedExpr
