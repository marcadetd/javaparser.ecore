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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Simple Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.NodeWithSimpleName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getNodeWithSimpleName()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithSimpleName extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' containment reference.
     * @see #setName(SimpleName)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getNodeWithSimpleName_Name()
     * @model containment="true"
     * @generated
     */
    SimpleName getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.NodeWithSimpleName#getName <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' containment reference.
     * @see #getName()
     * @generated
     */
    void setName( SimpleName value );

} // NodeWithSimpleName
