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
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.ClassOrInterfaceDeclaration;
import fr.centralesupelec.csd.java.ClassOrInterfaceType;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.ModifierKeyword;
import fr.centralesupelec.csd.java.NodeWithAbstractModifier;
import fr.centralesupelec.csd.java.NodeWithExtends;
import fr.centralesupelec.csd.java.NodeWithFinalModifier;
import fr.centralesupelec.csd.java.NodeWithImplements;
import fr.centralesupelec.csd.java.NodeWithTypeParameters;
import fr.centralesupelec.csd.java.TypeParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Or Interface Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ClassOrInterfaceDeclarationImpl#getImplementedTypes <em>Implemented Types</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ClassOrInterfaceDeclarationImpl#getExtendedTypes <em>Extended Types</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ClassOrInterfaceDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ClassOrInterfaceDeclarationImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ClassOrInterfaceDeclarationImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ClassOrInterfaceDeclarationImpl#isInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassOrInterfaceDeclarationImpl extends TypeDeclarationImpl implements ClassOrInterfaceDeclaration {
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
     * The cached value of the '{@link #getExtendedTypes() <em>Extended Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtendedTypes()
     * @generated
     * @ordered
     */
    protected EList< ClassOrInterfaceType > extendedTypes;

    /**
     * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeParameters()
     * @generated
     * @ordered
     */
    protected EList< TypeParameter > typeParameters;

    /**
     * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
    protected static final boolean ABSTRACT_EDEFAULT = false;

    /**
     * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFinal()
     * @generated
     * @ordered
     */
    protected static final boolean FINAL_EDEFAULT = false;

    /**
     * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInterface()
     * @generated
     * @ordered
     */
    protected static final boolean INTERFACE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInterface()
     * @generated
     * @ordered
     */
    protected boolean interface_ = INTERFACE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassOrInterfaceDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JavaPackage.Literals.CLASS_OR_INTERFACE_DECLARATION;
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
                    JavaPackage.CLASS_OR_INTERFACE_DECLARATION__IMPLEMENTED_TYPES );
        }
        return implementedTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ClassOrInterfaceType > getExtendedTypes() {
        if( extendedTypes == null ) {
            extendedTypes = new EObjectContainmentEList< ClassOrInterfaceType >( ClassOrInterfaceType.class, this,
                    JavaPackage.CLASS_OR_INTERFACE_DECLARATION__EXTENDED_TYPES );
        }
        return extendedTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TypeParameter > getTypeParameters() {
        if( typeParameters == null ) {
            typeParameters = new EObjectContainmentEList< TypeParameter >( TypeParameter.class, this,
                    JavaPackage.CLASS_OR_INTERFACE_DECLARATION__TYPE_PARAMETERS );
        }
        return typeParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isAbstract() {
        return getModifiers().contains( ModifierKeyword.ABSTRACT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setAbstract( boolean newAbstract ) {
        if( newAbstract )
            getModifiers().add( ModifierKeyword.ABSTRACT );
        else
            getModifiers().remove( ModifierKeyword.ABSTRACT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isFinal() {
        return getModifiers().contains( ModifierKeyword.FINAL );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setFinal( boolean newFinal ) {
        if( newFinal )
            getModifiers().add( ModifierKeyword.FINAL );
        else
            getModifiers().remove( ModifierKeyword.FINAL );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isInterface() {
        return interface_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInterface( boolean newInterface ) {
        boolean oldInterface = interface_;
        interface_ = newInterface;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    JavaPackage.CLASS_OR_INTERFACE_DECLARATION__INTERFACE, oldInterface, interface_ ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__IMPLEMENTED_TYPES:
            return ( ( InternalEList< ? > ) getImplementedTypes() ).basicRemove( otherEnd, msgs );
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__EXTENDED_TYPES:
            return ( ( InternalEList< ? > ) getExtendedTypes() ).basicRemove( otherEnd, msgs );
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__TYPE_PARAMETERS:
            return ( ( InternalEList< ? > ) getTypeParameters() ).basicRemove( otherEnd, msgs );
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
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__IMPLEMENTED_TYPES:
            return getImplementedTypes();
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__EXTENDED_TYPES:
            return getExtendedTypes();
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__TYPE_PARAMETERS:
            return getTypeParameters();
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__ABSTRACT:
            return isAbstract();
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__FINAL:
            return isFinal();
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__INTERFACE:
            return isInterface();
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
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__IMPLEMENTED_TYPES:
            getImplementedTypes().clear();
            getImplementedTypes().addAll( ( Collection< ? extends ClassOrInterfaceType > ) newValue );
            return;
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__EXTENDED_TYPES:
            getExtendedTypes().clear();
            getExtendedTypes().addAll( ( Collection< ? extends ClassOrInterfaceType > ) newValue );
            return;
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__TYPE_PARAMETERS:
            getTypeParameters().clear();
            getTypeParameters().addAll( ( Collection< ? extends TypeParameter > ) newValue );
            return;
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__ABSTRACT:
            setAbstract( ( Boolean ) newValue );
            return;
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__FINAL:
            setFinal( ( Boolean ) newValue );
            return;
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__INTERFACE:
            setInterface( ( Boolean ) newValue );
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
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__IMPLEMENTED_TYPES:
            getImplementedTypes().clear();
            return;
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__EXTENDED_TYPES:
            getExtendedTypes().clear();
            return;
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__TYPE_PARAMETERS:
            getTypeParameters().clear();
            return;
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__ABSTRACT:
            setAbstract( ABSTRACT_EDEFAULT );
            return;
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__FINAL:
            setFinal( FINAL_EDEFAULT );
            return;
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__INTERFACE:
            setInterface( INTERFACE_EDEFAULT );
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
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__IMPLEMENTED_TYPES:
            return implementedTypes != null && !implementedTypes.isEmpty();
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__EXTENDED_TYPES:
            return extendedTypes != null && !extendedTypes.isEmpty();
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__TYPE_PARAMETERS:
            return typeParameters != null && !typeParameters.isEmpty();
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__ABSTRACT:
            return isAbstract() != ABSTRACT_EDEFAULT;
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__FINAL:
            return isFinal() != FINAL_EDEFAULT;
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__INTERFACE:
            return interface_ != INTERFACE_EDEFAULT;
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
            case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__IMPLEMENTED_TYPES:
                return JavaPackage.NODE_WITH_IMPLEMENTS__IMPLEMENTED_TYPES;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithExtends.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__EXTENDED_TYPES:
                return JavaPackage.NODE_WITH_EXTENDS__EXTENDED_TYPES;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithTypeParameters.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__TYPE_PARAMETERS:
                return JavaPackage.NODE_WITH_TYPE_PARAMETERS__TYPE_PARAMETERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAbstractModifier.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__ABSTRACT:
                return JavaPackage.NODE_WITH_ABSTRACT_MODIFIER__ABSTRACT;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithFinalModifier.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.CLASS_OR_INTERFACE_DECLARATION__FINAL:
                return JavaPackage.NODE_WITH_FINAL_MODIFIER__FINAL;
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
            case JavaPackage.NODE_WITH_IMPLEMENTS__IMPLEMENTED_TYPES:
                return JavaPackage.CLASS_OR_INTERFACE_DECLARATION__IMPLEMENTED_TYPES;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithExtends.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_EXTENDS__EXTENDED_TYPES:
                return JavaPackage.CLASS_OR_INTERFACE_DECLARATION__EXTENDED_TYPES;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithTypeParameters.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_TYPE_PARAMETERS__TYPE_PARAMETERS:
                return JavaPackage.CLASS_OR_INTERFACE_DECLARATION__TYPE_PARAMETERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAbstractModifier.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_ABSTRACT_MODIFIER__ABSTRACT:
                return JavaPackage.CLASS_OR_INTERFACE_DECLARATION__ABSTRACT;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithFinalModifier.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_FINAL_MODIFIER__FINAL:
                return JavaPackage.CLASS_OR_INTERFACE_DECLARATION__FINAL;
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
        result.append( " (interface: " );
        result.append( interface_ );
        result.append( ')' );
        return result.toString();
    }

} //ClassOrInterfaceDeclarationImpl
