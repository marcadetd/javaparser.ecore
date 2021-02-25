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
package fr.centralesupelec.csd.java.impl;

import fr.centralesupelec.csd.java.*;

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
public class JavaFactoryImpl extends EFactoryImpl implements JavaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static JavaFactory init() {
        try {
            JavaFactory theJavaFactory = ( JavaFactory ) EPackage.Registry.INSTANCE.getEFactory( JavaPackage.eNS_URI );
            if( theJavaFactory != null ) {
                return theJavaFactory;
            }
        }
        catch( Exception exception ) {
            EcorePlugin.INSTANCE.log( exception );
        }
        return new JavaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JavaFactoryImpl() {
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
        case JavaPackage.ARRAY_CREATION_LEVEL:
            return createArrayCreationLevel();
        case JavaPackage.COMPILATION_UNIT:
            return createCompilationUnit();
        case JavaPackage.IMPORT_DECLARATION:
            return createImportDeclaration();
        case JavaPackage.PACKAGE_DECLARATION:
            return createPackageDeclaration();
        case JavaPackage.ANNOTATION_DECLARATION:
            return createAnnotationDeclaration();
        case JavaPackage.ANNOTATION_MEMBER_DECLARATION:
            return createAnnotationMemberDeclaration();
        case JavaPackage.CLASS_OR_INTERFACE_DECLARATION:
            return createClassOrInterfaceDeclaration();
        case JavaPackage.CONSTRUCTOR_DECLARATION:
            return createConstructorDeclaration();
        case JavaPackage.ENUM_CONSTANT_DECLARATION:
            return createEnumConstantDeclaration();
        case JavaPackage.ENUM_DECLARATION:
            return createEnumDeclaration();
        case JavaPackage.FIELD_DECLARATION:
            return createFieldDeclaration();
        case JavaPackage.INITIALIZER_DECLARATION:
            return createInitializerDeclaration();
        case JavaPackage.METHOD_DECLARATION:
            return createMethodDeclaration();
        case JavaPackage.PARAMETER:
            return createParameter();
        case JavaPackage.RECEIVER_PARAMETER:
            return createReceiverParameter();
        case JavaPackage.VARIABLE_DECLARATOR:
            return createVariableDeclarator();
        case JavaPackage.BLOCK_COMMENT:
            return createBlockComment();
        case JavaPackage.JAVADOC_COMMENT:
            return createJavadocComment();
        case JavaPackage.LINE_COMMENT:
            return createLineComment();
        case JavaPackage.ARRAY_ACCESS_EXPR:
            return createArrayAccessExpr();
        case JavaPackage.ARRAY_CREATION_EXPR:
            return createArrayCreationExpr();
        case JavaPackage.ARRAY_INITIALIZER_EXPR:
            return createArrayInitializerExpr();
        case JavaPackage.ASSIGN_EXPR:
            return createAssignExpr();
        case JavaPackage.BINARY_EXPR:
            return createBinaryExpr();
        case JavaPackage.BOOLEAN_LITERAL_EXPR:
            return createBooleanLiteralExpr();
        case JavaPackage.CAST_EXPR:
            return createCastExpr();
        case JavaPackage.CHAR_LITERAL_EXPR:
            return createCharLiteralExpr();
        case JavaPackage.CLASS_EXPR:
            return createClassExpr();
        case JavaPackage.CONDITIONAL_EXPR:
            return createConditionalExpr();
        case JavaPackage.DOUBLE_LITERAL_EXPR:
            return createDoubleLiteralExpr();
        case JavaPackage.ENCLOSED_EXPR:
            return createEnclosedExpr();
        case JavaPackage.FIELD_ACCESS_EXPR:
            return createFieldAccessExpr();
        case JavaPackage.INSTANCE_OF_EXPR:
            return createInstanceOfExpr();
        case JavaPackage.INTEGER_LITERAL_EXPR:
            return createIntegerLiteralExpr();
        case JavaPackage.LAMBDA_EXPR:
            return createLambdaExpr();
        case JavaPackage.LONG_LITERAL_EXPR:
            return createLongLiteralExpr();
        case JavaPackage.MARKER_ANNOTATION_EXPR:
            return createMarkerAnnotationExpr();
        case JavaPackage.MEMBER_VALUE_PAIR:
            return createMemberValuePair();
        case JavaPackage.METHOD_CALL_EXPR:
            return createMethodCallExpr();
        case JavaPackage.METHOD_REFERENCE_EXPR:
            return createMethodReferenceExpr();
        case JavaPackage.NAME:
            return createName();
        case JavaPackage.NAME_EXPR:
            return createNameExpr();
        case JavaPackage.NORMAL_ANNOTATION_EXPR:
            return createNormalAnnotationExpr();
        case JavaPackage.NULL_LITERAL_EXPR:
            return createNullLiteralExpr();
        case JavaPackage.OBJECT_CREATION_EXPR:
            return createObjectCreationExpr();
        case JavaPackage.PATTERN_EXPR:
            return createPatternExpr();
        case JavaPackage.SIMPLE_NAME:
            return createSimpleName();
        case JavaPackage.SINGLE_MEMBER_ANNOTATION_EXPR:
            return createSingleMemberAnnotationExpr();
        case JavaPackage.STRING_LITERAL_EXPR:
            return createStringLiteralExpr();
        case JavaPackage.SUPER_EXPR:
            return createSuperExpr();
        case JavaPackage.SWITCH_EXPR:
            return createSwitchExpr();
        case JavaPackage.TEXT_BLOCK_LITERAL_EXPR:
            return createTextBlockLiteralExpr();
        case JavaPackage.THIS_EXPR:
            return createThisExpr();
        case JavaPackage.TYPE_EXPR:
            return createTypeExpr();
        case JavaPackage.UNARY_EXPR:
            return createUnaryExpr();
        case JavaPackage.VARIABLE_DECLARATION_EXPR:
            return createVariableDeclarationExpr();
        case JavaPackage.MODULE_DECLARATION:
            return createModuleDeclaration();
        case JavaPackage.MODULE_EXPORTS_DIRECTIVE:
            return createModuleExportsDirective();
        case JavaPackage.MODULE_OPENS_DIRECTIVE:
            return createModuleOpensDirective();
        case JavaPackage.MODULE_PROVIDES_DIRECTIVE:
            return createModuleProvidesDirective();
        case JavaPackage.MODULE_REQUIRES_DIRECTIVE:
            return createModuleRequiresDirective();
        case JavaPackage.MODULE_USES_DIRECTIVE:
            return createModuleUsesDirective();
        case JavaPackage.ASSERT_STMT:
            return createAssertStmt();
        case JavaPackage.BLOCK_STMT:
            return createBlockStmt();
        case JavaPackage.BREAK_STMT:
            return createBreakStmt();
        case JavaPackage.CATCH_CLAUSE:
            return createCatchClause();
        case JavaPackage.CONTINUE_STMT:
            return createContinueStmt();
        case JavaPackage.DO_STMT:
            return createDoStmt();
        case JavaPackage.EMPTY_STMT:
            return createEmptyStmt();
        case JavaPackage.EXPLICIT_CONSTRUCTOR_INVOCATION_STMT:
            return createExplicitConstructorInvocationStmt();
        case JavaPackage.EXPRESSION_STMT:
            return createExpressionStmt();
        case JavaPackage.FOR_EACH_STMT:
            return createForEachStmt();
        case JavaPackage.FOR_STMT:
            return createForStmt();
        case JavaPackage.IF_STMT:
            return createIfStmt();
        case JavaPackage.LABELED_STMT:
            return createLabeledStmt();
        case JavaPackage.LOCAL_CLASS_DECLARATION_STMT:
            return createLocalClassDeclarationStmt();
        case JavaPackage.RETURN_STMT:
            return createReturnStmt();
        case JavaPackage.STATEMENT:
            return createStatement();
        case JavaPackage.SWITCH_ENTRY:
            return createSwitchEntry();
        case JavaPackage.SWITCH_STMT:
            return createSwitchStmt();
        case JavaPackage.SYNCHRONIZED_STMT:
            return createSynchronizedStmt();
        case JavaPackage.THROW_STMT:
            return createThrowStmt();
        case JavaPackage.TRY_STMT:
            return createTryStmt();
        case JavaPackage.WHILE_STMT:
            return createWhileStmt();
        case JavaPackage.YIELD_STMT:
            return createYieldStmt();
        case JavaPackage.ARRAY_TYPE:
            return createArrayType();
        case JavaPackage.CLASS_OR_INTERFACE_TYPE:
            return createClassOrInterfaceType();
        case JavaPackage.INTERSECTION_TYPE:
            return createIntersectionType();
        case JavaPackage.PRIMITIVE_TYPE:
            return createPrimitiveType();
        case JavaPackage.TYPE_PARAMETER:
            return createTypeParameter();
        case JavaPackage.UNION_TYPE:
            return createUnionType();
        case JavaPackage.UNKNOWN_TYPE:
            return createUnknownType();
        case JavaPackage.VAR_TYPE:
            return createVarType();
        case JavaPackage.VOID_TYPE:
            return createVoidType();
        case JavaPackage.WILDCARD_TYPE:
            return createWildcardType();
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
        case JavaPackage.MODIFIER_KEYWORD:
            return createModifierKeywordFromString( eDataType, initialValue );
        case JavaPackage.ASSIGN_OPERATOR:
            return createAssignOperatorFromString( eDataType, initialValue );
        case JavaPackage.BINARY_OPERATOR:
            return createBinaryOperatorFromString( eDataType, initialValue );
        case JavaPackage.UNARY_OPERATOR:
            return createUnaryOperatorFromString( eDataType, initialValue );
        case JavaPackage.SWITCH_ENTRY_TYPE:
            return createSwitchEntryTypeFromString( eDataType, initialValue );
        case JavaPackage.ARRAY_TYPE_ORIGIN:
            return createArrayTypeOriginFromString( eDataType, initialValue );
        case JavaPackage.PRIMITIVE:
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
        case JavaPackage.MODIFIER_KEYWORD:
            return convertModifierKeywordToString( eDataType, instanceValue );
        case JavaPackage.ASSIGN_OPERATOR:
            return convertAssignOperatorToString( eDataType, instanceValue );
        case JavaPackage.BINARY_OPERATOR:
            return convertBinaryOperatorToString( eDataType, instanceValue );
        case JavaPackage.UNARY_OPERATOR:
            return convertUnaryOperatorToString( eDataType, instanceValue );
        case JavaPackage.SWITCH_ENTRY_TYPE:
            return convertSwitchEntryTypeToString( eDataType, instanceValue );
        case JavaPackage.ARRAY_TYPE_ORIGIN:
            return convertArrayTypeOriginToString( eDataType, instanceValue );
        case JavaPackage.PRIMITIVE:
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
    public JavaPackage getJavaPackage() {
        return ( JavaPackage ) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static JavaPackage getPackage() {
        return JavaPackage.eINSTANCE;
    }

} //JavaFactoryImpl
