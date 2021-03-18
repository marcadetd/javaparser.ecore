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
import fr.centralesupelec.csd.ejava.ArrayCreationLevel;
import fr.centralesupelec.csd.ejava.Expression;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.NodeWithAnnotations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Creation Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ArrayCreationLevelImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ArrayCreationLevelImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayCreationLevelImpl extends JavaNodeImpl implements ArrayCreationLevel {
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
     * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDimension()
     * @generated
     * @ordered
     */
    protected Expression dimension;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArrayCreationLevelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.ARRAY_CREATION_LEVEL;
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
                    EJavaPackage.ARRAY_CREATION_LEVEL__ANNOTATIONS );
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getDimension() {
        return dimension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDimension( Expression newDimension, NotificationChain msgs ) {
        Expression oldDimension = dimension;
        dimension = newDimension;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.ARRAY_CREATION_LEVEL__DIMENSION, oldDimension, newDimension );
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
    public void setDimension( Expression newDimension ) {
        if( newDimension != dimension ) {
            NotificationChain msgs = null;
            if( dimension != null )
                msgs = ( ( InternalEObject ) dimension ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.ARRAY_CREATION_LEVEL__DIMENSION, null, msgs );
            if( newDimension != null )
                msgs = ( ( InternalEObject ) newDimension ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.ARRAY_CREATION_LEVEL__DIMENSION, null, msgs );
            msgs = basicSetDimension( newDimension, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.ARRAY_CREATION_LEVEL__DIMENSION,
                    newDimension, newDimension ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.ARRAY_CREATION_LEVEL__ANNOTATIONS:
            return ( ( InternalEList< ? > ) getAnnotations() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.ARRAY_CREATION_LEVEL__DIMENSION:
            return basicSetDimension( null, msgs );
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
        case EJavaPackage.ARRAY_CREATION_LEVEL__ANNOTATIONS:
            return getAnnotations();
        case EJavaPackage.ARRAY_CREATION_LEVEL__DIMENSION:
            return getDimension();
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
        case EJavaPackage.ARRAY_CREATION_LEVEL__ANNOTATIONS:
            getAnnotations().clear();
            getAnnotations().addAll( ( Collection< ? extends AnnotationExpr > ) newValue );
            return;
        case EJavaPackage.ARRAY_CREATION_LEVEL__DIMENSION:
            setDimension( ( Expression ) newValue );
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
        case EJavaPackage.ARRAY_CREATION_LEVEL__ANNOTATIONS:
            getAnnotations().clear();
            return;
        case EJavaPackage.ARRAY_CREATION_LEVEL__DIMENSION:
            setDimension( ( Expression ) null );
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
        case EJavaPackage.ARRAY_CREATION_LEVEL__ANNOTATIONS:
            return annotations != null && !annotations.isEmpty();
        case EJavaPackage.ARRAY_CREATION_LEVEL__DIMENSION:
            return dimension != null;
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
            case EJavaPackage.ARRAY_CREATION_LEVEL__ANNOTATIONS:
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
                return EJavaPackage.ARRAY_CREATION_LEVEL__ANNOTATIONS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //ArrayCreationLevelImpl
