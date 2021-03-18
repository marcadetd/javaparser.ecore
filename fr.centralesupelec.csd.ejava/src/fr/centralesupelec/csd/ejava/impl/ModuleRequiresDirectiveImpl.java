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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.ModifierKeyword;
import fr.centralesupelec.csd.ejava.ModuleRequiresDirective;
import fr.centralesupelec.csd.ejava.Name;
import fr.centralesupelec.csd.ejava.NodeWithModifiers;
import fr.centralesupelec.csd.ejava.NodeWithName;
import fr.centralesupelec.csd.ejava.NodeWithStaticModifier;
import fr.centralesupelec.csd.ejava.NodeWithTransitiveModifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Requires Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ModuleRequiresDirectiveImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ModuleRequiresDirectiveImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ModuleRequiresDirectiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ModuleRequiresDirectiveImpl#isTransitive <em>Transitive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleRequiresDirectiveImpl extends ModuleDirectiveImpl implements ModuleRequiresDirective {
    /**
     * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModifiers()
     * @generated
     * @ordered
     */
    protected EList< ModifierKeyword > modifiers;

    /**
     * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
    protected static final boolean STATIC_EDEFAULT = false;

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
     * The default value of the '{@link #isTransitive() <em>Transitive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTransitive()
     * @generated
     * @ordered
     */
    protected static final boolean TRANSITIVE_EDEFAULT = false;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleRequiresDirectiveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.MODULE_REQUIRES_DIRECTIVE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ModifierKeyword > getModifiers() {
        if( modifiers == null ) {
            modifiers = new EDataTypeUniqueEList< ModifierKeyword >( ModifierKeyword.class, this,
                    EJavaPackage.MODULE_REQUIRES_DIRECTIVE__MODIFIERS );
        }
        return modifiers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isStatic() {
        return getModifiers().contains( ModifierKeyword.STATIC );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setStatic( boolean newStatic ) {
        if( newStatic )
            getModifiers().add( ModifierKeyword.STATIC );
        else
            getModifiers().remove( ModifierKeyword.STATIC );
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
                    EJavaPackage.MODULE_REQUIRES_DIRECTIVE__NAME, oldName, newName );
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
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.MODULE_REQUIRES_DIRECTIVE__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.MODULE_REQUIRES_DIRECTIVE__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.MODULE_REQUIRES_DIRECTIVE__NAME,
                    newName, newName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isTransitive() {
        return getModifiers().contains( ModifierKeyword.TRANSITIVE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setTransitive( boolean newTransitive ) {
        if( newTransitive )
            getModifiers().add( ModifierKeyword.TRANSITIVE );
        else
            getModifiers().remove( ModifierKeyword.TRANSITIVE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__NAME:
            return basicSetName( null, msgs );
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
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__MODIFIERS:
            return getModifiers();
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__STATIC:
            return isStatic();
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__NAME:
            return getName();
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__TRANSITIVE:
            return isTransitive();
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
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__MODIFIERS:
            getModifiers().clear();
            getModifiers().addAll( ( Collection< ? extends ModifierKeyword > ) newValue );
            return;
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__STATIC:
            setStatic( ( Boolean ) newValue );
            return;
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__NAME:
            setName( ( Name ) newValue );
            return;
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__TRANSITIVE:
            setTransitive( ( Boolean ) newValue );
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
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__MODIFIERS:
            getModifiers().clear();
            return;
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__STATIC:
            setStatic( STATIC_EDEFAULT );
            return;
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__NAME:
            setName( ( Name ) null );
            return;
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__TRANSITIVE:
            setTransitive( TRANSITIVE_EDEFAULT );
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
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__MODIFIERS:
            return modifiers != null && !modifiers.isEmpty();
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__STATIC:
            return isStatic() != STATIC_EDEFAULT;
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__NAME:
            return name != null;
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__TRANSITIVE:
            return isTransitive() != TRANSITIVE_EDEFAULT;
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
        if( baseClass == NodeWithModifiers.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__MODIFIERS:
                return EJavaPackage.NODE_WITH_MODIFIERS__MODIFIERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithStaticModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__STATIC:
                return EJavaPackage.NODE_WITH_STATIC_MODIFIER__STATIC;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithName.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__NAME:
                return EJavaPackage.NODE_WITH_NAME__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithTransitiveModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.MODULE_REQUIRES_DIRECTIVE__TRANSITIVE:
                return EJavaPackage.NODE_WITH_TRANSITIVE_MODIFIER__TRANSITIVE;
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
        if( baseClass == NodeWithModifiers.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_MODIFIERS__MODIFIERS:
                return EJavaPackage.MODULE_REQUIRES_DIRECTIVE__MODIFIERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithStaticModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_STATIC_MODIFIER__STATIC:
                return EJavaPackage.MODULE_REQUIRES_DIRECTIVE__STATIC;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithName.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_NAME__NAME:
                return EJavaPackage.MODULE_REQUIRES_DIRECTIVE__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithTransitiveModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_TRANSITIVE_MODIFIER__TRANSITIVE:
                return EJavaPackage.MODULE_REQUIRES_DIRECTIVE__TRANSITIVE;
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
        result.append( " (modifiers: " );
        result.append( modifiers );
        result.append( ')' );
        return result.toString();
    }

} //ModuleRequiresDirectiveImpl
