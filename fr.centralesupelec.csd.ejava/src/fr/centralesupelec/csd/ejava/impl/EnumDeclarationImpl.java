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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.csd.ejava.ClassOrInterfaceType;
import fr.centralesupelec.csd.ejava.EnumConstantDeclaration;
import fr.centralesupelec.csd.ejava.EnumDeclaration;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.NodeWithImplements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.EnumDeclarationImpl#getImplementedTypes <em>Implemented Types</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.EnumDeclarationImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumDeclarationImpl extends TypeDeclarationImpl implements EnumDeclaration {
    /**
     * The cached value of the '{@link #getImplementedTypes() <em>Implemented Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementedTypes()
     * @generated
     * @ordered
     */
    protected EList< ClassOrInterfaceType > implementedTypes;

    /**
     * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntries()
     * @generated
     * @ordered
     */
    protected EList< EnumConstantDeclaration > entries;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.ENUM_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ClassOrInterfaceType > getImplementedTypes() {
        if( implementedTypes == null ) {
            implementedTypes = new EObjectContainmentEList< ClassOrInterfaceType >( ClassOrInterfaceType.class, this,
                    EJavaPackage.ENUM_DECLARATION__IMPLEMENTED_TYPES );
        }
        return implementedTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EnumConstantDeclaration > getEntries() {
        if( entries == null ) {
            entries = new EObjectContainmentEList< EnumConstantDeclaration >( EnumConstantDeclaration.class, this,
                    EJavaPackage.ENUM_DECLARATION__ENTRIES );
        }
        return entries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.ENUM_DECLARATION__IMPLEMENTED_TYPES:
            return ( ( InternalEList< ? > ) getImplementedTypes() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.ENUM_DECLARATION__ENTRIES:
            return ( ( InternalEList< ? > ) getEntries() ).basicRemove( otherEnd, msgs );
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
        case EJavaPackage.ENUM_DECLARATION__IMPLEMENTED_TYPES:
            return getImplementedTypes();
        case EJavaPackage.ENUM_DECLARATION__ENTRIES:
            return getEntries();
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
        case EJavaPackage.ENUM_DECLARATION__IMPLEMENTED_TYPES:
            getImplementedTypes().clear();
            getImplementedTypes().addAll( ( Collection< ? extends ClassOrInterfaceType > ) newValue );
            return;
        case EJavaPackage.ENUM_DECLARATION__ENTRIES:
            getEntries().clear();
            getEntries().addAll( ( Collection< ? extends EnumConstantDeclaration > ) newValue );
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
        case EJavaPackage.ENUM_DECLARATION__IMPLEMENTED_TYPES:
            getImplementedTypes().clear();
            return;
        case EJavaPackage.ENUM_DECLARATION__ENTRIES:
            getEntries().clear();
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
        case EJavaPackage.ENUM_DECLARATION__IMPLEMENTED_TYPES:
            return implementedTypes != null && !implementedTypes.isEmpty();
        case EJavaPackage.ENUM_DECLARATION__ENTRIES:
            return entries != null && !entries.isEmpty();
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
        if( baseClass == NodeWithImplements.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.ENUM_DECLARATION__IMPLEMENTED_TYPES:
                return EJavaPackage.NODE_WITH_IMPLEMENTS__IMPLEMENTED_TYPES;
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
        if( baseClass == NodeWithImplements.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_IMPLEMENTS__IMPLEMENTED_TYPES:
                return EJavaPackage.ENUM_DECLARATION__IMPLEMENTED_TYPES;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //EnumDeclarationImpl
