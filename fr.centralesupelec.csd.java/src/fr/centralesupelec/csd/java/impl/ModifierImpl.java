/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.Modifier;
import fr.centralesupelec.csd.java.ModifierKeyword;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.ModifierImpl#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifierImpl extends MinimalEObjectImpl.Container implements Modifier {
	/**
     * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKeyword()
     * @generated
     * @ordered
     */
	protected static final ModifierKeyword KEYWORD_EDEFAULT = ModifierKeyword.PUBLIC;

	/**
     * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKeyword()
     * @generated
     * @ordered
     */
	protected ModifierKeyword keyword = KEYWORD_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ModifierImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.MODIFIER;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ModifierKeyword getKeyword() {
        return keyword;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setKeyword(ModifierKeyword newKeyword) {
        ModifierKeyword oldKeyword = keyword;
        keyword = newKeyword == null ? KEYWORD_EDEFAULT : newKeyword;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.MODIFIER__KEYWORD, oldKeyword, keyword));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case JavaPackage.MODIFIER__KEYWORD:
                return getKeyword();
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
            case JavaPackage.MODIFIER__KEYWORD:
                setKeyword((ModifierKeyword)newValue);
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
            case JavaPackage.MODIFIER__KEYWORD:
                setKeyword(KEYWORD_EDEFAULT);
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
            case JavaPackage.MODIFIER__KEYWORD:
                return keyword != KEYWORD_EDEFAULT;
        }
        return super.eIsSet(featureID);
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
        result.append(" (keyword: ");
        result.append(keyword);
        result.append(')');
        return result.toString();
    }

} //ModifierImpl
