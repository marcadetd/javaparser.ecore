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
 * A representation of the model object '<em><b>Module Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.ModuleDeclaration#isOpen <em>Open</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.ModuleDeclaration#getDirectives <em>Directives</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getModuleDeclaration()
 * @model
 * @generated
 */
public interface ModuleDeclaration extends JavaNode, NodeWithName, NodeWithAnnotations {
    /**
     * Returns the value of the '<em><b>Open</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Open</em>' attribute.
     * @see #setOpen(boolean)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getModuleDeclaration_Open()
     * @model
     * @generated
     */
    boolean isOpen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.ModuleDeclaration#isOpen <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Open</em>' attribute.
     * @see #isOpen()
     * @generated
     */
    void setOpen( boolean value );

    /**
     * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.ejava.ModuleDirective}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Directives</em>' containment reference list.
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getModuleDeclaration_Directives()
     * @model containment="true"
     * @generated
     */
    EList< ModuleDirective > getDirectives();

} // ModuleDeclaration
