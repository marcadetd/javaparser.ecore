/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.Expression;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.SingleMemberAnnotationExpr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Member Annotation Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.SingleMemberAnnotationExprImpl#getMemberValue <em>Member Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleMemberAnnotationExprImpl extends AnnotationExprImpl implements SingleMemberAnnotationExpr {
	/**
     * The cached value of the '{@link #getMemberValue() <em>Member Value</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMemberValue()
     * @generated
     * @ordered
     */
	protected Expression memberValue;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SingleMemberAnnotationExprImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.SINGLE_MEMBER_ANNOTATION_EXPR;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Expression getMemberValue() {
        return memberValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetMemberValue(Expression newMemberValue, NotificationChain msgs) {
        Expression oldMemberValue = memberValue;
        memberValue = newMemberValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.SINGLE_MEMBER_ANNOTATION_EXPR__MEMBER_VALUE, oldMemberValue, newMemberValue);
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
	public void setMemberValue(Expression newMemberValue) {
        if (newMemberValue != memberValue) {
            NotificationChain msgs = null;
            if (memberValue != null)
                msgs = ((InternalEObject)memberValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.SINGLE_MEMBER_ANNOTATION_EXPR__MEMBER_VALUE, null, msgs);
            if (newMemberValue != null)
                msgs = ((InternalEObject)newMemberValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.SINGLE_MEMBER_ANNOTATION_EXPR__MEMBER_VALUE, null, msgs);
            msgs = basicSetMemberValue(newMemberValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.SINGLE_MEMBER_ANNOTATION_EXPR__MEMBER_VALUE, newMemberValue, newMemberValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JavaPackage.SINGLE_MEMBER_ANNOTATION_EXPR__MEMBER_VALUE:
                return basicSetMemberValue(null, msgs);
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
            case JavaPackage.SINGLE_MEMBER_ANNOTATION_EXPR__MEMBER_VALUE:
                return getMemberValue();
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
            case JavaPackage.SINGLE_MEMBER_ANNOTATION_EXPR__MEMBER_VALUE:
                setMemberValue((Expression)newValue);
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
            case JavaPackage.SINGLE_MEMBER_ANNOTATION_EXPR__MEMBER_VALUE:
                setMemberValue((Expression)null);
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
            case JavaPackage.SINGLE_MEMBER_ANNOTATION_EXPR__MEMBER_VALUE:
                return memberValue != null;
        }
        return super.eIsSet(featureID);
    }

} //SingleMemberAnnotationExprImpl
