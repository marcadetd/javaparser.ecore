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
 * A representation of the model object '<em><b>Object Creation Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.ObjectCreationExpr#getAnonymousClassBody <em>Anonymous Class Body</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getObjectCreationExpr()
 * @model
 * @generated
 */
public interface ObjectCreationExpr extends Expression, NodeWithTypeArguments, NodeWithType< ClassOrInterfaceType >,
        NodeWithArguments, NodeWithScope< Expression > {
    /**
     * Returns the value of the '<em><b>Anonymous Class Body</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.ejava.BodyDeclaration}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Anonymous Class Body</em>' containment reference list.
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getObjectCreationExpr_AnonymousClassBody()
     * @model containment="true"
     * @generated
     */
    EList< BodyDeclaration > getAnonymousClassBody();

} // ObjectCreationExpr
