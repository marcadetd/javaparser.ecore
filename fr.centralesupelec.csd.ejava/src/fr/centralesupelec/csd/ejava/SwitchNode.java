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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.SwitchNode#getSelector <em>Selector</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.SwitchNode#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getSwitchNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SwitchNode extends EObject {
    /**
     * Returns the value of the '<em><b>Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selector</em>' containment reference.
     * @see #setSelector(Expression)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getSwitchNode_Selector()
     * @model containment="true"
     * @generated
     */
    Expression getSelector();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.SwitchNode#getSelector <em>Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector</em>' containment reference.
     * @see #getSelector()
     * @generated
     */
    void setSelector( Expression value );

    /**
     * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.ejava.SwitchEntry}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entries</em>' containment reference list.
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getSwitchNode_Entries()
     * @model containment="true"
     * @generated
     */
    EList< SwitchEntry > getEntries();

} // SwitchNode
