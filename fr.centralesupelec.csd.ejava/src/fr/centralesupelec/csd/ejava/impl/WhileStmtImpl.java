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
import fr.centralesupelec.csd.ejava.NodeWithBody;
import fr.centralesupelec.csd.ejava.NodeWithCondition;
import fr.centralesupelec.csd.ejava.Statement;
import fr.centralesupelec.csd.ejava.WhileStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.WhileStmtImpl#getBody <em>Body</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.WhileStmtImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileStmtImpl extends StatementImpl implements WhileStmt {
    /**
     * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBody()
     * @generated
     * @ordered
     */
    protected Statement body;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WhileStmtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.WHILE_STMT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Statement getBody() {
        return body;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBody( Statement newBody, NotificationChain msgs ) {
        Statement oldBody = body;
        body = newBody;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.WHILE_STMT__BODY, oldBody, newBody );
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
    public void setBody( Statement newBody ) {
        if( newBody != body ) {
            NotificationChain msgs = null;
            if( body != null )
                msgs = ( ( InternalEObject ) body ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.WHILE_STMT__BODY, null, msgs );
            if( newBody != null )
                msgs = ( ( InternalEObject ) newBody ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.WHILE_STMT__BODY, null, msgs );
            msgs = basicSetBody( newBody, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.WHILE_STMT__BODY, newBody, newBody ) );
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
                    EJavaPackage.WHILE_STMT__CONDITION, oldCondition, newCondition );
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
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.WHILE_STMT__CONDITION, null, msgs );
            if( newCondition != null )
                msgs = ( ( InternalEObject ) newCondition ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.WHILE_STMT__CONDITION, null, msgs );
            msgs = basicSetCondition( newCondition, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.WHILE_STMT__CONDITION, newCondition,
                    newCondition ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.WHILE_STMT__BODY:
            return basicSetBody( null, msgs );
        case EJavaPackage.WHILE_STMT__CONDITION:
            return basicSetCondition( null, msgs );
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
        case EJavaPackage.WHILE_STMT__BODY:
            return getBody();
        case EJavaPackage.WHILE_STMT__CONDITION:
            return getCondition();
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
        case EJavaPackage.WHILE_STMT__BODY:
            setBody( ( Statement ) newValue );
            return;
        case EJavaPackage.WHILE_STMT__CONDITION:
            setCondition( ( Expression ) newValue );
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
        case EJavaPackage.WHILE_STMT__BODY:
            setBody( ( Statement ) null );
            return;
        case EJavaPackage.WHILE_STMT__CONDITION:
            setCondition( ( Expression ) null );
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
        case EJavaPackage.WHILE_STMT__BODY:
            return body != null;
        case EJavaPackage.WHILE_STMT__CONDITION:
            return condition != null;
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
        if( baseClass == NodeWithBody.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.WHILE_STMT__BODY:
                return EJavaPackage.NODE_WITH_BODY__BODY;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithCondition.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.WHILE_STMT__CONDITION:
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
        if( baseClass == NodeWithBody.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_BODY__BODY:
                return EJavaPackage.WHILE_STMT__BODY;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithCondition.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_CONDITION__CONDITION:
                return EJavaPackage.WHILE_STMT__CONDITION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //WhileStmtImpl
