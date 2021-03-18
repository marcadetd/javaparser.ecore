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
 * A representation of the model object '<em><b>Class Or Interface Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.ClassOrInterfaceDeclaration#isInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getClassOrInterfaceDeclaration()
 * @model
 * @generated
 */
public interface ClassOrInterfaceDeclaration extends TypeDeclaration, NodeWithImplements, NodeWithExtends,
        NodeWithTypeParameters, NodeWithAbstractModifier, NodeWithFinalModifier {
    /**
     * Returns the value of the '<em><b>Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface</em>' attribute.
     * @see #setInterface(boolean)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getClassOrInterfaceDeclaration_Interface()
     * @model
     * @generated
     */
    boolean isInterface();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.ClassOrInterfaceDeclaration#isInterface <em>Interface</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface</em>' attribute.
     * @see #isInterface()
     * @generated
     */
    void setInterface( boolean value );

} // ClassOrInterfaceDeclaration
