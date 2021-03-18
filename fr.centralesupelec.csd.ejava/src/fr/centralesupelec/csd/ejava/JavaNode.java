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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.csd.ejava.JavaNode#getComment <em>Comment</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.ejava.JavaNode#getOrphanComments <em>Orphan Comments</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getJavaNode()
 * @model abstract="true"
 * @generated
 */
public interface JavaNode extends EObject {
    /**
     * Returns the value of the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Comment</em>' containment reference.
     * @see #setComment(Comment)
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getJavaNode_Comment()
     * @model containment="true"
     * @generated
     */
    Comment getComment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.ejava.JavaNode#getComment <em>Comment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comment</em>' containment reference.
     * @see #getComment()
     * @generated
     */
    void setComment( Comment value );

    /**
     * Returns the value of the '<em><b>Orphan Comments</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.ejava.Comment}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Orphan Comments</em>' containment reference list.
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#getJavaNode_OrphanComments()
     * @model containment="true"
     * @generated
     */
    EList< Comment > getOrphanComments();

} // JavaNode
