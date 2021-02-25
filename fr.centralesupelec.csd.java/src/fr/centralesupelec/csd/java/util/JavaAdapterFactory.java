/**
 */
package fr.centralesupelec.csd.java.util;

import fr.centralesupelec.csd.java.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.csd.java.JavaPackage
 * @generated
 */
public class JavaAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static JavaPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = JavaPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JavaSwitch<Adapter> modelSwitch =
		new JavaSwitch<Adapter>() {
            @Override
            public Adapter caseArrayCreationLevel(ArrayCreationLevel object) {
                return createArrayCreationLevelAdapter();
            }
            @Override
            public Adapter caseCompilationUnit(CompilationUnit object) {
                return createCompilationUnitAdapter();
            }
            @Override
            public Adapter caseImportDeclaration(ImportDeclaration object) {
                return createImportDeclarationAdapter();
            }
            @Override
            public Adapter caseModifier(Modifier object) {
                return createModifierAdapter();
            }
            @Override
            public Adapter casePackageDeclaration(PackageDeclaration object) {
                return createPackageDeclarationAdapter();
            }
            @Override
            public Adapter caseAnnotationDeclaration(AnnotationDeclaration object) {
                return createAnnotationDeclarationAdapter();
            }
            @Override
            public Adapter caseAnnotationMemberDeclaration(AnnotationMemberDeclaration object) {
                return createAnnotationMemberDeclarationAdapter();
            }
            @Override
            public Adapter caseBodyDeclaration(BodyDeclaration object) {
                return createBodyDeclarationAdapter();
            }
            @Override
            public Adapter caseCallableDeclaration(CallableDeclaration object) {
                return createCallableDeclarationAdapter();
            }
            @Override
            public Adapter caseClassOrInterfaceDeclaration(ClassOrInterfaceDeclaration object) {
                return createClassOrInterfaceDeclarationAdapter();
            }
            @Override
            public Adapter caseConstructorDeclaration(ConstructorDeclaration object) {
                return createConstructorDeclarationAdapter();
            }
            @Override
            public Adapter caseEnumConstantDeclaration(EnumConstantDeclaration object) {
                return createEnumConstantDeclarationAdapter();
            }
            @Override
            public Adapter caseEnumDeclaration(EnumDeclaration object) {
                return createEnumDeclarationAdapter();
            }
            @Override
            public Adapter caseFieldDeclaration(FieldDeclaration object) {
                return createFieldDeclarationAdapter();
            }
            @Override
            public Adapter caseInitializerDeclaration(InitializerDeclaration object) {
                return createInitializerDeclarationAdapter();
            }
            @Override
            public Adapter caseMethodDeclaration(MethodDeclaration object) {
                return createMethodDeclarationAdapter();
            }
            @Override
            public Adapter caseParameter(Parameter object) {
                return createParameterAdapter();
            }
            @Override
            public Adapter caseReceiverParameter(ReceiverParameter object) {
                return createReceiverParameterAdapter();
            }
            @Override
            public Adapter caseTypeDeclaration(TypeDeclaration object) {
                return createTypeDeclarationAdapter();
            }
            @Override
            public Adapter caseVariableDeclarator(VariableDeclarator object) {
                return createVariableDeclaratorAdapter();
            }
            @Override
            public Adapter caseBlockComment(BlockComment object) {
                return createBlockCommentAdapter();
            }
            @Override
            public Adapter caseComment(Comment object) {
                return createCommentAdapter();
            }
            @Override
            public Adapter caseJavadocComment(JavadocComment object) {
                return createJavadocCommentAdapter();
            }
            @Override
            public Adapter caseLineComment(LineComment object) {
                return createLineCommentAdapter();
            }
            @Override
            public Adapter caseAnnotationExpr(AnnotationExpr object) {
                return createAnnotationExprAdapter();
            }
            @Override
            public Adapter caseArrayAccessExpr(ArrayAccessExpr object) {
                return createArrayAccessExprAdapter();
            }
            @Override
            public Adapter caseArrayCreationExpr(ArrayCreationExpr object) {
                return createArrayCreationExprAdapter();
            }
            @Override
            public Adapter caseArrayInitializerExpr(ArrayInitializerExpr object) {
                return createArrayInitializerExprAdapter();
            }
            @Override
            public Adapter caseAssignExpr(AssignExpr object) {
                return createAssignExprAdapter();
            }
            @Override
            public Adapter caseBinaryExpr(BinaryExpr object) {
                return createBinaryExprAdapter();
            }
            @Override
            public Adapter caseBooleanLiteralExpr(BooleanLiteralExpr object) {
                return createBooleanLiteralExprAdapter();
            }
            @Override
            public Adapter caseCastExpr(CastExpr object) {
                return createCastExprAdapter();
            }
            @Override
            public Adapter caseCharLiteralExpr(CharLiteralExpr object) {
                return createCharLiteralExprAdapter();
            }
            @Override
            public Adapter caseClassExpr(ClassExpr object) {
                return createClassExprAdapter();
            }
            @Override
            public Adapter caseConditionalExpr(ConditionalExpr object) {
                return createConditionalExprAdapter();
            }
            @Override
            public Adapter caseDoubleLiteralExpr(DoubleLiteralExpr object) {
                return createDoubleLiteralExprAdapter();
            }
            @Override
            public Adapter caseEnclosedExpr(EnclosedExpr object) {
                return createEnclosedExprAdapter();
            }
            @Override
            public Adapter caseExpression(Expression object) {
                return createExpressionAdapter();
            }
            @Override
            public Adapter caseFieldAccessExpr(FieldAccessExpr object) {
                return createFieldAccessExprAdapter();
            }
            @Override
            public Adapter caseInstanceOfExpr(InstanceOfExpr object) {
                return createInstanceOfExprAdapter();
            }
            @Override
            public Adapter caseIntegerLiteralExpr(IntegerLiteralExpr object) {
                return createIntegerLiteralExprAdapter();
            }
            @Override
            public Adapter caseLambdaExpr(LambdaExpr object) {
                return createLambdaExprAdapter();
            }
            @Override
            public Adapter caseLiteralExpr(LiteralExpr object) {
                return createLiteralExprAdapter();
            }
            @Override
            public Adapter caseLiteralStringValueExpr(LiteralStringValueExpr object) {
                return createLiteralStringValueExprAdapter();
            }
            @Override
            public Adapter caseLongLiteralExpr(LongLiteralExpr object) {
                return createLongLiteralExprAdapter();
            }
            @Override
            public Adapter caseMarkerAnnotationExpr(MarkerAnnotationExpr object) {
                return createMarkerAnnotationExprAdapter();
            }
            @Override
            public Adapter caseMemberValuePair(MemberValuePair object) {
                return createMemberValuePairAdapter();
            }
            @Override
            public Adapter caseMethodCallExpr(MethodCallExpr object) {
                return createMethodCallExprAdapter();
            }
            @Override
            public Adapter caseMethodReferenceExpr(MethodReferenceExpr object) {
                return createMethodReferenceExprAdapter();
            }
            @Override
            public Adapter caseName(Name object) {
                return createNameAdapter();
            }
            @Override
            public Adapter caseNameExpr(NameExpr object) {
                return createNameExprAdapter();
            }
            @Override
            public Adapter caseNormalAnnotationExpr(NormalAnnotationExpr object) {
                return createNormalAnnotationExprAdapter();
            }
            @Override
            public Adapter caseNullLiteralExpr(NullLiteralExpr object) {
                return createNullLiteralExprAdapter();
            }
            @Override
            public Adapter caseObjectCreationExpr(ObjectCreationExpr object) {
                return createObjectCreationExprAdapter();
            }
            @Override
            public Adapter casePatternExpr(PatternExpr object) {
                return createPatternExprAdapter();
            }
            @Override
            public Adapter caseSimpleName(SimpleName object) {
                return createSimpleNameAdapter();
            }
            @Override
            public Adapter caseSingleMemberAnnotationExpr(SingleMemberAnnotationExpr object) {
                return createSingleMemberAnnotationExprAdapter();
            }
            @Override
            public Adapter caseStringLiteralExpr(StringLiteralExpr object) {
                return createStringLiteralExprAdapter();
            }
            @Override
            public Adapter caseSuperExpr(SuperExpr object) {
                return createSuperExprAdapter();
            }
            @Override
            public Adapter caseSwitchExpr(SwitchExpr object) {
                return createSwitchExprAdapter();
            }
            @Override
            public Adapter caseTextBlockLiteralExpr(TextBlockLiteralExpr object) {
                return createTextBlockLiteralExprAdapter();
            }
            @Override
            public Adapter caseThisExpr(ThisExpr object) {
                return createThisExprAdapter();
            }
            @Override
            public Adapter caseTypeExpr(TypeExpr object) {
                return createTypeExprAdapter();
            }
            @Override
            public Adapter caseUnaryExpr(UnaryExpr object) {
                return createUnaryExprAdapter();
            }
            @Override
            public Adapter caseVariableDeclarationExpr(VariableDeclarationExpr object) {
                return createVariableDeclarationExprAdapter();
            }
            @Override
            public Adapter caseModuleDeclaration(ModuleDeclaration object) {
                return createModuleDeclarationAdapter();
            }
            @Override
            public Adapter caseModuleDirective(ModuleDirective object) {
                return createModuleDirectiveAdapter();
            }
            @Override
            public Adapter caseModuleExportsDirective(ModuleExportsDirective object) {
                return createModuleExportsDirectiveAdapter();
            }
            @Override
            public Adapter caseModuleOpensDirective(ModuleOpensDirective object) {
                return createModuleOpensDirectiveAdapter();
            }
            @Override
            public Adapter caseModuleProvidesDirective(ModuleProvidesDirective object) {
                return createModuleProvidesDirectiveAdapter();
            }
            @Override
            public Adapter caseModuleRequiresDirective(ModuleRequiresDirective object) {
                return createModuleRequiresDirectiveAdapter();
            }
            @Override
            public Adapter caseModuleUsesDirective(ModuleUsesDirective object) {
                return createModuleUsesDirectiveAdapter();
            }
            @Override
            public Adapter caseNodeWithAnnotations(NodeWithAnnotations object) {
                return createNodeWithAnnotationsAdapter();
            }
            @Override
            public Adapter caseNodeWithArguments(NodeWithArguments object) {
                return createNodeWithArgumentsAdapter();
            }
            @Override
            public Adapter caseNodeWithBlockStmt(NodeWithBlockStmt object) {
                return createNodeWithBlockStmtAdapter();
            }
            @Override
            public Adapter caseNodeWithBody(NodeWithBody object) {
                return createNodeWithBodyAdapter();
            }
            @Override
            public Adapter caseNodeWithCondition(NodeWithCondition object) {
                return createNodeWithConditionAdapter();
            }
            @Override
            public Adapter caseNodeWithExpression(NodeWithExpression object) {
                return createNodeWithExpressionAdapter();
            }
            @Override
            public Adapter caseNodeWithExtends(NodeWithExtends object) {
                return createNodeWithExtendsAdapter();
            }
            @Override
            public Adapter caseNodeWithIdentifier(NodeWithIdentifier object) {
                return createNodeWithIdentifierAdapter();
            }
            @Override
            public Adapter caseNodeWithImplements(NodeWithImplements object) {
                return createNodeWithImplementsAdapter();
            }
            @Override
            public Adapter caseNodeWithJavadoc(NodeWithJavadoc object) {
                return createNodeWithJavadocAdapter();
            }
            @Override
            public Adapter caseNodeWithMembers(NodeWithMembers object) {
                return createNodeWithMembersAdapter();
            }
            @Override
            public Adapter caseNodeWithModifiers(NodeWithModifiers object) {
                return createNodeWithModifiersAdapter();
            }
            @Override
            public Adapter caseNodeWithName(NodeWithName object) {
                return createNodeWithNameAdapter();
            }
            @Override
            public Adapter caseNodeWithLabel(NodeWithLabel object) {
                return createNodeWithLabelAdapter();
            }
            @Override
            public Adapter caseNodeWithParameters(NodeWithParameters object) {
                return createNodeWithParametersAdapter();
            }
            @Override
            public Adapter caseNodeWithRange(NodeWithRange object) {
                return createNodeWithRangeAdapter();
            }
            @Override
            public <ScopeType> Adapter caseNodeWithScope(NodeWithScope<ScopeType> object) {
                return createNodeWithScopeAdapter();
            }
            @Override
            public Adapter caseNodeWithSimpleName(NodeWithSimpleName object) {
                return createNodeWithSimpleNameAdapter();
            }
            @Override
            public Adapter caseNodeWithStatements(NodeWithStatements object) {
                return createNodeWithStatementsAdapter();
            }
            @Override
            public Adapter caseNodeWithThrownExceptions(NodeWithThrownExceptions object) {
                return createNodeWithThrownExceptionsAdapter();
            }
            @Override
            public Adapter caseNodeWithTokenRange(NodeWithTokenRange object) {
                return createNodeWithTokenRangeAdapter();
            }
            @Override
            public <TypeUsed> Adapter caseNodeWithType(NodeWithType<TypeUsed> object) {
                return createNodeWithTypeAdapter();
            }
            @Override
            public Adapter caseNodeWithTypeArguments(NodeWithTypeArguments object) {
                return createNodeWithTypeArgumentsAdapter();
            }
            @Override
            public Adapter caseNodeWithTypeParameters(NodeWithTypeParameters object) {
                return createNodeWithTypeParametersAdapter();
            }
            @Override
            public Adapter caseNodeWithVariables(NodeWithVariables object) {
                return createNodeWithVariablesAdapter();
            }
            @Override
            public Adapter caseSwitchNode(SwitchNode object) {
                return createSwitchNodeAdapter();
            }
            @Override
            public Adapter caseNodeWithAbstractModifier(NodeWithAbstractModifier object) {
                return createNodeWithAbstractModifierAdapter();
            }
            @Override
            public Adapter caseNodeWithAccessModifiers(NodeWithAccessModifiers object) {
                return createNodeWithAccessModifiersAdapter();
            }
            @Override
            public Adapter caseNodeWithDefaultModifier(NodeWithDefaultModifier object) {
                return createNodeWithDefaultModifierAdapter();
            }
            @Override
            public Adapter caseNodeWithFinalModifier(NodeWithFinalModifier object) {
                return createNodeWithFinalModifierAdapter();
            }
            @Override
            public Adapter caseNodeWithNativeModifier(NodeWithNativeModifier object) {
                return createNodeWithNativeModifierAdapter();
            }
            @Override
            public Adapter caseNodeWithPrivateModifier(NodeWithPrivateModifier object) {
                return createNodeWithPrivateModifierAdapter();
            }
            @Override
            public Adapter caseNodeWithProtectedModifier(NodeWithProtectedModifier object) {
                return createNodeWithProtectedModifierAdapter();
            }
            @Override
            public Adapter caseNodeWithPublicModifier(NodeWithPublicModifier object) {
                return createNodeWithPublicModifierAdapter();
            }
            @Override
            public Adapter caseNodeWithStaticModifier(NodeWithStaticModifier object) {
                return createNodeWithStaticModifierAdapter();
            }
            @Override
            public Adapter caseNodeWithSynchronizedModifier(NodeWithSynchronizedModifier object) {
                return createNodeWithSynchronizedModifierAdapter();
            }
            @Override
            public Adapter caseNodeWithStrictfpModifier(NodeWithStrictfpModifier object) {
                return createNodeWithStrictfpModifierAdapter();
            }
            @Override
            public Adapter caseNodeWithTransientModifier(NodeWithTransientModifier object) {
                return createNodeWithTransientModifierAdapter();
            }
            @Override
            public Adapter caseNodeWithTransitiveModifier(NodeWithTransitiveModifier object) {
                return createNodeWithTransitiveModifierAdapter();
            }
            @Override
            public Adapter caseNodeWithVolatileModifier(NodeWithVolatileModifier object) {
                return createNodeWithVolatileModifierAdapter();
            }
            @Override
            public Adapter caseAssertStmt(AssertStmt object) {
                return createAssertStmtAdapter();
            }
            @Override
            public Adapter caseBlockStmt(BlockStmt object) {
                return createBlockStmtAdapter();
            }
            @Override
            public Adapter caseBreakStmt(BreakStmt object) {
                return createBreakStmtAdapter();
            }
            @Override
            public Adapter caseCatchClause(CatchClause object) {
                return createCatchClauseAdapter();
            }
            @Override
            public Adapter caseContinueStmt(ContinueStmt object) {
                return createContinueStmtAdapter();
            }
            @Override
            public Adapter caseDoStmt(DoStmt object) {
                return createDoStmtAdapter();
            }
            @Override
            public Adapter caseEmptyStmt(EmptyStmt object) {
                return createEmptyStmtAdapter();
            }
            @Override
            public Adapter caseExplicitConstructorInvocationStmt(ExplicitConstructorInvocationStmt object) {
                return createExplicitConstructorInvocationStmtAdapter();
            }
            @Override
            public Adapter caseExpressionStmt(ExpressionStmt object) {
                return createExpressionStmtAdapter();
            }
            @Override
            public Adapter caseForEachStmt(ForEachStmt object) {
                return createForEachStmtAdapter();
            }
            @Override
            public Adapter caseForStmt(ForStmt object) {
                return createForStmtAdapter();
            }
            @Override
            public Adapter caseIfStmt(IfStmt object) {
                return createIfStmtAdapter();
            }
            @Override
            public Adapter caseLabeledStmt(LabeledStmt object) {
                return createLabeledStmtAdapter();
            }
            @Override
            public Adapter caseLocalClassDeclarationStmt(LocalClassDeclarationStmt object) {
                return createLocalClassDeclarationStmtAdapter();
            }
            @Override
            public Adapter caseReturnStmt(ReturnStmt object) {
                return createReturnStmtAdapter();
            }
            @Override
            public Adapter caseStatement(Statement object) {
                return createStatementAdapter();
            }
            @Override
            public Adapter caseSwitchEntry(SwitchEntry object) {
                return createSwitchEntryAdapter();
            }
            @Override
            public Adapter caseSwitchStmt(SwitchStmt object) {
                return createSwitchStmtAdapter();
            }
            @Override
            public Adapter caseSynchronizedStmt(SynchronizedStmt object) {
                return createSynchronizedStmtAdapter();
            }
            @Override
            public Adapter caseThrowStmt(ThrowStmt object) {
                return createThrowStmtAdapter();
            }
            @Override
            public Adapter caseTryStmt(TryStmt object) {
                return createTryStmtAdapter();
            }
            @Override
            public Adapter caseWhileStmt(WhileStmt object) {
                return createWhileStmtAdapter();
            }
            @Override
            public Adapter caseYieldStmt(YieldStmt object) {
                return createYieldStmtAdapter();
            }
            @Override
            public Adapter caseArrayType(ArrayType object) {
                return createArrayTypeAdapter();
            }
            @Override
            public Adapter caseClassOrInterfaceType(ClassOrInterfaceType object) {
                return createClassOrInterfaceTypeAdapter();
            }
            @Override
            public Adapter caseIntersectionType(IntersectionType object) {
                return createIntersectionTypeAdapter();
            }
            @Override
            public Adapter casePrimitiveType(PrimitiveType object) {
                return createPrimitiveTypeAdapter();
            }
            @Override
            public Adapter caseReferenceType(ReferenceType object) {
                return createReferenceTypeAdapter();
            }
            @Override
            public Adapter caseType(Type object) {
                return createTypeAdapter();
            }
            @Override
            public Adapter caseTypeParameter(TypeParameter object) {
                return createTypeParameterAdapter();
            }
            @Override
            public Adapter caseUnionType(UnionType object) {
                return createUnionTypeAdapter();
            }
            @Override
            public Adapter caseUnknownType(UnknownType object) {
                return createUnknownTypeAdapter();
            }
            @Override
            public Adapter caseVarType(VarType object) {
                return createVarTypeAdapter();
            }
            @Override
            public Adapter caseVoidType(VoidType object) {
                return createVoidTypeAdapter();
            }
            @Override
            public Adapter caseWildcardType(WildcardType object) {
                return createWildcardTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ArrayCreationLevel <em>Array Creation Level</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ArrayCreationLevel
     * @generated
     */
	public Adapter createArrayCreationLevelAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.CompilationUnit <em>Compilation Unit</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.CompilationUnit
     * @generated
     */
	public Adapter createCompilationUnitAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ImportDeclaration <em>Import Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ImportDeclaration
     * @generated
     */
	public Adapter createImportDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.Modifier <em>Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.Modifier
     * @generated
     */
	public Adapter createModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.PackageDeclaration <em>Package Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.PackageDeclaration
     * @generated
     */
	public Adapter createPackageDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.AnnotationDeclaration <em>Annotation Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.AnnotationDeclaration
     * @generated
     */
	public Adapter createAnnotationDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.AnnotationMemberDeclaration <em>Annotation Member Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.AnnotationMemberDeclaration
     * @generated
     */
	public Adapter createAnnotationMemberDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.BodyDeclaration <em>Body Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.BodyDeclaration
     * @generated
     */
	public Adapter createBodyDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.CallableDeclaration <em>Callable Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.CallableDeclaration
     * @generated
     */
	public Adapter createCallableDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ClassOrInterfaceDeclaration <em>Class Or Interface Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ClassOrInterfaceDeclaration
     * @generated
     */
	public Adapter createClassOrInterfaceDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ConstructorDeclaration <em>Constructor Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ConstructorDeclaration
     * @generated
     */
	public Adapter createConstructorDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.EnumConstantDeclaration <em>Enum Constant Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.EnumConstantDeclaration
     * @generated
     */
	public Adapter createEnumConstantDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.EnumDeclaration <em>Enum Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.EnumDeclaration
     * @generated
     */
	public Adapter createEnumDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.FieldDeclaration <em>Field Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.FieldDeclaration
     * @generated
     */
	public Adapter createFieldDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.InitializerDeclaration <em>Initializer Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.InitializerDeclaration
     * @generated
     */
	public Adapter createInitializerDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.MethodDeclaration <em>Method Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.MethodDeclaration
     * @generated
     */
	public Adapter createMethodDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.Parameter
     * @generated
     */
	public Adapter createParameterAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ReceiverParameter <em>Receiver Parameter</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ReceiverParameter
     * @generated
     */
	public Adapter createReceiverParameterAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.TypeDeclaration <em>Type Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.TypeDeclaration
     * @generated
     */
	public Adapter createTypeDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.VariableDeclarator <em>Variable Declarator</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.VariableDeclarator
     * @generated
     */
	public Adapter createVariableDeclaratorAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.BlockComment <em>Block Comment</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.BlockComment
     * @generated
     */
	public Adapter createBlockCommentAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.Comment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.Comment
     * @generated
     */
	public Adapter createCommentAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.JavadocComment <em>Javadoc Comment</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.JavadocComment
     * @generated
     */
	public Adapter createJavadocCommentAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.LineComment <em>Line Comment</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.LineComment
     * @generated
     */
	public Adapter createLineCommentAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.AnnotationExpr <em>Annotation Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.AnnotationExpr
     * @generated
     */
	public Adapter createAnnotationExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ArrayAccessExpr <em>Array Access Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ArrayAccessExpr
     * @generated
     */
	public Adapter createArrayAccessExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ArrayCreationExpr <em>Array Creation Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ArrayCreationExpr
     * @generated
     */
	public Adapter createArrayCreationExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ArrayInitializerExpr <em>Array Initializer Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ArrayInitializerExpr
     * @generated
     */
	public Adapter createArrayInitializerExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.AssignExpr <em>Assign Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.AssignExpr
     * @generated
     */
	public Adapter createAssignExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.BinaryExpr <em>Binary Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.BinaryExpr
     * @generated
     */
	public Adapter createBinaryExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.BooleanLiteralExpr <em>Boolean Literal Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.BooleanLiteralExpr
     * @generated
     */
	public Adapter createBooleanLiteralExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.CastExpr <em>Cast Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.CastExpr
     * @generated
     */
	public Adapter createCastExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.CharLiteralExpr <em>Char Literal Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.CharLiteralExpr
     * @generated
     */
	public Adapter createCharLiteralExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ClassExpr <em>Class Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ClassExpr
     * @generated
     */
	public Adapter createClassExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ConditionalExpr <em>Conditional Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ConditionalExpr
     * @generated
     */
	public Adapter createConditionalExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.DoubleLiteralExpr <em>Double Literal Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.DoubleLiteralExpr
     * @generated
     */
	public Adapter createDoubleLiteralExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.EnclosedExpr <em>Enclosed Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.EnclosedExpr
     * @generated
     */
	public Adapter createEnclosedExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.Expression
     * @generated
     */
	public Adapter createExpressionAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.FieldAccessExpr <em>Field Access Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.FieldAccessExpr
     * @generated
     */
	public Adapter createFieldAccessExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.InstanceOfExpr <em>Instance Of Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.InstanceOfExpr
     * @generated
     */
	public Adapter createInstanceOfExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.IntegerLiteralExpr <em>Integer Literal Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.IntegerLiteralExpr
     * @generated
     */
	public Adapter createIntegerLiteralExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.LambdaExpr <em>Lambda Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.LambdaExpr
     * @generated
     */
	public Adapter createLambdaExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.LiteralExpr <em>Literal Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.LiteralExpr
     * @generated
     */
	public Adapter createLiteralExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.LiteralStringValueExpr <em>Literal String Value Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.LiteralStringValueExpr
     * @generated
     */
	public Adapter createLiteralStringValueExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.LongLiteralExpr <em>Long Literal Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.LongLiteralExpr
     * @generated
     */
	public Adapter createLongLiteralExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.MarkerAnnotationExpr <em>Marker Annotation Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.MarkerAnnotationExpr
     * @generated
     */
	public Adapter createMarkerAnnotationExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.MemberValuePair <em>Member Value Pair</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.MemberValuePair
     * @generated
     */
	public Adapter createMemberValuePairAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.MethodCallExpr <em>Method Call Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.MethodCallExpr
     * @generated
     */
	public Adapter createMethodCallExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.MethodReferenceExpr <em>Method Reference Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.MethodReferenceExpr
     * @generated
     */
	public Adapter createMethodReferenceExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.Name <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.Name
     * @generated
     */
	public Adapter createNameAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NameExpr <em>Name Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NameExpr
     * @generated
     */
	public Adapter createNameExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NormalAnnotationExpr <em>Normal Annotation Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NormalAnnotationExpr
     * @generated
     */
	public Adapter createNormalAnnotationExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NullLiteralExpr <em>Null Literal Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NullLiteralExpr
     * @generated
     */
	public Adapter createNullLiteralExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ObjectCreationExpr <em>Object Creation Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ObjectCreationExpr
     * @generated
     */
	public Adapter createObjectCreationExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.PatternExpr <em>Pattern Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.PatternExpr
     * @generated
     */
	public Adapter createPatternExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.SimpleName <em>Simple Name</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.SimpleName
     * @generated
     */
	public Adapter createSimpleNameAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.SingleMemberAnnotationExpr <em>Single Member Annotation Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.SingleMemberAnnotationExpr
     * @generated
     */
	public Adapter createSingleMemberAnnotationExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.StringLiteralExpr <em>String Literal Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.StringLiteralExpr
     * @generated
     */
	public Adapter createStringLiteralExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.SuperExpr <em>Super Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.SuperExpr
     * @generated
     */
	public Adapter createSuperExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.SwitchExpr <em>Switch Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.SwitchExpr
     * @generated
     */
	public Adapter createSwitchExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.TextBlockLiteralExpr <em>Text Block Literal Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.TextBlockLiteralExpr
     * @generated
     */
	public Adapter createTextBlockLiteralExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ThisExpr <em>This Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ThisExpr
     * @generated
     */
	public Adapter createThisExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.TypeExpr <em>Type Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.TypeExpr
     * @generated
     */
	public Adapter createTypeExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.VariableDeclarationExpr <em>Variable Declaration Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.VariableDeclarationExpr
     * @generated
     */
	public Adapter createVariableDeclarationExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ModuleDeclaration <em>Module Declaration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ModuleDeclaration
     * @generated
     */
	public Adapter createModuleDeclarationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ModuleDirective <em>Module Directive</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ModuleDirective
     * @generated
     */
	public Adapter createModuleDirectiveAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ModuleExportsDirective <em>Module Exports Directive</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ModuleExportsDirective
     * @generated
     */
	public Adapter createModuleExportsDirectiveAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ModuleOpensDirective <em>Module Opens Directive</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ModuleOpensDirective
     * @generated
     */
	public Adapter createModuleOpensDirectiveAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ModuleProvidesDirective <em>Module Provides Directive</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ModuleProvidesDirective
     * @generated
     */
	public Adapter createModuleProvidesDirectiveAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ModuleRequiresDirective <em>Module Requires Directive</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ModuleRequiresDirective
     * @generated
     */
	public Adapter createModuleRequiresDirectiveAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ModuleUsesDirective <em>Module Uses Directive</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ModuleUsesDirective
     * @generated
     */
	public Adapter createModuleUsesDirectiveAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithAnnotations <em>Node With Annotations</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithAnnotations
     * @generated
     */
	public Adapter createNodeWithAnnotationsAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithArguments <em>Node With Arguments</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithArguments
     * @generated
     */
	public Adapter createNodeWithArgumentsAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithBlockStmt <em>Node With Block Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithBlockStmt
     * @generated
     */
	public Adapter createNodeWithBlockStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithBody <em>Node With Body</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithBody
     * @generated
     */
	public Adapter createNodeWithBodyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithCondition <em>Node With Condition</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithCondition
     * @generated
     */
	public Adapter createNodeWithConditionAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithExpression <em>Node With Expression</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithExpression
     * @generated
     */
	public Adapter createNodeWithExpressionAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithExtends <em>Node With Extends</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithExtends
     * @generated
     */
	public Adapter createNodeWithExtendsAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithIdentifier <em>Node With Identifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithIdentifier
     * @generated
     */
	public Adapter createNodeWithIdentifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithImplements <em>Node With Implements</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithImplements
     * @generated
     */
	public Adapter createNodeWithImplementsAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithJavadoc <em>Node With Javadoc</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithJavadoc
     * @generated
     */
	public Adapter createNodeWithJavadocAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithMembers <em>Node With Members</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithMembers
     * @generated
     */
	public Adapter createNodeWithMembersAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithModifiers <em>Node With Modifiers</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithModifiers
     * @generated
     */
	public Adapter createNodeWithModifiersAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithName <em>Node With Name</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithName
     * @generated
     */
	public Adapter createNodeWithNameAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithLabel <em>Node With Label</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithLabel
     * @generated
     */
	public Adapter createNodeWithLabelAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithParameters <em>Node With Parameters</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithParameters
     * @generated
     */
	public Adapter createNodeWithParametersAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithRange <em>Node With Range</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithRange
     * @generated
     */
	public Adapter createNodeWithRangeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithScope <em>Node With Scope</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithScope
     * @generated
     */
	public Adapter createNodeWithScopeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithSimpleName <em>Node With Simple Name</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithSimpleName
     * @generated
     */
	public Adapter createNodeWithSimpleNameAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithStatements <em>Node With Statements</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithStatements
     * @generated
     */
	public Adapter createNodeWithStatementsAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithThrownExceptions <em>Node With Thrown Exceptions</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithThrownExceptions
     * @generated
     */
	public Adapter createNodeWithThrownExceptionsAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithTokenRange <em>Node With Token Range</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithTokenRange
     * @generated
     */
	public Adapter createNodeWithTokenRangeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithType <em>Node With Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithType
     * @generated
     */
	public Adapter createNodeWithTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithTypeArguments <em>Node With Type Arguments</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithTypeArguments
     * @generated
     */
	public Adapter createNodeWithTypeArgumentsAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithTypeParameters <em>Node With Type Parameters</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithTypeParameters
     * @generated
     */
	public Adapter createNodeWithTypeParametersAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithVariables <em>Node With Variables</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithVariables
     * @generated
     */
	public Adapter createNodeWithVariablesAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.SwitchNode <em>Switch Node</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.SwitchNode
     * @generated
     */
	public Adapter createSwitchNodeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ClassOrInterfaceType <em>Class Or Interface Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ClassOrInterfaceType
     * @generated
     */
	public Adapter createClassOrInterfaceTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.IntersectionType <em>Intersection Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.IntersectionType
     * @generated
     */
	public Adapter createIntersectionTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.PrimitiveType <em>Primitive Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.PrimitiveType
     * @generated
     */
	public Adapter createPrimitiveTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.UnaryExpr <em>Unary Expr</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.UnaryExpr
     * @generated
     */
	public Adapter createUnaryExprAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.TypeParameter <em>Type Parameter</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.TypeParameter
     * @generated
     */
	public Adapter createTypeParameterAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.UnionType <em>Union Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.UnionType
     * @generated
     */
	public Adapter createUnionTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.UnknownType <em>Unknown Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.UnknownType
     * @generated
     */
	public Adapter createUnknownTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.VarType <em>Var Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.VarType
     * @generated
     */
	public Adapter createVarTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.VoidType <em>Void Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.VoidType
     * @generated
     */
	public Adapter createVoidTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.WildcardType <em>Wildcard Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.WildcardType
     * @generated
     */
	public Adapter createWildcardTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.Type <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.Type
     * @generated
     */
	public Adapter createTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ReferenceType <em>Reference Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ReferenceType
     * @generated
     */
	public Adapter createReferenceTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.BlockStmt <em>Block Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.BlockStmt
     * @generated
     */
	public Adapter createBlockStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.Statement <em>Statement</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.Statement
     * @generated
     */
	public Adapter createStatementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.AssertStmt <em>Assert Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.AssertStmt
     * @generated
     */
	public Adapter createAssertStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.BreakStmt <em>Break Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.BreakStmt
     * @generated
     */
	public Adapter createBreakStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.CatchClause <em>Catch Clause</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.CatchClause
     * @generated
     */
	public Adapter createCatchClauseAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ContinueStmt <em>Continue Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ContinueStmt
     * @generated
     */
	public Adapter createContinueStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.DoStmt <em>Do Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.DoStmt
     * @generated
     */
	public Adapter createDoStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.EmptyStmt <em>Empty Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.EmptyStmt
     * @generated
     */
	public Adapter createEmptyStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ExplicitConstructorInvocationStmt <em>Explicit Constructor Invocation Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ExplicitConstructorInvocationStmt
     * @generated
     */
	public Adapter createExplicitConstructorInvocationStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ExpressionStmt <em>Expression Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ExpressionStmt
     * @generated
     */
	public Adapter createExpressionStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ForEachStmt <em>For Each Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ForEachStmt
     * @generated
     */
	public Adapter createForEachStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ForStmt <em>For Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ForStmt
     * @generated
     */
	public Adapter createForStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.IfStmt <em>If Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.IfStmt
     * @generated
     */
	public Adapter createIfStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.LabeledStmt <em>Labeled Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.LabeledStmt
     * @generated
     */
	public Adapter createLabeledStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.LocalClassDeclarationStmt <em>Local Class Declaration Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.LocalClassDeclarationStmt
     * @generated
     */
	public Adapter createLocalClassDeclarationStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ReturnStmt <em>Return Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ReturnStmt
     * @generated
     */
	public Adapter createReturnStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.SwitchEntry <em>Switch Entry</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.SwitchEntry
     * @generated
     */
	public Adapter createSwitchEntryAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.SwitchStmt <em>Switch Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.SwitchStmt
     * @generated
     */
	public Adapter createSwitchStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.SynchronizedStmt <em>Synchronized Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.SynchronizedStmt
     * @generated
     */
	public Adapter createSynchronizedStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ThrowStmt <em>Throw Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ThrowStmt
     * @generated
     */
	public Adapter createThrowStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.TryStmt <em>Try Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.TryStmt
     * @generated
     */
	public Adapter createTryStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.WhileStmt <em>While Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.WhileStmt
     * @generated
     */
	public Adapter createWhileStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.YieldStmt <em>Yield Stmt</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.YieldStmt
     * @generated
     */
	public Adapter createYieldStmtAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.ArrayType <em>Array Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.ArrayType
     * @generated
     */
	public Adapter createArrayTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithAbstractModifier <em>Node With Abstract Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithAbstractModifier
     * @generated
     */
	public Adapter createNodeWithAbstractModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithAccessModifiers <em>Node With Access Modifiers</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithAccessModifiers
     * @generated
     */
	public Adapter createNodeWithAccessModifiersAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithDefaultModifier <em>Node With Default Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithDefaultModifier
     * @generated
     */
	public Adapter createNodeWithDefaultModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithFinalModifier <em>Node With Final Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithFinalModifier
     * @generated
     */
	public Adapter createNodeWithFinalModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithNativeModifier <em>Node With Native Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithNativeModifier
     * @generated
     */
	public Adapter createNodeWithNativeModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithPrivateModifier <em>Node With Private Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithPrivateModifier
     * @generated
     */
	public Adapter createNodeWithPrivateModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithProtectedModifier <em>Node With Protected Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithProtectedModifier
     * @generated
     */
	public Adapter createNodeWithProtectedModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithPublicModifier <em>Node With Public Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithPublicModifier
     * @generated
     */
	public Adapter createNodeWithPublicModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithStaticModifier <em>Node With Static Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithStaticModifier
     * @generated
     */
	public Adapter createNodeWithStaticModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithSynchronizedModifier <em>Node With Synchronized Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithSynchronizedModifier
     * @generated
     */
	public Adapter createNodeWithSynchronizedModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithStrictfpModifier <em>Node With Strictfp Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithStrictfpModifier
     * @generated
     */
	public Adapter createNodeWithStrictfpModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithTransientModifier <em>Node With Transient Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithTransientModifier
     * @generated
     */
	public Adapter createNodeWithTransientModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithTransitiveModifier <em>Node With Transitive Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithTransitiveModifier
     * @generated
     */
	public Adapter createNodeWithTransitiveModifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.csd.java.NodeWithVolatileModifier <em>Node With Volatile Modifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.csd.java.NodeWithVolatileModifier
     * @generated
     */
	public Adapter createNodeWithVolatileModifierAdapter() {
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

} //JavaAdapterFactory
