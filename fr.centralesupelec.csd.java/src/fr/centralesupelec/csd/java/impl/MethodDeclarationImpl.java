/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.BlockStmt;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.MethodDeclaration;
import fr.centralesupelec.csd.java.NodeWithBlockStmt;
import fr.centralesupelec.csd.java.NodeWithDefaultModifier;
import fr.centralesupelec.csd.java.NodeWithNativeModifier;
import fr.centralesupelec.csd.java.NodeWithSynchronizedModifier;
import fr.centralesupelec.csd.java.NodeWithType;
import fr.centralesupelec.csd.java.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.MethodDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.MethodDeclarationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.MethodDeclarationImpl#isNative <em>Native</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.MethodDeclarationImpl#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.MethodDeclarationImpl#isDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclarationImpl extends CallableDeclarationImpl implements MethodDeclaration {
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
     * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBody()
     * @generated
     * @ordered
     */
	protected BlockStmt body;

	/**
     * The default value of the '{@link #isNative() <em>Native</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isNative()
     * @generated
     * @ordered
     */
	protected static final boolean NATIVE_EDEFAULT = false;

	/**
     * The default value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSynchronized()
     * @generated
     * @ordered
     */
	protected static final boolean SYNCHRONIZED_EDEFAULT = false;

	/**
     * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDefault()
     * @generated
     * @ordered
     */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MethodDeclarationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.METHOD_DECLARATION;
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
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
        Type oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_DECLARATION__TYPE, oldType, newType);
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
	public void setType(Type newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD_DECLARATION__TYPE, null, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD_DECLARATION__TYPE, null, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_DECLARATION__TYPE, newType, newType));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_DECLARATION__BODY, oldBody, newBody);
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
                msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD_DECLARATION__BODY, null, msgs);
            if (newBody != null)
                msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD_DECLARATION__BODY, null, msgs);
            msgs = basicSetBody(newBody, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_DECLARATION__BODY, newBody, newBody));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isNative() {
        // TODO: implement this method to return the 'Native' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setNative(boolean newNative) {
        // TODO: implement this method to set the 'Native' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isSynchronized() {
        // TODO: implement this method to return the 'Synchronized' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setSynchronized(boolean newSynchronized) {
        // TODO: implement this method to set the 'Synchronized' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isDefault() {
        // TODO: implement this method to return the 'Default' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setDefault(boolean newDefault) {
        // TODO: implement this method to set the 'Default' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JavaPackage.METHOD_DECLARATION__TYPE:
                return basicSetType(null, msgs);
            case JavaPackage.METHOD_DECLARATION__BODY:
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
            case JavaPackage.METHOD_DECLARATION__TYPE:
                return getType();
            case JavaPackage.METHOD_DECLARATION__BODY:
                return getBody();
            case JavaPackage.METHOD_DECLARATION__NATIVE:
                return isNative();
            case JavaPackage.METHOD_DECLARATION__SYNCHRONIZED:
                return isSynchronized();
            case JavaPackage.METHOD_DECLARATION__DEFAULT:
                return isDefault();
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
            case JavaPackage.METHOD_DECLARATION__TYPE:
                setType((Type)newValue);
                return;
            case JavaPackage.METHOD_DECLARATION__BODY:
                setBody((BlockStmt)newValue);
                return;
            case JavaPackage.METHOD_DECLARATION__NATIVE:
                setNative((Boolean)newValue);
                return;
            case JavaPackage.METHOD_DECLARATION__SYNCHRONIZED:
                setSynchronized((Boolean)newValue);
                return;
            case JavaPackage.METHOD_DECLARATION__DEFAULT:
                setDefault((Boolean)newValue);
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
            case JavaPackage.METHOD_DECLARATION__TYPE:
                setType((Type)null);
                return;
            case JavaPackage.METHOD_DECLARATION__BODY:
                setBody((BlockStmt)null);
                return;
            case JavaPackage.METHOD_DECLARATION__NATIVE:
                setNative(NATIVE_EDEFAULT);
                return;
            case JavaPackage.METHOD_DECLARATION__SYNCHRONIZED:
                setSynchronized(SYNCHRONIZED_EDEFAULT);
                return;
            case JavaPackage.METHOD_DECLARATION__DEFAULT:
                setDefault(DEFAULT_EDEFAULT);
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
            case JavaPackage.METHOD_DECLARATION__TYPE:
                return type != null;
            case JavaPackage.METHOD_DECLARATION__BODY:
                return body != null;
            case JavaPackage.METHOD_DECLARATION__NATIVE:
                return isNative() != NATIVE_EDEFAULT;
            case JavaPackage.METHOD_DECLARATION__SYNCHRONIZED:
                return isSynchronized() != SYNCHRONIZED_EDEFAULT;
            case JavaPackage.METHOD_DECLARATION__DEFAULT:
                return isDefault() != DEFAULT_EDEFAULT;
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
        if (baseClass == NodeWithType.class) {
            switch (derivedFeatureID) {
                case JavaPackage.METHOD_DECLARATION__TYPE: return JavaPackage.NODE_WITH_TYPE__TYPE;
                default: return -1;
            }
        }
        if (baseClass == NodeWithBlockStmt.class) {
            switch (derivedFeatureID) {
                case JavaPackage.METHOD_DECLARATION__BODY: return JavaPackage.NODE_WITH_BLOCK_STMT__BODY;
                default: return -1;
            }
        }
        if (baseClass == NodeWithNativeModifier.class) {
            switch (derivedFeatureID) {
                case JavaPackage.METHOD_DECLARATION__NATIVE: return JavaPackage.NODE_WITH_NATIVE_MODIFIER__NATIVE;
                default: return -1;
            }
        }
        if (baseClass == NodeWithSynchronizedModifier.class) {
            switch (derivedFeatureID) {
                case JavaPackage.METHOD_DECLARATION__SYNCHRONIZED: return JavaPackage.NODE_WITH_SYNCHRONIZED_MODIFIER__SYNCHRONIZED;
                default: return -1;
            }
        }
        if (baseClass == NodeWithDefaultModifier.class) {
            switch (derivedFeatureID) {
                case JavaPackage.METHOD_DECLARATION__DEFAULT: return JavaPackage.NODE_WITH_DEFAULT_MODIFIER__DEFAULT;
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
        if (baseClass == NodeWithType.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_TYPE__TYPE: return JavaPackage.METHOD_DECLARATION__TYPE;
                default: return -1;
            }
        }
        if (baseClass == NodeWithBlockStmt.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_BLOCK_STMT__BODY: return JavaPackage.METHOD_DECLARATION__BODY;
                default: return -1;
            }
        }
        if (baseClass == NodeWithNativeModifier.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_NATIVE_MODIFIER__NATIVE: return JavaPackage.METHOD_DECLARATION__NATIVE;
                default: return -1;
            }
        }
        if (baseClass == NodeWithSynchronizedModifier.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_SYNCHRONIZED_MODIFIER__SYNCHRONIZED: return JavaPackage.METHOD_DECLARATION__SYNCHRONIZED;
                default: return -1;
            }
        }
        if (baseClass == NodeWithDefaultModifier.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_DEFAULT_MODIFIER__DEFAULT: return JavaPackage.METHOD_DECLARATION__DEFAULT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //MethodDeclarationImpl
