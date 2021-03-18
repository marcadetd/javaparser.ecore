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

import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.NodeWithSimpleName;
import fr.centralesupelec.csd.ejava.NodeWithType;
import fr.centralesupelec.csd.ejava.PatternExpr;
import fr.centralesupelec.csd.ejava.ReferenceType;
import fr.centralesupelec.csd.ejava.SimpleName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.PatternExprImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.PatternExprImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternExprImpl extends ExpressionImpl implements PatternExpr {
    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected SimpleName name;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ReferenceType type;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PatternExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.PATTERN_EXPR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SimpleName getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetName( SimpleName newName, NotificationChain msgs ) {
        SimpleName oldName = name;
        name = newName;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.PATTERN_EXPR__NAME, oldName, newName );
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
    public void setName( SimpleName newName ) {
        if( newName != name ) {
            NotificationChain msgs = null;
            if( name != null )
                msgs = ( ( InternalEObject ) name ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.PATTERN_EXPR__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.PATTERN_EXPR__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.PATTERN_EXPR__NAME, newName,
                    newName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReferenceType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType( ReferenceType newType, NotificationChain msgs ) {
        ReferenceType oldType = type;
        type = newType;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.PATTERN_EXPR__TYPE, oldType, newType );
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
    public void setType( ReferenceType newType ) {
        if( newType != type ) {
            NotificationChain msgs = null;
            if( type != null )
                msgs = ( ( InternalEObject ) type ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.PATTERN_EXPR__TYPE, null, msgs );
            if( newType != null )
                msgs = ( ( InternalEObject ) newType ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.PATTERN_EXPR__TYPE, null, msgs );
            msgs = basicSetType( newType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.PATTERN_EXPR__TYPE, newType,
                    newType ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.PATTERN_EXPR__NAME:
            return basicSetName( null, msgs );
        case EJavaPackage.PATTERN_EXPR__TYPE:
            return basicSetType( null, msgs );
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
        case EJavaPackage.PATTERN_EXPR__NAME:
            return getName();
        case EJavaPackage.PATTERN_EXPR__TYPE:
            return getType();
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
        case EJavaPackage.PATTERN_EXPR__NAME:
            setName( ( SimpleName ) newValue );
            return;
        case EJavaPackage.PATTERN_EXPR__TYPE:
            setType( ( ReferenceType ) newValue );
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
        case EJavaPackage.PATTERN_EXPR__NAME:
            setName( ( SimpleName ) null );
            return;
        case EJavaPackage.PATTERN_EXPR__TYPE:
            setType( ( ReferenceType ) null );
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
        case EJavaPackage.PATTERN_EXPR__NAME:
            return name != null;
        case EJavaPackage.PATTERN_EXPR__TYPE:
            return type != null;
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
        if( baseClass == NodeWithSimpleName.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.PATTERN_EXPR__NAME:
                return EJavaPackage.NODE_WITH_SIMPLE_NAME__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithType.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.PATTERN_EXPR__TYPE:
                return EJavaPackage.NODE_WITH_TYPE__TYPE;
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
        if( baseClass == NodeWithSimpleName.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_SIMPLE_NAME__NAME:
                return EJavaPackage.PATTERN_EXPR__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithType.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_TYPE__TYPE:
                return EJavaPackage.PATTERN_EXPR__TYPE;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //PatternExprImpl
