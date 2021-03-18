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
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.MethodReferenceExpr;
import fr.centralesupelec.csd.ejava.NodeWithIdentifier;
import fr.centralesupelec.csd.ejava.NodeWithScope;
import fr.centralesupelec.csd.ejava.NodeWithTypeArguments;
import fr.centralesupelec.csd.ejava.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Reference Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.MethodReferenceExprImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.MethodReferenceExprImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.MethodReferenceExprImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodReferenceExprImpl extends ExpressionImpl implements MethodReferenceExpr {
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
     * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentifier()
     * @generated
     * @ordered
     */
    protected static final String IDENTIFIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentifier()
     * @generated
     * @ordered
     */
    protected String identifier = IDENTIFIER_EDEFAULT;

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
    protected MethodReferenceExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.METHOD_REFERENCE_EXPR;
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
                    EJavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS );
        }
        return typeArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIdentifier() {
        return identifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIdentifier( String newIdentifier ) {
        String oldIdentifier = identifier;
        identifier = newIdentifier;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER,
                    oldIdentifier, identifier ) );
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
                    EJavaPackage.METHOD_REFERENCE_EXPR__SCOPE, oldScope, newScope );
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
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.METHOD_REFERENCE_EXPR__SCOPE, null, msgs );
            if( newScope != null )
                msgs = ( ( InternalEObject ) newScope ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.METHOD_REFERENCE_EXPR__SCOPE, null, msgs );
            msgs = basicSetScope( newScope, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.METHOD_REFERENCE_EXPR__SCOPE, newScope,
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
        case EJavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS:
            return ( ( InternalEList< ? > ) getTypeArguments() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.METHOD_REFERENCE_EXPR__SCOPE:
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
        case EJavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS:
            return getTypeArguments();
        case EJavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER:
            return getIdentifier();
        case EJavaPackage.METHOD_REFERENCE_EXPR__SCOPE:
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
        case EJavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            getTypeArguments().addAll( ( Collection< ? extends Type > ) newValue );
            return;
        case EJavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER:
            setIdentifier( ( String ) newValue );
            return;
        case EJavaPackage.METHOD_REFERENCE_EXPR__SCOPE:
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
        case EJavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            return;
        case EJavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER:
            setIdentifier( IDENTIFIER_EDEFAULT );
            return;
        case EJavaPackage.METHOD_REFERENCE_EXPR__SCOPE:
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
        case EJavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS:
            return typeArguments != null && !typeArguments.isEmpty();
        case EJavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER:
            return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals( identifier );
        case EJavaPackage.METHOD_REFERENCE_EXPR__SCOPE:
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
        if( baseClass == NodeWithTypeArguments.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS:
                return EJavaPackage.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithIdentifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER:
                return EJavaPackage.NODE_WITH_IDENTIFIER__IDENTIFIER;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithScope.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.METHOD_REFERENCE_EXPR__SCOPE:
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
        if( baseClass == NodeWithTypeArguments.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS:
                return EJavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithIdentifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_IDENTIFIER__IDENTIFIER:
                return EJavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithScope.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_SCOPE__SCOPE:
                return EJavaPackage.METHOD_REFERENCE_EXPR__SCOPE;
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
        result.append( " (identifier: " );
        result.append( identifier );
        result.append( ')' );
        return result.toString();
    }

} //MethodReferenceExprImpl
