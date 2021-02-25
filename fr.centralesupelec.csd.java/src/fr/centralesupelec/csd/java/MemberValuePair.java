/**
 */
package fr.centralesupelec.csd.java;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.MemberValuePair#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getMemberValuePair()
 * @model
 * @generated
 */
public interface MemberValuePair extends NodeWithSimpleName {
	/**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getMemberValuePair_Value()
     * @model containment="true"
     * @generated
     */
	Expression getValue();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.MemberValuePair#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
	void setValue(Expression value);

} // MemberValuePair
