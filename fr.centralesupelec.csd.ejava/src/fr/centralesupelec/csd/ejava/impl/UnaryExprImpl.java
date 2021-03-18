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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.csd.ejava.Expression;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.NodeWithExpression;
import fr.centralesupelec.csd.ejava.UnaryExpr;
import fr.centralesupelec.csd.ejava.UnaryOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.UnaryExprImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.UnaryExprImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryExprImpl extends ExpressionImpl implements UnaryExpr {
    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected Expression expression;

    /**
     * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected static final UnaryOperator OPERATOR_EDEFAULT = UnaryOperator.PLUS;

    /**
     * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected UnaryOperator operator = OPERATOR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnaryExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.UNARY_EXPR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression( Expression newExpression, NotificationChain msgs ) {
        Expression oldExpression = expression;
        expression = newExpression;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.UNARY_EXPR__EXPRESSION, oldExpression, newExpression );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExpression( Expression newExpression ) {
        if( newExpression != expression ) {
            NotificationChain msgs = null;
            if( expression != null )
                msgs = ( ( InternalEObject ) expression ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.UNARY_EXPR__EXPRESSION, null, msgs );
            if( newExpression != null )
                msgs = ( ( InternalEObject ) newExpression ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.UNARY_EXPR__EXPRESSION, null, msgs );
            msgs = basicSetExpression( newExpression, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.UNARY_EXPR__EXPRESSION, newExpression,
                    newExpression ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnaryOperator getOperator() {
        return operator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperator( UnaryOperator newOperator ) {
        UnaryOperator oldOperator = operator;
        operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.UNARY_EXPR__OPERATOR, oldOperator,
                    operator ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.UNARY_EXPR__EXPRESSION:
            return basicSetExpression( null, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case EJavaPackage.UNARY_EXPR__EXPRESSION:
            return getExpression();
        case EJavaPackage.UNARY_EXPR__OPERATOR:
            return getOperator();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case EJavaPackage.UNARY_EXPR__EXPRESSION:
            setExpression( ( Expression ) newValue );
            return;
        case EJavaPackage.UNARY_EXPR__OPERATOR:
            setOperator( ( UnaryOperator ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case EJavaPackage.UNARY_EXPR__EXPRESSION:
            setExpression( ( Expression ) null );
            return;
        case EJavaPackage.UNARY_EXPR__OPERATOR:
            setOperator( OPERATOR_EDEFAULT );
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case EJavaPackage.UNARY_EXPR__EXPRESSION:
            return expression != null;
        case EJavaPackage.UNARY_EXPR__OPERATOR:
            return operator != OPERATOR_EDEFAULT;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID( int derivedFeatureID, Class< ? > baseClass ) {
        if( baseClass == NodeWithExpression.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.UNARY_EXPR__EXPRESSION:
                return EJavaPackage.NODE_WITH_EXPRESSION__EXPRESSION;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID( int baseFeatureID, Class< ? > baseClass ) {
        if( baseClass == NodeWithExpression.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_EXPRESSION__EXPRESSION:
                return EJavaPackage.UNARY_EXPR__EXPRESSION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (operator: " );
        result.append( operator );
        result.append( ')' );
        return result.toString();
    }

} //UnaryExprImpl
