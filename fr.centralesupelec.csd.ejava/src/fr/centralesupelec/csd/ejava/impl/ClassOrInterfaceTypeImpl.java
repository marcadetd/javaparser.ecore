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

import fr.centralesupelec.csd.ejava.AnnotationExpr;
import fr.centralesupelec.csd.ejava.ClassOrInterfaceType;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.NodeWithAnnotations;
import fr.centralesupelec.csd.ejava.NodeWithScope;
import fr.centralesupelec.csd.ejava.NodeWithSimpleName;
import fr.centralesupelec.csd.ejava.NodeWithTypeArguments;
import fr.centralesupelec.csd.ejava.SimpleName;
import fr.centralesupelec.csd.ejava.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Or Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ClassOrInterfaceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ClassOrInterfaceTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ClassOrInterfaceTypeImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ClassOrInterfaceTypeImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassOrInterfaceTypeImpl extends ReferenceTypeImpl implements ClassOrInterfaceType {
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
     * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnnotations()
     * @generated
     * @ordered
     */
    protected EList< AnnotationExpr > annotations;

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
    protected ClassOrInterfaceType scope;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassOrInterfaceTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.CLASS_OR_INTERFACE_TYPE;
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
                    EJavaPackage.CLASS_OR_INTERFACE_TYPE__NAME, oldName, newName );
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
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CLASS_OR_INTERFACE_TYPE__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CLASS_OR_INTERFACE_TYPE__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.CLASS_OR_INTERFACE_TYPE__NAME, newName,
                    newName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AnnotationExpr > getAnnotations() {
        if( annotations == null ) {
            annotations = new EObjectContainmentEList< AnnotationExpr >( AnnotationExpr.class, this,
                    EJavaPackage.CLASS_OR_INTERFACE_TYPE__ANNOTATIONS );
        }
        return annotations;
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
                    EJavaPackage.CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS );
        }
        return typeArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClassOrInterfaceType getScope() {
        return scope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetScope( ClassOrInterfaceType newScope, NotificationChain msgs ) {
        ClassOrInterfaceType oldScope = scope;
        scope = newScope;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.CLASS_OR_INTERFACE_TYPE__SCOPE, oldScope, newScope );
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
    public void setScope( ClassOrInterfaceType newScope ) {
        if( newScope != scope ) {
            NotificationChain msgs = null;
            if( scope != null )
                msgs = ( ( InternalEObject ) scope ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CLASS_OR_INTERFACE_TYPE__SCOPE, null, msgs );
            if( newScope != null )
                msgs = ( ( InternalEObject ) newScope ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CLASS_OR_INTERFACE_TYPE__SCOPE, null, msgs );
            msgs = basicSetScope( newScope, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.CLASS_OR_INTERFACE_TYPE__SCOPE,
                    newScope, newScope ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__NAME:
            return basicSetName( null, msgs );
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__ANNOTATIONS:
            return ( ( InternalEList< ? > ) getAnnotations() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS:
            return ( ( InternalEList< ? > ) getTypeArguments() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__SCOPE:
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
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__NAME:
            return getName();
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__ANNOTATIONS:
            return getAnnotations();
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS:
            return getTypeArguments();
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__SCOPE:
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
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__NAME:
            setName( ( SimpleName ) newValue );
            return;
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__ANNOTATIONS:
            getAnnotations().clear();
            getAnnotations().addAll( ( Collection< ? extends AnnotationExpr > ) newValue );
            return;
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            getTypeArguments().addAll( ( Collection< ? extends Type > ) newValue );
            return;
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__SCOPE:
            setScope( ( ClassOrInterfaceType ) newValue );
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
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__NAME:
            setName( ( SimpleName ) null );
            return;
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__ANNOTATIONS:
            getAnnotations().clear();
            return;
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            return;
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__SCOPE:
            setScope( ( ClassOrInterfaceType ) null );
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
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__NAME:
            return name != null;
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__ANNOTATIONS:
            return annotations != null && !annotations.isEmpty();
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS:
            return typeArguments != null && !typeArguments.isEmpty();
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE__SCOPE:
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
            case EJavaPackage.CLASS_OR_INTERFACE_TYPE__NAME:
                return EJavaPackage.NODE_WITH_SIMPLE_NAME__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAnnotations.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CLASS_OR_INTERFACE_TYPE__ANNOTATIONS:
                return EJavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithTypeArguments.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS:
                return EJavaPackage.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithScope.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CLASS_OR_INTERFACE_TYPE__SCOPE:
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
                return EJavaPackage.CLASS_OR_INTERFACE_TYPE__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAnnotations.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS:
                return EJavaPackage.CLASS_OR_INTERFACE_TYPE__ANNOTATIONS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithTypeArguments.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS:
                return EJavaPackage.CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithScope.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_SCOPE__SCOPE:
                return EJavaPackage.CLASS_OR_INTERFACE_TYPE__SCOPE;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //ClassOrInterfaceTypeImpl
