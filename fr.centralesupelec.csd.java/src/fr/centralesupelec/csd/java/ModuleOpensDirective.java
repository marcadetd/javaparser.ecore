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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Opens Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.ModuleOpensDirective#getModuleNames <em>Module Names</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getModuleOpensDirective()
 * @model
 * @generated
 */
public interface ModuleOpensDirective extends ModuleDirective, NodeWithName {
    /**
     * Returns the value of the '<em><b>Module Names</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.Name}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Module Names</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getModuleOpensDirective_ModuleNames()
     * @model containment="true"
     * @generated
     */
    EList< Name > getModuleNames();

} // ModuleOpensDirective
