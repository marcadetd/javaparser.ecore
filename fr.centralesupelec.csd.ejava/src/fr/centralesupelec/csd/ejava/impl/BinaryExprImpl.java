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

import fr.centralesupelec.csd.ejava.BinaryExpr;
import fr.centralesupelec.csd.ejava.BinaryOperator;
import fr.centralesupelec.csd.ejava.Expression;
import fr.centralesupelec.csd.ejava.EJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.BinaryExprImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.BinaryExprImpl#getRight <em>Right</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.BinaryExprImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryExprImpl extends ExpressionImpl implements BinaryExpr {
    /**
     * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeft()
     * @generated
     * @ordered
     */
    protected Expression left;

    /**
     * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRight()
     * @generated
     * @ordered
     */
    protected Expression right;

    /**
     * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected static final BinaryOperator OPERATOR_EDEFAULT = BinaryOperator.OR;

    /**
     * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected BinaryOperator operator = OPERATOR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BinaryExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.BINARY_EXPR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getLeft() {
        return left;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLeft( Expression newLeft, NotificationChain msgs ) {
        Expression oldLeft = left;
        left = newLeft;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.BINARY_EXPR__LEFT, oldLeft, newLeft );
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
    public void setLeft( Expression newLeft ) {
        if( newLeft != left ) {
            NotificationChain msgs = null;
            if( left != null )
                msgs = ( ( InternalEObject ) left ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.BINARY_EXPR__LEFT, null, msgs );
            if( newLeft != null )
                msgs = ( ( InternalEObject ) newLeft ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.BINARY_EXPR__LEFT, null, msgs );
            msgs = basicSetLeft( newLeft, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.BINARY_EXPR__LEFT, newLeft,
                    newLeft ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getRight() {
        return right;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRight( Expression newRight, NotificationChain msgs ) {
        Expression oldRight = right;
        right = newRight;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.BINARY_EXPR__RIGHT, oldRight, newRight );
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
    public void setRight( Expression newRight ) {
        if( newRight != right ) {
            NotificationChain msgs = null;
            if( right != null )
                msgs = ( ( InternalEObject ) right ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.BINARY_EXPR__RIGHT, null, msgs );
            if( newRight != null )
                msgs = ( ( InternalEObject ) newRight ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.BINARY_EXPR__RIGHT, null, msgs );
            msgs = basicSetRight( newRight, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.BINARY_EXPR__RIGHT, newRight,
                    newRight ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BinaryOperator getOperator() {
        return operator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperator( BinaryOperator newOperator ) {
        BinaryOperator oldOperator = operator;
        operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.BINARY_EXPR__OPERATOR, oldOperator,
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
        case EJavaPackage.BINARY_EXPR__LEFT:
            return basicSetLeft( null, msgs );
        case EJavaPackage.BINARY_EXPR__RIGHT:
            return basicSetRight( null, msgs );
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
        case EJavaPackage.BINARY_EXPR__LEFT:
            return getLeft();
        case EJavaPackage.BINARY_EXPR__RIGHT:
            return getRight();
        case EJavaPackage.BINARY_EXPR__OPERATOR:
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
        case EJavaPackage.BINARY_EXPR__LEFT:
            setLeft( ( Expression ) newValue );
            return;
        case EJavaPackage.BINARY_EXPR__RIGHT:
            setRight( ( Expression ) newValue );
            return;
        case EJavaPackage.BINARY_EXPR__OPERATOR:
            setOperator( ( BinaryOperator ) newValue );
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
        case EJavaPackage.BINARY_EXPR__LEFT:
            setLeft( ( Expression ) null );
            return;
        case EJavaPackage.BINARY_EXPR__RIGHT:
            setRight( ( Expression ) null );
            return;
        case EJavaPackage.BINARY_EXPR__OPERATOR:
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
        case EJavaPackage.BINARY_EXPR__LEFT:
            return left != null;
        case EJavaPackage.BINARY_EXPR__RIGHT:
            return right != null;
        case EJavaPackage.BINARY_EXPR__OPERATOR:
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
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (operator: " );
        result.append( operator );
        result.append( ')' );
        return result.toString();
    }

} //BinaryExprImpl
