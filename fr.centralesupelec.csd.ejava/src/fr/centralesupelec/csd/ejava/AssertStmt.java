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
 * A representation of the model object '<em><b>Assert Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.AssertStmt#getCheck <em>Check</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.AssertStmt#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getAssertStmt()
 * @model
 * @generated
 */
public interface AssertStmt extends Statement {
    /**
     * Returns the value of the '<em><b>Check</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Check</em>' containment reference.
     * @see #setCheck(Expression)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getAssertStmt_Check()
     * @model containment="true"
     * @generated
     */
    Expression getCheck();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.AssertStmt#getCheck <em>Check</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Check</em>' containment reference.
     * @see #getCheck()
     * @generated
     */
    void setCheck( Expression value );

    /**
     * Returns the value of the '<em><b>Message</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message</em>' containment reference.
     * @see #setMessage(Expression)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getAssertStmt_Message()
     * @model containment="true"
     * @generated
     */
    Expression getMessage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.AssertStmt#getMessage <em>Message</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' containment reference.
     * @see #getMessage()
     * @generated
     */
    void setMessage( Expression value );

} // AssertStmt
