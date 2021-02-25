/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.SuperExpr#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getSuperExpr()
 * @model
 * @generated
 */
public interface SuperExpr extends Expression {
	/**
     * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Name</em>' containment reference.
     * @see #setTypeName(Name)
     * @see fr.centralesupelec.csd.java.JavaPackage#getSuperExpr_TypeName()
     * @model containment="true"
     * @generated
     */
    Name getTypeName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.SuperExpr#getTypeName <em>Type Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type Name</em>' containment reference.
     * @see #getTypeName()
     * @generated
     */
    void setTypeName(Name value);

} // SuperExpr
