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
 * A representation of the model object '<em><b>Wildcard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.WildcardType#getExtendedType <em>Extended Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.WildcardType#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getWildcardType()
 * @model
 * @generated
 */
public interface WildcardType extends Type, NodeWithAnnotations {
    /**
     * Returns the value of the '<em><b>Extended Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extended Type</em>' containment reference.
     * @see #setExtendedType(ReferenceType)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getWildcardType_ExtendedType()
     * @model containment="true"
     * @generated
     */
    ReferenceType getExtendedType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.WildcardType#getExtendedType <em>Extended Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extended Type</em>' containment reference.
     * @see #getExtendedType()
     * @generated
     */
    void setExtendedType( ReferenceType value );

    /**
     * Returns the value of the '<em><b>Super Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Type</em>' containment reference.
     * @see #setSuperType(ReferenceType)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getWildcardType_SuperType()
     * @model containment="true"
     * @generated
     */
    ReferenceType getSuperType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.WildcardType#getSuperType <em>Super Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Type</em>' containment reference.
     * @see #getSuperType()
     * @generated
     */
    void setSuperType( ReferenceType value );

} // WildcardType
