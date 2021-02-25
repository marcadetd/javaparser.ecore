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
 * A representation of the model object '<em><b>Node With Arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NodeWithArguments#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithArguments()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NodeWithArguments extends EObject {
    /**
     * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.Expression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Arguments</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getNodeWithArguments_Arguments()
     * @model containment="true"
     * @generated
     */
    EList< Expression > getArguments();

} // NodeWithArguments
