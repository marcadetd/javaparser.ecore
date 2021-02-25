/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.CompilationUnit;
import fr.centralesupelec.csd.java.ImportDeclaration;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.ModuleDeclaration;
import fr.centralesupelec.csd.java.PackageDeclaration;
import fr.centralesupelec.csd.java.TypeDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.CompilationUnitImpl#getPackageDeclaration <em>Package Declaration</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.CompilationUnitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.CompilationUnitImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.CompilationUnitImpl#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends MinimalEObjectImpl.Container implements CompilationUnit {
	/**
     * The cached value of the '{@link #getPackageDeclaration() <em>Package Declaration</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPackageDeclaration()
     * @generated
     * @ordered
     */
	protected PackageDeclaration packageDeclaration;

	/**
     * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getImports()
     * @generated
     * @ordered
     */
	protected EList<ImportDeclaration> imports;

	/**
     * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTypes()
     * @generated
     * @ordered
     */
	protected EList<TypeDeclaration> types;

	/**
     * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getModule()
     * @generated
     * @ordered
     */
	protected ModuleDeclaration module;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CompilationUnitImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.COMPILATION_UNIT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public PackageDeclaration getPackageDeclaration() {
        return packageDeclaration;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetPackageDeclaration(PackageDeclaration newPackageDeclaration, NotificationChain msgs) {
        PackageDeclaration oldPackageDeclaration = packageDeclaration;
        packageDeclaration = newPackageDeclaration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION, oldPackageDeclaration, newPackageDeclaration);
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
	public void setPackageDeclaration(PackageDeclaration newPackageDeclaration) {
        if (newPackageDeclaration != packageDeclaration) {
            NotificationChain msgs = null;
            if (packageDeclaration != null)
                msgs = ((InternalEObject)packageDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION, null, msgs);
            if (newPackageDeclaration != null)
                msgs = ((InternalEObject)newPackageDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION, null, msgs);
            msgs = basicSetPackageDeclaration(newPackageDeclaration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION, newPackageDeclaration, newPackageDeclaration));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<ImportDeclaration> getImports() {
        if (imports == null) {
            imports = new EObjectContainmentEList<ImportDeclaration>(ImportDeclaration.class, this, JavaPackage.COMPILATION_UNIT__IMPORTS);
        }
        return imports;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<TypeDeclaration> getTypes() {
        if (types == null) {
            types = new EObjectContainmentEList<TypeDeclaration>(TypeDeclaration.class, this, JavaPackage.COMPILATION_UNIT__TYPES);
        }
        return types;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ModuleDeclaration getModule() {
        return module;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetModule(ModuleDeclaration newModule, NotificationChain msgs) {
        ModuleDeclaration oldModule = module;
        module = newModule;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.COMPILATION_UNIT__MODULE, oldModule, newModule);
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
	public void setModule(ModuleDeclaration newModule) {
        if (newModule != module) {
            NotificationChain msgs = null;
            if (module != null)
                msgs = ((InternalEObject)module).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.COMPILATION_UNIT__MODULE, null, msgs);
            if (newModule != null)
                msgs = ((InternalEObject)newModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.COMPILATION_UNIT__MODULE, null, msgs);
            msgs = basicSetModule(newModule, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.COMPILATION_UNIT__MODULE, newModule, newModule));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION:
                return basicSetPackageDeclaration(null, msgs);
            case JavaPackage.COMPILATION_UNIT__IMPORTS:
                return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
            case JavaPackage.COMPILATION_UNIT__TYPES:
                return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
            case JavaPackage.COMPILATION_UNIT__MODULE:
                return basicSetModule(null, msgs);
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
            case JavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION:
                return getPackageDeclaration();
            case JavaPackage.COMPILATION_UNIT__IMPORTS:
                return getImports();
            case JavaPackage.COMPILATION_UNIT__TYPES:
                return getTypes();
            case JavaPackage.COMPILATION_UNIT__MODULE:
                return getModule();
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
            case JavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION:
                setPackageDeclaration((PackageDeclaration)newValue);
                return;
            case JavaPackage.COMPILATION_UNIT__IMPORTS:
                getImports().clear();
                getImports().addAll((Collection<? extends ImportDeclaration>)newValue);
                return;
            case JavaPackage.COMPILATION_UNIT__TYPES:
                getTypes().clear();
                getTypes().addAll((Collection<? extends TypeDeclaration>)newValue);
                return;
            case JavaPackage.COMPILATION_UNIT__MODULE:
                setModule((ModuleDeclaration)newValue);
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
            case JavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION:
                setPackageDeclaration((PackageDeclaration)null);
                return;
            case JavaPackage.COMPILATION_UNIT__IMPORTS:
                getImports().clear();
                return;
            case JavaPackage.COMPILATION_UNIT__TYPES:
                getTypes().clear();
                return;
            case JavaPackage.COMPILATION_UNIT__MODULE:
                setModule((ModuleDeclaration)null);
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
            case JavaPackage.COMPILATION_UNIT__PACKAGE_DECLARATION:
                return packageDeclaration != null;
            case JavaPackage.COMPILATION_UNIT__IMPORTS:
                return imports != null && !imports.isEmpty();
            case JavaPackage.COMPILATION_UNIT__TYPES:
                return types != null && !types.isEmpty();
            case JavaPackage.COMPILATION_UNIT__MODULE:
                return module != null;
        }
        return super.eIsSet(featureID);
    }

} //CompilationUnitImpl
