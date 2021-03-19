/**
 *  Copyright (c) 2021 CentraleSupélec.
 *  This program and the accompanying materials are made
 *  available under the terms of the Apache License version 2.0
 *  which accompanies this distribution, and is available at
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *  Web site:
 *      https://github.com/marcadetd/javaparser.ecore
 * 
 */
package fr.centralesupelec.csd.ejava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.CompilationUnit#getPackageDeclaration <em>Package Declaration</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.CompilationUnit#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.CompilationUnit#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.CompilationUnit#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends Element, JavaNode {
    /**
     * Returns the value of the '<em><b>Package Declaration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package Declaration</em>' containment reference.
     * @see #setPackageDeclaration(PackageDeclaration)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getCompilationUnit_PackageDeclaration()
     * @model containment="true"
     * @generated
     */
    PackageDeclaration getPackageDeclaration();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.CompilationUnit#getPackageDeclaration <em>Package Declaration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package Declaration</em>' containment reference.
     * @see #getPackageDeclaration()
     * @generated
     */
    void setPackageDeclaration( PackageDeclaration value );

    /**
     * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.ejava.ImportDeclaration}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Imports</em>' containment reference list.
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getCompilationUnit_Imports()
     * @model containment="true"
     * @generated
     */
    EList< ImportDeclaration > getImports();

    /**
     * Returns the value of the '<em><b>Types</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.ejava.TypeDeclaration}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Types</em>' containment reference list.
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getCompilationUnit_Types()
     * @model containment="true"
     * @generated
     */
    EList< TypeDeclaration > getTypes();

    /**
     * Returns the value of the '<em><b>Module</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Module</em>' containment reference.
     * @see #setModule(ModuleDeclaration)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getCompilationUnit_Module()
     * @model containment="true"
     * @generated
     */
    ModuleDeclaration getModule();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.CompilationUnit#getModule <em>Module</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Module</em>' containment reference.
     * @see #getModule()
     * @generated
     */
    void setModule( ModuleDeclaration value );

} // CompilationUnit
