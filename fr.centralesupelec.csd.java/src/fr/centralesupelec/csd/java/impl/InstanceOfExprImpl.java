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
import fr.centralesupelec.csd.java.InstanceOfExpr;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.NodeWithExpression;
import fr.centralesupelec.csd.java.NodeWithType;
import fr.centralesupelec.csd.java.PatternExpr;
import fr.centralesupelec.csd.java.ReferenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Of Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.InstanceOfExprImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.InstanceOfExprImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.InstanceOfExprImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceOfExprImpl extends ExpressionImpl implements InstanceOfExpr {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ReferenceType type;

    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected Expression expression;

    /**
     * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
    protected PatternExpr pattern;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InstanceOfExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JavaPackage.Literals.INSTANCE_OF_EXPR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReferenceType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType( ReferenceType newType, NotificationChain msgs ) {
        ReferenceType oldType = type;
        type = newType;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.INSTANCE_OF_EXPR__TYPE, oldType, newType );
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
    public void setType( ReferenceType newType ) {
        if( newType != type ) {
            NotificationChain msgs = null;
            if( type != null )
                msgs = ( ( InternalEObject ) type ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.INSTANCE_OF_EXPR__TYPE, null, msgs );
            if( newType != null )
                msgs = ( ( InternalEObject ) newType ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.INSTANCE_OF_EXPR__TYPE, null, msgs );
            msgs = basicSetType( newType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.INSTANCE_OF_EXPR__TYPE, newType,
                    newType ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression( Expression newExpression, NotificationChain msgs ) {
        Expression oldExpression = expression;
        expression = newExpression;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.INSTANCE_OF_EXPR__EXPRESSION, oldExpression, newExpression );
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
    public void setExpression( Expression newExpression ) {
        if( newExpression != expression ) {
            NotificationChain msgs = null;
            if( expression != null )
                msgs = ( ( InternalEObject ) expression ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.INSTANCE_OF_EXPR__EXPRESSION, null, msgs );
            if( newExpression != null )
                msgs = ( ( InternalEObject ) newExpression ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.INSTANCE_OF_EXPR__EXPRESSION, null, msgs );
            msgs = basicSetExpression( newExpression, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.INSTANCE_OF_EXPR__EXPRESSION,
                    newExpression, newExpression ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PatternExpr getPattern() {
        return pattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPattern( PatternExpr newPattern, NotificationChain msgs ) {
        PatternExpr oldPattern = pattern;
        pattern = newPattern;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    JavaPackage.INSTANCE_OF_EXPR__PATTERN, oldPattern, newPattern );
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
    public void setPattern( PatternExpr newPattern ) {
        if( newPattern != pattern ) {
            NotificationChain msgs = null;
            if( pattern != null )
                msgs = ( ( InternalEObject ) pattern ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.INSTANCE_OF_EXPR__PATTERN, null, msgs );
            if( newPattern != null )
                msgs = ( ( InternalEObject ) newPattern ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - JavaPackage.INSTANCE_OF_EXPR__PATTERN, null, msgs );
            msgs = basicSetPattern( newPattern, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, JavaPackage.INSTANCE_OF_EXPR__PATTERN, newPattern,
                    newPattern ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case JavaPackage.INSTANCE_OF_EXPR__TYPE:
            return basicSetType( null, msgs );
        case JavaPackage.INSTANCE_OF_EXPR__EXPRESSION:
            return basicSetExpression( null, msgs );
        case JavaPackage.INSTANCE_OF_EXPR__PATTERN:
            return basicSetPattern( null, msgs );
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
        case JavaPackage.INSTANCE_OF_EXPR__TYPE:
            return getType();
        case JavaPackage.INSTANCE_OF_EXPR__EXPRESSION:
            return getExpression();
        case JavaPackage.INSTANCE_OF_EXPR__PATTERN:
            return getPattern();
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
        case JavaPackage.INSTANCE_OF_EXPR__TYPE:
            setType( ( ReferenceType ) newValue );
            return;
        case JavaPackage.INSTANCE_OF_EXPR__EXPRESSION:
            setExpression( ( Expression ) newValue );
            return;
        case JavaPackage.INSTANCE_OF_EXPR__PATTERN:
            setPattern( ( PatternExpr ) newValue );
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
        case JavaPackage.INSTANCE_OF_EXPR__TYPE:
            setType( ( ReferenceType ) null );
            return;
        case JavaPackage.INSTANCE_OF_EXPR__EXPRESSION:
            setExpression( ( Expression ) null );
            return;
        case JavaPackage.INSTANCE_OF_EXPR__PATTERN:
            setPattern( ( PatternExpr ) null );
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
        case JavaPackage.INSTANCE_OF_EXPR__TYPE:
            return type != null;
        case JavaPackage.INSTANCE_OF_EXPR__EXPRESSION:
            return expression != null;
        case JavaPackage.INSTANCE_OF_EXPR__PATTERN:
            return pattern != null;
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
            case JavaPackage.INSTANCE_OF_EXPR__TYPE:
                return JavaPackage.NODE_WITH_TYPE__TYPE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithExpression.class ) {
            switch( derivedFeatureID ) {
            case JavaPackage.INSTANCE_OF_EXPR__EXPRESSION:
                return JavaPackage.NODE_WITH_EXPRESSION__EXPRESSION;
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
            case JavaPackage.NODE_WITH_TYPE__TYPE:
                return JavaPackage.INSTANCE_OF_EXPR__TYPE;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithExpression.class ) {
            switch( baseFeatureID ) {
            case JavaPackage.NODE_WITH_EXPRESSION__EXPRESSION:
                return JavaPackage.INSTANCE_OF_EXPR__EXPRESSION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

} //InstanceOfExprImpl
