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
 * A representation of the model object '<em><b>Node With Native Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.NodeWithNativeModifier#isNative <em>Native</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getNodeWithNativeModifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithNativeModifier extends NodeWithModifiers {
    /**
     * Returns the value of the '<em><b>Native</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Native</em>' attribute.
     * @see #setNative(boolean)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getNodeWithNativeModifier_Native()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
    boolean isNative();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.NodeWithNativeModifier#isNative <em>Native</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Native</em>' attribute.
     * @see #isNative()
     * @generated
     */
    void setNative( boolean value );

} // NodeWithNativeModifier
