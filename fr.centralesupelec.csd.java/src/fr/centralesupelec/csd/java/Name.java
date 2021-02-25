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
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.Name#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getName_()
 * @model
 * @generated
 */
public interface Name extends JavaNode, NodeWithIdentifier {
    /**
     * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qualifier</em>' containment reference.
     * @see #setQualifier(Name)
     * @see fr.centralesupelec.csd.java.JavaPackage#getName_Qualifier()
     * @model containment="true"
     * @generated
     */
    Name getQualifier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.Name#getQualifier <em>Qualifier</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qualifier</em>' containment reference.
     * @see #getQualifier()
     * @generated
     */
    void setQualifier( Name value );

} // Name
