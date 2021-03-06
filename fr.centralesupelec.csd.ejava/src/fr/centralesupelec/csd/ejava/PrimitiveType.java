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
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.PrimitiveType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type, NodeWithAnnotations {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.csd.ejava.Primitive}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.csd.ejava.Primitive
     * @see #setType(Primitive)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getPrimitiveType_Type()
     * @model
     * @generated
     */
    Primitive getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.PrimitiveType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.csd.ejava.Primitive
     * @see #getType()
     * @generated
     */
    void setType( Primitive value );

} // PrimitiveType
