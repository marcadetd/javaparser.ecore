/**
 */
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.FieldDeclaration;
import fr.centralesupelec.csd.java.JavaPackage;
import fr.centralesupelec.csd.java.JavadocComment;
import fr.centralesupelec.csd.java.ModifierKeyword;
import fr.centralesupelec.csd.java.NodeWithAccessModifiers;
import fr.centralesupelec.csd.java.NodeWithFinalModifier;
import fr.centralesupelec.csd.java.NodeWithJavadoc;
import fr.centralesupelec.csd.java.NodeWithModifiers;
import fr.centralesupelec.csd.java.NodeWithPrivateModifier;
import fr.centralesupelec.csd.java.NodeWithProtectedModifier;
import fr.centralesupelec.csd.java.NodeWithPublicModifier;
import fr.centralesupelec.csd.java.NodeWithStaticModifier;
import fr.centralesupelec.csd.java.NodeWithVariables;
import fr.centralesupelec.csd.java.VariableDeclarator;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.impl.FieldDeclarationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.FieldDeclarationImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.FieldDeclarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.FieldDeclarationImpl#isPublic <em>Public</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.FieldDeclarationImpl#isPrivate <em>Private</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.FieldDeclarationImpl#isProtected <em>Protected</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.FieldDeclarationImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.impl.FieldDeclarationImpl#isFinal <em>Final</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldDeclarationImpl extends BodyDeclarationImpl implements FieldDeclaration {
	/**
     * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
	protected JavadocComment comment;

	/**
     * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVariables()
     * @generated
     * @ordered
     */
	protected EList<VariableDeclarator> variables;

	/**
     * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getModifiers()
     * @generated
     * @ordered
     */
	protected EList<ModifierKeyword> modifiers;

	/**
     * The default value of the '{@link #isPublic() <em>Public</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isPublic()
     * @generated
     * @ordered
     */
	protected static final boolean PUBLIC_EDEFAULT = false;

	/**
     * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isPrivate()
     * @generated
     * @ordered
     */
	protected static final boolean PRIVATE_EDEFAULT = false;

	/**
     * The default value of the '{@link #isProtected() <em>Protected</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isProtected()
     * @generated
     * @ordered
     */
	protected static final boolean PROTECTED_EDEFAULT = false;

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
     * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isFinal()
     * @generated
     * @ordered
     */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FieldDeclarationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return JavaPackage.Literals.FIELD_DECLARATION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public JavadocComment getComment() {
        return comment;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetComment(JavadocComment newComment, NotificationChain msgs) {
        JavadocComment oldComment = comment;
        comment = newComment;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD_DECLARATION__COMMENT, oldComment, newComment);
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
	public void setComment(JavadocComment newComment) {
        if (newComment != comment) {
            NotificationChain msgs = null;
            if (comment != null)
                msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FIELD_DECLARATION__COMMENT, null, msgs);
            if (newComment != null)
                msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FIELD_DECLARATION__COMMENT, null, msgs);
            msgs = basicSetComment(newComment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD_DECLARATION__COMMENT, newComment, newComment));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<ModifierKeyword> getModifiers() {
        if (modifiers == null) {
            modifiers = new EDataTypeUniqueEList<ModifierKeyword>(ModifierKeyword.class, this, JavaPackage.FIELD_DECLARATION__MODIFIERS);
        }
        return modifiers;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isPublic() {
        // TODO: implement this method to return the 'Public' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setPublic(boolean newPublic) {
        // TODO: implement this method to set the 'Public' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isPrivate() {
        // TODO: implement this method to return the 'Private' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setPrivate(boolean newPrivate) {
        // TODO: implement this method to set the 'Private' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isProtected() {
        // TODO: implement this method to return the 'Protected' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setProtected(boolean newProtected) {
        // TODO: implement this method to set the 'Protected' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isStatic() {
        // TODO: implement this method to return the 'Static' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setStatic(boolean newStatic) {
        // TODO: implement this method to set the 'Static' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isFinal() {
        // TODO: implement this method to return the 'Final' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setFinal(boolean newFinal) {
        // TODO: implement this method to set the 'Final' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<VariableDeclarator> getVariables() {
        if (variables == null) {
            variables = new EObjectContainmentEList<VariableDeclarator>(VariableDeclarator.class, this, JavaPackage.FIELD_DECLARATION__VARIABLES);
        }
        return variables;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JavaPackage.FIELD_DECLARATION__COMMENT:
                return basicSetComment(null, msgs);
            case JavaPackage.FIELD_DECLARATION__VARIABLES:
                return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
            case JavaPackage.FIELD_DECLARATION__COMMENT:
                return getComment();
            case JavaPackage.FIELD_DECLARATION__VARIABLES:
                return getVariables();
            case JavaPackage.FIELD_DECLARATION__MODIFIERS:
                return getModifiers();
            case JavaPackage.FIELD_DECLARATION__PUBLIC:
                return isPublic();
            case JavaPackage.FIELD_DECLARATION__PRIVATE:
                return isPrivate();
            case JavaPackage.FIELD_DECLARATION__PROTECTED:
                return isProtected();
            case JavaPackage.FIELD_DECLARATION__STATIC:
                return isStatic();
            case JavaPackage.FIELD_DECLARATION__FINAL:
                return isFinal();
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
            case JavaPackage.FIELD_DECLARATION__COMMENT:
                setComment((JavadocComment)newValue);
                return;
            case JavaPackage.FIELD_DECLARATION__VARIABLES:
                getVariables().clear();
                getVariables().addAll((Collection<? extends VariableDeclarator>)newValue);
                return;
            case JavaPackage.FIELD_DECLARATION__MODIFIERS:
                getModifiers().clear();
                getModifiers().addAll((Collection<? extends ModifierKeyword>)newValue);
                return;
            case JavaPackage.FIELD_DECLARATION__PUBLIC:
                setPublic((Boolean)newValue);
                return;
            case JavaPackage.FIELD_DECLARATION__PRIVATE:
                setPrivate((Boolean)newValue);
                return;
            case JavaPackage.FIELD_DECLARATION__PROTECTED:
                setProtected((Boolean)newValue);
                return;
            case JavaPackage.FIELD_DECLARATION__STATIC:
                setStatic((Boolean)newValue);
                return;
            case JavaPackage.FIELD_DECLARATION__FINAL:
                setFinal((Boolean)newValue);
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
            case JavaPackage.FIELD_DECLARATION__COMMENT:
                setComment((JavadocComment)null);
                return;
            case JavaPackage.FIELD_DECLARATION__VARIABLES:
                getVariables().clear();
                return;
            case JavaPackage.FIELD_DECLARATION__MODIFIERS:
                getModifiers().clear();
                return;
            case JavaPackage.FIELD_DECLARATION__PUBLIC:
                setPublic(PUBLIC_EDEFAULT);
                return;
            case JavaPackage.FIELD_DECLARATION__PRIVATE:
                setPrivate(PRIVATE_EDEFAULT);
                return;
            case JavaPackage.FIELD_DECLARATION__PROTECTED:
                setProtected(PROTECTED_EDEFAULT);
                return;
            case JavaPackage.FIELD_DECLARATION__STATIC:
                setStatic(STATIC_EDEFAULT);
                return;
            case JavaPackage.FIELD_DECLARATION__FINAL:
                setFinal(FINAL_EDEFAULT);
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
            case JavaPackage.FIELD_DECLARATION__COMMENT:
                return comment != null;
            case JavaPackage.FIELD_DECLARATION__VARIABLES:
                return variables != null && !variables.isEmpty();
            case JavaPackage.FIELD_DECLARATION__MODIFIERS:
                return modifiers != null && !modifiers.isEmpty();
            case JavaPackage.FIELD_DECLARATION__PUBLIC:
                return isPublic() != PUBLIC_EDEFAULT;
            case JavaPackage.FIELD_DECLARATION__PRIVATE:
                return isPrivate() != PRIVATE_EDEFAULT;
            case JavaPackage.FIELD_DECLARATION__PROTECTED:
                return isProtected() != PROTECTED_EDEFAULT;
            case JavaPackage.FIELD_DECLARATION__STATIC:
                return isStatic() != STATIC_EDEFAULT;
            case JavaPackage.FIELD_DECLARATION__FINAL:
                return isFinal() != FINAL_EDEFAULT;
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
                case JavaPackage.FIELD_DECLARATION__COMMENT: return JavaPackage.NODE_WITH_JAVADOC__COMMENT;
                default: return -1;
            }
        }
        if (baseClass == NodeWithVariables.class) {
            switch (derivedFeatureID) {
                case JavaPackage.FIELD_DECLARATION__VARIABLES: return JavaPackage.NODE_WITH_VARIABLES__VARIABLES;
                default: return -1;
            }
        }
        if (baseClass == NodeWithModifiers.class) {
            switch (derivedFeatureID) {
                case JavaPackage.FIELD_DECLARATION__MODIFIERS: return JavaPackage.NODE_WITH_MODIFIERS__MODIFIERS;
                default: return -1;
            }
        }
        if (baseClass == NodeWithPublicModifier.class) {
            switch (derivedFeatureID) {
                case JavaPackage.FIELD_DECLARATION__PUBLIC: return JavaPackage.NODE_WITH_PUBLIC_MODIFIER__PUBLIC;
                default: return -1;
            }
        }
        if (baseClass == NodeWithPrivateModifier.class) {
            switch (derivedFeatureID) {
                case JavaPackage.FIELD_DECLARATION__PRIVATE: return JavaPackage.NODE_WITH_PRIVATE_MODIFIER__PRIVATE;
                default: return -1;
            }
        }
        if (baseClass == NodeWithProtectedModifier.class) {
            switch (derivedFeatureID) {
                case JavaPackage.FIELD_DECLARATION__PROTECTED: return JavaPackage.NODE_WITH_PROTECTED_MODIFIER__PROTECTED;
                default: return -1;
            }
        }
        if (baseClass == NodeWithAccessModifiers.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NodeWithStaticModifier.class) {
            switch (derivedFeatureID) {
                case JavaPackage.FIELD_DECLARATION__STATIC: return JavaPackage.NODE_WITH_STATIC_MODIFIER__STATIC;
                default: return -1;
            }
        }
        if (baseClass == NodeWithFinalModifier.class) {
            switch (derivedFeatureID) {
                case JavaPackage.FIELD_DECLARATION__FINAL: return JavaPackage.NODE_WITH_FINAL_MODIFIER__FINAL;
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
                case JavaPackage.NODE_WITH_JAVADOC__COMMENT: return JavaPackage.FIELD_DECLARATION__COMMENT;
                default: return -1;
            }
        }
        if (baseClass == NodeWithVariables.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_VARIABLES__VARIABLES: return JavaPackage.FIELD_DECLARATION__VARIABLES;
                default: return -1;
            }
        }
        if (baseClass == NodeWithModifiers.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_MODIFIERS__MODIFIERS: return JavaPackage.FIELD_DECLARATION__MODIFIERS;
                default: return -1;
            }
        }
        if (baseClass == NodeWithPublicModifier.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_PUBLIC_MODIFIER__PUBLIC: return JavaPackage.FIELD_DECLARATION__PUBLIC;
                default: return -1;
            }
        }
        if (baseClass == NodeWithPrivateModifier.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_PRIVATE_MODIFIER__PRIVATE: return JavaPackage.FIELD_DECLARATION__PRIVATE;
                default: return -1;
            }
        }
        if (baseClass == NodeWithProtectedModifier.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_PROTECTED_MODIFIER__PROTECTED: return JavaPackage.FIELD_DECLARATION__PROTECTED;
                default: return -1;
            }
        }
        if (baseClass == NodeWithAccessModifiers.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NodeWithStaticModifier.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_STATIC_MODIFIER__STATIC: return JavaPackage.FIELD_DECLARATION__STATIC;
                default: return -1;
            }
        }
        if (baseClass == NodeWithFinalModifier.class) {
            switch (baseFeatureID) {
                case JavaPackage.NODE_WITH_FINAL_MODIFIER__FINAL: return JavaPackage.FIELD_DECLARATION__FINAL;
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
        result.append(" (modifiers: ");
        result.append(modifiers);
        result.append(')');
        return result.toString();
    }

} //FieldDeclarationImpl
