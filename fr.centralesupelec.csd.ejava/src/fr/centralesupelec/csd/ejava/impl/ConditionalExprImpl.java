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

import fr.centralesupelec.csd.ejava.ConditionalExpr;
import fr.centralesupelec.csd.ejava.Expression;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.NodeWithCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ConditionalExprImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ConditionalExprImpl#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ConditionalExprImpl#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExprImpl extends ExpressionImpl implements ConditionalExpr {
    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected Expression condition;

    /**
     * The cached value of the '{@link #getThenExpr() <em>Then Expr</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThenExpr()
     * @generated
     * @ordered
     */
    protected Expression thenExpr;

    /**
     * The cached value of the '{@link #getElseExpr() <em>Else Expr</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElseExpr()
     * @generated
     * @ordered
     */
    protected Expression elseExpr;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConditionalExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.CONDITIONAL_EXPR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition( Expression newCondition, NotificationChain msgs ) {
        Expression oldCondition = condition;
        condition = newCondition;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.CONDITIONAL_EXPR__CONDITION, oldCondition, newCondition );
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
    public void setCondition( Expression newCondition ) {
        if( newCondition != condition ) {
            NotificationChain msgs = null;
            if( condition != null )
                msgs = ( ( InternalEObject ) condition ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CONDITIONAL_EXPR__CONDITION, null, msgs );
            if( newCondition != null )
                msgs = ( ( InternalEObject ) newCondition ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CONDITIONAL_EXPR__CONDITION, null, msgs );
            msgs = basicSetCondition( newCondition, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.CONDITIONAL_EXPR__CONDITION,
                    newCondition, newCondition ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getThenExpr() {
        return thenExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThenExpr( Expression newThenExpr, NotificationChain msgs ) {
        Expression oldThenExpr = thenExpr;
        thenExpr = newThenExpr;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.CONDITIONAL_EXPR__THEN_EXPR, oldThenExpr, newThenExpr );
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
    public void setThenExpr( Expression newThenExpr ) {
        if( newThenExpr != thenExpr ) {
            NotificationChain msgs = null;
            if( thenExpr != null )
                msgs = ( ( InternalEObject ) thenExpr ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CONDITIONAL_EXPR__THEN_EXPR, null, msgs );
            if( newThenExpr != null )
                msgs = ( ( InternalEObject ) newThenExpr ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CONDITIONAL_EXPR__THEN_EXPR, null, msgs );
            msgs = basicSetThenExpr( newThenExpr, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.CONDITIONAL_EXPR__THEN_EXPR,
                    newThenExpr, newThenExpr ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getElseExpr() {
        return elseExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElseExpr( Expression newElseExpr, NotificationChain msgs ) {
        Expression oldElseExpr = elseExpr;
        elseExpr = newElseExpr;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.CONDITIONAL_EXPR__ELSE_EXPR, oldElseExpr, newElseExpr );
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
    public void setElseExpr( Expression newElseExpr ) {
        if( newElseExpr != elseExpr ) {
            NotificationChain msgs = null;
            if( elseExpr != null )
                msgs = ( ( InternalEObject ) elseExpr ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CONDITIONAL_EXPR__ELSE_EXPR, null, msgs );
            if( newElseExpr != null )
                msgs = ( ( InternalEObject ) newElseExpr ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CONDITIONAL_EXPR__ELSE_EXPR, null, msgs );
            msgs = basicSetElseExpr( newElseExpr, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.CONDITIONAL_EXPR__ELSE_EXPR,
                    newElseExpr, newElseExpr ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.CONDITIONAL_EXPR__CONDITION:
            return basicSetCondition( null, msgs );
        case EJavaPackage.CONDITIONAL_EXPR__THEN_EXPR:
            return basicSetThenExpr( null, msgs );
        case EJavaPackage.CONDITIONAL_EXPR__ELSE_EXPR:
            return basicSetElseExpr( null, msgs );
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
        case EJavaPackage.CONDITIONAL_EXPR__CONDITION:
            return getCondition();
        case EJavaPackage.CONDITIONAL_EXPR__THEN_EXPR:
            return getThenExpr();
        case EJavaPackage.CONDITIONAL_EXPR__ELSE_EXPR:
            return getElseExpr();
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
        case EJavaPackage.CONDITIONAL_EXPR__CONDITION:
            setCondition( ( Expression ) newValue );
            return;
        case EJavaPackage.CONDITIONAL_EXPR__THEN_EXPR:
            setThenExpr( ( Expression ) newValue );
            return;
        case EJavaPackage.CONDITIONAL_EXPR__ELSE_EXPR:
            setElseExpr( ( Expression ) newValue );
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
        case EJavaPackage.CONDITIONAL_EXPR__CONDITION:
            setCondition( ( Expression ) null );
            return;
        case EJavaPackage.CONDITIONAL_EXPR__THEN_EXPR:
            setThenExpr( ( Expression ) null );
            return;
        case EJavaPackage.CONDITIONAL_EXPR__ELSE_EXPR:
            setElseExpr( ( Expression ) null );
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
        case EJavaPackage.CONDITIONAL_EXPR__CONDITION:
            return condition != null;
        case EJavaPackage.CONDITIONAL_EXPR__THEN_EXPR:
            return thenExpr != null;
        case EJavaPackage.CONDITIONAL_EXPR__ELSE_EXPR:
            return elseExpr != null;
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
        if( baseClass == NodeWithCondition.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CONDITIONAL_EXPR__CONDITION:
                return EJavaPackage.NODE_WITH_CONDITION__CONDITION;
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
        if( baseClass == NodeWithCondition.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_CONDITION__CONDITION:
                return EJavaPackage.CONDITIONAL_EXPR__CONDITION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //ConditionalExprImpl
