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
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.Parameter#isVarArgs <em>Var Args</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.Parameter#getVarArgsAnnotations <em>Var Args Annotations</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter
        extends JavaNode, NodeWithType< Type >, NodeWithAnnotations, NodeWithSimpleName, NodeWithFinalModifier {
    /**
     * Returns the value of the '<em><b>Var Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Var Args</em>' attribute.
     * @see #setVarArgs(boolean)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getParameter_VarArgs()
     * @model
     * @generated
     */
    boolean isVarArgs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.Parameter#isVarArgs <em>Var Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Var Args</em>' attribute.
     * @see #isVarArgs()
     * @generated
     */
    void setVarArgs( boolean value );

    /**
     * Returns the value of the '<em><b>Var Args Annotations</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.ejava.AnnotationExpr}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Var Args Annotations</em>' containment reference list.
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getParameter_VarArgsAnnotations()
     * @model containment="true"
     * @generated
     */
    EList< AnnotationExpr > getVarArgsAnnotations();

} // Parameter
