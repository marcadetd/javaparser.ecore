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
 * A representation of the model object '<em><b>Node With Public Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.NodeWithPublicModifier#isPublic <em>Public</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getNodeWithPublicModifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithPublicModifier extends NodeWithModifiers {
    /**
     * Returns the value of the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Public</em>' attribute.
     * @see #setPublic(boolean)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getNodeWithPublicModifier_Public()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
    boolean isPublic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.NodeWithPublicModifier#isPublic <em>Public</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Public</em>' attribute.
     * @see #isPublic()
     * @generated
     */
    void setPublic( boolean value );

} // NodeWithPublicModifier
