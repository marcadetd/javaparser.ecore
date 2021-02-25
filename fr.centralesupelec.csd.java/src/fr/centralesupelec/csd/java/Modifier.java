/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.Modifier#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getModifier()
 * @model
 * @generated
 */
public interface Modifier extends EObject {
	/**
     * Returns the value of the '<em><b>Keyword</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.csd.java.ModifierKeyword}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Keyword</em>' attribute.
     * @see fr.centralesupelec.csd.java.ModifierKeyword
     * @see #setKeyword(ModifierKeyword)
     * @see fr.centralesupelec.csd.java.JavaPackage#getModifier_Keyword()
     * @model
     * @generated
     */
	ModifierKeyword getKeyword();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.Modifier#getKeyword <em>Keyword</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Keyword</em>' attribute.
     * @see fr.centralesupelec.csd.java.ModifierKeyword
     * @see #getKeyword()
     * @generated
     */
	void setKeyword(ModifierKeyword value);

} // Modifier
