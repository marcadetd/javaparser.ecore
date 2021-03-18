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

import fr.centralesupelec.csd.ejava.AnnotationExpr;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.ModifierKeyword;
import fr.centralesupelec.csd.ejava.NodeWithAnnotations;
import fr.centralesupelec.csd.ejava.NodeWithFinalModifier;
import fr.centralesupelec.csd.ejava.NodeWithModifiers;
import fr.centralesupelec.csd.ejava.NodeWithSimpleName;
import fr.centralesupelec.csd.ejava.NodeWithType;
import fr.centralesupelec.csd.ejava.Parameter;
import fr.centralesupelec.csd.ejava.SimpleName;
import fr.centralesupelec.csd.ejava.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ParameterImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ParameterImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ParameterImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ParameterImpl#isVarArgs <em>Var Args</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.ParameterImpl#getVarArgsAnnotations <em>Var Args Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends JavaNodeImpl implements Parameter {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected Type type;

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
     * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected SimpleName name;

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
     * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFinal()
     * @generated
     * @ordered
     */
    protected static final boolean FINAL_EDEFAULT = false;

    /**
     * The default value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isVarArgs()
     * @generated
     * @ordered
     */
    protected static final boolean VAR_ARGS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isVarArgs()
     * @generated
     * @ordered
     */
    protected boolean varArgs = VAR_ARGS_EDEFAULT;

    /**
     * The cached value of the '{@link #getVarArgsAnnotations() <em>Var Args Annotations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVarArgsAnnotations()
     * @generated
     * @ordered
     */
    protected EList< AnnotationExpr > varArgsAnnotations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType( Type newType, NotificationChain msgs ) {
        Type oldType = type;
        type = newType;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EJavaPackage.PARAMETER__TYPE, oldType, newType );
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
    public void setType( Type newType ) {
        if( newType != type ) {
            NotificationChain msgs = null;
            if( type != null )
                msgs = ( ( InternalEObject ) type ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.PARAMETER__TYPE, null, msgs );
            if( newType != null )
                msgs = ( ( InternalEObject ) newType ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.PARAMETER__TYPE, null, msgs );
            msgs = basicSetType( newType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.PARAMETER__TYPE, newType, newType ) );
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
                    EJavaPackage.PARAMETER__ANNOTATIONS );
        }
        return annotations;
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
                    EJavaPackage.PARAMETER__NAME, oldName, newName );
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
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.PARAMETER__NAME, null, msgs );
            if( newName != null )
                msgs = ( ( InternalEObject ) newName ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - EJavaPackage.PARAMETER__NAME, null, msgs );
            msgs = basicSetName( newName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.PARAMETER__NAME, newName, newName ) );
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
                    EJavaPackage.PARAMETER__MODIFIERS );
        }
        return modifiers;
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
     * @generated
     */
    @Override
    public boolean isVarArgs() {
        return varArgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVarArgs( boolean newVarArgs ) {
        boolean oldVarArgs = varArgs;
        varArgs = newVarArgs;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.PARAMETER__VAR_ARGS, oldVarArgs,
                    varArgs ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AnnotationExpr > getVarArgsAnnotations() {
        if( varArgsAnnotations == null ) {
            varArgsAnnotations = new EObjectContainmentEList< AnnotationExpr >( AnnotationExpr.class, this,
                    EJavaPackage.PARAMETER__VAR_ARGS_ANNOTATIONS );
        }
        return varArgsAnnotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.PARAMETER__TYPE:
            return basicSetType( null, msgs );
        case EJavaPackage.PARAMETER__ANNOTATIONS:
            return ( ( InternalEList< ? > ) getAnnotations() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.PARAMETER__NAME:
            return basicSetName( null, msgs );
        case EJavaPackage.PARAMETER__VAR_ARGS_ANNOTATIONS:
            return ( ( InternalEList< ? > ) getVarArgsAnnotations() ).basicRemove( otherEnd, msgs );
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
        case EJavaPackage.PARAMETER__TYPE:
            return getType();
        case EJavaPackage.PARAMETER__ANNOTATIONS:
            return getAnnotations();
        case EJavaPackage.PARAMETER__NAME:
            return getName();
        case EJavaPackage.PARAMETER__MODIFIERS:
            return getModifiers();
        case EJavaPackage.PARAMETER__FINAL:
            return isFinal();
        case EJavaPackage.PARAMETER__VAR_ARGS:
            return isVarArgs();
        case EJavaPackage.PARAMETER__VAR_ARGS_ANNOTATIONS:
            return getVarArgsAnnotations();
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
        case EJavaPackage.PARAMETER__TYPE:
            setType( ( Type ) newValue );
            return;
        case EJavaPackage.PARAMETER__ANNOTATIONS:
            getAnnotations().clear();
            getAnnotations().addAll( ( Collection< ? extends AnnotationExpr > ) newValue );
            return;
        case EJavaPackage.PARAMETER__NAME:
            setName( ( SimpleName ) newValue );
            return;
        case EJavaPackage.PARAMETER__MODIFIERS:
            getModifiers().clear();
            getModifiers().addAll( ( Collection< ? extends ModifierKeyword > ) newValue );
            return;
        case EJavaPackage.PARAMETER__FINAL:
            setFinal( ( Boolean ) newValue );
            return;
        case EJavaPackage.PARAMETER__VAR_ARGS:
            setVarArgs( ( Boolean ) newValue );
            return;
        case EJavaPackage.PARAMETER__VAR_ARGS_ANNOTATIONS:
            getVarArgsAnnotations().clear();
            getVarArgsAnnotations().addAll( ( Collection< ? extends AnnotationExpr > ) newValue );
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
        case EJavaPackage.PARAMETER__TYPE:
            setType( ( Type ) null );
            return;
        case EJavaPackage.PARAMETER__ANNOTATIONS:
            getAnnotations().clear();
            return;
        case EJavaPackage.PARAMETER__NAME:
            setName( ( SimpleName ) null );
            return;
        case EJavaPackage.PARAMETER__MODIFIERS:
            getModifiers().clear();
            return;
        case EJavaPackage.PARAMETER__FINAL:
            setFinal( FINAL_EDEFAULT );
            return;
        case EJavaPackage.PARAMETER__VAR_ARGS:
            setVarArgs( VAR_ARGS_EDEFAULT );
            return;
        case EJavaPackage.PARAMETER__VAR_ARGS_ANNOTATIONS:
            getVarArgsAnnotations().clear();
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
        case EJavaPackage.PARAMETER__TYPE:
            return type != null;
        case EJavaPackage.PARAMETER__ANNOTATIONS:
            return annotations != null && !annotations.isEmpty();
        case EJavaPackage.PARAMETER__NAME:
            return name != null;
        case EJavaPackage.PARAMETER__MODIFIERS:
            return modifiers != null && !modifiers.isEmpty();
        case EJavaPackage.PARAMETER__FINAL:
            return isFinal() != FINAL_EDEFAULT;
        case EJavaPackage.PARAMETER__VAR_ARGS:
            return varArgs != VAR_ARGS_EDEFAULT;
        case EJavaPackage.PARAMETER__VAR_ARGS_ANNOTATIONS:
            return varArgsAnnotations != null && !varArgsAnnotations.isEmpty();
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
        if( baseClass == NodeWithType.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.PARAMETER__TYPE:
                return EJavaPackage.NODE_WITH_TYPE__TYPE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAnnotations.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.PARAMETER__ANNOTATIONS:
                return EJavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithSimpleName.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.PARAMETER__NAME:
                return EJavaPackage.NODE_WITH_SIMPLE_NAME__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithModifiers.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.PARAMETER__MODIFIERS:
                return EJavaPackage.NODE_WITH_MODIFIERS__MODIFIERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithFinalModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.PARAMETER__FINAL:
                return EJavaPackage.NODE_WITH_FINAL_MODIFIER__FINAL;
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
        if( baseClass == NodeWithType.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_TYPE__TYPE:
                return EJavaPackage.PARAMETER__TYPE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAnnotations.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS:
                return EJavaPackage.PARAMETER__ANNOTATIONS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithSimpleName.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_SIMPLE_NAME__NAME:
                return EJavaPackage.PARAMETER__NAME;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithModifiers.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_MODIFIERS__MODIFIERS:
                return EJavaPackage.PARAMETER__MODIFIERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithFinalModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_FINAL_MODIFIER__FINAL:
                return EJavaPackage.PARAMETER__FINAL;
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
        result.append( ", varArgs: " );
        result.append( varArgs );
        result.append( ')' );
        return result.toString();
    }

} //ParameterImpl
