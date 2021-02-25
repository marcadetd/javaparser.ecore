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
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.LocalClassDeclarationStmt;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Class Declaration Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.LocalClassDeclarationStmtImpl#getClassDeclaration <em>Class Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalClassDeclarationStmtImpl extends StatementImpl implements LocalClassDeclarationStmt {
    /**
     * The cached value of the '{@link #getClassDeclaration() <em>Class Declaration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassDeclaration()
     * @generated
     * @ordered
     */
    protected ClassOrInterfaceDeclaration classDeclaration;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LocalClassDeclarationStmtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JavaPackage.Literals.LOCAL_CLASS_DECLARATION_STMT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClassOrInterfaceDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetClassDeclaration( ClassOrInterfaceDeclaration newClassDeclaration,
            NotificationChain msgs ) {
        ClassOrInterfaceDeclaration oldClassDeclaration = classDeclaration;
        classDeclaration = newClassDeclaration;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.LOCAL_CLASS_DECLARATION_STMT__CLASS_DECLARATION, oldClassDeclaration,
                    newClassDeclaration );
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
    public void setClassDeclaration( ClassOrInterfaceDeclaration newClassDeclaration ) {
        if( newClassDeclaration != classDeclaration ) {
            NotificationChain msgs = null;
            if( classDeclaration != null )
                msgs = ( ( InternalEObject ) classDeclaration ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.LOCAL_CLASS_DECLARATION_STMT__CLASS_DECLARATION, null,
                        msgs );
            if( newClassDeclaration != null )
                msgs = ( ( InternalEObject ) newClassDeclaration ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.LOCAL_CLASS_DECLARATION_STMT__CLASS_DECLARATION, null,
                        msgs );
            msgs = basicSetClassDeclaration( newClassDeclaration, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    JavaPackage.LOCAL_CLASS_DECLARATION_STMT__CLASS_DECLARATION, newClassDeclaration,
                    newClassDeclaration ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case JavaPackage.LOCAL_CLASS_DECLARATION_STMT__CLASS_DECLARATION:
            return basicSetClassDeclaration( null, msgs );
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
        case JavaPackage.LOCAL_CLASS_DECLARATION_STMT__CLASS_DECLARATION:
            return getClassDeclaration();
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
        case JavaPackage.LOCAL_CLASS_DECLARATION_STMT__CLASS_DECLARATION:
            setClassDeclaration( ( ClassOrInterfaceDeclaration ) newValue );
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
        case JavaPackage.LOCAL_CLASS_DECLARATION_STMT__CLASS_DECLARATION:
            setClassDeclaration( ( ClassOrInterfaceDeclaration ) null );
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
        case JavaPackage.LOCAL_CLASS_DECLARATION_STMT__CLASS_DECLARATION:
            return classDeclaration != null;
        }
        return super.eIsSet( featureID );
    }

} //LocalClassDeclarationStmtImpl
