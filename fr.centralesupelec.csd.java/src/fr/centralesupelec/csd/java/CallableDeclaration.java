/**
 */
package fr.centralesupelec.csd.java;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.CallableDeclaration#getReceiverParameter <em>Receiver Parameter</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getCallableDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface CallableDeclaration extends BodyDeclaration, NodeWithAccessModifiers, NodeWithSimpleName, NodeWithParameters, NodeWithThrownExceptions, NodeWithTypeParameters, NodeWithJavadoc, NodeWithAbstractModifier, NodeWithStaticModifier, NodeWithFinalModifier, NodeWithStrictfpModifier {
	/**
     * Returns the value of the '<em><b>Receiver Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Receiver Parameter</em>' containment reference.
     * @see #setReceiverParameter(ReceiverParameter)
     * @see fr.centralesupelec.csd.java.JavaPackage#getCallableDeclaration_ReceiverParameter()
     * @model containment="true"
     * @generated
     */
	ReceiverParameter getReceiverParameter();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.CallableDeclaration#getReceiverParameter <em>Receiver Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Receiver Parameter</em>' containment reference.
     * @see #getReceiverParameter()
     * @generated
     */
	void setReceiverParameter(ReceiverParameter value);

} // CallableDeclaration
