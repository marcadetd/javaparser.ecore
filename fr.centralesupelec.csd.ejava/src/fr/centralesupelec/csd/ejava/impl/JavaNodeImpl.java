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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.csd.ejava.Comment;
import fr.centralesupelec.csd.ejava.JavaNode;
import fr.centralesupelec.csd.ejava.EJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.JavaNodeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.JavaNodeImpl#getOrphanComments <em>Orphan Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JavaNodeImpl extends MinimalEObjectImpl.Container implements JavaNode {
    /**
     * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected Comment comment;

    /**
     * The cached value of the '{@link #getOrphanComments() <em>Orphan Comments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrphanComments()
     * @generated
     * @ordered
     */
    protected EList< Comment > orphanComments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JavaNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.JAVA_NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Comment getComment() {
        return comment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetComment( Comment newComment, NotificationChain msgs ) {
        Comment oldComment = comment;
        comment = newComment;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.JAVA_NODE__COMMENT, oldComment, newComment );
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
    public void setComment( Comment newComment ) {
        if( newComment != comment ) {
            NotificationChain msgs = null;
            if( comment != null )
                msgs = ( ( InternalEObject ) comment ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.JAVA_NODE__COMMENT, null, msgs );
            if( newComment != null )
                msgs = ( ( InternalEObject ) newComment ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.JAVA_NODE__COMMENT, null, msgs );
            msgs = basicSetComment( newComment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.JAVA_NODE__COMMENT, newComment,
                    newComment ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Comment > getOrphanComments() {
        if( orphanComments == null ) {
            orphanComments = new EObjectContainmentEList< Comment >( Comment.class, this,
                    EJavaPackage.JAVA_NODE__ORPHAN_COMMENTS );
        }
        return orphanComments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.JAVA_NODE__COMMENT:
            return basicSetComment( null, msgs );
        case EJavaPackage.JAVA_NODE__ORPHAN_COMMENTS:
            return ( ( InternalEList< ? > ) getOrphanComments() ).basicRemove( otherEnd, msgs );
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
        case EJavaPackage.JAVA_NODE__COMMENT:
            return getComment();
        case EJavaPackage.JAVA_NODE__ORPHAN_COMMENTS:
            return getOrphanComments();
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
        case EJavaPackage.JAVA_NODE__COMMENT:
            setComment( ( Comment ) newValue );
            return;
        case EJavaPackage.JAVA_NODE__ORPHAN_COMMENTS:
            getOrphanComments().clear();
            getOrphanComments().addAll( ( Collection< ? extends Comment > ) newValue );
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
        case EJavaPackage.JAVA_NODE__COMMENT:
            setComment( ( Comment ) null );
            return;
        case EJavaPackage.JAVA_NODE__ORPHAN_COMMENTS:
            getOrphanComments().clear();
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
        case EJavaPackage.JAVA_NODE__COMMENT:
            return comment != null;
        case EJavaPackage.JAVA_NODE__ORPHAN_COMMENTS:
            return orphanComments != null && !orphanComments.isEmpty();
        }
        return super.eIsSet( featureID );
    }

} //JavaNodeImpl
