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

import fr.centralesupelec.csd.ejava.AssertStmt;
import fr.centralesupelec.csd.ejava.Expression;
import fr.centralesupelec.csd.ejava.EJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.AssertStmtImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.AssertStmtImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertStmtImpl extends StatementImpl implements AssertStmt {
    /**
     * The cached value of the '{@link #getCheck() <em>Check</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCheck()
     * @generated
     * @ordered
     */
    protected Expression check;

    /**
     * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessage()
     * @generated
     * @ordered
     */
    protected Expression message;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssertStmtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.ASSERT_STMT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getCheck() {
        return check;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCheck( Expression newCheck, NotificationChain msgs ) {
        Expression oldCheck = check;
        check = newCheck;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.ASSERT_STMT__CHECK, oldCheck, newCheck );
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
    public void setCheck( Expression newCheck ) {
        if( newCheck != check ) {
            NotificationChain msgs = null;
            if( check != null )
                msgs = ( ( InternalEObject ) check ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.ASSERT_STMT__CHECK, null, msgs );
            if( newCheck != null )
                msgs = ( ( InternalEObject ) newCheck ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.ASSERT_STMT__CHECK, null, msgs );
            msgs = basicSetCheck( newCheck, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.ASSERT_STMT__CHECK, newCheck,
                    newCheck ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getMessage() {
        return message;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessage( Expression newMessage, NotificationChain msgs ) {
        Expression oldMessage = message;
        message = newMessage;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.ASSERT_STMT__MESSAGE, oldMessage, newMessage );
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
    public void setMessage( Expression newMessage ) {
        if( newMessage != message ) {
            NotificationChain msgs = null;
            if( message != null )
                msgs = ( ( InternalEObject ) message ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.ASSERT_STMT__MESSAGE, null, msgs );
            if( newMessage != null )
                msgs = ( ( InternalEObject ) newMessage ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.ASSERT_STMT__MESSAGE, null, msgs );
            msgs = basicSetMessage( newMessage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.ASSERT_STMT__MESSAGE, newMessage,
                    newMessage ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.ASSERT_STMT__CHECK:
            return basicSetCheck( null, msgs );
        case EJavaPackage.ASSERT_STMT__MESSAGE:
            return basicSetMessage( null, msgs );
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
        case EJavaPackage.ASSERT_STMT__CHECK:
            return getCheck();
        case EJavaPackage.ASSERT_STMT__MESSAGE:
            return getMessage();
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
        case EJavaPackage.ASSERT_STMT__CHECK:
            setCheck( ( Expression ) newValue );
            return;
        case EJavaPackage.ASSERT_STMT__MESSAGE:
            setMessage( ( Expression ) newValue );
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
        case EJavaPackage.ASSERT_STMT__CHECK:
            setCheck( ( Expression ) null );
            return;
        case EJavaPackage.ASSERT_STMT__MESSAGE:
            setMessage( ( Expression ) null );
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
        case EJavaPackage.ASSERT_STMT__CHECK:
            return check != null;
        case EJavaPackage.ASSERT_STMT__MESSAGE:
            return message != null;
        }
        return super.eIsSet( featureID );
    }

} //AssertStmtImpl
