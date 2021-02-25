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
 * A representation of the model object '<em><b>Array Creation Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.ArrayCreationLevel#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getArrayCreationLevel()
 * @model
 * @generated
 */
public interface ArrayCreationLevel extends JavaNode, NodeWithAnnotations {
    /**
     * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dimension</em>' containment reference.
     * @see #setDimension(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getArrayCreationLevel_Dimension()
     * @model containment="true"
     * @generated
     */
    Expression getDimension();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ArrayCreationLevel#getDimension <em>Dimension</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dimension</em>' containment reference.
     * @see #getDimension()
     * @generated
     */
    void setDimension( Expression value );

} // ArrayCreationLevel
