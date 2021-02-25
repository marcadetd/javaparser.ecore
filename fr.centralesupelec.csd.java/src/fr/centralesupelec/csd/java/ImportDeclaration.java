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
 * A representation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.ImportDeclaration#isStatic <em>Static</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.ImportDeclaration#isAsterisk <em>Asterisk</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getImportDeclaration()
 * @model
 * @generated
 */
public interface ImportDeclaration extends JavaNode, NodeWithName {
    /**
     * Returns the value of the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static</em>' attribute.
     * @see #setStatic(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getImportDeclaration_Static()
     * @model
     * @generated
     */
    boolean isStatic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ImportDeclaration#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' attribute.
     * @see #isStatic()
     * @generated
     */
    void setStatic( boolean value );

    /**
     * Returns the value of the '<em><b>Asterisk</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asterisk</em>' attribute.
     * @see #setAsterisk(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getImportDeclaration_Asterisk()
     * @model
     * @generated
     */
    boolean isAsterisk();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ImportDeclaration#isAsterisk <em>Asterisk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asterisk</em>' attribute.
     * @see #isAsterisk()
     * @generated
     */
    void setAsterisk( boolean value );

} // ImportDeclaration
