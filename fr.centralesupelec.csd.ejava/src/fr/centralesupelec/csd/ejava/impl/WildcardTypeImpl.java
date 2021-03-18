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
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.NodeWithAnnotations;
import fr.centralesupelec.csd.ejava.ReferenceType;
import fr.centralesupelec.csd.ejava.WildcardType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wildcard Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.WildcardTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.WildcardTypeImpl#getExtendedType <em>Extended Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.WildcardTypeImpl#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WildcardTypeImpl extends TypeImpl implements WildcardType {
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
     * The cached value of the '{@link #getExtendedType() <em>Extended Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtendedType()
     * @generated
     * @ordered
     */
    protected ReferenceType extendedType;

    /**
     * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperType()
     * @generated
     * @ordered
     */
    protected ReferenceType superType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WildcardTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.WILDCARD_TYPE;
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
                    EJavaPackage.WILDCARD_TYPE__ANNOTATIONS );
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReferenceType getExtendedType() {
        return extendedType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExtendedType( ReferenceType newExtendedType, NotificationChain msgs ) {
        ReferenceType oldExtendedType = extendedType;
        extendedType = newExtendedType;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.WILDCARD_TYPE__EXTENDED_TYPE, oldExtendedType, newExtendedType );
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
    public void setExtendedType( ReferenceType newExtendedType ) {
        if( newExtendedType != extendedType ) {
            NotificationChain msgs = null;
            if( extendedType != null )
                msgs = ( ( InternalEObject ) extendedType ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.WILDCARD_TYPE__EXTENDED_TYPE, null, msgs );
            if( newExtendedType != null )
                msgs = ( ( InternalEObject ) newExtendedType ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.WILDCARD_TYPE__EXTENDED_TYPE, null, msgs );
            msgs = basicSetExtendedType( newExtendedType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.WILDCARD_TYPE__EXTENDED_TYPE,
                    newExtendedType, newExtendedType ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReferenceType getSuperType() {
        return superType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSuperType( ReferenceType newSuperType, NotificationChain msgs ) {
        ReferenceType oldSuperType = superType;
        superType = newSuperType;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.WILDCARD_TYPE__SUPER_TYPE, oldSuperType, newSuperType );
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
    public void setSuperType( ReferenceType newSuperType ) {
        if( newSuperType != superType ) {
            NotificationChain msgs = null;
            if( superType != null )
                msgs = ( ( InternalEObject ) superType ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.WILDCARD_TYPE__SUPER_TYPE, null, msgs );
            if( newSuperType != null )
                msgs = ( ( InternalEObject ) newSuperType ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.WILDCARD_TYPE__SUPER_TYPE, null, msgs );
            msgs = basicSetSuperType( newSuperType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.WILDCARD_TYPE__SUPER_TYPE,
                    newSuperType, newSuperType ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.WILDCARD_TYPE__ANNOTATIONS:
            return ( ( InternalEList< ? > ) getAnnotations() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.WILDCARD_TYPE__EXTENDED_TYPE:
            return basicSetExtendedType( null, msgs );
        case EJavaPackage.WILDCARD_TYPE__SUPER_TYPE:
            return basicSetSuperType( null, msgs );
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
        case EJavaPackage.WILDCARD_TYPE__ANNOTATIONS:
            return getAnnotations();
        case EJavaPackage.WILDCARD_TYPE__EXTENDED_TYPE:
            return getExtendedType();
        case EJavaPackage.WILDCARD_TYPE__SUPER_TYPE:
            return getSuperType();
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
        case EJavaPackage.WILDCARD_TYPE__ANNOTATIONS:
            getAnnotations().clear();
            getAnnotations().addAll( ( Collection< ? extends AnnotationExpr > ) newValue );
            return;
        case EJavaPackage.WILDCARD_TYPE__EXTENDED_TYPE:
            setExtendedType( ( ReferenceType ) newValue );
            return;
        case EJavaPackage.WILDCARD_TYPE__SUPER_TYPE:
            setSuperType( ( ReferenceType ) newValue );
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
        case EJavaPackage.WILDCARD_TYPE__ANNOTATIONS:
            getAnnotations().clear();
            return;
        case EJavaPackage.WILDCARD_TYPE__EXTENDED_TYPE:
            setExtendedType( ( ReferenceType ) null );
            return;
        case EJavaPackage.WILDCARD_TYPE__SUPER_TYPE:
            setSuperType( ( ReferenceType ) null );
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
        case EJavaPackage.WILDCARD_TYPE__ANNOTATIONS:
            return annotations != null && !annotations.isEmpty();
        case EJavaPackage.WILDCARD_TYPE__EXTENDED_TYPE:
            return extendedType != null;
        case EJavaPackage.WILDCARD_TYPE__SUPER_TYPE:
            return superType != null;
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
        if( baseClass == NodeWithAnnotations.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.WILDCARD_TYPE__ANNOTATIONS:
                return EJavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS;
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
        if( baseClass == NodeWithAnnotations.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS:
                return EJavaPackage.WILDCARD_TYPE__ANNOTATIONS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //WildcardTypeImpl
