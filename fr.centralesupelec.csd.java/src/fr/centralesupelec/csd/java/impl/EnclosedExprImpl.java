/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.EnclosedExpr;
import fr.centralesupelec.csd.java.Expression;
import fr.centralesupelec.csd.java.JavaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enclosed Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.EnclosedExprImpl#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnclosedExprImpl extends ExpressionImpl implements EnclosedExpr {
	/**
     * The cached value of the '{@link #getInner() <em>Inner</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInner()
     * @generated
     * @ordered
     */
	protected Expression inner;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EnclosedExprImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.ENCLOSED_EXPR;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Expression getInner() {
        return inner;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetInner(Expression newInner, NotificationChain msgs) {
        Expression oldInner = inner;
        inner = newInner;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.ENCLOSED_EXPR__INNER, oldInner, newInner);
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
	public void setInner(Expression newInner) {
        if (newInner != inner) {
            NotificationChain msgs = null;
            if (inner != null)
                msgs = ((InternalEObject)inner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ENCLOSED_EXPR__INNER, null, msgs);
            if (newInner != null)
                msgs = ((InternalEObject)newInner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ENCLOSED_EXPR__INNER, null, msgs);
            msgs = basicSetInner(newInner, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ENCLOSED_EXPR__INNER, newInner, newInner));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JavaPackage.ENCLOSED_EXPR__INNER:
                return basicSetInner(null, msgs);
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
            case JavaPackage.ENCLOSED_EXPR__INNER:
                return getInner();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case JavaPackage.ENCLOSED_EXPR__INNER:
                setInner((Expression)newValue);
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
            case JavaPackage.ENCLOSED_EXPR__INNER:
                setInner((Expression)null);
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
            case JavaPackage.ENCLOSED_EXPR__INNER:
                return inner != null;
        }
        return super.eIsSet(featureID);
    }

} //EnclosedExprImpl
