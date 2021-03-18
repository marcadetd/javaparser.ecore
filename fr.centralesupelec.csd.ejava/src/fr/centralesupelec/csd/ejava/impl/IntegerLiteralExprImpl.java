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
package fr.centralesupelec.csd.ejava.impl;

import org.eclipse.emf.ecore.EClass;

import fr.centralesupelec.csd.ejava.IntegerLiteralExpr;
import fr.centralesupelec.csd.ejava.EJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Literal Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IntegerLiteralExprImpl extends LiteralStringValueExprImpl implements IntegerLiteralExpr {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntegerLiteralExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.INTEGER_LITERAL_EXPR;
    }

} //IntegerLiteralExprImpl
