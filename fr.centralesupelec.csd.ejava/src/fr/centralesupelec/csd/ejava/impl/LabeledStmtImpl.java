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

import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.LabeledStmt;
import fr.centralesupelec.csd.ejava.NodeWithLabel;
import fr.centralesupelec.csd.ejava.SimpleName;
import fr.centralesupelec.csd.ejava.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.LabeledStmtImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.LabeledStmtImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabeledStmtImpl extends StatementImpl implements LabeledStmt {
    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected SimpleName label;

    /**
     * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatement()
     * @generated
     * @ordered
     */
    protected Statement statement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LabeledStmtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.LABELED_STMT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SimpleName getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLabel( SimpleName newLabel, NotificationChain msgs ) {
        SimpleName oldLabel = label;
        label = newLabel;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.LABELED_STMT__LABEL, oldLabel, newLabel );
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
    public void setLabel( SimpleName newLabel ) {
        if( newLabel != label ) {
            NotificationChain msgs = null;
            if( label != null )
                msgs = ( ( InternalEObject ) label ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.LABELED_STMT__LABEL, null, msgs );
            if( newLabel != null )
                msgs = ( ( InternalEObject ) newLabel ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.LABELED_STMT__LABEL, null, msgs );
            msgs = basicSetLabel( newLabel, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.LABELED_STMT__LABEL, newLabel,
                    newLabel ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Statement getStatement() {
        return statement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatement( Statement newStatement, NotificationChain msgs ) {
        Statement oldStatement = statement;
        statement = newStatement;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.LABELED_STMT__STATEMENT, oldStatement, newStatement );
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
    public void setStatement( Statement newStatement ) {
        if( newStatement != statement ) {
            NotificationChain msgs = null;
            if( statement != null )
                msgs = ( ( InternalEObject ) statement ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.LABELED_STMT__STATEMENT, null, msgs );
            if( newStatement != null )
                msgs = ( ( InternalEObject ) newStatement ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.LABELED_STMT__STATEMENT, null, msgs );
            msgs = basicSetStatement( newStatement, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.LABELED_STMT__STATEMENT, newStatement,
                    newStatement ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.LABELED_STMT__LABEL:
            return basicSetLabel( null, msgs );
        case EJavaPackage.LABELED_STMT__STATEMENT:
            return basicSetStatement( null, msgs );
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
        case EJavaPackage.LABELED_STMT__LABEL:
            return getLabel();
        case EJavaPackage.LABELED_STMT__STATEMENT:
            return getStatement();
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
        case EJavaPackage.LABELED_STMT__LABEL:
            setLabel( ( SimpleName ) newValue );
            return;
        case EJavaPackage.LABELED_STMT__STATEMENT:
            setStatement( ( Statement ) newValue );
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
        case EJavaPackage.LABELED_STMT__LABEL:
            setLabel( ( SimpleName ) null );
            return;
        case EJavaPackage.LABELED_STMT__STATEMENT:
            setStatement( ( Statement ) null );
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
        case EJavaPackage.LABELED_STMT__LABEL:
            return label != null;
        case EJavaPackage.LABELED_STMT__STATEMENT:
            return statement != null;
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
        if( baseClass == NodeWithLabel.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.LABELED_STMT__LABEL:
                return EJavaPackage.NODE_WITH_LABEL__LABEL;
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
        if( baseClass == NodeWithLabel.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_LABEL__LABEL:
                return EJavaPackage.LABELED_STMT__LABEL;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //LabeledStmtImpl
