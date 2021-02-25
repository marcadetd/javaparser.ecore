/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Annotation Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.NormalAnnotationExpr#getPairs <em>Pairs</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getNormalAnnotationExpr()
 * @model
 * @generated
 */
public interface NormalAnnotationExpr extends AnnotationExpr {
	/**
     * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.MemberValuePair}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Pairs</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getNormalAnnotationExpr_Pairs()
     * @model containment="true"
     * @generated
     */
	EList<MemberValuePair> getPairs();

} // NormalAnnotationExpr
