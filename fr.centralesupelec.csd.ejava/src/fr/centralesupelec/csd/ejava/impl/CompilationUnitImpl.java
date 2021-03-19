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

import fr.centralesupelec.csd.ejava.Comment;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.csd.ejava.CompilationUnit;
import fr.centralesupelec.csd.ejava.ImportDeclaration;
import fr.centralesupelec.csd.ejava.JavaNode;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.ModuleDeclaration;
import fr.centralesupelec.csd.ejava.PackageDeclaration;
import fr.centralesupelec.csd.ejava.TypeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CompilationUnitImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CompilationUnitImpl#getOrphanComments <em>Orphan Comments</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CompilationUnitImpl#getPackageDeclaration <em>Package Declaration</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CompilationUnitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CompilationUnitImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CompilationUnitImpl#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends ElementImpl implements CompilationUnit {
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
     * The cached value of the '{@link #getPackageDeclaration() <em>Package Declaration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackageDeclaration()
     * @generated
     * @ordered
     */
    protected PackageDeclaration packageDeclaration;

    /**
     * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImports()
     * @generated
     * @ordered
     */
    protected EList< ImportDeclaration > imports;

    /**
     * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypes()
     * @generated
     * @ordered
     */
    protected EList< TypeDeclaration > types;

    /**
     * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModule()
     * @generated
     * @ordered
     */
    protected ModuleDeclaration module;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CompilationUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.COMPILATION_UNIT;
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
                    EJavaPackage.COMPILATION_UNIT__COMMENT, oldComment, newComment );
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
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.COMPILATION_UNIT__COMMENT, null, msgs );
            if( newComment != null )
                msgs = ( ( InternalEObject ) newComment ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.COMPILATION_UNIT__COMMENT, null, msgs );
            msgs = basicSetComment( newComment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.COMPILATION_UNIT__COMMENT, newComment,
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
                    EJavaPackage.COMPILATION_UNIT__ORPHAN_COMMENTS );
        }
        return orphanComments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PackageDeclaration getPackageDeclaration() {
        return packageDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPackageDeclaration( PackageDeclaration newPackageDeclaration,
            NotificationChain msgs ) {
        PackageDeclaration oldPackageDeclaration = packageDeclaration;
        packageDeclaration = newPackageDeclaration;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION, oldPackageDeclaration, newPackageDeclaration );
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
    public void setPackageDeclaration( PackageDeclaration newPackageDeclaration ) {
        if( newPackageDeclaration != packageDeclaration ) {
            NotificationChain msgs = null;
            if( packageDeclaration != null )
                msgs = ( ( InternalEObject ) packageDeclaration ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION, null, msgs );
            if( newPackageDeclaration != null )
                msgs = ( ( InternalEObject ) newPackageDeclaration ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION, null, msgs );
            msgs = basicSetPackageDeclaration( newPackageDeclaration, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION,
                    newPackageDeclaration, newPackageDeclaration ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ImportDeclaration > getImports() {
        if( imports == null ) {
            imports = new EObjectContainmentEList< ImportDeclaration >( ImportDeclaration.class, this,
                    EJavaPackage.COMPILATION_UNIT__IMPORTS );
        }
        return imports;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TypeDeclaration > getTypes() {
        if( types == null ) {
            types = new EObjectContainmentEList< TypeDeclaration >( TypeDeclaration.class, this,
                    EJavaPackage.COMPILATION_UNIT__TYPES );
        }
        return types;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModuleDeclaration getModule() {
        return module;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModule( ModuleDeclaration newModule, NotificationChain msgs ) {
        ModuleDeclaration oldModule = module;
        module = newModule;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.COMPILATION_UNIT__MODULE, oldModule, newModule );
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
    public void setModule( ModuleDeclaration newModule ) {
        if( newModule != module ) {
            NotificationChain msgs = null;
            if( module != null )
                msgs = ( ( InternalEObject ) module ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.COMPILATION_UNIT__MODULE, null, msgs );
            if( newModule != null )
                msgs = ( ( InternalEObject ) newModule ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.COMPILATION_UNIT__MODULE, null, msgs );
            msgs = basicSetModule( newModule, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.COMPILATION_UNIT__MODULE, newModule,
                    newModule ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.COMPILATION_UNIT__COMMENT:
            return basicSetComment( null, msgs );
        case EJavaPackage.COMPILATION_UNIT__ORPHAN_COMMENTS:
            return ( ( InternalEList< ? > ) getOrphanComments() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION:
            return basicSetPackageDeclaration( null, msgs );
        case EJavaPackage.COMPILATION_UNIT__IMPORTS:
            return ( ( InternalEList< ? > ) getImports() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.COMPILATION_UNIT__TYPES:
            return ( ( InternalEList< ? > ) getTypes() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.COMPILATION_UNIT__MODULE:
            return basicSetModule( null, msgs );
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
        case EJavaPackage.COMPILATION_UNIT__COMMENT:
            return getComment();
        case EJavaPackage.COMPILATION_UNIT__ORPHAN_COMMENTS:
            return getOrphanComments();
        case EJavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION:
            return getPackageDeclaration();
        case EJavaPackage.COMPILATION_UNIT__IMPORTS:
            return getImports();
        case EJavaPackage.COMPILATION_UNIT__TYPES:
            return getTypes();
        case EJavaPackage.COMPILATION_UNIT__MODULE:
            return getModule();
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
        case EJavaPackage.COMPILATION_UNIT__COMMENT:
            setComment( ( Comment ) newValue );
            return;
        case EJavaPackage.COMPILATION_UNIT__ORPHAN_COMMENTS:
            getOrphanComments().clear();
            getOrphanComments().addAll( ( Collection< ? extends Comment > ) newValue );
            return;
        case EJavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION:
            setPackageDeclaration( ( PackageDeclaration ) newValue );
            return;
        case EJavaPackage.COMPILATION_UNIT__IMPORTS:
            getImports().clear();
            getImports().addAll( ( Collection< ? extends ImportDeclaration > ) newValue );
            return;
        case EJavaPackage.COMPILATION_UNIT__TYPES:
            getTypes().clear();
            getTypes().addAll( ( Collection< ? extends TypeDeclaration > ) newValue );
            return;
        case EJavaPackage.COMPILATION_UNIT__MODULE:
            setModule( ( ModuleDeclaration ) newValue );
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
        case EJavaPackage.COMPILATION_UNIT__COMMENT:
            setComment( ( Comment ) null );
            return;
        case EJavaPackage.COMPILATION_UNIT__ORPHAN_COMMENTS:
            getOrphanComments().clear();
            return;
        case EJavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION:
            setPackageDeclaration( ( PackageDeclaration ) null );
            return;
        case EJavaPackage.COMPILATION_UNIT__IMPORTS:
            getImports().clear();
            return;
        case EJavaPackage.COMPILATION_UNIT__TYPES:
            getTypes().clear();
            return;
        case EJavaPackage.COMPILATION_UNIT__MODULE:
            setModule( ( ModuleDeclaration ) null );
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
        case EJavaPackage.COMPILATION_UNIT__COMMENT:
            return comment != null;
        case EJavaPackage.COMPILATION_UNIT__ORPHAN_COMMENTS:
            return orphanComments != null && !orphanComments.isEmpty();
        case EJavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION:
            return packageDeclaration != null;
        case EJavaPackage.COMPILATION_UNIT__IMPORTS:
            return imports != null && !imports.isEmpty();
        case EJavaPackage.COMPILATION_UNIT__TYPES:
            return types != null && !types.isEmpty();
        case EJavaPackage.COMPILATION_UNIT__MODULE:
            return module != null;
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
        if( baseClass == JavaNode.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.COMPILATION_UNIT__COMMENT:
                return EJavaPackage.JAVA_NODE__COMMENT;
            case EJavaPackage.COMPILATION_UNIT__ORPHAN_COMMENTS:
                return EJavaPackage.JAVA_NODE__ORPHAN_COMMENTS;
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
        if( baseClass == JavaNode.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.JAVA_NODE__COMMENT:
                return EJavaPackage.COMPILATION_UNIT__COMMENT;
            case EJavaPackage.JAVA_NODE__ORPHAN_COMMENTS:
                return EJavaPackage.COMPILATION_UNIT__ORPHAN_COMMENTS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //CompilationUnitImpl
