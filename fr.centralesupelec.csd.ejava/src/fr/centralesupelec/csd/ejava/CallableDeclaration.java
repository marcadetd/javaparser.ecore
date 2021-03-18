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
 * A representation of the model object '<em><b>Callable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.CallableDeclaration#getReceiverParameter <em>Receiver Parameter</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getCallableDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface CallableDeclaration extends BodyDeclaration, NodeWithAccessModifiers, NodeWithSimpleName,
        NodeWithParameters, NodeWithThrownExceptions, NodeWithTypeParameters, NodeWithJavadoc, NodeWithAbstractModifier,
        NodeWithStaticModifier, NodeWithFinalModifier, NodeWithStrictfpModifier {
    /**
     * Returns the value of the '<em><b>Receiver Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Receiver Parameter</em>' containment reference.
     * @see #setReceiverParameter(ReceiverParameter)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getCallableDeclaration_ReceiverParameter()
     * @model containment="true"
     * @generated
     */
    ReceiverParameter getReceiverParameter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.CallableDeclaration#getReceiverParameter <em>Receiver Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Receiver Parameter</em>' containment reference.
     * @see #getReceiverParameter()
     * @generated
     */
    void setReceiverParameter( ReceiverParameter value );

} // CallableDeclaration
