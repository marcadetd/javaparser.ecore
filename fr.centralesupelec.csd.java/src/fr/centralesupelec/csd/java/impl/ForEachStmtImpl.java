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
import fr.centralesupelec.csd.java.ForEachStmt;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.NodeWithBody;
import fr.centralesupelec.csd.java.Statement;
import fr.centralesupelec.csd.java.VariableDeclarationExpr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ForEachStmtImpl#getBody <em>Body</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ForEachStmtImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ForEachStmtImpl#getIterable <em>Iterable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForEachStmtImpl extends StatementImpl implements ForEachStmt {
    /**
     * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBody()
     * @generated
     * @ordered
     */
    protected Statement body;

    /**
     * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable()
     * @generated
     * @ordered
     */
    protected VariableDeclarationExpr variable;

    /**
     * The cached value of the '{@link #getIterable() <em>Iterable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIterable()
     * @generated
     * @ordered
     */
    protected Expression iterable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ForEachStmtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JavaPackage.Literals.FOR_EACH_STMT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Statement getBody() {
        return body;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBody( Statement newBody, NotificationChain msgs ) {
        Statement oldBody = body;
        body = newBody;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.FOR_EACH_STMT__BODY, oldBody, newBody );
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
    public void setBody( Statement newBody ) {
        if( newBody != body ) {
            NotificationChain msgs = null;
            if( body != null )
                msgs = ( ( InternalEObject ) body ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_EACH_STMT__BODY, null, msgs );
            if( newBody != null )
                msgs = ( ( InternalEObject ) newBody ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_EACH_STMT__BODY, null, msgs );
            msgs = basicSetBody( newBody, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.FOR_EACH_STMT__BODY, newBody,
                    newBody ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VariableDeclarationExpr getVariable() {
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVariable( VariableDeclarationExpr newVariable, NotificationChain msgs ) {
        VariableDeclarationExpr oldVariable = variable;
        variable = newVariable;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.FOR_EACH_STMT__VARIABLE, oldVariable, newVariable );
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
    public void setVariable( VariableDeclarationExpr newVariable ) {
        if( newVariable != variable ) {
            NotificationChain msgs = null;
            if( variable != null )
                msgs = ( ( InternalEObject ) variable ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_EACH_STMT__VARIABLE, null, msgs );
            if( newVariable != null )
                msgs = ( ( InternalEObject ) newVariable ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_EACH_STMT__VARIABLE, null, msgs );
            msgs = basicSetVariable( newVariable, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.FOR_EACH_STMT__VARIABLE, newVariable,
                    newVariable ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getIterable() {
        return iterable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIterable( Expression newIterable, NotificationChain msgs ) {
        Expression oldIterable = iterable;
        iterable = newIterable;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.FOR_EACH_STMT__ITERABLE, oldIterable, newIterable );
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
    public void setIterable( Expression newIterable ) {
        if( newIterable != iterable ) {
            NotificationChain msgs = null;
            if( iterable != null )
                msgs = ( ( InternalEObject ) iterable ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_EACH_STMT__ITERABLE, null, msgs );
            if( newIterable != null )
                msgs = ( ( InternalEObject ) newIterable ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.FOR_EACH_STMT__ITERABLE, null, msgs );
            msgs = basicSetIterable( newIterable, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.FOR_EACH_STMT__ITERABLE, newIterable,
                    newIterable ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case JavaPackage.FOR_EACH_STMT__BODY:
            return basicSetBody( null, msgs );
        case JavaPackage.FOR_EACH_STMT__VARIABLE:
            return basicSetVariable( null, msgs );
        case JavaPackage.FOR_EACH_STMT__ITERABLE:
            return basicSetIterable( null, msgs );
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
        case JavaPackage.FOR_EACH_STMT__BODY:
            return getBody();
        case JavaPackage.FOR_EACH_STMT__VARIABLE:
            return getVariable();
        case JavaPackage.FOR_EACH_STMT__ITERABLE:
            return getIterable();
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
        case JavaPackage.FOR_EACH_STMT__BODY:
            setBody( ( Statement ) newValue );
            return;
        case JavaPackage.FOR_EACH_STMT__VARIABLE:
            setVariable( ( VariableDeclarationExpr ) newValue );
            return;
        case JavaPackage.FOR_EACH_STMT__ITERABLE:
            setIterable( ( Expression ) newValue );
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
        case JavaPackage.FOR_EACH_STMT__BODY:
            setBody( ( Statement ) null );
            return;
        case JavaPackage.FOR_EACH_STMT__VARIABLE:
            setVariable( ( VariableDeclarationExpr ) null );
            return;
        case JavaPackage.FOR_EACH_STMT__ITERABLE:
            setIterable( ( Expression ) null );
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
        case JavaPackage.FOR_EACH_STMT__BODY:
            return body != null;
        case JavaPackage.FOR_EACH_STMT__VARIABLE:
            return variable != null;
        case JavaPackage.FOR_EACH_STMT__ITERABLE:
            return iterable != null;
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
        if( baseClass == NodeWithBody.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.FOR_EACH_STMT__BODY:
                return JavaPackage.NODE_WITH_BODY__BODY;
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
        if( baseClass == NodeWithBody.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_BODY__BODY:
                return JavaPackage.FOR_EACH_STMT__BODY;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //ForEachStmtImpl
