/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Member Annotation Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.SingleMemberAnnotationExpr#getMemberValue <em>Member Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getSingleMemberAnnotationExpr()
 * @model
 * @generated
 */
public interface SingleMemberAnnotationExpr extends AnnotationExpr {
	/**
     * Returns the value of the '<em><b>Member Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Member Value</em>' containment reference.
     * @see #setMemberValue(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getSingleMemberAnnotationExpr_MemberValue()
     * @model containment="true"
     * @generated
     */
	Expression getMemberValue();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.SingleMemberAnnotationExpr#getMemberValue <em>Member Value</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Member Value</em>' containment reference.
     * @see #getMemberValue()
     * @generated
     */
	void setMemberValue(Expression value);

} // SingleMemberAnnotationExpr
