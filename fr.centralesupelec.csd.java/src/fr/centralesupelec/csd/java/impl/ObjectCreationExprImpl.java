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

import fr.centralesupelec.csd.java.BodyDeclaration;
import fr.centralesupelec.csd.java.ClassOrInterfaceDeclaration;
import fr.centralesupelec.csd.java.Expression;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.NodeWithArguments;
import fr.centralesupelec.csd.java.NodeWithScope;
import fr.centralesupelec.csd.java.NodeWithType;
import fr.centralesupelec.csd.java.NodeWithTypeArguments;
import fr.centralesupelec.csd.java.ObjectCreationExpr;
import fr.centralesupelec.csd.java.Type;

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
 * An implementation of the model object '<em><b>Object Creation Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ObjectCreationExprImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ObjectCreationExprImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ObjectCreationExprImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ObjectCreationExprImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ObjectCreationExprImpl#getAnonymousClassBody <em>Anonymous Class Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectCreationExprImpl extends ExpressionImpl implements ObjectCreationExpr {
    /**
     * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeArguments()
     * @generated
     * @ordered
     */
    protected EList< Type > typeArguments;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ClassOrInterfaceDeclaration type;

    /**
     * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArguments()
     * @generated
     * @ordered
     */
    protected EList< Expression > arguments;

    /**
     * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected Expression scope;

    /**
     * The cached value of the '{@link #getAnonymousClassBody() <em>Anonymous Class Body</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnonymousClassBody()
     * @generated
     * @ordered
     */
    protected EList< BodyDeclaration > anonymousClassBody;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ObjectCreationExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JavaPackage.Literals.OBJECT_CREATION_EXPR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Type > getTypeArguments() {
        if( typeArguments == null ) {
            typeArguments = new EObjectContainmentEList< Type >( Type.class, this,
                    JavaPackage.OBJECT_CREATION_EXPR__TYPE_ARGUMENTS );
        }
        return typeArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClassOrInterfaceDeclaration getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType( ClassOrInterfaceDeclaration newType, NotificationChain msgs ) {
        ClassOrInterfaceDeclaration oldType = type;
        type = newType;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.OBJECT_CREATION_EXPR__TYPE, oldType, newType );
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
    public void setType( ClassOrInterfaceDeclaration newType ) {
        if( newType != type ) {
            NotificationChain msgs = null;
            if( type != null )
                msgs = ( ( InternalEObject ) type ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.OBJECT_CREATION_EXPR__TYPE, null, msgs );
            if( newType != null )
                msgs = ( ( InternalEObject ) newType ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.OBJECT_CREATION_EXPR__TYPE, null, msgs );
            msgs = basicSetType( newType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.OBJECT_CREATION_EXPR__TYPE, newType,
                    newType ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Expression > getArguments() {
        if( arguments == null ) {
            arguments = new EObjectContainmentEList< Expression >( Expression.class, this,
                    JavaPackage.OBJECT_CREATION_EXPR__ARGUMENTS );
        }
        return arguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getScope() {
        return scope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetScope( Expression newScope, NotificationChain msgs ) {
        Expression oldScope = scope;
        scope = newScope;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.OBJECT_CREATION_EXPR__SCOPE, oldScope, newScope );
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
    public void setScope( Expression newScope ) {
        if( newScope != scope ) {
            NotificationChain msgs = null;
            if( scope != null )
                msgs = ( ( InternalEObject ) scope ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.OBJECT_CREATION_EXPR__SCOPE, null, msgs );
            if( newScope != null )
                msgs = ( ( InternalEObject ) newScope ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.OBJECT_CREATION_EXPR__SCOPE, null, msgs );
            msgs = basicSetScope( newScope, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.OBJECT_CREATION_EXPR__SCOPE, newScope,
                    newScope ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BodyDeclaration > getAnonymousClassBody() {
        if( anonymousClassBody == null ) {
            anonymousClassBody = new EObjectContainmentEList< BodyDeclaration >( BodyDeclaration.class, this,
                    JavaPackage.OBJECT_CREATION_EXPR__ANONYMOUS_CLASS_BODY );
        }
        return anonymousClassBody;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case JavaPackage.OBJECT_CREATION_EXPR__TYPE_ARGUMENTS:
            return ( ( InternalEList< ? > ) getTypeArguments() ).basicRemove( otherEnd, msgs );
        case JavaPackage.OBJECT_CREATION_EXPR__TYPE:
            return basicSetType( null, msgs );
        case JavaPackage.OBJECT_CREATION_EXPR__ARGUMENTS:
            return ( ( InternalEList< ? > ) getArguments() ).basicRemove( otherEnd, msgs );
        case JavaPackage.OBJECT_CREATION_EXPR__SCOPE:
            return basicSetScope( null, msgs );
        case JavaPackage.OBJECT_CREATION_EXPR__ANONYMOUS_CLASS_BODY:
            return ( ( InternalEList< ? > ) getAnonymousClassBody() ).basicRemove( otherEnd, msgs );
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
        case JavaPackage.OBJECT_CREATION_EXPR__TYPE_ARGUMENTS:
            return getTypeArguments();
        case JavaPackage.OBJECT_CREATION_EXPR__TYPE:
            return getType();
        case JavaPackage.OBJECT_CREATION_EXPR__ARGUMENTS:
            return getArguments();
        case JavaPackage.OBJECT_CREATION_EXPR__SCOPE:
            return getScope();
        case JavaPackage.OBJECT_CREATION_EXPR__ANONYMOUS_CLASS_BODY:
            return getAnonymousClassBody();
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
        case JavaPackage.OBJECT_CREATION_EXPR__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            getTypeArguments().addAll( ( Collection< ? extends Type > ) newValue );
            return;
        case JavaPackage.OBJECT_CREATION_EXPR__TYPE:
            setType( ( ClassOrInterfaceDeclaration ) newValue );
            return;
        case JavaPackage.OBJECT_CREATION_EXPR__ARGUMENTS:
            getArguments().clear();
            getArguments().addAll( ( Collection< ? extends Expression > ) newValue );
            return;
        case JavaPackage.OBJECT_CREATION_EXPR__SCOPE:
            setScope( ( Expression ) newValue );
            return;
        case JavaPackage.OBJECT_CREATION_EXPR__ANONYMOUS_CLASS_BODY:
            getAnonymousClassBody().clear();
            getAnonymousClassBody().addAll( ( Collection< ? extends BodyDeclaration > ) newValue );
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
        case JavaPackage.OBJECT_CREATION_EXPR__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            return;
        case JavaPackage.OBJECT_CREATION_EXPR__TYPE:
            setType( ( ClassOrInterfaceDeclaration ) null );
            return;
        case JavaPackage.OBJECT_CREATION_EXPR__ARGUMENTS:
            getArguments().clear();
            return;
        case JavaPackage.OBJECT_CREATION_EXPR__SCOPE:
            setScope( ( Expression ) null );
            return;
        case JavaPackage.OBJECT_CREATION_EXPR__ANONYMOUS_CLASS_BODY:
            getAnonymousClassBody().clear();
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
        case JavaPackage.OBJECT_CREATION_EXPR__TYPE_ARGUMENTS:
            return typeArguments != null && !typeArguments.isEmpty();
        case JavaPackage.OBJECT_CREATION_EXPR__TYPE:
            return type != null;
        case JavaPackage.OBJECT_CREATION_EXPR__ARGUMENTS:
            return arguments != null && !arguments.isEmpty();
        case JavaPackage.OBJECT_CREATION_EXPR__SCOPE:
            return scope != null;
        case JavaPackage.OBJECT_CREATION_EXPR__ANONYMOUS_CLASS_BODY:
            return anonymousClassBody != null && !anonymousClassBody.isEmpty();
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
        if( baseClass == NodeWithTypeArguments.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.OBJECT_CREATION_EXPR__TYPE_ARGUMENTS:
                return JavaPackage.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithType.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.OBJECT_CREATION_EXPR__TYPE:
                return JavaPackage.NODE_WITH_TYPE__TYPE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithArguments.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.OBJECT_CREATION_EXPR__ARGUMENTS:
                return JavaPackage.NODE_WITH_ARGUMENTS__ARGUMENTS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithScope.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.OBJECT_CREATION_EXPR__SCOPE:
                return JavaPackage.NODE_WITH_SCOPE__SCOPE;
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
        if( baseClass == NodeWithTypeArguments.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS:
                return JavaPackage.OBJECT_CREATION_EXPR__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithType.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_TYPE__TYPE:
                return JavaPackage.OBJECT_CREATION_EXPR__TYPE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithArguments.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_ARGUMENTS__ARGUMENTS:
                return JavaPackage.OBJECT_CREATION_EXPR__ARGUMENTS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithScope.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_SCOPE__SCOPE:
                return JavaPackage.OBJECT_CREATION_EXPR__SCOPE;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //ObjectCreationExprImpl
