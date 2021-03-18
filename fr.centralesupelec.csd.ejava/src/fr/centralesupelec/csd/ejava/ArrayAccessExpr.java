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
 * A representation of the model object '<em><b>Array Access Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.ArrayAccessExpr#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.ArrayAccessExpr#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getArrayAccessExpr()
 * @model
 * @generated
 */
public interface ArrayAccessExpr extends Expression {
    /**
     * Returns the value of the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' containment reference.
     * @see #setName(Expression)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getArrayAccessExpr_Name()
     * @model containment="true"
     * @generated
     */
    Expression getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.ArrayAccessExpr#getName <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' containment reference.
     * @see #getName()
     * @generated
     */
    void setName( Expression value );

    /**
     * Returns the value of the '<em><b>Index</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Index</em>' containment reference.
     * @see #setIndex(Expression)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getArrayAccessExpr_Index()
     * @model containment="true"
     * @generated
     */
    Expression getIndex();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.ArrayAccessExpr#getIndex <em>Index</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Index</em>' containment reference.
     * @see #getIndex()
     * @generated
     */
    void setIndex( Expression value );

} // ArrayAccessExpr
