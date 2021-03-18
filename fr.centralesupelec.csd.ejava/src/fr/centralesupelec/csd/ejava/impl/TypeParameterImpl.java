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
import fr.centralesupelec.csd.ejava.NodeWithSimpleName;
import fr.centralesupelec.csd.ejava.SimpleName;
import fr.centralesupelec.csd.ejava.TypeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.TypeParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.TypeParameterImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.TypeParameterImpl#getTypeBound <em>Type Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameterImpl extends ReferenceTypeImpl implements TypeParameter {
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
     * The cached value of the '{@link #getTypeBound() <em>Type Bound</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeBound()
     * @generated
     * @ordered
     */
    protected EList< ClassOrInterfaceType > typeBound;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.TYPE_PARAMETER;
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
                    EJavaPackage.TYPE_PARAMETER__NAME, oldName, newName );
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
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.TYPE_PARAMETER__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.TYPE_PARAMETER__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.TYPE_PARAMETER__NAME, newName,
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
                    EJavaPackage.TYPE_PARAMETER__ANNOTATIONS );
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ClassOrInterfaceType > getTypeBound() {
        if( typeBound == null ) {
            typeBound = new EObjectContainmentEList< ClassOrInterfaceType >( ClassOrInterfaceType.class, this,
                    EJavaPackage.TYPE_PARAMETER__TYPE_BOUND );
        }
        return typeBound;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.TYPE_PARAMETER__NAME:
            return basicSetName( null, msgs );
        case EJavaPackage.TYPE_PARAMETER__ANNOTATIONS:
            return ( ( InternalEList< ? > ) getAnnotations() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.TYPE_PARAMETER__TYPE_BOUND:
            return ( ( InternalEList< ? > ) getTypeBound() ).basicRemove( otherEnd, msgs );
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
        case EJavaPackage.TYPE_PARAMETER__NAME:
            return getName();
        case EJavaPackage.TYPE_PARAMETER__ANNOTATIONS:
            return getAnnotations();
        case EJavaPackage.TYPE_PARAMETER__TYPE_BOUND:
            return getTypeBound();
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
        case EJavaPackage.TYPE_PARAMETER__NAME:
            setName( ( SimpleName ) newValue );
            return;
        case EJavaPackage.TYPE_PARAMETER__ANNOTATIONS:
            getAnnotations().clear();
            getAnnotations().addAll( ( Collection< ? extends AnnotationExpr > ) newValue );
            return;
        case EJavaPackage.TYPE_PARAMETER__TYPE_BOUND:
            getTypeBound().clear();
            getTypeBound().addAll( ( Collection< ? extends ClassOrInterfaceType > ) newValue );
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
        case EJavaPackage.TYPE_PARAMETER__NAME:
            setName( ( SimpleName ) null );
            return;
        case EJavaPackage.TYPE_PARAMETER__ANNOTATIONS:
            getAnnotations().clear();
            return;
        case EJavaPackage.TYPE_PARAMETER__TYPE_BOUND:
            getTypeBound().clear();
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
        case EJavaPackage.TYPE_PARAMETER__NAME:
            return name != null;
        case EJavaPackage.TYPE_PARAMETER__ANNOTATIONS:
            return annotations != null && !annotations.isEmpty();
        case EJavaPackage.TYPE_PARAMETER__TYPE_BOUND:
            return typeBound != null && !typeBound.isEmpty();
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
            case EJavaPackage.TYPE_PARAMETER__NAME:
                return EJavaPackage.NODE_WITH_SIMPLE_NAME__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAnnotations.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.TYPE_PARAMETER__ANNOTATIONS:
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
        if( baseClass == NodeWithSimpleName.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_SIMPLE_NAME__NAME:
                return EJavaPackage.TYPE_PARAMETER__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAnnotations.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS:
                return EJavaPackage.TYPE_PARAMETER__ANNOTATIONS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //TypeParameterImpl
