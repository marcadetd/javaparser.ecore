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
 * A representation of the model object '<em><b>Instance Of Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.InstanceOfExpr#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getInstanceOfExpr()
 * @model
 * @generated
 */
public interface InstanceOfExpr extends Expression, NodeWithType< ReferenceType >, NodeWithExpression {
    /**
     * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pattern</em>' containment reference.
     * @see #setPattern(PatternExpr)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getInstanceOfExpr_Pattern()
     * @model containment="true"
     * @generated
     */
    PatternExpr getPattern();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.InstanceOfExpr#getPattern <em>Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pattern</em>' containment reference.
     * @see #getPattern()
     * @generated
     */
    void setPattern( PatternExpr value );

} // InstanceOfExpr
