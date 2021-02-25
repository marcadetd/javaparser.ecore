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

import fr.centralesupelec.csd.java.AnnotationMemberDeclaration;
import fr.centralesupelec.csd.java.Expression;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.ModifierKeyword;
import fr.centralesupelec.csd.java.NodeWithAbstractModifier;
import fr.centralesupelec.csd.java.NodeWithJavadoc;
import fr.centralesupelec.csd.java.NodeWithModifiers;
import fr.centralesupelec.csd.java.NodeWithPublicModifier;
import fr.centralesupelec.csd.java.NodeWithSimpleName;
import fr.centralesupelec.csd.java.NodeWithType;
import fr.centralesupelec.csd.java.SimpleName;
import fr.centralesupelec.csd.java.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.AnnotationMemberDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.AnnotationMemberDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.AnnotationMemberDeclarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.AnnotationMemberDeclarationImpl#isPublic <em>Public</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.AnnotationMemberDeclarationImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.AnnotationMemberDeclarationImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationMemberDeclarationImpl extends BodyDeclarationImpl implements AnnotationMemberDeclaration {
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
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected Type type;

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
     * The default value of the '{@link #isPublic() <em>Public</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPublic()
     * @generated
     * @ordered
     */
    protected static final boolean PUBLIC_EDEFAULT = false;

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
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected Expression defaultValue;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnnotationMemberDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION;
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
                    JavaPackage.ANNOTATION_MEMBER_DECLARATION__NAME, oldName, newName );
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
                        EOPPOSITE_FEATURE_BASE - JavaPackage.ANNOTATION_MEMBER_DECLARATION__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.ANNOTATION_MEMBER_DECLARATION__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.ANNOTATION_MEMBER_DECLARATION__NAME,
                    newName, newName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType( Type newType, NotificationChain msgs ) {
        Type oldType = type;
        type = newType;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.ANNOTATION_MEMBER_DECLARATION__TYPE, oldType, newType );
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
    public void setType( Type newType ) {
        if( newType != type ) {
            NotificationChain msgs = null;
            if( type != null )
                msgs = ( ( InternalEObject ) type ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.ANNOTATION_MEMBER_DECLARATION__TYPE, null, msgs );
            if( newType != null )
                msgs = ( ( InternalEObject ) newType ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.ANNOTATION_MEMBER_DECLARATION__TYPE, null, msgs );
            msgs = basicSetType( newType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.ANNOTATION_MEMBER_DECLARATION__TYPE,
                    newType, newType ) );
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
                    JavaPackage.ANNOTATION_MEMBER_DECLARATION__MODIFIERS );
        }
        return modifiers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isPublic() {
        return getModifiers().contains( ModifierKeyword.PUBLIC );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setPublic( boolean newPublic ) {
        if( newPublic )
            getModifiers().add( ModifierKeyword.PUBLIC );
        else
            getModifiers().remove( ModifierKeyword.PUBLIC );
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
     * @generated
     */
    @Override
    public Expression getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefaultValue( Expression newDefaultValue, NotificationChain msgs ) {
        Expression oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE, oldDefaultValue, newDefaultValue );
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
    public void setDefaultValue( Expression newDefaultValue ) {
        if( newDefaultValue != defaultValue ) {
            NotificationChain msgs = null;
            if( defaultValue != null )
                msgs = ( ( InternalEObject ) defaultValue ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE, null, msgs );
            if( newDefaultValue != null )
                msgs = ( ( InternalEObject ) newDefaultValue ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE, null, msgs );
            msgs = basicSetDefaultValue( newDefaultValue, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    JavaPackage.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE, newDefaultValue, newDefaultValue ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__NAME:
            return basicSetName( null, msgs );
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__TYPE:
            return basicSetType( null, msgs );
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE:
            return basicSetDefaultValue( null, msgs );
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
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__NAME:
            return getName();
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__TYPE:
            return getType();
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__MODIFIERS:
            return getModifiers();
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__PUBLIC:
            return isPublic();
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__ABSTRACT:
            return isAbstract();
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE:
            return getDefaultValue();
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
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__NAME:
            setName( ( SimpleName ) newValue );
            return;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__TYPE:
            setType( ( Type ) newValue );
            return;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__MODIFIERS:
            getModifiers().clear();
            getModifiers().addAll( ( Collection< ? extends ModifierKeyword > ) newValue );
            return;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__PUBLIC:
            setPublic( ( Boolean ) newValue );
            return;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__ABSTRACT:
            setAbstract( ( Boolean ) newValue );
            return;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE:
            setDefaultValue( ( Expression ) newValue );
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
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__NAME:
            setName( ( SimpleName ) null );
            return;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__TYPE:
            setType( ( Type ) null );
            return;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__MODIFIERS:
            getModifiers().clear();
            return;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__PUBLIC:
            setPublic( PUBLIC_EDEFAULT );
            return;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__ABSTRACT:
            setAbstract( ABSTRACT_EDEFAULT );
            return;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE:
            setDefaultValue( ( Expression ) null );
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
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__NAME:
            return name != null;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__TYPE:
            return type != null;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__MODIFIERS:
            return modifiers != null && !modifiers.isEmpty();
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__PUBLIC:
            return isPublic() != PUBLIC_EDEFAULT;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__ABSTRACT:
            return isAbstract() != ABSTRACT_EDEFAULT;
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE:
            return defaultValue != null;
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
        if( baseClass == NodeWithJavadoc.class ) {
            switch( derivedFeatureID ) {
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithSimpleName.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.ANNOTATION_MEMBER_DECLARATION__NAME:
                return JavaPackage.NODE_WITH_SIMPLE_NAME__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithType.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.ANNOTATION_MEMBER_DECLARATION__TYPE:
                return JavaPackage.NODE_WITH_TYPE__TYPE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithModifiers.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.ANNOTATION_MEMBER_DECLARATION__MODIFIERS:
                return JavaPackage.NODE_WITH_MODIFIERS__MODIFIERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithPublicModifier.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.ANNOTATION_MEMBER_DECLARATION__PUBLIC:
                return JavaPackage.NODE_WITH_PUBLIC_MODIFIER__PUBLIC;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAbstractModifier.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.ANNOTATION_MEMBER_DECLARATION__ABSTRACT:
                return JavaPackage.NODE_WITH_ABSTRACT_MODIFIER__ABSTRACT;
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
        if( baseClass == NodeWithJavadoc.class ) {
            switch( baseFeatureID ) {
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithSimpleName.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_SIMPLE_NAME__NAME:
                return JavaPackage.ANNOTATION_MEMBER_DECLARATION__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithType.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_TYPE__TYPE:
                return JavaPackage.ANNOTATION_MEMBER_DECLARATION__TYPE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithModifiers.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_MODIFIERS__MODIFIERS:
                return JavaPackage.ANNOTATION_MEMBER_DECLARATION__MODIFIERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithPublicModifier.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_PUBLIC_MODIFIER__PUBLIC:
                return JavaPackage.ANNOTATION_MEMBER_DECLARATION__PUBLIC;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAbstractModifier.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_ABSTRACT_MODIFIER__ABSTRACT:
                return JavaPackage.ANNOTATION_MEMBER_DECLARATION__ABSTRACT;
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

} //AnnotationMemberDeclarationImpl
