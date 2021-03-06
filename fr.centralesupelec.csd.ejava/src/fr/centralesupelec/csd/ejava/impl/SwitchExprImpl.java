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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.csd.ejava.Expression;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.SwitchEntry;
import fr.centralesupelec.csd.ejava.SwitchExpr;
import fr.centralesupelec.csd.ejava.SwitchNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.SwitchExprImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.SwitchExprImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchExprImpl extends ExpressionImpl implements SwitchExpr {
    /**
     * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelector()
     * @generated
     * @ordered
     */
    protected Expression selector;

    /**
     * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntries()
     * @generated
     * @ordered
     */
    protected EList< SwitchEntry > entries;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.SWITCH_EXPR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getSelector() {
        return selector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSelector( Expression newSelector, NotificationChain msgs ) {
        Expression oldSelector = selector;
        selector = newSelector;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.SWITCH_EXPR__SELECTOR, oldSelector, newSelector );
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
    public void setSelector( Expression newSelector ) {
        if( newSelector != selector ) {
            NotificationChain msgs = null;
            if( selector != null )
                msgs = ( ( InternalEObject ) selector ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.SWITCH_EXPR__SELECTOR, null, msgs );
            if( newSelector != null )
                msgs = ( ( InternalEObject ) newSelector ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.SWITCH_EXPR__SELECTOR, null, msgs );
            msgs = basicSetSelector( newSelector, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.SWITCH_EXPR__SELECTOR, newSelector,
                    newSelector ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SwitchEntry > getEntries() {
        if( entries == null ) {
            entries = new EObjectContainmentEList< SwitchEntry >( SwitchEntry.class, this,
                    EJavaPackage.SWITCH_EXPR__ENTRIES );
        }
        return entries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.SWITCH_EXPR__SELECTOR:
            return basicSetSelector( null, msgs );
        case EJavaPackage.SWITCH_EXPR__ENTRIES:
            return ( ( InternalEList< ? > ) getEntries() ).basicRemove( otherEnd, msgs );
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
        case EJavaPackage.SWITCH_EXPR__SELECTOR:
            return getSelector();
        case EJavaPackage.SWITCH_EXPR__ENTRIES:
            return getEntries();
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
        case EJavaPackage.SWITCH_EXPR__SELECTOR:
            setSelector( ( Expression ) newValue );
            return;
        case EJavaPackage.SWITCH_EXPR__ENTRIES:
            getEntries().clear();
            getEntries().addAll( ( Collection< ? extends SwitchEntry > ) newValue );
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
        case EJavaPackage.SWITCH_EXPR__SELECTOR:
            setSelector( ( Expression ) null );
            return;
        case EJavaPackage.SWITCH_EXPR__ENTRIES:
            getEntries().clear();
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
        case EJavaPackage.SWITCH_EXPR__SELECTOR:
            return selector != null;
        case EJavaPackage.SWITCH_EXPR__ENTRIES:
            return entries != null && !entries.isEmpty();
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
        if( baseClass == SwitchNode.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.SWITCH_EXPR__SELECTOR:
                return EJavaPackage.SWITCH_NODE__SELECTOR;
            case EJavaPackage.SWITCH_EXPR__ENTRIES:
                return EJavaPackage.SWITCH_NODE__ENTRIES;
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
        if( baseClass == SwitchNode.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.SWITCH_NODE__SELECTOR:
                return EJavaPackage.SWITCH_EXPR__SELECTOR;
            case EJavaPackage.SWITCH_NODE__ENTRIES:
                return EJavaPackage.SWITCH_EXPR__ENTRIES;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //SwitchExprImpl
