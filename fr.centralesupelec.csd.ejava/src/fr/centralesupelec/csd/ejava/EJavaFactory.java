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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.csd.ejava.EJavaPackage
 * @generated
 */
public interface EJavaFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EJavaFactory eINSTANCE = fr.centralesupelec.csd.ejava.impl.EJavaFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Array Creation Level</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Array Creation Level</em>'.
     * @generated
     */
    ArrayCreationLevel createArrayCreationLevel();

    /**
     * Returns a new object of class '<em>Compilation Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Compilation Unit</em>'.
     * @generated
     */
    CompilationUnit createCompilationUnit();

    /**
     * Returns a new object of class '<em>Import Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Import Declaration</em>'.
     * @generated
     */
    ImportDeclaration createImportDeclaration();

    /**
     * Returns a new object of class '<em>Package Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Package Declaration</em>'.
     * @generated
     */
    PackageDeclaration createPackageDeclaration();

    /**
     * Returns a new object of class '<em>Annotation Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Annotation Declaration</em>'.
     * @generated
     */
    AnnotationDeclaration createAnnotationDeclaration();

    /**
     * Returns a new object of class '<em>Annotation Member Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Annotation Member Declaration</em>'.
     * @generated
     */
    AnnotationMemberDeclaration createAnnotationMemberDeclaration();

    /**
     * Returns a new object of class '<em>Class Or Interface Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Class Or Interface Declaration</em>'.
     * @generated
     */
    ClassOrInterfaceDeclaration createClassOrInterfaceDeclaration();

    /**
     * Returns a new object of class '<em>Constructor Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constructor Declaration</em>'.
     * @generated
     */
    ConstructorDeclaration createConstructorDeclaration();

    /**
     * Returns a new object of class '<em>Enum Constant Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enum Constant Declaration</em>'.
     * @generated
     */
    EnumConstantDeclaration createEnumConstantDeclaration();

    /**
     * Returns a new object of class '<em>Enum Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enum Declaration</em>'.
     * @generated
     */
    EnumDeclaration createEnumDeclaration();

    /**
     * Returns a new object of class '<em>Field Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Field Declaration</em>'.
     * @generated
     */
    FieldDeclaration createFieldDeclaration();

    /**
     * Returns a new object of class '<em>Initializer Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Initializer Declaration</em>'.
     * @generated
     */
    InitializerDeclaration createInitializerDeclaration();

    /**
     * Returns a new object of class '<em>Method Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Method Declaration</em>'.
     * @generated
     */
    MethodDeclaration createMethodDeclaration();

    /**
     * Returns a new object of class '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter</em>'.
     * @generated
     */
    Parameter createParameter();

    /**
     * Returns a new object of class '<em>Receiver Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Receiver Parameter</em>'.
     * @generated
     */
    ReceiverParameter createReceiverParameter();

    /**
     * Returns a new object of class '<em>Variable Declarator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Declarator</em>'.
     * @generated
     */
    VariableDeclarator createVariableDeclarator();

    /**
     * Returns a new object of class '<em>Block Comment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Block Comment</em>'.
     * @generated
     */
    BlockComment createBlockComment();

    /**
     * Returns a new object of class '<em>Javadoc Comment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Javadoc Comment</em>'.
     * @generated
     */
    JavadocComment createJavadocComment();

    /**
     * Returns a new object of class '<em>Line Comment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Line Comment</em>'.
     * @generated
     */
    LineComment createLineComment();

    /**
     * Returns a new object of class '<em>Array Access Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Array Access Expr</em>'.
     * @generated
     */
    ArrayAccessExpr createArrayAccessExpr();

    /**
     * Returns a new object of class '<em>Array Creation Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Array Creation Expr</em>'.
     * @generated
     */
    ArrayCreationExpr createArrayCreationExpr();

    /**
     * Returns a new object of class '<em>Array Initializer Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Array Initializer Expr</em>'.
     * @generated
     */
    ArrayInitializerExpr createArrayInitializerExpr();

    /**
     * Returns a new object of class '<em>Assign Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assign Expr</em>'.
     * @generated
     */
    AssignExpr createAssignExpr();

    /**
     * Returns a new object of class '<em>Binary Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Binary Expr</em>'.
     * @generated
     */
    BinaryExpr createBinaryExpr();

    /**
     * Returns a new object of class '<em>Boolean Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Boolean Literal Expr</em>'.
     * @generated
     */
    BooleanLiteralExpr createBooleanLiteralExpr();

    /**
     * Returns a new object of class '<em>Cast Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cast Expr</em>'.
     * @generated
     */
    CastExpr createCastExpr();

    /**
     * Returns a new object of class '<em>Char Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Char Literal Expr</em>'.
     * @generated
     */
    CharLiteralExpr createCharLiteralExpr();

    /**
     * Returns a new object of class '<em>Class Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Class Expr</em>'.
     * @generated
     */
    ClassExpr createClassExpr();

    /**
     * Returns a new object of class '<em>Conditional Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conditional Expr</em>'.
     * @generated
     */
    ConditionalExpr createConditionalExpr();

    /**
     * Returns a new object of class '<em>Double Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Double Literal Expr</em>'.
     * @generated
     */
    DoubleLiteralExpr createDoubleLiteralExpr();

    /**
     * Returns a new object of class '<em>Enclosed Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enclosed Expr</em>'.
     * @generated
     */
    EnclosedExpr createEnclosedExpr();

    /**
     * Returns a new object of class '<em>Field Access Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Field Access Expr</em>'.
     * @generated
     */
    FieldAccessExpr createFieldAccessExpr();

    /**
     * Returns a new object of class '<em>Instance Of Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Instance Of Expr</em>'.
     * @generated
     */
    InstanceOfExpr createInstanceOfExpr();

    /**
     * Returns a new object of class '<em>Integer Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer Literal Expr</em>'.
     * @generated
     */
    IntegerLiteralExpr createIntegerLiteralExpr();

    /**
     * Returns a new object of class '<em>Lambda Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lambda Expr</em>'.
     * @generated
     */
    LambdaExpr createLambdaExpr();

    /**
     * Returns a new object of class '<em>Long Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Long Literal Expr</em>'.
     * @generated
     */
    LongLiteralExpr createLongLiteralExpr();

    /**
     * Returns a new object of class '<em>Marker Annotation Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Marker Annotation Expr</em>'.
     * @generated
     */
    MarkerAnnotationExpr createMarkerAnnotationExpr();

    /**
     * Returns a new object of class '<em>Member Value Pair</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Member Value Pair</em>'.
     * @generated
     */
    MemberValuePair createMemberValuePair();

    /**
     * Returns a new object of class '<em>Method Call Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Method Call Expr</em>'.
     * @generated
     */
    MethodCallExpr createMethodCallExpr();

    /**
     * Returns a new object of class '<em>Method Reference Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Method Reference Expr</em>'.
     * @generated
     */
    MethodReferenceExpr createMethodReferenceExpr();

    /**
     * Returns a new object of class '<em>Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Name</em>'.
     * @generated
     */
    Name createName();

    /**
     * Returns a new object of class '<em>Name Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Name Expr</em>'.
     * @generated
     */
    NameExpr createNameExpr();

    /**
     * Returns a new object of class '<em>Normal Annotation Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Normal Annotation Expr</em>'.
     * @generated
     */
    NormalAnnotationExpr createNormalAnnotationExpr();

    /**
     * Returns a new object of class '<em>Null Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Null Literal Expr</em>'.
     * @generated
     */
    NullLiteralExpr createNullLiteralExpr();

    /**
     * Returns a new object of class '<em>Object Creation Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object Creation Expr</em>'.
     * @generated
     */
    ObjectCreationExpr createObjectCreationExpr();

    /**
     * Returns a new object of class '<em>Pattern Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pattern Expr</em>'.
     * @generated
     */
    PatternExpr createPatternExpr();

    /**
     * Returns a new object of class '<em>Simple Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Simple Name</em>'.
     * @generated
     */
    SimpleName createSimpleName();

    /**
     * Returns a new object of class '<em>Single Member Annotation Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Single Member Annotation Expr</em>'.
     * @generated
     */
    SingleMemberAnnotationExpr createSingleMemberAnnotationExpr();

    /**
     * Returns a new object of class '<em>String Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Literal Expr</em>'.
     * @generated
     */
    StringLiteralExpr createStringLiteralExpr();

    /**
     * Returns a new object of class '<em>Super Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Super Expr</em>'.
     * @generated
     */
    SuperExpr createSuperExpr();

    /**
     * Returns a new object of class '<em>Switch Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Expr</em>'.
     * @generated
     */
    SwitchExpr createSwitchExpr();

    /**
     * Returns a new object of class '<em>Text Block Literal Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Text Block Literal Expr</em>'.
     * @generated
     */
    TextBlockLiteralExpr createTextBlockLiteralExpr();

    /**
     * Returns a new object of class '<em>This Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>This Expr</em>'.
     * @generated
     */
    ThisExpr createThisExpr();

    /**
     * Returns a new object of class '<em>Type Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Expr</em>'.
     * @generated
     */
    TypeExpr createTypeExpr();

    /**
     * Returns a new object of class '<em>Unary Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unary Expr</em>'.
     * @generated
     */
    UnaryExpr createUnaryExpr();

    /**
     * Returns a new object of class '<em>Variable Declaration Expr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Declaration Expr</em>'.
     * @generated
     */
    VariableDeclarationExpr createVariableDeclarationExpr();

    /**
     * Returns a new object of class '<em>Module Declaration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Module Declaration</em>'.
     * @generated
     */
    ModuleDeclaration createModuleDeclaration();

    /**
     * Returns a new object of class '<em>Module Exports Directive</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Module Exports Directive</em>'.
     * @generated
     */
    ModuleExportsDirective createModuleExportsDirective();

    /**
     * Returns a new object of class '<em>Module Opens Directive</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Module Opens Directive</em>'.
     * @generated
     */
    ModuleOpensDirective createModuleOpensDirective();

    /**
     * Returns a new object of class '<em>Module Provides Directive</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Module Provides Directive</em>'.
     * @generated
     */
    ModuleProvidesDirective createModuleProvidesDirective();

    /**
     * Returns a new object of class '<em>Module Requires Directive</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Module Requires Directive</em>'.
     * @generated
     */
    ModuleRequiresDirective createModuleRequiresDirective();

    /**
     * Returns a new object of class '<em>Module Uses Directive</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Module Uses Directive</em>'.
     * @generated
     */
    ModuleUsesDirective createModuleUsesDirective();

    /**
     * Returns a new object of class '<em>Assert Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assert Stmt</em>'.
     * @generated
     */
    AssertStmt createAssertStmt();

    /**
     * Returns a new object of class '<em>Block Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Block Stmt</em>'.
     * @generated
     */
    BlockStmt createBlockStmt();

    /**
     * Returns a new object of class '<em>Break Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Break Stmt</em>'.
     * @generated
     */
    BreakStmt createBreakStmt();

    /**
     * Returns a new object of class '<em>Catch Clause</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Catch Clause</em>'.
     * @generated
     */
    CatchClause createCatchClause();

    /**
     * Returns a new object of class '<em>Continue Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Continue Stmt</em>'.
     * @generated
     */
    ContinueStmt createContinueStmt();

    /**
     * Returns a new object of class '<em>Do Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Do Stmt</em>'.
     * @generated
     */
    DoStmt createDoStmt();

    /**
     * Returns a new object of class '<em>Empty Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Empty Stmt</em>'.
     * @generated
     */
    EmptyStmt createEmptyStmt();

    /**
     * Returns a new object of class '<em>Explicit Constructor Invocation Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Explicit Constructor Invocation Stmt</em>'.
     * @generated
     */
    ExplicitConstructorInvocationStmt createExplicitConstructorInvocationStmt();

    /**
     * Returns a new object of class '<em>Expression Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Expression Stmt</em>'.
     * @generated
     */
    ExpressionStmt createExpressionStmt();

    /**
     * Returns a new object of class '<em>For Each Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>For Each Stmt</em>'.
     * @generated
     */
    ForEachStmt createForEachStmt();

    /**
     * Returns a new object of class '<em>For Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>For Stmt</em>'.
     * @generated
     */
    ForStmt createForStmt();

    /**
     * Returns a new object of class '<em>If Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>If Stmt</em>'.
     * @generated
     */
    IfStmt createIfStmt();

    /**
     * Returns a new object of class '<em>Labeled Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Labeled Stmt</em>'.
     * @generated
     */
    LabeledStmt createLabeledStmt();

    /**
     * Returns a new object of class '<em>Local Class Declaration Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Local Class Declaration Stmt</em>'.
     * @generated
     */
    LocalClassDeclarationStmt createLocalClassDeclarationStmt();

    /**
     * Returns a new object of class '<em>Return Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Return Stmt</em>'.
     * @generated
     */
    ReturnStmt createReturnStmt();

    /**
     * Returns a new object of class '<em>Statement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Statement</em>'.
     * @generated
     */
    Statement createStatement();

    /**
     * Returns a new object of class '<em>Switch Entry</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Entry</em>'.
     * @generated
     */
    SwitchEntry createSwitchEntry();

    /**
     * Returns a new object of class '<em>Switch Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Stmt</em>'.
     * @generated
     */
    SwitchStmt createSwitchStmt();

    /**
     * Returns a new object of class '<em>Synchronized Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronized Stmt</em>'.
     * @generated
     */
    SynchronizedStmt createSynchronizedStmt();

    /**
     * Returns a new object of class '<em>Throw Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Throw Stmt</em>'.
     * @generated
     */
    ThrowStmt createThrowStmt();

    /**
     * Returns a new object of class '<em>Try Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Try Stmt</em>'.
     * @generated
     */
    TryStmt createTryStmt();

    /**
     * Returns a new object of class '<em>While Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>While Stmt</em>'.
     * @generated
     */
    WhileStmt createWhileStmt();

    /**
     * Returns a new object of class '<em>Yield Stmt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Yield Stmt</em>'.
     * @generated
     */
    YieldStmt createYieldStmt();

    /**
     * Returns a new object of class '<em>Array Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Array Type</em>'.
     * @generated
     */
    ArrayType createArrayType();

    /**
     * Returns a new object of class '<em>Class Or Interface Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Class Or Interface Type</em>'.
     * @generated
     */
    ClassOrInterfaceType createClassOrInterfaceType();

    /**
     * Returns a new object of class '<em>Intersection Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Intersection Type</em>'.
     * @generated
     */
    IntersectionType createIntersectionType();

    /**
     * Returns a new object of class '<em>Primitive Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Primitive Type</em>'.
     * @generated
     */
    PrimitiveType createPrimitiveType();

    /**
     * Returns a new object of class '<em>Type Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Parameter</em>'.
     * @generated
     */
    TypeParameter createTypeParameter();

    /**
     * Returns a new object of class '<em>Union Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Union Type</em>'.
     * @generated
     */
    UnionType createUnionType();

    /**
     * Returns a new object of class '<em>Unknown Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unknown Type</em>'.
     * @generated
     */
    UnknownType createUnknownType();

    /**
     * Returns a new object of class '<em>Var Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Var Type</em>'.
     * @generated
     */
    VarType createVarType();

    /**
     * Returns a new object of class '<em>Void Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Void Type</em>'.
     * @generated
     */
    VoidType createVoidType();

    /**
     * Returns a new object of class '<em>Wildcard Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wildcard Type</em>'.
     * @generated
     */
    WildcardType createWildcardType();

    /**
     * Returns a new object of class '<em>Project</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Project</em>'.
     * @generated
     */
    Project createProject();

    /**
     * Returns a new object of class '<em>Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Package</em>'.
     * @generated
     */
    Package createPackage();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    EJavaPackage getEJavaPackage();

} //EJavaFactory
