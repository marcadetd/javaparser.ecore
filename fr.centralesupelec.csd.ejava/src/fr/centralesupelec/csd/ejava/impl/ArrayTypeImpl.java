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
import fr.centralesupelec.csd.ejava.ArrayType;
import fr.centralesupelec.csd.ejava.ArrayTypeOrigin;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.NodeWithAnnotations;
import fr.centralesupelec.csd.ejava.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ArrayTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ArrayTypeImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ArrayTypeImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTypeImpl extends ReferenceTypeImpl implements ArrayType {
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
     * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponentType()
     * @generated
     * @ordered
     */
    protected Type componentType;

    /**
     * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrigin()
     * @generated
     * @ordered
     */
    protected static final ArrayTypeOrigin ORIGIN_EDEFAULT = ArrayTypeOrigin.NAME;

    /**
     * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrigin()
     * @generated
     * @ordered
     */
    protected ArrayTypeOrigin origin = ORIGIN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArrayTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.ARRAY_TYPE;
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
                    EJavaPackage.ARRAY_TYPE__ANNOTATIONS );
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getComponentType() {
        return componentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetComponentType( Type newComponentType, NotificationChain msgs ) {
        Type oldComponentType = componentType;
        componentType = newComponentType;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.ARRAY_TYPE__COMPONENT_TYPE, oldComponentType, newComponentType );
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
    public void setComponentType( Type newComponentType ) {
        if( newComponentType != componentType ) {
            NotificationChain msgs = null;
            if( componentType != null )
                msgs = ( ( InternalEObject ) componentType ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.ARRAY_TYPE__COMPONENT_TYPE, null, msgs );
            if( newComponentType != null )
                msgs = ( ( InternalEObject ) newComponentType ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.ARRAY_TYPE__COMPONENT_TYPE, null, msgs );
            msgs = basicSetComponentType( newComponentType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.ARRAY_TYPE__COMPONENT_TYPE,
                    newComponentType, newComponentType ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArrayTypeOrigin getOrigin() {
        return origin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOrigin( ArrayTypeOrigin newOrigin ) {
        ArrayTypeOrigin oldOrigin = origin;
        origin = newOrigin == null ? ORIGIN_EDEFAULT : newOrigin;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.ARRAY_TYPE__ORIGIN, oldOrigin,
                    origin ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.ARRAY_TYPE__ANNOTATIONS:
            return ( ( InternalEList< ? > ) getAnnotations() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.ARRAY_TYPE__COMPONENT_TYPE:
            return basicSetComponentType( null, msgs );
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
        case EJavaPackage.ARRAY_TYPE__ANNOTATIONS:
            return getAnnotations();
        case EJavaPackage.ARRAY_TYPE__COMPONENT_TYPE:
            return getComponentType();
        case EJavaPackage.ARRAY_TYPE__ORIGIN:
            return getOrigin();
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
        case EJavaPackage.ARRAY_TYPE__ANNOTATIONS:
            getAnnotations().clear();
            getAnnotations().addAll( ( Collection< ? extends AnnotationExpr > ) newValue );
            return;
        case EJavaPackage.ARRAY_TYPE__COMPONENT_TYPE:
            setComponentType( ( Type ) newValue );
            return;
        case EJavaPackage.ARRAY_TYPE__ORIGIN:
            setOrigin( ( ArrayTypeOrigin ) newValue );
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
        case EJavaPackage.ARRAY_TYPE__ANNOTATIONS:
            getAnnotations().clear();
            return;
        case EJavaPackage.ARRAY_TYPE__COMPONENT_TYPE:
            setComponentType( ( Type ) null );
            return;
        case EJavaPackage.ARRAY_TYPE__ORIGIN:
            setOrigin( ORIGIN_EDEFAULT );
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
        case EJavaPackage.ARRAY_TYPE__ANNOTATIONS:
            return annotations != null && !annotations.isEmpty();
        case EJavaPackage.ARRAY_TYPE__COMPONENT_TYPE:
            return componentType != null;
        case EJavaPackage.ARRAY_TYPE__ORIGIN:
            return origin != ORIGIN_EDEFAULT;
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
            case EJavaPackage.ARRAY_TYPE__ANNOTATIONS:
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
                return EJavaPackage.ARRAY_TYPE__ANNOTATIONS;
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
        result.append( " (origin: " );
        result.append( origin );
        result.append( ')' );
        return result.toString();
    }

} //ArrayTypeImpl
