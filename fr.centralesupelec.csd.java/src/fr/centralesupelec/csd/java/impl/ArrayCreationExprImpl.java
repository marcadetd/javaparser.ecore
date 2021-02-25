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
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.ArrayCreationExpr;
import fr.centralesupelec.csd.java.ArrayCreationLevel;
import fr.centralesupelec.csd.java.ArrayInitializerExpr;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Creation Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ArrayCreationExprImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ArrayCreationExprImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ArrayCreationExprImpl#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayCreationExprImpl extends ExpressionImpl implements ArrayCreationExpr {
    /**
     * The cached value of the '{@link #getLevels() <em>Levels</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLevels()
     * @generated
     * @ordered
     */
    protected EList< ArrayCreationLevel > levels;

    /**
     * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementType()
     * @generated
     * @ordered
     */
    protected Type elementType;

    /**
     * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitializer()
     * @generated
     * @ordered
     */
    protected ArrayInitializerExpr initializer;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArrayCreationExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JavaPackage.Literals.ARRAY_CREATION_EXPR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ArrayCreationLevel > getLevels() {
        if( levels == null ) {
            levels = new EObjectContainmentEList< ArrayCreationLevel >( ArrayCreationLevel.class, this,
                    JavaPackage.ARRAY_CREATION_EXPR__LEVELS );
        }
        return levels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getElementType() {
        if( elementType != null && elementType.eIsProxy() ) {
            InternalEObject oldElementType = ( InternalEObject ) elementType;
            elementType = ( Type ) eResolveProxy( oldElementType );
            if( elementType != oldElementType ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            JavaPackage.ARRAY_CREATION_EXPR__ELEMENT_TYPE, oldElementType, elementType ) );
            }
        }
        return elementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Type basicGetElementType() {
        return elementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setElementType( Type newElementType ) {
        Type oldElementType = elementType;
        elementType = newElementType;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.ARRAY_CREATION_EXPR__ELEMENT_TYPE,
                    oldElementType, elementType ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArrayInitializerExpr getInitializer() {
        return initializer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitializer( ArrayInitializerExpr newInitializer, NotificationChain msgs ) {
        ArrayInitializerExpr oldInitializer = initializer;
        initializer = newInitializer;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.ARRAY_CREATION_EXPR__INITIALIZER, oldInitializer, newInitializer );
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
    public void setInitializer( ArrayInitializerExpr newInitializer ) {
        if( newInitializer != initializer ) {
            NotificationChain msgs = null;
            if( initializer != null )
                msgs = ( ( InternalEObject ) initializer ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.ARRAY_CREATION_EXPR__INITIALIZER, null, msgs );
            if( newInitializer != null )
                msgs = ( ( InternalEObject ) newInitializer ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.ARRAY_CREATION_EXPR__INITIALIZER, null, msgs );
            msgs = basicSetInitializer( newInitializer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.ARRAY_CREATION_EXPR__INITIALIZER,
                    newInitializer, newInitializer ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case JavaPackage.ARRAY_CREATION_EXPR__LEVELS:
            return ( ( InternalEList< ? > ) getLevels() ).basicRemove( otherEnd, msgs );
        case JavaPackage.ARRAY_CREATION_EXPR__INITIALIZER:
            return basicSetInitializer( null, msgs );
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
        case JavaPackage.ARRAY_CREATION_EXPR__LEVELS:
            return getLevels();
        case JavaPackage.ARRAY_CREATION_EXPR__ELEMENT_TYPE:
            if( resolve ) return getElementType();
            return basicGetElementType();
        case JavaPackage.ARRAY_CREATION_EXPR__INITIALIZER:
            return getInitializer();
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
        case JavaPackage.ARRAY_CREATION_EXPR__LEVELS:
            getLevels().clear();
            getLevels().addAll( ( Collection< ? extends ArrayCreationLevel > ) newValue );
            return;
        case JavaPackage.ARRAY_CREATION_EXPR__ELEMENT_TYPE:
            setElementType( ( Type ) newValue );
            return;
        case JavaPackage.ARRAY_CREATION_EXPR__INITIALIZER:
            setInitializer( ( ArrayInitializerExpr ) newValue );
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
        case JavaPackage.ARRAY_CREATION_EXPR__LEVELS:
            getLevels().clear();
            return;
        case JavaPackage.ARRAY_CREATION_EXPR__ELEMENT_TYPE:
            setElementType( ( Type ) null );
            return;
        case JavaPackage.ARRAY_CREATION_EXPR__INITIALIZER:
            setInitializer( ( ArrayInitializerExpr ) null );
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
        case JavaPackage.ARRAY_CREATION_EXPR__LEVELS:
            return levels != null && !levels.isEmpty();
        case JavaPackage.ARRAY_CREATION_EXPR__ELEMENT_TYPE:
            return elementType != null;
        case JavaPackage.ARRAY_CREATION_EXPR__INITIALIZER:
            return initializer != null;
        }
        return super.eIsSet( featureID );
    }

} //ArrayCreationExprImpl
