/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.BlockStmt;
import fr.centralesupelec.csd.java.CatchClause;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.NodeWithBlockStmt;
import fr.centralesupelec.csd.java.Parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.CatchClauseImpl#getBody <em>Body</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.CatchClauseImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatchClauseImpl extends JavaNodeImpl implements CatchClause {
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
     * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getParameter()
     * @generated
     * @ordered
     */
	protected Parameter parameter;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CatchClauseImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.CATCH_CLAUSE;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CATCH_CLAUSE__BODY, oldBody, newBody);
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
                msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CATCH_CLAUSE__BODY, null, msgs);
            if (newBody != null)
                msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CATCH_CLAUSE__BODY, null, msgs);
            msgs = basicSetBody(newBody, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CATCH_CLAUSE__BODY, newBody, newBody));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Parameter getParameter() {
        return parameter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs) {
        Parameter oldParameter = parameter;
        parameter = newParameter;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CATCH_CLAUSE__PARAMETER, oldParameter, newParameter);
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
	public void setParameter(Parameter newParameter) {
        if (newParameter != parameter) {
            NotificationChain msgs = null;
            if (parameter != null)
                msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CATCH_CLAUSE__PARAMETER, null, msgs);
            if (newParameter != null)
                msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CATCH_CLAUSE__PARAMETER, null, msgs);
            msgs = basicSetParameter(newParameter, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CATCH_CLAUSE__PARAMETER, newParameter, newParameter));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JavaPackage.CATCH_CLAUSE__BODY:
                return basicSetBody(null, msgs);
            case JavaPackage.CATCH_CLAUSE__PARAMETER:
                return basicSetParameter(null, msgs);
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
            case JavaPackage.CATCH_CLAUSE__BODY:
                return getBody();
            case JavaPackage.CATCH_CLAUSE__PARAMETER:
                return getParameter();
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
            case JavaPackage.CATCH_CLAUSE__BODY:
                setBody((BlockStmt)newValue);
                return;
            case JavaPackage.CATCH_CLAUSE__PARAMETER:
                setParameter((Parameter)newValue);
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
            case JavaPackage.CATCH_CLAUSE__BODY:
                setBody((BlockStmt)null);
                return;
            case JavaPackage.CATCH_CLAUSE__PARAMETER:
                setParameter((Parameter)null);
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
            case JavaPackage.CATCH_CLAUSE__BODY:
                return body != null;
            case JavaPackage.CATCH_CLAUSE__PARAMETER:
                return parameter != null;
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
        if (baseClass == NodeWithBlockStmt.class) {
            switch (derivedFeatureID) {
                case JavaPackage.CATCH_CLAUSE__BODY: return JavaPackage.NODE_WITH_BLOCK_STMT__BODY;
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
        if (baseClass == NodeWithBlockStmt.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_BLOCK_STMT__BODY: return JavaPackage.CATCH_CLAUSE__BODY;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //CatchClauseImpl
