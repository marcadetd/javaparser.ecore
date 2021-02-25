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

import fr.centralesupelec.csd.java.Expression;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.NodeWithSimpleName;
import fr.centralesupelec.csd.java.NodeWithType;
import fr.centralesupelec.csd.java.SimpleName;
import fr.centralesupelec.csd.java.Type;
import fr.centralesupelec.csd.java.VariableDeclarator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.VariableDeclaratorImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.VariableDeclaratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.VariableDeclaratorImpl#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclaratorImpl extends JavaNodeImpl implements VariableDeclarator {
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
     * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected SimpleName name;

    /**
     * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitializer()
     * @generated
     * @ordered
     */
    protected Expression initializer;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VariableDeclaratorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JavaPackage.Literals.VARIABLE_DECLARATOR;
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
                    JavaPackage.VARIABLE_DECLARATOR__TYPE, oldType, newType );
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
                        EOPPOSITE_FEATURE_BASE - JavaPackage.VARIABLE_DECLARATOR__TYPE, null, msgs );
            if( newType != null )
                msgs = ( ( InternalEObject ) newType ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.VARIABLE_DECLARATOR__TYPE, null, msgs );
            msgs = basicSetType( newType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.VARIABLE_DECLARATOR__TYPE, newType,
                    newType ) );
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
                    JavaPackage.VARIABLE_DECLARATOR__NAME, oldName, newName );
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
                        EOPPOSITE_FEATURE_BASE - JavaPackage.VARIABLE_DECLARATOR__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.VARIABLE_DECLARATOR__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.VARIABLE_DECLARATOR__NAME, newName,
                    newName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getInitializer() {
        return initializer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitializer( Expression newInitializer, NotificationChain msgs ) {
        Expression oldInitializer = initializer;
        initializer = newInitializer;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.VARIABLE_DECLARATOR__INITIALIZER, oldInitializer, newInitializer );
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
    public void setInitializer( Expression newInitializer ) {
        if( newInitializer != initializer ) {
            NotificationChain msgs = null;
            if( initializer != null )
                msgs = ( ( InternalEObject ) initializer ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.VARIABLE_DECLARATOR__INITIALIZER, null, msgs );
            if( newInitializer != null )
                msgs = ( ( InternalEObject ) newInitializer ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.VARIABLE_DECLARATOR__INITIALIZER, null, msgs );
            msgs = basicSetInitializer( newInitializer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.VARIABLE_DECLARATOR__INITIALIZER,
                    newInitializer, newInitializer ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case JavaPackage.VARIABLE_DECLARATOR__TYPE:
            return basicSetType( null, msgs );
        case JavaPackage.VARIABLE_DECLARATOR__NAME:
            return basicSetName( null, msgs );
        case JavaPackage.VARIABLE_DECLARATOR__INITIALIZER:
            return basicSetInitializer( null, msgs );
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
        case JavaPackage.VARIABLE_DECLARATOR__TYPE:
            return getType();
        case JavaPackage.VARIABLE_DECLARATOR__NAME:
            return getName();
        case JavaPackage.VARIABLE_DECLARATOR__INITIALIZER:
            return getInitializer();
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
        case JavaPackage.VARIABLE_DECLARATOR__TYPE:
            setType( ( Type ) newValue );
            return;
        case JavaPackage.VARIABLE_DECLARATOR__NAME:
            setName( ( SimpleName ) newValue );
            return;
        case JavaPackage.VARIABLE_DECLARATOR__INITIALIZER:
            setInitializer( ( Expression ) newValue );
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
        case JavaPackage.VARIABLE_DECLARATOR__TYPE:
            setType( ( Type ) null );
            return;
        case JavaPackage.VARIABLE_DECLARATOR__NAME:
            setName( ( SimpleName ) null );
            return;
        case JavaPackage.VARIABLE_DECLARATOR__INITIALIZER:
            setInitializer( ( Expression ) null );
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
        case JavaPackage.VARIABLE_DECLARATOR__TYPE:
            return type != null;
        case JavaPackage.VARIABLE_DECLARATOR__NAME:
            return name != null;
        case JavaPackage.VARIABLE_DECLARATOR__INITIALIZER:
            return initializer != null;
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
            case JavaPackage.VARIABLE_DECLARATOR__TYPE:
                return JavaPackage.NODE_WITH_TYPE__TYPE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithSimpleName.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.VARIABLE_DECLARATOR__NAME:
                return JavaPackage.NODE_WITH_SIMPLE_NAME__NAME;
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
            case JavaPackage.NODE_WITH_TYPE__TYPE:
                return JavaPackage.VARIABLE_DECLARATOR__TYPE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithSimpleName.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_SIMPLE_NAME__NAME:
                return JavaPackage.VARIABLE_DECLARATOR__NAME;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //VariableDeclaratorImpl
