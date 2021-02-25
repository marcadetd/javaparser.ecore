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

import fr.centralesupelec.csd.java.BodyDeclaration;
import fr.centralesupelec.csd.java.EnumConstantDeclaration;
import fr.centralesupelec.csd.java.Expression;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.NodeWithArguments;
import fr.centralesupelec.csd.java.NodeWithJavadoc;
import fr.centralesupelec.csd.java.NodeWithSimpleName;
import fr.centralesupelec.csd.java.SimpleName;

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
 * An implementation of the model object '<em><b>Enum Constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.EnumConstantDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.EnumConstantDeclarationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.EnumConstantDeclarationImpl#getClassBody <em>Class Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumConstantDeclarationImpl extends BodyDeclarationImpl implements EnumConstantDeclaration {
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
     * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArguments()
     * @generated
     * @ordered
     */
    protected EList< Expression > arguments;

    /**
     * The cached value of the '{@link #getClassBody() <em>Class Body</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassBody()
     * @generated
     * @ordered
     */
    protected EList< BodyDeclaration > classBody;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumConstantDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JavaPackage.Literals.ENUM_CONSTANT_DECLARATION;
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
                    JavaPackage.ENUM_CONSTANT_DECLARATION__NAME, oldName, newName );
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
                        EOPPOSITE_FEATURE_BASE - JavaPackage.ENUM_CONSTANT_DECLARATION__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.ENUM_CONSTANT_DECLARATION__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.ENUM_CONSTANT_DECLARATION__NAME,
                    newName, newName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Expression > getArguments() {
        if( arguments == null ) {
            arguments = new EObjectContainmentEList< Expression >( Expression.class, this,
                    JavaPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS );
        }
        return arguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BodyDeclaration > getClassBody() {
        if( classBody == null ) {
            classBody = new EObjectContainmentEList< BodyDeclaration >( BodyDeclaration.class, this,
                    JavaPackage.ENUM_CONSTANT_DECLARATION__CLASS_BODY );
        }
        return classBody;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case JavaPackage.ENUM_CONSTANT_DECLARATION__NAME:
            return basicSetName( null, msgs );
        case JavaPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
            return ( ( InternalEList< ? > ) getArguments() ).basicRemove( otherEnd, msgs );
        case JavaPackage.ENUM_CONSTANT_DECLARATION__CLASS_BODY:
            return ( ( InternalEList< ? > ) getClassBody() ).basicRemove( otherEnd, msgs );
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
        case JavaPackage.ENUM_CONSTANT_DECLARATION__NAME:
            return getName();
        case JavaPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
            return getArguments();
        case JavaPackage.ENUM_CONSTANT_DECLARATION__CLASS_BODY:
            return getClassBody();
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
        case JavaPackage.ENUM_CONSTANT_DECLARATION__NAME:
            setName( ( SimpleName ) newValue );
            return;
        case JavaPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
            getArguments().clear();
            getArguments().addAll( ( Collection< ? extends Expression > ) newValue );
            return;
        case JavaPackage.ENUM_CONSTANT_DECLARATION__CLASS_BODY:
            getClassBody().clear();
            getClassBody().addAll( ( Collection< ? extends BodyDeclaration > ) newValue );
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
        case JavaPackage.ENUM_CONSTANT_DECLARATION__NAME:
            setName( ( SimpleName ) null );
            return;
        case JavaPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
            getArguments().clear();
            return;
        case JavaPackage.ENUM_CONSTANT_DECLARATION__CLASS_BODY:
            getClassBody().clear();
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
        case JavaPackage.ENUM_CONSTANT_DECLARATION__NAME:
            return name != null;
        case JavaPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
            return arguments != null && !arguments.isEmpty();
        case JavaPackage.ENUM_CONSTANT_DECLARATION__CLASS_BODY:
            return classBody != null && !classBody.isEmpty();
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
            case JavaPackage.ENUM_CONSTANT_DECLARATION__NAME:
                return JavaPackage.NODE_WITH_SIMPLE_NAME__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithArguments.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
                return JavaPackage.NODE_WITH_ARGUMENTS__ARGUMENTS;
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
                return JavaPackage.ENUM_CONSTANT_DECLARATION__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithArguments.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_ARGUMENTS__ARGUMENTS:
                return JavaPackage.ENUM_CONSTANT_DECLARATION__ARGUMENTS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //EnumConstantDeclarationImpl
