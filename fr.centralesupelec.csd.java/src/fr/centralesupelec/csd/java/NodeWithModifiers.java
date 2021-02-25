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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With Modifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithModifiers#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithModifiers()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithModifiers extends EObject {
    /**
     * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.ModifierKeyword}.
     * The literals are from the enumeration {@link fr.centralesupelec.csd.java.ModifierKeyword}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modifiers</em>' attribute list.
     * @see fr.centralesupelec.csd.java.ModifierKeyword
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithModifiers_Modifiers()
     * @model
     * @generated
     */
    EList< ModifierKeyword > getModifiers();

} // NodeWithModifiers
