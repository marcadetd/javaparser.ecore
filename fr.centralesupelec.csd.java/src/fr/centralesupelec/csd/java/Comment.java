/**
 */
package fr.centralesupelec.csd.java;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.Comment#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getComment()
 * @model abstract="true"
 * @generated
 */
public interface Comment extends JavaNode {
	/**
     * Returns the value of the '<em><b>Content</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Content</em>' attribute.
     * @see #setContent(String)
     * @see fr.centralesupelec.csd.java.JavaPackage#getComment_Content()
     * @model
     * @generated
     */
	String getContent();

	/**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.Comment#getContent <em>Content</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Content</em>' attribute.
     * @see #getContent()
     * @generated
     */
	void setContent(String value);

} // Comment
