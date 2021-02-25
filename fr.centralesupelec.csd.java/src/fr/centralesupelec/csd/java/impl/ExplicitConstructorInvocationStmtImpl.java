/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.ExplicitConstructorInvocationStmt;
import fr.centralesupelec.csd.java.Expression;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.NodeWithArguments;
import fr.centralesupelec.csd.java.NodeWithExpression;
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
 * An implementation of the model object '<em><b>Explicit Constructor Invocation Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ExplicitConstructorInvocationStmtImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ExplicitConstructorInvocationStmtImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ExplicitConstructorInvocationStmtImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ExplicitConstructorInvocationStmtImpl#isIsThis <em>Is This</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplicitConstructorInvocationStmtImpl extends StatementImpl implements ExplicitConstructorInvocationStmt {
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
     * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getArguments()
     * @generated
     * @ordered
     */
	protected EList<Expression> arguments;

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
     * The default value of the '{@link #isIsThis() <em>Is This</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIsThis()
     * @generated
     * @ordered
     */
	protected static final boolean IS_THIS_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isIsThis() <em>Is This</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIsThis()
     * @generated
     * @ordered
     */
	protected boolean isThis = IS_THIS_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ExplicitConstructorInvocationStmtImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<Type> getTypeArguments() {
        if (typeArguments == null) {
            typeArguments = new EObjectContainmentEList<Type>(Type.class, this, JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__TYPE_ARGUMENTS);
        }
        return typeArguments;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<Expression> getArguments() {
        if (arguments == null) {
            arguments = new EObjectContainmentEList<Expression>(Expression.class, this, JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__ARGUMENTS);
        }
        return arguments;
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
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
        Expression oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(Expression newExpression) {
        if (newExpression != expression) {
            NotificationChain msgs = null;
            if (expression != null)
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__EXPRESSION, newExpression, newExpression));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isIsThis() {
        return isThis;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setIsThis(boolean newIsThis) {
        boolean oldIsThis = isThis;
        isThis = newIsThis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__IS_THIS, oldIsThis, isThis));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__TYPE_ARGUMENTS:
                return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__ARGUMENTS:
                return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__EXPRESSION:
                return basicSetExpression(null, msgs);
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
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__TYPE_ARGUMENTS:
                return getTypeArguments();
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__ARGUMENTS:
                return getArguments();
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__EXPRESSION:
                return getExpression();
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__IS_THIS:
                return isIsThis();
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
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__TYPE_ARGUMENTS:
                getTypeArguments().clear();
                getTypeArguments().addAll((Collection<? extends Type>)newValue);
                return;
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__ARGUMENTS:
                getArguments().clear();
                getArguments().addAll((Collection<? extends Expression>)newValue);
                return;
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__EXPRESSION:
                setExpression((Expression)newValue);
                return;
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__IS_THIS:
                setIsThis((Boolean)newValue);
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
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__TYPE_ARGUMENTS:
                getTypeArguments().clear();
                return;
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__ARGUMENTS:
                getArguments().clear();
                return;
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__EXPRESSION:
                setExpression((Expression)null);
                return;
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__IS_THIS:
                setIsThis(IS_THIS_EDEFAULT);
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
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__TYPE_ARGUMENTS:
                return typeArguments != null && !typeArguments.isEmpty();
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__ARGUMENTS:
                return arguments != null && !arguments.isEmpty();
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__EXPRESSION:
                return expression != null;
            case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__IS_THIS:
                return isThis != IS_THIS_EDEFAULT;
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
                case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__TYPE_ARGUMENTS: return JavaPackage.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS;
                default: return -1;
            }
        }
        if (baseClass == NodeWithArguments.class) {
            switch (derivedFeatureID) {
                case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__ARGUMENTS: return JavaPackage.NODE_WITH_ARGUMENTS__ARGUMENTS;
                default: return -1;
            }
        }
        if (baseClass == NodeWithExpression.class) {
            switch (derivedFeatureID) {
                case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__EXPRESSION: return JavaPackage.NODE_WITH_EXPRESSION__EXPRESSION;
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
                case JavaPackage.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS: return JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__TYPE_ARGUMENTS;
                default: return -1;
            }
        }
        if (baseClass == NodeWithArguments.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_ARGUMENTS__ARGUMENTS: return JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__ARGUMENTS;
                default: return -1;
            }
        }
        if (baseClass == NodeWithExpression.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_EXPRESSION__EXPRESSION: return JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__EXPRESSION;
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
        result.append(" (isThis: ");
        result.append(isThis);
        result.append(')');
        return result.toString();
    }

} //ExplicitConstructorInvocationStmtImpl
