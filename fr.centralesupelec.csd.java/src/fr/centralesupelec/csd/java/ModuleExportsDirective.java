/**
 */
package fr.centralesupelec.csd.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Exports Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.java.ModuleExportsDirective#getModuleNames <em>Module Names</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getModuleExportsDirective()
 * @model
 * @generated
 */
public interface ModuleExportsDirective extends ModuleDirective, NodeWithName {
	/**
     * Returns the value of the '<em><b>Module Names</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.Name}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Module Names</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getModuleExportsDirective_ModuleNames()
     * @model containment="true"
     * @generated
     */
	EList<Name> getModuleNames();

} // ModuleExportsDirective
