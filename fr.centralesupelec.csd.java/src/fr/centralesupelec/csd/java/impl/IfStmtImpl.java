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
import fr.centralesupelec.csd.java.IfStmt;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.NodeWithCondition;
import fr.centralesupelec.csd.java.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.IfStmtImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.IfStmtImpl#getThenStmt <em>Then Stmt</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.IfStmtImpl#getElseStmt <em>Else Stmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStmtImpl extends StatementImpl implements IfStmt {
    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected Expression condition;

    /**
     * The cached value of the '{@link #getThenStmt() <em>Then Stmt</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThenStmt()
     * @generated
     * @ordered
     */
    protected Statement thenStmt;

    /**
     * The cached value of the '{@link #getElseStmt() <em>Else Stmt</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElseStmt()
     * @generated
     * @ordered
     */
    protected Statement elseStmt;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IfStmtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JavaPackage.Literals.IF_STMT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition( Expression newCondition, NotificationChain msgs ) {
        Expression oldCondition = condition;
        condition = newCondition;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.IF_STMT__CONDITION, oldCondition, newCondition );
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
    public void setCondition( Expression newCondition ) {
        if( newCondition != condition ) {
            NotificationChain msgs = null;
            if( condition != null )
                msgs = ( ( InternalEObject ) condition ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.IF_STMT__CONDITION, null, msgs );
            if( newCondition != null )
                msgs = ( ( InternalEObject ) newCondition ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.IF_STMT__CONDITION, null, msgs );
            msgs = basicSetCondition( newCondition, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.IF_STMT__CONDITION, newCondition,
                    newCondition ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Statement getThenStmt() {
        return thenStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThenStmt( Statement newThenStmt, NotificationChain msgs ) {
        Statement oldThenStmt = thenStmt;
        thenStmt = newThenStmt;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.IF_STMT__THEN_STMT, oldThenStmt, newThenStmt );
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
    public void setThenStmt( Statement newThenStmt ) {
        if( newThenStmt != thenStmt ) {
            NotificationChain msgs = null;
            if( thenStmt != null )
                msgs = ( ( InternalEObject ) thenStmt ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.IF_STMT__THEN_STMT, null, msgs );
            if( newThenStmt != null )
                msgs = ( ( InternalEObject ) newThenStmt ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.IF_STMT__THEN_STMT, null, msgs );
            msgs = basicSetThenStmt( newThenStmt, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.IF_STMT__THEN_STMT, newThenStmt,
                    newThenStmt ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Statement getElseStmt() {
        return elseStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElseStmt( Statement newElseStmt, NotificationChain msgs ) {
        Statement oldElseStmt = elseStmt;
        elseStmt = newElseStmt;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.IF_STMT__ELSE_STMT, oldElseStmt, newElseStmt );
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
    public void setElseStmt( Statement newElseStmt ) {
        if( newElseStmt != elseStmt ) {
            NotificationChain msgs = null;
            if( elseStmt != null )
                msgs = ( ( InternalEObject ) elseStmt ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.IF_STMT__ELSE_STMT, null, msgs );
            if( newElseStmt != null )
                msgs = ( ( InternalEObject ) newElseStmt ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.IF_STMT__ELSE_STMT, null, msgs );
            msgs = basicSetElseStmt( newElseStmt, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.IF_STMT__ELSE_STMT, newElseStmt,
                    newElseStmt ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case JavaPackage.IF_STMT__CONDITION:
            return basicSetCondition( null, msgs );
        case JavaPackage.IF_STMT__THEN_STMT:
            return basicSetThenStmt( null, msgs );
        case JavaPackage.IF_STMT__ELSE_STMT:
            return basicSetElseStmt( null, msgs );
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
        case JavaPackage.IF_STMT__CONDITION:
            return getCondition();
        case JavaPackage.IF_STMT__THEN_STMT:
            return getThenStmt();
        case JavaPackage.IF_STMT__ELSE_STMT:
            return getElseStmt();
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
        case JavaPackage.IF_STMT__CONDITION:
            setCondition( ( Expression ) newValue );
            return;
        case JavaPackage.IF_STMT__THEN_STMT:
            setThenStmt( ( Statement ) newValue );
            return;
        case JavaPackage.IF_STMT__ELSE_STMT:
            setElseStmt( ( Statement ) newValue );
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
        case JavaPackage.IF_STMT__CONDITION:
            setCondition( ( Expression ) null );
            return;
        case JavaPackage.IF_STMT__THEN_STMT:
            setThenStmt( ( Statement ) null );
            return;
        case JavaPackage.IF_STMT__ELSE_STMT:
            setElseStmt( ( Statement ) null );
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
        case JavaPackage.IF_STMT__CONDITION:
            return condition != null;
        case JavaPackage.IF_STMT__THEN_STMT:
            return thenStmt != null;
        case JavaPackage.IF_STMT__ELSE_STMT:
            return elseStmt != null;
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
        if( baseClass == NodeWithCondition.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.IF_STMT__CONDITION:
                return JavaPackage.NODE_WITH_CONDITION__CONDITION;
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
        if( baseClass == NodeWithCondition.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_CONDITION__CONDITION:
                return JavaPackage.IF_STMT__CONDITION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //IfStmtImpl
