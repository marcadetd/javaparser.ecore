/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.AnnotationExpr;
import fr.centralesupelec.csd.java.ClassOrInterfaceType;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.NodeWithAnnotations;
import fr.centralesupelec.csd.java.NodeWithSimpleName;
import fr.centralesupelec.csd.java.SimpleName;
import fr.centralesupelec.csd.java.TypeParameter;

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
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.TypeParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.TypeParameterImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.TypeParameterImpl#getTypeBound <em>Type Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameterImpl extends ReferenceTypeImpl implements TypeParameter {
	/**
     * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected SimpleName name;

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
     * The cached value of the '{@link #getTypeBound() <em>Type Bound</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTypeBound()
     * @generated
     * @ordered
     */
	protected EList<ClassOrInterfaceType> typeBound;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TypeParameterImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.TYPE_PARAMETER;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SimpleName getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetName(SimpleName newName, NotificationChain msgs) {
        SimpleName oldName = name;
        name = newName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.TYPE_PARAMETER__NAME, oldName, newName);
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
    public void setName(SimpleName newName) {
        if (newName != name) {
            NotificationChain msgs = null;
            if (name != null)
                msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.TYPE_PARAMETER__NAME, null, msgs);
            if (newName != null)
                msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.TYPE_PARAMETER__NAME, null, msgs);
            msgs = basicSetName(newName, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.TYPE_PARAMETER__NAME, newName, newName));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<AnnotationExpr> getAnnotations() {
        if (annotations == null) {
            annotations = new EObjectContainmentEList<AnnotationExpr>(AnnotationExpr.class, this, JavaPackage.TYPE_PARAMETER__ANNOTATIONS);
        }
        return annotations;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<ClassOrInterfaceType> getTypeBound() {
        if (typeBound == null) {
            typeBound = new EObjectContainmentEList<ClassOrInterfaceType>(ClassOrInterfaceType.class, this, JavaPackage.TYPE_PARAMETER__TYPE_BOUND);
        }
        return typeBound;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JavaPackage.TYPE_PARAMETER__NAME:
                return basicSetName(null, msgs);
            case JavaPackage.TYPE_PARAMETER__ANNOTATIONS:
                return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
            case JavaPackage.TYPE_PARAMETER__TYPE_BOUND:
                return ((InternalEList<?>)getTypeBound()).basicRemove(otherEnd, msgs);
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
            case JavaPackage.TYPE_PARAMETER__NAME:
                return getName();
            case JavaPackage.TYPE_PARAMETER__ANNOTATIONS:
                return getAnnotations();
            case JavaPackage.TYPE_PARAMETER__TYPE_BOUND:
                return getTypeBound();
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
            case JavaPackage.TYPE_PARAMETER__NAME:
                setName((SimpleName)newValue);
                return;
            case JavaPackage.TYPE_PARAMETER__ANNOTATIONS:
                getAnnotations().clear();
                getAnnotations().addAll((Collection<? extends AnnotationExpr>)newValue);
                return;
            case JavaPackage.TYPE_PARAMETER__TYPE_BOUND:
                getTypeBound().clear();
                getTypeBound().addAll((Collection<? extends ClassOrInterfaceType>)newValue);
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
            case JavaPackage.TYPE_PARAMETER__NAME:
                setName((SimpleName)null);
                return;
            case JavaPackage.TYPE_PARAMETER__ANNOTATIONS:
                getAnnotations().clear();
                return;
            case JavaPackage.TYPE_PARAMETER__TYPE_BOUND:
                getTypeBound().clear();
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
            case JavaPackage.TYPE_PARAMETER__NAME:
                return name != null;
            case JavaPackage.TYPE_PARAMETER__ANNOTATIONS:
                return annotations != null && !annotations.isEmpty();
            case JavaPackage.TYPE_PARAMETER__TYPE_BOUND:
                return typeBound != null && !typeBound.isEmpty();
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
        if (baseClass == NodeWithSimpleName.class) {
            switch (derivedFeatureID) {
                case JavaPackage.TYPE_PARAMETER__NAME: return JavaPackage.NODE_WITH_SIMPLE_NAME__NAME;
                default: return -1;
            }
        }
        if (baseClass == NodeWithAnnotations.class) {
            switch (derivedFeatureID) {
                case JavaPackage.TYPE_PARAMETER__ANNOTATIONS: return JavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS;
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
        if (baseClass == NodeWithSimpleName.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_SIMPLE_NAME__NAME: return JavaPackage.TYPE_PARAMETER__NAME;
                default: return -1;
            }
        }
        if (baseClass == NodeWithAnnotations.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_ANNOTATIONS__ANNOTATIONS: return JavaPackage.TYPE_PARAMETER__ANNOTATIONS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //TypeParameterImpl
