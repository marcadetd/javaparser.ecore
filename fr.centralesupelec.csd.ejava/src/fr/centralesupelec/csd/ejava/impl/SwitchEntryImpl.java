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
import fr.centralesupelec.csd.ejava.NodeWithStatements;
import fr.centralesupelec.csd.ejava.Statement;
import fr.centralesupelec.csd.ejava.SwitchEntry;
import fr.centralesupelec.csd.ejava.SwitchEntryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.SwitchEntryImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.SwitchEntryImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.SwitchEntryImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchEntryImpl extends JavaNodeImpl implements SwitchEntry {
    /**
     * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatements()
     * @generated
     * @ordered
     */
    protected EList< Statement > statements;

    /**
     * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabels()
     * @generated
     * @ordered
     */
    protected EList< Expression > labels;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final SwitchEntryType TYPE_EDEFAULT = SwitchEntryType.STATEMENT_GROUP;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected SwitchEntryType type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchEntryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.SWITCH_ENTRY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Statement > getStatements() {
        if( statements == null ) {
            statements = new EObjectContainmentEList< Statement >( Statement.class, this,
                    EJavaPackage.SWITCH_ENTRY__STATEMENTS );
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Expression > getLabels() {
        if( labels == null ) {
            labels = new EObjectContainmentEList< Expression >( Expression.class, this,
                    EJavaPackage.SWITCH_ENTRY__LABELS );
        }
        return labels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchEntryType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( SwitchEntryType newType ) {
        SwitchEntryType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.SWITCH_ENTRY__TYPE, oldType, type ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.SWITCH_ENTRY__STATEMENTS:
            return ( ( InternalEList< ? > ) getStatements() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.SWITCH_ENTRY__LABELS:
            return ( ( InternalEList< ? > ) getLabels() ).basicRemove( otherEnd, msgs );
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
        case EJavaPackage.SWITCH_ENTRY__STATEMENTS:
            return getStatements();
        case EJavaPackage.SWITCH_ENTRY__LABELS:
            return getLabels();
        case EJavaPackage.SWITCH_ENTRY__TYPE:
            return getType();
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
        case EJavaPackage.SWITCH_ENTRY__STATEMENTS:
            getStatements().clear();
            getStatements().addAll( ( Collection< ? extends Statement > ) newValue );
            return;
        case EJavaPackage.SWITCH_ENTRY__LABELS:
            getLabels().clear();
            getLabels().addAll( ( Collection< ? extends Expression > ) newValue );
            return;
        case EJavaPackage.SWITCH_ENTRY__TYPE:
            setType( ( SwitchEntryType ) newValue );
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
        case EJavaPackage.SWITCH_ENTRY__STATEMENTS:
            getStatements().clear();
            return;
        case EJavaPackage.SWITCH_ENTRY__LABELS:
            getLabels().clear();
            return;
        case EJavaPackage.SWITCH_ENTRY__TYPE:
            setType( TYPE_EDEFAULT );
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
        case EJavaPackage.SWITCH_ENTRY__STATEMENTS:
            return statements != null && !statements.isEmpty();
        case EJavaPackage.SWITCH_ENTRY__LABELS:
            return labels != null && !labels.isEmpty();
        case EJavaPackage.SWITCH_ENTRY__TYPE:
            return type != TYPE_EDEFAULT;
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
        if( baseClass == NodeWithStatements.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.SWITCH_ENTRY__STATEMENTS:
                return EJavaPackage.NODE_WITH_STATEMENTS__STATEMENTS;
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
        if( baseClass == NodeWithStatements.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_STATEMENTS__STATEMENTS:
                return EJavaPackage.SWITCH_ENTRY__STATEMENTS;
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
        result.append( " (type: " );
        result.append( type );
        result.append( ')' );
        return result.toString();
    }

} //SwitchEntryImpl
