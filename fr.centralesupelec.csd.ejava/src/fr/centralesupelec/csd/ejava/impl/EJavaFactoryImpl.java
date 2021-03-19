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
package fr.centralesupelec.csd.ejava.impl;

import fr.centralesupelec.csd.ejava.AnnotationDeclaration;
import fr.centralesupelec.csd.ejava.AnnotationMemberDeclaration;
import fr.centralesupelec.csd.ejava.ArrayAccessExpr;
import fr.centralesupelec.csd.ejava.ArrayCreationExpr;
import fr.centralesupelec.csd.ejava.ArrayCreationLevel;
import fr.centralesupelec.csd.ejava.ArrayInitializerExpr;
import fr.centralesupelec.csd.ejava.ArrayType;
import fr.centralesupelec.csd.ejava.ArrayTypeOrigin;
import fr.centralesupelec.csd.ejava.AssertStmt;
import fr.centralesupelec.csd.ejava.AssignExpr;
import fr.centralesupelec.csd.ejava.AssignOperator;
import fr.centralesupelec.csd.ejava.BinaryExpr;
import fr.centralesupelec.csd.ejava.BinaryOperator;
import fr.centralesupelec.csd.ejava.BlockComment;
import fr.centralesupelec.csd.ejava.BlockStmt;
import fr.centralesupelec.csd.ejava.BooleanLiteralExpr;
import fr.centralesupelec.csd.ejava.BreakStmt;
import fr.centralesupelec.csd.ejava.CastExpr;
import fr.centralesupelec.csd.ejava.CatchClause;
import fr.centralesupelec.csd.ejava.CharLiteralExpr;
import fr.centralesupelec.csd.ejava.ClassExpr;
import fr.centralesupelec.csd.ejava.ClassOrInterfaceDeclaration;
import fr.centralesupelec.csd.ejava.ClassOrInterfaceType;
import fr.centralesupelec.csd.ejava.CompilationUnit;
import fr.centralesupelec.csd.ejava.ConditionalExpr;
import fr.centralesupelec.csd.ejava.ConstructorDeclaration;
import fr.centralesupelec.csd.ejava.ContinueStmt;
import fr.centralesupelec.csd.ejava.DoStmt;
import fr.centralesupelec.csd.ejava.DoubleLiteralExpr;
import fr.centralesupelec.csd.ejava.EJavaFactory;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.EmptyStmt;
import fr.centralesupelec.csd.ejava.EnclosedExpr;
import fr.centralesupelec.csd.ejava.EnumConstantDeclaration;
import fr.centralesupelec.csd.ejava.EnumDeclaration;
import fr.centralesupelec.csd.ejava.ExplicitConstructorInvocationStmt;
import fr.centralesupelec.csd.ejava.ExpressionStmt;
import fr.centralesupelec.csd.ejava.FieldAccessExpr;
import fr.centralesupelec.csd.ejava.FieldDeclaration;
import fr.centralesupelec.csd.ejava.ForEachStmt;
import fr.centralesupelec.csd.ejava.ForStmt;
import fr.centralesupelec.csd.ejava.IfStmt;
import fr.centralesupelec.csd.ejava.ImportDeclaration;
import fr.centralesupelec.csd.ejava.InitializerDeclaration;
import fr.centralesupelec.csd.ejava.InstanceOfExpr;
import fr.centralesupelec.csd.ejava.IntegerLiteralExpr;
import fr.centralesupelec.csd.ejava.IntersectionType;
import fr.centralesupelec.csd.ejava.JavadocComment;
import fr.centralesupelec.csd.ejava.LabeledStmt;
import fr.centralesupelec.csd.ejava.LambdaExpr;
import fr.centralesupelec.csd.ejava.LineComment;
import fr.centralesupelec.csd.ejava.LocalClassDeclarationStmt;
import fr.centralesupelec.csd.ejava.LongLiteralExpr;
import fr.centralesupelec.csd.ejava.MarkerAnnotationExpr;
import fr.centralesupelec.csd.ejava.MemberValuePair;
import fr.centralesupelec.csd.ejava.MethodCallExpr;
import fr.centralesupelec.csd.ejava.MethodDeclaration;
import fr.centralesupelec.csd.ejava.MethodReferenceExpr;
import fr.centralesupelec.csd.ejava.ModifierKeyword;
import fr.centralesupelec.csd.ejava.ModuleDeclaration;
import fr.centralesupelec.csd.ejava.ModuleExportsDirective;
import fr.centralesupelec.csd.ejava.ModuleOpensDirective;
import fr.centralesupelec.csd.ejava.ModuleProvidesDirective;
import fr.centralesupelec.csd.ejava.ModuleRequiresDirective;
import fr.centralesupelec.csd.ejava.ModuleUsesDirective;
import fr.centralesupelec.csd.ejava.Name;
import fr.centralesupelec.csd.ejava.NameExpr;
import fr.centralesupelec.csd.ejava.NormalAnnotationExpr;
import fr.centralesupelec.csd.ejava.NullLiteralExpr;
import fr.centralesupelec.csd.ejava.ObjectCreationExpr;
import fr.centralesupelec.csd.ejava.PackageDeclaration;
import fr.centralesupelec.csd.ejava.Parameter;
import fr.centralesupelec.csd.ejava.PatternExpr;
import fr.centralesupelec.csd.ejava.Primitive;
import fr.centralesupelec.csd.ejava.PrimitiveType;
import fr.centralesupelec.csd.ejava.Project;
import fr.centralesupelec.csd.ejava.ReceiverParameter;
import fr.centralesupelec.csd.ejava.ReturnStmt;
import fr.centralesupelec.csd.ejava.SimpleName;
import fr.centralesupelec.csd.ejava.SingleMemberAnnotationExpr;
import fr.centralesupelec.csd.ejava.Statement;
import fr.centralesupelec.csd.ejava.StringLiteralExpr;
import fr.centralesupelec.csd.ejava.SuperExpr;
import fr.centralesupelec.csd.ejava.SwitchEntry;
import fr.centralesupelec.csd.ejava.SwitchEntryType;
import fr.centralesupelec.csd.ejava.SwitchExpr;
import fr.centralesupelec.csd.ejava.SwitchStmt;
import fr.centralesupelec.csd.ejava.SynchronizedStmt;
import fr.centralesupelec.csd.ejava.TextBlockLiteralExpr;
import fr.centralesupelec.csd.ejava.ThisExpr;
import fr.centralesupelec.csd.ejava.ThrowStmt;
import fr.centralesupelec.csd.ejava.TryStmt;
import fr.centralesupelec.csd.ejava.TypeExpr;
import fr.centralesupelec.csd.ejava.TypeParameter;
import fr.centralesupelec.csd.ejava.UnaryExpr;
import fr.centralesupelec.csd.ejava.UnaryOperator;
import fr.centralesupelec.csd.ejava.UnionType;
import fr.centralesupelec.csd.ejava.UnknownType;
import fr.centralesupelec.csd.ejava.VarType;
import fr.centralesupelec.csd.ejava.VariableDeclarationExpr;
import fr.centralesupelec.csd.ejava.VariableDeclarator;
import fr.centralesupelec.csd.ejava.VoidType;
import fr.centralesupelec.csd.ejava.WhileStmt;
import fr.centralesupelec.csd.ejava.WildcardType;
import fr.centralesupelec.csd.ejava.YieldStmt;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EJavaFactoryImpl extends EFactoryImpl implements EJavaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EJavaFactory init() {
        try {
            EJavaFactory theEJavaFactory = ( EJavaFactory ) EPackage.Registry.INSTANCE
                    .getEFactory( EJavaPackage.eNS_URI );
            if( theEJavaFactory != null ) {
                return theEJavaFactory;
            }
        }
        catch( Exception exception ) {
            EcorePlugin.INSTANCE.log( exception );
        }
        return new EJavaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EJavaFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create( EClass eClass ) {
        switch( eClass.getClassifierID() ) {
        case EJavaPackage.ARRAY_CREATION_LEVEL:
            return createArrayCreationLevel();
        case EJavaPackage.COMPILATION_UNIT:
            return createCompilationUnit();
        case EJavaPackage.IMPORT_DECLARATION:
            return createImportDeclaration();
        case EJavaPackage.PACKAGE_DECLARATION:
            return createPackageDeclaration();
        case EJavaPackage.ANNOTATION_DECLARATION:
            return createAnnotationDeclaration();
        case EJavaPackage.ANNOTATION_MEMBER_DECLARATION:
            return createAnnotationMemberDeclaration();
        case EJavaPackage.CLASS_OR_INTERFACE_DECLARATION:
            return createClassOrInterfaceDeclaration();
        case EJavaPackage.CONSTRUCTOR_DECLARATION:
            return createConstructorDeclaration();
        case EJavaPackage.ENUM_CONSTANT_DECLARATION:
            return createEnumConstantDeclaration();
        case EJavaPackage.ENUM_DECLARATION:
            return createEnumDeclaration();
        case EJavaPackage.FIELD_DECLARATION:
            return createFieldDeclaration();
        case EJavaPackage.INITIALIZER_DECLARATION:
            return createInitializerDeclaration();
        case EJavaPackage.METHOD_DECLARATION:
            return createMethodDeclaration();
        case EJavaPackage.PARAMETER:
            return createParameter();
        case EJavaPackage.RECEIVER_PARAMETER:
            return createReceiverParameter();
        case EJavaPackage.VARIABLE_DECLARATOR:
            return createVariableDeclarator();
        case EJavaPackage.BLOCK_COMMENT:
            return createBlockComment();
        case EJavaPackage.JAVADOC_COMMENT:
            return createJavadocComment();
        case EJavaPackage.LINE_COMMENT:
            return createLineComment();
        case EJavaPackage.ARRAY_ACCESS_EXPR:
            return createArrayAccessExpr();
        case EJavaPackage.ARRAY_CREATION_EXPR:
            return createArrayCreationExpr();
        case EJavaPackage.ARRAY_INITIALIZER_EXPR:
            return createArrayInitializerExpr();
        case EJavaPackage.ASSIGN_EXPR:
            return createAssignExpr();
        case EJavaPackage.BINARY_EXPR:
            return createBinaryExpr();
        case EJavaPackage.BOOLEAN_LITERAL_EXPR:
            return createBooleanLiteralExpr();
        case EJavaPackage.CAST_EXPR:
            return createCastExpr();
        case EJavaPackage.CHAR_LITERAL_EXPR:
            return createCharLiteralExpr();
        case EJavaPackage.CLASS_EXPR:
            return createClassExpr();
        case EJavaPackage.CONDITIONAL_EXPR:
            return createConditionalExpr();
        case EJavaPackage.DOUBLE_LITERAL_EXPR:
            return createDoubleLiteralExpr();
        case EJavaPackage.ENCLOSED_EXPR:
            return createEnclosedExpr();
        case EJavaPackage.FIELD_ACCESS_EXPR:
            return createFieldAccessExpr();
        case EJavaPackage.INSTANCE_OF_EXPR:
            return createInstanceOfExpr();
        case EJavaPackage.INTEGER_LITERAL_EXPR:
            return createIntegerLiteralExpr();
        case EJavaPackage.LAMBDA_EXPR:
            return createLambdaExpr();
        case EJavaPackage.LONG_LITERAL_EXPR:
            return createLongLiteralExpr();
        case EJavaPackage.MARKER_ANNOTATION_EXPR:
            return createMarkerAnnotationExpr();
        case EJavaPackage.MEMBER_VALUE_PAIR:
            return createMemberValuePair();
        case EJavaPackage.METHOD_CALL_EXPR:
            return createMethodCallExpr();
        case EJavaPackage.METHOD_REFERENCE_EXPR:
            return createMethodReferenceExpr();
        case EJavaPackage.NAME:
            return createName();
        case EJavaPackage.NAME_EXPR:
            return createNameExpr();
        case EJavaPackage.NORMAL_ANNOTATION_EXPR:
            return createNormalAnnotationExpr();
        case EJavaPackage.NULL_LITERAL_EXPR:
            return createNullLiteralExpr();
        case EJavaPackage.OBJECT_CREATION_EXPR:
            return createObjectCreationExpr();
        case EJavaPackage.PATTERN_EXPR:
            return createPatternExpr();
        case EJavaPackage.SIMPLE_NAME:
            return createSimpleName();
        case EJavaPackage.SINGLE_MEMBER_ANNOTATION_EXPR:
            return createSingleMemberAnnotationExpr();
        case EJavaPackage.STRING_LITERAL_EXPR:
            return createStringLiteralExpr();
        case EJavaPackage.SUPER_EXPR:
            return createSuperExpr();
        case EJavaPackage.SWITCH_EXPR:
            return createSwitchExpr();
        case EJavaPackage.TEXT_BLOCK_LITERAL_EXPR:
            return createTextBlockLiteralExpr();
        case EJavaPackage.THIS_EXPR:
            return createThisExpr();
        case EJavaPackage.TYPE_EXPR:
            return createTypeExpr();
        case EJavaPackage.UNARY_EXPR:
            return createUnaryExpr();
        case EJavaPackage.VARIABLE_DECLARATION_EXPR:
            return createVariableDeclarationExpr();
        case EJavaPackage.MODULE_DECLARATION:
            return createModuleDeclaration();
        case EJavaPackage.MODULE_EXPORTS_DIRECTIVE:
            return createModuleExportsDirective();
        case EJavaPackage.MODULE_OPENS_DIRECTIVE:
            return createModuleOpensDirective();
        case EJavaPackage.MODULE_PROVIDES_DIRECTIVE:
            return createModuleProvidesDirective();
        case EJavaPackage.MODULE_REQUIRES_DIRECTIVE:
            return createModuleRequiresDirective();
        case EJavaPackage.MODULE_USES_DIRECTIVE:
            return createModuleUsesDirective();
        case EJavaPackage.ASSERT_STMT:
            return createAssertStmt();
        case EJavaPackage.BLOCK_STMT:
            return createBlockStmt();
        case EJavaPackage.BREAK_STMT:
            return createBreakStmt();
        case EJavaPackage.CATCH_CLAUSE:
            return createCatchClause();
        case EJavaPackage.CONTINUE_STMT:
            return createContinueStmt();
        case EJavaPackage.DO_STMT:
            return createDoStmt();
        case EJavaPackage.EMPTY_STMT:
            return createEmptyStmt();
        case EJavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT:
            return createExplicitConstructorInvocationStmt();
        case EJavaPackage.EXPRESSION_STMT:
            return createExpressionStmt();
        case EJavaPackage.FOR_EACH_STMT:
            return createForEachStmt();
        case EJavaPackage.FOR_STMT:
            return createForStmt();
        case EJavaPackage.IF_STMT:
            return createIfStmt();
        case EJavaPackage.LABELED_STMT:
            return createLabeledStmt();
        case EJavaPackage.LOCAL_CLASS_DECLARATION_STMT:
            return createLocalClassDeclarationStmt();
        case EJavaPackage.RETURN_STMT:
            return createReturnStmt();
        case EJavaPackage.STATEMENT:
            return createStatement();
        case EJavaPackage.SWITCH_ENTRY:
            return createSwitchEntry();
        case EJavaPackage.SWITCH_STMT:
            return createSwitchStmt();
        case EJavaPackage.SYNCHRONIZED_STMT:
            return createSynchronizedStmt();
        case EJavaPackage.THROW_STMT:
            return createThrowStmt();
        case EJavaPackage.TRY_STMT:
            return createTryStmt();
        case EJavaPackage.WHILE_STMT:
            return createWhileStmt();
        case EJavaPackage.YIELD_STMT:
            return createYieldStmt();
        case EJavaPackage.ARRAY_TYPE:
            return createArrayType();
        case EJavaPackage.CLASS_OR_INTERFACE_TYPE:
            return createClassOrInterfaceType();
        case EJavaPackage.INTERSECTION_TYPE:
            return createIntersectionType();
        case EJavaPackage.PRIMITIVE_TYPE:
            return createPrimitiveType();
        case EJavaPackage.TYPE_PARAMETER:
            return createTypeParameter();
        case EJavaPackage.UNION_TYPE:
            return createUnionType();
        case EJavaPackage.UNKNOWN_TYPE:
            return createUnknownType();
        case EJavaPackage.VAR_TYPE:
            return createVarType();
        case EJavaPackage.VOID_TYPE:
            return createVoidType();
        case EJavaPackage.WILDCARD_TYPE:
            return createWildcardType();
        case EJavaPackage.PROJECT:
            return createProject();
        case EJavaPackage.PACKAGE:
            return createPackage();
        default:
            throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString( EDataType eDataType, String initialValue ) {
        switch( eDataType.getClassifierID() ) {
        case EJavaPackage.MODIFIER_KEYWORD:
            return createModifierKeywordFromString( eDataType, initialValue );
        case EJavaPackage.ASSIGN_OPERATOR:
            return createAssignOperatorFromString( eDataType, initialValue );
        case EJavaPackage.BINARY_OPERATOR:
            return createBinaryOperatorFromString( eDataType, initialValue );
        case EJavaPackage.UNARY_OPERATOR:
            return createUnaryOperatorFromString( eDataType, initialValue );
        case EJavaPackage.SWITCH_ENTRY_TYPE:
            return createSwitchEntryTypeFromString( eDataType, initialValue );
        case EJavaPackage.ARRAY_TYPE_ORIGIN:
            return createArrayTypeOriginFromString( eDataType, initialValue );
        case EJavaPackage.PRIMITIVE:
            return createPrimitiveFromString( eDataType, initialValue );
        default:
            throw new IllegalArgumentException(
                    "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString( EDataType eDataType, Object instanceValue ) {
        switch( eDataType.getClassifierID() ) {
        case EJavaPackage.MODIFIER_KEYWORD:
            return convertModifierKeywordToString( eDataType, instanceValue );
        case EJavaPackage.ASSIGN_OPERATOR:
            return convertAssignOperatorToString( eDataType, instanceValue );
        case EJavaPackage.BINARY_OPERATOR:
            return convertBinaryOperatorToString( eDataType, instanceValue );
        case EJavaPackage.UNARY_OPERATOR:
            return convertUnaryOperatorToString( eDataType, instanceValue );
        case EJavaPackage.SWITCH_ENTRY_TYPE:
            return convertSwitchEntryTypeToString( eDataType, instanceValue );
        case EJavaPackage.ARRAY_TYPE_ORIGIN:
            return convertArrayTypeOriginToString( eDataType, instanceValue );
        case EJavaPackage.PRIMITIVE:
            return convertPrimitiveToString( eDataType, instanceValue );
        default:
            throw new IllegalArgumentException(
                    "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArrayCreationLevel createArrayCreationLevel() {
        ArrayCreationLevelImpl arrayCreationLevel = new ArrayCreationLevelImpl();
        return arrayCreationLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CompilationUnit createCompilationUnit() {
        CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
        return compilationUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ImportDeclaration createImportDeclaration() {
        ImportDeclarationImpl importDeclaration = new ImportDeclarationImpl();
        return importDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PackageDeclaration createPackageDeclaration() {
        PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
        return packageDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnnotationDeclaration createAnnotationDeclaration() {
        AnnotationDeclarationImpl annotationDeclaration = new AnnotationDeclarationImpl();
        return annotationDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnnotationMemberDeclaration createAnnotationMemberDeclaration() {
        AnnotationMemberDeclarationImpl annotationMemberDeclaration = new AnnotationMemberDeclarationImpl();
        return annotationMemberDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClassOrInterfaceDeclaration createClassOrInterfaceDeclaration() {
        ClassOrInterfaceDeclarationImpl classOrInterfaceDeclaration = new ClassOrInterfaceDeclarationImpl();
        return classOrInterfaceDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConstructorDeclaration createConstructorDeclaration() {
        ConstructorDeclarationImpl constructorDeclaration = new ConstructorDeclarationImpl();
        return constructorDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnumConstantDeclaration createEnumConstantDeclaration() {
        EnumConstantDeclarationImpl enumConstantDeclaration = new EnumConstantDeclarationImpl();
        return enumConstantDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnumDeclaration createEnumDeclaration() {
        EnumDeclarationImpl enumDeclaration = new EnumDeclarationImpl();
        return enumDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FieldDeclaration createFieldDeclaration() {
        FieldDeclarationImpl fieldDeclaration = new FieldDeclarationImpl();
        return fieldDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InitializerDeclaration createInitializerDeclaration() {
        InitializerDeclarationImpl initializerDeclaration = new InitializerDeclarationImpl();
        return initializerDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MethodDeclaration createMethodDeclaration() {
        MethodDeclarationImpl methodDeclaration = new MethodDeclarationImpl();
        return methodDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Parameter createParameter() {
        ParameterImpl parameter = new ParameterImpl();
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReceiverParameter createReceiverParameter() {
        ReceiverParameterImpl receiverParameter = new ReceiverParameterImpl();
        return receiverParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VariableDeclarator createVariableDeclarator() {
        VariableDeclaratorImpl variableDeclarator = new VariableDeclaratorImpl();
        return variableDeclarator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BlockComment createBlockComment() {
        BlockCommentImpl blockComment = new BlockCommentImpl();
        return blockComment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JavadocComment createJavadocComment() {
        JavadocCommentImpl javadocComment = new JavadocCommentImpl();
        return javadocComment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LineComment createLineComment() {
        LineCommentImpl lineComment = new LineCommentImpl();
        return lineComment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArrayAccessExpr createArrayAccessExpr() {
        ArrayAccessExprImpl arrayAccessExpr = new ArrayAccessExprImpl();
        return arrayAccessExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArrayCreationExpr createArrayCreationExpr() {
        ArrayCreationExprImpl arrayCreationExpr = new ArrayCreationExprImpl();
        return arrayCreationExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArrayInitializerExpr createArrayInitializerExpr() {
        ArrayInitializerExprImpl arrayInitializerExpr = new ArrayInitializerExprImpl();
        return arrayInitializerExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignExpr createAssignExpr() {
        AssignExprImpl assignExpr = new AssignExprImpl();
        return assignExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BinaryExpr createBinaryExpr() {
        BinaryExprImpl binaryExpr = new BinaryExprImpl();
        return binaryExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BooleanLiteralExpr createBooleanLiteralExpr() {
        BooleanLiteralExprImpl booleanLiteralExpr = new BooleanLiteralExprImpl();
        return booleanLiteralExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CastExpr createCastExpr() {
        CastExprImpl castExpr = new CastExprImpl();
        return castExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CharLiteralExpr createCharLiteralExpr() {
        CharLiteralExprImpl charLiteralExpr = new CharLiteralExprImpl();
        return charLiteralExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClassExpr createClassExpr() {
        ClassExprImpl classExpr = new ClassExprImpl();
        return classExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConditionalExpr createConditionalExpr() {
        ConditionalExprImpl conditionalExpr = new ConditionalExprImpl();
        return conditionalExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DoubleLiteralExpr createDoubleLiteralExpr() {
        DoubleLiteralExprImpl doubleLiteralExpr = new DoubleLiteralExprImpl();
        return doubleLiteralExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnclosedExpr createEnclosedExpr() {
        EnclosedExprImpl enclosedExpr = new EnclosedExprImpl();
        return enclosedExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FieldAccessExpr createFieldAccessExpr() {
        FieldAccessExprImpl fieldAccessExpr = new FieldAccessExprImpl();
        return fieldAccessExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InstanceOfExpr createInstanceOfExpr() {
        InstanceOfExprImpl instanceOfExpr = new InstanceOfExprImpl();
        return instanceOfExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IntegerLiteralExpr createIntegerLiteralExpr() {
        IntegerLiteralExprImpl integerLiteralExpr = new IntegerLiteralExprImpl();
        return integerLiteralExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LambdaExpr createLambdaExpr() {
        LambdaExprImpl lambdaExpr = new LambdaExprImpl();
        return lambdaExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LongLiteralExpr createLongLiteralExpr() {
        LongLiteralExprImpl longLiteralExpr = new LongLiteralExprImpl();
        return longLiteralExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MarkerAnnotationExpr createMarkerAnnotationExpr() {
        MarkerAnnotationExprImpl markerAnnotationExpr = new MarkerAnnotationExprImpl();
        return markerAnnotationExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MemberValuePair createMemberValuePair() {
        MemberValuePairImpl memberValuePair = new MemberValuePairImpl();
        return memberValuePair;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MethodCallExpr createMethodCallExpr() {
        MethodCallExprImpl methodCallExpr = new MethodCallExprImpl();
        return methodCallExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MethodReferenceExpr createMethodReferenceExpr() {
        MethodReferenceExprImpl methodReferenceExpr = new MethodReferenceExprImpl();
        return methodReferenceExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Name createName() {
        NameImpl name = new NameImpl();
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NameExpr createNameExpr() {
        NameExprImpl nameExpr = new NameExprImpl();
        return nameExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NormalAnnotationExpr createNormalAnnotationExpr() {
        NormalAnnotationExprImpl normalAnnotationExpr = new NormalAnnotationExprImpl();
        return normalAnnotationExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NullLiteralExpr createNullLiteralExpr() {
        NullLiteralExprImpl nullLiteralExpr = new NullLiteralExprImpl();
        return nullLiteralExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ObjectCreationExpr createObjectCreationExpr() {
        ObjectCreationExprImpl objectCreationExpr = new ObjectCreationExprImpl();
        return objectCreationExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PatternExpr createPatternExpr() {
        PatternExprImpl patternExpr = new PatternExprImpl();
        return patternExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SimpleName createSimpleName() {
        SimpleNameImpl simpleName = new SimpleNameImpl();
        return simpleName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SingleMemberAnnotationExpr createSingleMemberAnnotationExpr() {
        SingleMemberAnnotationExprImpl singleMemberAnnotationExpr = new SingleMemberAnnotationExprImpl();
        return singleMemberAnnotationExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StringLiteralExpr createStringLiteralExpr() {
        StringLiteralExprImpl stringLiteralExpr = new StringLiteralExprImpl();
        return stringLiteralExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SuperExpr createSuperExpr() {
        SuperExprImpl superExpr = new SuperExprImpl();
        return superExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchExpr createSwitchExpr() {
        SwitchExprImpl switchExpr = new SwitchExprImpl();
        return switchExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TextBlockLiteralExpr createTextBlockLiteralExpr() {
        TextBlockLiteralExprImpl textBlockLiteralExpr = new TextBlockLiteralExprImpl();
        return textBlockLiteralExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ThisExpr createThisExpr() {
        ThisExprImpl thisExpr = new ThisExprImpl();
        return thisExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TypeExpr createTypeExpr() {
        TypeExprImpl typeExpr = new TypeExprImpl();
        return typeExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnaryExpr createUnaryExpr() {
        UnaryExprImpl unaryExpr = new UnaryExprImpl();
        return unaryExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VariableDeclarationExpr createVariableDeclarationExpr() {
        VariableDeclarationExprImpl variableDeclarationExpr = new VariableDeclarationExprImpl();
        return variableDeclarationExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModuleDeclaration createModuleDeclaration() {
        ModuleDeclarationImpl moduleDeclaration = new ModuleDeclarationImpl();
        return moduleDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModuleExportsDirective createModuleExportsDirective() {
        ModuleExportsDirectiveImpl moduleExportsDirective = new ModuleExportsDirectiveImpl();
        return moduleExportsDirective;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModuleOpensDirective createModuleOpensDirective() {
        ModuleOpensDirectiveImpl moduleOpensDirective = new ModuleOpensDirectiveImpl();
        return moduleOpensDirective;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModuleProvidesDirective createModuleProvidesDirective() {
        ModuleProvidesDirectiveImpl moduleProvidesDirective = new ModuleProvidesDirectiveImpl();
        return moduleProvidesDirective;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModuleRequiresDirective createModuleRequiresDirective() {
        ModuleRequiresDirectiveImpl moduleRequiresDirective = new ModuleRequiresDirectiveImpl();
        return moduleRequiresDirective;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModuleUsesDirective createModuleUsesDirective() {
        ModuleUsesDirectiveImpl moduleUsesDirective = new ModuleUsesDirectiveImpl();
        return moduleUsesDirective;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssertStmt createAssertStmt() {
        AssertStmtImpl assertStmt = new AssertStmtImpl();
        return assertStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BlockStmt createBlockStmt() {
        BlockStmtImpl blockStmt = new BlockStmtImpl();
        return blockStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BreakStmt createBreakStmt() {
        BreakStmtImpl breakStmt = new BreakStmtImpl();
        return breakStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CatchClause createCatchClause() {
        CatchClauseImpl catchClause = new CatchClauseImpl();
        return catchClause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ContinueStmt createContinueStmt() {
        ContinueStmtImpl continueStmt = new ContinueStmtImpl();
        return continueStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DoStmt createDoStmt() {
        DoStmtImpl doStmt = new DoStmtImpl();
        return doStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmptyStmt createEmptyStmt() {
        EmptyStmtImpl emptyStmt = new EmptyStmtImpl();
        return emptyStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExplicitConstructorInvocationStmt createExplicitConstructorInvocationStmt() {
        ExplicitConstructorInvocationStmtImpl explicitConstructorInvocationStmt = new ExplicitConstructorInvocationStmtImpl();
        return explicitConstructorInvocationStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExpressionStmt createExpressionStmt() {
        ExpressionStmtImpl expressionStmt = new ExpressionStmtImpl();
        return expressionStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ForEachStmt createForEachStmt() {
        ForEachStmtImpl forEachStmt = new ForEachStmtImpl();
        return forEachStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ForStmt createForStmt() {
        ForStmtImpl forStmt = new ForStmtImpl();
        return forStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfStmt createIfStmt() {
        IfStmtImpl ifStmt = new IfStmtImpl();
        return ifStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LabeledStmt createLabeledStmt() {
        LabeledStmtImpl labeledStmt = new LabeledStmtImpl();
        return labeledStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LocalClassDeclarationStmt createLocalClassDeclarationStmt() {
        LocalClassDeclarationStmtImpl localClassDeclarationStmt = new LocalClassDeclarationStmtImpl();
        return localClassDeclarationStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReturnStmt createReturnStmt() {
        ReturnStmtImpl returnStmt = new ReturnStmtImpl();
        return returnStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Statement createStatement() {
        StatementImpl statement = new StatementImpl();
        return statement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchEntry createSwitchEntry() {
        SwitchEntryImpl switchEntry = new SwitchEntryImpl();
        return switchEntry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchStmt createSwitchStmt() {
        SwitchStmtImpl switchStmt = new SwitchStmtImpl();
        return switchStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronizedStmt createSynchronizedStmt() {
        SynchronizedStmtImpl synchronizedStmt = new SynchronizedStmtImpl();
        return synchronizedStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ThrowStmt createThrowStmt() {
        ThrowStmtImpl throwStmt = new ThrowStmtImpl();
        return throwStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TryStmt createTryStmt() {
        TryStmtImpl tryStmt = new TryStmtImpl();
        return tryStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WhileStmt createWhileStmt() {
        WhileStmtImpl whileStmt = new WhileStmtImpl();
        return whileStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public YieldStmt createYieldStmt() {
        YieldStmtImpl yieldStmt = new YieldStmtImpl();
        return yieldStmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArrayType createArrayType() {
        ArrayTypeImpl arrayType = new ArrayTypeImpl();
        return arrayType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClassOrInterfaceType createClassOrInterfaceType() {
        ClassOrInterfaceTypeImpl classOrInterfaceType = new ClassOrInterfaceTypeImpl();
        return classOrInterfaceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IntersectionType createIntersectionType() {
        IntersectionTypeImpl intersectionType = new IntersectionTypeImpl();
        return intersectionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PrimitiveType createPrimitiveType() {
        PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
        return primitiveType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TypeParameter createTypeParameter() {
        TypeParameterImpl typeParameter = new TypeParameterImpl();
        return typeParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnionType createUnionType() {
        UnionTypeImpl unionType = new UnionTypeImpl();
        return unionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnknownType createUnknownType() {
        UnknownTypeImpl unknownType = new UnknownTypeImpl();
        return unknownType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VarType createVarType() {
        VarTypeImpl varType = new VarTypeImpl();
        return varType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoidType createVoidType() {
        VoidTypeImpl voidType = new VoidTypeImpl();
        return voidType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WildcardType createWildcardType() {
        WildcardTypeImpl wildcardType = new WildcardTypeImpl();
        return wildcardType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Project createProject() {
        ProjectImpl project = new ProjectImpl();
        return project;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public fr.centralesupelec.csd.ejava.Package createPackage() {
        PackageImpl package_ = new PackageImpl();
        return package_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModifierKeyword createModifierKeywordFromString( EDataType eDataType, String initialValue ) {
        ModifierKeyword result = ModifierKeyword.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModifierKeywordToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssignOperator createAssignOperatorFromString( EDataType eDataType, String initialValue ) {
        AssignOperator result = AssignOperator.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAssignOperatorToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryOperator createBinaryOperatorFromString( EDataType eDataType, String initialValue ) {
        BinaryOperator result = BinaryOperator.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBinaryOperatorToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnaryOperator createUnaryOperatorFromString( EDataType eDataType, String initialValue ) {
        UnaryOperator result = UnaryOperator.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUnaryOperatorToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchEntryType createSwitchEntryTypeFromString( EDataType eDataType, String initialValue ) {
        SwitchEntryType result = SwitchEntryType.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSwitchEntryTypeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ArrayTypeOrigin createArrayTypeOriginFromString( EDataType eDataType, String initialValue ) {
        ArrayTypeOrigin result = ArrayTypeOrigin.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertArrayTypeOriginToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Primitive createPrimitiveFromString( EDataType eDataType, String initialValue ) {
        Primitive result = Primitive.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPrimitiveToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EJavaPackage getEJavaPackage() {
        return ( EJavaPackage ) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static EJavaPackage getPackage() {
        return EJavaPackage.eINSTANCE;
    }

} //EJavaFactoryImpl
