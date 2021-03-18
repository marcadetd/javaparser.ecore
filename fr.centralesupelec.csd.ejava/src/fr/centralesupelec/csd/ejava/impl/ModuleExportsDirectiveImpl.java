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

import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.ModuleExportsDirective;
import fr.centralesupelec.csd.ejava.Name;
import fr.centralesupelec.csd.ejava.NodeWithName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Exports Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ModuleExportsDirectiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ModuleExportsDirectiveImpl#getModuleNames <em>Module Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleExportsDirectiveImpl extends ModuleDirectiveImpl implements ModuleExportsDirective {
    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected Name name;

    /**
     * The cached value of the '{@link #getModuleNames() <em>Module Names</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModuleNames()
     * @generated
     * @ordered
     */
    protected EList< Name > moduleNames;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleExportsDirectiveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.MODULE_EXPORTS_DIRECTIVE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Name getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetName( Name newName, NotificationChain msgs ) {
        Name oldName = name;
        name = newName;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.MODULE_EXPORTS_DIRECTIVE__NAME, oldName, newName );
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
    public void setName( Name newName ) {
        if( newName != name ) {
            NotificationChain msgs = null;
            if( name != null )
                msgs = ( ( InternalEObject ) name ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.MODULE_EXPORTS_DIRECTIVE__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.MODULE_EXPORTS_DIRECTIVE__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.MODULE_EXPORTS_DIRECTIVE__NAME,
                    newName, newName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Name > getModuleNames() {
        if( moduleNames == null ) {
            moduleNames = new EObjectContainmentEList< Name >( Name.class, this,
                    EJavaPackage.MODULE_EXPORTS_DIRECTIVE__MODULE_NAMES );
        }
        return moduleNames;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.MODULE_EXPORTS_DIRECTIVE__NAME:
            return basicSetName( null, msgs );
        case EJavaPackage.MODULE_EXPORTS_DIRECTIVE__MODULE_NAMES:
            return ( ( InternalEList< ? > ) getModuleNames() ).basicRemove( otherEnd, msgs );
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
        case EJavaPackage.MODULE_EXPORTS_DIRECTIVE__NAME:
            return getName();
        case EJavaPackage.MODULE_EXPORTS_DIRECTIVE__MODULE_NAMES:
            return getModuleNames();
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
        case EJavaPackage.MODULE_EXPORTS_DIRECTIVE__NAME:
            setName( ( Name ) newValue );
            return;
        case EJavaPackage.MODULE_EXPORTS_DIRECTIVE__MODULE_NAMES:
            getModuleNames().clear();
            getModuleNames().addAll( ( Collection< ? extends Name > ) newValue );
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
        case EJavaPackage.MODULE_EXPORTS_DIRECTIVE__NAME:
            setName( ( Name ) null );
            return;
        case EJavaPackage.MODULE_EXPORTS_DIRECTIVE__MODULE_NAMES:
            getModuleNames().clear();
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
        case EJavaPackage.MODULE_EXPORTS_DIRECTIVE__NAME:
            return name != null;
        case EJavaPackage.MODULE_EXPORTS_DIRECTIVE__MODULE_NAMES:
            return moduleNames != null && !moduleNames.isEmpty();
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
        if( baseClass == NodeWithName.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.MODULE_EXPORTS_DIRECTIVE__NAME:
                return EJavaPackage.NODE_WITH_NAME__NAME;
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
        if( baseClass == NodeWithName.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_NAME__NAME:
                return EJavaPackage.MODULE_EXPORTS_DIRECTIVE__NAME;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //ModuleExportsDirectiveImpl
