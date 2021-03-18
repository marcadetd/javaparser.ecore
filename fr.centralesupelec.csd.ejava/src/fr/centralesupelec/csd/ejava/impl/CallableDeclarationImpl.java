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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.csd.ejava.CallableDeclaration;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.ModifierKeyword;
import fr.centralesupelec.csd.ejava.NodeWithAbstractModifier;
import fr.centralesupelec.csd.ejava.NodeWithAccessModifiers;
import fr.centralesupelec.csd.ejava.NodeWithFinalModifier;
import fr.centralesupelec.csd.ejava.NodeWithJavadoc;
import fr.centralesupelec.csd.ejava.NodeWithModifiers;
import fr.centralesupelec.csd.ejava.NodeWithParameters;
import fr.centralesupelec.csd.ejava.NodeWithPrivateModifier;
import fr.centralesupelec.csd.ejava.NodeWithProtectedModifier;
import fr.centralesupelec.csd.ejava.NodeWithPublicModifier;
import fr.centralesupelec.csd.ejava.NodeWithSimpleName;
import fr.centralesupelec.csd.ejava.NodeWithStaticModifier;
import fr.centralesupelec.csd.ejava.NodeWithStrictfpModifier;
import fr.centralesupelec.csd.ejava.NodeWithThrownExceptions;
import fr.centralesupelec.csd.ejava.NodeWithTypeParameters;
import fr.centralesupelec.csd.ejava.Parameter;
import fr.centralesupelec.csd.ejava.ReceiverParameter;
import fr.centralesupelec.csd.ejava.ReferenceType;
import fr.centralesupelec.csd.ejava.SimpleName;
import fr.centralesupelec.csd.ejava.TypeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#isPublic <em>Public</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#isPrivate <em>Private</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#isProtected <em>Protected</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#isStrictfp <em>Strictfp</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl#getReceiverParameter <em>Receiver Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CallableDeclarationImpl extends BodyDeclarationImpl implements CallableDeclaration {
    /**
     * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModifiers()
     * @generated
     * @ordered
     */
    protected EList< ModifierKeyword > modifiers;

    /**
     * The default value of the '{@link #isPublic() <em>Public</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPublic()
     * @generated
     * @ordered
     */
    protected static final boolean PUBLIC_EDEFAULT = false;

    /**
     * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPrivate()
     * @generated
     * @ordered
     */
    protected static final boolean PRIVATE_EDEFAULT = false;

    /**
     * The default value of the '{@link #isProtected() <em>Protected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isProtected()
     * @generated
     * @ordered
     */
    protected static final boolean PROTECTED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected SimpleName name;

    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected EList< Parameter > parameters;

    /**
     * The cached value of the '{@link #getThrownExceptions() <em>Thrown Exceptions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThrownExceptions()
     * @generated
     * @ordered
     */
    protected EList< ReferenceType > thrownExceptions;

    /**
     * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeParameters()
     * @generated
     * @ordered
     */
    protected EList< TypeParameter > typeParameters;

    /**
     * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
    protected static final boolean ABSTRACT_EDEFAULT = false;

    /**
     * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
    protected static final boolean STATIC_EDEFAULT = false;

    /**
     * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFinal()
     * @generated
     * @ordered
     */
    protected static final boolean FINAL_EDEFAULT = false;

    /**
     * The default value of the '{@link #isStrictfp() <em>Strictfp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStrictfp()
     * @generated
     * @ordered
     */
    protected static final boolean STRICTFP_EDEFAULT = false;

    /**
     * The cached value of the '{@link #getReceiverParameter() <em>Receiver Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiverParameter()
     * @generated
     * @ordered
     */
    protected ReceiverParameter receiverParameter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CallableDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.CALLABLE_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ModifierKeyword > getModifiers() {
        if( modifiers == null ) {
            modifiers = new EDataTypeUniqueEList< ModifierKeyword >( ModifierKeyword.class, this,
                    EJavaPackage.CALLABLE_DECLARATION__MODIFIERS );
        }
        return modifiers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isPublic() {
        return getModifiers().contains( ModifierKeyword.PUBLIC );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setPublic( boolean newPublic ) {
        if( newPublic )
            getModifiers().add( ModifierKeyword.PUBLIC );
        else
            getModifiers().remove( ModifierKeyword.PUBLIC );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isPrivate() {
        return getModifiers().contains( ModifierKeyword.PRIVATE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setPrivate( boolean newPrivate ) {
        if( newPrivate )
            getModifiers().add( ModifierKeyword.PRIVATE );
        else
            getModifiers().remove( ModifierKeyword.PRIVATE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isProtected() {
        return getModifiers().contains( ModifierKeyword.PROTECTED );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setProtected( boolean newProtected ) {
        if( newProtected )
            getModifiers().add( ModifierKeyword.PROTECTED );
        else
            getModifiers().remove( ModifierKeyword.PROTECTED );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SimpleName getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetName( SimpleName newName, NotificationChain msgs ) {
        SimpleName oldName = name;
        name = newName;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.CALLABLE_DECLARATION__NAME, oldName, newName );
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
    public void setName( SimpleName newName ) {
        if( newName != name ) {
            NotificationChain msgs = null;
            if( name != null )
                msgs = ( ( InternalEObject ) name ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CALLABLE_DECLARATION__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CALLABLE_DECLARATION__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.CALLABLE_DECLARATION__NAME, newName,
                    newName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Parameter > getParameters() {
        if( parameters == null ) {
            parameters = new EObjectContainmentEList< Parameter >( Parameter.class, this,
                    EJavaPackage.CALLABLE_DECLARATION__PARAMETERS );
        }
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ReferenceType > getThrownExceptions() {
        if( thrownExceptions == null ) {
            thrownExceptions = new EObjectContainmentEList< ReferenceType >( ReferenceType.class, this,
                    EJavaPackage.CALLABLE_DECLARATION__THROWN_EXCEPTIONS );
        }
        return thrownExceptions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TypeParameter > getTypeParameters() {
        if( typeParameters == null ) {
            typeParameters = new EObjectContainmentEList< TypeParameter >( TypeParameter.class, this,
                    EJavaPackage.CALLABLE_DECLARATION__TYPE_PARAMETERS );
        }
        return typeParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isAbstract() {
        return getModifiers().contains( ModifierKeyword.ABSTRACT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setAbstract( boolean newAbstract ) {
        if( newAbstract )
            getModifiers().add( ModifierKeyword.ABSTRACT );
        else
            getModifiers().remove( ModifierKeyword.ABSTRACT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isStatic() {
        return getModifiers().contains( ModifierKeyword.STATIC );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setStatic( boolean newStatic ) {
        if( newStatic )
            getModifiers().add( ModifierKeyword.STATIC );
        else
            getModifiers().remove( ModifierKeyword.STATIC );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isFinal() {
        return getModifiers().contains( ModifierKeyword.FINAL );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setFinal( boolean newFinal ) {
        if( newFinal )
            getModifiers().add( ModifierKeyword.FINAL );
        else
            getModifiers().remove( ModifierKeyword.FINAL );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isStrictfp() {
        return getModifiers().contains( ModifierKeyword.STRICTFP );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setStrictfp( boolean newStrictfp ) {
        if( newStrictfp )
            getModifiers().add( ModifierKeyword.STRICTFP );
        else
            getModifiers().remove( ModifierKeyword.STRICTFP );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReceiverParameter getReceiverParameter() {
        return receiverParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReceiverParameter( ReceiverParameter newReceiverParameter,
            NotificationChain msgs ) {
        ReceiverParameter oldReceiverParameter = receiverParameter;
        receiverParameter = newReceiverParameter;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.CALLABLE_DECLARATION__RECEIVER_PARAMETER, oldReceiverParameter, newReceiverParameter );
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
    public void setReceiverParameter( ReceiverParameter newReceiverParameter ) {
        if( newReceiverParameter != receiverParameter ) {
            NotificationChain msgs = null;
            if( receiverParameter != null )
                msgs = ( ( InternalEObject ) receiverParameter ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CALLABLE_DECLARATION__RECEIVER_PARAMETER, null, msgs );
            if( newReceiverParameter != null )
                msgs = ( ( InternalEObject ) newReceiverParameter ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.CALLABLE_DECLARATION__RECEIVER_PARAMETER, null, msgs );
            msgs = basicSetReceiverParameter( newReceiverParameter, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.CALLABLE_DECLARATION__RECEIVER_PARAMETER, newReceiverParameter,
                    newReceiverParameter ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.CALLABLE_DECLARATION__NAME:
            return basicSetName( null, msgs );
        case EJavaPackage.CALLABLE_DECLARATION__PARAMETERS:
            return ( ( InternalEList< ? > ) getParameters() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.CALLABLE_DECLARATION__THROWN_EXCEPTIONS:
            return ( ( InternalEList< ? > ) getThrownExceptions() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.CALLABLE_DECLARATION__TYPE_PARAMETERS:
            return ( ( InternalEList< ? > ) getTypeParameters() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.CALLABLE_DECLARATION__RECEIVER_PARAMETER:
            return basicSetReceiverParameter( null, msgs );
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
        case EJavaPackage.CALLABLE_DECLARATION__MODIFIERS:
            return getModifiers();
        case EJavaPackage.CALLABLE_DECLARATION__PUBLIC:
            return isPublic();
        case EJavaPackage.CALLABLE_DECLARATION__PRIVATE:
            return isPrivate();
        case EJavaPackage.CALLABLE_DECLARATION__PROTECTED:
            return isProtected();
        case EJavaPackage.CALLABLE_DECLARATION__NAME:
            return getName();
        case EJavaPackage.CALLABLE_DECLARATION__PARAMETERS:
            return getParameters();
        case EJavaPackage.CALLABLE_DECLARATION__THROWN_EXCEPTIONS:
            return getThrownExceptions();
        case EJavaPackage.CALLABLE_DECLARATION__TYPE_PARAMETERS:
            return getTypeParameters();
        case EJavaPackage.CALLABLE_DECLARATION__ABSTRACT:
            return isAbstract();
        case EJavaPackage.CALLABLE_DECLARATION__STATIC:
            return isStatic();
        case EJavaPackage.CALLABLE_DECLARATION__FINAL:
            return isFinal();
        case EJavaPackage.CALLABLE_DECLARATION__STRICTFP:
            return isStrictfp();
        case EJavaPackage.CALLABLE_DECLARATION__RECEIVER_PARAMETER:
            return getReceiverParameter();
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
        case EJavaPackage.CALLABLE_DECLARATION__MODIFIERS:
            getModifiers().clear();
            getModifiers().addAll( ( Collection< ? extends ModifierKeyword > ) newValue );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__PUBLIC:
            setPublic( ( Boolean ) newValue );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__PRIVATE:
            setPrivate( ( Boolean ) newValue );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__PROTECTED:
            setProtected( ( Boolean ) newValue );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__NAME:
            setName( ( SimpleName ) newValue );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__PARAMETERS:
            getParameters().clear();
            getParameters().addAll( ( Collection< ? extends Parameter > ) newValue );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__THROWN_EXCEPTIONS:
            getThrownExceptions().clear();
            getThrownExceptions().addAll( ( Collection< ? extends ReferenceType > ) newValue );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__TYPE_PARAMETERS:
            getTypeParameters().clear();
            getTypeParameters().addAll( ( Collection< ? extends TypeParameter > ) newValue );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__ABSTRACT:
            setAbstract( ( Boolean ) newValue );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__STATIC:
            setStatic( ( Boolean ) newValue );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__FINAL:
            setFinal( ( Boolean ) newValue );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__STRICTFP:
            setStrictfp( ( Boolean ) newValue );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__RECEIVER_PARAMETER:
            setReceiverParameter( ( ReceiverParameter ) newValue );
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
        case EJavaPackage.CALLABLE_DECLARATION__MODIFIERS:
            getModifiers().clear();
            return;
        case EJavaPackage.CALLABLE_DECLARATION__PUBLIC:
            setPublic( PUBLIC_EDEFAULT );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__PRIVATE:
            setPrivate( PRIVATE_EDEFAULT );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__PROTECTED:
            setProtected( PROTECTED_EDEFAULT );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__NAME:
            setName( ( SimpleName ) null );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__PARAMETERS:
            getParameters().clear();
            return;
        case EJavaPackage.CALLABLE_DECLARATION__THROWN_EXCEPTIONS:
            getThrownExceptions().clear();
            return;
        case EJavaPackage.CALLABLE_DECLARATION__TYPE_PARAMETERS:
            getTypeParameters().clear();
            return;
        case EJavaPackage.CALLABLE_DECLARATION__ABSTRACT:
            setAbstract( ABSTRACT_EDEFAULT );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__STATIC:
            setStatic( STATIC_EDEFAULT );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__FINAL:
            setFinal( FINAL_EDEFAULT );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__STRICTFP:
            setStrictfp( STRICTFP_EDEFAULT );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__RECEIVER_PARAMETER:
            setReceiverParameter( ( ReceiverParameter ) null );
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
        case EJavaPackage.CALLABLE_DECLARATION__MODIFIERS:
            return modifiers != null && !modifiers.isEmpty();
        case EJavaPackage.CALLABLE_DECLARATION__PUBLIC:
            return isPublic() != PUBLIC_EDEFAULT;
        case EJavaPackage.CALLABLE_DECLARATION__PRIVATE:
            return isPrivate() != PRIVATE_EDEFAULT;
        case EJavaPackage.CALLABLE_DECLARATION__PROTECTED:
            return isProtected() != PROTECTED_EDEFAULT;
        case EJavaPackage.CALLABLE_DECLARATION__NAME:
            return name != null;
        case EJavaPackage.CALLABLE_DECLARATION__PARAMETERS:
            return parameters != null && !parameters.isEmpty();
        case EJavaPackage.CALLABLE_DECLARATION__THROWN_EXCEPTIONS:
            return thrownExceptions != null && !thrownExceptions.isEmpty();
        case EJavaPackage.CALLABLE_DECLARATION__TYPE_PARAMETERS:
            return typeParameters != null && !typeParameters.isEmpty();
        case EJavaPackage.CALLABLE_DECLARATION__ABSTRACT:
            return isAbstract() != ABSTRACT_EDEFAULT;
        case EJavaPackage.CALLABLE_DECLARATION__STATIC:
            return isStatic() != STATIC_EDEFAULT;
        case EJavaPackage.CALLABLE_DECLARATION__FINAL:
            return isFinal() != FINAL_EDEFAULT;
        case EJavaPackage.CALLABLE_DECLARATION__STRICTFP:
            return isStrictfp() != STRICTFP_EDEFAULT;
        case EJavaPackage.CALLABLE_DECLARATION__RECEIVER_PARAMETER:
            return receiverParameter != null;
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
        if( baseClass == NodeWithModifiers.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CALLABLE_DECLARATION__MODIFIERS:
                return EJavaPackage.NODE_WITH_MODIFIERS__MODIFIERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithPublicModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CALLABLE_DECLARATION__PUBLIC:
                return EJavaPackage.NODE_WITH_PUBLIC_MODIFIER__PUBLIC;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithPrivateModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CALLABLE_DECLARATION__PRIVATE:
                return EJavaPackage.NODE_WITH_PRIVATE_MODIFIER__PRIVATE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithProtectedModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CALLABLE_DECLARATION__PROTECTED:
                return EJavaPackage.NODE_WITH_PROTECTED_MODIFIER__PROTECTED;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAccessModifiers.class ) {
            switch( derivedFeatureID ) {
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithSimpleName.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CALLABLE_DECLARATION__NAME:
                return EJavaPackage.NODE_WITH_SIMPLE_NAME__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithParameters.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CALLABLE_DECLARATION__PARAMETERS:
                return EJavaPackage.NODE_WITH_PARAMETERS__PARAMETERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithThrownExceptions.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CALLABLE_DECLARATION__THROWN_EXCEPTIONS:
                return EJavaPackage.NODE_WITH_THROWN_EXCEPTIONS__THROWN_EXCEPTIONS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithTypeParameters.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CALLABLE_DECLARATION__TYPE_PARAMETERS:
                return EJavaPackage.NODE_WITH_TYPE_PARAMETERS__TYPE_PARAMETERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithJavadoc.class ) {
            switch( derivedFeatureID ) {
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAbstractModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CALLABLE_DECLARATION__ABSTRACT:
                return EJavaPackage.NODE_WITH_ABSTRACT_MODIFIER__ABSTRACT;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithStaticModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CALLABLE_DECLARATION__STATIC:
                return EJavaPackage.NODE_WITH_STATIC_MODIFIER__STATIC;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithFinalModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CALLABLE_DECLARATION__FINAL:
                return EJavaPackage.NODE_WITH_FINAL_MODIFIER__FINAL;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithStrictfpModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.CALLABLE_DECLARATION__STRICTFP:
                return EJavaPackage.NODE_WITH_STRICTFP_MODIFIER__STRICTFP;
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
        if( baseClass == NodeWithModifiers.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_MODIFIERS__MODIFIERS:
                return EJavaPackage.CALLABLE_DECLARATION__MODIFIERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithPublicModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_PUBLIC_MODIFIER__PUBLIC:
                return EJavaPackage.CALLABLE_DECLARATION__PUBLIC;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithPrivateModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_PRIVATE_MODIFIER__PRIVATE:
                return EJavaPackage.CALLABLE_DECLARATION__PRIVATE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithProtectedModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_PROTECTED_MODIFIER__PROTECTED:
                return EJavaPackage.CALLABLE_DECLARATION__PROTECTED;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAccessModifiers.class ) {
            switch( baseFeatureID ) {
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithSimpleName.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_SIMPLE_NAME__NAME:
                return EJavaPackage.CALLABLE_DECLARATION__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithParameters.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_PARAMETERS__PARAMETERS:
                return EJavaPackage.CALLABLE_DECLARATION__PARAMETERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithThrownExceptions.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_THROWN_EXCEPTIONS__THROWN_EXCEPTIONS:
                return EJavaPackage.CALLABLE_DECLARATION__THROWN_EXCEPTIONS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithTypeParameters.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_TYPE_PARAMETERS__TYPE_PARAMETERS:
                return EJavaPackage.CALLABLE_DECLARATION__TYPE_PARAMETERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithJavadoc.class ) {
            switch( baseFeatureID ) {
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAbstractModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_ABSTRACT_MODIFIER__ABSTRACT:
                return EJavaPackage.CALLABLE_DECLARATION__ABSTRACT;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithStaticModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_STATIC_MODIFIER__STATIC:
                return EJavaPackage.CALLABLE_DECLARATION__STATIC;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithFinalModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_FINAL_MODIFIER__FINAL:
                return EJavaPackage.CALLABLE_DECLARATION__FINAL;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithStrictfpModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_STRICTFP_MODIFIER__STRICTFP:
                return EJavaPackage.CALLABLE_DECLARATION__STRICTFP;
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
        result.append( " (modifiers: " );
        result.append( modifiers );
        result.append( ')' );
        return result.toString();
    }

} //CallableDeclarationImpl
