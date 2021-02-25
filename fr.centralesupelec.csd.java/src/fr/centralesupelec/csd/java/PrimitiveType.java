/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.PrimitiveType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type, NodeWithAnnotations {
	/**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.csd.java.Primitive}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.csd.java.Primitive
     * @see #setType(Primitive)
     * @see fr.centralesupelec.csd.java.JavaPackage#getPrimitiveType_Type()
     * @model
     * @generated
     */
	Primitive getType();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.PrimitiveType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.csd.java.Primitive
     * @see #getType()
     * @generated
     */
	void setType(Primitive value);

} // PrimitiveType
