/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Creation Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.ArrayCreationExpr#getLevels <em>Levels</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.ArrayCreationExpr#getElementType <em>Element Type</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.ArrayCreationExpr#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getArrayCreationExpr()
 * @model
 * @generated
 */
public interface ArrayCreationExpr extends Expression {
	/**
     * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.ArrayCreationLevel}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Levels</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getArrayCreationExpr_Levels()
     * @model containment="true"
     * @generated
     */
	EList<ArrayCreationLevel> getLevels();

	/**
     * Returns the value of the '<em><b>Element Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Element Type</em>' reference.
     * @see #setElementType(Type)
     * @see fr.centralesupelec.csd.java.JavaPackage#getArrayCreationExpr_ElementType()
     * @model
     * @generated
     */
	Type getElementType();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ArrayCreationExpr#getElementType <em>Element Type</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element Type</em>' reference.
     * @see #getElementType()
     * @generated
     */
	void setElementType(Type value);

	/**
     * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Initializer</em>' containment reference.
     * @see #setInitializer(ArrayInitializerExpr)
     * @see fr.centralesupelec.csd.java.JavaPackage#getArrayCreationExpr_Initializer()
     * @model containment="true"
     * @generated
     */
	ArrayInitializerExpr getInitializer();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ArrayCreationExpr#getInitializer <em>Initializer</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initializer</em>' containment reference.
     * @see #getInitializer()
     * @generated
     */
	void setInitializer(ArrayInitializerExpr value);

} // ArrayCreationExpr
