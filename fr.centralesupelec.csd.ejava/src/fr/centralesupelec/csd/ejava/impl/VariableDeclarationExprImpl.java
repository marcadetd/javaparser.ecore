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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.csd.ejava.AnnotationExpr;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.ModifierKeyword;
import fr.centralesupelec.csd.ejava.NodeWithAnnotations;
import fr.centralesupelec.csd.ejava.NodeWithFinalModifier;
import fr.centralesupelec.csd.ejava.NodeWithModifiers;
import fr.centralesupelec.csd.ejava.NodeWithVariables;
import fr.centralesupelec.csd.ejava.VariableDeclarationExpr;
import fr.centralesupelec.csd.ejava.VariableDeclarator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.VariableDeclarationExprImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.VariableDeclarationExprImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.VariableDeclarationExprImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.impl.VariableDeclarationExprImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationExprImpl extends ExpressionImpl implements VariableDeclarationExpr {
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
     * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnnotations()
     * @generated
     * @ordered
     */
    protected EList< AnnotationExpr > annotations;

    /**
     * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariables()
     * @generated
     * @ordered
     */
    protected EList< VariableDeclarator > variables;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VariableDeclarationExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EJavaPackage.Literals.VARIABLE_DECLARATION_EXPR;
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
                    EJavaPackage.VARIABLE_DECLARATION_EXPR__MODIFIERS );
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
    public EList< AnnotationExpr > getAnnotations() {
        if( annotations == null ) {
            annotations = new EObjectContainmentEList< AnnotationExpr >( AnnotationExpr.class, this,
                    EJavaPackage.VARIABLE_DECLARATION_EXPR__ANNOTATIONS );
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< VariableDeclarator > getVariables() {
        if( variables == null ) {
            variables = new EObjectContainmentEList< VariableDeclarator >( VariableDeclarator.class, this,
                    EJavaPackage.VARIABLE_DECLARATION_EXPR__VARIABLES );
        }
        return variables;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__ANNOTATIONS:
            return ( ( InternalEList< ? > ) getAnnotations() ).basicRemove( otherEnd, msgs );
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__VARIABLES:
            return ( ( InternalEList< ? > ) getVariables() ).basicRemove( otherEnd, msgs );
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
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__MODIFIERS:
            return getModifiers();
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__FINAL:
            return isFinal();
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__ANNOTATIONS:
            return getAnnotations();
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__VARIABLES:
            return getVariables();
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
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__MODIFIERS:
            getModifiers().clear();
            getModifiers().addAll( ( Collection< ? extends ModifierKeyword > ) newValue );
            return;
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__FINAL:
            setFinal( ( Boolean ) newValue );
            return;
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__ANNOTATIONS:
            getAnnotations().clear();
            getAnnotations().addAll( ( Collection< ? extends AnnotationExpr > ) newValue );
            return;
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__VARIABLES:
            getVariables().clear();
            getVariables().addAll( ( Collection< ? extends VariableDeclarator > ) newValue );
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
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__MODIFIERS:
            getModifiers().clear();
            return;
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__FINAL:
            setFinal( FINAL_EDEFAULT );
            return;
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__ANNOTATIONS:
            getAnnotations().clear();
            return;
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__VARIABLES:
            getVariables().clear();
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
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__MODIFIERS:
            return modifiers != null && !modifiers.isEmpty();
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__FINAL:
            return isFinal() != FINAL_EDEFAULT;
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__ANNOTATIONS:
            return annotations != null && !annotations.isEmpty();
        case EJavaPackage.VARIABLE_DECLARATION_EXPR__VARIABLES:
            return variables != null && !variables.isEmpty();
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
            case EJavaPackage.VARIABLE_DECLARATION_EXPR__MODIFIERS:
                return EJavaPackage.NODE_WITH_MODIFIERS__MODIFIERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithFinalModifier.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.VARIABLE_DECLARATION_EXPR__FINAL:
                return EJavaPackage.NODE_WITH_FINAL_MODIFIER__FINAL;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAnnotations.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.VARIABLE_DECLARATION_EXPR__ANNOTATIONS:
                return EJavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithVariables.class ) {
            switch( derivedFeatureID ) {
            case EJavaPackage.VARIABLE_DECLARATION_EXPR__VARIABLES:
                return EJavaPackage.NODE_WITH_VARIABLES__VARIABLES;
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
                return EJavaPackage.VARIABLE_DECLARATION_EXPR__MODIFIERS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithFinalModifier.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_FINAL_MODIFIER__FINAL:
                return EJavaPackage.VARIABLE_DECLARATION_EXPR__FINAL;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithAnnotations.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS:
                return EJavaPackage.VARIABLE_DECLARATION_EXPR__ANNOTATIONS;
            default:
                return -1;
            }
        }
        if( baseClass == NodeWithVariables.class ) {
            switch( baseFeatureID ) {
            case EJavaPackage.NODE_WITH_VARIABLES__VARIABLES:
                return EJavaPackage.VARIABLE_DECLARATION_EXPR__VARIABLES;
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

} //VariableDeclarationExprImpl
