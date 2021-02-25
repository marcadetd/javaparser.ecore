/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.EnumConstantDeclaration#getClassBody <em>Class Body</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getEnumConstantDeclaration()
 * @model
 * @generated
 */
public interface EnumConstantDeclaration extends BodyDeclaration, NodeWithJavadoc, NodeWithSimpleName, NodeWithArguments {
	/**
     * Returns the value of the '<em><b>Class Body</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.BodyDeclaration}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Class Body</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getEnumConstantDeclaration_ClassBody()
     * @model containment="true"
     * @generated
     */
	EList<BodyDeclaration> getClassBody();

} // EnumConstantDeclaration
