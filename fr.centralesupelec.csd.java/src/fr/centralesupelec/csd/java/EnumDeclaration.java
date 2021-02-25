/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.EnumDeclaration#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getEnumDeclaration()
 * @model
 * @generated
 */
public interface EnumDeclaration extends TypeDeclaration, NodeWithImplements {
	/**
     * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.EnumConstantDeclaration}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Entries</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getEnumDeclaration_Entries()
     * @model containment="true"
     * @generated
     */
	EList<EnumConstantDeclaration> getEntries();

} // EnumDeclaration
