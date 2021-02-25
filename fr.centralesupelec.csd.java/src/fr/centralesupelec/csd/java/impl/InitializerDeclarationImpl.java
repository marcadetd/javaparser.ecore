/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.BlockStmt;
import fr.centralesupelec.csd.java.InitializerDeclaration;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.NodeWithBlockStmt;
import fr.centralesupelec.csd.java.NodeWithJavadoc;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initializer Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.InitializerDeclarationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.InitializerDeclarationImpl#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitializerDeclarationImpl extends BodyDeclarationImpl implements InitializerDeclaration {
	/**
     * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBody()
     * @generated
     * @ordered
     */
	protected BlockStmt body;

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
     * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected InitializerDeclarationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.INITIALIZER_DECLARATION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isStatic() {
        return static_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setStatic(boolean newStatic) {
        boolean oldStatic = static_;
        static_ = newStatic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.INITIALIZER_DECLARATION__STATIC, oldStatic, static_));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public BlockStmt getBody() {
        return body;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBody(BlockStmt newBody, NotificationChain msgs) {
        BlockStmt oldBody = body;
        body = newBody;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.INITIALIZER_DECLARATION__BODY, oldBody, newBody);
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
	public void setBody(BlockStmt newBody) {
        if (newBody != body) {
            NotificationChain msgs = null;
            if (body != null)
                msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.INITIALIZER_DECLARATION__BODY, null, msgs);
            if (newBody != null)
                msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.INITIALIZER_DECLARATION__BODY, null, msgs);
            msgs = basicSetBody(newBody, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.INITIALIZER_DECLARATION__BODY, newBody, newBody));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JavaPackage.INITIALIZER_DECLARATION__BODY:
                return basicSetBody(null, msgs);
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
            case JavaPackage.INITIALIZER_DECLARATION__BODY:
                return getBody();
            case JavaPackage.INITIALIZER_DECLARATION__STATIC:
                return isStatic();
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
            case JavaPackage.INITIALIZER_DECLARATION__BODY:
                setBody((BlockStmt)newValue);
                return;
            case JavaPackage.INITIALIZER_DECLARATION__STATIC:
                setStatic((Boolean)newValue);
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
            case JavaPackage.INITIALIZER_DECLARATION__BODY:
                setBody((BlockStmt)null);
                return;
            case JavaPackage.INITIALIZER_DECLARATION__STATIC:
                setStatic(STATIC_EDEFAULT);
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
            case JavaPackage.INITIALIZER_DECLARATION__BODY:
                return body != null;
            case JavaPackage.INITIALIZER_DECLARATION__STATIC:
                return static_ != STATIC_EDEFAULT;
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
        if (baseClass == NodeWithJavadoc.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NodeWithBlockStmt.class) {
            switch (derivedFeatureID) {
                case JavaPackage.INITIALIZER_DECLARATION__BODY: return JavaPackage.NODE_WITH_BLOCK_STMT__BODY;
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
        if (baseClass == NodeWithJavadoc.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NodeWithBlockStmt.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_BLOCK_STMT__BODY: return JavaPackage.INITIALIZER_DECLARATION__BODY;
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
        result.append(" (static: ");
        result.append(static_);
        result.append(')');
        return result.toString();
    }

} //InitializerDeclarationImpl
