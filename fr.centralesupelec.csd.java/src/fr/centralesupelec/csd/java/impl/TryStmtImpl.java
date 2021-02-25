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

import fr.centralesupelec.csd.java.BlockStmt;
import fr.centralesupelec.csd.java.CatchClause;
import fr.centralesupelec.csd.java.Expression;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.TryStmt;

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
 * An implementation of the model object '<em><b>Try Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.TryStmtImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.TryStmtImpl#getTryBlock <em>Try Block</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.TryStmtImpl#getCatchClauses <em>Catch Clauses</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.TryStmtImpl#getFinallyBlock <em>Finally Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryStmtImpl extends StatementImpl implements TryStmt {
    /**
     * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResources()
     * @generated
     * @ordered
     */
    protected EList< Expression > resources;

    /**
     * The cached value of the '{@link #getTryBlock() <em>Try Block</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTryBlock()
     * @generated
     * @ordered
     */
    protected BlockStmt tryBlock;

    /**
     * The cached value of the '{@link #getCatchClauses() <em>Catch Clauses</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCatchClauses()
     * @generated
     * @ordered
     */
    protected EList< CatchClause > catchClauses;

    /**
     * The cached value of the '{@link #getFinallyBlock() <em>Finally Block</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinallyBlock()
     * @generated
     * @ordered
     */
    protected BlockStmt finallyBlock;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TryStmtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JavaPackage.Literals.TRY_STMT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Expression > getResources() {
        if( resources == null ) {
            resources = new EObjectContainmentEList< Expression >( Expression.class, this,
                    JavaPackage.TRY_STMT__RESOURCES );
        }
        return resources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BlockStmt getTryBlock() {
        return tryBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTryBlock( BlockStmt newTryBlock, NotificationChain msgs ) {
        BlockStmt oldTryBlock = tryBlock;
        tryBlock = newTryBlock;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.TRY_STMT__TRY_BLOCK, oldTryBlock, newTryBlock );
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
    public void setTryBlock( BlockStmt newTryBlock ) {
        if( newTryBlock != tryBlock ) {
            NotificationChain msgs = null;
            if( tryBlock != null )
                msgs = ( ( InternalEObject ) tryBlock ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.TRY_STMT__TRY_BLOCK, null, msgs );
            if( newTryBlock != null )
                msgs = ( ( InternalEObject ) newTryBlock ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.TRY_STMT__TRY_BLOCK, null, msgs );
            msgs = basicSetTryBlock( newTryBlock, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.TRY_STMT__TRY_BLOCK, newTryBlock,
                    newTryBlock ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CatchClause > getCatchClauses() {
        if( catchClauses == null ) {
            catchClauses = new EObjectContainmentEList< CatchClause >( CatchClause.class, this,
                    JavaPackage.TRY_STMT__CATCH_CLAUSES );
        }
        return catchClauses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BlockStmt getFinallyBlock() {
        return finallyBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFinallyBlock( BlockStmt newFinallyBlock, NotificationChain msgs ) {
        BlockStmt oldFinallyBlock = finallyBlock;
        finallyBlock = newFinallyBlock;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.TRY_STMT__FINALLY_BLOCK, oldFinallyBlock, newFinallyBlock );
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
    public void setFinallyBlock( BlockStmt newFinallyBlock ) {
        if( newFinallyBlock != finallyBlock ) {
            NotificationChain msgs = null;
            if( finallyBlock != null )
                msgs = ( ( InternalEObject ) finallyBlock ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.TRY_STMT__FINALLY_BLOCK, null, msgs );
            if( newFinallyBlock != null )
                msgs = ( ( InternalEObject ) newFinallyBlock ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.TRY_STMT__FINALLY_BLOCK, null, msgs );
            msgs = basicSetFinallyBlock( newFinallyBlock, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.TRY_STMT__FINALLY_BLOCK,
                    newFinallyBlock, newFinallyBlock ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case JavaPackage.TRY_STMT__RESOURCES:
            return ( ( InternalEList< ? > ) getResources() ).basicRemove( otherEnd, msgs );
        case JavaPackage.TRY_STMT__TRY_BLOCK:
            return basicSetTryBlock( null, msgs );
        case JavaPackage.TRY_STMT__CATCH_CLAUSES:
            return ( ( InternalEList< ? > ) getCatchClauses() ).basicRemove( otherEnd, msgs );
        case JavaPackage.TRY_STMT__FINALLY_BLOCK:
            return basicSetFinallyBlock( null, msgs );
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
        case JavaPackage.TRY_STMT__RESOURCES:
            return getResources();
        case JavaPackage.TRY_STMT__TRY_BLOCK:
            return getTryBlock();
        case JavaPackage.TRY_STMT__CATCH_CLAUSES:
            return getCatchClauses();
        case JavaPackage.TRY_STMT__FINALLY_BLOCK:
            return getFinallyBlock();
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
        case JavaPackage.TRY_STMT__RESOURCES:
            getResources().clear();
            getResources().addAll( ( Collection< ? extends Expression > ) newValue );
            return;
        case JavaPackage.TRY_STMT__TRY_BLOCK:
            setTryBlock( ( BlockStmt ) newValue );
            return;
        case JavaPackage.TRY_STMT__CATCH_CLAUSES:
            getCatchClauses().clear();
            getCatchClauses().addAll( ( Collection< ? extends CatchClause > ) newValue );
            return;
        case JavaPackage.TRY_STMT__FINALLY_BLOCK:
            setFinallyBlock( ( BlockStmt ) newValue );
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
        case JavaPackage.TRY_STMT__RESOURCES:
            getResources().clear();
            return;
        case JavaPackage.TRY_STMT__TRY_BLOCK:
            setTryBlock( ( BlockStmt ) null );
            return;
        case JavaPackage.TRY_STMT__CATCH_CLAUSES:
            getCatchClauses().clear();
            return;
        case JavaPackage.TRY_STMT__FINALLY_BLOCK:
            setFinallyBlock( ( BlockStmt ) null );
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
        case JavaPackage.TRY_STMT__RESOURCES:
            return resources != null && !resources.isEmpty();
        case JavaPackage.TRY_STMT__TRY_BLOCK:
            return tryBlock != null;
        case JavaPackage.TRY_STMT__CATCH_CLAUSES:
            return catchClauses != null && !catchClauses.isEmpty();
        case JavaPackage.TRY_STMT__FINALLY_BLOCK:
            return finallyBlock != null;
        }
        return super.eIsSet( featureID );
    }

} //TryStmtImpl
