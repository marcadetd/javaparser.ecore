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
package fr.centralesupelec.csd.java;

import com.github.javaparser.ast.Node;
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
 *   <li>{@link fr.centralesupelec.csd.java.JavaNode#getComment <em>Comment</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.JavaNode#getOrphanComments <em>Orphan Comments</em>}</li>
 *   <li>{@link fr.centralesupelec.csd.java.JavaNode#getJavaParserObject <em>Java Parser Object</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.csd.java.JavaPackage#getJavaNode()
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
     * @see fr.centralesupelec.csd.java.JavaPackage#getJavaNode_Comment()
     * @model containment="true"
     * @generated
     */
    Comment getComment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.JavaNode#getComment <em>Comment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comment</em>' containment reference.
     * @see #getComment()
     * @generated
     */
    void setComment( Comment value );

    /**
     * Returns the value of the '<em><b>Orphan Comments</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.csd.java.Comment}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Orphan Comments</em>' containment reference list.
     * @see fr.centralesupelec.csd.java.JavaPackage#getJavaNode_OrphanComments()
     * @model containment="true"
     * @generated
     */
    EList< Comment > getOrphanComments();

    /**
     * Returns the value of the '<em><b>Java Parser Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Java Parser Object</em>' reference.
     * @see #setJavaParserObject(Node)
     * @see fr.centralesupelec.csd.java.JavaPackage#getJavaNode_JavaParserObject()
     * @model type="fr.centralesupelec.csd.java.JavaParserObject" transient="true"
     * @generated
     */
    Node getJavaParserObject();

    /**
     * Sets the value of the '{@link fr.centralesupelec.csd.java.JavaNode#getJavaParserObject <em>Java Parser Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Java Parser Object</em>' reference.
     * @see #getJavaParserObject()
     * @generated
     */
    void setJavaParserObject( Node value );

} // JavaNode
