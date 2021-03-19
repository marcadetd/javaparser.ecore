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
package fr.centralesupelec.csd.ejava.util;

import fr.centralesupelec.csd.ejava.AnnotationDeclaration;
import fr.centralesupelec.csd.ejava.AnnotationExpr;
import fr.centralesupelec.csd.ejava.AnnotationMemberDeclaration;
import fr.centralesupelec.csd.ejava.ArrayAccessExpr;
import fr.centralesupelec.csd.ejava.ArrayCreationExpr;
import fr.centralesupelec.csd.ejava.ArrayCreationLevel;
import fr.centralesupelec.csd.ejava.ArrayInitializerExpr;
import fr.centralesupelec.csd.ejava.ArrayType;
import fr.centralesupelec.csd.ejava.AssertStmt;
import fr.centralesupelec.csd.ejava.AssignExpr;
import fr.centralesupelec.csd.ejava.BinaryExpr;
import fr.centralesupelec.csd.ejava.BlockComment;
import fr.centralesupelec.csd.ejava.BlockStmt;
import fr.centralesupelec.csd.ejava.BodyDeclaration;
import fr.centralesupelec.csd.ejava.BooleanLiteralExpr;
import fr.centralesupelec.csd.ejava.BreakStmt;
import fr.centralesupelec.csd.ejava.CallableDeclaration;
import fr.centralesupelec.csd.ejava.CastExpr;
import fr.centralesupelec.csd.ejava.CatchClause;
import fr.centralesupelec.csd.ejava.CharLiteralExpr;
import fr.centralesupelec.csd.ejava.ClassExpr;
import fr.centralesupelec.csd.ejava.ClassOrInterfaceDeclaration;
import fr.centralesupelec.csd.ejava.ClassOrInterfaceType;
import fr.centralesupelec.csd.ejava.Comment;
import fr.centralesupelec.csd.ejava.CompilationUnit;
import fr.centralesupelec.csd.ejava.ConditionalExpr;
import fr.centralesupelec.csd.ejava.ConstructorDeclaration;
import fr.centralesupelec.csd.ejava.ContinueStmt;
import fr.centralesupelec.csd.ejava.DoStmt;
import fr.centralesupelec.csd.ejava.DoubleLiteralExpr;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.Element;
import fr.centralesupelec.csd.ejava.EmptyStmt;
import fr.centralesupelec.csd.ejava.EnclosedExpr;
import fr.centralesupelec.csd.ejava.EnumConstantDeclaration;
import fr.centralesupelec.csd.ejava.EnumDeclaration;
import fr.centralesupelec.csd.ejava.ExplicitConstructorInvocationStmt;
import fr.centralesupelec.csd.ejava.Expression;
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
import fr.centralesupelec.csd.ejava.JavaNode;
import fr.centralesupelec.csd.ejava.JavadocComment;
import fr.centralesupelec.csd.ejava.LabeledStmt;
import fr.centralesupelec.csd.ejava.LambdaExpr;
import fr.centralesupelec.csd.ejava.LineComment;
import fr.centralesupelec.csd.ejava.LiteralExpr;
import fr.centralesupelec.csd.ejava.LiteralStringValueExpr;
import fr.centralesupelec.csd.ejava.LocalClassDeclarationStmt;
import fr.centralesupelec.csd.ejava.LongLiteralExpr;
import fr.centralesupelec.csd.ejava.MarkerAnnotationExpr;
import fr.centralesupelec.csd.ejava.MemberValuePair;
import fr.centralesupelec.csd.ejava.MethodCallExpr;
import fr.centralesupelec.csd.ejava.MethodDeclaration;
import fr.centralesupelec.csd.ejava.MethodReferenceExpr;
import fr.centralesupelec.csd.ejava.ModuleDeclaration;
import fr.centralesupelec.csd.ejava.ModuleDirective;
import fr.centralesupelec.csd.ejava.ModuleExportsDirective;
import fr.centralesupelec.csd.ejava.ModuleOpensDirective;
import fr.centralesupelec.csd.ejava.ModuleProvidesDirective;
import fr.centralesupelec.csd.ejava.ModuleRequiresDirective;
import fr.centralesupelec.csd.ejava.ModuleUsesDirective;
import fr.centralesupelec.csd.ejava.Name;
import fr.centralesupelec.csd.ejava.NameExpr;
import fr.centralesupelec.csd.ejava.NodeWithAbstractModifier;
import fr.centralesupelec.csd.ejava.NodeWithAccessModifiers;
import fr.centralesupelec.csd.ejava.NodeWithAnnotations;
import fr.centralesupelec.csd.ejava.NodeWithArguments;
import fr.centralesupelec.csd.ejava.NodeWithBlockStmt;
import fr.centralesupelec.csd.ejava.NodeWithBody;
import fr.centralesupelec.csd.ejava.NodeWithCondition;
import fr.centralesupelec.csd.ejava.NodeWithDefaultModifier;
import fr.centralesupelec.csd.ejava.NodeWithExpression;
import fr.centralesupelec.csd.ejava.NodeWithExtends;
import fr.centralesupelec.csd.ejava.NodeWithFinalModifier;
import fr.centralesupelec.csd.ejava.NodeWithIdentifier;
import fr.centralesupelec.csd.ejava.NodeWithImplements;
import fr.centralesupelec.csd.ejava.NodeWithJavadoc;
import fr.centralesupelec.csd.ejava.NodeWithLabel;
import fr.centralesupelec.csd.ejava.NodeWithMembers;
import fr.centralesupelec.csd.ejava.NodeWithModifiers;
import fr.centralesupelec.csd.ejava.NodeWithName;
import fr.centralesupelec.csd.ejava.NodeWithNativeModifier;
import fr.centralesupelec.csd.ejava.NodeWithParameters;
import fr.centralesupelec.csd.ejava.NodeWithPrivateModifier;
import fr.centralesupelec.csd.ejava.NodeWithProtectedModifier;
import fr.centralesupelec.csd.ejava.NodeWithPublicModifier;
import fr.centralesupelec.csd.ejava.NodeWithRange;
import fr.centralesupelec.csd.ejava.NodeWithScope;
import fr.centralesupelec.csd.ejava.NodeWithSimpleName;
import fr.centralesupelec.csd.ejava.NodeWithStatements;
import fr.centralesupelec.csd.ejava.NodeWithStaticModifier;
import fr.centralesupelec.csd.ejava.NodeWithStrictfpModifier;
import fr.centralesupelec.csd.ejava.NodeWithSynchronizedModifier;
import fr.centralesupelec.csd.ejava.NodeWithThrownExceptions;
import fr.centralesupelec.csd.ejava.NodeWithTokenRange;
import fr.centralesupelec.csd.ejava.NodeWithTransientModifier;
import fr.centralesupelec.csd.ejava.NodeWithTransitiveModifier;
import fr.centralesupelec.csd.ejava.NodeWithType;
import fr.centralesupelec.csd.ejava.NodeWithTypeArguments;
import fr.centralesupelec.csd.ejava.NodeWithTypeParameters;
import fr.centralesupelec.csd.ejava.NodeWithVariables;
import fr.centralesupelec.csd.ejava.NodeWithVolatileModifier;
import fr.centralesupelec.csd.ejava.NormalAnnotationExpr;
import fr.centralesupelec.csd.ejava.NullLiteralExpr;
import fr.centralesupelec.csd.ejava.ObjectCreationExpr;
import fr.centralesupelec.csd.ejava.PackageDeclaration;
import fr.centralesupelec.csd.ejava.Parameter;
import fr.centralesupelec.csd.ejava.PatternExpr;
import fr.centralesupelec.csd.ejava.PrimitiveType;
import fr.centralesupelec.csd.ejava.Project;
import fr.centralesupelec.csd.ejava.ReceiverParameter;
import fr.centralesupelec.csd.ejava.ReferenceType;
import fr.centralesupelec.csd.ejava.ReturnStmt;
import fr.centralesupelec.csd.ejava.SimpleName;
import fr.centralesupelec.csd.ejava.SingleMemberAnnotationExpr;
import fr.centralesupelec.csd.ejava.Statement;
import fr.centralesupelec.csd.ejava.StringLiteralExpr;
import fr.centralesupelec.csd.ejava.SuperExpr;
import fr.centralesupelec.csd.ejava.SwitchEntry;
import fr.centralesupelec.csd.ejava.SwitchExpr;
import fr.centralesupelec.csd.ejava.SwitchNode;
import fr.centralesupelec.csd.ejava.SwitchStmt;
import fr.centralesupelec.csd.ejava.SynchronizedStmt;
import fr.centralesupelec.csd.ejava.TextBlockLiteralExpr;
import fr.centralesupelec.csd.ejava.ThisExpr;
import fr.centralesupelec.csd.ejava.ThrowStmt;
import fr.centralesupelec.csd.ejava.TryStmt;
import fr.centralesupelec.csd.ejava.Type;
import fr.centralesupelec.csd.ejava.TypeDeclaration;
import fr.centralesupelec.csd.ejava.TypeExpr;
import fr.centralesupelec.csd.ejava.TypeParameter;
import fr.centralesupelec.csd.ejava.UnaryExpr;
import fr.centralesupelec.csd.ejava.UnionType;
import fr.centralesupelec.csd.ejava.UnknownType;
import fr.centralesupelec.csd.ejava.VarType;
import fr.centralesupelec.csd.ejava.VariableDeclarationExpr;
import fr.centralesupelec.csd.ejava.VariableDeclarator;
import fr.centralesupelec.csd.ejava.VoidType;
import fr.centralesupelec.csd.ejava.WhileStmt;
import fr.centralesupelec.csd.ejava.WildcardType;
import fr.centralesupelec.csd.ejava.YieldStmt;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.csd.ejava.EJavaPackage
 * @generated
 */
public class EJavaAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EJavaPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EJavaAdapterFactory() {
        if( modelPackage == null ) {
            modelPackage = EJavaPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType( Object object ) {
        if( object == modelPackage ) {
            return true;
        }
        if( object instanceof EObject ) {
            return ( ( EObject ) object ).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EJavaSwitch< Adapter > modelSwitch = new EJavaSwitch< Adapter >() {
        @Override
        public Adapter caseJavaNode( JavaNode object ) {
            return createJavaNodeAdapter();
        }

        @Override
        public Adapter caseArrayCreationLevel( ArrayCreationLevel object ) {
            return createArrayCreationLevelAdapter();
        }

        @Override
        public Adapter caseCompilationUnit( CompilationUnit object ) {
            return createCompilationUnitAdapter();
        }

        @Override
        public Adapter caseImportDeclaration( ImportDeclaration object ) {
            return createImportDeclarationAdapter();
        }

        @Override
        public Adapter casePackageDeclaration( PackageDeclaration object ) {
            return createPackageDeclarationAdapter();
        }

        @Override
        public Adapter caseAnnotationDeclaration( AnnotationDeclaration object ) {
            return createAnnotationDeclarationAdapter();
        }

        @Override
        public Adapter caseAnnotationMemberDeclaration( AnnotationMemberDeclaration object ) {
            return createAnnotationMemberDeclarationAdapter();
        }

        @Override
        public Adapter caseBodyDeclaration( BodyDeclaration object ) {
            return createBodyDeclarationAdapter();
        }

        @Override
        public Adapter caseCallableDeclaration( CallableDeclaration object ) {
            return createCallableDeclarationAdapter();
        }

        @Override
        public Adapter caseClassOrInterfaceDeclaration( ClassOrInterfaceDeclaration object ) {
            return createClassOrInterfaceDeclarationAdapter();
        }

        @Override
        public Adapter caseConstructorDeclaration( ConstructorDeclaration object ) {
            return createConstructorDeclarationAdapter();
        }

        @Override
        public Adapter caseEnumConstantDeclaration( EnumConstantDeclaration object ) {
            return createEnumConstantDeclarationAdapter();
        }

        @Override
        public Adapter caseEnumDeclaration( EnumDeclaration object ) {
            return createEnumDeclarationAdapter();
        }

        @Override
        public Adapter caseFieldDeclaration( FieldDeclaration object ) {
            return createFieldDeclarationAdapter();
        }

        @Override
        public Adapter caseInitializerDeclaration( InitializerDeclaration object ) {
            return createInitializerDeclarationAdapter();
        }

        @Override
        public Adapter caseMethodDeclaration( MethodDeclaration object ) {
            return createMethodDeclarationAdapter();
        }

        @Override
        public Adapter caseParameter( Parameter object ) {
            return createParameterAdapter();
        }

        @Override
        public Adapter caseReceiverParameter( ReceiverParameter object ) {
            return createReceiverParameterAdapter();
        }

        @Override
        public Adapter caseTypeDeclaration( TypeDeclaration object ) {
            return createTypeDeclarationAdapter();
        }

        @Override
        public Adapter caseVariableDeclarator( VariableDeclarator object ) {
            return createVariableDeclaratorAdapter();
        }

        @Override
        public Adapter caseBlockComment( BlockComment object ) {
            return createBlockCommentAdapter();
        }

        @Override
        public Adapter caseComment( Comment object ) {
            return createCommentAdapter();
        }

        @Override
        public Adapter caseJavadocComment( JavadocComment object ) {
            return createJavadocCommentAdapter();
        }

        @Override
        public Adapter caseLineComment( LineComment object ) {
            return createLineCommentAdapter();
        }

        @Override
        public Adapter caseAnnotationExpr( AnnotationExpr object ) {
            return createAnnotationExprAdapter();
        }

        @Override
        public Adapter caseArrayAccessExpr( ArrayAccessExpr object ) {
            return createArrayAccessExprAdapter();
        }

        @Override
        public Adapter caseArrayCreationExpr( ArrayCreationExpr object ) {
            return createArrayCreationExprAdapter();
        }

        @Override
        public Adapter caseArrayInitializerExpr( ArrayInitializerExpr object ) {
            return createArrayInitializerExprAdapter();
        }

        @Override
        public Adapter caseAssignExpr( AssignExpr object ) {
            return createAssignExprAdapter();
        }

        @Override
        public Adapter caseBinaryExpr( BinaryExpr object ) {
            return createBinaryExprAdapter();
        }

        @Override
        public Adapter caseBooleanLiteralExpr( BooleanLiteralExpr object ) {
            return createBooleanLiteralExprAdapter();
        }

        @Override
        public Adapter caseCastExpr( CastExpr object ) {
            return createCastExprAdapter();
        }

        @Override
        public Adapter caseCharLiteralExpr( CharLiteralExpr object ) {
            return createCharLiteralExprAdapter();
        }

        @Override
        public Adapter caseClassExpr( ClassExpr object ) {
            return createClassExprAdapter();
        }

        @Override
        public Adapter caseConditionalExpr( ConditionalExpr object ) {
            return createConditionalExprAdapter();
        }

        @Override
        public Adapter caseDoubleLiteralExpr( DoubleLiteralExpr object ) {
            return createDoubleLiteralExprAdapter();
        }

        @Override
        public Adapter caseEnclosedExpr( EnclosedExpr object ) {
            return createEnclosedExprAdapter();
        }

        @Override
        public Adapter caseExpression( Expression object ) {
            return createExpressionAdapter();
        }

        @Override
        public Adapter caseFieldAccessExpr( FieldAccessExpr object ) {
            return createFieldAccessExprAdapter();
        }

        @Override
        public Adapter caseInstanceOfExpr( InstanceOfExpr object ) {
            return createInstanceOfExprAdapter();
        }

        @Override
        public Adapter caseIntegerLiteralExpr( IntegerLiteralExpr object ) {
            return createIntegerLiteralExprAdapter();
        }

        @Override
        public Adapter caseLambdaExpr( LambdaExpr object ) {
            return createLambdaExprAdapter();
        }

        @Override
        public Adapter caseLiteralExpr( LiteralExpr object ) {
            return createLiteralExprAdapter();
        }

        @Override
        public Adapter caseLiteralStringValueExpr( LiteralStringValueExpr object ) {
            return createLiteralStringValueExprAdapter();
        }

        @Override
        public Adapter caseLongLiteralExpr( LongLiteralExpr object ) {
            return createLongLiteralExprAdapter();
        }

        @Override
        public Adapter caseMarkerAnnotationExpr( MarkerAnnotationExpr object ) {
            return createMarkerAnnotationExprAdapter();
        }

        @Override
        public Adapter caseMemberValuePair( MemberValuePair object ) {
            return createMemberValuePairAdapter();
        }

        @Override
        public Adapter caseMethodCallExpr( MethodCallExpr object ) {
            return createMethodCallExprAdapter();
        }

        @Override
        public Adapter caseMethodReferenceExpr( MethodReferenceExpr object ) {
            return createMethodReferenceExprAdapter();
        }

        @Override
        public Adapter caseName( Name object ) {
            return createNameAdapter();
        }

        @Override
        public Adapter caseNameExpr( NameExpr object ) {
            return createNameExprAdapter();
        }

        @Override
        public Adapter caseNormalAnnotationExpr( NormalAnnotationExpr object ) {
            return createNormalAnnotationExprAdapter();
        }

        @Override
        public Adapter caseNullLiteralExpr( NullLiteralExpr object ) {
            return createNullLiteralExprAdapter();
        }

        @Override
        public Adapter caseObjectCreationExpr( ObjectCreationExpr object ) {
            return createObjectCreationExprAdapter();
        }

        @Override
        public Adapter casePatternExpr( PatternExpr object ) {
            return createPatternExprAdapter();
        }

        @Override
        public Adapter caseSimpleName( SimpleName object ) {
            return createSimpleNameAdapter();
        }

        @Override
        public Adapter caseSingleMemberAnnotationExpr( SingleMemberAnnotationExpr object ) {
            return createSingleMemberAnnotationExprAdapter();
        }

        @Override
        public Adapter caseStringLiteralExpr( StringLiteralExpr object ) {
            return createStringLiteralExprAdapter();
        }

        @Override
        public Adapter caseSuperExpr( SuperExpr object ) {
            return createSuperExprAdapter();
        }

        @Override
        public Adapter caseSwitchExpr( SwitchExpr object ) {
            return createSwitchExprAdapter();
        }

        @Override
        public Adapter caseTextBlockLiteralExpr( TextBlockLiteralExpr object ) {
            return createTextBlockLiteralExprAdapter();
        }

        @Override
        public Adapter caseThisExpr( ThisExpr object ) {
            return createThisExprAdapter();
        }

        @Override
        public Adapter caseTypeExpr( TypeExpr object ) {
            return createTypeExprAdapter();
        }

        @Override
        public Adapter caseUnaryExpr( UnaryExpr object ) {
            return createUnaryExprAdapter();
        }

        @Override
        public Adapter caseVariableDeclarationExpr( VariableDeclarationExpr object ) {
            return createVariableDeclarationExprAdapter();
        }

        @Override
        public Adapter caseModuleDeclaration( ModuleDeclaration object ) {
            return createModuleDeclarationAdapter();
        }

        @Override
        public Adapter caseModuleDirective( ModuleDirective object ) {
            return createModuleDirectiveAdapter();
        }

        @Override
        public Adapter caseModuleExportsDirective( ModuleExportsDirective object ) {
            return createModuleExportsDirectiveAdapter();
        }

        @Override
        public Adapter caseModuleOpensDirective( ModuleOpensDirective object ) {
            return createModuleOpensDirectiveAdapter();
        }

        @Override
        public Adapter caseModuleProvidesDirective( ModuleProvidesDirective object ) {
            return createModuleProvidesDirectiveAdapter();
        }

        @Override
        public Adapter caseModuleRequiresDirective( ModuleRequiresDirective object ) {
            return createModuleRequiresDirectiveAdapter();
        }

        @Override
        public Adapter caseModuleUsesDirective( ModuleUsesDirective object ) {
            return createModuleUsesDirectiveAdapter();
        }

        @Override
        public Adapter caseNodeWithAnnotations( NodeWithAnnotations object ) {
            return createNodeWithAnnotationsAdapter();
        }

        @Override
        public Adapter caseNodeWithArguments( NodeWithArguments object ) {
            return createNodeWithArgumentsAdapter();
        }

        @Override
        public Adapter caseNodeWithBlockStmt( NodeWithBlockStmt object ) {
            return createNodeWithBlockStmtAdapter();
        }

        @Override
        public Adapter caseNodeWithBody( NodeWithBody object ) {
            return createNodeWithBodyAdapter();
        }

        @Override
        public Adapter caseNodeWithCondition( NodeWithCondition object ) {
            return createNodeWithConditionAdapter();
        }

        @Override
        public Adapter caseNodeWithExpression( NodeWithExpression object ) {
            return createNodeWithExpressionAdapter();
        }

        @Override
        public Adapter caseNodeWithExtends( NodeWithExtends object ) {
            return createNodeWithExtendsAdapter();
        }

        @Override
        public Adapter caseNodeWithIdentifier( NodeWithIdentifier object ) {
            return createNodeWithIdentifierAdapter();
        }

        @Override
        public Adapter caseNodeWithImplements( NodeWithImplements object ) {
            return createNodeWithImplementsAdapter();
        }

        @Override
        public Adapter caseNodeWithJavadoc( NodeWithJavadoc object ) {
            return createNodeWithJavadocAdapter();
        }

        @Override
        public Adapter caseNodeWithMembers( NodeWithMembers object ) {
            return createNodeWithMembersAdapter();
        }

        @Override
        public Adapter caseNodeWithModifiers( NodeWithModifiers object ) {
            return createNodeWithModifiersAdapter();
        }

        @Override
        public Adapter caseNodeWithName( NodeWithName object ) {
            return createNodeWithNameAdapter();
        }

        @Override
        public Adapter caseNodeWithLabel( NodeWithLabel object ) {
            return createNodeWithLabelAdapter();
        }

        @Override
        public Adapter caseNodeWithParameters( NodeWithParameters object ) {
            return createNodeWithParametersAdapter();
        }

        @Override
        public Adapter caseNodeWithRange( NodeWithRange object ) {
            return createNodeWithRangeAdapter();
        }

        @Override
        public < ScopeType > Adapter caseNodeWithScope( NodeWithScope< ScopeType > object ) {
            return createNodeWithScopeAdapter();
        }

        @Override
        public Adapter caseNodeWithSimpleName( NodeWithSimpleName object ) {
            return createNodeWithSimpleNameAdapter();
        }

        @Override
        public Adapter caseNodeWithStatements( NodeWithStatements object ) {
            return createNodeWithStatementsAdapter();
        }

        @Override
        public Adapter caseNodeWithThrownExceptions( NodeWithThrownExceptions object ) {
            return createNodeWithThrownExceptionsAdapter();
        }

        @Override
        public Adapter caseNodeWithTokenRange( NodeWithTokenRange object ) {
            return createNodeWithTokenRangeAdapter();
        }

        @Override
        public < TypeUsed > Adapter caseNodeWithType( NodeWithType< TypeUsed > object ) {
            return createNodeWithTypeAdapter();
        }

        @Override
        public Adapter caseNodeWithTypeArguments( NodeWithTypeArguments object ) {
            return createNodeWithTypeArgumentsAdapter();
        }

        @Override
        public Adapter caseNodeWithTypeParameters( NodeWithTypeParameters object ) {
            return createNodeWithTypeParametersAdapter();
        }

        @Override
        public Adapter caseNodeWithVariables( NodeWithVariables object ) {
            return createNodeWithVariablesAdapter();
        }

        @Override
        public Adapter caseSwitchNode( SwitchNode object ) {
            return createSwitchNodeAdapter();
        }

        @Override
        public Adapter caseNodeWithAbstractModifier( NodeWithAbstractModifier object ) {
            return createNodeWithAbstractModifierAdapter();
        }

        @Override
        public Adapter caseNodeWithAccessModifiers( NodeWithAccessModifiers object ) {
            return createNodeWithAccessModifiersAdapter();
        }

        @Override
        public Adapter caseNodeWithDefaultModifier( NodeWithDefaultModifier object ) {
            return createNodeWithDefaultModifierAdapter();
        }

        @Override
        public Adapter caseNodeWithFinalModifier( NodeWithFinalModifier object ) {
            return createNodeWithFinalModifierAdapter();
        }

        @Override
        public Adapter caseNodeWithNativeModifier( NodeWithNativeModifier object ) {
            return createNodeWithNativeModifierAdapter();
        }

        @Override
        public Adapter caseNodeWithPrivateModifier( NodeWithPrivateModifier object ) {
            return createNodeWithPrivateModifierAdapter();
        }

        @Override
        public Adapter caseNodeWithProtectedModifier( NodeWithProtectedModifier object ) {
            return createNodeWithProtectedModifierAdapter();
        }

        @Override
        public Adapter caseNodeWithPublicModifier( NodeWithPublicModifier object ) {
            return createNodeWithPublicModifierAdapter();
        }

        @Override
        public Adapter caseNodeWithStaticModifier( NodeWithStaticModifier object ) {
            return createNodeWithStaticModifierAdapter();
        }

        @Override
        public Adapter caseNodeWithSynchronizedModifier( NodeWithSynchronizedModifier object ) {
            return createNodeWithSynchronizedModifierAdapter();
        }

        @Override
        public Adapter caseNodeWithStrictfpModifier( NodeWithStrictfpModifier object ) {
            return createNodeWithStrictfpModifierAdapter();
        }

        @Override
        public Adapter caseNodeWithTransientModifier( NodeWithTransientModifier object ) {
            return createNodeWithTransientModifierAdapter();
        }

        @Override
        public Adapter caseNodeWithTransitiveModifier( NodeWithTransitiveModifier object ) {
            return createNodeWithTransitiveModifierAdapter();
        }

        @Override
        public Adapter caseNodeWithVolatileModifier( NodeWithVolatileModifier object ) {
            return createNodeWithVolatileModifierAdapter();
        }

        @Override
        public Adapter caseAssertStmt( AssertStmt object ) {
            return createAssertStmtAdapter();
        }

        @Override
        public Adapter caseBlockStmt( BlockStmt object ) {
            return createBlockStmtAdapter();
        }

        @Override
        public Adapter caseBreakStmt( BreakStmt object ) {
            return createBreakStmtAdapter();
        }

        @Override
        public Adapter caseCatchClause( CatchClause object ) {
            return createCatchClauseAdapter();
        }

        @Override
        public Adapter caseContinueStmt( ContinueStmt object ) {
            return createContinueStmtAdapter();
        }

        @Override
        public Adapter caseDoStmt( DoStmt object ) {
            return createDoStmtAdapter();
        }

        @Override
        public Adapter caseEmptyStmt( EmptyStmt object ) {
            return createEmptyStmtAdapter();
        }

        @Override
        public Adapter caseExplicitConstructorInvocationStmt( ExplicitConstructorInvocationStmt object ) {
            return createExplicitConstructorInvocationStmtAdapter();
        }

        @Override
        public Adapter caseExpressionStmt( ExpressionStmt object ) {
            return createExpressionStmtAdapter();
        }

        @Override
        public Adapter caseForEachStmt( ForEachStmt object ) {
            return createForEachStmtAdapter();
        }

        @Override
        public Adapter caseForStmt( ForStmt object ) {
            return createForStmtAdapter();
        }

        @Override
        public Adapter caseIfStmt( IfStmt object ) {
            return createIfStmtAdapter();
        }

        @Override
        public Adapter caseLabeledStmt( LabeledStmt object ) {
            return createLabeledStmtAdapter();
        }

        @Override
        public Adapter caseLocalClassDeclarationStmt( LocalClassDeclarationStmt object ) {
            return createLocalClassDeclarationStmtAdapter();
        }

        @Override
        public Adapter caseReturnStmt( ReturnStmt object ) {
            return createReturnStmtAdapter();
        }

        @Override
        public Adapter caseStatement( Statement object ) {
            return createStatementAdapter();
        }

        @Override
        public Adapter caseSwitchEntry( SwitchEntry object ) {
            return createSwitchEntryAdapter();
        }

        @Override
        public Adapter caseSwitchStmt( SwitchStmt object ) {
            return createSwitchStmtAdapter();
        }

        @Override
        public Adapter caseSynchronizedStmt( SynchronizedStmt object ) {
            return createSynchronizedStmtAdapter();
        }

        @Override
        public Adapter caseThrowStmt( ThrowStmt object ) {
            return createThrowStmtAdapter();
        }

        @Override
        public Adapter caseTryStmt( TryStmt object ) {
            return createTryStmtAdapter();
        }

        @Override
        public Adapter caseWhileStmt( WhileStmt object ) {
            return createWhileStmtAdapter();
        }

        @Override
        public Adapter caseYieldStmt( YieldStmt object ) {
            return createYieldStmtAdapter();
        }

        @Override
        public Adapter caseArrayType( ArrayType object ) {
            return createArrayTypeAdapter();
        }

        @Override
        public Adapter caseClassOrInterfaceType( ClassOrInterfaceType object ) {
            return createClassOrInterfaceTypeAdapter();
        }

        @Override
        public Adapter caseIntersectionType( IntersectionType object ) {
            return createIntersectionTypeAdapter();
        }

        @Override
        public Adapter casePrimitiveType( PrimitiveType object ) {
            return createPrimitiveTypeAdapter();
        }

        @Override
        public Adapter caseReferenceType( ReferenceType object ) {
            return createReferenceTypeAdapter();
        }

        @Override
        public Adapter caseType( Type object ) {
            return createTypeAdapter();
        }

        @Override
        public Adapter caseTypeParameter( TypeParameter object ) {
            return createTypeParameterAdapter();
        }

        @Override
        public Adapter caseUnionType( UnionType object ) {
            return createUnionTypeAdapter();
        }

        @Override
        public Adapter caseUnknownType( UnknownType object ) {
            return createUnknownTypeAdapter();
        }

        @Override
        public Adapter caseVarType( VarType object ) {
            return createVarTypeAdapter();
        }

        @Override
        public Adapter caseVoidType( VoidType object ) {
            return createVoidTypeAdapter();
        }

        @Override
        public Adapter caseWildcardType( WildcardType object ) {
            return createWildcardTypeAdapter();
        }

        @Override
        public Adapter caseProject( Project object ) {
            return createProjectAdapter();
        }

        @Override
        public Adapter casePackage( fr.centralesupelec.csd.ejava.Package object ) {
            return createPackageAdapter();
        }

        @Override
        public Adapter caseElement( Element object ) {
            return createElementAdapter();
        }

        @Override
        public Adapter defaultCase( EObject object ) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter( Notifier target ) {
        return modelSwitch.doSwitch( ( EObject ) target );
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.JavaNode <em>Java Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.JavaNode
     * @generated
     */
    public Adapter createJavaNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ArrayCreationLevel <em>Array Creation Level</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ArrayCreationLevel
     * @generated
     */
    public Adapter createArrayCreationLevelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.CompilationUnit <em>Compilation Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.CompilationUnit
     * @generated
     */
    public Adapter createCompilationUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ImportDeclaration <em>Import Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ImportDeclaration
     * @generated
     */
    public Adapter createImportDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.PackageDeclaration <em>Package Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.PackageDeclaration
     * @generated
     */
    public Adapter createPackageDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.AnnotationDeclaration <em>Annotation Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.AnnotationDeclaration
     * @generated
     */
    public Adapter createAnnotationDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.AnnotationMemberDeclaration <em>Annotation Member Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.AnnotationMemberDeclaration
     * @generated
     */
    public Adapter createAnnotationMemberDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.BodyDeclaration <em>Body Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.BodyDeclaration
     * @generated
     */
    public Adapter createBodyDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.CallableDeclaration <em>Callable Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.CallableDeclaration
     * @generated
     */
    public Adapter createCallableDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ClassOrInterfaceDeclaration <em>Class Or Interface Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ClassOrInterfaceDeclaration
     * @generated
     */
    public Adapter createClassOrInterfaceDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ConstructorDeclaration <em>Constructor Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ConstructorDeclaration
     * @generated
     */
    public Adapter createConstructorDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.EnumConstantDeclaration <em>Enum Constant Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.EnumConstantDeclaration
     * @generated
     */
    public Adapter createEnumConstantDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.EnumDeclaration <em>Enum Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.EnumDeclaration
     * @generated
     */
    public Adapter createEnumDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.FieldDeclaration <em>Field Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.FieldDeclaration
     * @generated
     */
    public Adapter createFieldDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.InitializerDeclaration <em>Initializer Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.InitializerDeclaration
     * @generated
     */
    public Adapter createInitializerDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.MethodDeclaration <em>Method Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.MethodDeclaration
     * @generated
     */
    public Adapter createMethodDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.Parameter
     * @generated
     */
    public Adapter createParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ReceiverParameter <em>Receiver Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ReceiverParameter
     * @generated
     */
    public Adapter createReceiverParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.TypeDeclaration <em>Type Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.TypeDeclaration
     * @generated
     */
    public Adapter createTypeDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.VariableDeclarator <em>Variable Declarator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.VariableDeclarator
     * @generated
     */
    public Adapter createVariableDeclaratorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.BlockComment <em>Block Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.BlockComment
     * @generated
     */
    public Adapter createBlockCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.Comment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.Comment
     * @generated
     */
    public Adapter createCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.JavadocComment <em>Javadoc Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.JavadocComment
     * @generated
     */
    public Adapter createJavadocCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.LineComment <em>Line Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.LineComment
     * @generated
     */
    public Adapter createLineCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.AnnotationExpr <em>Annotation Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.AnnotationExpr
     * @generated
     */
    public Adapter createAnnotationExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ArrayAccessExpr <em>Array Access Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ArrayAccessExpr
     * @generated
     */
    public Adapter createArrayAccessExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ArrayCreationExpr <em>Array Creation Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ArrayCreationExpr
     * @generated
     */
    public Adapter createArrayCreationExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ArrayInitializerExpr <em>Array Initializer Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ArrayInitializerExpr
     * @generated
     */
    public Adapter createArrayInitializerExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.AssignExpr <em>Assign Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.AssignExpr
     * @generated
     */
    public Adapter createAssignExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.BinaryExpr <em>Binary Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.BinaryExpr
     * @generated
     */
    public Adapter createBinaryExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.BooleanLiteralExpr <em>Boolean Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.BooleanLiteralExpr
     * @generated
     */
    public Adapter createBooleanLiteralExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.CastExpr <em>Cast Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.CastExpr
     * @generated
     */
    public Adapter createCastExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.CharLiteralExpr <em>Char Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.CharLiteralExpr
     * @generated
     */
    public Adapter createCharLiteralExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ClassExpr <em>Class Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ClassExpr
     * @generated
     */
    public Adapter createClassExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ConditionalExpr <em>Conditional Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ConditionalExpr
     * @generated
     */
    public Adapter createConditionalExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.DoubleLiteralExpr <em>Double Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.DoubleLiteralExpr
     * @generated
     */
    public Adapter createDoubleLiteralExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.EnclosedExpr <em>Enclosed Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.EnclosedExpr
     * @generated
     */
    public Adapter createEnclosedExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.Expression
     * @generated
     */
    public Adapter createExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.FieldAccessExpr <em>Field Access Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.FieldAccessExpr
     * @generated
     */
    public Adapter createFieldAccessExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.InstanceOfExpr <em>Instance Of Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.InstanceOfExpr
     * @generated
     */
    public Adapter createInstanceOfExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.IntegerLiteralExpr <em>Integer Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.IntegerLiteralExpr
     * @generated
     */
    public Adapter createIntegerLiteralExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.LambdaExpr <em>Lambda Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.LambdaExpr
     * @generated
     */
    public Adapter createLambdaExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.LiteralExpr <em>Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.LiteralExpr
     * @generated
     */
    public Adapter createLiteralExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.LiteralStringValueExpr <em>Literal String Value Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.LiteralStringValueExpr
     * @generated
     */
    public Adapter createLiteralStringValueExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.LongLiteralExpr <em>Long Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.LongLiteralExpr
     * @generated
     */
    public Adapter createLongLiteralExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.MarkerAnnotationExpr <em>Marker Annotation Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.MarkerAnnotationExpr
     * @generated
     */
    public Adapter createMarkerAnnotationExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.MemberValuePair <em>Member Value Pair</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.MemberValuePair
     * @generated
     */
    public Adapter createMemberValuePairAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.MethodCallExpr <em>Method Call Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.MethodCallExpr
     * @generated
     */
    public Adapter createMethodCallExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.MethodReferenceExpr <em>Method Reference Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.MethodReferenceExpr
     * @generated
     */
    public Adapter createMethodReferenceExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.Name <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.Name
     * @generated
     */
    public Adapter createNameAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NameExpr <em>Name Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NameExpr
     * @generated
     */
    public Adapter createNameExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NormalAnnotationExpr <em>Normal Annotation Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NormalAnnotationExpr
     * @generated
     */
    public Adapter createNormalAnnotationExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NullLiteralExpr <em>Null Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NullLiteralExpr
     * @generated
     */
    public Adapter createNullLiteralExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ObjectCreationExpr <em>Object Creation Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ObjectCreationExpr
     * @generated
     */
    public Adapter createObjectCreationExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.PatternExpr <em>Pattern Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.PatternExpr
     * @generated
     */
    public Adapter createPatternExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.SimpleName <em>Simple Name</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.SimpleName
     * @generated
     */
    public Adapter createSimpleNameAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.SingleMemberAnnotationExpr <em>Single Member Annotation Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.SingleMemberAnnotationExpr
     * @generated
     */
    public Adapter createSingleMemberAnnotationExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.StringLiteralExpr <em>String Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.StringLiteralExpr
     * @generated
     */
    public Adapter createStringLiteralExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.SuperExpr <em>Super Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.SuperExpr
     * @generated
     */
    public Adapter createSuperExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.SwitchExpr <em>Switch Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.SwitchExpr
     * @generated
     */
    public Adapter createSwitchExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.TextBlockLiteralExpr <em>Text Block Literal Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.TextBlockLiteralExpr
     * @generated
     */
    public Adapter createTextBlockLiteralExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ThisExpr <em>This Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ThisExpr
     * @generated
     */
    public Adapter createThisExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.TypeExpr <em>Type Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.TypeExpr
     * @generated
     */
    public Adapter createTypeExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.UnaryExpr <em>Unary Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.UnaryExpr
     * @generated
     */
    public Adapter createUnaryExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.VariableDeclarationExpr <em>Variable Declaration Expr</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.VariableDeclarationExpr
     * @generated
     */
    public Adapter createVariableDeclarationExprAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ModuleDeclaration <em>Module Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ModuleDeclaration
     * @generated
     */
    public Adapter createModuleDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ModuleDirective <em>Module Directive</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ModuleDirective
     * @generated
     */
    public Adapter createModuleDirectiveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ModuleExportsDirective <em>Module Exports Directive</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ModuleExportsDirective
     * @generated
     */
    public Adapter createModuleExportsDirectiveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ModuleOpensDirective <em>Module Opens Directive</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ModuleOpensDirective
     * @generated
     */
    public Adapter createModuleOpensDirectiveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ModuleProvidesDirective <em>Module Provides Directive</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ModuleProvidesDirective
     * @generated
     */
    public Adapter createModuleProvidesDirectiveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ModuleRequiresDirective <em>Module Requires Directive</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ModuleRequiresDirective
     * @generated
     */
    public Adapter createModuleRequiresDirectiveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ModuleUsesDirective <em>Module Uses Directive</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ModuleUsesDirective
     * @generated
     */
    public Adapter createModuleUsesDirectiveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithAnnotations <em>Node With Annotations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithAnnotations
     * @generated
     */
    public Adapter createNodeWithAnnotationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithArguments <em>Node With Arguments</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithArguments
     * @generated
     */
    public Adapter createNodeWithArgumentsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithBlockStmt <em>Node With Block Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithBlockStmt
     * @generated
     */
    public Adapter createNodeWithBlockStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithBody <em>Node With Body</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithBody
     * @generated
     */
    public Adapter createNodeWithBodyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithCondition <em>Node With Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithCondition
     * @generated
     */
    public Adapter createNodeWithConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithExpression <em>Node With Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithExpression
     * @generated
     */
    public Adapter createNodeWithExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithExtends <em>Node With Extends</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithExtends
     * @generated
     */
    public Adapter createNodeWithExtendsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithIdentifier <em>Node With Identifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithIdentifier
     * @generated
     */
    public Adapter createNodeWithIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithImplements <em>Node With Implements</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithImplements
     * @generated
     */
    public Adapter createNodeWithImplementsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithJavadoc <em>Node With Javadoc</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithJavadoc
     * @generated
     */
    public Adapter createNodeWithJavadocAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithMembers <em>Node With Members</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithMembers
     * @generated
     */
    public Adapter createNodeWithMembersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithModifiers <em>Node With Modifiers</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithModifiers
     * @generated
     */
    public Adapter createNodeWithModifiersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithName <em>Node With Name</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithName
     * @generated
     */
    public Adapter createNodeWithNameAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithLabel <em>Node With Label</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithLabel
     * @generated
     */
    public Adapter createNodeWithLabelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithParameters <em>Node With Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithParameters
     * @generated
     */
    public Adapter createNodeWithParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithRange <em>Node With Range</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithRange
     * @generated
     */
    public Adapter createNodeWithRangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithScope <em>Node With Scope</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithScope
     * @generated
     */
    public Adapter createNodeWithScopeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithSimpleName <em>Node With Simple Name</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithSimpleName
     * @generated
     */
    public Adapter createNodeWithSimpleNameAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithStatements <em>Node With Statements</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithStatements
     * @generated
     */
    public Adapter createNodeWithStatementsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithThrownExceptions <em>Node With Thrown Exceptions</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithThrownExceptions
     * @generated
     */
    public Adapter createNodeWithThrownExceptionsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithTokenRange <em>Node With Token Range</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithTokenRange
     * @generated
     */
    public Adapter createNodeWithTokenRangeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithType <em>Node With Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithType
     * @generated
     */
    public Adapter createNodeWithTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithTypeArguments <em>Node With Type Arguments</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithTypeArguments
     * @generated
     */
    public Adapter createNodeWithTypeArgumentsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithTypeParameters <em>Node With Type Parameters</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithTypeParameters
     * @generated
     */
    public Adapter createNodeWithTypeParametersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithVariables <em>Node With Variables</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithVariables
     * @generated
     */
    public Adapter createNodeWithVariablesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.SwitchNode <em>Switch Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.SwitchNode
     * @generated
     */
    public Adapter createSwitchNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithAbstractModifier <em>Node With Abstract Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithAbstractModifier
     * @generated
     */
    public Adapter createNodeWithAbstractModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithAccessModifiers <em>Node With Access Modifiers</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithAccessModifiers
     * @generated
     */
    public Adapter createNodeWithAccessModifiersAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithDefaultModifier <em>Node With Default Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithDefaultModifier
     * @generated
     */
    public Adapter createNodeWithDefaultModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithFinalModifier <em>Node With Final Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithFinalModifier
     * @generated
     */
    public Adapter createNodeWithFinalModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithNativeModifier <em>Node With Native Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithNativeModifier
     * @generated
     */
    public Adapter createNodeWithNativeModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithPrivateModifier <em>Node With Private Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithPrivateModifier
     * @generated
     */
    public Adapter createNodeWithPrivateModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithProtectedModifier <em>Node With Protected Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithProtectedModifier
     * @generated
     */
    public Adapter createNodeWithProtectedModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithPublicModifier <em>Node With Public Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithPublicModifier
     * @generated
     */
    public Adapter createNodeWithPublicModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithStaticModifier <em>Node With Static Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithStaticModifier
     * @generated
     */
    public Adapter createNodeWithStaticModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithSynchronizedModifier <em>Node With Synchronized Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithSynchronizedModifier
     * @generated
     */
    public Adapter createNodeWithSynchronizedModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithStrictfpModifier <em>Node With Strictfp Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithStrictfpModifier
     * @generated
     */
    public Adapter createNodeWithStrictfpModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithTransientModifier <em>Node With Transient Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithTransientModifier
     * @generated
     */
    public Adapter createNodeWithTransientModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithTransitiveModifier <em>Node With Transitive Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithTransitiveModifier
     * @generated
     */
    public Adapter createNodeWithTransitiveModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.NodeWithVolatileModifier <em>Node With Volatile Modifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.NodeWithVolatileModifier
     * @generated
     */
    public Adapter createNodeWithVolatileModifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.AssertStmt <em>Assert Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.AssertStmt
     * @generated
     */
    public Adapter createAssertStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.BlockStmt <em>Block Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.BlockStmt
     * @generated
     */
    public Adapter createBlockStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.BreakStmt <em>Break Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.BreakStmt
     * @generated
     */
    public Adapter createBreakStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.CatchClause <em>Catch Clause</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.CatchClause
     * @generated
     */
    public Adapter createCatchClauseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ContinueStmt <em>Continue Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ContinueStmt
     * @generated
     */
    public Adapter createContinueStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.DoStmt <em>Do Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.DoStmt
     * @generated
     */
    public Adapter createDoStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.EmptyStmt <em>Empty Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.EmptyStmt
     * @generated
     */
    public Adapter createEmptyStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ExplicitConstructorInvocationStmt <em>Explicit Constructor Invocation Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ExplicitConstructorInvocationStmt
     * @generated
     */
    public Adapter createExplicitConstructorInvocationStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ExpressionStmt <em>Expression Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ExpressionStmt
     * @generated
     */
    public Adapter createExpressionStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ForEachStmt <em>For Each Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ForEachStmt
     * @generated
     */
    public Adapter createForEachStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ForStmt <em>For Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ForStmt
     * @generated
     */
    public Adapter createForStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.IfStmt <em>If Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.IfStmt
     * @generated
     */
    public Adapter createIfStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.LabeledStmt <em>Labeled Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.LabeledStmt
     * @generated
     */
    public Adapter createLabeledStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.LocalClassDeclarationStmt <em>Local Class Declaration Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.LocalClassDeclarationStmt
     * @generated
     */
    public Adapter createLocalClassDeclarationStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ReturnStmt <em>Return Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ReturnStmt
     * @generated
     */
    public Adapter createReturnStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.Statement <em>Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.Statement
     * @generated
     */
    public Adapter createStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.SwitchEntry <em>Switch Entry</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.SwitchEntry
     * @generated
     */
    public Adapter createSwitchEntryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.SwitchStmt <em>Switch Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.SwitchStmt
     * @generated
     */
    public Adapter createSwitchStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.SynchronizedStmt <em>Synchronized Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.SynchronizedStmt
     * @generated
     */
    public Adapter createSynchronizedStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ThrowStmt <em>Throw Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ThrowStmt
     * @generated
     */
    public Adapter createThrowStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.TryStmt <em>Try Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.TryStmt
     * @generated
     */
    public Adapter createTryStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.WhileStmt <em>While Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.WhileStmt
     * @generated
     */
    public Adapter createWhileStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.YieldStmt <em>Yield Stmt</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.YieldStmt
     * @generated
     */
    public Adapter createYieldStmtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ArrayType <em>Array Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ArrayType
     * @generated
     */
    public Adapter createArrayTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ClassOrInterfaceType <em>Class Or Interface Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ClassOrInterfaceType
     * @generated
     */
    public Adapter createClassOrInterfaceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.IntersectionType <em>Intersection Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.IntersectionType
     * @generated
     */
    public Adapter createIntersectionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.PrimitiveType <em>Primitive Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.PrimitiveType
     * @generated
     */
    public Adapter createPrimitiveTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.ReferenceType <em>Reference Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.ReferenceType
     * @generated
     */
    public Adapter createReferenceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.Type <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.Type
     * @generated
     */
    public Adapter createTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.TypeParameter <em>Type Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.TypeParameter
     * @generated
     */
    public Adapter createTypeParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.UnionType <em>Union Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.UnionType
     * @generated
     */
    public Adapter createUnionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.UnknownType <em>Unknown Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.UnknownType
     * @generated
     */
    public Adapter createUnknownTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.VarType <em>Var Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.VarType
     * @generated
     */
    public Adapter createVarTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.VoidType <em>Void Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.VoidType
     * @generated
     */
    public Adapter createVoidTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.WildcardType <em>Wildcard Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.WildcardType
     * @generated
     */
    public Adapter createWildcardTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.Project <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.Project
     * @generated
     */
    public Adapter createProjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.Package <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.Package
     * @generated
     */
    public Adapter createPackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.ejava.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.ejava.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //EJavaAdapterFactory
