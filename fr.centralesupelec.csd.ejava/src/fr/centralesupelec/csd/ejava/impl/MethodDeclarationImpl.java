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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.csd.ejava.BlockStmt;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.MethodDeclaration;
import fr.centralesupelec.csd.ejava.ModifierKeyword;
import fr.centralesupelec.csd.ejava.NodeWithBlockStmt;
import fr.centralesupelec.csd.ejava.NodeWithDefaultModifier;
import fr.centralesupelec.csd.ejava.NodeWithNativeModifier;
import fr.centralesupelec.csd.ejava.NodeWithSynchronizedModifier;
import fr.centralesupelec.csd.ejava.NodeWithType;
import fr.centralesupelec.csd.ejava.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.MethodDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.MethodDeclarationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.MethodDeclarationImpl#isNative <em>Native</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.MethodDeclarationImpl#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.MethodDeclarationImpl#isDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclarationImpl extends CallableDeclarationImpl implements MethodDeclaration {
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
     * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBody()
     * @generated
     * @ordered
     */
    protected BlockStmt body;

    /**
     * The default value of the '{@link #isNative() <em>Native</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNative()
     * @generated
     * @ordered
     */
    protected static final boolean NATIVE_EDEFAULT = false;

    /**
     * The default value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSynchronized()
     * @generated
     * @ordered
     */
    protected static final boolean SYNCHRONIZED_EDEFAULT = false;

    /**
     * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDefault()
     * @generated
     * @ordered
     */
    protected static final boolean DEFAULT_EDEFAULT = false;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MethodDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.METHOD_DECLARATION;
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
                    EJavaPackage.METHOD_DECLARATION__TYPE, oldType, newType );
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
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.METHOD_DECLARATION__TYPE, null, msgs );
            if( newType != null )
                msgs = ( ( InternalEObject ) newType ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.METHOD_DECLARATION__TYPE, null, msgs );
            msgs = basicSetType( newType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.METHOD_DECLARATION__TYPE, newType,
                    newType ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BlockStmt getBody() {
        return body;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBody( BlockStmt newBody, NotificationChain msgs ) {
        BlockStmt oldBody = body;
        body = newBody;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.METHOD_DECLARATION__BODY, oldBody, newBody );
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
    public void setBody( BlockStmt newBody ) {
        if( newBody != body ) {
            NotificationChain msgs = null;
            if( body != null )
                msgs = ( ( InternalEObject ) body ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.METHOD_DECLARATION__BODY, null, msgs );
            if( newBody != null )
                msgs = ( ( InternalEObject ) newBody ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.METHOD_DECLARATION__BODY, null, msgs );
            msgs = basicSetBody( newBody, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.METHOD_DECLARATION__BODY, newBody,
                    newBody ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isNative() {
        return getModifiers().contains( ModifierKeyword.NATIVE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setNative( boolean newNative ) {
        if( newNative )
            getModifiers().add( ModifierKeyword.NATIVE );
        else
            getModifiers().remove( ModifierKeyword.NATIVE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isSynchronized() {
        return getModifiers().contains( ModifierKeyword.SYNCHRONIZED );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setSynchronized( boolean newSynchronized ) {
        if( newSynchronized )
            getModifiers().add( ModifierKeyword.SYNCHRONIZED );
        else
            getModifiers().remove( ModifierKeyword.SYNCHRONIZED );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isDefault() {
        return getModifiers().contains( ModifierKeyword.DEFAULT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setDefault( boolean newDefault ) {
        if( newDefault )
            getModifiers().add( ModifierKeyword.DEFAULT );
        else
            getModifiers().remove( ModifierKeyword.DEFAULT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.METHOD_DECLARATION__TYPE:
            return basicSetType( null, msgs );
        case EJavaPackage.METHOD_DECLARATION__BODY:
            return basicSetBody( null, msgs );
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
        case EJavaPackage.METHOD_DECLARATION__TYPE:
            return getType();
        case EJavaPackage.METHOD_DECLARATION__BODY:
            return getBody();
        case EJavaPackage.METHOD_DECLARATION__NATIVE:
            return isNative();
        case EJavaPackage.METHOD_DECLARATION__SYNCHRONIZED:
            return isSynchronized();
        case EJavaPackage.METHOD_DECLARATION__DEFAULT:
            return isDefault();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case EJavaPackage.METHOD_DECLARATION__TYPE:
            setType( ( Type ) newValue );
            return;
        case EJavaPackage.METHOD_DECLARATION__BODY:
            setBody( ( BlockStmt ) newValue );
            return;
        case EJavaPackage.METHOD_DECLARATION__NATIVE:
            setNative( ( Boolean ) newValue );
            return;
        case EJavaPackage.METHOD_DECLARATION__SYNCHRONIZED:
            setSynchronized( ( Boolean ) newValue );
            return;
        case EJavaPackage.METHOD_DECLARATION__DEFAULT:
            setDefault( ( Boolean ) newValue );
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
        case EJavaPackage.METHOD_DECLARATION__TYPE:
            setType( ( Type ) null );
            return;
        case EJavaPackage.METHOD_DECLARATION__BODY:
            setBody( ( BlockStmt ) null );
            return;
        case EJavaPackage.METHOD_DECLARATION__NATIVE:
            setNative( NATIVE_EDEFAULT );
            return;
        case EJavaPackage.METHOD_DECLARATION__SYNCHRONIZED:
            setSynchronized( SYNCHRONIZED_EDEFAULT );
            return;
        case EJavaPackage.METHOD_DECLARATION__DEFAULT:
            setDefault( DEFAULT_EDEFAULT );
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
        case EJavaPackage.METHOD_DECLARATION__TYPE:
            return type != null;
        case EJavaPackage.METHOD_DECLARATION__BODY:
            return body != null;
        case EJavaPackage.METHOD_DECLARATION__NATIVE:
            return isNative() != NATIVE_EDEFAULT;
        case EJavaPackage.METHOD_DECLARATION__SYNCHRONIZED:
            return isSynchronized() != SYNCHRONIZED_EDEFAULT;
        case EJavaPackage.METHOD_DECLARATION__DEFAULT:
            return isDefault() != DEFAULT_EDEFAULT;
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
        if( baseClass == NodeWithType.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.METHOD_DECLARATION__TYPE:
                return EJavaPackage.NODE_WITH_TYPE__TYPE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithBlockStmt.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.METHOD_DECLARATION__BODY:
                return EJavaPackage.NODE_WITH_BLOCK_STMT__BODY;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithNativeModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.METHOD_DECLARATION__NATIVE:
                return EJavaPackage.NODE_WITH_NATIVE_MODIFIER__NATIVE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithSynchronizedModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.METHOD_DECLARATION__SYNCHRONIZED:
                return EJavaPackage.NODE_WITH_SYNCHRONIZED_MODIFIER__SYNCHRONIZED;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithDefaultModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.METHOD_DECLARATION__DEFAULT:
                return EJavaPackage.NODE_WITH_DEFAULT_MODIFIER__DEFAULT;
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
        if( baseClass == NodeWithType.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_TYPE__TYPE:
                return EJavaPackage.METHOD_DECLARATION__TYPE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithBlockStmt.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_BLOCK_STMT__BODY:
                return EJavaPackage.METHOD_DECLARATION__BODY;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithNativeModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_NATIVE_MODIFIER__NATIVE:
                return EJavaPackage.METHOD_DECLARATION__NATIVE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithSynchronizedModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_SYNCHRONIZED_MODIFIER__SYNCHRONIZED:
                return EJavaPackage.METHOD_DECLARATION__SYNCHRONIZED;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithDefaultModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_DEFAULT_MODIFIER__DEFAULT:
                return EJavaPackage.METHOD_DECLARATION__DEFAULT;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //MethodDeclarationImpl
