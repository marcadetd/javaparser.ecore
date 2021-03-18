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

import fr.centralesupelec.csd.ejava.BlockStmt;
import fr.centralesupelec.csd.ejava.ConstructorDeclaration;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.NodeWithBlockStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ConstructorDeclarationImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorDeclarationImpl extends CallableDeclarationImpl implements ConstructorDeclaration {
    /**
     * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBody()
     * @generated
     * @ordered
     */
    protected BlockStmt body;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConstructorDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.CONSTRUCTOR_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BlockStmt getBody() {
        return body;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBody( BlockStmt newBody, NotificationChain msgs ) {
        BlockStmt oldBody = body;
        body = newBody;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.CONSTRUCTOR_DECLARATION__BODY, oldBody, newBody );
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
    public void setBody( BlockStmt newBody ) {
        if( newBody != body ) {
            NotificationChain msgs = null;
            if( body != null )
                msgs = ( ( InternalEObject ) body ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CONSTRUCTOR_DECLARATION__BODY, null, msgs );
            if( newBody != null )
                msgs = ( ( InternalEObject ) newBody ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CONSTRUCTOR_DECLARATION__BODY, null, msgs );
            msgs = basicSetBody( newBody, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.CONSTRUCTOR_DECLARATION__BODY, newBody,
                    newBody ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.CONSTRUCTOR_DECLARATION__BODY:
            return basicSetBody( null, msgs );
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
        case EJavaPackage.CONSTRUCTOR_DECLARATION__BODY:
            return getBody();
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
        case EJavaPackage.CONSTRUCTOR_DECLARATION__BODY:
            setBody( ( BlockStmt ) newValue );
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
        case EJavaPackage.CONSTRUCTOR_DECLARATION__BODY:
            setBody( ( BlockStmt ) null );
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
        case EJavaPackage.CONSTRUCTOR_DECLARATION__BODY:
            return body != null;
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
        if( baseClass == NodeWithBlockStmt.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CONSTRUCTOR_DECLARATION__BODY:
                return EJavaPackage.NODE_WITH_BLOCK_STMT__BODY;
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
        if( baseClass == NodeWithBlockStmt.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_BLOCK_STMT__BODY:
                return EJavaPackage.CONSTRUCTOR_DECLARATION__BODY;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //ConstructorDeclarationImpl
