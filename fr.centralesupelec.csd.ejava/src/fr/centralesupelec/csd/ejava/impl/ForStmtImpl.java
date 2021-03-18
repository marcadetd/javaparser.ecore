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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.csd.ejava.Expression;
import fr.centralesupelec.csd.ejava.ForStmt;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.NodeWithBody;
import fr.centralesupelec.csd.ejava.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ForStmtImpl#getBody <em>Body</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ForStmtImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ForStmtImpl#getCompare <em>Compare</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ForStmtImpl#getUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStmtImpl extends StatementImpl implements ForStmt {
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
     * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialization()
     * @generated
     * @ordered
     */
    protected EList< Expression > initialization;

    /**
     * The cached value of the '{@link #getCompare() <em>Compare</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompare()
     * @generated
     * @ordered
     */
    protected Expression compare;

    /**
     * The cached value of the '{@link #getUpdate() <em>Update</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdate()
     * @generated
     * @ordered
     */
    protected EList< Expression > update;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ForStmtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.FOR_STMT;
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, EJavaPackage.FOR_STMT__BODY,
                    oldBody, newBody );
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
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.FOR_STMT__BODY, null, msgs );
            if( newBody != null )
                msgs = ( ( InternalEObject ) newBody ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.FOR_STMT__BODY, null, msgs );
            msgs = basicSetBody( newBody, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.FOR_STMT__BODY, newBody, newBody ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Expression > getInitialization() {
        if( initialization == null ) {
            initialization = new EObjectContainmentEList< Expression >( Expression.class, this,
                    EJavaPackage.FOR_STMT__INITIALIZATION );
        }
        return initialization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getCompare() {
        return compare;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCompare( Expression newCompare, NotificationChain msgs ) {
        Expression oldCompare = compare;
        compare = newCompare;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.FOR_STMT__COMPARE, oldCompare, newCompare );
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
    public void setCompare( Expression newCompare ) {
        if( newCompare != compare ) {
            NotificationChain msgs = null;
            if( compare != null )
                msgs = ( ( InternalEObject ) compare ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.FOR_STMT__COMPARE, null, msgs );
            if( newCompare != null )
                msgs = ( ( InternalEObject ) newCompare ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.FOR_STMT__COMPARE, null, msgs );
            msgs = basicSetCompare( newCompare, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.FOR_STMT__COMPARE, newCompare,
                    newCompare ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Expression > getUpdate() {
        if( update == null ) {
            update = new EObjectContainmentEList< Expression >( Expression.class, this, EJavaPackage.FOR_STMT__UPDATE );
        }
        return update;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.FOR_STMT__BODY:
            return basicSetBody( null, msgs );
        case EJavaPackage.FOR_STMT__INITIALIZATION:
            return ( ( InternalEList< ? > ) getInitialization() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.FOR_STMT__COMPARE:
            return basicSetCompare( null, msgs );
        case EJavaPackage.FOR_STMT__UPDATE:
            return ( ( InternalEList< ? > ) getUpdate() ).basicRemove( otherEnd, msgs );
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
        case EJavaPackage.FOR_STMT__BODY:
            return getBody();
        case EJavaPackage.FOR_STMT__INITIALIZATION:
            return getInitialization();
        case EJavaPackage.FOR_STMT__COMPARE:
            return getCompare();
        case EJavaPackage.FOR_STMT__UPDATE:
            return getUpdate();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case EJavaPackage.FOR_STMT__BODY:
            setBody( ( Statement ) newValue );
            return;
        case EJavaPackage.FOR_STMT__INITIALIZATION:
            getInitialization().clear();
            getInitialization().addAll( ( Collection< ? extends Expression > ) newValue );
            return;
        case EJavaPackage.FOR_STMT__COMPARE:
            setCompare( ( Expression ) newValue );
            return;
        case EJavaPackage.FOR_STMT__UPDATE:
            getUpdate().clear();
            getUpdate().addAll( ( Collection< ? extends Expression > ) newValue );
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
        case EJavaPackage.FOR_STMT__BODY:
            setBody( ( Statement ) null );
            return;
        case EJavaPackage.FOR_STMT__INITIALIZATION:
            getInitialization().clear();
            return;
        case EJavaPackage.FOR_STMT__COMPARE:
            setCompare( ( Expression ) null );
            return;
        case EJavaPackage.FOR_STMT__UPDATE:
            getUpdate().clear();
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
        case EJavaPackage.FOR_STMT__BODY:
            return body != null;
        case EJavaPackage.FOR_STMT__INITIALIZATION:
            return initialization != null && !initialization.isEmpty();
        case EJavaPackage.FOR_STMT__COMPARE:
            return compare != null;
        case EJavaPackage.FOR_STMT__UPDATE:
            return update != null && !update.isEmpty();
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
            case EJavaPackage.FOR_STMT__BODY:
                return EJavaPackage.NODE_WITH_BODY__BODY;
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
                return EJavaPackage.FOR_STMT__BODY;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //ForStmtImpl
