/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.AnnotationExpr;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.Name;
import fr.centralesupelec.csd.java.NodeWithAnnotations;
import fr.centralesupelec.csd.java.NodeWithName;
import fr.centralesupelec.csd.java.PackageDeclaration;

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
 * An implementation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.PackageDeclarationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.PackageDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageDeclarationImpl extends JavaNodeImpl implements PackageDeclaration {
	/**
     * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnnotations()
     * @generated
     * @ordered
     */
	protected EList<AnnotationExpr> annotations;

	/**
     * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected Name name;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PackageDeclarationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.PACKAGE_DECLARATION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<AnnotationExpr> getAnnotations() {
        if (annotations == null) {
            annotations = new EObjectContainmentEList<AnnotationExpr>(AnnotationExpr.class, this, JavaPackage.PACKAGE_DECLARATION__ANNOTATIONS);
        }
        return annotations;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Name getName() {
        return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetName(Name newName, NotificationChain msgs) {
        Name oldName = name;
        name = newName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.PACKAGE_DECLARATION__NAME, oldName, newName);
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
	public void setName(Name newName) {
        if (newName != name) {
            NotificationChain msgs = null;
            if (name != null)
                msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.PACKAGE_DECLARATION__NAME, null, msgs);
            if (newName != null)
                msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.PACKAGE_DECLARATION__NAME, null, msgs);
            msgs = basicSetName(newName, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.PACKAGE_DECLARATION__NAME, newName, newName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JavaPackage.PACKAGE_DECLARATION__ANNOTATIONS:
                return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
            case JavaPackage.PACKAGE_DECLARATION__NAME:
                return basicSetName(null, msgs);
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
            case JavaPackage.PACKAGE_DECLARATION__ANNOTATIONS:
                return getAnnotations();
            case JavaPackage.PACKAGE_DECLARATION__NAME:
                return getName();
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
            case JavaPackage.PACKAGE_DECLARATION__ANNOTATIONS:
                getAnnotations().clear();
                getAnnotations().addAll((Collection<? extends AnnotationExpr>)newValue);
                return;
            case JavaPackage.PACKAGE_DECLARATION__NAME:
                setName((Name)newValue);
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
            case JavaPackage.PACKAGE_DECLARATION__ANNOTATIONS:
                getAnnotations().clear();
                return;
            case JavaPackage.PACKAGE_DECLARATION__NAME:
                setName((Name)null);
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
            case JavaPackage.PACKAGE_DECLARATION__ANNOTATIONS:
                return annotations != null && !annotations.isEmpty();
            case JavaPackage.PACKAGE_DECLARATION__NAME:
                return name != null;
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
        if (baseClass == NodeWithAnnotations.class) {
            switch (derivedFeatureID) {
                case JavaPackage.PACKAGE_DECLARATION__ANNOTATIONS: return JavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS;
                default: return -1;
            }
        }
        if (baseClass == NodeWithName.class) {
            switch (derivedFeatureID) {
                case JavaPackage.PACKAGE_DECLARATION__NAME: return JavaPackage.NODE_WITH_NAME__NAME;
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
        if (baseClass == NodeWithAnnotations.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS: return JavaPackage.PACKAGE_DECLARATION__ANNOTATIONS;
                default: return -1;
            }
        }
        if (baseClass == NodeWithName.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_NAME__NAME: return JavaPackage.PACKAGE_DECLARATION__NAME;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //PackageDeclarationImpl
