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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.TypeParameter#getTypeBound <em>Type Bound</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getTypeParameter()
 * @model
 * @generated
 */
public interface TypeParameter extends ReferenceType, NodeWithSimpleName, NodeWithAnnotations {
    /**
     * Returns the value of the '<em><b>Type Bound</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.ejava.ClassOrInterfaceType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Bound</em>' containment reference list.
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getTypeParameter_TypeBound()
     * @model containment="true"
     * @generated
     */
    EList< ClassOrInterfaceType > getTypeBound();

} // TypeParameter
