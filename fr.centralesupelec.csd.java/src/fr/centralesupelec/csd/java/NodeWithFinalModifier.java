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
 * A representation of the model object '<em><b>Node With Final Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithFinalModifier#isFinal <em>Final</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithFinalModifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithFinalModifier extends NodeWithModifiers {
    /**
     * Returns the value of the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Final</em>' attribute.
     * @see #setFinal(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithFinalModifier_Final()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
    boolean isFinal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.NodeWithFinalModifier#isFinal <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Final</em>' attribute.
     * @see #isFinal()
     * @generated
     */
    void setFinal( boolean value );

} // NodeWithFinalModifier
