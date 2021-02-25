/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.Expression;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.NodeWithStatements;
import fr.centralesupelec.csd.java.Statement;
import fr.centralesupelec.csd.java.SwitchEntry;

import fr.centralesupelec.csd.java.SwitchEntryType;
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
 * An implementation of the model object '<em><b>Switch Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.SwitchEntryImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.SwitchEntryImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.SwitchEntryImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchEntryImpl extends JavaNodeImpl implements SwitchEntry {
	/**
     * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStatements()
     * @generated
     * @ordered
     */
	protected EList<Statement> statements;
	/**
     * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLabels()
     * @generated
     * @ordered
     */
	protected EList<Expression> labels;
	/**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected static final SwitchEntryType TYPE_EDEFAULT = SwitchEntryType.STATEMENT_GROUP;
	/**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected SwitchEntryType type = TYPE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SwitchEntryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.SWITCH_ENTRY;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<Statement> getStatements() {
        if (statements == null) {
            statements = new EObjectContainmentEList<Statement>(Statement.class, this, JavaPackage.SWITCH_ENTRY__STATEMENTS);
        }
        return statements;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<Expression> getLabels() {
        if (labels == null) {
            labels = new EObjectContainmentEList<Expression>(Expression.class, this, JavaPackage.SWITCH_ENTRY__LABELS);
        }
        return labels;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public SwitchEntryType getType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setType(SwitchEntryType newType) {
        SwitchEntryType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.SWITCH_ENTRY__TYPE, oldType, type));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JavaPackage.SWITCH_ENTRY__STATEMENTS:
                return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
            case JavaPackage.SWITCH_ENTRY__LABELS:
                return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
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
            case JavaPackage.SWITCH_ENTRY__STATEMENTS:
                return getStatements();
            case JavaPackage.SWITCH_ENTRY__LABELS:
                return getLabels();
            case JavaPackage.SWITCH_ENTRY__TYPE:
                return getType();
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
            case JavaPackage.SWITCH_ENTRY__STATEMENTS:
                getStatements().clear();
                getStatements().addAll((Collection<? extends Statement>)newValue);
                return;
            case JavaPackage.SWITCH_ENTRY__LABELS:
                getLabels().clear();
                getLabels().addAll((Collection<? extends Expression>)newValue);
                return;
            case JavaPackage.SWITCH_ENTRY__TYPE:
                setType((SwitchEntryType)newValue);
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
            case JavaPackage.SWITCH_ENTRY__STATEMENTS:
                getStatements().clear();
                return;
            case JavaPackage.SWITCH_ENTRY__LABELS:
                getLabels().clear();
                return;
            case JavaPackage.SWITCH_ENTRY__TYPE:
                setType(TYPE_EDEFAULT);
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
            case JavaPackage.SWITCH_ENTRY__STATEMENTS:
                return statements != null && !statements.isEmpty();
            case JavaPackage.SWITCH_ENTRY__LABELS:
                return labels != null && !labels.isEmpty();
            case JavaPackage.SWITCH_ENTRY__TYPE:
                return type != TYPE_EDEFAULT;
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
        if (baseClass == NodeWithStatements.class) {
            switch (derivedFeatureID) {
                case JavaPackage.SWITCH_ENTRY__STATEMENTS: return JavaPackage.NODE_WITH_STATEMENTS__STATEMENTS;
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
        if (baseClass == NodeWithStatements.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_STATEMENTS__STATEMENTS: return JavaPackage.SWITCH_ENTRY__STATEMENTS;
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
        result.append(" (type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //SwitchEntryImpl
