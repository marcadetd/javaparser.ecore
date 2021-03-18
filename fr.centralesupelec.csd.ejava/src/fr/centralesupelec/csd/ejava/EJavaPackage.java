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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.csd.ejava.EJavaFactory
 * @model kind="package"
 * @generated
 */
public interface EJavaPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "ejava";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://csd.centralesupelec.fr/ejava";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "ejava";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EJavaPackage eINSTANCE = fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl.init();

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.JavaNodeImpl <em>Java Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.JavaNodeImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getJavaNode()
     * @generated
     */
    int JAVA_NODE = 0;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_NODE__COMMENT = 0;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_NODE__ORPHAN_COMMENTS = 1;

    /**
     * The number of structural features of the '<em>Java Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_NODE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Java Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_NODE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ArrayCreationLevelImpl <em>Array Creation Level</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ArrayCreationLevelImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getArrayCreationLevel()
     * @generated
     */
    int ARRAY_CREATION_LEVEL = 1;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_LEVEL__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_LEVEL__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_LEVEL__ANNOTATIONS = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_LEVEL__DIMENSION = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Array Creation Level</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_LEVEL_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Array Creation Level</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_LEVEL_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.CompilationUnitImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getCompilationUnit()
     * @generated
     */
    int COMPILATION_UNIT = 2;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Package Declaration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT__PACKAGE_DECLARATION = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Imports</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT__IMPORTS = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT__TYPES = JAVA_NODE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Module</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT__MODULE = JAVA_NODE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Compilation Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Compilation Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ImportDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getImportDeclaration()
     * @generated
     */
    int IMPORT_DECLARATION = 3;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_DECLARATION__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_DECLARATION__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_DECLARATION__NAME = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_DECLARATION__STATIC = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Asterisk</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_DECLARATION__ASTERISK = JAVA_NODE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Import Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_DECLARATION_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Import Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_DECLARATION_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.PackageDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getPackageDeclaration()
     * @generated
     */
    int PACKAGE_DECLARATION = 4;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_DECLARATION__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_DECLARATION__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_DECLARATION__ANNOTATIONS = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_DECLARATION__NAME = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Package Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_DECLARATION_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Package Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_DECLARATION_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.BodyDeclarationImpl <em>Body Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.BodyDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBodyDeclaration()
     * @generated
     */
    int BODY_DECLARATION = 7;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_DECLARATION__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_DECLARATION__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_DECLARATION__ANNOTATIONS = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Body Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_DECLARATION_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Body Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODY_DECLARATION_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.TypeDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getTypeDeclaration()
     * @generated
     */
    int TYPE_DECLARATION = 18;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__COMMENT = BODY_DECLARATION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__ORPHAN_COMMENTS = BODY_DECLARATION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__NAME = BODY_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__MEMBERS = BODY_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__MODIFIERS = BODY_DECLARATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__PUBLIC = BODY_DECLARATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Private</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__PRIVATE = BODY_DECLARATION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__PROTECTED = BODY_DECLARATION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__STATIC = BODY_DECLARATION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Strictfp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__STRICTFP = BODY_DECLARATION_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Type Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Type Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.AnnotationDeclarationImpl <em>Annotation Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.AnnotationDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getAnnotationDeclaration()
     * @generated
     */
    int ANNOTATION_DECLARATION = 5;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION__COMMENT = TYPE_DECLARATION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION__ORPHAN_COMMENTS = TYPE_DECLARATION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION__ANNOTATIONS = TYPE_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION__NAME = TYPE_DECLARATION__NAME;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION__MEMBERS = TYPE_DECLARATION__MEMBERS;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION__MODIFIERS = TYPE_DECLARATION__MODIFIERS;

    /**
     * The feature id for the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION__PUBLIC = TYPE_DECLARATION__PUBLIC;

    /**
     * The feature id for the '<em><b>Private</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION__PRIVATE = TYPE_DECLARATION__PRIVATE;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION__PROTECTED = TYPE_DECLARATION__PROTECTED;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION__STATIC = TYPE_DECLARATION__STATIC;

    /**
     * The feature id for the '<em><b>Strictfp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION__STRICTFP = TYPE_DECLARATION__STRICTFP;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION__ABSTRACT = TYPE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Annotation Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Annotation Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_DECLARATION_OPERATION_COUNT = TYPE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.AnnotationMemberDeclarationImpl <em>Annotation Member Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.AnnotationMemberDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getAnnotationMemberDeclaration()
     * @generated
     */
    int ANNOTATION_MEMBER_DECLARATION = 6;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_MEMBER_DECLARATION__COMMENT = BODY_DECLARATION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_MEMBER_DECLARATION__ORPHAN_COMMENTS = BODY_DECLARATION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_MEMBER_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_MEMBER_DECLARATION__NAME = BODY_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_MEMBER_DECLARATION__TYPE = BODY_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_MEMBER_DECLARATION__MODIFIERS = BODY_DECLARATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_MEMBER_DECLARATION__PUBLIC = BODY_DECLARATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_MEMBER_DECLARATION__ABSTRACT = BODY_DECLARATION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE = BODY_DECLARATION_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Annotation Member Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_MEMBER_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Annotation Member Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_MEMBER_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl <em>Callable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getCallableDeclaration()
     * @generated
     */
    int CALLABLE_DECLARATION = 8;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__COMMENT = BODY_DECLARATION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__ORPHAN_COMMENTS = BODY_DECLARATION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__MODIFIERS = BODY_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__PUBLIC = BODY_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Private</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__PRIVATE = BODY_DECLARATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__PROTECTED = BODY_DECLARATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__NAME = BODY_DECLARATION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__PARAMETERS = BODY_DECLARATION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Thrown Exceptions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__THROWN_EXCEPTIONS = BODY_DECLARATION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__TYPE_PARAMETERS = BODY_DECLARATION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__ABSTRACT = BODY_DECLARATION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__STATIC = BODY_DECLARATION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__FINAL = BODY_DECLARATION_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Strictfp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__STRICTFP = BODY_DECLARATION_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Receiver Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION__RECEIVER_PARAMETER = BODY_DECLARATION_FEATURE_COUNT + 12;

    /**
     * The number of structural features of the '<em>Callable Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 13;

    /**
     * The number of operations of the '<em>Callable Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ClassOrInterfaceDeclarationImpl <em>Class Or Interface Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ClassOrInterfaceDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getClassOrInterfaceDeclaration()
     * @generated
     */
    int CLASS_OR_INTERFACE_DECLARATION = 9;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__COMMENT = TYPE_DECLARATION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__ORPHAN_COMMENTS = TYPE_DECLARATION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__ANNOTATIONS = TYPE_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__NAME = TYPE_DECLARATION__NAME;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__MEMBERS = TYPE_DECLARATION__MEMBERS;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__MODIFIERS = TYPE_DECLARATION__MODIFIERS;

    /**
     * The feature id for the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__PUBLIC = TYPE_DECLARATION__PUBLIC;

    /**
     * The feature id for the '<em><b>Private</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__PRIVATE = TYPE_DECLARATION__PRIVATE;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__PROTECTED = TYPE_DECLARATION__PROTECTED;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__STATIC = TYPE_DECLARATION__STATIC;

    /**
     * The feature id for the '<em><b>Strictfp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__STRICTFP = TYPE_DECLARATION__STRICTFP;

    /**
     * The feature id for the '<em><b>Implemented Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__IMPLEMENTED_TYPES = TYPE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Extended Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__EXTENDED_TYPES = TYPE_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__TYPE_PARAMETERS = TYPE_DECLARATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__ABSTRACT = TYPE_DECLARATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__FINAL = TYPE_DECLARATION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION__INTERFACE = TYPE_DECLARATION_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Class Or Interface Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Class Or Interface Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_DECLARATION_OPERATION_COUNT = TYPE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ConstructorDeclarationImpl <em>Constructor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ConstructorDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getConstructorDeclaration()
     * @generated
     */
    int CONSTRUCTOR_DECLARATION = 10;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__COMMENT = CALLABLE_DECLARATION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__ORPHAN_COMMENTS = CALLABLE_DECLARATION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__ANNOTATIONS = CALLABLE_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__MODIFIERS = CALLABLE_DECLARATION__MODIFIERS;

    /**
     * The feature id for the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__PUBLIC = CALLABLE_DECLARATION__PUBLIC;

    /**
     * The feature id for the '<em><b>Private</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__PRIVATE = CALLABLE_DECLARATION__PRIVATE;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__PROTECTED = CALLABLE_DECLARATION__PROTECTED;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__NAME = CALLABLE_DECLARATION__NAME;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__PARAMETERS = CALLABLE_DECLARATION__PARAMETERS;

    /**
     * The feature id for the '<em><b>Thrown Exceptions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__THROWN_EXCEPTIONS = CALLABLE_DECLARATION__THROWN_EXCEPTIONS;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__TYPE_PARAMETERS = CALLABLE_DECLARATION__TYPE_PARAMETERS;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__ABSTRACT = CALLABLE_DECLARATION__ABSTRACT;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__STATIC = CALLABLE_DECLARATION__STATIC;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__FINAL = CALLABLE_DECLARATION__FINAL;

    /**
     * The feature id for the '<em><b>Strictfp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__STRICTFP = CALLABLE_DECLARATION__STRICTFP;

    /**
     * The feature id for the '<em><b>Receiver Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__RECEIVER_PARAMETER = CALLABLE_DECLARATION__RECEIVER_PARAMETER;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION__BODY = CALLABLE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Constructor Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION_FEATURE_COUNT = CALLABLE_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Constructor Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_DECLARATION_OPERATION_COUNT = CALLABLE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.EnumConstantDeclarationImpl <em>Enum Constant Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.EnumConstantDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getEnumConstantDeclaration()
     * @generated
     */
    int ENUM_CONSTANT_DECLARATION = 11;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT_DECLARATION__COMMENT = BODY_DECLARATION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT_DECLARATION__ORPHAN_COMMENTS = BODY_DECLARATION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT_DECLARATION__NAME = BODY_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT_DECLARATION__ARGUMENTS = BODY_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Class Body</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT_DECLARATION__CLASS_BODY = BODY_DECLARATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Enum Constant Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Enum Constant Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.EnumDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getEnumDeclaration()
     * @generated
     */
    int ENUM_DECLARATION = 12;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__COMMENT = TYPE_DECLARATION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__ORPHAN_COMMENTS = TYPE_DECLARATION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__ANNOTATIONS = TYPE_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__NAME = TYPE_DECLARATION__NAME;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__MEMBERS = TYPE_DECLARATION__MEMBERS;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__MODIFIERS = TYPE_DECLARATION__MODIFIERS;

    /**
     * The feature id for the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__PUBLIC = TYPE_DECLARATION__PUBLIC;

    /**
     * The feature id for the '<em><b>Private</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__PRIVATE = TYPE_DECLARATION__PRIVATE;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__PROTECTED = TYPE_DECLARATION__PROTECTED;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__STATIC = TYPE_DECLARATION__STATIC;

    /**
     * The feature id for the '<em><b>Strictfp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__STRICTFP = TYPE_DECLARATION__STRICTFP;

    /**
     * The feature id for the '<em><b>Implemented Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__IMPLEMENTED_TYPES = TYPE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION__ENTRIES = TYPE_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Enum Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Enum Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_DECLARATION_OPERATION_COUNT = TYPE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.FieldDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getFieldDeclaration()
     * @generated
     */
    int FIELD_DECLARATION = 13;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION__COMMENT = BODY_DECLARATION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION__ORPHAN_COMMENTS = BODY_DECLARATION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Variables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION__VARIABLES = BODY_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION__MODIFIERS = BODY_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION__PUBLIC = BODY_DECLARATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Private</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION__PRIVATE = BODY_DECLARATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION__PROTECTED = BODY_DECLARATION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION__STATIC = BODY_DECLARATION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION__FINAL = BODY_DECLARATION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Transient</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION__TRANSIENT = BODY_DECLARATION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Volatile</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION__VOLATILE = BODY_DECLARATION_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Field Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 9;

    /**
     * The number of operations of the '<em>Field Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.InitializerDeclarationImpl <em>Initializer Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.InitializerDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getInitializerDeclaration()
     * @generated
     */
    int INITIALIZER_DECLARATION = 14;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZER_DECLARATION__COMMENT = BODY_DECLARATION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZER_DECLARATION__ORPHAN_COMMENTS = BODY_DECLARATION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZER_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZER_DECLARATION__BODY = BODY_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZER_DECLARATION__STATIC = BODY_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Initializer Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZER_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Initializer Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZER_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.MethodDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getMethodDeclaration()
     * @generated
     */
    int METHOD_DECLARATION = 15;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__COMMENT = CALLABLE_DECLARATION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__ORPHAN_COMMENTS = CALLABLE_DECLARATION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__ANNOTATIONS = CALLABLE_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__MODIFIERS = CALLABLE_DECLARATION__MODIFIERS;

    /**
     * The feature id for the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__PUBLIC = CALLABLE_DECLARATION__PUBLIC;

    /**
     * The feature id for the '<em><b>Private</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__PRIVATE = CALLABLE_DECLARATION__PRIVATE;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__PROTECTED = CALLABLE_DECLARATION__PROTECTED;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__NAME = CALLABLE_DECLARATION__NAME;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__PARAMETERS = CALLABLE_DECLARATION__PARAMETERS;

    /**
     * The feature id for the '<em><b>Thrown Exceptions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__THROWN_EXCEPTIONS = CALLABLE_DECLARATION__THROWN_EXCEPTIONS;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__TYPE_PARAMETERS = CALLABLE_DECLARATION__TYPE_PARAMETERS;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__ABSTRACT = CALLABLE_DECLARATION__ABSTRACT;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__STATIC = CALLABLE_DECLARATION__STATIC;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__FINAL = CALLABLE_DECLARATION__FINAL;

    /**
     * The feature id for the '<em><b>Strictfp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__STRICTFP = CALLABLE_DECLARATION__STRICTFP;

    /**
     * The feature id for the '<em><b>Receiver Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__RECEIVER_PARAMETER = CALLABLE_DECLARATION__RECEIVER_PARAMETER;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__TYPE = CALLABLE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__BODY = CALLABLE_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Native</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__NATIVE = CALLABLE_DECLARATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Synchronized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__SYNCHRONIZED = CALLABLE_DECLARATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION__DEFAULT = CALLABLE_DECLARATION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Method Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION_FEATURE_COUNT = CALLABLE_DECLARATION_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Method Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_DECLARATION_OPERATION_COUNT = CALLABLE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ParameterImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 16;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__TYPE = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__ANNOTATIONS = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__NAME = JAVA_NODE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__MODIFIERS = JAVA_NODE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__FINAL = JAVA_NODE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Var Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__VAR_ARGS = JAVA_NODE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Var Args Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__VAR_ARGS_ANNOTATIONS = JAVA_NODE_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ReceiverParameterImpl <em>Receiver Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ReceiverParameterImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getReceiverParameter()
     * @generated
     */
    int RECEIVER_PARAMETER = 17;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVER_PARAMETER__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVER_PARAMETER__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVER_PARAMETER__TYPE = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVER_PARAMETER__ANNOTATIONS = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVER_PARAMETER__NAME = JAVA_NODE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Receiver Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVER_PARAMETER_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Receiver Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVER_PARAMETER_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.VariableDeclaratorImpl <em>Variable Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.VariableDeclaratorImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getVariableDeclarator()
     * @generated
     */
    int VARIABLE_DECLARATOR = 19;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATOR__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATOR__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATOR__TYPE = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATOR__NAME = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Initializer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATOR__INITIALIZER = JAVA_NODE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Variable Declarator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATOR_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Variable Declarator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATOR_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.CommentImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getComment()
     * @generated
     */
    int COMMENT = 21;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Content</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__CONTENT = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.BlockCommentImpl <em>Block Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.BlockCommentImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBlockComment()
     * @generated
     */
    int BLOCK_COMMENT = 20;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_COMMENT__COMMENT = COMMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_COMMENT__ORPHAN_COMMENTS = COMMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Content</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_COMMENT__CONTENT = COMMENT__CONTENT;

    /**
     * The number of structural features of the '<em>Block Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_COMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Block Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_COMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.JavadocCommentImpl <em>Javadoc Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.JavadocCommentImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getJavadocComment()
     * @generated
     */
    int JAVADOC_COMMENT = 22;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVADOC_COMMENT__COMMENT = COMMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVADOC_COMMENT__ORPHAN_COMMENTS = COMMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Content</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVADOC_COMMENT__CONTENT = COMMENT__CONTENT;

    /**
     * The number of structural features of the '<em>Javadoc Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVADOC_COMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Javadoc Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVADOC_COMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.LineCommentImpl <em>Line Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.LineCommentImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLineComment()
     * @generated
     */
    int LINE_COMMENT = 23;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_COMMENT__COMMENT = COMMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_COMMENT__ORPHAN_COMMENTS = COMMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Content</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_COMMENT__CONTENT = COMMENT__CONTENT;

    /**
     * The number of structural features of the '<em>Line Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_COMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Line Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_COMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ExpressionImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getExpression()
     * @generated
     */
    int EXPRESSION = 37;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The number of structural features of the '<em>Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.AnnotationExprImpl <em>Annotation Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.AnnotationExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getAnnotationExpr()
     * @generated
     */
    int ANNOTATION_EXPR = 24;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_EXPR__NAME = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Annotation Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Annotation Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ArrayAccessExprImpl <em>Array Access Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ArrayAccessExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getArrayAccessExpr()
     * @generated
     */
    int ARRAY_ACCESS_EXPR = 25;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_ACCESS_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_ACCESS_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_ACCESS_EXPR__NAME = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Index</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_ACCESS_EXPR__INDEX = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Array Access Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_ACCESS_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Array Access Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_ACCESS_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ArrayCreationExprImpl <em>Array Creation Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ArrayCreationExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getArrayCreationExpr()
     * @generated
     */
    int ARRAY_CREATION_EXPR = 26;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Levels</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_EXPR__LEVELS = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Element Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_EXPR__ELEMENT_TYPE = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Initializer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_EXPR__INITIALIZER = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Array Creation Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Array Creation Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_CREATION_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ArrayInitializerExprImpl <em>Array Initializer Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ArrayInitializerExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getArrayInitializerExpr()
     * @generated
     */
    int ARRAY_INITIALIZER_EXPR = 27;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Values</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER_EXPR__VALUES = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Array Initializer Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Array Initializer Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.AssignExprImpl <em>Assign Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.AssignExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getAssignExpr()
     * @generated
     */
    int ASSIGN_EXPR = 28;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGN_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGN_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Target</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGN_EXPR__TARGET = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGN_EXPR__VALUE = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGN_EXPR__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Assign Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGN_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Assign Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGN_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.BinaryExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBinaryExpr()
     * @generated
     */
    int BINARY_EXPR = 29;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Left</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_EXPR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Right</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_EXPR__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Binary Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Binary Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.LiteralExprImpl <em>Literal Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.LiteralExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLiteralExpr()
     * @generated
     */
    int LITERAL_EXPR = 42;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The number of structural features of the '<em>Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.BooleanLiteralExprImpl <em>Boolean Literal Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.BooleanLiteralExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBooleanLiteralExpr()
     * @generated
     */
    int BOOLEAN_LITERAL_EXPR = 30;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL_EXPR__COMMENT = LITERAL_EXPR__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL_EXPR__ORPHAN_COMMENTS = LITERAL_EXPR__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL_EXPR__VALUE = LITERAL_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Boolean Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL_EXPR_FEATURE_COUNT = LITERAL_EXPR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Boolean Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL_EXPR_OPERATION_COUNT = LITERAL_EXPR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.CastExprImpl <em>Cast Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.CastExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getCastExpr()
     * @generated
     */
    int CAST_EXPR = 31;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPR__TYPE = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPR__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Cast Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Cast Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.LiteralStringValueExprImpl <em>Literal String Value Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.LiteralStringValueExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLiteralStringValueExpr()
     * @generated
     */
    int LITERAL_STRING_VALUE_EXPR = 43;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_STRING_VALUE_EXPR__COMMENT = LITERAL_EXPR__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_STRING_VALUE_EXPR__ORPHAN_COMMENTS = LITERAL_EXPR__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_STRING_VALUE_EXPR__VALUE = LITERAL_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Literal String Value Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_STRING_VALUE_EXPR_FEATURE_COUNT = LITERAL_EXPR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Literal String Value Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_STRING_VALUE_EXPR_OPERATION_COUNT = LITERAL_EXPR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.CharLiteralExprImpl <em>Char Literal Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.CharLiteralExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getCharLiteralExpr()
     * @generated
     */
    int CHAR_LITERAL_EXPR = 32;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR_LITERAL_EXPR__COMMENT = LITERAL_STRING_VALUE_EXPR__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR_LITERAL_EXPR__ORPHAN_COMMENTS = LITERAL_STRING_VALUE_EXPR__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR_LITERAL_EXPR__VALUE = LITERAL_STRING_VALUE_EXPR__VALUE;

    /**
     * The number of structural features of the '<em>Char Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR_LITERAL_EXPR_FEATURE_COUNT = LITERAL_STRING_VALUE_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Char Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR_LITERAL_EXPR_OPERATION_COUNT = LITERAL_STRING_VALUE_EXPR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ClassExprImpl <em>Class Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ClassExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getClassExpr()
     * @generated
     */
    int CLASS_EXPR = 33;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_EXPR__TYPE = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Class Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Class Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ConditionalExprImpl <em>Conditional Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ConditionalExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getConditionalExpr()
     * @generated
     */
    int CONDITIONAL_EXPR = 34;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPR__CONDITION = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Then Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPR__THEN_EXPR = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Else Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPR__ELSE_EXPR = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Conditional Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Conditional Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.DoubleLiteralExprImpl <em>Double Literal Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.DoubleLiteralExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getDoubleLiteralExpr()
     * @generated
     */
    int DOUBLE_LITERAL_EXPR = 35;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL_EXPR__COMMENT = LITERAL_STRING_VALUE_EXPR__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL_EXPR__ORPHAN_COMMENTS = LITERAL_STRING_VALUE_EXPR__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL_EXPR__VALUE = LITERAL_STRING_VALUE_EXPR__VALUE;

    /**
     * The number of structural features of the '<em>Double Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL_EXPR_FEATURE_COUNT = LITERAL_STRING_VALUE_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Double Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL_EXPR_OPERATION_COUNT = LITERAL_STRING_VALUE_EXPR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.EnclosedExprImpl <em>Enclosed Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.EnclosedExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getEnclosedExpr()
     * @generated
     */
    int ENCLOSED_EXPR = 36;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENCLOSED_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENCLOSED_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Inner</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENCLOSED_EXPR__INNER = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Enclosed Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENCLOSED_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Enclosed Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENCLOSED_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.FieldAccessExprImpl <em>Field Access Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.FieldAccessExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getFieldAccessExpr()
     * @generated
     */
    int FIELD_ACCESS_EXPR = 38;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_ACCESS_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_ACCESS_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_ACCESS_EXPR__NAME = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_ACCESS_EXPR__TYPE_ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Scope</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_ACCESS_EXPR__SCOPE = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Field Access Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_ACCESS_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Field Access Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_ACCESS_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.InstanceOfExprImpl <em>Instance Of Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.InstanceOfExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getInstanceOfExpr()
     * @generated
     */
    int INSTANCE_OF_EXPR = 39;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPR__TYPE = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPR__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPR__PATTERN = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Instance Of Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Instance Of Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.IntegerLiteralExprImpl <em>Integer Literal Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.IntegerLiteralExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getIntegerLiteralExpr()
     * @generated
     */
    int INTEGER_LITERAL_EXPR = 40;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL_EXPR__COMMENT = LITERAL_STRING_VALUE_EXPR__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL_EXPR__ORPHAN_COMMENTS = LITERAL_STRING_VALUE_EXPR__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL_EXPR__VALUE = LITERAL_STRING_VALUE_EXPR__VALUE;

    /**
     * The number of structural features of the '<em>Integer Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL_EXPR_FEATURE_COUNT = LITERAL_STRING_VALUE_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Integer Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL_EXPR_OPERATION_COUNT = LITERAL_STRING_VALUE_EXPR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.LambdaExprImpl <em>Lambda Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.LambdaExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLambdaExpr()
     * @generated
     */
    int LAMBDA_EXPR = 41;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LAMBDA_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LAMBDA_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LAMBDA_EXPR__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Enclosing Parameters</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LAMBDA_EXPR__ENCLOSING_PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Body</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LAMBDA_EXPR__BODY = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Lambda Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LAMBDA_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Lambda Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LAMBDA_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.LongLiteralExprImpl <em>Long Literal Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.LongLiteralExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLongLiteralExpr()
     * @generated
     */
    int LONG_LITERAL_EXPR = 44;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL_EXPR__COMMENT = LITERAL_STRING_VALUE_EXPR__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL_EXPR__ORPHAN_COMMENTS = LITERAL_STRING_VALUE_EXPR__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL_EXPR__VALUE = LITERAL_STRING_VALUE_EXPR__VALUE;

    /**
     * The number of structural features of the '<em>Long Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL_EXPR_FEATURE_COUNT = LITERAL_STRING_VALUE_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Long Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL_EXPR_OPERATION_COUNT = LITERAL_STRING_VALUE_EXPR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.MarkerAnnotationExprImpl <em>Marker Annotation Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.MarkerAnnotationExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getMarkerAnnotationExpr()
     * @generated
     */
    int MARKER_ANNOTATION_EXPR = 45;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER_ANNOTATION_EXPR__COMMENT = ANNOTATION_EXPR__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER_ANNOTATION_EXPR__ORPHAN_COMMENTS = ANNOTATION_EXPR__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER_ANNOTATION_EXPR__NAME = ANNOTATION_EXPR__NAME;

    /**
     * The number of structural features of the '<em>Marker Annotation Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER_ANNOTATION_EXPR_FEATURE_COUNT = ANNOTATION_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Marker Annotation Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER_ANNOTATION_EXPR_OPERATION_COUNT = ANNOTATION_EXPR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.MemberValuePairImpl <em>Member Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.MemberValuePairImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getMemberValuePair()
     * @generated
     */
    int MEMBER_VALUE_PAIR = 46;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_VALUE_PAIR__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_VALUE_PAIR__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_VALUE_PAIR__NAME = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_VALUE_PAIR__VALUE = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Member Value Pair</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_VALUE_PAIR_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Member Value Pair</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_VALUE_PAIR_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.MethodCallExprImpl <em>Method Call Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.MethodCallExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getMethodCallExpr()
     * @generated
     */
    int METHOD_CALL_EXPR = 47;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL_EXPR__TYPE_ARGUMENTS = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL_EXPR__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL_EXPR__NAME = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Scope</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL_EXPR__SCOPE = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Method Call Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Method Call Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.MethodReferenceExprImpl <em>Method Reference Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.MethodReferenceExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getMethodReferenceExpr()
     * @generated
     */
    int METHOD_REFERENCE_EXPR = 48;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_REFERENCE_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_REFERENCE_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Identifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_REFERENCE_EXPR__IDENTIFIER = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Scope</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_REFERENCE_EXPR__SCOPE = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Method Reference Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_REFERENCE_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Method Reference Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_REFERENCE_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.NameImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getName_()
     * @generated
     */
    int NAME = 49;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Identifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME__IDENTIFIER = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME__QUALIFIER = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.NameExprImpl <em>Name Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.NameExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNameExpr()
     * @generated
     */
    int NAME_EXPR = 50;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_EXPR__NAME = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Name Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Name Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.NormalAnnotationExprImpl <em>Normal Annotation Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.NormalAnnotationExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNormalAnnotationExpr()
     * @generated
     */
    int NORMAL_ANNOTATION_EXPR = 51;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NORMAL_ANNOTATION_EXPR__COMMENT = ANNOTATION_EXPR__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NORMAL_ANNOTATION_EXPR__ORPHAN_COMMENTS = ANNOTATION_EXPR__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NORMAL_ANNOTATION_EXPR__NAME = ANNOTATION_EXPR__NAME;

    /**
     * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NORMAL_ANNOTATION_EXPR__PAIRS = ANNOTATION_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Normal Annotation Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NORMAL_ANNOTATION_EXPR_FEATURE_COUNT = ANNOTATION_EXPR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Normal Annotation Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NORMAL_ANNOTATION_EXPR_OPERATION_COUNT = ANNOTATION_EXPR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.NullLiteralExprImpl <em>Null Literal Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.NullLiteralExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNullLiteralExpr()
     * @generated
     */
    int NULL_LITERAL_EXPR = 52;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL_EXPR__COMMENT = LITERAL_EXPR__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL_EXPR__ORPHAN_COMMENTS = LITERAL_EXPR__ORPHAN_COMMENTS;

    /**
     * The number of structural features of the '<em>Null Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL_EXPR_FEATURE_COUNT = LITERAL_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Null Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL_EXPR_OPERATION_COUNT = LITERAL_EXPR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ObjectCreationExprImpl <em>Object Creation Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ObjectCreationExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getObjectCreationExpr()
     * @generated
     */
    int OBJECT_CREATION_EXPR = 53;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_CREATION_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_CREATION_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_CREATION_EXPR__TYPE_ARGUMENTS = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_CREATION_EXPR__TYPE = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_CREATION_EXPR__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Scope</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_CREATION_EXPR__SCOPE = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Anonymous Class Body</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_CREATION_EXPR__ANONYMOUS_CLASS_BODY = EXPRESSION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Object Creation Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_CREATION_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Object Creation Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_CREATION_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.PatternExprImpl <em>Pattern Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.PatternExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getPatternExpr()
     * @generated
     */
    int PATTERN_EXPR = 54;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_EXPR__NAME = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_EXPR__TYPE = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Pattern Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Pattern Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.SimpleNameImpl <em>Simple Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.SimpleNameImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSimpleName()
     * @generated
     */
    int SIMPLE_NAME = 55;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_NAME__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_NAME__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Identifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_NAME__IDENTIFIER = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Simple Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_NAME_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Simple Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_NAME_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.SingleMemberAnnotationExprImpl <em>Single Member Annotation Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.SingleMemberAnnotationExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSingleMemberAnnotationExpr()
     * @generated
     */
    int SINGLE_MEMBER_ANNOTATION_EXPR = 56;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MEMBER_ANNOTATION_EXPR__COMMENT = ANNOTATION_EXPR__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MEMBER_ANNOTATION_EXPR__ORPHAN_COMMENTS = ANNOTATION_EXPR__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MEMBER_ANNOTATION_EXPR__NAME = ANNOTATION_EXPR__NAME;

    /**
     * The feature id for the '<em><b>Member Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MEMBER_ANNOTATION_EXPR__MEMBER_VALUE = ANNOTATION_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Single Member Annotation Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MEMBER_ANNOTATION_EXPR_FEATURE_COUNT = ANNOTATION_EXPR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Single Member Annotation Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_MEMBER_ANNOTATION_EXPR_OPERATION_COUNT = ANNOTATION_EXPR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.StringLiteralExprImpl <em>String Literal Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.StringLiteralExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getStringLiteralExpr()
     * @generated
     */
    int STRING_LITERAL_EXPR = 57;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_LITERAL_EXPR__COMMENT = LITERAL_STRING_VALUE_EXPR__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_LITERAL_EXPR__ORPHAN_COMMENTS = LITERAL_STRING_VALUE_EXPR__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_LITERAL_EXPR__VALUE = LITERAL_STRING_VALUE_EXPR__VALUE;

    /**
     * The number of structural features of the '<em>String Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_LITERAL_EXPR_FEATURE_COUNT = LITERAL_STRING_VALUE_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>String Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_LITERAL_EXPR_OPERATION_COUNT = LITERAL_STRING_VALUE_EXPR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.SuperExprImpl <em>Super Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.SuperExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSuperExpr()
     * @generated
     */
    int SUPER_EXPR = 58;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_EXPR__TYPE_NAME = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Super Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Super Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.SwitchExprImpl <em>Switch Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.SwitchExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSwitchExpr()
     * @generated
     */
    int SWITCH_EXPR = 59;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_EXPR__SELECTOR = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_EXPR__ENTRIES = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Switch Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Switch Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.TextBlockLiteralExprImpl <em>Text Block Literal Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.TextBlockLiteralExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getTextBlockLiteralExpr()
     * @generated
     */
    int TEXT_BLOCK_LITERAL_EXPR = 60;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK_LITERAL_EXPR__COMMENT = LITERAL_STRING_VALUE_EXPR__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK_LITERAL_EXPR__ORPHAN_COMMENTS = LITERAL_STRING_VALUE_EXPR__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK_LITERAL_EXPR__VALUE = LITERAL_STRING_VALUE_EXPR__VALUE;

    /**
     * The number of structural features of the '<em>Text Block Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK_LITERAL_EXPR_FEATURE_COUNT = LITERAL_STRING_VALUE_EXPR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Text Block Literal Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_BLOCK_LITERAL_EXPR_OPERATION_COUNT = LITERAL_STRING_VALUE_EXPR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ThisExprImpl <em>This Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ThisExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getThisExpr()
     * @generated
     */
    int THIS_EXPR = 61;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS_EXPR__TYPE_NAME = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>This Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>This Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.TypeExprImpl <em>Type Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.TypeExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getTypeExpr()
     * @generated
     */
    int TYPE_EXPR = 62;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_EXPR__TYPE = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Type Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Type Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.UnaryExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getUnaryExpr()
     * @generated
     */
    int UNARY_EXPR = 63;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPR__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPR__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Unary Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Unary Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.VariableDeclarationExprImpl <em>Variable Declaration Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.VariableDeclarationExprImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getVariableDeclarationExpr()
     * @generated
     */
    int VARIABLE_DECLARATION_EXPR = 64;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION_EXPR__COMMENT = EXPRESSION__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION_EXPR__ORPHAN_COMMENTS = EXPRESSION__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION_EXPR__MODIFIERS = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION_EXPR__FINAL = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION_EXPR__ANNOTATIONS = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Variables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION_EXPR__VARIABLES = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Variable Declaration Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Variable Declaration Expr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION_EXPR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleDeclarationImpl <em>Module Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ModuleDeclarationImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleDeclaration()
     * @generated
     */
    int MODULE_DECLARATION = 65;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_DECLARATION__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_DECLARATION__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_DECLARATION__NAME = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_DECLARATION__ANNOTATIONS = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Open</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_DECLARATION__OPEN = JAVA_NODE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Directives</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_DECLARATION__DIRECTIVES = JAVA_NODE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Module Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_DECLARATION_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Module Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_DECLARATION_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleDirectiveImpl <em>Module Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ModuleDirectiveImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleDirective()
     * @generated
     */
    int MODULE_DIRECTIVE = 66;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_DIRECTIVE__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_DIRECTIVE__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The number of structural features of the '<em>Module Directive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_DIRECTIVE_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Module Directive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_DIRECTIVE_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleExportsDirectiveImpl <em>Module Exports Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ModuleExportsDirectiveImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleExportsDirective()
     * @generated
     */
    int MODULE_EXPORTS_DIRECTIVE = 67;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_EXPORTS_DIRECTIVE__COMMENT = MODULE_DIRECTIVE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_EXPORTS_DIRECTIVE__ORPHAN_COMMENTS = MODULE_DIRECTIVE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_EXPORTS_DIRECTIVE__NAME = MODULE_DIRECTIVE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Module Names</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_EXPORTS_DIRECTIVE__MODULE_NAMES = MODULE_DIRECTIVE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Module Exports Directive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_EXPORTS_DIRECTIVE_FEATURE_COUNT = MODULE_DIRECTIVE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Module Exports Directive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_EXPORTS_DIRECTIVE_OPERATION_COUNT = MODULE_DIRECTIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleOpensDirectiveImpl <em>Module Opens Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ModuleOpensDirectiveImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleOpensDirective()
     * @generated
     */
    int MODULE_OPENS_DIRECTIVE = 68;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_OPENS_DIRECTIVE__COMMENT = MODULE_DIRECTIVE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_OPENS_DIRECTIVE__ORPHAN_COMMENTS = MODULE_DIRECTIVE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_OPENS_DIRECTIVE__NAME = MODULE_DIRECTIVE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Module Names</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_OPENS_DIRECTIVE__MODULE_NAMES = MODULE_DIRECTIVE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Module Opens Directive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_OPENS_DIRECTIVE_FEATURE_COUNT = MODULE_DIRECTIVE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Module Opens Directive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_OPENS_DIRECTIVE_OPERATION_COUNT = MODULE_DIRECTIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleProvidesDirectiveImpl <em>Module Provides Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ModuleProvidesDirectiveImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleProvidesDirective()
     * @generated
     */
    int MODULE_PROVIDES_DIRECTIVE = 69;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_PROVIDES_DIRECTIVE__COMMENT = MODULE_DIRECTIVE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_PROVIDES_DIRECTIVE__ORPHAN_COMMENTS = MODULE_DIRECTIVE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_PROVIDES_DIRECTIVE__NAME = MODULE_DIRECTIVE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>With</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_PROVIDES_DIRECTIVE__WITH = MODULE_DIRECTIVE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Module Provides Directive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_PROVIDES_DIRECTIVE_FEATURE_COUNT = MODULE_DIRECTIVE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Module Provides Directive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_PROVIDES_DIRECTIVE_OPERATION_COUNT = MODULE_DIRECTIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleRequiresDirectiveImpl <em>Module Requires Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ModuleRequiresDirectiveImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleRequiresDirective()
     * @generated
     */
    int MODULE_REQUIRES_DIRECTIVE = 70;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_REQUIRES_DIRECTIVE__COMMENT = MODULE_DIRECTIVE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_REQUIRES_DIRECTIVE__ORPHAN_COMMENTS = MODULE_DIRECTIVE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_REQUIRES_DIRECTIVE__MODIFIERS = MODULE_DIRECTIVE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_REQUIRES_DIRECTIVE__STATIC = MODULE_DIRECTIVE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_REQUIRES_DIRECTIVE__NAME = MODULE_DIRECTIVE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Transitive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_REQUIRES_DIRECTIVE__TRANSITIVE = MODULE_DIRECTIVE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Module Requires Directive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_REQUIRES_DIRECTIVE_FEATURE_COUNT = MODULE_DIRECTIVE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Module Requires Directive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_REQUIRES_DIRECTIVE_OPERATION_COUNT = MODULE_DIRECTIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleUsesDirectiveImpl <em>Module Uses Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ModuleUsesDirectiveImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleUsesDirective()
     * @generated
     */
    int MODULE_USES_DIRECTIVE = 71;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_USES_DIRECTIVE__COMMENT = MODULE_DIRECTIVE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_USES_DIRECTIVE__ORPHAN_COMMENTS = MODULE_DIRECTIVE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_USES_DIRECTIVE__NAME = MODULE_DIRECTIVE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Module Uses Directive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_USES_DIRECTIVE_FEATURE_COUNT = MODULE_DIRECTIVE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Module Uses Directive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_USES_DIRECTIVE_OPERATION_COUNT = MODULE_DIRECTIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithAnnotations <em>Node With Annotations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithAnnotations
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithAnnotations()
     * @generated
     */
    int NODE_WITH_ANNOTATIONS = 72;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ANNOTATIONS__ANNOTATIONS = 0;

    /**
     * The number of structural features of the '<em>Node With Annotations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ANNOTATIONS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Annotations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ANNOTATIONS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithArguments <em>Node With Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithArguments
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithArguments()
     * @generated
     */
    int NODE_WITH_ARGUMENTS = 73;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ARGUMENTS__ARGUMENTS = 0;

    /**
     * The number of structural features of the '<em>Node With Arguments</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ARGUMENTS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Arguments</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ARGUMENTS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithBlockStmt <em>Node With Block Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithBlockStmt
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithBlockStmt()
     * @generated
     */
    int NODE_WITH_BLOCK_STMT = 74;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_BLOCK_STMT__BODY = 0;

    /**
     * The number of structural features of the '<em>Node With Block Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_BLOCK_STMT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Block Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_BLOCK_STMT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithBody <em>Node With Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithBody
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithBody()
     * @generated
     */
    int NODE_WITH_BODY = 75;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_BODY__BODY = 0;

    /**
     * The number of structural features of the '<em>Node With Body</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_BODY_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Body</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_BODY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithCondition <em>Node With Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithCondition
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithCondition()
     * @generated
     */
    int NODE_WITH_CONDITION = 76;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_CONDITION__CONDITION = 0;

    /**
     * The number of structural features of the '<em>Node With Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_CONDITION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_CONDITION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithExpression <em>Node With Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithExpression
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithExpression()
     * @generated
     */
    int NODE_WITH_EXPRESSION = 77;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_EXPRESSION__EXPRESSION = 0;

    /**
     * The number of structural features of the '<em>Node With Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_EXPRESSION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_EXPRESSION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithExtends <em>Node With Extends</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithExtends
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithExtends()
     * @generated
     */
    int NODE_WITH_EXTENDS = 78;

    /**
     * The feature id for the '<em><b>Extended Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_EXTENDS__EXTENDED_TYPES = 0;

    /**
     * The number of structural features of the '<em>Node With Extends</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_EXTENDS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Extends</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_EXTENDS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithIdentifier <em>Node With Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithIdentifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithIdentifier()
     * @generated
     */
    int NODE_WITH_IDENTIFIER = 79;

    /**
     * The feature id for the '<em><b>Identifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_IDENTIFIER__IDENTIFIER = 0;

    /**
     * The number of structural features of the '<em>Node With Identifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_IDENTIFIER_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Identifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_IDENTIFIER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithImplements <em>Node With Implements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithImplements
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithImplements()
     * @generated
     */
    int NODE_WITH_IMPLEMENTS = 80;

    /**
     * The feature id for the '<em><b>Implemented Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_IMPLEMENTS__IMPLEMENTED_TYPES = 0;

    /**
     * The number of structural features of the '<em>Node With Implements</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_IMPLEMENTS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Implements</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_IMPLEMENTS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithJavadoc <em>Node With Javadoc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithJavadoc
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithJavadoc()
     * @generated
     */
    int NODE_WITH_JAVADOC = 81;

    /**
     * The number of structural features of the '<em>Node With Javadoc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_JAVADOC_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Node With Javadoc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_JAVADOC_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithMembers <em>Node With Members</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithMembers
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithMembers()
     * @generated
     */
    int NODE_WITH_MEMBERS = 82;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_MEMBERS__MEMBERS = 0;

    /**
     * The number of structural features of the '<em>Node With Members</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_MEMBERS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Members</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_MEMBERS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithModifiers <em>Node With Modifiers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithModifiers
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithModifiers()
     * @generated
     */
    int NODE_WITH_MODIFIERS = 83;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_MODIFIERS__MODIFIERS = 0;

    /**
     * The number of structural features of the '<em>Node With Modifiers</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_MODIFIERS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Modifiers</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_MODIFIERS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithName <em>Node With Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithName
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithName()
     * @generated
     */
    int NODE_WITH_NAME = 84;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_NAME__NAME = 0;

    /**
     * The number of structural features of the '<em>Node With Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_NAME_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_NAME_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithLabel <em>Node With Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithLabel
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithLabel()
     * @generated
     */
    int NODE_WITH_LABEL = 85;

    /**
     * The feature id for the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_LABEL__LABEL = 0;

    /**
     * The number of structural features of the '<em>Node With Label</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_LABEL_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Label</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_LABEL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithParameters <em>Node With Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithParameters
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithParameters()
     * @generated
     */
    int NODE_WITH_PARAMETERS = 86;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PARAMETERS__PARAMETERS = 0;

    /**
     * The number of structural features of the '<em>Node With Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PARAMETERS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PARAMETERS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithRange <em>Node With Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithRange
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithRange()
     * @generated
     */
    int NODE_WITH_RANGE = 87;

    /**
     * The number of structural features of the '<em>Node With Range</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_RANGE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Node With Range</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_RANGE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithScope <em>Node With Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithScope
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithScope()
     * @generated
     */
    int NODE_WITH_SCOPE = 88;

    /**
     * The feature id for the '<em><b>Scope</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_SCOPE__SCOPE = 0;

    /**
     * The number of structural features of the '<em>Node With Scope</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_SCOPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Scope</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_SCOPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithSimpleName <em>Node With Simple Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithSimpleName
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithSimpleName()
     * @generated
     */
    int NODE_WITH_SIMPLE_NAME = 89;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_SIMPLE_NAME__NAME = 0;

    /**
     * The number of structural features of the '<em>Node With Simple Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_SIMPLE_NAME_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Simple Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_SIMPLE_NAME_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithStatements <em>Node With Statements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithStatements
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithStatements()
     * @generated
     */
    int NODE_WITH_STATEMENTS = 90;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_STATEMENTS__STATEMENTS = 0;

    /**
     * The number of structural features of the '<em>Node With Statements</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_STATEMENTS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Statements</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_STATEMENTS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithThrownExceptions <em>Node With Thrown Exceptions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithThrownExceptions
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithThrownExceptions()
     * @generated
     */
    int NODE_WITH_THROWN_EXCEPTIONS = 91;

    /**
     * The feature id for the '<em><b>Thrown Exceptions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_THROWN_EXCEPTIONS__THROWN_EXCEPTIONS = 0;

    /**
     * The number of structural features of the '<em>Node With Thrown Exceptions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_THROWN_EXCEPTIONS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Thrown Exceptions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_THROWN_EXCEPTIONS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithTokenRange <em>Node With Token Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithTokenRange
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithTokenRange()
     * @generated
     */
    int NODE_WITH_TOKEN_RANGE = 92;

    /**
     * The number of structural features of the '<em>Node With Token Range</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TOKEN_RANGE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Node With Token Range</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TOKEN_RANGE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithType <em>Node With Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithType
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithType()
     * @generated
     */
    int NODE_WITH_TYPE = 93;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TYPE__TYPE = 0;

    /**
     * The number of structural features of the '<em>Node With Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithTypeArguments <em>Node With Type Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithTypeArguments
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithTypeArguments()
     * @generated
     */
    int NODE_WITH_TYPE_ARGUMENTS = 94;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS = 0;

    /**
     * The number of structural features of the '<em>Node With Type Arguments</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TYPE_ARGUMENTS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Type Arguments</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TYPE_ARGUMENTS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithTypeParameters <em>Node With Type Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithTypeParameters
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithTypeParameters()
     * @generated
     */
    int NODE_WITH_TYPE_PARAMETERS = 95;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TYPE_PARAMETERS__TYPE_PARAMETERS = 0;

    /**
     * The number of structural features of the '<em>Node With Type Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TYPE_PARAMETERS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Type Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TYPE_PARAMETERS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithVariables <em>Node With Variables</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithVariables
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithVariables()
     * @generated
     */
    int NODE_WITH_VARIABLES = 96;

    /**
     * The feature id for the '<em><b>Variables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_VARIABLES__VARIABLES = 0;

    /**
     * The number of structural features of the '<em>Node With Variables</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_VARIABLES_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Node With Variables</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_VARIABLES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.SwitchNode <em>Switch Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.SwitchNode
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSwitchNode()
     * @generated
     */
    int SWITCH_NODE = 97;

    /**
     * The feature id for the '<em><b>Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_NODE__SELECTOR = 0;

    /**
     * The feature id for the '<em><b>Entries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_NODE__ENTRIES = 1;

    /**
     * The number of structural features of the '<em>Switch Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_NODE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Switch Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_NODE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithAbstractModifier <em>Node With Abstract Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithAbstractModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithAbstractModifier()
     * @generated
     */
    int NODE_WITH_ABSTRACT_MODIFIER = 98;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ABSTRACT_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ABSTRACT_MODIFIER__ABSTRACT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Abstract Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ABSTRACT_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Abstract Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ABSTRACT_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithPublicModifier <em>Node With Public Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithPublicModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithPublicModifier()
     * @generated
     */
    int NODE_WITH_PUBLIC_MODIFIER = 105;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PUBLIC_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PUBLIC_MODIFIER__PUBLIC = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Public Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PUBLIC_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Public Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PUBLIC_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithAccessModifiers <em>Node With Access Modifiers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithAccessModifiers
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithAccessModifiers()
     * @generated
     */
    int NODE_WITH_ACCESS_MODIFIERS = 99;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ACCESS_MODIFIERS__MODIFIERS = NODE_WITH_PUBLIC_MODIFIER__MODIFIERS;

    /**
     * The feature id for the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ACCESS_MODIFIERS__PUBLIC = NODE_WITH_PUBLIC_MODIFIER__PUBLIC;

    /**
     * The feature id for the '<em><b>Private</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ACCESS_MODIFIERS__PRIVATE = NODE_WITH_PUBLIC_MODIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ACCESS_MODIFIERS__PROTECTED = NODE_WITH_PUBLIC_MODIFIER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Node With Access Modifiers</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ACCESS_MODIFIERS_FEATURE_COUNT = NODE_WITH_PUBLIC_MODIFIER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Node With Access Modifiers</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_ACCESS_MODIFIERS_OPERATION_COUNT = NODE_WITH_PUBLIC_MODIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithDefaultModifier <em>Node With Default Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithDefaultModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithDefaultModifier()
     * @generated
     */
    int NODE_WITH_DEFAULT_MODIFIER = 100;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_DEFAULT_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_DEFAULT_MODIFIER__DEFAULT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Default Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_DEFAULT_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Default Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_DEFAULT_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithFinalModifier <em>Node With Final Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithFinalModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithFinalModifier()
     * @generated
     */
    int NODE_WITH_FINAL_MODIFIER = 101;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_FINAL_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_FINAL_MODIFIER__FINAL = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Final Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_FINAL_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Final Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_FINAL_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithNativeModifier <em>Node With Native Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithNativeModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithNativeModifier()
     * @generated
     */
    int NODE_WITH_NATIVE_MODIFIER = 102;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_NATIVE_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Native</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_NATIVE_MODIFIER__NATIVE = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Native Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_NATIVE_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Native Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_NATIVE_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithPrivateModifier <em>Node With Private Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithPrivateModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithPrivateModifier()
     * @generated
     */
    int NODE_WITH_PRIVATE_MODIFIER = 103;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PRIVATE_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Private</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PRIVATE_MODIFIER__PRIVATE = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Private Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PRIVATE_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Private Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PRIVATE_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithProtectedModifier <em>Node With Protected Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithProtectedModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithProtectedModifier()
     * @generated
     */
    int NODE_WITH_PROTECTED_MODIFIER = 104;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PROTECTED_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Protected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PROTECTED_MODIFIER__PROTECTED = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Protected Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PROTECTED_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Protected Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_PROTECTED_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithStaticModifier <em>Node With Static Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithStaticModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithStaticModifier()
     * @generated
     */
    int NODE_WITH_STATIC_MODIFIER = 106;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_STATIC_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_STATIC_MODIFIER__STATIC = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Static Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_STATIC_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Static Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_STATIC_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithSynchronizedModifier <em>Node With Synchronized Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithSynchronizedModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithSynchronizedModifier()
     * @generated
     */
    int NODE_WITH_SYNCHRONIZED_MODIFIER = 107;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_SYNCHRONIZED_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Synchronized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_SYNCHRONIZED_MODIFIER__SYNCHRONIZED = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Synchronized Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_SYNCHRONIZED_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Synchronized Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_SYNCHRONIZED_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithStrictfpModifier <em>Node With Strictfp Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithStrictfpModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithStrictfpModifier()
     * @generated
     */
    int NODE_WITH_STRICTFP_MODIFIER = 108;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_STRICTFP_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Strictfp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_STRICTFP_MODIFIER__STRICTFP = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Strictfp Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_STRICTFP_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Strictfp Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_STRICTFP_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithTransientModifier <em>Node With Transient Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithTransientModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithTransientModifier()
     * @generated
     */
    int NODE_WITH_TRANSIENT_MODIFIER = 109;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TRANSIENT_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Transient</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TRANSIENT_MODIFIER__TRANSIENT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Transient Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TRANSIENT_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Transient Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TRANSIENT_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithTransitiveModifier <em>Node With Transitive Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithTransitiveModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithTransitiveModifier()
     * @generated
     */
    int NODE_WITH_TRANSITIVE_MODIFIER = 110;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TRANSITIVE_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Transitive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TRANSITIVE_MODIFIER__TRANSITIVE = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Transitive Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TRANSITIVE_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Transitive Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_TRANSITIVE_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.NodeWithVolatileModifier <em>Node With Volatile Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.NodeWithVolatileModifier
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithVolatileModifier()
     * @generated
     */
    int NODE_WITH_VOLATILE_MODIFIER = 111;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_VOLATILE_MODIFIER__MODIFIERS = NODE_WITH_MODIFIERS__MODIFIERS;

    /**
     * The feature id for the '<em><b>Volatile</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_VOLATILE_MODIFIER__VOLATILE = NODE_WITH_MODIFIERS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Node With Volatile Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_VOLATILE_MODIFIER_FEATURE_COUNT = NODE_WITH_MODIFIERS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Node With Volatile Modifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_WITH_VOLATILE_MODIFIER_OPERATION_COUNT = NODE_WITH_MODIFIERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.StatementImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getStatement()
     * @generated
     */
    int STATEMENT = 127;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The number of structural features of the '<em>Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.AssertStmtImpl <em>Assert Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.AssertStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getAssertStmt()
     * @generated
     */
    int ASSERT_STMT = 112;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERT_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERT_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Check</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERT_STMT__CHECK = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERT_STMT__MESSAGE = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Assert Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERT_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Assert Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERT_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.BlockStmtImpl <em>Block Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.BlockStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBlockStmt()
     * @generated
     */
    int BLOCK_STMT = 113;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_STMT__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Block Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Block Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.BreakStmtImpl <em>Break Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.BreakStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBreakStmt()
     * @generated
     */
    int BREAK_STMT = 114;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BREAK_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BREAK_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BREAK_STMT__LABEL = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Break Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BREAK_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Break Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BREAK_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.CatchClauseImpl <em>Catch Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.CatchClauseImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getCatchClause()
     * @generated
     */
    int CATCH_CLAUSE = 115;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_CLAUSE__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_CLAUSE__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_CLAUSE__BODY = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_CLAUSE__PARAMETER = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Catch Clause</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_CLAUSE_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Catch Clause</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_CLAUSE_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ContinueStmtImpl <em>Continue Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ContinueStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getContinueStmt()
     * @generated
     */
    int CONTINUE_STMT = 116;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTINUE_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTINUE_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTINUE_STMT__LABEL = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Continue Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTINUE_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Continue Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTINUE_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.DoStmtImpl <em>Do Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.DoStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getDoStmt()
     * @generated
     */
    int DO_STMT = 117;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_STMT__BODY = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_STMT__CONDITION = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Do Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Do Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.EmptyStmtImpl <em>Empty Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.EmptyStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getEmptyStmt()
     * @generated
     */
    int EMPTY_STMT = 118;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The number of structural features of the '<em>Empty Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Empty Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ExplicitConstructorInvocationStmtImpl <em>Explicit Constructor Invocation Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ExplicitConstructorInvocationStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getExplicitConstructorInvocationStmt()
     * @generated
     */
    int EXPLICIT_CONSTRUCTOR_INVOCATION_STMT = 119;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__TYPE_ARGUMENTS = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__ARGUMENTS = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__EXPRESSION = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Is This</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__IS_THIS = STATEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Explicit Constructor Invocation Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_INVOCATION_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Explicit Constructor Invocation Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_INVOCATION_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ExpressionStmtImpl <em>Expression Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ExpressionStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getExpressionStmt()
     * @generated
     */
    int EXPRESSION_STMT = 120;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_STMT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Expression Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Expression Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ForEachStmtImpl <em>For Each Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ForEachStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getForEachStmt()
     * @generated
     */
    int FOR_EACH_STMT = 121;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_STMT__BODY = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_STMT__VARIABLE = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Iterable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_STMT__ITERABLE = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>For Each Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>For Each Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ForStmtImpl <em>For Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ForStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getForStmt()
     * @generated
     */
    int FOR_STMT = 122;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_STMT__BODY = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Initialization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_STMT__INITIALIZATION = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Compare</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_STMT__COMPARE = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Update</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_STMT__UPDATE = STATEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>For Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>For Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.IfStmtImpl <em>If Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.IfStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getIfStmt()
     * @generated
     */
    int IF_STMT = 123;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_STMT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Then Stmt</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_STMT__THEN_STMT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Else Stmt</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_STMT__ELSE_STMT = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>If Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>If Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.LabeledStmtImpl <em>Labeled Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.LabeledStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLabeledStmt()
     * @generated
     */
    int LABELED_STMT = 124;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_STMT__LABEL = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Statement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_STMT__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Labeled Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Labeled Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABELED_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.LocalClassDeclarationStmtImpl <em>Local Class Declaration Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.LocalClassDeclarationStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLocalClassDeclarationStmt()
     * @generated
     */
    int LOCAL_CLASS_DECLARATION_STMT = 125;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_CLASS_DECLARATION_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_CLASS_DECLARATION_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Class Declaration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_CLASS_DECLARATION_STMT__CLASS_DECLARATION = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Local Class Declaration Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_CLASS_DECLARATION_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Local Class Declaration Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_CLASS_DECLARATION_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ReturnStmtImpl <em>Return Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ReturnStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getReturnStmt()
     * @generated
     */
    int RETURN_STMT = 126;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_STMT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Return Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Return Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.SwitchEntryImpl <em>Switch Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.SwitchEntryImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSwitchEntry()
     * @generated
     */
    int SWITCH_ENTRY = 128;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ENTRY__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ENTRY__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ENTRY__STATEMENTS = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Labels</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ENTRY__LABELS = JAVA_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ENTRY__TYPE = JAVA_NODE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Switch Entry</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ENTRY_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Switch Entry</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_ENTRY_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.SwitchStmtImpl <em>Switch Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.SwitchStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSwitchStmt()
     * @generated
     */
    int SWITCH_STMT = 129;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_STMT__SELECTOR = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_STMT__ENTRIES = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Switch Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Switch Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SWITCH_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.SynchronizedStmtImpl <em>Synchronized Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.SynchronizedStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSynchronizedStmt()
     * @generated
     */
    int SYNCHRONIZED_STMT = 130;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCHRONIZED_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCHRONIZED_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCHRONIZED_STMT__BODY = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCHRONIZED_STMT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Synchronized Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCHRONIZED_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Synchronized Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCHRONIZED_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ThrowStmtImpl <em>Throw Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ThrowStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getThrowStmt()
     * @generated
     */
    int THROW_STMT = 131;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_STMT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Throw Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Throw Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.TryStmtImpl <em>Try Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.TryStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getTryStmt()
     * @generated
     */
    int TRY_STMT = 132;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRY_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRY_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRY_STMT__RESOURCES = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Try Block</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRY_STMT__TRY_BLOCK = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Catch Clauses</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRY_STMT__CATCH_CLAUSES = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Finally Block</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRY_STMT__FINALLY_BLOCK = STATEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Try Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRY_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Try Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRY_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.WhileStmtImpl <em>While Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.WhileStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getWhileStmt()
     * @generated
     */
    int WHILE_STMT = 133;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHILE_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHILE_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHILE_STMT__BODY = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHILE_STMT__CONDITION = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>While Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHILE_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>While Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHILE_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.YieldStmtImpl <em>Yield Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.YieldStmtImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getYieldStmt()
     * @generated
     */
    int YIELD_STMT = 134;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YIELD_STMT__COMMENT = STATEMENT__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YIELD_STMT__ORPHAN_COMMENTS = STATEMENT__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YIELD_STMT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Yield Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YIELD_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Yield Stmt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int YIELD_STMT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.TypeImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getType()
     * @generated
     */
    int TYPE = 140;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE__COMMENT = JAVA_NODE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE__ORPHAN_COMMENTS = JAVA_NODE__ORPHAN_COMMENTS;

    /**
     * The number of structural features of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_FEATURE_COUNT = JAVA_NODE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_OPERATION_COUNT = JAVA_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ReferenceTypeImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getReferenceType()
     * @generated
     */
    int REFERENCE_TYPE = 139;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_TYPE__COMMENT = TYPE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_TYPE__ORPHAN_COMMENTS = TYPE__ORPHAN_COMMENTS;

    /**
     * The number of structural features of the '<em>Reference Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Reference Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ArrayTypeImpl <em>Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ArrayTypeImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getArrayType()
     * @generated
     */
    int ARRAY_TYPE = 135;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPE__COMMENT = REFERENCE_TYPE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPE__ORPHAN_COMMENTS = REFERENCE_TYPE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPE__ANNOTATIONS = REFERENCE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Component Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPE__COMPONENT_TYPE = REFERENCE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Origin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPE__ORIGIN = REFERENCE_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Array Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPE_FEATURE_COUNT = REFERENCE_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Array Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPE_OPERATION_COUNT = REFERENCE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.ClassOrInterfaceTypeImpl <em>Class Or Interface Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.ClassOrInterfaceTypeImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getClassOrInterfaceType()
     * @generated
     */
    int CLASS_OR_INTERFACE_TYPE = 136;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_TYPE__COMMENT = REFERENCE_TYPE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_TYPE__ORPHAN_COMMENTS = REFERENCE_TYPE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_TYPE__NAME = REFERENCE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_TYPE__ANNOTATIONS = REFERENCE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_TYPE__TYPE_ARGUMENTS = REFERENCE_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Scope</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_TYPE__SCOPE = REFERENCE_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Class Or Interface Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_TYPE_FEATURE_COUNT = REFERENCE_TYPE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Class Or Interface Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OR_INTERFACE_TYPE_OPERATION_COUNT = REFERENCE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.IntersectionTypeImpl <em>Intersection Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.IntersectionTypeImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getIntersectionType()
     * @generated
     */
    int INTERSECTION_TYPE = 137;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERSECTION_TYPE__COMMENT = TYPE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERSECTION_TYPE__ORPHAN_COMMENTS = TYPE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERSECTION_TYPE__ANNOTATIONS = TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERSECTION_TYPE__ELEMENTS = TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Intersection Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERSECTION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Intersection Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERSECTION_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.PrimitiveTypeImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getPrimitiveType()
     * @generated
     */
    int PRIMITIVE_TYPE = 138;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE__COMMENT = TYPE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE__ORPHAN_COMMENTS = TYPE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE__ANNOTATIONS = TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE__TYPE = TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Primitive Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Primitive Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.TypeParameterImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getTypeParameter()
     * @generated
     */
    int TYPE_PARAMETER = 141;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER__COMMENT = REFERENCE_TYPE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER__ORPHAN_COMMENTS = REFERENCE_TYPE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER__NAME = REFERENCE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER__ANNOTATIONS = REFERENCE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type Bound</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER__TYPE_BOUND = REFERENCE_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Type Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER_FEATURE_COUNT = REFERENCE_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Type Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER_OPERATION_COUNT = REFERENCE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.UnionTypeImpl <em>Union Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.UnionTypeImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getUnionType()
     * @generated
     */
    int UNION_TYPE = 142;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE__COMMENT = TYPE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE__ORPHAN_COMMENTS = TYPE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE__ANNOTATIONS = TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE__ELEMENTS = TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Union Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Union Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.UnknownTypeImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getUnknownType()
     * @generated
     */
    int UNKNOWN_TYPE = 143;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE__COMMENT = TYPE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE__ORPHAN_COMMENTS = TYPE__ORPHAN_COMMENTS;

    /**
     * The number of structural features of the '<em>Unknown Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Unknown Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.VarTypeImpl <em>Var Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.VarTypeImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getVarType()
     * @generated
     */
    int VAR_TYPE = 144;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_TYPE__COMMENT = TYPE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_TYPE__ORPHAN_COMMENTS = TYPE__ORPHAN_COMMENTS;

    /**
     * The number of structural features of the '<em>Var Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Var Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAR_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.VoidTypeImpl <em>Void Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.VoidTypeImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getVoidType()
     * @generated
     */
    int VOID_TYPE = 145;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID_TYPE__COMMENT = TYPE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID_TYPE__ORPHAN_COMMENTS = TYPE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID_TYPE__ANNOTATIONS = TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Void Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Void Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.impl.WildcardTypeImpl <em>Wildcard Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.impl.WildcardTypeImpl
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getWildcardType()
     * @generated
     */
    int WILDCARD_TYPE = 146;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_TYPE__COMMENT = TYPE__COMMENT;

    /**
     * The feature id for the '<em><b>Orphan Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_TYPE__ORPHAN_COMMENTS = TYPE__ORPHAN_COMMENTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_TYPE__ANNOTATIONS = TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Extended Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_TYPE__EXTENDED_TYPE = TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Super Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_TYPE__SUPER_TYPE = TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Wildcard Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Wildcard Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.ModifierKeyword <em>Modifier Keyword</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.ModifierKeyword
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModifierKeyword()
     * @generated
     */
    int MODIFIER_KEYWORD = 147;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.AssignOperator <em>Assign Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.AssignOperator
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getAssignOperator()
     * @generated
     */
    int ASSIGN_OPERATOR = 148;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.BinaryOperator <em>Binary Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.BinaryOperator
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBinaryOperator()
     * @generated
     */
    int BINARY_OPERATOR = 149;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.UnaryOperator <em>Unary Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.UnaryOperator
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getUnaryOperator()
     * @generated
     */
    int UNARY_OPERATOR = 150;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.SwitchEntryType <em>Switch Entry Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.SwitchEntryType
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSwitchEntryType()
     * @generated
     */
    int SWITCH_ENTRY_TYPE = 151;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.ArrayTypeOrigin <em>Array Type Origin</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.ArrayTypeOrigin
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getArrayTypeOrigin()
     * @generated
     */
    int ARRAY_TYPE_ORIGIN = 152;

    /**
     * The meta object id for the '{@link fr.centralesupelec.csd.ejava.Primitive <em>Primitive</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.csd.ejava.Primitive
     * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getPrimitive()
     * @generated
     */
    int PRIMITIVE = 153;

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.JavaNode <em>Java Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Node</em>'.
     * @see fr.centralesupelec.csd.ejava.JavaNode
     * @generated
     */
    EClass getJavaNode();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.JavaNode#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Comment</em>'.
     * @see fr.centralesupelec.csd.ejava.JavaNode#getComment()
     * @see #getJavaNode()
     * @generated
     */
    EReference getJavaNode_Comment();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.JavaNode#getOrphanComments <em>Orphan Comments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Orphan Comments</em>'.
     * @see fr.centralesupelec.csd.ejava.JavaNode#getOrphanComments()
     * @see #getJavaNode()
     * @generated
     */
    EReference getJavaNode_OrphanComments();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ArrayCreationLevel <em>Array Creation Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Creation Level</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayCreationLevel
     * @generated
     */
    EClass getArrayCreationLevel();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.ArrayCreationLevel#getDimension <em>Dimension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Dimension</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayCreationLevel#getDimension()
     * @see #getArrayCreationLevel()
     * @generated
     */
    EReference getArrayCreationLevel_Dimension();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.CompilationUnit <em>Compilation Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Compilation Unit</em>'.
     * @see fr.centralesupelec.csd.ejava.CompilationUnit
     * @generated
     */
    EClass getCompilationUnit();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.CompilationUnit#getPackageDeclaration <em>Package Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Package Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.CompilationUnit#getPackageDeclaration()
     * @see #getCompilationUnit()
     * @generated
     */
    EReference getCompilationUnit_PackageDeclaration();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.CompilationUnit#getImports <em>Imports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Imports</em>'.
     * @see fr.centralesupelec.csd.ejava.CompilationUnit#getImports()
     * @see #getCompilationUnit()
     * @generated
     */
    EReference getCompilationUnit_Imports();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.CompilationUnit#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Types</em>'.
     * @see fr.centralesupelec.csd.ejava.CompilationUnit#getTypes()
     * @see #getCompilationUnit()
     * @generated
     */
    EReference getCompilationUnit_Types();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.CompilationUnit#getModule <em>Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Module</em>'.
     * @see fr.centralesupelec.csd.ejava.CompilationUnit#getModule()
     * @see #getCompilationUnit()
     * @generated
     */
    EReference getCompilationUnit_Module();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ImportDeclaration <em>Import Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.ImportDeclaration
     * @generated
     */
    EClass getImportDeclaration();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.ImportDeclaration#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see fr.centralesupelec.csd.ejava.ImportDeclaration#isStatic()
     * @see #getImportDeclaration()
     * @generated
     */
    EAttribute getImportDeclaration_Static();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.ImportDeclaration#isAsterisk <em>Asterisk</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Asterisk</em>'.
     * @see fr.centralesupelec.csd.ejava.ImportDeclaration#isAsterisk()
     * @see #getImportDeclaration()
     * @generated
     */
    EAttribute getImportDeclaration_Asterisk();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.PackageDeclaration <em>Package Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Package Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.PackageDeclaration
     * @generated
     */
    EClass getPackageDeclaration();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.AnnotationDeclaration <em>Annotation Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Annotation Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.AnnotationDeclaration
     * @generated
     */
    EClass getAnnotationDeclaration();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.AnnotationMemberDeclaration <em>Annotation Member Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Annotation Member Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.AnnotationMemberDeclaration
     * @generated
     */
    EClass getAnnotationMemberDeclaration();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.AnnotationMemberDeclaration#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Default Value</em>'.
     * @see fr.centralesupelec.csd.ejava.AnnotationMemberDeclaration#getDefaultValue()
     * @see #getAnnotationMemberDeclaration()
     * @generated
     */
    EReference getAnnotationMemberDeclaration_DefaultValue();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.BodyDeclaration <em>Body Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Body Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.BodyDeclaration
     * @generated
     */
    EClass getBodyDeclaration();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.CallableDeclaration <em>Callable Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Callable Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.CallableDeclaration
     * @generated
     */
    EClass getCallableDeclaration();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.CallableDeclaration#getReceiverParameter <em>Receiver Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Receiver Parameter</em>'.
     * @see fr.centralesupelec.csd.ejava.CallableDeclaration#getReceiverParameter()
     * @see #getCallableDeclaration()
     * @generated
     */
    EReference getCallableDeclaration_ReceiverParameter();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ClassOrInterfaceDeclaration <em>Class Or Interface Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class Or Interface Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.ClassOrInterfaceDeclaration
     * @generated
     */
    EClass getClassOrInterfaceDeclaration();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.ClassOrInterfaceDeclaration#isInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Interface</em>'.
     * @see fr.centralesupelec.csd.ejava.ClassOrInterfaceDeclaration#isInterface()
     * @see #getClassOrInterfaceDeclaration()
     * @generated
     */
    EAttribute getClassOrInterfaceDeclaration_Interface();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ConstructorDeclaration <em>Constructor Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constructor Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.ConstructorDeclaration
     * @generated
     */
    EClass getConstructorDeclaration();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.EnumConstantDeclaration <em>Enum Constant Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enum Constant Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.EnumConstantDeclaration
     * @generated
     */
    EClass getEnumConstantDeclaration();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.EnumConstantDeclaration#getClassBody <em>Class Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Class Body</em>'.
     * @see fr.centralesupelec.csd.ejava.EnumConstantDeclaration#getClassBody()
     * @see #getEnumConstantDeclaration()
     * @generated
     */
    EReference getEnumConstantDeclaration_ClassBody();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.EnumDeclaration <em>Enum Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enum Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.EnumDeclaration
     * @generated
     */
    EClass getEnumDeclaration();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.EnumDeclaration#getEntries <em>Entries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entries</em>'.
     * @see fr.centralesupelec.csd.ejava.EnumDeclaration#getEntries()
     * @see #getEnumDeclaration()
     * @generated
     */
    EReference getEnumDeclaration_Entries();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.FieldDeclaration <em>Field Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Field Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.FieldDeclaration
     * @generated
     */
    EClass getFieldDeclaration();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.InitializerDeclaration <em>Initializer Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Initializer Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.InitializerDeclaration
     * @generated
     */
    EClass getInitializerDeclaration();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.InitializerDeclaration#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see fr.centralesupelec.csd.ejava.InitializerDeclaration#isStatic()
     * @see #getInitializerDeclaration()
     * @generated
     */
    EAttribute getInitializerDeclaration_Static();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.MethodDeclaration <em>Method Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Method Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.MethodDeclaration
     * @generated
     */
    EClass getMethodDeclaration();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see fr.centralesupelec.csd.ejava.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.Parameter#isVarArgs <em>Var Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Var Args</em>'.
     * @see fr.centralesupelec.csd.ejava.Parameter#isVarArgs()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_VarArgs();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.Parameter#getVarArgsAnnotations <em>Var Args Annotations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Var Args Annotations</em>'.
     * @see fr.centralesupelec.csd.ejava.Parameter#getVarArgsAnnotations()
     * @see #getParameter()
     * @generated
     */
    EReference getParameter_VarArgsAnnotations();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ReceiverParameter <em>Receiver Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Receiver Parameter</em>'.
     * @see fr.centralesupelec.csd.ejava.ReceiverParameter
     * @generated
     */
    EClass getReceiverParameter();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.TypeDeclaration <em>Type Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.TypeDeclaration
     * @generated
     */
    EClass getTypeDeclaration();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.VariableDeclarator <em>Variable Declarator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Declarator</em>'.
     * @see fr.centralesupelec.csd.ejava.VariableDeclarator
     * @generated
     */
    EClass getVariableDeclarator();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.VariableDeclarator#getInitializer <em>Initializer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Initializer</em>'.
     * @see fr.centralesupelec.csd.ejava.VariableDeclarator#getInitializer()
     * @see #getVariableDeclarator()
     * @generated
     */
    EReference getVariableDeclarator_Initializer();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.BlockComment <em>Block Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Block Comment</em>'.
     * @see fr.centralesupelec.csd.ejava.BlockComment
     * @generated
     */
    EClass getBlockComment();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.Comment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comment</em>'.
     * @see fr.centralesupelec.csd.ejava.Comment
     * @generated
     */
    EClass getComment();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.Comment#getContent <em>Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Content</em>'.
     * @see fr.centralesupelec.csd.ejava.Comment#getContent()
     * @see #getComment()
     * @generated
     */
    EAttribute getComment_Content();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.JavadocComment <em>Javadoc Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Javadoc Comment</em>'.
     * @see fr.centralesupelec.csd.ejava.JavadocComment
     * @generated
     */
    EClass getJavadocComment();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.LineComment <em>Line Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Line Comment</em>'.
     * @see fr.centralesupelec.csd.ejava.LineComment
     * @generated
     */
    EClass getLineComment();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.AnnotationExpr <em>Annotation Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Annotation Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.AnnotationExpr
     * @generated
     */
    EClass getAnnotationExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ArrayAccessExpr <em>Array Access Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Access Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayAccessExpr
     * @generated
     */
    EClass getArrayAccessExpr();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.ArrayAccessExpr#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Name</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayAccessExpr#getName()
     * @see #getArrayAccessExpr()
     * @generated
     */
    EReference getArrayAccessExpr_Name();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.ArrayAccessExpr#getIndex <em>Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Index</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayAccessExpr#getIndex()
     * @see #getArrayAccessExpr()
     * @generated
     */
    EReference getArrayAccessExpr_Index();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ArrayCreationExpr <em>Array Creation Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Creation Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayCreationExpr
     * @generated
     */
    EClass getArrayCreationExpr();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.ArrayCreationExpr#getLevels <em>Levels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Levels</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayCreationExpr#getLevels()
     * @see #getArrayCreationExpr()
     * @generated
     */
    EReference getArrayCreationExpr_Levels();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.csd.ejava.ArrayCreationExpr#getElementType <em>Element Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Element Type</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayCreationExpr#getElementType()
     * @see #getArrayCreationExpr()
     * @generated
     */
    EReference getArrayCreationExpr_ElementType();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.ArrayCreationExpr#getInitializer <em>Initializer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Initializer</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayCreationExpr#getInitializer()
     * @see #getArrayCreationExpr()
     * @generated
     */
    EReference getArrayCreationExpr_Initializer();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ArrayInitializerExpr <em>Array Initializer Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Initializer Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayInitializerExpr
     * @generated
     */
    EClass getArrayInitializerExpr();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.ArrayInitializerExpr#getValues <em>Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Values</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayInitializerExpr#getValues()
     * @see #getArrayInitializerExpr()
     * @generated
     */
    EReference getArrayInitializerExpr_Values();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.AssignExpr <em>Assign Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assign Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.AssignExpr
     * @generated
     */
    EClass getAssignExpr();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.AssignExpr#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Target</em>'.
     * @see fr.centralesupelec.csd.ejava.AssignExpr#getTarget()
     * @see #getAssignExpr()
     * @generated
     */
    EReference getAssignExpr_Target();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.AssignExpr#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see fr.centralesupelec.csd.ejava.AssignExpr#getValue()
     * @see #getAssignExpr()
     * @generated
     */
    EReference getAssignExpr_Value();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.AssignExpr#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see fr.centralesupelec.csd.ejava.AssignExpr#getOperator()
     * @see #getAssignExpr()
     * @generated
     */
    EAttribute getAssignExpr_Operator();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.BinaryExpr <em>Binary Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binary Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.BinaryExpr
     * @generated
     */
    EClass getBinaryExpr();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.BinaryExpr#getLeft <em>Left</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Left</em>'.
     * @see fr.centralesupelec.csd.ejava.BinaryExpr#getLeft()
     * @see #getBinaryExpr()
     * @generated
     */
    EReference getBinaryExpr_Left();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.BinaryExpr#getRight <em>Right</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Right</em>'.
     * @see fr.centralesupelec.csd.ejava.BinaryExpr#getRight()
     * @see #getBinaryExpr()
     * @generated
     */
    EReference getBinaryExpr_Right();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.BinaryExpr#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see fr.centralesupelec.csd.ejava.BinaryExpr#getOperator()
     * @see #getBinaryExpr()
     * @generated
     */
    EAttribute getBinaryExpr_Operator();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.BooleanLiteralExpr <em>Boolean Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Literal Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.BooleanLiteralExpr
     * @generated
     */
    EClass getBooleanLiteralExpr();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.BooleanLiteralExpr#isValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.csd.ejava.BooleanLiteralExpr#isValue()
     * @see #getBooleanLiteralExpr()
     * @generated
     */
    EAttribute getBooleanLiteralExpr_Value();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.CastExpr <em>Cast Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cast Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.CastExpr
     * @generated
     */
    EClass getCastExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.CharLiteralExpr <em>Char Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Char Literal Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.CharLiteralExpr
     * @generated
     */
    EClass getCharLiteralExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ClassExpr <em>Class Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.ClassExpr
     * @generated
     */
    EClass getClassExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ConditionalExpr <em>Conditional Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.ConditionalExpr
     * @generated
     */
    EClass getConditionalExpr();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.ConditionalExpr#getThenExpr <em>Then Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Then Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.ConditionalExpr#getThenExpr()
     * @see #getConditionalExpr()
     * @generated
     */
    EReference getConditionalExpr_ThenExpr();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.ConditionalExpr#getElseExpr <em>Else Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Else Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.ConditionalExpr#getElseExpr()
     * @see #getConditionalExpr()
     * @generated
     */
    EReference getConditionalExpr_ElseExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.DoubleLiteralExpr <em>Double Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Double Literal Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.DoubleLiteralExpr
     * @generated
     */
    EClass getDoubleLiteralExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.EnclosedExpr <em>Enclosed Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enclosed Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.EnclosedExpr
     * @generated
     */
    EClass getEnclosedExpr();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.EnclosedExpr#getInner <em>Inner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inner</em>'.
     * @see fr.centralesupelec.csd.ejava.EnclosedExpr#getInner()
     * @see #getEnclosedExpr()
     * @generated
     */
    EReference getEnclosedExpr_Inner();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression</em>'.
     * @see fr.centralesupelec.csd.ejava.Expression
     * @generated
     */
    EClass getExpression();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.FieldAccessExpr <em>Field Access Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Field Access Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.FieldAccessExpr
     * @generated
     */
    EClass getFieldAccessExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.InstanceOfExpr <em>Instance Of Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Instance Of Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.InstanceOfExpr
     * @generated
     */
    EClass getInstanceOfExpr();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.InstanceOfExpr#getPattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Pattern</em>'.
     * @see fr.centralesupelec.csd.ejava.InstanceOfExpr#getPattern()
     * @see #getInstanceOfExpr()
     * @generated
     */
    EReference getInstanceOfExpr_Pattern();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.IntegerLiteralExpr <em>Integer Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Integer Literal Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.IntegerLiteralExpr
     * @generated
     */
    EClass getIntegerLiteralExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.LambdaExpr <em>Lambda Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lambda Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.LambdaExpr
     * @generated
     */
    EClass getLambdaExpr();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.LambdaExpr#isEnclosingParameters <em>Enclosing Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enclosing Parameters</em>'.
     * @see fr.centralesupelec.csd.ejava.LambdaExpr#isEnclosingParameters()
     * @see #getLambdaExpr()
     * @generated
     */
    EAttribute getLambdaExpr_EnclosingParameters();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.csd.ejava.LambdaExpr#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Body</em>'.
     * @see fr.centralesupelec.csd.ejava.LambdaExpr#getBody()
     * @see #getLambdaExpr()
     * @generated
     */
    EReference getLambdaExpr_Body();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.LiteralExpr <em>Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Literal Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.LiteralExpr
     * @generated
     */
    EClass getLiteralExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.LiteralStringValueExpr <em>Literal String Value Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Literal String Value Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.LiteralStringValueExpr
     * @generated
     */
    EClass getLiteralStringValueExpr();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.LiteralStringValueExpr#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.csd.ejava.LiteralStringValueExpr#getValue()
     * @see #getLiteralStringValueExpr()
     * @generated
     */
    EAttribute getLiteralStringValueExpr_Value();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.LongLiteralExpr <em>Long Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Long Literal Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.LongLiteralExpr
     * @generated
     */
    EClass getLongLiteralExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.MarkerAnnotationExpr <em>Marker Annotation Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Marker Annotation Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.MarkerAnnotationExpr
     * @generated
     */
    EClass getMarkerAnnotationExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.MemberValuePair <em>Member Value Pair</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Member Value Pair</em>'.
     * @see fr.centralesupelec.csd.ejava.MemberValuePair
     * @generated
     */
    EClass getMemberValuePair();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.MemberValuePair#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see fr.centralesupelec.csd.ejava.MemberValuePair#getValue()
     * @see #getMemberValuePair()
     * @generated
     */
    EReference getMemberValuePair_Value();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.MethodCallExpr <em>Method Call Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Method Call Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.MethodCallExpr
     * @generated
     */
    EClass getMethodCallExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.MethodReferenceExpr <em>Method Reference Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Method Reference Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.MethodReferenceExpr
     * @generated
     */
    EClass getMethodReferenceExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.Name <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Name</em>'.
     * @see fr.centralesupelec.csd.ejava.Name
     * @generated
     */
    EClass getName_();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.Name#getQualifier <em>Qualifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Qualifier</em>'.
     * @see fr.centralesupelec.csd.ejava.Name#getQualifier()
     * @see #getName_()
     * @generated
     */
    EReference getName_Qualifier();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NameExpr <em>Name Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Name Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.NameExpr
     * @generated
     */
    EClass getNameExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NormalAnnotationExpr <em>Normal Annotation Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Normal Annotation Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.NormalAnnotationExpr
     * @generated
     */
    EClass getNormalAnnotationExpr();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.NormalAnnotationExpr#getPairs <em>Pairs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Pairs</em>'.
     * @see fr.centralesupelec.csd.ejava.NormalAnnotationExpr#getPairs()
     * @see #getNormalAnnotationExpr()
     * @generated
     */
    EReference getNormalAnnotationExpr_Pairs();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NullLiteralExpr <em>Null Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Null Literal Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.NullLiteralExpr
     * @generated
     */
    EClass getNullLiteralExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ObjectCreationExpr <em>Object Creation Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Object Creation Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.ObjectCreationExpr
     * @generated
     */
    EClass getObjectCreationExpr();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.ObjectCreationExpr#getAnonymousClassBody <em>Anonymous Class Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Anonymous Class Body</em>'.
     * @see fr.centralesupelec.csd.ejava.ObjectCreationExpr#getAnonymousClassBody()
     * @see #getObjectCreationExpr()
     * @generated
     */
    EReference getObjectCreationExpr_AnonymousClassBody();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.PatternExpr <em>Pattern Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pattern Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.PatternExpr
     * @generated
     */
    EClass getPatternExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.SimpleName <em>Simple Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Name</em>'.
     * @see fr.centralesupelec.csd.ejava.SimpleName
     * @generated
     */
    EClass getSimpleName();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.SingleMemberAnnotationExpr <em>Single Member Annotation Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Single Member Annotation Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.SingleMemberAnnotationExpr
     * @generated
     */
    EClass getSingleMemberAnnotationExpr();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.SingleMemberAnnotationExpr#getMemberValue <em>Member Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Member Value</em>'.
     * @see fr.centralesupelec.csd.ejava.SingleMemberAnnotationExpr#getMemberValue()
     * @see #getSingleMemberAnnotationExpr()
     * @generated
     */
    EReference getSingleMemberAnnotationExpr_MemberValue();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.StringLiteralExpr <em>String Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Literal Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.StringLiteralExpr
     * @generated
     */
    EClass getStringLiteralExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.SuperExpr <em>Super Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Super Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.SuperExpr
     * @generated
     */
    EClass getSuperExpr();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.SuperExpr#getTypeName <em>Type Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type Name</em>'.
     * @see fr.centralesupelec.csd.ejava.SuperExpr#getTypeName()
     * @see #getSuperExpr()
     * @generated
     */
    EReference getSuperExpr_TypeName();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.SwitchExpr <em>Switch Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Switch Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.SwitchExpr
     * @generated
     */
    EClass getSwitchExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.TextBlockLiteralExpr <em>Text Block Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Block Literal Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.TextBlockLiteralExpr
     * @generated
     */
    EClass getTextBlockLiteralExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ThisExpr <em>This Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>This Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.ThisExpr
     * @generated
     */
    EClass getThisExpr();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.ThisExpr#getTypeName <em>Type Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type Name</em>'.
     * @see fr.centralesupelec.csd.ejava.ThisExpr#getTypeName()
     * @see #getThisExpr()
     * @generated
     */
    EReference getThisExpr_TypeName();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.TypeExpr <em>Type Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.TypeExpr
     * @generated
     */
    EClass getTypeExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.UnaryExpr <em>Unary Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unary Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.UnaryExpr
     * @generated
     */
    EClass getUnaryExpr();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.UnaryExpr#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see fr.centralesupelec.csd.ejava.UnaryExpr#getOperator()
     * @see #getUnaryExpr()
     * @generated
     */
    EAttribute getUnaryExpr_Operator();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.VariableDeclarationExpr <em>Variable Declaration Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Declaration Expr</em>'.
     * @see fr.centralesupelec.csd.ejava.VariableDeclarationExpr
     * @generated
     */
    EClass getVariableDeclarationExpr();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ModuleDeclaration <em>Module Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.ModuleDeclaration
     * @generated
     */
    EClass getModuleDeclaration();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.ModuleDeclaration#isOpen <em>Open</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Open</em>'.
     * @see fr.centralesupelec.csd.ejava.ModuleDeclaration#isOpen()
     * @see #getModuleDeclaration()
     * @generated
     */
    EAttribute getModuleDeclaration_Open();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.ModuleDeclaration#getDirectives <em>Directives</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Directives</em>'.
     * @see fr.centralesupelec.csd.ejava.ModuleDeclaration#getDirectives()
     * @see #getModuleDeclaration()
     * @generated
     */
    EReference getModuleDeclaration_Directives();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ModuleDirective <em>Module Directive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module Directive</em>'.
     * @see fr.centralesupelec.csd.ejava.ModuleDirective
     * @generated
     */
    EClass getModuleDirective();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ModuleExportsDirective <em>Module Exports Directive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module Exports Directive</em>'.
     * @see fr.centralesupelec.csd.ejava.ModuleExportsDirective
     * @generated
     */
    EClass getModuleExportsDirective();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.ModuleExportsDirective#getModuleNames <em>Module Names</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Module Names</em>'.
     * @see fr.centralesupelec.csd.ejava.ModuleExportsDirective#getModuleNames()
     * @see #getModuleExportsDirective()
     * @generated
     */
    EReference getModuleExportsDirective_ModuleNames();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ModuleOpensDirective <em>Module Opens Directive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module Opens Directive</em>'.
     * @see fr.centralesupelec.csd.ejava.ModuleOpensDirective
     * @generated
     */
    EClass getModuleOpensDirective();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.ModuleOpensDirective#getModuleNames <em>Module Names</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Module Names</em>'.
     * @see fr.centralesupelec.csd.ejava.ModuleOpensDirective#getModuleNames()
     * @see #getModuleOpensDirective()
     * @generated
     */
    EReference getModuleOpensDirective_ModuleNames();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ModuleProvidesDirective <em>Module Provides Directive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module Provides Directive</em>'.
     * @see fr.centralesupelec.csd.ejava.ModuleProvidesDirective
     * @generated
     */
    EClass getModuleProvidesDirective();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.ModuleProvidesDirective#getWith <em>With</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>With</em>'.
     * @see fr.centralesupelec.csd.ejava.ModuleProvidesDirective#getWith()
     * @see #getModuleProvidesDirective()
     * @generated
     */
    EReference getModuleProvidesDirective_With();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ModuleRequiresDirective <em>Module Requires Directive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module Requires Directive</em>'.
     * @see fr.centralesupelec.csd.ejava.ModuleRequiresDirective
     * @generated
     */
    EClass getModuleRequiresDirective();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ModuleUsesDirective <em>Module Uses Directive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module Uses Directive</em>'.
     * @see fr.centralesupelec.csd.ejava.ModuleUsesDirective
     * @generated
     */
    EClass getModuleUsesDirective();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithAnnotations <em>Node With Annotations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Annotations</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithAnnotations
     * @generated
     */
    EClass getNodeWithAnnotations();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.NodeWithAnnotations#getAnnotations <em>Annotations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Annotations</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithAnnotations#getAnnotations()
     * @see #getNodeWithAnnotations()
     * @generated
     */
    EReference getNodeWithAnnotations_Annotations();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithArguments <em>Node With Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Arguments</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithArguments
     * @generated
     */
    EClass getNodeWithArguments();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.NodeWithArguments#getArguments <em>Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Arguments</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithArguments#getArguments()
     * @see #getNodeWithArguments()
     * @generated
     */
    EReference getNodeWithArguments_Arguments();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithBlockStmt <em>Node With Block Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Block Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithBlockStmt
     * @generated
     */
    EClass getNodeWithBlockStmt();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.NodeWithBlockStmt#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Body</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithBlockStmt#getBody()
     * @see #getNodeWithBlockStmt()
     * @generated
     */
    EReference getNodeWithBlockStmt_Body();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithBody <em>Node With Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Body</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithBody
     * @generated
     */
    EClass getNodeWithBody();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.NodeWithBody#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Body</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithBody#getBody()
     * @see #getNodeWithBody()
     * @generated
     */
    EReference getNodeWithBody_Body();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithCondition <em>Node With Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Condition</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithCondition
     * @generated
     */
    EClass getNodeWithCondition();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.NodeWithCondition#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithCondition#getCondition()
     * @see #getNodeWithCondition()
     * @generated
     */
    EReference getNodeWithCondition_Condition();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithExpression <em>Node With Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Expression</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithExpression
     * @generated
     */
    EClass getNodeWithExpression();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.NodeWithExpression#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithExpression#getExpression()
     * @see #getNodeWithExpression()
     * @generated
     */
    EReference getNodeWithExpression_Expression();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithExtends <em>Node With Extends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Extends</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithExtends
     * @generated
     */
    EClass getNodeWithExtends();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.NodeWithExtends#getExtendedTypes <em>Extended Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Extended Types</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithExtends#getExtendedTypes()
     * @see #getNodeWithExtends()
     * @generated
     */
    EReference getNodeWithExtends_ExtendedTypes();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithIdentifier <em>Node With Identifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Identifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithIdentifier
     * @generated
     */
    EClass getNodeWithIdentifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithIdentifier#getIdentifier <em>Identifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Identifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithIdentifier#getIdentifier()
     * @see #getNodeWithIdentifier()
     * @generated
     */
    EAttribute getNodeWithIdentifier_Identifier();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithImplements <em>Node With Implements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Implements</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithImplements
     * @generated
     */
    EClass getNodeWithImplements();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.NodeWithImplements#getImplementedTypes <em>Implemented Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Implemented Types</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithImplements#getImplementedTypes()
     * @see #getNodeWithImplements()
     * @generated
     */
    EReference getNodeWithImplements_ImplementedTypes();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithJavadoc <em>Node With Javadoc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Javadoc</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithJavadoc
     * @generated
     */
    EClass getNodeWithJavadoc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithMembers <em>Node With Members</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Members</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithMembers
     * @generated
     */
    EClass getNodeWithMembers();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.NodeWithMembers#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Members</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithMembers#getMembers()
     * @see #getNodeWithMembers()
     * @generated
     */
    EReference getNodeWithMembers_Members();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithModifiers <em>Node With Modifiers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Modifiers</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithModifiers
     * @generated
     */
    EClass getNodeWithModifiers();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.csd.ejava.NodeWithModifiers#getModifiers <em>Modifiers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Modifiers</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithModifiers#getModifiers()
     * @see #getNodeWithModifiers()
     * @generated
     */
    EAttribute getNodeWithModifiers_Modifiers();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithName <em>Node With Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Name</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithName
     * @generated
     */
    EClass getNodeWithName();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.NodeWithName#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Name</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithName#getName()
     * @see #getNodeWithName()
     * @generated
     */
    EReference getNodeWithName_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithLabel <em>Node With Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Label</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithLabel
     * @generated
     */
    EClass getNodeWithLabel();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.NodeWithLabel#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Label</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithLabel#getLabel()
     * @see #getNodeWithLabel()
     * @generated
     */
    EReference getNodeWithLabel_Label();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithParameters <em>Node With Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Parameters</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithParameters
     * @generated
     */
    EClass getNodeWithParameters();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.NodeWithParameters#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithParameters#getParameters()
     * @see #getNodeWithParameters()
     * @generated
     */
    EReference getNodeWithParameters_Parameters();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithRange <em>Node With Range</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Range</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithRange
     * @generated
     */
    EClass getNodeWithRange();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithScope <em>Node With Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Scope</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithScope
     * @generated
     */
    EClass getNodeWithScope();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.NodeWithScope#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Scope</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithScope#getScope()
     * @see #getNodeWithScope()
     * @generated
     */
    EReference getNodeWithScope_Scope();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithSimpleName <em>Node With Simple Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Simple Name</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithSimpleName
     * @generated
     */
    EClass getNodeWithSimpleName();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.NodeWithSimpleName#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Name</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithSimpleName#getName()
     * @see #getNodeWithSimpleName()
     * @generated
     */
    EReference getNodeWithSimpleName_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithStatements <em>Node With Statements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Statements</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithStatements
     * @generated
     */
    EClass getNodeWithStatements();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.NodeWithStatements#getStatements <em>Statements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Statements</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithStatements#getStatements()
     * @see #getNodeWithStatements()
     * @generated
     */
    EReference getNodeWithStatements_Statements();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithThrownExceptions <em>Node With Thrown Exceptions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Thrown Exceptions</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithThrownExceptions
     * @generated
     */
    EClass getNodeWithThrownExceptions();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.NodeWithThrownExceptions#getThrownExceptions <em>Thrown Exceptions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Thrown Exceptions</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithThrownExceptions#getThrownExceptions()
     * @see #getNodeWithThrownExceptions()
     * @generated
     */
    EReference getNodeWithThrownExceptions_ThrownExceptions();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithTokenRange <em>Node With Token Range</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Token Range</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithTokenRange
     * @generated
     */
    EClass getNodeWithTokenRange();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithType <em>Node With Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Type</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithType
     * @generated
     */
    EClass getNodeWithType();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.NodeWithType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithType#getType()
     * @see #getNodeWithType()
     * @generated
     */
    EReference getNodeWithType_Type();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithTypeArguments <em>Node With Type Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Type Arguments</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithTypeArguments
     * @generated
     */
    EClass getNodeWithTypeArguments();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.NodeWithTypeArguments#getTypeArguments <em>Type Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Type Arguments</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithTypeArguments#getTypeArguments()
     * @see #getNodeWithTypeArguments()
     * @generated
     */
    EReference getNodeWithTypeArguments_TypeArguments();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithTypeParameters <em>Node With Type Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Type Parameters</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithTypeParameters
     * @generated
     */
    EClass getNodeWithTypeParameters();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.NodeWithTypeParameters#getTypeParameters <em>Type Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithTypeParameters#getTypeParameters()
     * @see #getNodeWithTypeParameters()
     * @generated
     */
    EReference getNodeWithTypeParameters_TypeParameters();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithVariables <em>Node With Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Variables</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithVariables
     * @generated
     */
    EClass getNodeWithVariables();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.NodeWithVariables#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variables</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithVariables#getVariables()
     * @see #getNodeWithVariables()
     * @generated
     */
    EReference getNodeWithVariables_Variables();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.SwitchNode <em>Switch Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Switch Node</em>'.
     * @see fr.centralesupelec.csd.ejava.SwitchNode
     * @generated
     */
    EClass getSwitchNode();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.SwitchNode#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Selector</em>'.
     * @see fr.centralesupelec.csd.ejava.SwitchNode#getSelector()
     * @see #getSwitchNode()
     * @generated
     */
    EReference getSwitchNode_Selector();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.SwitchNode#getEntries <em>Entries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entries</em>'.
     * @see fr.centralesupelec.csd.ejava.SwitchNode#getEntries()
     * @see #getSwitchNode()
     * @generated
     */
    EReference getSwitchNode_Entries();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithAbstractModifier <em>Node With Abstract Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Abstract Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithAbstractModifier
     * @generated
     */
    EClass getNodeWithAbstractModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithAbstractModifier#isAbstract <em>Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abstract</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithAbstractModifier#isAbstract()
     * @see #getNodeWithAbstractModifier()
     * @generated
     */
    EAttribute getNodeWithAbstractModifier_Abstract();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithAccessModifiers <em>Node With Access Modifiers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Access Modifiers</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithAccessModifiers
     * @generated
     */
    EClass getNodeWithAccessModifiers();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithDefaultModifier <em>Node With Default Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Default Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithDefaultModifier
     * @generated
     */
    EClass getNodeWithDefaultModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithDefaultModifier#isDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithDefaultModifier#isDefault()
     * @see #getNodeWithDefaultModifier()
     * @generated
     */
    EAttribute getNodeWithDefaultModifier_Default();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithFinalModifier <em>Node With Final Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Final Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithFinalModifier
     * @generated
     */
    EClass getNodeWithFinalModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithFinalModifier#isFinal <em>Final</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Final</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithFinalModifier#isFinal()
     * @see #getNodeWithFinalModifier()
     * @generated
     */
    EAttribute getNodeWithFinalModifier_Final();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithNativeModifier <em>Node With Native Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Native Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithNativeModifier
     * @generated
     */
    EClass getNodeWithNativeModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithNativeModifier#isNative <em>Native</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Native</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithNativeModifier#isNative()
     * @see #getNodeWithNativeModifier()
     * @generated
     */
    EAttribute getNodeWithNativeModifier_Native();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithPrivateModifier <em>Node With Private Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Private Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithPrivateModifier
     * @generated
     */
    EClass getNodeWithPrivateModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithPrivateModifier#isPrivate <em>Private</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Private</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithPrivateModifier#isPrivate()
     * @see #getNodeWithPrivateModifier()
     * @generated
     */
    EAttribute getNodeWithPrivateModifier_Private();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithProtectedModifier <em>Node With Protected Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Protected Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithProtectedModifier
     * @generated
     */
    EClass getNodeWithProtectedModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithProtectedModifier#isProtected <em>Protected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Protected</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithProtectedModifier#isProtected()
     * @see #getNodeWithProtectedModifier()
     * @generated
     */
    EAttribute getNodeWithProtectedModifier_Protected();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithPublicModifier <em>Node With Public Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Public Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithPublicModifier
     * @generated
     */
    EClass getNodeWithPublicModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithPublicModifier#isPublic <em>Public</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Public</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithPublicModifier#isPublic()
     * @see #getNodeWithPublicModifier()
     * @generated
     */
    EAttribute getNodeWithPublicModifier_Public();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithStaticModifier <em>Node With Static Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Static Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithStaticModifier
     * @generated
     */
    EClass getNodeWithStaticModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithStaticModifier#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithStaticModifier#isStatic()
     * @see #getNodeWithStaticModifier()
     * @generated
     */
    EAttribute getNodeWithStaticModifier_Static();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithSynchronizedModifier <em>Node With Synchronized Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Synchronized Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithSynchronizedModifier
     * @generated
     */
    EClass getNodeWithSynchronizedModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithSynchronizedModifier#isSynchronized <em>Synchronized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Synchronized</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithSynchronizedModifier#isSynchronized()
     * @see #getNodeWithSynchronizedModifier()
     * @generated
     */
    EAttribute getNodeWithSynchronizedModifier_Synchronized();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithStrictfpModifier <em>Node With Strictfp Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Strictfp Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithStrictfpModifier
     * @generated
     */
    EClass getNodeWithStrictfpModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithStrictfpModifier#isStrictfp <em>Strictfp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Strictfp</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithStrictfpModifier#isStrictfp()
     * @see #getNodeWithStrictfpModifier()
     * @generated
     */
    EAttribute getNodeWithStrictfpModifier_Strictfp();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithTransientModifier <em>Node With Transient Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Transient Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithTransientModifier
     * @generated
     */
    EClass getNodeWithTransientModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithTransientModifier#isTransient <em>Transient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transient</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithTransientModifier#isTransient()
     * @see #getNodeWithTransientModifier()
     * @generated
     */
    EAttribute getNodeWithTransientModifier_Transient();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithTransitiveModifier <em>Node With Transitive Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Transitive Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithTransitiveModifier
     * @generated
     */
    EClass getNodeWithTransitiveModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithTransitiveModifier#isTransitive <em>Transitive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transitive</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithTransitiveModifier#isTransitive()
     * @see #getNodeWithTransitiveModifier()
     * @generated
     */
    EAttribute getNodeWithTransitiveModifier_Transitive();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.NodeWithVolatileModifier <em>Node With Volatile Modifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node With Volatile Modifier</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithVolatileModifier
     * @generated
     */
    EClass getNodeWithVolatileModifier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.NodeWithVolatileModifier#isVolatile <em>Volatile</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Volatile</em>'.
     * @see fr.centralesupelec.csd.ejava.NodeWithVolatileModifier#isVolatile()
     * @see #getNodeWithVolatileModifier()
     * @generated
     */
    EAttribute getNodeWithVolatileModifier_Volatile();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.AssertStmt <em>Assert Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assert Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.AssertStmt
     * @generated
     */
    EClass getAssertStmt();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.AssertStmt#getCheck <em>Check</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Check</em>'.
     * @see fr.centralesupelec.csd.ejava.AssertStmt#getCheck()
     * @see #getAssertStmt()
     * @generated
     */
    EReference getAssertStmt_Check();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.AssertStmt#getMessage <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message</em>'.
     * @see fr.centralesupelec.csd.ejava.AssertStmt#getMessage()
     * @see #getAssertStmt()
     * @generated
     */
    EReference getAssertStmt_Message();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.BlockStmt <em>Block Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Block Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.BlockStmt
     * @generated
     */
    EClass getBlockStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.BreakStmt <em>Break Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Break Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.BreakStmt
     * @generated
     */
    EClass getBreakStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.CatchClause <em>Catch Clause</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Catch Clause</em>'.
     * @see fr.centralesupelec.csd.ejava.CatchClause
     * @generated
     */
    EClass getCatchClause();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.CatchClause#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parameter</em>'.
     * @see fr.centralesupelec.csd.ejava.CatchClause#getParameter()
     * @see #getCatchClause()
     * @generated
     */
    EReference getCatchClause_Parameter();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ContinueStmt <em>Continue Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Continue Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.ContinueStmt
     * @generated
     */
    EClass getContinueStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.DoStmt <em>Do Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Do Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.DoStmt
     * @generated
     */
    EClass getDoStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.EmptyStmt <em>Empty Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Empty Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.EmptyStmt
     * @generated
     */
    EClass getEmptyStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ExplicitConstructorInvocationStmt <em>Explicit Constructor Invocation Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Explicit Constructor Invocation Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.ExplicitConstructorInvocationStmt
     * @generated
     */
    EClass getExplicitConstructorInvocationStmt();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.ExplicitConstructorInvocationStmt#isIsThis <em>Is This</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is This</em>'.
     * @see fr.centralesupelec.csd.ejava.ExplicitConstructorInvocationStmt#isIsThis()
     * @see #getExplicitConstructorInvocationStmt()
     * @generated
     */
    EAttribute getExplicitConstructorInvocationStmt_IsThis();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ExpressionStmt <em>Expression Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.ExpressionStmt
     * @generated
     */
    EClass getExpressionStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ForEachStmt <em>For Each Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>For Each Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.ForEachStmt
     * @generated
     */
    EClass getForEachStmt();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.ForEachStmt#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Variable</em>'.
     * @see fr.centralesupelec.csd.ejava.ForEachStmt#getVariable()
     * @see #getForEachStmt()
     * @generated
     */
    EReference getForEachStmt_Variable();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.ForEachStmt#getIterable <em>Iterable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Iterable</em>'.
     * @see fr.centralesupelec.csd.ejava.ForEachStmt#getIterable()
     * @see #getForEachStmt()
     * @generated
     */
    EReference getForEachStmt_Iterable();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ForStmt <em>For Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>For Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.ForStmt
     * @generated
     */
    EClass getForStmt();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.ForStmt#getInitialization <em>Initialization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Initialization</em>'.
     * @see fr.centralesupelec.csd.ejava.ForStmt#getInitialization()
     * @see #getForStmt()
     * @generated
     */
    EReference getForStmt_Initialization();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.ForStmt#getCompare <em>Compare</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Compare</em>'.
     * @see fr.centralesupelec.csd.ejava.ForStmt#getCompare()
     * @see #getForStmt()
     * @generated
     */
    EReference getForStmt_Compare();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.ForStmt#getUpdate <em>Update</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Update</em>'.
     * @see fr.centralesupelec.csd.ejava.ForStmt#getUpdate()
     * @see #getForStmt()
     * @generated
     */
    EReference getForStmt_Update();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.IfStmt <em>If Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>If Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.IfStmt
     * @generated
     */
    EClass getIfStmt();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.IfStmt#getThenStmt <em>Then Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Then Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.IfStmt#getThenStmt()
     * @see #getIfStmt()
     * @generated
     */
    EReference getIfStmt_ThenStmt();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.IfStmt#getElseStmt <em>Else Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Else Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.IfStmt#getElseStmt()
     * @see #getIfStmt()
     * @generated
     */
    EReference getIfStmt_ElseStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.LabeledStmt <em>Labeled Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Labeled Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.LabeledStmt
     * @generated
     */
    EClass getLabeledStmt();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.LabeledStmt#getStatement <em>Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Statement</em>'.
     * @see fr.centralesupelec.csd.ejava.LabeledStmt#getStatement()
     * @see #getLabeledStmt()
     * @generated
     */
    EReference getLabeledStmt_Statement();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.LocalClassDeclarationStmt <em>Local Class Declaration Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Local Class Declaration Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.LocalClassDeclarationStmt
     * @generated
     */
    EClass getLocalClassDeclarationStmt();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.LocalClassDeclarationStmt#getClassDeclaration <em>Class Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Class Declaration</em>'.
     * @see fr.centralesupelec.csd.ejava.LocalClassDeclarationStmt#getClassDeclaration()
     * @see #getLocalClassDeclarationStmt()
     * @generated
     */
    EReference getLocalClassDeclarationStmt_ClassDeclaration();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ReturnStmt <em>Return Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Return Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.ReturnStmt
     * @generated
     */
    EClass getReturnStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.Statement <em>Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Statement</em>'.
     * @see fr.centralesupelec.csd.ejava.Statement
     * @generated
     */
    EClass getStatement();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.SwitchEntry <em>Switch Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Switch Entry</em>'.
     * @see fr.centralesupelec.csd.ejava.SwitchEntry
     * @generated
     */
    EClass getSwitchEntry();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.SwitchEntry#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Labels</em>'.
     * @see fr.centralesupelec.csd.ejava.SwitchEntry#getLabels()
     * @see #getSwitchEntry()
     * @generated
     */
    EReference getSwitchEntry_Labels();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.SwitchEntry#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.csd.ejava.SwitchEntry#getType()
     * @see #getSwitchEntry()
     * @generated
     */
    EAttribute getSwitchEntry_Type();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.SwitchStmt <em>Switch Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Switch Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.SwitchStmt
     * @generated
     */
    EClass getSwitchStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.SynchronizedStmt <em>Synchronized Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Synchronized Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.SynchronizedStmt
     * @generated
     */
    EClass getSynchronizedStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ThrowStmt <em>Throw Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Throw Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.ThrowStmt
     * @generated
     */
    EClass getThrowStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.TryStmt <em>Try Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Try Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.TryStmt
     * @generated
     */
    EClass getTryStmt();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.TryStmt#getResources <em>Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resources</em>'.
     * @see fr.centralesupelec.csd.ejava.TryStmt#getResources()
     * @see #getTryStmt()
     * @generated
     */
    EReference getTryStmt_Resources();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.TryStmt#getTryBlock <em>Try Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Try Block</em>'.
     * @see fr.centralesupelec.csd.ejava.TryStmt#getTryBlock()
     * @see #getTryStmt()
     * @generated
     */
    EReference getTryStmt_TryBlock();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.TryStmt#getCatchClauses <em>Catch Clauses</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Catch Clauses</em>'.
     * @see fr.centralesupelec.csd.ejava.TryStmt#getCatchClauses()
     * @see #getTryStmt()
     * @generated
     */
    EReference getTryStmt_CatchClauses();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.TryStmt#getFinallyBlock <em>Finally Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Finally Block</em>'.
     * @see fr.centralesupelec.csd.ejava.TryStmt#getFinallyBlock()
     * @see #getTryStmt()
     * @generated
     */
    EReference getTryStmt_FinallyBlock();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.WhileStmt <em>While Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>While Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.WhileStmt
     * @generated
     */
    EClass getWhileStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.YieldStmt <em>Yield Stmt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Yield Stmt</em>'.
     * @see fr.centralesupelec.csd.ejava.YieldStmt
     * @generated
     */
    EClass getYieldStmt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ArrayType <em>Array Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Type</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayType
     * @generated
     */
    EClass getArrayType();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.ArrayType#getComponentType <em>Component Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Component Type</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayType#getComponentType()
     * @see #getArrayType()
     * @generated
     */
    EReference getArrayType_ComponentType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.ArrayType#getOrigin <em>Origin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayType#getOrigin()
     * @see #getArrayType()
     * @generated
     */
    EAttribute getArrayType_Origin();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ClassOrInterfaceType <em>Class Or Interface Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class Or Interface Type</em>'.
     * @see fr.centralesupelec.csd.ejava.ClassOrInterfaceType
     * @generated
     */
    EClass getClassOrInterfaceType();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.IntersectionType <em>Intersection Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intersection Type</em>'.
     * @see fr.centralesupelec.csd.ejava.IntersectionType
     * @generated
     */
    EClass getIntersectionType();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.IntersectionType#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elements</em>'.
     * @see fr.centralesupelec.csd.ejava.IntersectionType#getElements()
     * @see #getIntersectionType()
     * @generated
     */
    EReference getIntersectionType_Elements();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.PrimitiveType <em>Primitive Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Primitive Type</em>'.
     * @see fr.centralesupelec.csd.ejava.PrimitiveType
     * @generated
     */
    EClass getPrimitiveType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.csd.ejava.PrimitiveType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.csd.ejava.PrimitiveType#getType()
     * @see #getPrimitiveType()
     * @generated
     */
    EAttribute getPrimitiveType_Type();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.ReferenceType <em>Reference Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Type</em>'.
     * @see fr.centralesupelec.csd.ejava.ReferenceType
     * @generated
     */
    EClass getReferenceType();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.Type <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type</em>'.
     * @see fr.centralesupelec.csd.ejava.Type
     * @generated
     */
    EClass getType();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.TypeParameter <em>Type Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Parameter</em>'.
     * @see fr.centralesupelec.csd.ejava.TypeParameter
     * @generated
     */
    EClass getTypeParameter();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.TypeParameter#getTypeBound <em>Type Bound</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Type Bound</em>'.
     * @see fr.centralesupelec.csd.ejava.TypeParameter#getTypeBound()
     * @see #getTypeParameter()
     * @generated
     */
    EReference getTypeParameter_TypeBound();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.UnionType <em>Union Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Union Type</em>'.
     * @see fr.centralesupelec.csd.ejava.UnionType
     * @generated
     */
    EClass getUnionType();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.csd.ejava.UnionType#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elements</em>'.
     * @see fr.centralesupelec.csd.ejava.UnionType#getElements()
     * @see #getUnionType()
     * @generated
     */
    EReference getUnionType_Elements();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.UnknownType <em>Unknown Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unknown Type</em>'.
     * @see fr.centralesupelec.csd.ejava.UnknownType
     * @generated
     */
    EClass getUnknownType();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.VarType <em>Var Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Var Type</em>'.
     * @see fr.centralesupelec.csd.ejava.VarType
     * @generated
     */
    EClass getVarType();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.VoidType <em>Void Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Void Type</em>'.
     * @see fr.centralesupelec.csd.ejava.VoidType
     * @generated
     */
    EClass getVoidType();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.csd.ejava.WildcardType <em>Wildcard Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wildcard Type</em>'.
     * @see fr.centralesupelec.csd.ejava.WildcardType
     * @generated
     */
    EClass getWildcardType();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.WildcardType#getExtendedType <em>Extended Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extended Type</em>'.
     * @see fr.centralesupelec.csd.ejava.WildcardType#getExtendedType()
     * @see #getWildcardType()
     * @generated
     */
    EReference getWildcardType_ExtendedType();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.csd.ejava.WildcardType#getSuperType <em>Super Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Super Type</em>'.
     * @see fr.centralesupelec.csd.ejava.WildcardType#getSuperType()
     * @see #getWildcardType()
     * @generated
     */
    EReference getWildcardType_SuperType();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.csd.ejava.ModifierKeyword <em>Modifier Keyword</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Modifier Keyword</em>'.
     * @see fr.centralesupelec.csd.ejava.ModifierKeyword
     * @generated
     */
    EEnum getModifierKeyword();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.csd.ejava.AssignOperator <em>Assign Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Assign Operator</em>'.
     * @see fr.centralesupelec.csd.ejava.AssignOperator
     * @generated
     */
    EEnum getAssignOperator();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.csd.ejava.BinaryOperator <em>Binary Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Binary Operator</em>'.
     * @see fr.centralesupelec.csd.ejava.BinaryOperator
     * @generated
     */
    EEnum getBinaryOperator();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.csd.ejava.UnaryOperator <em>Unary Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Unary Operator</em>'.
     * @see fr.centralesupelec.csd.ejava.UnaryOperator
     * @generated
     */
    EEnum getUnaryOperator();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.csd.ejava.SwitchEntryType <em>Switch Entry Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Switch Entry Type</em>'.
     * @see fr.centralesupelec.csd.ejava.SwitchEntryType
     * @generated
     */
    EEnum getSwitchEntryType();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.csd.ejava.ArrayTypeOrigin <em>Array Type Origin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Array Type Origin</em>'.
     * @see fr.centralesupelec.csd.ejava.ArrayTypeOrigin
     * @generated
     */
    EEnum getArrayTypeOrigin();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.csd.ejava.Primitive <em>Primitive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Primitive</em>'.
     * @see fr.centralesupelec.csd.ejava.Primitive
     * @generated
     */
    EEnum getPrimitive();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    EJavaFactory getEJavaFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.JavaNodeImpl <em>Java Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.JavaNodeImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getJavaNode()
         * @generated
         */
        EClass JAVA_NODE = eINSTANCE.getJavaNode();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JAVA_NODE__COMMENT = eINSTANCE.getJavaNode_Comment();

        /**
         * The meta object literal for the '<em><b>Orphan Comments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JAVA_NODE__ORPHAN_COMMENTS = eINSTANCE.getJavaNode_OrphanComments();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ArrayCreationLevelImpl <em>Array Creation Level</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ArrayCreationLevelImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getArrayCreationLevel()
         * @generated
         */
        EClass ARRAY_CREATION_LEVEL = eINSTANCE.getArrayCreationLevel();

        /**
         * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_CREATION_LEVEL__DIMENSION = eINSTANCE.getArrayCreationLevel_Dimension();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.CompilationUnitImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getCompilationUnit()
         * @generated
         */
        EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

        /**
         * The meta object literal for the '<em><b>Package Declaration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPILATION_UNIT__PACKAGE_DECLARATION = eINSTANCE.getCompilationUnit_PackageDeclaration();

        /**
         * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPILATION_UNIT__IMPORTS = eINSTANCE.getCompilationUnit_Imports();

        /**
         * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPILATION_UNIT__TYPES = eINSTANCE.getCompilationUnit_Types();

        /**
         * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPILATION_UNIT__MODULE = eINSTANCE.getCompilationUnit_Module();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ImportDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getImportDeclaration()
         * @generated
         */
        EClass IMPORT_DECLARATION = eINSTANCE.getImportDeclaration();

        /**
         * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT_DECLARATION__STATIC = eINSTANCE.getImportDeclaration_Static();

        /**
         * The meta object literal for the '<em><b>Asterisk</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT_DECLARATION__ASTERISK = eINSTANCE.getImportDeclaration_Asterisk();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.PackageDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getPackageDeclaration()
         * @generated
         */
        EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.AnnotationDeclarationImpl <em>Annotation Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.AnnotationDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getAnnotationDeclaration()
         * @generated
         */
        EClass ANNOTATION_DECLARATION = eINSTANCE.getAnnotationDeclaration();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.AnnotationMemberDeclarationImpl <em>Annotation Member Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.AnnotationMemberDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getAnnotationMemberDeclaration()
         * @generated
         */
        EClass ANNOTATION_MEMBER_DECLARATION = eINSTANCE.getAnnotationMemberDeclaration();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE = eINSTANCE
                .getAnnotationMemberDeclaration_DefaultValue();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.BodyDeclarationImpl <em>Body Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.BodyDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBodyDeclaration()
         * @generated
         */
        EClass BODY_DECLARATION = eINSTANCE.getBodyDeclaration();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl <em>Callable Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.CallableDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getCallableDeclaration()
         * @generated
         */
        EClass CALLABLE_DECLARATION = eINSTANCE.getCallableDeclaration();

        /**
         * The meta object literal for the '<em><b>Receiver Parameter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CALLABLE_DECLARATION__RECEIVER_PARAMETER = eINSTANCE.getCallableDeclaration_ReceiverParameter();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ClassOrInterfaceDeclarationImpl <em>Class Or Interface Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ClassOrInterfaceDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getClassOrInterfaceDeclaration()
         * @generated
         */
        EClass CLASS_OR_INTERFACE_DECLARATION = eINSTANCE.getClassOrInterfaceDeclaration();

        /**
         * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLASS_OR_INTERFACE_DECLARATION__INTERFACE = eINSTANCE.getClassOrInterfaceDeclaration_Interface();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ConstructorDeclarationImpl <em>Constructor Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ConstructorDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getConstructorDeclaration()
         * @generated
         */
        EClass CONSTRUCTOR_DECLARATION = eINSTANCE.getConstructorDeclaration();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.EnumConstantDeclarationImpl <em>Enum Constant Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.EnumConstantDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getEnumConstantDeclaration()
         * @generated
         */
        EClass ENUM_CONSTANT_DECLARATION = eINSTANCE.getEnumConstantDeclaration();

        /**
         * The meta object literal for the '<em><b>Class Body</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUM_CONSTANT_DECLARATION__CLASS_BODY = eINSTANCE.getEnumConstantDeclaration_ClassBody();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.EnumDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getEnumDeclaration()
         * @generated
         */
        EClass ENUM_DECLARATION = eINSTANCE.getEnumDeclaration();

        /**
         * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUM_DECLARATION__ENTRIES = eINSTANCE.getEnumDeclaration_Entries();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.FieldDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getFieldDeclaration()
         * @generated
         */
        EClass FIELD_DECLARATION = eINSTANCE.getFieldDeclaration();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.InitializerDeclarationImpl <em>Initializer Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.InitializerDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getInitializerDeclaration()
         * @generated
         */
        EClass INITIALIZER_DECLARATION = eINSTANCE.getInitializerDeclaration();

        /**
         * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INITIALIZER_DECLARATION__STATIC = eINSTANCE.getInitializerDeclaration_Static();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.MethodDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getMethodDeclaration()
         * @generated
         */
        EClass METHOD_DECLARATION = eINSTANCE.getMethodDeclaration();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ParameterImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getParameter()
         * @generated
         */
        EClass PARAMETER = eINSTANCE.getParameter();

        /**
         * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__VAR_ARGS = eINSTANCE.getParameter_VarArgs();

        /**
         * The meta object literal for the '<em><b>Var Args Annotations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER__VAR_ARGS_ANNOTATIONS = eINSTANCE.getParameter_VarArgsAnnotations();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ReceiverParameterImpl <em>Receiver Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ReceiverParameterImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getReceiverParameter()
         * @generated
         */
        EClass RECEIVER_PARAMETER = eINSTANCE.getReceiverParameter();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.TypeDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getTypeDeclaration()
         * @generated
         */
        EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.VariableDeclaratorImpl <em>Variable Declarator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.VariableDeclaratorImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getVariableDeclarator()
         * @generated
         */
        EClass VARIABLE_DECLARATOR = eINSTANCE.getVariableDeclarator();

        /**
         * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VARIABLE_DECLARATOR__INITIALIZER = eINSTANCE.getVariableDeclarator_Initializer();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.BlockCommentImpl <em>Block Comment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.BlockCommentImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBlockComment()
         * @generated
         */
        EClass BLOCK_COMMENT = eINSTANCE.getBlockComment();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.CommentImpl <em>Comment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.CommentImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getComment()
         * @generated
         */
        EClass COMMENT = eINSTANCE.getComment();

        /**
         * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMENT__CONTENT = eINSTANCE.getComment_Content();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.JavadocCommentImpl <em>Javadoc Comment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.JavadocCommentImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getJavadocComment()
         * @generated
         */
        EClass JAVADOC_COMMENT = eINSTANCE.getJavadocComment();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.LineCommentImpl <em>Line Comment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.LineCommentImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLineComment()
         * @generated
         */
        EClass LINE_COMMENT = eINSTANCE.getLineComment();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.AnnotationExprImpl <em>Annotation Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.AnnotationExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getAnnotationExpr()
         * @generated
         */
        EClass ANNOTATION_EXPR = eINSTANCE.getAnnotationExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ArrayAccessExprImpl <em>Array Access Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ArrayAccessExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getArrayAccessExpr()
         * @generated
         */
        EClass ARRAY_ACCESS_EXPR = eINSTANCE.getArrayAccessExpr();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_ACCESS_EXPR__NAME = eINSTANCE.getArrayAccessExpr_Name();

        /**
         * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_ACCESS_EXPR__INDEX = eINSTANCE.getArrayAccessExpr_Index();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ArrayCreationExprImpl <em>Array Creation Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ArrayCreationExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getArrayCreationExpr()
         * @generated
         */
        EClass ARRAY_CREATION_EXPR = eINSTANCE.getArrayCreationExpr();

        /**
         * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_CREATION_EXPR__LEVELS = eINSTANCE.getArrayCreationExpr_Levels();

        /**
         * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_CREATION_EXPR__ELEMENT_TYPE = eINSTANCE.getArrayCreationExpr_ElementType();

        /**
         * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_CREATION_EXPR__INITIALIZER = eINSTANCE.getArrayCreationExpr_Initializer();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ArrayInitializerExprImpl <em>Array Initializer Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ArrayInitializerExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getArrayInitializerExpr()
         * @generated
         */
        EClass ARRAY_INITIALIZER_EXPR = eINSTANCE.getArrayInitializerExpr();

        /**
         * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_INITIALIZER_EXPR__VALUES = eINSTANCE.getArrayInitializerExpr_Values();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.AssignExprImpl <em>Assign Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.AssignExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getAssignExpr()
         * @generated
         */
        EClass ASSIGN_EXPR = eINSTANCE.getAssignExpr();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGN_EXPR__TARGET = eINSTANCE.getAssignExpr_Target();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGN_EXPR__VALUE = eINSTANCE.getAssignExpr_Value();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSIGN_EXPR__OPERATOR = eINSTANCE.getAssignExpr_Operator();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.BinaryExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBinaryExpr()
         * @generated
         */
        EClass BINARY_EXPR = eINSTANCE.getBinaryExpr();

        /**
         * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BINARY_EXPR__LEFT = eINSTANCE.getBinaryExpr_Left();

        /**
         * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BINARY_EXPR__RIGHT = eINSTANCE.getBinaryExpr_Right();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BINARY_EXPR__OPERATOR = eINSTANCE.getBinaryExpr_Operator();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.BooleanLiteralExprImpl <em>Boolean Literal Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.BooleanLiteralExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBooleanLiteralExpr()
         * @generated
         */
        EClass BOOLEAN_LITERAL_EXPR = eINSTANCE.getBooleanLiteralExpr();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOLEAN_LITERAL_EXPR__VALUE = eINSTANCE.getBooleanLiteralExpr_Value();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.CastExprImpl <em>Cast Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.CastExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getCastExpr()
         * @generated
         */
        EClass CAST_EXPR = eINSTANCE.getCastExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.CharLiteralExprImpl <em>Char Literal Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.CharLiteralExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getCharLiteralExpr()
         * @generated
         */
        EClass CHAR_LITERAL_EXPR = eINSTANCE.getCharLiteralExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ClassExprImpl <em>Class Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ClassExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getClassExpr()
         * @generated
         */
        EClass CLASS_EXPR = eINSTANCE.getClassExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ConditionalExprImpl <em>Conditional Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ConditionalExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getConditionalExpr()
         * @generated
         */
        EClass CONDITIONAL_EXPR = eINSTANCE.getConditionalExpr();

        /**
         * The meta object literal for the '<em><b>Then Expr</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITIONAL_EXPR__THEN_EXPR = eINSTANCE.getConditionalExpr_ThenExpr();

        /**
         * The meta object literal for the '<em><b>Else Expr</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITIONAL_EXPR__ELSE_EXPR = eINSTANCE.getConditionalExpr_ElseExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.DoubleLiteralExprImpl <em>Double Literal Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.DoubleLiteralExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getDoubleLiteralExpr()
         * @generated
         */
        EClass DOUBLE_LITERAL_EXPR = eINSTANCE.getDoubleLiteralExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.EnclosedExprImpl <em>Enclosed Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.EnclosedExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getEnclosedExpr()
         * @generated
         */
        EClass ENCLOSED_EXPR = eINSTANCE.getEnclosedExpr();

        /**
         * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENCLOSED_EXPR__INNER = eINSTANCE.getEnclosedExpr_Inner();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ExpressionImpl <em>Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ExpressionImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getExpression()
         * @generated
         */
        EClass EXPRESSION = eINSTANCE.getExpression();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.FieldAccessExprImpl <em>Field Access Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.FieldAccessExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getFieldAccessExpr()
         * @generated
         */
        EClass FIELD_ACCESS_EXPR = eINSTANCE.getFieldAccessExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.InstanceOfExprImpl <em>Instance Of Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.InstanceOfExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getInstanceOfExpr()
         * @generated
         */
        EClass INSTANCE_OF_EXPR = eINSTANCE.getInstanceOfExpr();

        /**
         * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INSTANCE_OF_EXPR__PATTERN = eINSTANCE.getInstanceOfExpr_Pattern();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.IntegerLiteralExprImpl <em>Integer Literal Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.IntegerLiteralExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getIntegerLiteralExpr()
         * @generated
         */
        EClass INTEGER_LITERAL_EXPR = eINSTANCE.getIntegerLiteralExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.LambdaExprImpl <em>Lambda Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.LambdaExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLambdaExpr()
         * @generated
         */
        EClass LAMBDA_EXPR = eINSTANCE.getLambdaExpr();

        /**
         * The meta object literal for the '<em><b>Enclosing Parameters</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LAMBDA_EXPR__ENCLOSING_PARAMETERS = eINSTANCE.getLambdaExpr_EnclosingParameters();

        /**
         * The meta object literal for the '<em><b>Body</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LAMBDA_EXPR__BODY = eINSTANCE.getLambdaExpr_Body();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.LiteralExprImpl <em>Literal Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.LiteralExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLiteralExpr()
         * @generated
         */
        EClass LITERAL_EXPR = eINSTANCE.getLiteralExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.LiteralStringValueExprImpl <em>Literal String Value Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.LiteralStringValueExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLiteralStringValueExpr()
         * @generated
         */
        EClass LITERAL_STRING_VALUE_EXPR = eINSTANCE.getLiteralStringValueExpr();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LITERAL_STRING_VALUE_EXPR__VALUE = eINSTANCE.getLiteralStringValueExpr_Value();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.LongLiteralExprImpl <em>Long Literal Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.LongLiteralExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLongLiteralExpr()
         * @generated
         */
        EClass LONG_LITERAL_EXPR = eINSTANCE.getLongLiteralExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.MarkerAnnotationExprImpl <em>Marker Annotation Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.MarkerAnnotationExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getMarkerAnnotationExpr()
         * @generated
         */
        EClass MARKER_ANNOTATION_EXPR = eINSTANCE.getMarkerAnnotationExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.MemberValuePairImpl <em>Member Value Pair</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.MemberValuePairImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getMemberValuePair()
         * @generated
         */
        EClass MEMBER_VALUE_PAIR = eINSTANCE.getMemberValuePair();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEMBER_VALUE_PAIR__VALUE = eINSTANCE.getMemberValuePair_Value();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.MethodCallExprImpl <em>Method Call Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.MethodCallExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getMethodCallExpr()
         * @generated
         */
        EClass METHOD_CALL_EXPR = eINSTANCE.getMethodCallExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.MethodReferenceExprImpl <em>Method Reference Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.MethodReferenceExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getMethodReferenceExpr()
         * @generated
         */
        EClass METHOD_REFERENCE_EXPR = eINSTANCE.getMethodReferenceExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.NameImpl <em>Name</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.NameImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getName_()
         * @generated
         */
        EClass NAME = eINSTANCE.getName_();

        /**
         * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NAME__QUALIFIER = eINSTANCE.getName_Qualifier();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.NameExprImpl <em>Name Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.NameExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNameExpr()
         * @generated
         */
        EClass NAME_EXPR = eINSTANCE.getNameExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.NormalAnnotationExprImpl <em>Normal Annotation Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.NormalAnnotationExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNormalAnnotationExpr()
         * @generated
         */
        EClass NORMAL_ANNOTATION_EXPR = eINSTANCE.getNormalAnnotationExpr();

        /**
         * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NORMAL_ANNOTATION_EXPR__PAIRS = eINSTANCE.getNormalAnnotationExpr_Pairs();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.NullLiteralExprImpl <em>Null Literal Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.NullLiteralExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNullLiteralExpr()
         * @generated
         */
        EClass NULL_LITERAL_EXPR = eINSTANCE.getNullLiteralExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ObjectCreationExprImpl <em>Object Creation Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ObjectCreationExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getObjectCreationExpr()
         * @generated
         */
        EClass OBJECT_CREATION_EXPR = eINSTANCE.getObjectCreationExpr();

        /**
         * The meta object literal for the '<em><b>Anonymous Class Body</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OBJECT_CREATION_EXPR__ANONYMOUS_CLASS_BODY = eINSTANCE.getObjectCreationExpr_AnonymousClassBody();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.PatternExprImpl <em>Pattern Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.PatternExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getPatternExpr()
         * @generated
         */
        EClass PATTERN_EXPR = eINSTANCE.getPatternExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.SimpleNameImpl <em>Simple Name</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.SimpleNameImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSimpleName()
         * @generated
         */
        EClass SIMPLE_NAME = eINSTANCE.getSimpleName();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.SingleMemberAnnotationExprImpl <em>Single Member Annotation Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.SingleMemberAnnotationExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSingleMemberAnnotationExpr()
         * @generated
         */
        EClass SINGLE_MEMBER_ANNOTATION_EXPR = eINSTANCE.getSingleMemberAnnotationExpr();

        /**
         * The meta object literal for the '<em><b>Member Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_MEMBER_ANNOTATION_EXPR__MEMBER_VALUE = eINSTANCE.getSingleMemberAnnotationExpr_MemberValue();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.StringLiteralExprImpl <em>String Literal Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.StringLiteralExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getStringLiteralExpr()
         * @generated
         */
        EClass STRING_LITERAL_EXPR = eINSTANCE.getStringLiteralExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.SuperExprImpl <em>Super Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.SuperExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSuperExpr()
         * @generated
         */
        EClass SUPER_EXPR = eINSTANCE.getSuperExpr();

        /**
         * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUPER_EXPR__TYPE_NAME = eINSTANCE.getSuperExpr_TypeName();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.SwitchExprImpl <em>Switch Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.SwitchExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSwitchExpr()
         * @generated
         */
        EClass SWITCH_EXPR = eINSTANCE.getSwitchExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.TextBlockLiteralExprImpl <em>Text Block Literal Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.TextBlockLiteralExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getTextBlockLiteralExpr()
         * @generated
         */
        EClass TEXT_BLOCK_LITERAL_EXPR = eINSTANCE.getTextBlockLiteralExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ThisExprImpl <em>This Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ThisExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getThisExpr()
         * @generated
         */
        EClass THIS_EXPR = eINSTANCE.getThisExpr();

        /**
         * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference THIS_EXPR__TYPE_NAME = eINSTANCE.getThisExpr_TypeName();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.TypeExprImpl <em>Type Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.TypeExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getTypeExpr()
         * @generated
         */
        EClass TYPE_EXPR = eINSTANCE.getTypeExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.UnaryExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getUnaryExpr()
         * @generated
         */
        EClass UNARY_EXPR = eINSTANCE.getUnaryExpr();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UNARY_EXPR__OPERATOR = eINSTANCE.getUnaryExpr_Operator();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.VariableDeclarationExprImpl <em>Variable Declaration Expr</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.VariableDeclarationExprImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getVariableDeclarationExpr()
         * @generated
         */
        EClass VARIABLE_DECLARATION_EXPR = eINSTANCE.getVariableDeclarationExpr();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleDeclarationImpl <em>Module Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ModuleDeclarationImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleDeclaration()
         * @generated
         */
        EClass MODULE_DECLARATION = eINSTANCE.getModuleDeclaration();

        /**
         * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODULE_DECLARATION__OPEN = eINSTANCE.getModuleDeclaration_Open();

        /**
         * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODULE_DECLARATION__DIRECTIVES = eINSTANCE.getModuleDeclaration_Directives();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleDirectiveImpl <em>Module Directive</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ModuleDirectiveImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleDirective()
         * @generated
         */
        EClass MODULE_DIRECTIVE = eINSTANCE.getModuleDirective();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleExportsDirectiveImpl <em>Module Exports Directive</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ModuleExportsDirectiveImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleExportsDirective()
         * @generated
         */
        EClass MODULE_EXPORTS_DIRECTIVE = eINSTANCE.getModuleExportsDirective();

        /**
         * The meta object literal for the '<em><b>Module Names</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODULE_EXPORTS_DIRECTIVE__MODULE_NAMES = eINSTANCE.getModuleExportsDirective_ModuleNames();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleOpensDirectiveImpl <em>Module Opens Directive</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ModuleOpensDirectiveImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleOpensDirective()
         * @generated
         */
        EClass MODULE_OPENS_DIRECTIVE = eINSTANCE.getModuleOpensDirective();

        /**
         * The meta object literal for the '<em><b>Module Names</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODULE_OPENS_DIRECTIVE__MODULE_NAMES = eINSTANCE.getModuleOpensDirective_ModuleNames();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleProvidesDirectiveImpl <em>Module Provides Directive</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ModuleProvidesDirectiveImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleProvidesDirective()
         * @generated
         */
        EClass MODULE_PROVIDES_DIRECTIVE = eINSTANCE.getModuleProvidesDirective();

        /**
         * The meta object literal for the '<em><b>With</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODULE_PROVIDES_DIRECTIVE__WITH = eINSTANCE.getModuleProvidesDirective_With();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleRequiresDirectiveImpl <em>Module Requires Directive</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ModuleRequiresDirectiveImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleRequiresDirective()
         * @generated
         */
        EClass MODULE_REQUIRES_DIRECTIVE = eINSTANCE.getModuleRequiresDirective();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ModuleUsesDirectiveImpl <em>Module Uses Directive</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ModuleUsesDirectiveImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModuleUsesDirective()
         * @generated
         */
        EClass MODULE_USES_DIRECTIVE = eINSTANCE.getModuleUsesDirective();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithAnnotations <em>Node With Annotations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithAnnotations
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithAnnotations()
         * @generated
         */
        EClass NODE_WITH_ANNOTATIONS = eINSTANCE.getNodeWithAnnotations();

        /**
         * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_ANNOTATIONS__ANNOTATIONS = eINSTANCE.getNodeWithAnnotations_Annotations();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithArguments <em>Node With Arguments</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithArguments
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithArguments()
         * @generated
         */
        EClass NODE_WITH_ARGUMENTS = eINSTANCE.getNodeWithArguments();

        /**
         * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_ARGUMENTS__ARGUMENTS = eINSTANCE.getNodeWithArguments_Arguments();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithBlockStmt <em>Node With Block Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithBlockStmt
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithBlockStmt()
         * @generated
         */
        EClass NODE_WITH_BLOCK_STMT = eINSTANCE.getNodeWithBlockStmt();

        /**
         * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_BLOCK_STMT__BODY = eINSTANCE.getNodeWithBlockStmt_Body();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithBody <em>Node With Body</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithBody
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithBody()
         * @generated
         */
        EClass NODE_WITH_BODY = eINSTANCE.getNodeWithBody();

        /**
         * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_BODY__BODY = eINSTANCE.getNodeWithBody_Body();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithCondition <em>Node With Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithCondition
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithCondition()
         * @generated
         */
        EClass NODE_WITH_CONDITION = eINSTANCE.getNodeWithCondition();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_CONDITION__CONDITION = eINSTANCE.getNodeWithCondition_Condition();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithExpression <em>Node With Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithExpression
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithExpression()
         * @generated
         */
        EClass NODE_WITH_EXPRESSION = eINSTANCE.getNodeWithExpression();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_EXPRESSION__EXPRESSION = eINSTANCE.getNodeWithExpression_Expression();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithExtends <em>Node With Extends</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithExtends
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithExtends()
         * @generated
         */
        EClass NODE_WITH_EXTENDS = eINSTANCE.getNodeWithExtends();

        /**
         * The meta object literal for the '<em><b>Extended Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_EXTENDS__EXTENDED_TYPES = eINSTANCE.getNodeWithExtends_ExtendedTypes();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithIdentifier <em>Node With Identifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithIdentifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithIdentifier()
         * @generated
         */
        EClass NODE_WITH_IDENTIFIER = eINSTANCE.getNodeWithIdentifier();

        /**
         * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_IDENTIFIER__IDENTIFIER = eINSTANCE.getNodeWithIdentifier_Identifier();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithImplements <em>Node With Implements</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithImplements
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithImplements()
         * @generated
         */
        EClass NODE_WITH_IMPLEMENTS = eINSTANCE.getNodeWithImplements();

        /**
         * The meta object literal for the '<em><b>Implemented Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_IMPLEMENTS__IMPLEMENTED_TYPES = eINSTANCE.getNodeWithImplements_ImplementedTypes();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithJavadoc <em>Node With Javadoc</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithJavadoc
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithJavadoc()
         * @generated
         */
        EClass NODE_WITH_JAVADOC = eINSTANCE.getNodeWithJavadoc();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithMembers <em>Node With Members</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithMembers
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithMembers()
         * @generated
         */
        EClass NODE_WITH_MEMBERS = eINSTANCE.getNodeWithMembers();

        /**
         * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_MEMBERS__MEMBERS = eINSTANCE.getNodeWithMembers_Members();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithModifiers <em>Node With Modifiers</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithModifiers
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithModifiers()
         * @generated
         */
        EClass NODE_WITH_MODIFIERS = eINSTANCE.getNodeWithModifiers();

        /**
         * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_MODIFIERS__MODIFIERS = eINSTANCE.getNodeWithModifiers_Modifiers();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithName <em>Node With Name</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithName
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithName()
         * @generated
         */
        EClass NODE_WITH_NAME = eINSTANCE.getNodeWithName();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_NAME__NAME = eINSTANCE.getNodeWithName_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithLabel <em>Node With Label</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithLabel
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithLabel()
         * @generated
         */
        EClass NODE_WITH_LABEL = eINSTANCE.getNodeWithLabel();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_LABEL__LABEL = eINSTANCE.getNodeWithLabel_Label();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithParameters <em>Node With Parameters</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithParameters
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithParameters()
         * @generated
         */
        EClass NODE_WITH_PARAMETERS = eINSTANCE.getNodeWithParameters();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_PARAMETERS__PARAMETERS = eINSTANCE.getNodeWithParameters_Parameters();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithRange <em>Node With Range</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithRange
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithRange()
         * @generated
         */
        EClass NODE_WITH_RANGE = eINSTANCE.getNodeWithRange();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithScope <em>Node With Scope</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithScope
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithScope()
         * @generated
         */
        EClass NODE_WITH_SCOPE = eINSTANCE.getNodeWithScope();

        /**
         * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_SCOPE__SCOPE = eINSTANCE.getNodeWithScope_Scope();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithSimpleName <em>Node With Simple Name</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithSimpleName
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithSimpleName()
         * @generated
         */
        EClass NODE_WITH_SIMPLE_NAME = eINSTANCE.getNodeWithSimpleName();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_SIMPLE_NAME__NAME = eINSTANCE.getNodeWithSimpleName_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithStatements <em>Node With Statements</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithStatements
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithStatements()
         * @generated
         */
        EClass NODE_WITH_STATEMENTS = eINSTANCE.getNodeWithStatements();

        /**
         * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_STATEMENTS__STATEMENTS = eINSTANCE.getNodeWithStatements_Statements();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithThrownExceptions <em>Node With Thrown Exceptions</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithThrownExceptions
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithThrownExceptions()
         * @generated
         */
        EClass NODE_WITH_THROWN_EXCEPTIONS = eINSTANCE.getNodeWithThrownExceptions();

        /**
         * The meta object literal for the '<em><b>Thrown Exceptions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_THROWN_EXCEPTIONS__THROWN_EXCEPTIONS = eINSTANCE
                .getNodeWithThrownExceptions_ThrownExceptions();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithTokenRange <em>Node With Token Range</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithTokenRange
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithTokenRange()
         * @generated
         */
        EClass NODE_WITH_TOKEN_RANGE = eINSTANCE.getNodeWithTokenRange();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithType <em>Node With Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithType
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithType()
         * @generated
         */
        EClass NODE_WITH_TYPE = eINSTANCE.getNodeWithType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_TYPE__TYPE = eINSTANCE.getNodeWithType_Type();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithTypeArguments <em>Node With Type Arguments</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithTypeArguments
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithTypeArguments()
         * @generated
         */
        EClass NODE_WITH_TYPE_ARGUMENTS = eINSTANCE.getNodeWithTypeArguments();

        /**
         * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS = eINSTANCE.getNodeWithTypeArguments_TypeArguments();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithTypeParameters <em>Node With Type Parameters</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithTypeParameters
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithTypeParameters()
         * @generated
         */
        EClass NODE_WITH_TYPE_PARAMETERS = eINSTANCE.getNodeWithTypeParameters();

        /**
         * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_TYPE_PARAMETERS__TYPE_PARAMETERS = eINSTANCE.getNodeWithTypeParameters_TypeParameters();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithVariables <em>Node With Variables</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithVariables
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithVariables()
         * @generated
         */
        EClass NODE_WITH_VARIABLES = eINSTANCE.getNodeWithVariables();

        /**
         * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_WITH_VARIABLES__VARIABLES = eINSTANCE.getNodeWithVariables_Variables();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.SwitchNode <em>Switch Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.SwitchNode
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSwitchNode()
         * @generated
         */
        EClass SWITCH_NODE = eINSTANCE.getSwitchNode();

        /**
         * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SWITCH_NODE__SELECTOR = eINSTANCE.getSwitchNode_Selector();

        /**
         * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SWITCH_NODE__ENTRIES = eINSTANCE.getSwitchNode_Entries();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithAbstractModifier <em>Node With Abstract Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithAbstractModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithAbstractModifier()
         * @generated
         */
        EClass NODE_WITH_ABSTRACT_MODIFIER = eINSTANCE.getNodeWithAbstractModifier();

        /**
         * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_ABSTRACT_MODIFIER__ABSTRACT = eINSTANCE.getNodeWithAbstractModifier_Abstract();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithAccessModifiers <em>Node With Access Modifiers</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithAccessModifiers
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithAccessModifiers()
         * @generated
         */
        EClass NODE_WITH_ACCESS_MODIFIERS = eINSTANCE.getNodeWithAccessModifiers();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithDefaultModifier <em>Node With Default Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithDefaultModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithDefaultModifier()
         * @generated
         */
        EClass NODE_WITH_DEFAULT_MODIFIER = eINSTANCE.getNodeWithDefaultModifier();

        /**
         * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_DEFAULT_MODIFIER__DEFAULT = eINSTANCE.getNodeWithDefaultModifier_Default();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithFinalModifier <em>Node With Final Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithFinalModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithFinalModifier()
         * @generated
         */
        EClass NODE_WITH_FINAL_MODIFIER = eINSTANCE.getNodeWithFinalModifier();

        /**
         * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_FINAL_MODIFIER__FINAL = eINSTANCE.getNodeWithFinalModifier_Final();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithNativeModifier <em>Node With Native Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithNativeModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithNativeModifier()
         * @generated
         */
        EClass NODE_WITH_NATIVE_MODIFIER = eINSTANCE.getNodeWithNativeModifier();

        /**
         * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_NATIVE_MODIFIER__NATIVE = eINSTANCE.getNodeWithNativeModifier_Native();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithPrivateModifier <em>Node With Private Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithPrivateModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithPrivateModifier()
         * @generated
         */
        EClass NODE_WITH_PRIVATE_MODIFIER = eINSTANCE.getNodeWithPrivateModifier();

        /**
         * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_PRIVATE_MODIFIER__PRIVATE = eINSTANCE.getNodeWithPrivateModifier_Private();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithProtectedModifier <em>Node With Protected Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithProtectedModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithProtectedModifier()
         * @generated
         */
        EClass NODE_WITH_PROTECTED_MODIFIER = eINSTANCE.getNodeWithProtectedModifier();

        /**
         * The meta object literal for the '<em><b>Protected</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_PROTECTED_MODIFIER__PROTECTED = eINSTANCE.getNodeWithProtectedModifier_Protected();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithPublicModifier <em>Node With Public Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithPublicModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithPublicModifier()
         * @generated
         */
        EClass NODE_WITH_PUBLIC_MODIFIER = eINSTANCE.getNodeWithPublicModifier();

        /**
         * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_PUBLIC_MODIFIER__PUBLIC = eINSTANCE.getNodeWithPublicModifier_Public();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithStaticModifier <em>Node With Static Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithStaticModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithStaticModifier()
         * @generated
         */
        EClass NODE_WITH_STATIC_MODIFIER = eINSTANCE.getNodeWithStaticModifier();

        /**
         * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_STATIC_MODIFIER__STATIC = eINSTANCE.getNodeWithStaticModifier_Static();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithSynchronizedModifier <em>Node With Synchronized Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithSynchronizedModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithSynchronizedModifier()
         * @generated
         */
        EClass NODE_WITH_SYNCHRONIZED_MODIFIER = eINSTANCE.getNodeWithSynchronizedModifier();

        /**
         * The meta object literal for the '<em><b>Synchronized</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_SYNCHRONIZED_MODIFIER__SYNCHRONIZED = eINSTANCE
                .getNodeWithSynchronizedModifier_Synchronized();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithStrictfpModifier <em>Node With Strictfp Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithStrictfpModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithStrictfpModifier()
         * @generated
         */
        EClass NODE_WITH_STRICTFP_MODIFIER = eINSTANCE.getNodeWithStrictfpModifier();

        /**
         * The meta object literal for the '<em><b>Strictfp</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_STRICTFP_MODIFIER__STRICTFP = eINSTANCE.getNodeWithStrictfpModifier_Strictfp();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithTransientModifier <em>Node With Transient Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithTransientModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithTransientModifier()
         * @generated
         */
        EClass NODE_WITH_TRANSIENT_MODIFIER = eINSTANCE.getNodeWithTransientModifier();

        /**
         * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_TRANSIENT_MODIFIER__TRANSIENT = eINSTANCE.getNodeWithTransientModifier_Transient();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithTransitiveModifier <em>Node With Transitive Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithTransitiveModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithTransitiveModifier()
         * @generated
         */
        EClass NODE_WITH_TRANSITIVE_MODIFIER = eINSTANCE.getNodeWithTransitiveModifier();

        /**
         * The meta object literal for the '<em><b>Transitive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_TRANSITIVE_MODIFIER__TRANSITIVE = eINSTANCE.getNodeWithTransitiveModifier_Transitive();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.NodeWithVolatileModifier <em>Node With Volatile Modifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.NodeWithVolatileModifier
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getNodeWithVolatileModifier()
         * @generated
         */
        EClass NODE_WITH_VOLATILE_MODIFIER = eINSTANCE.getNodeWithVolatileModifier();

        /**
         * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_WITH_VOLATILE_MODIFIER__VOLATILE = eINSTANCE.getNodeWithVolatileModifier_Volatile();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.AssertStmtImpl <em>Assert Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.AssertStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getAssertStmt()
         * @generated
         */
        EClass ASSERT_STMT = eINSTANCE.getAssertStmt();

        /**
         * The meta object literal for the '<em><b>Check</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSERT_STMT__CHECK = eINSTANCE.getAssertStmt_Check();

        /**
         * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSERT_STMT__MESSAGE = eINSTANCE.getAssertStmt_Message();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.BlockStmtImpl <em>Block Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.BlockStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBlockStmt()
         * @generated
         */
        EClass BLOCK_STMT = eINSTANCE.getBlockStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.BreakStmtImpl <em>Break Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.BreakStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBreakStmt()
         * @generated
         */
        EClass BREAK_STMT = eINSTANCE.getBreakStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.CatchClauseImpl <em>Catch Clause</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.CatchClauseImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getCatchClause()
         * @generated
         */
        EClass CATCH_CLAUSE = eINSTANCE.getCatchClause();

        /**
         * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CATCH_CLAUSE__PARAMETER = eINSTANCE.getCatchClause_Parameter();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ContinueStmtImpl <em>Continue Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ContinueStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getContinueStmt()
         * @generated
         */
        EClass CONTINUE_STMT = eINSTANCE.getContinueStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.DoStmtImpl <em>Do Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.DoStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getDoStmt()
         * @generated
         */
        EClass DO_STMT = eINSTANCE.getDoStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.EmptyStmtImpl <em>Empty Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.EmptyStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getEmptyStmt()
         * @generated
         */
        EClass EMPTY_STMT = eINSTANCE.getEmptyStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ExplicitConstructorInvocationStmtImpl <em>Explicit Constructor Invocation Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ExplicitConstructorInvocationStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getExplicitConstructorInvocationStmt()
         * @generated
         */
        EClass EXPLICIT_CONSTRUCTOR_INVOCATION_STMT = eINSTANCE.getExplicitConstructorInvocationStmt();

        /**
         * The meta object literal for the '<em><b>Is This</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__IS_THIS = eINSTANCE
                .getExplicitConstructorInvocationStmt_IsThis();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ExpressionStmtImpl <em>Expression Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ExpressionStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getExpressionStmt()
         * @generated
         */
        EClass EXPRESSION_STMT = eINSTANCE.getExpressionStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ForEachStmtImpl <em>For Each Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ForEachStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getForEachStmt()
         * @generated
         */
        EClass FOR_EACH_STMT = eINSTANCE.getForEachStmt();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_STMT__VARIABLE = eINSTANCE.getForEachStmt_Variable();

        /**
         * The meta object literal for the '<em><b>Iterable</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_STMT__ITERABLE = eINSTANCE.getForEachStmt_Iterable();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ForStmtImpl <em>For Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ForStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getForStmt()
         * @generated
         */
        EClass FOR_STMT = eINSTANCE.getForStmt();

        /**
         * The meta object literal for the '<em><b>Initialization</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_STMT__INITIALIZATION = eINSTANCE.getForStmt_Initialization();

        /**
         * The meta object literal for the '<em><b>Compare</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_STMT__COMPARE = eINSTANCE.getForStmt_Compare();

        /**
         * The meta object literal for the '<em><b>Update</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_STMT__UPDATE = eINSTANCE.getForStmt_Update();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.IfStmtImpl <em>If Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.IfStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getIfStmt()
         * @generated
         */
        EClass IF_STMT = eINSTANCE.getIfStmt();

        /**
         * The meta object literal for the '<em><b>Then Stmt</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IF_STMT__THEN_STMT = eINSTANCE.getIfStmt_ThenStmt();

        /**
         * The meta object literal for the '<em><b>Else Stmt</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IF_STMT__ELSE_STMT = eINSTANCE.getIfStmt_ElseStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.LabeledStmtImpl <em>Labeled Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.LabeledStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLabeledStmt()
         * @generated
         */
        EClass LABELED_STMT = eINSTANCE.getLabeledStmt();

        /**
         * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LABELED_STMT__STATEMENT = eINSTANCE.getLabeledStmt_Statement();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.LocalClassDeclarationStmtImpl <em>Local Class Declaration Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.LocalClassDeclarationStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getLocalClassDeclarationStmt()
         * @generated
         */
        EClass LOCAL_CLASS_DECLARATION_STMT = eINSTANCE.getLocalClassDeclarationStmt();

        /**
         * The meta object literal for the '<em><b>Class Declaration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCAL_CLASS_DECLARATION_STMT__CLASS_DECLARATION = eINSTANCE
                .getLocalClassDeclarationStmt_ClassDeclaration();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ReturnStmtImpl <em>Return Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ReturnStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getReturnStmt()
         * @generated
         */
        EClass RETURN_STMT = eINSTANCE.getReturnStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.StatementImpl <em>Statement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.StatementImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getStatement()
         * @generated
         */
        EClass STATEMENT = eINSTANCE.getStatement();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.SwitchEntryImpl <em>Switch Entry</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.SwitchEntryImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSwitchEntry()
         * @generated
         */
        EClass SWITCH_ENTRY = eINSTANCE.getSwitchEntry();

        /**
         * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SWITCH_ENTRY__LABELS = eINSTANCE.getSwitchEntry_Labels();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SWITCH_ENTRY__TYPE = eINSTANCE.getSwitchEntry_Type();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.SwitchStmtImpl <em>Switch Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.SwitchStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSwitchStmt()
         * @generated
         */
        EClass SWITCH_STMT = eINSTANCE.getSwitchStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.SynchronizedStmtImpl <em>Synchronized Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.SynchronizedStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSynchronizedStmt()
         * @generated
         */
        EClass SYNCHRONIZED_STMT = eINSTANCE.getSynchronizedStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ThrowStmtImpl <em>Throw Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ThrowStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getThrowStmt()
         * @generated
         */
        EClass THROW_STMT = eINSTANCE.getThrowStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.TryStmtImpl <em>Try Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.TryStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getTryStmt()
         * @generated
         */
        EClass TRY_STMT = eINSTANCE.getTryStmt();

        /**
         * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRY_STMT__RESOURCES = eINSTANCE.getTryStmt_Resources();

        /**
         * The meta object literal for the '<em><b>Try Block</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRY_STMT__TRY_BLOCK = eINSTANCE.getTryStmt_TryBlock();

        /**
         * The meta object literal for the '<em><b>Catch Clauses</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRY_STMT__CATCH_CLAUSES = eINSTANCE.getTryStmt_CatchClauses();

        /**
         * The meta object literal for the '<em><b>Finally Block</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRY_STMT__FINALLY_BLOCK = eINSTANCE.getTryStmt_FinallyBlock();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.WhileStmtImpl <em>While Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.WhileStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getWhileStmt()
         * @generated
         */
        EClass WHILE_STMT = eINSTANCE.getWhileStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.YieldStmtImpl <em>Yield Stmt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.YieldStmtImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getYieldStmt()
         * @generated
         */
        EClass YIELD_STMT = eINSTANCE.getYieldStmt();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ArrayTypeImpl <em>Array Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ArrayTypeImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getArrayType()
         * @generated
         */
        EClass ARRAY_TYPE = eINSTANCE.getArrayType();

        /**
         * The meta object literal for the '<em><b>Component Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_TYPE__COMPONENT_TYPE = eINSTANCE.getArrayType_ComponentType();

        /**
         * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ARRAY_TYPE__ORIGIN = eINSTANCE.getArrayType_Origin();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ClassOrInterfaceTypeImpl <em>Class Or Interface Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ClassOrInterfaceTypeImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getClassOrInterfaceType()
         * @generated
         */
        EClass CLASS_OR_INTERFACE_TYPE = eINSTANCE.getClassOrInterfaceType();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.IntersectionTypeImpl <em>Intersection Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.IntersectionTypeImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getIntersectionType()
         * @generated
         */
        EClass INTERSECTION_TYPE = eINSTANCE.getIntersectionType();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERSECTION_TYPE__ELEMENTS = eINSTANCE.getIntersectionType_Elements();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.PrimitiveTypeImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getPrimitiveType()
         * @generated
         */
        EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRIMITIVE_TYPE__TYPE = eINSTANCE.getPrimitiveType_Type();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.ReferenceTypeImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getReferenceType()
         * @generated
         */
        EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.TypeImpl <em>Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.TypeImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getType()
         * @generated
         */
        EClass TYPE = eINSTANCE.getType();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.TypeParameterImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getTypeParameter()
         * @generated
         */
        EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

        /**
         * The meta object literal for the '<em><b>Type Bound</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_PARAMETER__TYPE_BOUND = eINSTANCE.getTypeParameter_TypeBound();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.UnionTypeImpl <em>Union Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.UnionTypeImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getUnionType()
         * @generated
         */
        EClass UNION_TYPE = eINSTANCE.getUnionType();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UNION_TYPE__ELEMENTS = eINSTANCE.getUnionType_Elements();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.UnknownTypeImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getUnknownType()
         * @generated
         */
        EClass UNKNOWN_TYPE = eINSTANCE.getUnknownType();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.VarTypeImpl <em>Var Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.VarTypeImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getVarType()
         * @generated
         */
        EClass VAR_TYPE = eINSTANCE.getVarType();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.VoidTypeImpl <em>Void Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.VoidTypeImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getVoidType()
         * @generated
         */
        EClass VOID_TYPE = eINSTANCE.getVoidType();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.impl.WildcardTypeImpl <em>Wildcard Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.impl.WildcardTypeImpl
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getWildcardType()
         * @generated
         */
        EClass WILDCARD_TYPE = eINSTANCE.getWildcardType();

        /**
         * The meta object literal for the '<em><b>Extended Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WILDCARD_TYPE__EXTENDED_TYPE = eINSTANCE.getWildcardType_ExtendedType();

        /**
         * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WILDCARD_TYPE__SUPER_TYPE = eINSTANCE.getWildcardType_SuperType();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.ModifierKeyword <em>Modifier Keyword</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.ModifierKeyword
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getModifierKeyword()
         * @generated
         */
        EEnum MODIFIER_KEYWORD = eINSTANCE.getModifierKeyword();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.AssignOperator <em>Assign Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.AssignOperator
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getAssignOperator()
         * @generated
         */
        EEnum ASSIGN_OPERATOR = eINSTANCE.getAssignOperator();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.BinaryOperator <em>Binary Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.BinaryOperator
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getBinaryOperator()
         * @generated
         */
        EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.UnaryOperator <em>Unary Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.UnaryOperator
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getUnaryOperator()
         * @generated
         */
        EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.SwitchEntryType <em>Switch Entry Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.SwitchEntryType
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getSwitchEntryType()
         * @generated
         */
        EEnum SWITCH_ENTRY_TYPE = eINSTANCE.getSwitchEntryType();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.ArrayTypeOrigin <em>Array Type Origin</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.ArrayTypeOrigin
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getArrayTypeOrigin()
         * @generated
         */
        EEnum ARRAY_TYPE_ORIGIN = eINSTANCE.getArrayTypeOrigin();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.csd.ejava.Primitive <em>Primitive</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.csd.ejava.Primitive
         * @see fr.centralesupelec.csd.ejava.impl.EJavaPackageImpl#getPrimitive()
         * @generated
         */
        EEnum PRIMITIVE = eINSTANCE.getPrimitive();

    }

} //EJavaPackage
