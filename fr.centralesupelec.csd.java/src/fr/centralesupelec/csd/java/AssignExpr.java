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
 * A representation of the model object '<em><b>Assign Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.AssignExpr#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.AssignExpr#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.AssignExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getAssignExpr()
 * @model
 * @generated
 */
public interface AssignExpr extends Expression {
    /**
     * Returns the value of the '<em><b>Target</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' containment reference.
     * @see #setTarget(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getAssignExpr_Target()
     * @model containment="true"
     * @generated
     */
    Expression getTarget();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.AssignExpr#getTarget <em>Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' containment reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget( Expression value );

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getAssignExpr_Value()
     * @model containment="true"
     * @generated
     */
    Expression getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.AssignExpr#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue( Expression value );

    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.csd.java.AssignOperator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see fr.centralesupelec.csd.java.AssignOperator
     * @see #setOperator(AssignOperator)
     * @see fr.centralesupelec.csd.java.JavaPackage#getAssignExpr_Operator()
     * @model
     * @generated
     */
    AssignOperator getOperator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.AssignExpr#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see fr.centralesupelec.csd.java.AssignOperator
     * @see #getOperator()
     * @generated
     */
    void setOperator( AssignOperator value );

} // AssignExpr
