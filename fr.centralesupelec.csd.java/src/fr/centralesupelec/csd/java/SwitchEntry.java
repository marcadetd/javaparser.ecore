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
 * A representation of the model object '<em><b>Switch Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.SwitchEntry#getLabels <em>Labels</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.SwitchEntry#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getSwitchEntry()
 * @model
 * @generated
 */
public interface SwitchEntry extends JavaNode, NodeWithStatements {
    /**
     * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.Expression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Labels</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getSwitchEntry_Labels()
     * @model containment="true"
     * @generated
     */
    EList< Expression > getLabels();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.csd.java.SwitchEntryType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.csd.java.SwitchEntryType
     * @see #setType(SwitchEntryType)
     * @see fr.centralesupelec.csd.java.JavaPackage#getSwitchEntry_Type()
     * @model
     * @generated
     */
    SwitchEntryType getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.SwitchEntry#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.csd.java.SwitchEntryType
     * @see #getType()
     * @generated
     */
    void setType( SwitchEntryType value );

} // SwitchEntry
