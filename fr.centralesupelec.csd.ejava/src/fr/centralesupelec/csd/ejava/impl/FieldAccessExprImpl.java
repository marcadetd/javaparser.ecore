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
import fr.centralesupelec.csd.ejava.FieldAccessExpr;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.NodeWithScope;
import fr.centralesupelec.csd.ejava.NodeWithSimpleName;
import fr.centralesupelec.csd.ejava.NodeWithTypeArguments;
import fr.centralesupelec.csd.ejava.SimpleName;
import fr.centralesupelec.csd.ejava.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Access Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.FieldAccessExprImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.FieldAccessExprImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.FieldAccessExprImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldAccessExprImpl extends ExpressionImpl implements FieldAccessExpr {
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
     * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeArguments()
     * @generated
     * @ordered
     */
    protected EList< Type > typeArguments;

    /**
     * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected Expression scope;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FieldAccessExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.FIELD_ACCESS_EXPR;
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
                    EJavaPackage.FIELD_ACCESS_EXPR__NAME, oldName, newName );
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
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.FIELD_ACCESS_EXPR__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.FIELD_ACCESS_EXPR__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.FIELD_ACCESS_EXPR__NAME, newName,
                    newName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Type > getTypeArguments() {
        if( typeArguments == null ) {
            typeArguments = new EObjectContainmentEList< Type >( Type.class, this,
                    EJavaPackage.FIELD_ACCESS_EXPR__TYPE_ARGUMENTS );
        }
        return typeArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getScope() {
        return scope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetScope( Expression newScope, NotificationChain msgs ) {
        Expression oldScope = scope;
        scope = newScope;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.FIELD_ACCESS_EXPR__SCOPE, oldScope, newScope );
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
    public void setScope( Expression newScope ) {
        if( newScope != scope ) {
            NotificationChain msgs = null;
            if( scope != null )
                msgs = ( ( InternalEObject ) scope ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.FIELD_ACCESS_EXPR__SCOPE, null, msgs );
            if( newScope != null )
                msgs = ( ( InternalEObject ) newScope ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.FIELD_ACCESS_EXPR__SCOPE, null, msgs );
            msgs = basicSetScope( newScope, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.FIELD_ACCESS_EXPR__SCOPE, newScope,
                    newScope ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.FIELD_ACCESS_EXPR__NAME:
            return basicSetName( null, msgs );
        case EJavaPackage.FIELD_ACCESS_EXPR__TYPE_ARGUMENTS:
            return ( ( InternalEList< ? > ) getTypeArguments() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.FIELD_ACCESS_EXPR__SCOPE:
            return basicSetScope( null, msgs );
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
        case EJavaPackage.FIELD_ACCESS_EXPR__NAME:
            return getName();
        case EJavaPackage.FIELD_ACCESS_EXPR__TYPE_ARGUMENTS:
            return getTypeArguments();
        case EJavaPackage.FIELD_ACCESS_EXPR__SCOPE:
            return getScope();
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
        case EJavaPackage.FIELD_ACCESS_EXPR__NAME:
            setName( ( SimpleName ) newValue );
            return;
        case EJavaPackage.FIELD_ACCESS_EXPR__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            getTypeArguments().addAll( ( Collection< ? extends Type > ) newValue );
            return;
        case EJavaPackage.FIELD_ACCESS_EXPR__SCOPE:
            setScope( ( Expression ) newValue );
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
        case EJavaPackage.FIELD_ACCESS_EXPR__NAME:
            setName( ( SimpleName ) null );
            return;
        case EJavaPackage.FIELD_ACCESS_EXPR__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            return;
        case EJavaPackage.FIELD_ACCESS_EXPR__SCOPE:
            setScope( ( Expression ) null );
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
        case EJavaPackage.FIELD_ACCESS_EXPR__NAME:
            return name != null;
        case EJavaPackage.FIELD_ACCESS_EXPR__TYPE_ARGUMENTS:
            return typeArguments != null && !typeArguments.isEmpty();
        case EJavaPackage.FIELD_ACCESS_EXPR__SCOPE:
            return scope != null;
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
            case EJavaPackage.FIELD_ACCESS_EXPR__NAME:
                return EJavaPackage.NODE_WITH_SIMPLE_NAME__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithTypeArguments.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.FIELD_ACCESS_EXPR__TYPE_ARGUMENTS:
                return EJavaPackage.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithScope.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.FIELD_ACCESS_EXPR__SCOPE:
                return EJavaPackage.NODE_WITH_SCOPE__SCOPE;
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
                return EJavaPackage.FIELD_ACCESS_EXPR__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithTypeArguments.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS:
                return EJavaPackage.FIELD_ACCESS_EXPR__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithScope.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_SCOPE__SCOPE:
                return EJavaPackage.FIELD_ACCESS_EXPR__SCOPE;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //FieldAccessExprImpl
