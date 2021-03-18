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
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.ArrayType#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.ArrayType#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends ReferenceType, NodeWithAnnotations {
    /**
     * Returns the value of the '<em><b>Component Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component Type</em>' containment reference.
     * @see #setComponentType(Type)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getArrayType_ComponentType()
     * @model containment="true"
     * @generated
     */
    Type getComponentType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.ArrayType#getComponentType <em>Component Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component Type</em>' containment reference.
     * @see #getComponentType()
     * @generated
     */
    void setComponentType( Type value );

    /**
     * Returns the value of the '<em><b>Origin</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.csd.ejava.ArrayTypeOrigin}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Origin</em>' attribute.
     * @see fr.centralesupelec.csd.ejava.ArrayTypeOrigin
     * @see #setOrigin(ArrayTypeOrigin)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getArrayType_Origin()
     * @model
     * @generated
     */
    ArrayTypeOrigin getOrigin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.ArrayType#getOrigin <em>Origin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Origin</em>' attribute.
     * @see fr.centralesupelec.csd.ejava.ArrayTypeOrigin
     * @see #getOrigin()
     * @generated
     */
    void setOrigin( ArrayTypeOrigin value );

} // ArrayType
