/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Initializer Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.ArrayInitializerExpr#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getArrayInitializerExpr()
 * @model
 * @generated
 */
public interface ArrayInitializerExpr extends Expression {
	/**
     * Returns the value of the '<em><b>Values</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.Expression}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Values</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getArrayInitializerExpr_Values()
     * @model containment="true"
     * @generated
     */
	EList<Expression> getValues();

} // ArrayInitializerExpr
