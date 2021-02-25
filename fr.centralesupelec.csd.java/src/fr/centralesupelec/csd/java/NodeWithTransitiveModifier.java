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
 * A representation of the model object '<em><b>Node With Transitive Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithTransitiveModifier#isTransitive <em>Transitive</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithTransitiveModifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithTransitiveModifier extends NodeWithModifiers {
    /**
     * Returns the value of the '<em><b>Transitive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transitive</em>' attribute.
     * @see #setTransitive(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithTransitiveModifier_Transitive()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
    boolean isTransitive();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithTransitiveModifier#isTransitive <em>Transitive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transitive</em>' attribute.
     * @see #isTransitive()
     * @generated
     */
    void setTransitive( boolean value );

} // NodeWithTransitiveModifier
