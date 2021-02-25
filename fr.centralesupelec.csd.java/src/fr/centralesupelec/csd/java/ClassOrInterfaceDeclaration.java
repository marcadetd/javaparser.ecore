/**
 */
package fr.centralesupelec.csd.java;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Or Interface Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.ClassOrInterfaceDeclaration#isInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getClassOrInterfaceDeclaration()
 * @model
 * @generated
 */
public interface ClassOrInterfaceDeclaration extends TypeDeclaration, NodeWithImplements, NodeWithExtends, NodeWithTypeParameters, NodeWithAbstractModifier, NodeWithFinalModifier {
	/**
     * Returns the value of the '<em><b>Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Interface</em>' attribute.
     * @see #setInterface(boolean)
     * @see fr.centralesupelec.csd.java.JavaPackage#getClassOrInterfaceDeclaration_Interface()
     * @model
     * @generated
     */
	boolean isInterface();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.ClassOrInterfaceDeclaration#isInterface <em>Interface</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface</em>' attribute.
     * @see #isInterface()
     * @generated
     */
	void setInterface(boolean value);

} // ClassOrInterfaceDeclaration
