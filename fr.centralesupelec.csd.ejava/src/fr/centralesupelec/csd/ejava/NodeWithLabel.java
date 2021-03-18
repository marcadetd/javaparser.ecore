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
 * A representation of the model object '<em><b>Node With Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.NodeWithLabel#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getNodeWithLabel()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithLabel extends EObject {
    /**
     * Returns the value of the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' containment reference.
     * @see #setLabel(SimpleName)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getNodeWithLabel_Label()
     * @model containment="true"
     * @generated
     */
    SimpleName getLabel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.NodeWithLabel#getLabel <em>Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' containment reference.
     * @see #getLabel()
     * @generated
     */
    void setLabel( SimpleName value );

} // NodeWithLabel
