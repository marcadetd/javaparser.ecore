/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.Expression;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.MethodReferenceExpr;
import fr.centralesupelec.csd.java.NodeWithIdentifier;
import fr.centralesupelec.csd.java.NodeWithScope;
import fr.centralesupelec.csd.java.NodeWithTypeArguments;
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
 * An implementation of the model object '<em><b>Method Reference Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.MethodReferenceExprImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.MethodReferenceExprImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.MethodReferenceExprImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodReferenceExprImpl extends ExpressionImpl implements MethodReferenceExpr {
	/**
     * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTypeArguments()
     * @generated
     * @ordered
     */
	protected EList<Type> typeArguments;

	/**
     * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIdentifier()
     * @generated
     * @ordered
     */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIdentifier()
     * @generated
     * @ordered
     */
	protected String identifier = IDENTIFIER_EDEFAULT;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MethodReferenceExprImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.METHOD_REFERENCE_EXPR;
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
	public NotificationChain basicSetScope(Expression newScope, NotificationChain msgs) {
        Expression oldScope = scope;
        scope = newScope;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_REFERENCE_EXPR__SCOPE, oldScope, newScope);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setScope(Expression newScope) {
        if (newScope != scope) {
            NotificationChain msgs = null;
            if (scope != null)
                msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD_REFERENCE_EXPR__SCOPE, null, msgs);
            if (newScope != null)
                msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD_REFERENCE_EXPR__SCOPE, null, msgs);
            msgs = basicSetScope(newScope, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_REFERENCE_EXPR__SCOPE, newScope, newScope));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<Type> getTypeArguments() {
        if (typeArguments == null) {
            typeArguments = new EObjectContainmentEList<Type>(Type.class, this, JavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS);
        }
        return typeArguments;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getIdentifier() {
        return identifier;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setIdentifier(String newIdentifier) {
        String oldIdentifier = identifier;
        identifier = newIdentifier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER, oldIdentifier, identifier));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS:
                return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
            case JavaPackage.METHOD_REFERENCE_EXPR__SCOPE:
                return basicSetScope(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case JavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS:
                return getTypeArguments();
            case JavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER:
                return getIdentifier();
            case JavaPackage.METHOD_REFERENCE_EXPR__SCOPE:
                return getScope();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case JavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS:
                getTypeArguments().clear();
                getTypeArguments().addAll((Collection<? extends Type>)newValue);
                return;
            case JavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER:
                setIdentifier((String)newValue);
                return;
            case JavaPackage.METHOD_REFERENCE_EXPR__SCOPE:
                setScope((Expression)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case JavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS:
                getTypeArguments().clear();
                return;
            case JavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER:
                setIdentifier(IDENTIFIER_EDEFAULT);
                return;
            case JavaPackage.METHOD_REFERENCE_EXPR__SCOPE:
                setScope((Expression)null);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case JavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS:
                return typeArguments != null && !typeArguments.isEmpty();
            case JavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER:
                return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
            case JavaPackage.METHOD_REFERENCE_EXPR__SCOPE:
                return scope != null;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == NodeWithTypeArguments.class) {
            switch (derivedFeatureID) {
                case JavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS: return JavaPackage.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS;
                default: return -1;
            }
        }
        if (baseClass == NodeWithIdentifier.class) {
            switch (derivedFeatureID) {
                case JavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER: return JavaPackage.NODE_WITH_IDENTIFIER__IDENTIFIER;
                default: return -1;
            }
        }
        if (baseClass == NodeWithScope.class) {
            switch (derivedFeatureID) {
                case JavaPackage.METHOD_REFERENCE_EXPR__SCOPE: return JavaPackage.NODE_WITH_SCOPE__SCOPE;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == NodeWithTypeArguments.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS: return JavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS;
                default: return -1;
            }
        }
        if (baseClass == NodeWithIdentifier.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_IDENTIFIER__IDENTIFIER: return JavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER;
                default: return -1;
            }
        }
        if (baseClass == NodeWithScope.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_SCOPE__SCOPE: return JavaPackage.METHOD_REFERENCE_EXPR__SCOPE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (identifier: ");
        result.append(identifier);
        result.append(')');
        return result.toString();
    }

} //MethodReferenceExprImpl
