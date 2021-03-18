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

import fr.centralesupelec.csd.ejava.ImportDeclaration;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.Name;
import fr.centralesupelec.csd.ejava.NodeWithName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ImportDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ImportDeclarationImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ImportDeclarationImpl#isAsterisk <em>Asterisk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportDeclarationImpl extends JavaNodeImpl implements ImportDeclaration {
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
     * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
    protected static final boolean STATIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
    protected boolean static_ = STATIC_EDEFAULT;

    /**
     * The default value of the '{@link #isAsterisk() <em>Asterisk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAsterisk()
     * @generated
     * @ordered
     */
    protected static final boolean ASTERISK_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAsterisk() <em>Asterisk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAsterisk()
     * @generated
     * @ordered
     */
    protected boolean asterisk = ASTERISK_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImportDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.IMPORT_DECLARATION;
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
                    EJavaPackage.IMPORT_DECLARATION__NAME, oldName, newName );
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
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.IMPORT_DECLARATION__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.IMPORT_DECLARATION__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.IMPORT_DECLARATION__NAME, newName,
                    newName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isStatic() {
        return static_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStatic( boolean newStatic ) {
        boolean oldStatic = static_;
        static_ = newStatic;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.IMPORT_DECLARATION__STATIC, oldStatic,
                    static_ ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isAsterisk() {
        return asterisk;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAsterisk( boolean newAsterisk ) {
        boolean oldAsterisk = asterisk;
        asterisk = newAsterisk;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.IMPORT_DECLARATION__ASTERISK,
                    oldAsterisk, asterisk ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.IMPORT_DECLARATION__NAME:
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
        case EJavaPackage.IMPORT_DECLARATION__NAME:
            return getName();
        case EJavaPackage.IMPORT_DECLARATION__STATIC:
            return isStatic();
        case EJavaPackage.IMPORT_DECLARATION__ASTERISK:
            return isAsterisk();
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
        case EJavaPackage.IMPORT_DECLARATION__NAME:
            setName( ( Name ) newValue );
            return;
        case EJavaPackage.IMPORT_DECLARATION__STATIC:
            setStatic( ( Boolean ) newValue );
            return;
        case EJavaPackage.IMPORT_DECLARATION__ASTERISK:
            setAsterisk( ( Boolean ) newValue );
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
        case EJavaPackage.IMPORT_DECLARATION__NAME:
            setName( ( Name ) null );
            return;
        case EJavaPackage.IMPORT_DECLARATION__STATIC:
            setStatic( STATIC_EDEFAULT );
            return;
        case EJavaPackage.IMPORT_DECLARATION__ASTERISK:
            setAsterisk( ASTERISK_EDEFAULT );
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
        case EJavaPackage.IMPORT_DECLARATION__NAME:
            return name != null;
        case EJavaPackage.IMPORT_DECLARATION__STATIC:
            return static_ != STATIC_EDEFAULT;
        case EJavaPackage.IMPORT_DECLARATION__ASTERISK:
            return asterisk != ASTERISK_EDEFAULT;
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
            case EJavaPackage.IMPORT_DECLARATION__NAME:
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
                return EJavaPackage.IMPORT_DECLARATION__NAME;
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
        result.append( " (static: " );
        result.append( static_ );
        result.append( ", asterisk: " );
        result.append( asterisk );
        result.append( ')' );
        return result.toString();
    }

} //ImportDeclarationImpl
