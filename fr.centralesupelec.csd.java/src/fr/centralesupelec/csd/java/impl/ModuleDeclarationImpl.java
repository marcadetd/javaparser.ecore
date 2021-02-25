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

import fr.centralesupelec.csd.java.AnnotationExpr;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.ModuleDeclaration;
import fr.centralesupelec.csd.java.ModuleDirective;
import fr.centralesupelec.csd.java.Name;
import fr.centralesupelec.csd.java.NodeWithAnnotations;
import fr.centralesupelec.csd.java.NodeWithName;

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
 * An implementation of the model object '<em><b>Module Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ModuleDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ModuleDeclarationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ModuleDeclarationImpl#isOpen <em>Open</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ModuleDeclarationImpl#getDirectives <em>Directives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleDeclarationImpl extends JavaNodeImpl implements ModuleDeclaration {
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
     * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnnotations()
     * @generated
     * @ordered
     */
    protected EList< AnnotationExpr > annotations;

    /**
     * The default value of the '{@link #isOpen() <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOpen()
     * @generated
     * @ordered
     */
    protected static final boolean OPEN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isOpen() <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOpen()
     * @generated
     * @ordered
     */
    protected boolean open = OPEN_EDEFAULT;

    /**
     * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirectives()
     * @generated
     * @ordered
     */
    protected EList< ModuleDirective > directives;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JavaPackage.Literals.MODULE_DECLARATION;
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
                    JavaPackage.MODULE_DECLARATION__NAME, oldName, newName );
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
                        EOPPOSITE_FEATURE_BASE - JavaPackage.MODULE_DECLARATION__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.MODULE_DECLARATION__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.MODULE_DECLARATION__NAME, newName,
                    newName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AnnotationExpr > getAnnotations() {
        if( annotations == null ) {
            annotations = new EObjectContainmentEList< AnnotationExpr >( AnnotationExpr.class, this,
                    JavaPackage.MODULE_DECLARATION__ANNOTATIONS );
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isOpen() {
        return open;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOpen( boolean newOpen ) {
        boolean oldOpen = open;
        open = newOpen;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.MODULE_DECLARATION__OPEN, oldOpen,
                    open ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ModuleDirective > getDirectives() {
        if( directives == null ) {
            directives = new EObjectContainmentEList< ModuleDirective >( ModuleDirective.class, this,
                    JavaPackage.MODULE_DECLARATION__DIRECTIVES );
        }
        return directives;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case JavaPackage.MODULE_DECLARATION__NAME:
            return basicSetName( null, msgs );
        case JavaPackage.MODULE_DECLARATION__ANNOTATIONS:
            return ( ( InternalEList< ? > ) getAnnotations() ).basicRemove( otherEnd, msgs );
        case JavaPackage.MODULE_DECLARATION__DIRECTIVES:
            return ( ( InternalEList< ? > ) getDirectives() ).basicRemove( otherEnd, msgs );
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
        case JavaPackage.MODULE_DECLARATION__NAME:
            return getName();
        case JavaPackage.MODULE_DECLARATION__ANNOTATIONS:
            return getAnnotations();
        case JavaPackage.MODULE_DECLARATION__OPEN:
            return isOpen();
        case JavaPackage.MODULE_DECLARATION__DIRECTIVES:
            return getDirectives();
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
        case JavaPackage.MODULE_DECLARATION__NAME:
            setName( ( Name ) newValue );
            return;
        case JavaPackage.MODULE_DECLARATION__ANNOTATIONS:
            getAnnotations().clear();
            getAnnotations().addAll( ( Collection< ? extends AnnotationExpr > ) newValue );
            return;
        case JavaPackage.MODULE_DECLARATION__OPEN:
            setOpen( ( Boolean ) newValue );
            return;
        case JavaPackage.MODULE_DECLARATION__DIRECTIVES:
            getDirectives().clear();
            getDirectives().addAll( ( Collection< ? extends ModuleDirective > ) newValue );
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
        case JavaPackage.MODULE_DECLARATION__NAME:
            setName( ( Name ) null );
            return;
        case JavaPackage.MODULE_DECLARATION__ANNOTATIONS:
            getAnnotations().clear();
            return;
        case JavaPackage.MODULE_DECLARATION__OPEN:
            setOpen( OPEN_EDEFAULT );
            return;
        case JavaPackage.MODULE_DECLARATION__DIRECTIVES:
            getDirectives().clear();
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
        case JavaPackage.MODULE_DECLARATION__NAME:
            return name != null;
        case JavaPackage.MODULE_DECLARATION__ANNOTATIONS:
            return annotations != null && !annotations.isEmpty();
        case JavaPackage.MODULE_DECLARATION__OPEN:
            return open != OPEN_EDEFAULT;
        case JavaPackage.MODULE_DECLARATION__DIRECTIVES:
            return directives != null && !directives.isEmpty();
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
            case JavaPackage.MODULE_DECLARATION__NAME:
                return JavaPackage.NODE_WITH_NAME__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAnnotations.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.MODULE_DECLARATION__ANNOTATIONS:
                return JavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS;
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
            case JavaPackage.NODE_WITH_NAME__NAME:
                return JavaPackage.MODULE_DECLARATION__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAnnotations.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS:
                return JavaPackage.MODULE_DECLARATION__ANNOTATIONS;
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
        result.append( " (open: " );
        result.append( open );
        result.append( ')' );
        return result.toString();
    }

} //ModuleDeclarationImpl
