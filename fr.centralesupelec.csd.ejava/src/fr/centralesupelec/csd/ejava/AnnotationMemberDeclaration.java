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
 * A representation of the model object '<em><b>Annotation Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.AnnotationMemberDeclaration#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getAnnotationMemberDeclaration()
 * @model
 * @generated
 */
public interface AnnotationMemberDeclaration extends BodyDeclaration, NodeWithJavadoc, NodeWithSimpleName,
        NodeWithType< Type >, NodeWithPublicModifier, NodeWithAbstractModifier {
    /**
     * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' containment reference.
     * @see #setDefaultValue(Expression)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getAnnotationMemberDeclaration_DefaultValue()
     * @model containment="true"
     * @generated
     */
    Expression getDefaultValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.AnnotationMemberDeclaration#getDefaultValue <em>Default Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' containment reference.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue( Expression value );

} // AnnotationMemberDeclaration
