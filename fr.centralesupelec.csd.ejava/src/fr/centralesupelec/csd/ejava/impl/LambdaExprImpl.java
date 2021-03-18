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

import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.LambdaExpr;
import fr.centralesupelec.csd.ejava.NodeWithParameters;
import fr.centralesupelec.csd.ejava.Parameter;
import fr.centralesupelec.csd.ejava.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lambda Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.LambdaExprImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.LambdaExprImpl#isEnclosingParameters <em>Enclosing Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.LambdaExprImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LambdaExprImpl extends ExpressionImpl implements LambdaExpr {
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
     * The default value of the '{@link #isEnclosingParameters() <em>Enclosing Parameters</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEnclosingParameters()
     * @generated
     * @ordered
     */
    protected static final boolean ENCLOSING_PARAMETERS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isEnclosingParameters() <em>Enclosing Parameters</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEnclosingParameters()
     * @generated
     * @ordered
     */
    protected boolean enclosingParameters = ENCLOSING_PARAMETERS_EDEFAULT;

    /**
     * The cached value of the '{@link #getBody() <em>Body</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBody()
     * @generated
     * @ordered
     */
    protected Statement body;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LambdaExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.LAMBDA_EXPR;
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
                    EJavaPackage.LAMBDA_EXPR__PARAMETERS );
        }
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isEnclosingParameters() {
        return enclosingParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnclosingParameters( boolean newEnclosingParameters ) {
        boolean oldEnclosingParameters = enclosingParameters;
        enclosingParameters = newEnclosingParameters;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.LAMBDA_EXPR__ENCLOSING_PARAMETERS,
                    oldEnclosingParameters, enclosingParameters ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Statement getBody() {
        if( body != null && body.eIsProxy() ) {
            InternalEObject oldBody = ( InternalEObject ) body;
            body = ( Statement ) eResolveProxy( oldBody );
            if( body != oldBody ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, EJavaPackage.LAMBDA_EXPR__BODY, oldBody,
                            body ) );
            }
        }
        return body;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Statement basicGetBody() {
        return body;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBody( Statement newBody ) {
        Statement oldBody = body;
        body = newBody;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EJavaPackage.LAMBDA_EXPR__BODY, oldBody, body ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.LAMBDA_EXPR__PARAMETERS:
            return ( ( InternalEList< ? > ) getParameters() ).basicRemove( otherEnd, msgs );
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
        case EJavaPackage.LAMBDA_EXPR__PARAMETERS:
            return getParameters();
        case EJavaPackage.LAMBDA_EXPR__ENCLOSING_PARAMETERS:
            return isEnclosingParameters();
        case EJavaPackage.LAMBDA_EXPR__BODY:
            if( resolve ) return getBody();
            return basicGetBody();
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
        case EJavaPackage.LAMBDA_EXPR__PARAMETERS:
            getParameters().clear();
            getParameters().addAll( ( Collection< ? extends Parameter > ) newValue );
            return;
        case EJavaPackage.LAMBDA_EXPR__ENCLOSING_PARAMETERS:
            setEnclosingParameters( ( Boolean ) newValue );
            return;
        case EJavaPackage.LAMBDA_EXPR__BODY:
            setBody( ( Statement ) newValue );
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
        case EJavaPackage.LAMBDA_EXPR__PARAMETERS:
            getParameters().clear();
            return;
        case EJavaPackage.LAMBDA_EXPR__ENCLOSING_PARAMETERS:
            setEnclosingParameters( ENCLOSING_PARAMETERS_EDEFAULT );
            return;
        case EJavaPackage.LAMBDA_EXPR__BODY:
            setBody( ( Statement ) null );
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
        case EJavaPackage.LAMBDA_EXPR__PARAMETERS:
            return parameters != null && !parameters.isEmpty();
        case EJavaPackage.LAMBDA_EXPR__ENCLOSING_PARAMETERS:
            return enclosingParameters != ENCLOSING_PARAMETERS_EDEFAULT;
        case EJavaPackage.LAMBDA_EXPR__BODY:
            return body != null;
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
        if( baseClass == NodeWithParameters.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.LAMBDA_EXPR__PARAMETERS:
                return EJavaPackage.NODE_WITH_PARAMETERS__PARAMETERS;
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
        if( baseClass == NodeWithParameters.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_PARAMETERS__PARAMETERS:
                return EJavaPackage.LAMBDA_EXPR__PARAMETERS;
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
        result.append( " (enclosingParameters: " );
        result.append( enclosingParameters );
        result.append( ')' );
        return result.toString();
    }

} //LambdaExprImpl
