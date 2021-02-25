/**
 */
package fr.centralesupelec.csd.java;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.AnnotationMemberDeclaration#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getAnnotationMemberDeclaration()
 * @model
 * @generated
 */
public interface AnnotationMemberDeclaration extends BodyDeclaration, NodeWithJavadoc, NodeWithSimpleName, NodeWithType<Type>, NodeWithPublicModifier, NodeWithAbstractModifier {
	/**
     * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' containment reference.
     * @see #setDefaultValue(Expression)
     * @see fr.centralesupelec.csd.java.JavaPackage#getAnnotationMemberDeclaration_DefaultValue()
     * @model containment="true"
     * @generated
     */
	Expression getDefaultValue();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.AnnotationMemberDeclaration#getDefaultValue <em>Default Value</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' containment reference.
     * @see #getDefaultValue()
     * @generated
     */
	void setDefaultValue(Expression value);

} // AnnotationMemberDeclaration
