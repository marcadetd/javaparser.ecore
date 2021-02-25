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
package fr.centralesupelec.csd.java.util;

import com.github.javaparser.ast.Node;
import fr.centralesupelec.csd.java.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.csd.java.JavaPackage
 * @generated
 */
public class JavaSwitch< T > extends Switch< T > {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static JavaPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JavaSwitch() {
        if( modelPackage == null ) {
            modelPackage = JavaPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor( EPackage ePackage ) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch( int classifierID, EObject theEObject ) {
        switch( classifierID ) {
        case JavaPackage.JAVA_NODE: {
            JavaNode javaNode = ( JavaNode ) theEObject;
            T result = caseJavaNode( javaNode );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ARRAY_CREATION_LEVEL: {
            ArrayCreationLevel arrayCreationLevel = ( ArrayCreationLevel ) theEObject;
            T result = caseArrayCreationLevel( arrayCreationLevel );
            if( result == null ) result = caseJavaNode( arrayCreationLevel );
            if( result == null ) result = caseNodeWithAnnotations( arrayCreationLevel );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.COMPILATION_UNIT: {
            CompilationUnit compilationUnit = ( CompilationUnit ) theEObject;
            T result = caseCompilationUnit( compilationUnit );
            if( result == null ) result = caseJavaNode( compilationUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.IMPORT_DECLARATION: {
            ImportDeclaration importDeclaration = ( ImportDeclaration ) theEObject;
            T result = caseImportDeclaration( importDeclaration );
            if( result == null ) result = caseJavaNode( importDeclaration );
            if( result == null ) result = caseNodeWithName( importDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.PACKAGE_DECLARATION: {
            PackageDeclaration packageDeclaration = ( PackageDeclaration ) theEObject;
            T result = casePackageDeclaration( packageDeclaration );
            if( result == null ) result = caseJavaNode( packageDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( packageDeclaration );
            if( result == null ) result = caseNodeWithName( packageDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ANNOTATION_DECLARATION: {
            AnnotationDeclaration annotationDeclaration = ( AnnotationDeclaration ) theEObject;
            T result = caseAnnotationDeclaration( annotationDeclaration );
            if( result == null ) result = caseTypeDeclaration( annotationDeclaration );
            if( result == null ) result = caseNodeWithAbstractModifier( annotationDeclaration );
            if( result == null ) result = caseBodyDeclaration( annotationDeclaration );
            if( result == null ) result = caseNodeWithSimpleName( annotationDeclaration );
            if( result == null ) result = caseNodeWithJavadoc( annotationDeclaration );
            if( result == null ) result = caseNodeWithMembers( annotationDeclaration );
            if( result == null ) result = caseNodeWithAccessModifiers( annotationDeclaration );
            if( result == null ) result = caseNodeWithStaticModifier( annotationDeclaration );
            if( result == null ) result = caseNodeWithStrictfpModifier( annotationDeclaration );
            if( result == null ) result = caseJavaNode( annotationDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( annotationDeclaration );
            if( result == null ) result = caseNodeWithPublicModifier( annotationDeclaration );
            if( result == null ) result = caseNodeWithPrivateModifier( annotationDeclaration );
            if( result == null ) result = caseNodeWithProtectedModifier( annotationDeclaration );
            if( result == null ) result = caseNodeWithModifiers( annotationDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION: {
            AnnotationMemberDeclaration annotationMemberDeclaration = ( AnnotationMemberDeclaration ) theEObject;
            T result = caseAnnotationMemberDeclaration( annotationMemberDeclaration );
            if( result == null ) result = caseBodyDeclaration( annotationMemberDeclaration );
            if( result == null ) result = caseNodeWithJavadoc( annotationMemberDeclaration );
            if( result == null ) result = caseNodeWithSimpleName( annotationMemberDeclaration );
            if( result == null ) result = caseNodeWithType( annotationMemberDeclaration );
            if( result == null ) result = caseNodeWithPublicModifier( annotationMemberDeclaration );
            if( result == null ) result = caseNodeWithAbstractModifier( annotationMemberDeclaration );
            if( result == null ) result = caseJavaNode( annotationMemberDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( annotationMemberDeclaration );
            if( result == null ) result = caseNodeWithModifiers( annotationMemberDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.BODY_DECLARATION: {
            BodyDeclaration bodyDeclaration = ( BodyDeclaration ) theEObject;
            T result = caseBodyDeclaration( bodyDeclaration );
            if( result == null ) result = caseJavaNode( bodyDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( bodyDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.CALLABLE_DECLARATION: {
            CallableDeclaration callableDeclaration = ( CallableDeclaration ) theEObject;
            T result = caseCallableDeclaration( callableDeclaration );
            if( result == null ) result = caseBodyDeclaration( callableDeclaration );
            if( result == null ) result = caseNodeWithAccessModifiers( callableDeclaration );
            if( result == null ) result = caseNodeWithSimpleName( callableDeclaration );
            if( result == null ) result = caseNodeWithParameters( callableDeclaration );
            if( result == null ) result = caseNodeWithThrownExceptions( callableDeclaration );
            if( result == null ) result = caseNodeWithTypeParameters( callableDeclaration );
            if( result == null ) result = caseNodeWithJavadoc( callableDeclaration );
            if( result == null ) result = caseNodeWithAbstractModifier( callableDeclaration );
            if( result == null ) result = caseNodeWithStaticModifier( callableDeclaration );
            if( result == null ) result = caseNodeWithFinalModifier( callableDeclaration );
            if( result == null ) result = caseNodeWithStrictfpModifier( callableDeclaration );
            if( result == null ) result = caseJavaNode( callableDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( callableDeclaration );
            if( result == null ) result = caseNodeWithPublicModifier( callableDeclaration );
            if( result == null ) result = caseNodeWithPrivateModifier( callableDeclaration );
            if( result == null ) result = caseNodeWithProtectedModifier( callableDeclaration );
            if( result == null ) result = caseNodeWithModifiers( callableDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION: {
            ClassOrInterfaceDeclaration classOrInterfaceDeclaration = ( ClassOrInterfaceDeclaration ) theEObject;
            T result = caseClassOrInterfaceDeclaration( classOrInterfaceDeclaration );
            if( result == null ) result = caseTypeDeclaration( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithImplements( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithExtends( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithTypeParameters( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithAbstractModifier( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithFinalModifier( classOrInterfaceDeclaration );
            if( result == null ) result = caseBodyDeclaration( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithSimpleName( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithJavadoc( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithMembers( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithAccessModifiers( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithStaticModifier( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithStrictfpModifier( classOrInterfaceDeclaration );
            if( result == null ) result = caseJavaNode( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithPublicModifier( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithPrivateModifier( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithProtectedModifier( classOrInterfaceDeclaration );
            if( result == null ) result = caseNodeWithModifiers( classOrInterfaceDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.CONSTRUCTOR_DECLARATION: {
            ConstructorDeclaration constructorDeclaration = ( ConstructorDeclaration ) theEObject;
            T result = caseConstructorDeclaration( constructorDeclaration );
            if( result == null ) result = caseCallableDeclaration( constructorDeclaration );
            if( result == null ) result = caseNodeWithBlockStmt( constructorDeclaration );
            if( result == null ) result = caseBodyDeclaration( constructorDeclaration );
            if( result == null ) result = caseNodeWithAccessModifiers( constructorDeclaration );
            if( result == null ) result = caseNodeWithSimpleName( constructorDeclaration );
            if( result == null ) result = caseNodeWithParameters( constructorDeclaration );
            if( result == null ) result = caseNodeWithThrownExceptions( constructorDeclaration );
            if( result == null ) result = caseNodeWithTypeParameters( constructorDeclaration );
            if( result == null ) result = caseNodeWithJavadoc( constructorDeclaration );
            if( result == null ) result = caseNodeWithAbstractModifier( constructorDeclaration );
            if( result == null ) result = caseNodeWithStaticModifier( constructorDeclaration );
            if( result == null ) result = caseNodeWithFinalModifier( constructorDeclaration );
            if( result == null ) result = caseNodeWithStrictfpModifier( constructorDeclaration );
            if( result == null ) result = caseJavaNode( constructorDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( constructorDeclaration );
            if( result == null ) result = caseNodeWithPublicModifier( constructorDeclaration );
            if( result == null ) result = caseNodeWithPrivateModifier( constructorDeclaration );
            if( result == null ) result = caseNodeWithProtectedModifier( constructorDeclaration );
            if( result == null ) result = caseNodeWithModifiers( constructorDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ENUM_CONSTANT_DECLARATION: {
            EnumConstantDeclaration enumConstantDeclaration = ( EnumConstantDeclaration ) theEObject;
            T result = caseEnumConstantDeclaration( enumConstantDeclaration );
            if( result == null ) result = caseBodyDeclaration( enumConstantDeclaration );
            if( result == null ) result = caseNodeWithJavadoc( enumConstantDeclaration );
            if( result == null ) result = caseNodeWithSimpleName( enumConstantDeclaration );
            if( result == null ) result = caseNodeWithArguments( enumConstantDeclaration );
            if( result == null ) result = caseJavaNode( enumConstantDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( enumConstantDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ENUM_DECLARATION: {
            EnumDeclaration enumDeclaration = ( EnumDeclaration ) theEObject;
            T result = caseEnumDeclaration( enumDeclaration );
            if( result == null ) result = caseTypeDeclaration( enumDeclaration );
            if( result == null ) result = caseNodeWithImplements( enumDeclaration );
            if( result == null ) result = caseBodyDeclaration( enumDeclaration );
            if( result == null ) result = caseNodeWithSimpleName( enumDeclaration );
            if( result == null ) result = caseNodeWithJavadoc( enumDeclaration );
            if( result == null ) result = caseNodeWithMembers( enumDeclaration );
            if( result == null ) result = caseNodeWithAccessModifiers( enumDeclaration );
            if( result == null ) result = caseNodeWithStaticModifier( enumDeclaration );
            if( result == null ) result = caseNodeWithStrictfpModifier( enumDeclaration );
            if( result == null ) result = caseJavaNode( enumDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( enumDeclaration );
            if( result == null ) result = caseNodeWithPublicModifier( enumDeclaration );
            if( result == null ) result = caseNodeWithPrivateModifier( enumDeclaration );
            if( result == null ) result = caseNodeWithProtectedModifier( enumDeclaration );
            if( result == null ) result = caseNodeWithModifiers( enumDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.FIELD_DECLARATION: {
            FieldDeclaration fieldDeclaration = ( FieldDeclaration ) theEObject;
            T result = caseFieldDeclaration( fieldDeclaration );
            if( result == null ) result = caseBodyDeclaration( fieldDeclaration );
            if( result == null ) result = caseNodeWithJavadoc( fieldDeclaration );
            if( result == null ) result = caseNodeWithVariables( fieldDeclaration );
            if( result == null ) result = caseNodeWithAccessModifiers( fieldDeclaration );
            if( result == null ) result = caseNodeWithStaticModifier( fieldDeclaration );
            if( result == null ) result = caseNodeWithFinalModifier( fieldDeclaration );
            if( result == null ) result = caseNodeWithTransientModifier( fieldDeclaration );
            if( result == null ) result = caseNodeWithVolatileModifier( fieldDeclaration );
            if( result == null ) result = caseJavaNode( fieldDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( fieldDeclaration );
            if( result == null ) result = caseNodeWithPublicModifier( fieldDeclaration );
            if( result == null ) result = caseNodeWithPrivateModifier( fieldDeclaration );
            if( result == null ) result = caseNodeWithProtectedModifier( fieldDeclaration );
            if( result == null ) result = caseNodeWithModifiers( fieldDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.INITIALIZER_DECLARATION: {
            InitializerDeclaration initializerDeclaration = ( InitializerDeclaration ) theEObject;
            T result = caseInitializerDeclaration( initializerDeclaration );
            if( result == null ) result = caseBodyDeclaration( initializerDeclaration );
            if( result == null ) result = caseNodeWithJavadoc( initializerDeclaration );
            if( result == null ) result = caseNodeWithBlockStmt( initializerDeclaration );
            if( result == null ) result = caseJavaNode( initializerDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( initializerDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.METHOD_DECLARATION: {
            MethodDeclaration methodDeclaration = ( MethodDeclaration ) theEObject;
            T result = caseMethodDeclaration( methodDeclaration );
            if( result == null ) result = caseCallableDeclaration( methodDeclaration );
            if( result == null ) result = caseNodeWithType( methodDeclaration );
            if( result == null ) result = caseNodeWithBlockStmt( methodDeclaration );
            if( result == null ) result = caseNodeWithNativeModifier( methodDeclaration );
            if( result == null ) result = caseNodeWithSynchronizedModifier( methodDeclaration );
            if( result == null ) result = caseNodeWithDefaultModifier( methodDeclaration );
            if( result == null ) result = caseBodyDeclaration( methodDeclaration );
            if( result == null ) result = caseNodeWithAccessModifiers( methodDeclaration );
            if( result == null ) result = caseNodeWithSimpleName( methodDeclaration );
            if( result == null ) result = caseNodeWithParameters( methodDeclaration );
            if( result == null ) result = caseNodeWithThrownExceptions( methodDeclaration );
            if( result == null ) result = caseNodeWithTypeParameters( methodDeclaration );
            if( result == null ) result = caseNodeWithJavadoc( methodDeclaration );
            if( result == null ) result = caseNodeWithAbstractModifier( methodDeclaration );
            if( result == null ) result = caseNodeWithStaticModifier( methodDeclaration );
            if( result == null ) result = caseNodeWithFinalModifier( methodDeclaration );
            if( result == null ) result = caseNodeWithStrictfpModifier( methodDeclaration );
            if( result == null ) result = caseJavaNode( methodDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( methodDeclaration );
            if( result == null ) result = caseNodeWithPublicModifier( methodDeclaration );
            if( result == null ) result = caseNodeWithPrivateModifier( methodDeclaration );
            if( result == null ) result = caseNodeWithProtectedModifier( methodDeclaration );
            if( result == null ) result = caseNodeWithModifiers( methodDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.PARAMETER: {
            Parameter parameter = ( Parameter ) theEObject;
            T result = caseParameter( parameter );
            if( result == null ) result = caseJavaNode( parameter );
            if( result == null ) result = caseNodeWithType( parameter );
            if( result == null ) result = caseNodeWithAnnotations( parameter );
            if( result == null ) result = caseNodeWithSimpleName( parameter );
            if( result == null ) result = caseNodeWithFinalModifier( parameter );
            if( result == null ) result = caseNodeWithModifiers( parameter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.RECEIVER_PARAMETER: {
            ReceiverParameter receiverParameter = ( ReceiverParameter ) theEObject;
            T result = caseReceiverParameter( receiverParameter );
            if( result == null ) result = caseJavaNode( receiverParameter );
            if( result == null ) result = caseNodeWithType( receiverParameter );
            if( result == null ) result = caseNodeWithAnnotations( receiverParameter );
            if( result == null ) result = caseNodeWithName( receiverParameter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.TYPE_DECLARATION: {
            TypeDeclaration typeDeclaration = ( TypeDeclaration ) theEObject;
            T result = caseTypeDeclaration( typeDeclaration );
            if( result == null ) result = caseBodyDeclaration( typeDeclaration );
            if( result == null ) result = caseNodeWithSimpleName( typeDeclaration );
            if( result == null ) result = caseNodeWithJavadoc( typeDeclaration );
            if( result == null ) result = caseNodeWithMembers( typeDeclaration );
            if( result == null ) result = caseNodeWithAccessModifiers( typeDeclaration );
            if( result == null ) result = caseNodeWithStaticModifier( typeDeclaration );
            if( result == null ) result = caseNodeWithStrictfpModifier( typeDeclaration );
            if( result == null ) result = caseJavaNode( typeDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( typeDeclaration );
            if( result == null ) result = caseNodeWithPublicModifier( typeDeclaration );
            if( result == null ) result = caseNodeWithPrivateModifier( typeDeclaration );
            if( result == null ) result = caseNodeWithProtectedModifier( typeDeclaration );
            if( result == null ) result = caseNodeWithModifiers( typeDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.VARIABLE_DECLARATOR: {
            VariableDeclarator variableDeclarator = ( VariableDeclarator ) theEObject;
            T result = caseVariableDeclarator( variableDeclarator );
            if( result == null ) result = caseJavaNode( variableDeclarator );
            if( result == null ) result = caseNodeWithType( variableDeclarator );
            if( result == null ) result = caseNodeWithSimpleName( variableDeclarator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.BLOCK_COMMENT: {
            BlockComment blockComment = ( BlockComment ) theEObject;
            T result = caseBlockComment( blockComment );
            if( result == null ) result = caseComment( blockComment );
            if( result == null ) result = caseJavaNode( blockComment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.COMMENT: {
            Comment comment = ( Comment ) theEObject;
            T result = caseComment( comment );
            if( result == null ) result = caseJavaNode( comment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.JAVADOC_COMMENT: {
            JavadocComment javadocComment = ( JavadocComment ) theEObject;
            T result = caseJavadocComment( javadocComment );
            if( result == null ) result = caseComment( javadocComment );
            if( result == null ) result = caseJavaNode( javadocComment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.LINE_COMMENT: {
            LineComment lineComment = ( LineComment ) theEObject;
            T result = caseLineComment( lineComment );
            if( result == null ) result = caseComment( lineComment );
            if( result == null ) result = caseJavaNode( lineComment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ANNOTATION_EXPR: {
            AnnotationExpr annotationExpr = ( AnnotationExpr ) theEObject;
            T result = caseAnnotationExpr( annotationExpr );
            if( result == null ) result = caseExpression( annotationExpr );
            if( result == null ) result = caseNodeWithName( annotationExpr );
            if( result == null ) result = caseJavaNode( annotationExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ARRAY_ACCESS_EXPR: {
            ArrayAccessExpr arrayAccessExpr = ( ArrayAccessExpr ) theEObject;
            T result = caseArrayAccessExpr( arrayAccessExpr );
            if( result == null ) result = caseExpression( arrayAccessExpr );
            if( result == null ) result = caseJavaNode( arrayAccessExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ARRAY_CREATION_EXPR: {
            ArrayCreationExpr arrayCreationExpr = ( ArrayCreationExpr ) theEObject;
            T result = caseArrayCreationExpr( arrayCreationExpr );
            if( result == null ) result = caseExpression( arrayCreationExpr );
            if( result == null ) result = caseJavaNode( arrayCreationExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ARRAY_INITIALIZER_EXPR: {
            ArrayInitializerExpr arrayInitializerExpr = ( ArrayInitializerExpr ) theEObject;
            T result = caseArrayInitializerExpr( arrayInitializerExpr );
            if( result == null ) result = caseExpression( arrayInitializerExpr );
            if( result == null ) result = caseJavaNode( arrayInitializerExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ASSIGN_EXPR: {
            AssignExpr assignExpr = ( AssignExpr ) theEObject;
            T result = caseAssignExpr( assignExpr );
            if( result == null ) result = caseExpression( assignExpr );
            if( result == null ) result = caseJavaNode( assignExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.BINARY_EXPR: {
            BinaryExpr binaryExpr = ( BinaryExpr ) theEObject;
            T result = caseBinaryExpr( binaryExpr );
            if( result == null ) result = caseExpression( binaryExpr );
            if( result == null ) result = caseJavaNode( binaryExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.BOOLEAN_LITERAL_EXPR: {
            BooleanLiteralExpr booleanLiteralExpr = ( BooleanLiteralExpr ) theEObject;
            T result = caseBooleanLiteralExpr( booleanLiteralExpr );
            if( result == null ) result = caseLiteralExpr( booleanLiteralExpr );
            if( result == null ) result = caseExpression( booleanLiteralExpr );
            if( result == null ) result = caseJavaNode( booleanLiteralExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.CAST_EXPR: {
            CastExpr castExpr = ( CastExpr ) theEObject;
            T result = caseCastExpr( castExpr );
            if( result == null ) result = caseExpression( castExpr );
            if( result == null ) result = caseNodeWithType( castExpr );
            if( result == null ) result = caseNodeWithExpression( castExpr );
            if( result == null ) result = caseJavaNode( castExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.CHAR_LITERAL_EXPR: {
            CharLiteralExpr charLiteralExpr = ( CharLiteralExpr ) theEObject;
            T result = caseCharLiteralExpr( charLiteralExpr );
            if( result == null ) result = caseLiteralStringValueExpr( charLiteralExpr );
            if( result == null ) result = caseLiteralExpr( charLiteralExpr );
            if( result == null ) result = caseExpression( charLiteralExpr );
            if( result == null ) result = caseJavaNode( charLiteralExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.CLASS_EXPR: {
            ClassExpr classExpr = ( ClassExpr ) theEObject;
            T result = caseClassExpr( classExpr );
            if( result == null ) result = caseExpression( classExpr );
            if( result == null ) result = caseNodeWithType( classExpr );
            if( result == null ) result = caseJavaNode( classExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.CONDITIONAL_EXPR: {
            ConditionalExpr conditionalExpr = ( ConditionalExpr ) theEObject;
            T result = caseConditionalExpr( conditionalExpr );
            if( result == null ) result = caseExpression( conditionalExpr );
            if( result == null ) result = caseNodeWithCondition( conditionalExpr );
            if( result == null ) result = caseJavaNode( conditionalExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.DOUBLE_LITERAL_EXPR: {
            DoubleLiteralExpr doubleLiteralExpr = ( DoubleLiteralExpr ) theEObject;
            T result = caseDoubleLiteralExpr( doubleLiteralExpr );
            if( result == null ) result = caseLiteralStringValueExpr( doubleLiteralExpr );
            if( result == null ) result = caseLiteralExpr( doubleLiteralExpr );
            if( result == null ) result = caseExpression( doubleLiteralExpr );
            if( result == null ) result = caseJavaNode( doubleLiteralExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ENCLOSED_EXPR: {
            EnclosedExpr enclosedExpr = ( EnclosedExpr ) theEObject;
            T result = caseEnclosedExpr( enclosedExpr );
            if( result == null ) result = caseExpression( enclosedExpr );
            if( result == null ) result = caseJavaNode( enclosedExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.EXPRESSION: {
            Expression expression = ( Expression ) theEObject;
            T result = caseExpression( expression );
            if( result == null ) result = caseJavaNode( expression );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.FIELD_ACCESS_EXPR: {
            FieldAccessExpr fieldAccessExpr = ( FieldAccessExpr ) theEObject;
            T result = caseFieldAccessExpr( fieldAccessExpr );
            if( result == null ) result = caseExpression( fieldAccessExpr );
            if( result == null ) result = caseNodeWithSimpleName( fieldAccessExpr );
            if( result == null ) result = caseNodeWithTypeArguments( fieldAccessExpr );
            if( result == null ) result = caseNodeWithScope( fieldAccessExpr );
            if( result == null ) result = caseJavaNode( fieldAccessExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.INSTANCE_OF_EXPR: {
            InstanceOfExpr instanceOfExpr = ( InstanceOfExpr ) theEObject;
            T result = caseInstanceOfExpr( instanceOfExpr );
            if( result == null ) result = caseExpression( instanceOfExpr );
            if( result == null ) result = caseNodeWithType( instanceOfExpr );
            if( result == null ) result = caseNodeWithExpression( instanceOfExpr );
            if( result == null ) result = caseJavaNode( instanceOfExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.INTEGER_LITERAL_EXPR: {
            IntegerLiteralExpr integerLiteralExpr = ( IntegerLiteralExpr ) theEObject;
            T result = caseIntegerLiteralExpr( integerLiteralExpr );
            if( result == null ) result = caseLiteralStringValueExpr( integerLiteralExpr );
            if( result == null ) result = caseLiteralExpr( integerLiteralExpr );
            if( result == null ) result = caseExpression( integerLiteralExpr );
            if( result == null ) result = caseJavaNode( integerLiteralExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.LAMBDA_EXPR: {
            LambdaExpr lambdaExpr = ( LambdaExpr ) theEObject;
            T result = caseLambdaExpr( lambdaExpr );
            if( result == null ) result = caseExpression( lambdaExpr );
            if( result == null ) result = caseNodeWithParameters( lambdaExpr );
            if( result == null ) result = caseJavaNode( lambdaExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.LITERAL_EXPR: {
            LiteralExpr literalExpr = ( LiteralExpr ) theEObject;
            T result = caseLiteralExpr( literalExpr );
            if( result == null ) result = caseExpression( literalExpr );
            if( result == null ) result = caseJavaNode( literalExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.LITERAL_STRING_VALUE_EXPR: {
            LiteralStringValueExpr literalStringValueExpr = ( LiteralStringValueExpr ) theEObject;
            T result = caseLiteralStringValueExpr( literalStringValueExpr );
            if( result == null ) result = caseLiteralExpr( literalStringValueExpr );
            if( result == null ) result = caseExpression( literalStringValueExpr );
            if( result == null ) result = caseJavaNode( literalStringValueExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.LONG_LITERAL_EXPR: {
            LongLiteralExpr longLiteralExpr = ( LongLiteralExpr ) theEObject;
            T result = caseLongLiteralExpr( longLiteralExpr );
            if( result == null ) result = caseLiteralStringValueExpr( longLiteralExpr );
            if( result == null ) result = caseLiteralExpr( longLiteralExpr );
            if( result == null ) result = caseExpression( longLiteralExpr );
            if( result == null ) result = caseJavaNode( longLiteralExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.MARKER_ANNOTATION_EXPR: {
            MarkerAnnotationExpr markerAnnotationExpr = ( MarkerAnnotationExpr ) theEObject;
            T result = caseMarkerAnnotationExpr( markerAnnotationExpr );
            if( result == null ) result = caseAnnotationExpr( markerAnnotationExpr );
            if( result == null ) result = caseExpression( markerAnnotationExpr );
            if( result == null ) result = caseNodeWithName( markerAnnotationExpr );
            if( result == null ) result = caseJavaNode( markerAnnotationExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.MEMBER_VALUE_PAIR: {
            MemberValuePair memberValuePair = ( MemberValuePair ) theEObject;
            T result = caseMemberValuePair( memberValuePair );
            if( result == null ) result = caseJavaNode( memberValuePair );
            if( result == null ) result = caseNodeWithSimpleName( memberValuePair );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.METHOD_CALL_EXPR: {
            MethodCallExpr methodCallExpr = ( MethodCallExpr ) theEObject;
            T result = caseMethodCallExpr( methodCallExpr );
            if( result == null ) result = caseExpression( methodCallExpr );
            if( result == null ) result = caseNodeWithTypeArguments( methodCallExpr );
            if( result == null ) result = caseNodeWithArguments( methodCallExpr );
            if( result == null ) result = caseNodeWithSimpleName( methodCallExpr );
            if( result == null ) result = caseNodeWithScope( methodCallExpr );
            if( result == null ) result = caseJavaNode( methodCallExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.METHOD_REFERENCE_EXPR: {
            MethodReferenceExpr methodReferenceExpr = ( MethodReferenceExpr ) theEObject;
            T result = caseMethodReferenceExpr( methodReferenceExpr );
            if( result == null ) result = caseExpression( methodReferenceExpr );
            if( result == null ) result = caseNodeWithTypeArguments( methodReferenceExpr );
            if( result == null ) result = caseNodeWithIdentifier( methodReferenceExpr );
            if( result == null ) result = caseNodeWithScope( methodReferenceExpr );
            if( result == null ) result = caseJavaNode( methodReferenceExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NAME: {
            Name name = ( Name ) theEObject;
            T result = caseName( name );
            if( result == null ) result = caseJavaNode( name );
            if( result == null ) result = caseNodeWithIdentifier( name );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NAME_EXPR: {
            NameExpr nameExpr = ( NameExpr ) theEObject;
            T result = caseNameExpr( nameExpr );
            if( result == null ) result = caseExpression( nameExpr );
            if( result == null ) result = caseNodeWithSimpleName( nameExpr );
            if( result == null ) result = caseJavaNode( nameExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NORMAL_ANNOTATION_EXPR: {
            NormalAnnotationExpr normalAnnotationExpr = ( NormalAnnotationExpr ) theEObject;
            T result = caseNormalAnnotationExpr( normalAnnotationExpr );
            if( result == null ) result = caseAnnotationExpr( normalAnnotationExpr );
            if( result == null ) result = caseExpression( normalAnnotationExpr );
            if( result == null ) result = caseNodeWithName( normalAnnotationExpr );
            if( result == null ) result = caseJavaNode( normalAnnotationExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NULL_LITERAL_EXPR: {
            NullLiteralExpr nullLiteralExpr = ( NullLiteralExpr ) theEObject;
            T result = caseNullLiteralExpr( nullLiteralExpr );
            if( result == null ) result = caseLiteralExpr( nullLiteralExpr );
            if( result == null ) result = caseExpression( nullLiteralExpr );
            if( result == null ) result = caseJavaNode( nullLiteralExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.OBJECT_CREATION_EXPR: {
            ObjectCreationExpr objectCreationExpr = ( ObjectCreationExpr ) theEObject;
            T result = caseObjectCreationExpr( objectCreationExpr );
            if( result == null ) result = caseExpression( objectCreationExpr );
            if( result == null ) result = caseNodeWithTypeArguments( objectCreationExpr );
            if( result == null ) result = caseNodeWithType( objectCreationExpr );
            if( result == null ) result = caseNodeWithArguments( objectCreationExpr );
            if( result == null ) result = caseNodeWithScope( objectCreationExpr );
            if( result == null ) result = caseJavaNode( objectCreationExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.PATTERN_EXPR: {
            PatternExpr patternExpr = ( PatternExpr ) theEObject;
            T result = casePatternExpr( patternExpr );
            if( result == null ) result = caseExpression( patternExpr );
            if( result == null ) result = caseNodeWithSimpleName( patternExpr );
            if( result == null ) result = caseNodeWithType( patternExpr );
            if( result == null ) result = caseJavaNode( patternExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.SIMPLE_NAME: {
            SimpleName simpleName = ( SimpleName ) theEObject;
            T result = caseSimpleName( simpleName );
            if( result == null ) result = caseJavaNode( simpleName );
            if( result == null ) result = caseNodeWithIdentifier( simpleName );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.SINGLE_MEMBER_ANNOTATION_EXPR: {
            SingleMemberAnnotationExpr singleMemberAnnotationExpr = ( SingleMemberAnnotationExpr ) theEObject;
            T result = caseSingleMemberAnnotationExpr( singleMemberAnnotationExpr );
            if( result == null ) result = caseAnnotationExpr( singleMemberAnnotationExpr );
            if( result == null ) result = caseExpression( singleMemberAnnotationExpr );
            if( result == null ) result = caseNodeWithName( singleMemberAnnotationExpr );
            if( result == null ) result = caseJavaNode( singleMemberAnnotationExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.STRING_LITERAL_EXPR: {
            StringLiteralExpr stringLiteralExpr = ( StringLiteralExpr ) theEObject;
            T result = caseStringLiteralExpr( stringLiteralExpr );
            if( result == null ) result = caseLiteralStringValueExpr( stringLiteralExpr );
            if( result == null ) result = caseLiteralExpr( stringLiteralExpr );
            if( result == null ) result = caseExpression( stringLiteralExpr );
            if( result == null ) result = caseJavaNode( stringLiteralExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.SUPER_EXPR: {
            SuperExpr superExpr = ( SuperExpr ) theEObject;
            T result = caseSuperExpr( superExpr );
            if( result == null ) result = caseExpression( superExpr );
            if( result == null ) result = caseJavaNode( superExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.SWITCH_EXPR: {
            SwitchExpr switchExpr = ( SwitchExpr ) theEObject;
            T result = caseSwitchExpr( switchExpr );
            if( result == null ) result = caseExpression( switchExpr );
            if( result == null ) result = caseSwitchNode( switchExpr );
            if( result == null ) result = caseJavaNode( switchExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.TEXT_BLOCK_LITERAL_EXPR: {
            TextBlockLiteralExpr textBlockLiteralExpr = ( TextBlockLiteralExpr ) theEObject;
            T result = caseTextBlockLiteralExpr( textBlockLiteralExpr );
            if( result == null ) result = caseLiteralStringValueExpr( textBlockLiteralExpr );
            if( result == null ) result = caseLiteralExpr( textBlockLiteralExpr );
            if( result == null ) result = caseExpression( textBlockLiteralExpr );
            if( result == null ) result = caseJavaNode( textBlockLiteralExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.THIS_EXPR: {
            ThisExpr thisExpr = ( ThisExpr ) theEObject;
            T result = caseThisExpr( thisExpr );
            if( result == null ) result = caseExpression( thisExpr );
            if( result == null ) result = caseJavaNode( thisExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.TYPE_EXPR: {
            TypeExpr typeExpr = ( TypeExpr ) theEObject;
            T result = caseTypeExpr( typeExpr );
            if( result == null ) result = caseExpression( typeExpr );
            if( result == null ) result = caseNodeWithType( typeExpr );
            if( result == null ) result = caseJavaNode( typeExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.UNARY_EXPR: {
            UnaryExpr unaryExpr = ( UnaryExpr ) theEObject;
            T result = caseUnaryExpr( unaryExpr );
            if( result == null ) result = caseExpression( unaryExpr );
            if( result == null ) result = caseNodeWithExpression( unaryExpr );
            if( result == null ) result = caseJavaNode( unaryExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.VARIABLE_DECLARATION_EXPR: {
            VariableDeclarationExpr variableDeclarationExpr = ( VariableDeclarationExpr ) theEObject;
            T result = caseVariableDeclarationExpr( variableDeclarationExpr );
            if( result == null ) result = caseExpression( variableDeclarationExpr );
            if( result == null ) result = caseNodeWithFinalModifier( variableDeclarationExpr );
            if( result == null ) result = caseNodeWithAnnotations( variableDeclarationExpr );
            if( result == null ) result = caseNodeWithVariables( variableDeclarationExpr );
            if( result == null ) result = caseJavaNode( variableDeclarationExpr );
            if( result == null ) result = caseNodeWithModifiers( variableDeclarationExpr );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.MODULE_DECLARATION: {
            ModuleDeclaration moduleDeclaration = ( ModuleDeclaration ) theEObject;
            T result = caseModuleDeclaration( moduleDeclaration );
            if( result == null ) result = caseJavaNode( moduleDeclaration );
            if( result == null ) result = caseNodeWithName( moduleDeclaration );
            if( result == null ) result = caseNodeWithAnnotations( moduleDeclaration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.MODULE_DIRECTIVE: {
            ModuleDirective moduleDirective = ( ModuleDirective ) theEObject;
            T result = caseModuleDirective( moduleDirective );
            if( result == null ) result = caseJavaNode( moduleDirective );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.MODULE_EXPORTS_DIRECTIVE: {
            ModuleExportsDirective moduleExportsDirective = ( ModuleExportsDirective ) theEObject;
            T result = caseModuleExportsDirective( moduleExportsDirective );
            if( result == null ) result = caseModuleDirective( moduleExportsDirective );
            if( result == null ) result = caseNodeWithName( moduleExportsDirective );
            if( result == null ) result = caseJavaNode( moduleExportsDirective );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.MODULE_OPENS_DIRECTIVE: {
            ModuleOpensDirective moduleOpensDirective = ( ModuleOpensDirective ) theEObject;
            T result = caseModuleOpensDirective( moduleOpensDirective );
            if( result == null ) result = caseModuleDirective( moduleOpensDirective );
            if( result == null ) result = caseNodeWithName( moduleOpensDirective );
            if( result == null ) result = caseJavaNode( moduleOpensDirective );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.MODULE_PROVIDES_DIRECTIVE: {
            ModuleProvidesDirective moduleProvidesDirective = ( ModuleProvidesDirective ) theEObject;
            T result = caseModuleProvidesDirective( moduleProvidesDirective );
            if( result == null ) result = caseModuleDirective( moduleProvidesDirective );
            if( result == null ) result = caseNodeWithName( moduleProvidesDirective );
            if( result == null ) result = caseJavaNode( moduleProvidesDirective );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.MODULE_REQUIRES_DIRECTIVE: {
            ModuleRequiresDirective moduleRequiresDirective = ( ModuleRequiresDirective ) theEObject;
            T result = caseModuleRequiresDirective( moduleRequiresDirective );
            if( result == null ) result = caseModuleDirective( moduleRequiresDirective );
            if( result == null ) result = caseNodeWithStaticModifier( moduleRequiresDirective );
            if( result == null ) result = caseNodeWithName( moduleRequiresDirective );
            if( result == null ) result = caseNodeWithTransitiveModifier( moduleRequiresDirective );
            if( result == null ) result = caseJavaNode( moduleRequiresDirective );
            if( result == null ) result = caseNodeWithModifiers( moduleRequiresDirective );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.MODULE_USES_DIRECTIVE: {
            ModuleUsesDirective moduleUsesDirective = ( ModuleUsesDirective ) theEObject;
            T result = caseModuleUsesDirective( moduleUsesDirective );
            if( result == null ) result = caseModuleDirective( moduleUsesDirective );
            if( result == null ) result = caseNodeWithName( moduleUsesDirective );
            if( result == null ) result = caseJavaNode( moduleUsesDirective );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_ANNOTATIONS: {
            NodeWithAnnotations nodeWithAnnotations = ( NodeWithAnnotations ) theEObject;
            T result = caseNodeWithAnnotations( nodeWithAnnotations );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_ARGUMENTS: {
            NodeWithArguments nodeWithArguments = ( NodeWithArguments ) theEObject;
            T result = caseNodeWithArguments( nodeWithArguments );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_BLOCK_STMT: {
            NodeWithBlockStmt nodeWithBlockStmt = ( NodeWithBlockStmt ) theEObject;
            T result = caseNodeWithBlockStmt( nodeWithBlockStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_BODY: {
            NodeWithBody nodeWithBody = ( NodeWithBody ) theEObject;
            T result = caseNodeWithBody( nodeWithBody );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_CONDITION: {
            NodeWithCondition nodeWithCondition = ( NodeWithCondition ) theEObject;
            T result = caseNodeWithCondition( nodeWithCondition );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_EXPRESSION: {
            NodeWithExpression nodeWithExpression = ( NodeWithExpression ) theEObject;
            T result = caseNodeWithExpression( nodeWithExpression );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_EXTENDS: {
            NodeWithExtends nodeWithExtends = ( NodeWithExtends ) theEObject;
            T result = caseNodeWithExtends( nodeWithExtends );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_IDENTIFIER: {
            NodeWithIdentifier nodeWithIdentifier = ( NodeWithIdentifier ) theEObject;
            T result = caseNodeWithIdentifier( nodeWithIdentifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_IMPLEMENTS: {
            NodeWithImplements nodeWithImplements = ( NodeWithImplements ) theEObject;
            T result = caseNodeWithImplements( nodeWithImplements );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_JAVADOC: {
            NodeWithJavadoc nodeWithJavadoc = ( NodeWithJavadoc ) theEObject;
            T result = caseNodeWithJavadoc( nodeWithJavadoc );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_MEMBERS: {
            NodeWithMembers nodeWithMembers = ( NodeWithMembers ) theEObject;
            T result = caseNodeWithMembers( nodeWithMembers );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_MODIFIERS: {
            NodeWithModifiers nodeWithModifiers = ( NodeWithModifiers ) theEObject;
            T result = caseNodeWithModifiers( nodeWithModifiers );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_NAME: {
            NodeWithName nodeWithName = ( NodeWithName ) theEObject;
            T result = caseNodeWithName( nodeWithName );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_LABEL: {
            NodeWithLabel nodeWithLabel = ( NodeWithLabel ) theEObject;
            T result = caseNodeWithLabel( nodeWithLabel );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_PARAMETERS: {
            NodeWithParameters nodeWithParameters = ( NodeWithParameters ) theEObject;
            T result = caseNodeWithParameters( nodeWithParameters );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_RANGE: {
            NodeWithRange nodeWithRange = ( NodeWithRange ) theEObject;
            T result = caseNodeWithRange( nodeWithRange );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_SCOPE: {
            NodeWithScope< ? > nodeWithScope = ( NodeWithScope< ? > ) theEObject;
            T result = caseNodeWithScope( nodeWithScope );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_SIMPLE_NAME: {
            NodeWithSimpleName nodeWithSimpleName = ( NodeWithSimpleName ) theEObject;
            T result = caseNodeWithSimpleName( nodeWithSimpleName );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_STATEMENTS: {
            NodeWithStatements nodeWithStatements = ( NodeWithStatements ) theEObject;
            T result = caseNodeWithStatements( nodeWithStatements );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_THROWN_EXCEPTIONS: {
            NodeWithThrownExceptions nodeWithThrownExceptions = ( NodeWithThrownExceptions ) theEObject;
            T result = caseNodeWithThrownExceptions( nodeWithThrownExceptions );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_TOKEN_RANGE: {
            NodeWithTokenRange nodeWithTokenRange = ( NodeWithTokenRange ) theEObject;
            T result = caseNodeWithTokenRange( nodeWithTokenRange );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_TYPE: {
            NodeWithType< ? > nodeWithType = ( NodeWithType< ? > ) theEObject;
            T result = caseNodeWithType( nodeWithType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_TYPE_ARGUMENTS: {
            NodeWithTypeArguments nodeWithTypeArguments = ( NodeWithTypeArguments ) theEObject;
            T result = caseNodeWithTypeArguments( nodeWithTypeArguments );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_TYPE_PARAMETERS: {
            NodeWithTypeParameters nodeWithTypeParameters = ( NodeWithTypeParameters ) theEObject;
            T result = caseNodeWithTypeParameters( nodeWithTypeParameters );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_VARIABLES: {
            NodeWithVariables nodeWithVariables = ( NodeWithVariables ) theEObject;
            T result = caseNodeWithVariables( nodeWithVariables );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.SWITCH_NODE: {
            SwitchNode switchNode = ( SwitchNode ) theEObject;
            T result = caseSwitchNode( switchNode );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_ABSTRACT_MODIFIER: {
            NodeWithAbstractModifier nodeWithAbstractModifier = ( NodeWithAbstractModifier ) theEObject;
            T result = caseNodeWithAbstractModifier( nodeWithAbstractModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithAbstractModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_ACCESS_MODIFIERS: {
            NodeWithAccessModifiers nodeWithAccessModifiers = ( NodeWithAccessModifiers ) theEObject;
            T result = caseNodeWithAccessModifiers( nodeWithAccessModifiers );
            if( result == null ) result = caseNodeWithPublicModifier( nodeWithAccessModifiers );
            if( result == null ) result = caseNodeWithPrivateModifier( nodeWithAccessModifiers );
            if( result == null ) result = caseNodeWithProtectedModifier( nodeWithAccessModifiers );
            if( result == null ) result = caseNodeWithModifiers( nodeWithAccessModifiers );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_DEFAULT_MODIFIER: {
            NodeWithDefaultModifier nodeWithDefaultModifier = ( NodeWithDefaultModifier ) theEObject;
            T result = caseNodeWithDefaultModifier( nodeWithDefaultModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithDefaultModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_FINAL_MODIFIER: {
            NodeWithFinalModifier nodeWithFinalModifier = ( NodeWithFinalModifier ) theEObject;
            T result = caseNodeWithFinalModifier( nodeWithFinalModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithFinalModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_NATIVE_MODIFIER: {
            NodeWithNativeModifier nodeWithNativeModifier = ( NodeWithNativeModifier ) theEObject;
            T result = caseNodeWithNativeModifier( nodeWithNativeModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithNativeModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_PRIVATE_MODIFIER: {
            NodeWithPrivateModifier nodeWithPrivateModifier = ( NodeWithPrivateModifier ) theEObject;
            T result = caseNodeWithPrivateModifier( nodeWithPrivateModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithPrivateModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_PROTECTED_MODIFIER: {
            NodeWithProtectedModifier nodeWithProtectedModifier = ( NodeWithProtectedModifier ) theEObject;
            T result = caseNodeWithProtectedModifier( nodeWithProtectedModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithProtectedModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_PUBLIC_MODIFIER: {
            NodeWithPublicModifier nodeWithPublicModifier = ( NodeWithPublicModifier ) theEObject;
            T result = caseNodeWithPublicModifier( nodeWithPublicModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithPublicModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_STATIC_MODIFIER: {
            NodeWithStaticModifier nodeWithStaticModifier = ( NodeWithStaticModifier ) theEObject;
            T result = caseNodeWithStaticModifier( nodeWithStaticModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithStaticModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_SYNCHRONIZED_MODIFIER: {
            NodeWithSynchronizedModifier nodeWithSynchronizedModifier = ( NodeWithSynchronizedModifier ) theEObject;
            T result = caseNodeWithSynchronizedModifier( nodeWithSynchronizedModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithSynchronizedModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_STRICTFP_MODIFIER: {
            NodeWithStrictfpModifier nodeWithStrictfpModifier = ( NodeWithStrictfpModifier ) theEObject;
            T result = caseNodeWithStrictfpModifier( nodeWithStrictfpModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithStrictfpModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_TRANSIENT_MODIFIER: {
            NodeWithTransientModifier nodeWithTransientModifier = ( NodeWithTransientModifier ) theEObject;
            T result = caseNodeWithTransientModifier( nodeWithTransientModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithTransientModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_TRANSITIVE_MODIFIER: {
            NodeWithTransitiveModifier nodeWithTransitiveModifier = ( NodeWithTransitiveModifier ) theEObject;
            T result = caseNodeWithTransitiveModifier( nodeWithTransitiveModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithTransitiveModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.NODE_WITH_VOLATILE_MODIFIER: {
            NodeWithVolatileModifier nodeWithVolatileModifier = ( NodeWithVolatileModifier ) theEObject;
            T result = caseNodeWithVolatileModifier( nodeWithVolatileModifier );
            if( result == null ) result = caseNodeWithModifiers( nodeWithVolatileModifier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ASSERT_STMT: {
            AssertStmt assertStmt = ( AssertStmt ) theEObject;
            T result = caseAssertStmt( assertStmt );
            if( result == null ) result = caseStatement( assertStmt );
            if( result == null ) result = caseJavaNode( assertStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.BLOCK_STMT: {
            BlockStmt blockStmt = ( BlockStmt ) theEObject;
            T result = caseBlockStmt( blockStmt );
            if( result == null ) result = caseStatement( blockStmt );
            if( result == null ) result = caseNodeWithStatements( blockStmt );
            if( result == null ) result = caseJavaNode( blockStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.BREAK_STMT: {
            BreakStmt breakStmt = ( BreakStmt ) theEObject;
            T result = caseBreakStmt( breakStmt );
            if( result == null ) result = caseStatement( breakStmt );
            if( result == null ) result = caseNodeWithLabel( breakStmt );
            if( result == null ) result = caseJavaNode( breakStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.CATCH_CLAUSE: {
            CatchClause catchClause = ( CatchClause ) theEObject;
            T result = caseCatchClause( catchClause );
            if( result == null ) result = caseJavaNode( catchClause );
            if( result == null ) result = caseNodeWithBlockStmt( catchClause );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.CONTINUE_STMT: {
            ContinueStmt continueStmt = ( ContinueStmt ) theEObject;
            T result = caseContinueStmt( continueStmt );
            if( result == null ) result = caseStatement( continueStmt );
            if( result == null ) result = caseNodeWithLabel( continueStmt );
            if( result == null ) result = caseJavaNode( continueStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.DO_STMT: {
            DoStmt doStmt = ( DoStmt ) theEObject;
            T result = caseDoStmt( doStmt );
            if( result == null ) result = caseStatement( doStmt );
            if( result == null ) result = caseNodeWithBody( doStmt );
            if( result == null ) result = caseNodeWithCondition( doStmt );
            if( result == null ) result = caseJavaNode( doStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.EMPTY_STMT: {
            EmptyStmt emptyStmt = ( EmptyStmt ) theEObject;
            T result = caseEmptyStmt( emptyStmt );
            if( result == null ) result = caseStatement( emptyStmt );
            if( result == null ) result = caseJavaNode( emptyStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT: {
            ExplicitConstructorInvocationStmt explicitConstructorInvocationStmt = ( ExplicitConstructorInvocationStmt ) theEObject;
            T result = caseExplicitConstructorInvocationStmt( explicitConstructorInvocationStmt );
            if( result == null ) result = caseStatement( explicitConstructorInvocationStmt );
            if( result == null ) result = caseNodeWithTypeArguments( explicitConstructorInvocationStmt );
            if( result == null ) result = caseNodeWithArguments( explicitConstructorInvocationStmt );
            if( result == null ) result = caseNodeWithExpression( explicitConstructorInvocationStmt );
            if( result == null ) result = caseJavaNode( explicitConstructorInvocationStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.EXPRESSION_STMT: {
            ExpressionStmt expressionStmt = ( ExpressionStmt ) theEObject;
            T result = caseExpressionStmt( expressionStmt );
            if( result == null ) result = caseStatement( expressionStmt );
            if( result == null ) result = caseNodeWithExpression( expressionStmt );
            if( result == null ) result = caseJavaNode( expressionStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.FOR_EACH_STMT: {
            ForEachStmt forEachStmt = ( ForEachStmt ) theEObject;
            T result = caseForEachStmt( forEachStmt );
            if( result == null ) result = caseStatement( forEachStmt );
            if( result == null ) result = caseNodeWithBody( forEachStmt );
            if( result == null ) result = caseJavaNode( forEachStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.FOR_STMT: {
            ForStmt forStmt = ( ForStmt ) theEObject;
            T result = caseForStmt( forStmt );
            if( result == null ) result = caseStatement( forStmt );
            if( result == null ) result = caseNodeWithBody( forStmt );
            if( result == null ) result = caseJavaNode( forStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.IF_STMT: {
            IfStmt ifStmt = ( IfStmt ) theEObject;
            T result = caseIfStmt( ifStmt );
            if( result == null ) result = caseStatement( ifStmt );
            if( result == null ) result = caseNodeWithCondition( ifStmt );
            if( result == null ) result = caseJavaNode( ifStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.LABELED_STMT: {
            LabeledStmt labeledStmt = ( LabeledStmt ) theEObject;
            T result = caseLabeledStmt( labeledStmt );
            if( result == null ) result = caseStatement( labeledStmt );
            if( result == null ) result = caseNodeWithLabel( labeledStmt );
            if( result == null ) result = caseJavaNode( labeledStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.LOCAL_CLASS_DECLARATION_STMT: {
            LocalClassDeclarationStmt localClassDeclarationStmt = ( LocalClassDeclarationStmt ) theEObject;
            T result = caseLocalClassDeclarationStmt( localClassDeclarationStmt );
            if( result == null ) result = caseStatement( localClassDeclarationStmt );
            if( result == null ) result = caseJavaNode( localClassDeclarationStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.RETURN_STMT: {
            ReturnStmt returnStmt = ( ReturnStmt ) theEObject;
            T result = caseReturnStmt( returnStmt );
            if( result == null ) result = caseStatement( returnStmt );
            if( result == null ) result = caseNodeWithExpression( returnStmt );
            if( result == null ) result = caseJavaNode( returnStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.STATEMENT: {
            Statement statement = ( Statement ) theEObject;
            T result = caseStatement( statement );
            if( result == null ) result = caseJavaNode( statement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.SWITCH_ENTRY: {
            SwitchEntry switchEntry = ( SwitchEntry ) theEObject;
            T result = caseSwitchEntry( switchEntry );
            if( result == null ) result = caseJavaNode( switchEntry );
            if( result == null ) result = caseNodeWithStatements( switchEntry );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.SWITCH_STMT: {
            SwitchStmt switchStmt = ( SwitchStmt ) theEObject;
            T result = caseSwitchStmt( switchStmt );
            if( result == null ) result = caseStatement( switchStmt );
            if( result == null ) result = caseSwitchNode( switchStmt );
            if( result == null ) result = caseJavaNode( switchStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.SYNCHRONIZED_STMT: {
            SynchronizedStmt synchronizedStmt = ( SynchronizedStmt ) theEObject;
            T result = caseSynchronizedStmt( synchronizedStmt );
            if( result == null ) result = caseStatement( synchronizedStmt );
            if( result == null ) result = caseNodeWithBlockStmt( synchronizedStmt );
            if( result == null ) result = caseNodeWithExpression( synchronizedStmt );
            if( result == null ) result = caseJavaNode( synchronizedStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.THROW_STMT: {
            ThrowStmt throwStmt = ( ThrowStmt ) theEObject;
            T result = caseThrowStmt( throwStmt );
            if( result == null ) result = caseStatement( throwStmt );
            if( result == null ) result = caseNodeWithExpression( throwStmt );
            if( result == null ) result = caseJavaNode( throwStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.TRY_STMT: {
            TryStmt tryStmt = ( TryStmt ) theEObject;
            T result = caseTryStmt( tryStmt );
            if( result == null ) result = caseStatement( tryStmt );
            if( result == null ) result = caseJavaNode( tryStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.WHILE_STMT: {
            WhileStmt whileStmt = ( WhileStmt ) theEObject;
            T result = caseWhileStmt( whileStmt );
            if( result == null ) result = caseStatement( whileStmt );
            if( result == null ) result = caseNodeWithBody( whileStmt );
            if( result == null ) result = caseNodeWithCondition( whileStmt );
            if( result == null ) result = caseJavaNode( whileStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.YIELD_STMT: {
            YieldStmt yieldStmt = ( YieldStmt ) theEObject;
            T result = caseYieldStmt( yieldStmt );
            if( result == null ) result = caseStatement( yieldStmt );
            if( result == null ) result = caseNodeWithExpression( yieldStmt );
            if( result == null ) result = caseJavaNode( yieldStmt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.ARRAY_TYPE: {
            ArrayType arrayType = ( ArrayType ) theEObject;
            T result = caseArrayType( arrayType );
            if( result == null ) result = caseReferenceType( arrayType );
            if( result == null ) result = caseNodeWithAnnotations( arrayType );
            if( result == null ) result = caseType( arrayType );
            if( result == null ) result = caseJavaNode( arrayType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.CLASS_OR_INTERFACE_TYPE: {
            ClassOrInterfaceType classOrInterfaceType = ( ClassOrInterfaceType ) theEObject;
            T result = caseClassOrInterfaceType( classOrInterfaceType );
            if( result == null ) result = caseReferenceType( classOrInterfaceType );
            if( result == null ) result = caseNodeWithSimpleName( classOrInterfaceType );
            if( result == null ) result = caseNodeWithAnnotations( classOrInterfaceType );
            if( result == null ) result = caseNodeWithTypeArguments( classOrInterfaceType );
            if( result == null ) result = caseNodeWithScope( classOrInterfaceType );
            if( result == null ) result = caseType( classOrInterfaceType );
            if( result == null ) result = caseJavaNode( classOrInterfaceType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.INTERSECTION_TYPE: {
            IntersectionType intersectionType = ( IntersectionType ) theEObject;
            T result = caseIntersectionType( intersectionType );
            if( result == null ) result = caseType( intersectionType );
            if( result == null ) result = caseNodeWithAnnotations( intersectionType );
            if( result == null ) result = caseJavaNode( intersectionType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.PRIMITIVE_TYPE: {
            PrimitiveType primitiveType = ( PrimitiveType ) theEObject;
            T result = casePrimitiveType( primitiveType );
            if( result == null ) result = caseType( primitiveType );
            if( result == null ) result = caseNodeWithAnnotations( primitiveType );
            if( result == null ) result = caseJavaNode( primitiveType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.REFERENCE_TYPE: {
            ReferenceType referenceType = ( ReferenceType ) theEObject;
            T result = caseReferenceType( referenceType );
            if( result == null ) result = caseType( referenceType );
            if( result == null ) result = caseJavaNode( referenceType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.TYPE: {
            Type type = ( Type ) theEObject;
            T result = caseType( type );
            if( result == null ) result = caseJavaNode( type );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.TYPE_PARAMETER: {
            TypeParameter typeParameter = ( TypeParameter ) theEObject;
            T result = caseTypeParameter( typeParameter );
            if( result == null ) result = caseReferenceType( typeParameter );
            if( result == null ) result = caseNodeWithSimpleName( typeParameter );
            if( result == null ) result = caseNodeWithAnnotations( typeParameter );
            if( result == null ) result = caseType( typeParameter );
            if( result == null ) result = caseJavaNode( typeParameter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.UNION_TYPE: {
            UnionType unionType = ( UnionType ) theEObject;
            T result = caseUnionType( unionType );
            if( result == null ) result = caseType( unionType );
            if( result == null ) result = caseNodeWithAnnotations( unionType );
            if( result == null ) result = caseJavaNode( unionType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.UNKNOWN_TYPE: {
            UnknownType unknownType = ( UnknownType ) theEObject;
            T result = caseUnknownType( unknownType );
            if( result == null ) result = caseType( unknownType );
            if( result == null ) result = caseJavaNode( unknownType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.VAR_TYPE: {
            VarType varType = ( VarType ) theEObject;
            T result = caseVarType( varType );
            if( result == null ) result = caseType( varType );
            if( result == null ) result = caseJavaNode( varType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.VOID_TYPE: {
            VoidType voidType = ( VoidType ) theEObject;
            T result = caseVoidType( voidType );
            if( result == null ) result = caseType( voidType );
            if( result == null ) result = caseNodeWithAnnotations( voidType );
            if( result == null ) result = caseJavaNode( voidType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.WILDCARD_TYPE: {
            WildcardType wildcardType = ( WildcardType ) theEObject;
            T result = caseWildcardType( wildcardType );
            if( result == null ) result = caseType( wildcardType );
            if( result == null ) result = caseNodeWithAnnotations( wildcardType );
            if( result == null ) result = caseJavaNode( wildcardType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case JavaPackage.JAVA_PARSER_OBJECT: {
            Node javaParserObject = ( Node ) theEObject;
            T result = caseJavaParserObject( javaParserObject );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        default:
            return defaultCase( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJavaNode( JavaNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Creation Level</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Creation Level</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayCreationLevel( ArrayCreationLevel object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompilationUnit( CompilationUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Import Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Import Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImportDeclaration( ImportDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePackageDeclaration( PackageDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotation Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotation Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotationDeclaration( AnnotationDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotation Member Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotation Member Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotationMemberDeclaration( AnnotationMemberDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Body Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Body Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBodyDeclaration( BodyDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Callable Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Callable Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCallableDeclaration( CallableDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Class Or Interface Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Class Or Interface Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassOrInterfaceDeclaration( ClassOrInterfaceDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstructorDeclaration( ConstructorDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enum Constant Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enum Constant Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumConstantDeclaration( EnumConstantDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enum Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enum Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumDeclaration( EnumDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFieldDeclaration( FieldDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Initializer Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Initializer Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInitializerDeclaration( InitializerDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMethodDeclaration( MethodDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameter( Parameter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Receiver Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Receiver Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReceiverParameter( ReceiverParameter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeDeclaration( TypeDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable Declarator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Declarator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableDeclarator( VariableDeclarator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Block Comment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Block Comment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBlockComment( BlockComment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComment( Comment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Javadoc Comment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Javadoc Comment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJavadocComment( JavadocComment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Line Comment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Line Comment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLineComment( LineComment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotation Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotation Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotationExpr( AnnotationExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Access Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Access Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayAccessExpr( ArrayAccessExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Creation Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Creation Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayCreationExpr( ArrayCreationExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Initializer Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Initializer Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayInitializerExpr( ArrayInitializerExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assign Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assign Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignExpr( AssignExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBinaryExpr( BinaryExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Boolean Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boolean Literal Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBooleanLiteralExpr( BooleanLiteralExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cast Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cast Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCastExpr( CastExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Char Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Char Literal Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCharLiteralExpr( CharLiteralExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Class Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Class Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassExpr( ClassExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conditional Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conditional Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConditionalExpr( ConditionalExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Double Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Double Literal Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDoubleLiteralExpr( DoubleLiteralExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enclosed Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enclosed Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnclosedExpr( EnclosedExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExpression( Expression object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Field Access Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Field Access Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFieldAccessExpr( FieldAccessExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instance Of Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instance Of Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstanceOfExpr( InstanceOfExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Integer Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Literal Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntegerLiteralExpr( IntegerLiteralExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lambda Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lambda Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLambdaExpr( LambdaExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Literal Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLiteralExpr( LiteralExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Literal String Value Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Literal String Value Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLiteralStringValueExpr( LiteralStringValueExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Long Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Long Literal Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLongLiteralExpr( LongLiteralExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Marker Annotation Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Marker Annotation Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMarkerAnnotationExpr( MarkerAnnotationExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Member Value Pair</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Member Value Pair</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemberValuePair( MemberValuePair object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Method Call Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Method Call Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMethodCallExpr( MethodCallExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Method Reference Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Method Reference Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMethodReferenceExpr( MethodReferenceExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseName( Name object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Name Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Name Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNameExpr( NameExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Normal Annotation Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Normal Annotation Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNormalAnnotationExpr( NormalAnnotationExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Null Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Null Literal Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNullLiteralExpr( NullLiteralExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object Creation Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object Creation Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObjectCreationExpr( ObjectCreationExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pattern Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pattern Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePatternExpr( PatternExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Name</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleName( SimpleName object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Single Member Annotation Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Single Member Annotation Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSingleMemberAnnotationExpr( SingleMemberAnnotationExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Literal Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringLiteralExpr( StringLiteralExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Super Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Super Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSuperExpr( SuperExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchExpr( SwitchExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text Block Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text Block Literal Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextBlockLiteralExpr( TextBlockLiteralExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>This Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>This Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseThisExpr( ThisExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeExpr( TypeExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnaryExpr( UnaryExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Expr</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Declaration Expr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableDeclarationExpr( VariableDeclarationExpr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModuleDeclaration( ModuleDeclaration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Directive</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Directive</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModuleDirective( ModuleDirective object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Exports Directive</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Exports Directive</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModuleExportsDirective( ModuleExportsDirective object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Opens Directive</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Opens Directive</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModuleOpensDirective( ModuleOpensDirective object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Provides Directive</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Provides Directive</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModuleProvidesDirective( ModuleProvidesDirective object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Requires Directive</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Requires Directive</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModuleRequiresDirective( ModuleRequiresDirective object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Uses Directive</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Uses Directive</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModuleUsesDirective( ModuleUsesDirective object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Annotations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Annotations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithAnnotations( NodeWithAnnotations object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Arguments</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Arguments</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithArguments( NodeWithArguments object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Block Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Block Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithBlockStmt( NodeWithBlockStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Body</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Body</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithBody( NodeWithBody object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithCondition( NodeWithCondition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithExpression( NodeWithExpression object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Extends</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Extends</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithExtends( NodeWithExtends object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Identifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithIdentifier( NodeWithIdentifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Implements</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Implements</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithImplements( NodeWithImplements object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Javadoc</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Javadoc</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithJavadoc( NodeWithJavadoc object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Members</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Members</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithMembers( NodeWithMembers object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Modifiers</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Modifiers</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithModifiers( NodeWithModifiers object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Name</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithName( NodeWithName object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Label</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Label</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithLabel( NodeWithLabel object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithParameters( NodeWithParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Range</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Range</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithRange( NodeWithRange object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Scope</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Scope</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public < ScopeType > T caseNodeWithScope( NodeWithScope< ScopeType > object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Simple Name</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Simple Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithSimpleName( NodeWithSimpleName object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Statements</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Statements</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithStatements( NodeWithStatements object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Thrown Exceptions</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Thrown Exceptions</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithThrownExceptions( NodeWithThrownExceptions object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Token Range</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Token Range</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithTokenRange( NodeWithTokenRange object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public < TypeUsed > T caseNodeWithType( NodeWithType< TypeUsed > object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Type Arguments</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Type Arguments</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithTypeArguments( NodeWithTypeArguments object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Type Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Type Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithTypeParameters( NodeWithTypeParameters object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Variables</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Variables</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithVariables( NodeWithVariables object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchNode( SwitchNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Abstract Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Abstract Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithAbstractModifier( NodeWithAbstractModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Access Modifiers</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Access Modifiers</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithAccessModifiers( NodeWithAccessModifiers object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Default Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Default Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithDefaultModifier( NodeWithDefaultModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Final Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Final Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithFinalModifier( NodeWithFinalModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Native Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Native Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithNativeModifier( NodeWithNativeModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Private Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Private Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithPrivateModifier( NodeWithPrivateModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Protected Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Protected Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithProtectedModifier( NodeWithProtectedModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Public Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Public Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithPublicModifier( NodeWithPublicModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Static Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Static Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithStaticModifier( NodeWithStaticModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Synchronized Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Synchronized Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithSynchronizedModifier( NodeWithSynchronizedModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Strictfp Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Strictfp Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithStrictfpModifier( NodeWithStrictfpModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Transient Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Transient Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithTransientModifier( NodeWithTransientModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Transitive Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Transitive Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithTransitiveModifier( NodeWithTransitiveModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node With Volatile Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node With Volatile Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeWithVolatileModifier( NodeWithVolatileModifier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assert Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assert Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssertStmt( AssertStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Block Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Block Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBlockStmt( BlockStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Break Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Break Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBreakStmt( BreakStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Catch Clause</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Catch Clause</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCatchClause( CatchClause object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Continue Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Continue Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContinueStmt( ContinueStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Do Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Do Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDoStmt( DoStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Empty Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Empty Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEmptyStmt( EmptyStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Explicit Constructor Invocation Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Explicit Constructor Invocation Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExplicitConstructorInvocationStmt( ExplicitConstructorInvocationStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Expression Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExpressionStmt( ExpressionStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>For Each Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>For Each Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseForEachStmt( ForEachStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>For Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>For Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseForStmt( ForStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>If Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>If Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIfStmt( IfStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Labeled Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Labeled Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLabeledStmt( LabeledStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Local Class Declaration Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Local Class Declaration Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalClassDeclarationStmt( LocalClassDeclarationStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Return Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Return Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReturnStmt( ReturnStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatement( Statement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Entry</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchEntry( SwitchEntry object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchStmt( SwitchStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronized Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronized Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronizedStmt( SynchronizedStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Throw Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Throw Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseThrowStmt( ThrowStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Try Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Try Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTryStmt( TryStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>While Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>While Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWhileStmt( WhileStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Yield Stmt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Yield Stmt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseYieldStmt( YieldStmt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayType( ArrayType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Class Or Interface Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Class Or Interface Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassOrInterfaceType( ClassOrInterfaceType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Intersection Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intersection Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntersectionType( IntersectionType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrimitiveType( PrimitiveType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferenceType( ReferenceType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseType( Type object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeParameter( TypeParameter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Union Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Union Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnionType( UnionType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unknown Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unknown Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnknownType( UnknownType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Var Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Var Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVarType( VarType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoidType( VoidType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wildcard Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wildcard Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWildcardType( WildcardType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parser Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parser Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJavaParserObject( Node object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase( EObject object ) {
        return null;
    }

} //JavaSwitch
