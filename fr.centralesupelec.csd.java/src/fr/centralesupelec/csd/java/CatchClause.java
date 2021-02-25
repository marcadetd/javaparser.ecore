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
 * A representation of the model object '<em><b>Catch Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.CatchClause#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getCatchClause()
 * @model
 * @generated
 */
public interface CatchClause extends JavaNode, NodeWithBlockStmt {
    /**
     * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' containment reference.
     * @see #setParameter(Parameter)
     * @see fr.centralesupelec.csd.java.JavaPackage#getCatchClause_Parameter()
     * @model containment="true"
     * @generated
     */
    Parameter getParameter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.CatchClause#getParameter <em>Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameter</em>' containment reference.
     * @see #getParameter()
     * @generated
     */
    void setParameter( Parameter value );

} // CatchClause
