/**
 */
package fr.centralesupelec.csd.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Class Declaration Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.LocalClassDeclarationStmt#getClassDeclaration <em>Class Declaration</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getLocalClassDeclarationStmt()
 * @model
 * @generated
 */
public interface LocalClassDeclarationStmt extends Statement {
	/**
     * Returns the value of the '<em><b>Class Declaration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Class Declaration</em>' containment reference.
     * @see #setClassDeclaration(ClassOrInterfaceDeclaration)
     * @see fr.centralesupelec.csd.java.JavaPackage#getLocalClassDeclarationStmt_ClassDeclaration()
     * @model containment="true"
     * @generated
     */
	ClassOrInterfaceDeclaration getClassDeclaration();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.LocalClassDeclarationStmt#getClassDeclaration <em>Class Declaration</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class Declaration</em>' containment reference.
     * @see #getClassDeclaration()
     * @generated
     */
	void setClassDeclaration(ClassOrInterfaceDeclaration value);

} // LocalClassDeclarationStmt
