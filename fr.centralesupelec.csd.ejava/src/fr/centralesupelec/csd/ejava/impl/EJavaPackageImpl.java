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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.centralesupelec.csd.ejava.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EJavaPackageImpl extends EPackageImpl implements EJavaPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass javaNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayCreationLevelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass compilationUnitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass importDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass packageDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationMemberDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bodyDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass callableDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classOrInterfaceDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass constructorDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumConstantDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fieldDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass initializerDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass methodDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass receiverParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableDeclaratorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass blockCommentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass commentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass javadocCommentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lineCommentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayAccessExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayCreationExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayInitializerExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass binaryExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass booleanLiteralExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass castExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass charLiteralExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionalExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass doubleLiteralExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enclosedExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass expressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fieldAccessExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass instanceOfExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass integerLiteralExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lambdaExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass literalExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass literalStringValueExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass longLiteralExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass markerAnnotationExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass memberValuePairEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass methodCallExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass methodReferenceExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nameExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass normalAnnotationExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nullLiteralExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass objectCreationExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass patternExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass singleMemberAnnotationExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringLiteralExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass superExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass switchExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass textBlockLiteralExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass thisExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unaryExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableDeclarationExprEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleDirectiveEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleExportsDirectiveEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleOpensDirectiveEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleProvidesDirectiveEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleRequiresDirectiveEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleUsesDirectiveEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithAnnotationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithArgumentsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithBlockStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithBodyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithExtendsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithIdentifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithImplementsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithJavadocEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithMembersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithModifiersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithLabelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithRangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithScopeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithSimpleNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithStatementsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithThrownExceptionsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithTokenRangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithTypeArgumentsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithTypeParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithVariablesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass switchNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithAbstractModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithAccessModifiersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithDefaultModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithFinalModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithNativeModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithPrivateModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithProtectedModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithPublicModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithStaticModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithSynchronizedModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithStrictfpModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithTransientModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithTransitiveModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeWithVolatileModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assertStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass blockStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass breakStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass catchClauseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass continueStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass doStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass emptyStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass explicitConstructorInvocationStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass expressionStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass forEachStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass forStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ifStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass labeledStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localClassDeclarationStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass returnStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass statementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass switchEntryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass switchStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass synchronizedStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass throwStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tryStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass whileStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass yieldStmtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classOrInterfaceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intersectionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass primitiveTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unknownTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass varTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass voidTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass wildcardTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum modifierKeywordEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum assignOperatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum binaryOperatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum unaryOperatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum switchEntryTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum arrayTypeOriginEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum primitiveEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see fr.centralesupelec.csd.ejava.EJavaPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private EJavaPackageImpl() {
        super( eNS_URI, EJavaFactory.eINSTANCE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link EJavaPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static EJavaPackage init() {
        if( isInited ) return ( EJavaPackage ) EPackage.Registry.INSTANCE.getEPackage( EJavaPackage.eNS_URI );

        // Obtain or create and register package
        Object registeredEJavaPackage = EPackage.Registry.INSTANCE.get( eNS_URI );
        EJavaPackageImpl theEJavaPackage = registeredEJavaPackage instanceof EJavaPackageImpl
                ? ( EJavaPackageImpl ) registeredEJavaPackage
                : new EJavaPackageImpl();

        isInited = true;

        // Create package meta-data objects
        theEJavaPackage.createPackageContents();

        // Initialize created meta-data
        theEJavaPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theEJavaPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put( EJavaPackage.eNS_URI, theEJavaPackage );
        return theEJavaPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJavaNode() {
        return javaNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getJavaNode_Comment() {
        return ( EReference ) javaNodeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getJavaNode_OrphanComments() {
        return ( EReference ) javaNodeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayCreationLevel() {
        return arrayCreationLevelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayCreationLevel_Dimension() {
        return ( EReference ) arrayCreationLevelEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCompilationUnit() {
        return compilationUnitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCompilationUnit_PackageDeclaration() {
        return ( EReference ) compilationUnitEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCompilationUnit_Imports() {
        return ( EReference ) compilationUnitEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCompilationUnit_Types() {
        return ( EReference ) compilationUnitEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCompilationUnit_Module() {
        return ( EReference ) compilationUnitEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getImportDeclaration() {
        return importDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getImportDeclaration_Static() {
        return ( EAttribute ) importDeclarationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getImportDeclaration_Asterisk() {
        return ( EAttribute ) importDeclarationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPackageDeclaration() {
        return packageDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotationDeclaration() {
        return annotationDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotationMemberDeclaration() {
        return annotationMemberDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnnotationMemberDeclaration_DefaultValue() {
        return ( EReference ) annotationMemberDeclarationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBodyDeclaration() {
        return bodyDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCallableDeclaration() {
        return callableDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCallableDeclaration_ReceiverParameter() {
        return ( EReference ) callableDeclarationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getClassOrInterfaceDeclaration() {
        return classOrInterfaceDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClassOrInterfaceDeclaration_Interface() {
        return ( EAttribute ) classOrInterfaceDeclarationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConstructorDeclaration() {
        return constructorDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEnumConstantDeclaration() {
        return enumConstantDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumConstantDeclaration_ClassBody() {
        return ( EReference ) enumConstantDeclarationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEnumDeclaration() {
        return enumDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumDeclaration_Entries() {
        return ( EReference ) enumDeclarationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFieldDeclaration() {
        return fieldDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInitializerDeclaration() {
        return initializerDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getInitializerDeclaration_Static() {
        return ( EAttribute ) initializerDeclarationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMethodDeclaration() {
        return methodDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getParameter() {
        return parameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getParameter_VarArgs() {
        return ( EAttribute ) parameterEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getParameter_VarArgsAnnotations() {
        return ( EReference ) parameterEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReceiverParameter() {
        return receiverParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTypeDeclaration() {
        return typeDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVariableDeclarator() {
        return variableDeclaratorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVariableDeclarator_Initializer() {
        return ( EReference ) variableDeclaratorEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBlockComment() {
        return blockCommentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getComment() {
        return commentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getComment_Content() {
        return ( EAttribute ) commentEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJavadocComment() {
        return javadocCommentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLineComment() {
        return lineCommentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotationExpr() {
        return annotationExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayAccessExpr() {
        return arrayAccessExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayAccessExpr_Name() {
        return ( EReference ) arrayAccessExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayAccessExpr_Index() {
        return ( EReference ) arrayAccessExprEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayCreationExpr() {
        return arrayCreationExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayCreationExpr_Levels() {
        return ( EReference ) arrayCreationExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayCreationExpr_ElementType() {
        return ( EReference ) arrayCreationExprEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayCreationExpr_Initializer() {
        return ( EReference ) arrayCreationExprEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayInitializerExpr() {
        return arrayInitializerExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayInitializerExpr_Values() {
        return ( EReference ) arrayInitializerExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignExpr() {
        return assignExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssignExpr_Target() {
        return ( EReference ) assignExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssignExpr_Value() {
        return ( EReference ) assignExprEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAssignExpr_Operator() {
        return ( EAttribute ) assignExprEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBinaryExpr() {
        return binaryExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBinaryExpr_Left() {
        return ( EReference ) binaryExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBinaryExpr_Right() {
        return ( EReference ) binaryExprEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBinaryExpr_Operator() {
        return ( EAttribute ) binaryExprEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBooleanLiteralExpr() {
        return booleanLiteralExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBooleanLiteralExpr_Value() {
        return ( EAttribute ) booleanLiteralExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCastExpr() {
        return castExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCharLiteralExpr() {
        return charLiteralExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getClassExpr() {
        return classExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConditionalExpr() {
        return conditionalExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConditionalExpr_ThenExpr() {
        return ( EReference ) conditionalExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConditionalExpr_ElseExpr() {
        return ( EReference ) conditionalExprEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDoubleLiteralExpr() {
        return doubleLiteralExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEnclosedExpr() {
        return enclosedExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnclosedExpr_Inner() {
        return ( EReference ) enclosedExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExpression() {
        return expressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFieldAccessExpr() {
        return fieldAccessExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInstanceOfExpr() {
        return instanceOfExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInstanceOfExpr_Pattern() {
        return ( EReference ) instanceOfExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIntegerLiteralExpr() {
        return integerLiteralExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLambdaExpr() {
        return lambdaExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLambdaExpr_EnclosingParameters() {
        return ( EAttribute ) lambdaExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLambdaExpr_Body() {
        return ( EReference ) lambdaExprEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLiteralExpr() {
        return literalExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLiteralStringValueExpr() {
        return literalStringValueExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLiteralStringValueExpr_Value() {
        return ( EAttribute ) literalStringValueExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLongLiteralExpr() {
        return longLiteralExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMarkerAnnotationExpr() {
        return markerAnnotationExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMemberValuePair() {
        return memberValuePairEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMemberValuePair_Value() {
        return ( EReference ) memberValuePairEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMethodCallExpr() {
        return methodCallExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMethodReferenceExpr() {
        return methodReferenceExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getName_() {
        return nameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getName_Qualifier() {
        return ( EReference ) nameEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNameExpr() {
        return nameExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNormalAnnotationExpr() {
        return normalAnnotationExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNormalAnnotationExpr_Pairs() {
        return ( EReference ) normalAnnotationExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNullLiteralExpr() {
        return nullLiteralExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getObjectCreationExpr() {
        return objectCreationExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getObjectCreationExpr_AnonymousClassBody() {
        return ( EReference ) objectCreationExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPatternExpr() {
        return patternExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSimpleName() {
        return simpleNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSingleMemberAnnotationExpr() {
        return singleMemberAnnotationExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSingleMemberAnnotationExpr_MemberValue() {
        return ( EReference ) singleMemberAnnotationExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStringLiteralExpr() {
        return stringLiteralExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSuperExpr() {
        return superExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSuperExpr_TypeName() {
        return ( EReference ) superExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSwitchExpr() {
        return switchExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTextBlockLiteralExpr() {
        return textBlockLiteralExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getThisExpr() {
        return thisExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getThisExpr_TypeName() {
        return ( EReference ) thisExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTypeExpr() {
        return typeExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUnaryExpr() {
        return unaryExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUnaryExpr_Operator() {
        return ( EAttribute ) unaryExprEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVariableDeclarationExpr() {
        return variableDeclarationExprEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleDeclaration() {
        return moduleDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getModuleDeclaration_Open() {
        return ( EAttribute ) moduleDeclarationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleDeclaration_Directives() {
        return ( EReference ) moduleDeclarationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleDirective() {
        return moduleDirectiveEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleExportsDirective() {
        return moduleExportsDirectiveEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleExportsDirective_ModuleNames() {
        return ( EReference ) moduleExportsDirectiveEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleOpensDirective() {
        return moduleOpensDirectiveEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleOpensDirective_ModuleNames() {
        return ( EReference ) moduleOpensDirectiveEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleProvidesDirective() {
        return moduleProvidesDirectiveEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleProvidesDirective_With() {
        return ( EReference ) moduleProvidesDirectiveEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleRequiresDirective() {
        return moduleRequiresDirectiveEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleUsesDirective() {
        return moduleUsesDirectiveEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithAnnotations() {
        return nodeWithAnnotationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithAnnotations_Annotations() {
        return ( EReference ) nodeWithAnnotationsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithArguments() {
        return nodeWithArgumentsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithArguments_Arguments() {
        return ( EReference ) nodeWithArgumentsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithBlockStmt() {
        return nodeWithBlockStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithBlockStmt_Body() {
        return ( EReference ) nodeWithBlockStmtEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithBody() {
        return nodeWithBodyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithBody_Body() {
        return ( EReference ) nodeWithBodyEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithCondition() {
        return nodeWithConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithCondition_Condition() {
        return ( EReference ) nodeWithConditionEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithExpression() {
        return nodeWithExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithExpression_Expression() {
        return ( EReference ) nodeWithExpressionEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithExtends() {
        return nodeWithExtendsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithExtends_ExtendedTypes() {
        return ( EReference ) nodeWithExtendsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithIdentifier() {
        return nodeWithIdentifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithIdentifier_Identifier() {
        return ( EAttribute ) nodeWithIdentifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithImplements() {
        return nodeWithImplementsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithImplements_ImplementedTypes() {
        return ( EReference ) nodeWithImplementsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithJavadoc() {
        return nodeWithJavadocEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithMembers() {
        return nodeWithMembersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithMembers_Members() {
        return ( EReference ) nodeWithMembersEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithModifiers() {
        return nodeWithModifiersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithModifiers_Modifiers() {
        return ( EAttribute ) nodeWithModifiersEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithName() {
        return nodeWithNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithName_Name() {
        return ( EReference ) nodeWithNameEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithLabel() {
        return nodeWithLabelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithLabel_Label() {
        return ( EReference ) nodeWithLabelEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithParameters() {
        return nodeWithParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithParameters_Parameters() {
        return ( EReference ) nodeWithParametersEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithRange() {
        return nodeWithRangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithScope() {
        return nodeWithScopeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithScope_Scope() {
        return ( EReference ) nodeWithScopeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithSimpleName() {
        return nodeWithSimpleNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithSimpleName_Name() {
        return ( EReference ) nodeWithSimpleNameEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithStatements() {
        return nodeWithStatementsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithStatements_Statements() {
        return ( EReference ) nodeWithStatementsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithThrownExceptions() {
        return nodeWithThrownExceptionsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithThrownExceptions_ThrownExceptions() {
        return ( EReference ) nodeWithThrownExceptionsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithTokenRange() {
        return nodeWithTokenRangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithType() {
        return nodeWithTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithType_Type() {
        return ( EReference ) nodeWithTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithTypeArguments() {
        return nodeWithTypeArgumentsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithTypeArguments_TypeArguments() {
        return ( EReference ) nodeWithTypeArgumentsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithTypeParameters() {
        return nodeWithTypeParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithTypeParameters_TypeParameters() {
        return ( EReference ) nodeWithTypeParametersEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithVariables() {
        return nodeWithVariablesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNodeWithVariables_Variables() {
        return ( EReference ) nodeWithVariablesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSwitchNode() {
        return switchNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSwitchNode_Selector() {
        return ( EReference ) switchNodeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSwitchNode_Entries() {
        return ( EReference ) switchNodeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithAbstractModifier() {
        return nodeWithAbstractModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithAbstractModifier_Abstract() {
        return ( EAttribute ) nodeWithAbstractModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithAccessModifiers() {
        return nodeWithAccessModifiersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithDefaultModifier() {
        return nodeWithDefaultModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithDefaultModifier_Default() {
        return ( EAttribute ) nodeWithDefaultModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithFinalModifier() {
        return nodeWithFinalModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithFinalModifier_Final() {
        return ( EAttribute ) nodeWithFinalModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithNativeModifier() {
        return nodeWithNativeModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithNativeModifier_Native() {
        return ( EAttribute ) nodeWithNativeModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithPrivateModifier() {
        return nodeWithPrivateModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithPrivateModifier_Private() {
        return ( EAttribute ) nodeWithPrivateModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithProtectedModifier() {
        return nodeWithProtectedModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithProtectedModifier_Protected() {
        return ( EAttribute ) nodeWithProtectedModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithPublicModifier() {
        return nodeWithPublicModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithPublicModifier_Public() {
        return ( EAttribute ) nodeWithPublicModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithStaticModifier() {
        return nodeWithStaticModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithStaticModifier_Static() {
        return ( EAttribute ) nodeWithStaticModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithSynchronizedModifier() {
        return nodeWithSynchronizedModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithSynchronizedModifier_Synchronized() {
        return ( EAttribute ) nodeWithSynchronizedModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithStrictfpModifier() {
        return nodeWithStrictfpModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithStrictfpModifier_Strictfp() {
        return ( EAttribute ) nodeWithStrictfpModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithTransientModifier() {
        return nodeWithTransientModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithTransientModifier_Transient() {
        return ( EAttribute ) nodeWithTransientModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithTransitiveModifier() {
        return nodeWithTransitiveModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithTransitiveModifier_Transitive() {
        return ( EAttribute ) nodeWithTransitiveModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNodeWithVolatileModifier() {
        return nodeWithVolatileModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNodeWithVolatileModifier_Volatile() {
        return ( EAttribute ) nodeWithVolatileModifierEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssertStmt() {
        return assertStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssertStmt_Check() {
        return ( EReference ) assertStmtEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssertStmt_Message() {
        return ( EReference ) assertStmtEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBlockStmt() {
        return blockStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBreakStmt() {
        return breakStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCatchClause() {
        return catchClauseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCatchClause_Parameter() {
        return ( EReference ) catchClauseEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getContinueStmt() {
        return continueStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDoStmt() {
        return doStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEmptyStmt() {
        return emptyStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExplicitConstructorInvocationStmt() {
        return explicitConstructorInvocationStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExplicitConstructorInvocationStmt_IsThis() {
        return ( EAttribute ) explicitConstructorInvocationStmtEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExpressionStmt() {
        return expressionStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getForEachStmt() {
        return forEachStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getForEachStmt_Variable() {
        return ( EReference ) forEachStmtEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getForEachStmt_Iterable() {
        return ( EReference ) forEachStmtEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getForStmt() {
        return forStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getForStmt_Initialization() {
        return ( EReference ) forStmtEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getForStmt_Compare() {
        return ( EReference ) forStmtEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getForStmt_Update() {
        return ( EReference ) forStmtEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIfStmt() {
        return ifStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIfStmt_ThenStmt() {
        return ( EReference ) ifStmtEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIfStmt_ElseStmt() {
        return ( EReference ) ifStmtEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLabeledStmt() {
        return labeledStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLabeledStmt_Statement() {
        return ( EReference ) labeledStmtEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLocalClassDeclarationStmt() {
        return localClassDeclarationStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLocalClassDeclarationStmt_ClassDeclaration() {
        return ( EReference ) localClassDeclarationStmtEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReturnStmt() {
        return returnStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStatement() {
        return statementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSwitchEntry() {
        return switchEntryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSwitchEntry_Labels() {
        return ( EReference ) switchEntryEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSwitchEntry_Type() {
        return ( EAttribute ) switchEntryEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSwitchStmt() {
        return switchStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSynchronizedStmt() {
        return synchronizedStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getThrowStmt() {
        return throwStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTryStmt() {
        return tryStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTryStmt_Resources() {
        return ( EReference ) tryStmtEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTryStmt_TryBlock() {
        return ( EReference ) tryStmtEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTryStmt_CatchClauses() {
        return ( EReference ) tryStmtEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTryStmt_FinallyBlock() {
        return ( EReference ) tryStmtEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getWhileStmt() {
        return whileStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getYieldStmt() {
        return yieldStmtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayType() {
        return arrayTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayType_ComponentType() {
        return ( EReference ) arrayTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getArrayType_Origin() {
        return ( EAttribute ) arrayTypeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getClassOrInterfaceType() {
        return classOrInterfaceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIntersectionType() {
        return intersectionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIntersectionType_Elements() {
        return ( EReference ) intersectionTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPrimitiveType() {
        return primitiveTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPrimitiveType_Type() {
        return ( EAttribute ) primitiveTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReferenceType() {
        return referenceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getType() {
        return typeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTypeParameter() {
        return typeParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTypeParameter_TypeBound() {
        return ( EReference ) typeParameterEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUnionType() {
        return unionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getUnionType_Elements() {
        return ( EReference ) unionTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUnknownType() {
        return unknownTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVarType() {
        return varTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVoidType() {
        return voidTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getWildcardType() {
        return wildcardTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getWildcardType_ExtendedType() {
        return ( EReference ) wildcardTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getWildcardType_SuperType() {
        return ( EReference ) wildcardTypeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getModifierKeyword() {
        return modifierKeywordEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getAssignOperator() {
        return assignOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getBinaryOperator() {
        return binaryOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getUnaryOperator() {
        return unaryOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getSwitchEntryType() {
        return switchEntryTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getArrayTypeOrigin() {
        return arrayTypeOriginEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getPrimitive() {
        return primitiveEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EJavaFactory getEJavaFactory() {
        return ( EJavaFactory ) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if( isCreated ) return;
        isCreated = true;

        // Create classes and their features
        javaNodeEClass = createEClass( JAVA_NODE );
        createEReference( javaNodeEClass, JAVA_NODE__COMMENT );
        createEReference( javaNodeEClass, JAVA_NODE__ORPHAN_COMMENTS );

        arrayCreationLevelEClass = createEClass( ARRAY_CREATION_LEVEL );
        createEReference( arrayCreationLevelEClass, ARRAY_CREATION_LEVEL__DIMENSION );

        compilationUnitEClass = createEClass( COMPILATION_UNIT );
        createEReference( compilationUnitEClass, COMPILATION_UNIT__PACKAGE_DECLARATION );
        createEReference( compilationUnitEClass, COMPILATION_UNIT__IMPORTS );
        createEReference( compilationUnitEClass, COMPILATION_UNIT__TYPES );
        createEReference( compilationUnitEClass, COMPILATION_UNIT__MODULE );

        importDeclarationEClass = createEClass( IMPORT_DECLARATION );
        createEAttribute( importDeclarationEClass, IMPORT_DECLARATION__STATIC );
        createEAttribute( importDeclarationEClass, IMPORT_DECLARATION__ASTERISK );

        packageDeclarationEClass = createEClass( PACKAGE_DECLARATION );

        annotationDeclarationEClass = createEClass( ANNOTATION_DECLARATION );

        annotationMemberDeclarationEClass = createEClass( ANNOTATION_MEMBER_DECLARATION );
        createEReference( annotationMemberDeclarationEClass, ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE );

        bodyDeclarationEClass = createEClass( BODY_DECLARATION );

        callableDeclarationEClass = createEClass( CALLABLE_DECLARATION );
        createEReference( callableDeclarationEClass, CALLABLE_DECLARATION__RECEIVER_PARAMETER );

        classOrInterfaceDeclarationEClass = createEClass( CLASS_OR_INTERFACE_DECLARATION );
        createEAttribute( classOrInterfaceDeclarationEClass, CLASS_OR_INTERFACE_DECLARATION__INTERFACE );

        constructorDeclarationEClass = createEClass( CONSTRUCTOR_DECLARATION );

        enumConstantDeclarationEClass = createEClass( ENUM_CONSTANT_DECLARATION );
        createEReference( enumConstantDeclarationEClass, ENUM_CONSTANT_DECLARATION__CLASS_BODY );

        enumDeclarationEClass = createEClass( ENUM_DECLARATION );
        createEReference( enumDeclarationEClass, ENUM_DECLARATION__ENTRIES );

        fieldDeclarationEClass = createEClass( FIELD_DECLARATION );

        initializerDeclarationEClass = createEClass( INITIALIZER_DECLARATION );
        createEAttribute( initializerDeclarationEClass, INITIALIZER_DECLARATION__STATIC );

        methodDeclarationEClass = createEClass( METHOD_DECLARATION );

        parameterEClass = createEClass( PARAMETER );
        createEAttribute( parameterEClass, PARAMETER__VAR_ARGS );
        createEReference( parameterEClass, PARAMETER__VAR_ARGS_ANNOTATIONS );

        receiverParameterEClass = createEClass( RECEIVER_PARAMETER );

        typeDeclarationEClass = createEClass( TYPE_DECLARATION );

        variableDeclaratorEClass = createEClass( VARIABLE_DECLARATOR );
        createEReference( variableDeclaratorEClass, VARIABLE_DECLARATOR__INITIALIZER );

        blockCommentEClass = createEClass( BLOCK_COMMENT );

        commentEClass = createEClass( COMMENT );
        createEAttribute( commentEClass, COMMENT__CONTENT );

        javadocCommentEClass = createEClass( JAVADOC_COMMENT );

        lineCommentEClass = createEClass( LINE_COMMENT );

        annotationExprEClass = createEClass( ANNOTATION_EXPR );

        arrayAccessExprEClass = createEClass( ARRAY_ACCESS_EXPR );
        createEReference( arrayAccessExprEClass, ARRAY_ACCESS_EXPR__NAME );
        createEReference( arrayAccessExprEClass, ARRAY_ACCESS_EXPR__INDEX );

        arrayCreationExprEClass = createEClass( ARRAY_CREATION_EXPR );
        createEReference( arrayCreationExprEClass, ARRAY_CREATION_EXPR__LEVELS );
        createEReference( arrayCreationExprEClass, ARRAY_CREATION_EXPR__ELEMENT_TYPE );
        createEReference( arrayCreationExprEClass, ARRAY_CREATION_EXPR__INITIALIZER );

        arrayInitializerExprEClass = createEClass( ARRAY_INITIALIZER_EXPR );
        createEReference( arrayInitializerExprEClass, ARRAY_INITIALIZER_EXPR__VALUES );

        assignExprEClass = createEClass( ASSIGN_EXPR );
        createEReference( assignExprEClass, ASSIGN_EXPR__TARGET );
        createEReference( assignExprEClass, ASSIGN_EXPR__VALUE );
        createEAttribute( assignExprEClass, ASSIGN_EXPR__OPERATOR );

        binaryExprEClass = createEClass( BINARY_EXPR );
        createEReference( binaryExprEClass, BINARY_EXPR__LEFT );
        createEReference( binaryExprEClass, BINARY_EXPR__RIGHT );
        createEAttribute( binaryExprEClass, BINARY_EXPR__OPERATOR );

        booleanLiteralExprEClass = createEClass( BOOLEAN_LITERAL_EXPR );
        createEAttribute( booleanLiteralExprEClass, BOOLEAN_LITERAL_EXPR__VALUE );

        castExprEClass = createEClass( CAST_EXPR );

        charLiteralExprEClass = createEClass( CHAR_LITERAL_EXPR );

        classExprEClass = createEClass( CLASS_EXPR );

        conditionalExprEClass = createEClass( CONDITIONAL_EXPR );
        createEReference( conditionalExprEClass, CONDITIONAL_EXPR__THEN_EXPR );
        createEReference( conditionalExprEClass, CONDITIONAL_EXPR__ELSE_EXPR );

        doubleLiteralExprEClass = createEClass( DOUBLE_LITERAL_EXPR );

        enclosedExprEClass = createEClass( ENCLOSED_EXPR );
        createEReference( enclosedExprEClass, ENCLOSED_EXPR__INNER );

        expressionEClass = createEClass( EXPRESSION );

        fieldAccessExprEClass = createEClass( FIELD_ACCESS_EXPR );

        instanceOfExprEClass = createEClass( INSTANCE_OF_EXPR );
        createEReference( instanceOfExprEClass, INSTANCE_OF_EXPR__PATTERN );

        integerLiteralExprEClass = createEClass( INTEGER_LITERAL_EXPR );

        lambdaExprEClass = createEClass( LAMBDA_EXPR );
        createEAttribute( lambdaExprEClass, LAMBDA_EXPR__ENCLOSING_PARAMETERS );
        createEReference( lambdaExprEClass, LAMBDA_EXPR__BODY );

        literalExprEClass = createEClass( LITERAL_EXPR );

        literalStringValueExprEClass = createEClass( LITERAL_STRING_VALUE_EXPR );
        createEAttribute( literalStringValueExprEClass, LITERAL_STRING_VALUE_EXPR__VALUE );

        longLiteralExprEClass = createEClass( LONG_LITERAL_EXPR );

        markerAnnotationExprEClass = createEClass( MARKER_ANNOTATION_EXPR );

        memberValuePairEClass = createEClass( MEMBER_VALUE_PAIR );
        createEReference( memberValuePairEClass, MEMBER_VALUE_PAIR__VALUE );

        methodCallExprEClass = createEClass( METHOD_CALL_EXPR );

        methodReferenceExprEClass = createEClass( METHOD_REFERENCE_EXPR );

        nameEClass = createEClass( NAME );
        createEReference( nameEClass, NAME__QUALIFIER );

        nameExprEClass = createEClass( NAME_EXPR );

        normalAnnotationExprEClass = createEClass( NORMAL_ANNOTATION_EXPR );
        createEReference( normalAnnotationExprEClass, NORMAL_ANNOTATION_EXPR__PAIRS );

        nullLiteralExprEClass = createEClass( NULL_LITERAL_EXPR );

        objectCreationExprEClass = createEClass( OBJECT_CREATION_EXPR );
        createEReference( objectCreationExprEClass, OBJECT_CREATION_EXPR__ANONYMOUS_CLASS_BODY );

        patternExprEClass = createEClass( PATTERN_EXPR );

        simpleNameEClass = createEClass( SIMPLE_NAME );

        singleMemberAnnotationExprEClass = createEClass( SINGLE_MEMBER_ANNOTATION_EXPR );
        createEReference( singleMemberAnnotationExprEClass, SINGLE_MEMBER_ANNOTATION_EXPR__MEMBER_VALUE );

        stringLiteralExprEClass = createEClass( STRING_LITERAL_EXPR );

        superExprEClass = createEClass( SUPER_EXPR );
        createEReference( superExprEClass, SUPER_EXPR__TYPE_NAME );

        switchExprEClass = createEClass( SWITCH_EXPR );

        textBlockLiteralExprEClass = createEClass( TEXT_BLOCK_LITERAL_EXPR );

        thisExprEClass = createEClass( THIS_EXPR );
        createEReference( thisExprEClass, THIS_EXPR__TYPE_NAME );

        typeExprEClass = createEClass( TYPE_EXPR );

        unaryExprEClass = createEClass( UNARY_EXPR );
        createEAttribute( unaryExprEClass, UNARY_EXPR__OPERATOR );

        variableDeclarationExprEClass = createEClass( VARIABLE_DECLARATION_EXPR );

        moduleDeclarationEClass = createEClass( MODULE_DECLARATION );
        createEAttribute( moduleDeclarationEClass, MODULE_DECLARATION__OPEN );
        createEReference( moduleDeclarationEClass, MODULE_DECLARATION__DIRECTIVES );

        moduleDirectiveEClass = createEClass( MODULE_DIRECTIVE );

        moduleExportsDirectiveEClass = createEClass( MODULE_EXPORTS_DIRECTIVE );
        createEReference( moduleExportsDirectiveEClass, MODULE_EXPORTS_DIRECTIVE__MODULE_NAMES );

        moduleOpensDirectiveEClass = createEClass( MODULE_OPENS_DIRECTIVE );
        createEReference( moduleOpensDirectiveEClass, MODULE_OPENS_DIRECTIVE__MODULE_NAMES );

        moduleProvidesDirectiveEClass = createEClass( MODULE_PROVIDES_DIRECTIVE );
        createEReference( moduleProvidesDirectiveEClass, MODULE_PROVIDES_DIRECTIVE__WITH );

        moduleRequiresDirectiveEClass = createEClass( MODULE_REQUIRES_DIRECTIVE );

        moduleUsesDirectiveEClass = createEClass( MODULE_USES_DIRECTIVE );

        nodeWithAnnotationsEClass = createEClass( NODE_WITH_ANNOTATIONS );
        createEReference( nodeWithAnnotationsEClass, NODE_WITH_ANNOTATIONS__ANNOTATIONS );

        nodeWithArgumentsEClass = createEClass( NODE_WITH_ARGUMENTS );
        createEReference( nodeWithArgumentsEClass, NODE_WITH_ARGUMENTS__ARGUMENTS );

        nodeWithBlockStmtEClass = createEClass( NODE_WITH_BLOCK_STMT );
        createEReference( nodeWithBlockStmtEClass, NODE_WITH_BLOCK_STMT__BODY );

        nodeWithBodyEClass = createEClass( NODE_WITH_BODY );
        createEReference( nodeWithBodyEClass, NODE_WITH_BODY__BODY );

        nodeWithConditionEClass = createEClass( NODE_WITH_CONDITION );
        createEReference( nodeWithConditionEClass, NODE_WITH_CONDITION__CONDITION );

        nodeWithExpressionEClass = createEClass( NODE_WITH_EXPRESSION );
        createEReference( nodeWithExpressionEClass, NODE_WITH_EXPRESSION__EXPRESSION );

        nodeWithExtendsEClass = createEClass( NODE_WITH_EXTENDS );
        createEReference( nodeWithExtendsEClass, NODE_WITH_EXTENDS__EXTENDED_TYPES );

        nodeWithIdentifierEClass = createEClass( NODE_WITH_IDENTIFIER );
        createEAttribute( nodeWithIdentifierEClass, NODE_WITH_IDENTIFIER__IDENTIFIER );

        nodeWithImplementsEClass = createEClass( NODE_WITH_IMPLEMENTS );
        createEReference( nodeWithImplementsEClass, NODE_WITH_IMPLEMENTS__IMPLEMENTED_TYPES );

        nodeWithJavadocEClass = createEClass( NODE_WITH_JAVADOC );

        nodeWithMembersEClass = createEClass( NODE_WITH_MEMBERS );
        createEReference( nodeWithMembersEClass, NODE_WITH_MEMBERS__MEMBERS );

        nodeWithModifiersEClass = createEClass( NODE_WITH_MODIFIERS );
        createEAttribute( nodeWithModifiersEClass, NODE_WITH_MODIFIERS__MODIFIERS );

        nodeWithNameEClass = createEClass( NODE_WITH_NAME );
        createEReference( nodeWithNameEClass, NODE_WITH_NAME__NAME );

        nodeWithLabelEClass = createEClass( NODE_WITH_LABEL );
        createEReference( nodeWithLabelEClass, NODE_WITH_LABEL__LABEL );

        nodeWithParametersEClass = createEClass( NODE_WITH_PARAMETERS );
        createEReference( nodeWithParametersEClass, NODE_WITH_PARAMETERS__PARAMETERS );

        nodeWithRangeEClass = createEClass( NODE_WITH_RANGE );

        nodeWithScopeEClass = createEClass( NODE_WITH_SCOPE );
        createEReference( nodeWithScopeEClass, NODE_WITH_SCOPE__SCOPE );

        nodeWithSimpleNameEClass = createEClass( NODE_WITH_SIMPLE_NAME );
        createEReference( nodeWithSimpleNameEClass, NODE_WITH_SIMPLE_NAME__NAME );

        nodeWithStatementsEClass = createEClass( NODE_WITH_STATEMENTS );
        createEReference( nodeWithStatementsEClass, NODE_WITH_STATEMENTS__STATEMENTS );

        nodeWithThrownExceptionsEClass = createEClass( NODE_WITH_THROWN_EXCEPTIONS );
        createEReference( nodeWithThrownExceptionsEClass, NODE_WITH_THROWN_EXCEPTIONS__THROWN_EXCEPTIONS );

        nodeWithTokenRangeEClass = createEClass( NODE_WITH_TOKEN_RANGE );

        nodeWithTypeEClass = createEClass( NODE_WITH_TYPE );
        createEReference( nodeWithTypeEClass, NODE_WITH_TYPE__TYPE );

        nodeWithTypeArgumentsEClass = createEClass( NODE_WITH_TYPE_ARGUMENTS );
        createEReference( nodeWithTypeArgumentsEClass, NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS );

        nodeWithTypeParametersEClass = createEClass( NODE_WITH_TYPE_PARAMETERS );
        createEReference( nodeWithTypeParametersEClass, NODE_WITH_TYPE_PARAMETERS__TYPE_PARAMETERS );

        nodeWithVariablesEClass = createEClass( NODE_WITH_VARIABLES );
        createEReference( nodeWithVariablesEClass, NODE_WITH_VARIABLES__VARIABLES );

        switchNodeEClass = createEClass( SWITCH_NODE );
        createEReference( switchNodeEClass, SWITCH_NODE__SELECTOR );
        createEReference( switchNodeEClass, SWITCH_NODE__ENTRIES );

        nodeWithAbstractModifierEClass = createEClass( NODE_WITH_ABSTRACT_MODIFIER );
        createEAttribute( nodeWithAbstractModifierEClass, NODE_WITH_ABSTRACT_MODIFIER__ABSTRACT );

        nodeWithAccessModifiersEClass = createEClass( NODE_WITH_ACCESS_MODIFIERS );

        nodeWithDefaultModifierEClass = createEClass( NODE_WITH_DEFAULT_MODIFIER );
        createEAttribute( nodeWithDefaultModifierEClass, NODE_WITH_DEFAULT_MODIFIER__DEFAULT );

        nodeWithFinalModifierEClass = createEClass( NODE_WITH_FINAL_MODIFIER );
        createEAttribute( nodeWithFinalModifierEClass, NODE_WITH_FINAL_MODIFIER__FINAL );

        nodeWithNativeModifierEClass = createEClass( NODE_WITH_NATIVE_MODIFIER );
        createEAttribute( nodeWithNativeModifierEClass, NODE_WITH_NATIVE_MODIFIER__NATIVE );

        nodeWithPrivateModifierEClass = createEClass( NODE_WITH_PRIVATE_MODIFIER );
        createEAttribute( nodeWithPrivateModifierEClass, NODE_WITH_PRIVATE_MODIFIER__PRIVATE );

        nodeWithProtectedModifierEClass = createEClass( NODE_WITH_PROTECTED_MODIFIER );
        createEAttribute( nodeWithProtectedModifierEClass, NODE_WITH_PROTECTED_MODIFIER__PROTECTED );

        nodeWithPublicModifierEClass = createEClass( NODE_WITH_PUBLIC_MODIFIER );
        createEAttribute( nodeWithPublicModifierEClass, NODE_WITH_PUBLIC_MODIFIER__PUBLIC );

        nodeWithStaticModifierEClass = createEClass( NODE_WITH_STATIC_MODIFIER );
        createEAttribute( nodeWithStaticModifierEClass, NODE_WITH_STATIC_MODIFIER__STATIC );

        nodeWithSynchronizedModifierEClass = createEClass( NODE_WITH_SYNCHRONIZED_MODIFIER );
        createEAttribute( nodeWithSynchronizedModifierEClass, NODE_WITH_SYNCHRONIZED_MODIFIER__SYNCHRONIZED );

        nodeWithStrictfpModifierEClass = createEClass( NODE_WITH_STRICTFP_MODIFIER );
        createEAttribute( nodeWithStrictfpModifierEClass, NODE_WITH_STRICTFP_MODIFIER__STRICTFP );

        nodeWithTransientModifierEClass = createEClass( NODE_WITH_TRANSIENT_MODIFIER );
        createEAttribute( nodeWithTransientModifierEClass, NODE_WITH_TRANSIENT_MODIFIER__TRANSIENT );

        nodeWithTransitiveModifierEClass = createEClass( NODE_WITH_TRANSITIVE_MODIFIER );
        createEAttribute( nodeWithTransitiveModifierEClass, NODE_WITH_TRANSITIVE_MODIFIER__TRANSITIVE );

        nodeWithVolatileModifierEClass = createEClass( NODE_WITH_VOLATILE_MODIFIER );
        createEAttribute( nodeWithVolatileModifierEClass, NODE_WITH_VOLATILE_MODIFIER__VOLATILE );

        assertStmtEClass = createEClass( ASSERT_STMT );
        createEReference( assertStmtEClass, ASSERT_STMT__CHECK );
        createEReference( assertStmtEClass, ASSERT_STMT__MESSAGE );

        blockStmtEClass = createEClass( BLOCK_STMT );

        breakStmtEClass = createEClass( BREAK_STMT );

        catchClauseEClass = createEClass( CATCH_CLAUSE );
        createEReference( catchClauseEClass, CATCH_CLAUSE__PARAMETER );

        continueStmtEClass = createEClass( CONTINUE_STMT );

        doStmtEClass = createEClass( DO_STMT );

        emptyStmtEClass = createEClass( EMPTY_STMT );

        explicitConstructorInvocationStmtEClass = createEClass( EXPLICIT_CONSTRUCTOR_INVOCATION_STMT );
        createEAttribute( explicitConstructorInvocationStmtEClass, EXPLICIT_CONSTRUCTOR_INVOCATION_STMT__IS_THIS );

        expressionStmtEClass = createEClass( EXPRESSION_STMT );

        forEachStmtEClass = createEClass( FOR_EACH_STMT );
        createEReference( forEachStmtEClass, FOR_EACH_STMT__VARIABLE );
        createEReference( forEachStmtEClass, FOR_EACH_STMT__ITERABLE );

        forStmtEClass = createEClass( FOR_STMT );
        createEReference( forStmtEClass, FOR_STMT__INITIALIZATION );
        createEReference( forStmtEClass, FOR_STMT__COMPARE );
        createEReference( forStmtEClass, FOR_STMT__UPDATE );

        ifStmtEClass = createEClass( IF_STMT );
        createEReference( ifStmtEClass, IF_STMT__THEN_STMT );
        createEReference( ifStmtEClass, IF_STMT__ELSE_STMT );

        labeledStmtEClass = createEClass( LABELED_STMT );
        createEReference( labeledStmtEClass, LABELED_STMT__STATEMENT );

        localClassDeclarationStmtEClass = createEClass( LOCAL_CLASS_DECLARATION_STMT );
        createEReference( localClassDeclarationStmtEClass, LOCAL_CLASS_DECLARATION_STMT__CLASS_DECLARATION );

        returnStmtEClass = createEClass( RETURN_STMT );

        statementEClass = createEClass( STATEMENT );

        switchEntryEClass = createEClass( SWITCH_ENTRY );
        createEReference( switchEntryEClass, SWITCH_ENTRY__LABELS );
        createEAttribute( switchEntryEClass, SWITCH_ENTRY__TYPE );

        switchStmtEClass = createEClass( SWITCH_STMT );

        synchronizedStmtEClass = createEClass( SYNCHRONIZED_STMT );

        throwStmtEClass = createEClass( THROW_STMT );

        tryStmtEClass = createEClass( TRY_STMT );
        createEReference( tryStmtEClass, TRY_STMT__RESOURCES );
        createEReference( tryStmtEClass, TRY_STMT__TRY_BLOCK );
        createEReference( tryStmtEClass, TRY_STMT__CATCH_CLAUSES );
        createEReference( tryStmtEClass, TRY_STMT__FINALLY_BLOCK );

        whileStmtEClass = createEClass( WHILE_STMT );

        yieldStmtEClass = createEClass( YIELD_STMT );

        arrayTypeEClass = createEClass( ARRAY_TYPE );
        createEReference( arrayTypeEClass, ARRAY_TYPE__COMPONENT_TYPE );
        createEAttribute( arrayTypeEClass, ARRAY_TYPE__ORIGIN );

        classOrInterfaceTypeEClass = createEClass( CLASS_OR_INTERFACE_TYPE );

        intersectionTypeEClass = createEClass( INTERSECTION_TYPE );
        createEReference( intersectionTypeEClass, INTERSECTION_TYPE__ELEMENTS );

        primitiveTypeEClass = createEClass( PRIMITIVE_TYPE );
        createEAttribute( primitiveTypeEClass, PRIMITIVE_TYPE__TYPE );

        referenceTypeEClass = createEClass( REFERENCE_TYPE );

        typeEClass = createEClass( TYPE );

        typeParameterEClass = createEClass( TYPE_PARAMETER );
        createEReference( typeParameterEClass, TYPE_PARAMETER__TYPE_BOUND );

        unionTypeEClass = createEClass( UNION_TYPE );
        createEReference( unionTypeEClass, UNION_TYPE__ELEMENTS );

        unknownTypeEClass = createEClass( UNKNOWN_TYPE );

        varTypeEClass = createEClass( VAR_TYPE );

        voidTypeEClass = createEClass( VOID_TYPE );

        wildcardTypeEClass = createEClass( WILDCARD_TYPE );
        createEReference( wildcardTypeEClass, WILDCARD_TYPE__EXTENDED_TYPE );
        createEReference( wildcardTypeEClass, WILDCARD_TYPE__SUPER_TYPE );

        // Create enums
        modifierKeywordEEnum = createEEnum( MODIFIER_KEYWORD );
        assignOperatorEEnum = createEEnum( ASSIGN_OPERATOR );
        binaryOperatorEEnum = createEEnum( BINARY_OPERATOR );
        unaryOperatorEEnum = createEEnum( UNARY_OPERATOR );
        switchEntryTypeEEnum = createEEnum( SWITCH_ENTRY_TYPE );
        arrayTypeOriginEEnum = createEEnum( ARRAY_TYPE_ORIGIN );
        primitiveEEnum = createEEnum( PRIMITIVE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if( isInitialized ) return;
        isInitialized = true;

        // Initialize package
        setName( eNAME );
        setNsPrefix( eNS_PREFIX );
        setNsURI( eNS_URI );

        // Create type parameters
        ETypeParameter nodeWithScopeEClass_ScopeType = addETypeParameter( nodeWithScopeEClass, "ScopeType" );
        ETypeParameter nodeWithTypeEClass_TypeUsed = addETypeParameter( nodeWithTypeEClass, "TypeUsed" );

        // Set bounds for type parameters

        // Add supertypes to classes
        arrayCreationLevelEClass.getESuperTypes().add( this.getJavaNode() );
        arrayCreationLevelEClass.getESuperTypes().add( this.getNodeWithAnnotations() );
        compilationUnitEClass.getESuperTypes().add( this.getJavaNode() );
        importDeclarationEClass.getESuperTypes().add( this.getJavaNode() );
        importDeclarationEClass.getESuperTypes().add( this.getNodeWithName() );
        packageDeclarationEClass.getESuperTypes().add( this.getJavaNode() );
        packageDeclarationEClass.getESuperTypes().add( this.getNodeWithAnnotations() );
        packageDeclarationEClass.getESuperTypes().add( this.getNodeWithName() );
        annotationDeclarationEClass.getESuperTypes().add( this.getTypeDeclaration() );
        annotationDeclarationEClass.getESuperTypes().add( this.getNodeWithAbstractModifier() );
        EGenericType g1 = createEGenericType( this.getBodyDeclaration() );
        annotationMemberDeclarationEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithJavadoc() );
        annotationMemberDeclarationEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithSimpleName() );
        annotationMemberDeclarationEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithType() );
        EGenericType g2 = createEGenericType( this.getType() );
        g1.getETypeArguments().add( g2 );
        annotationMemberDeclarationEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithPublicModifier() );
        annotationMemberDeclarationEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithAbstractModifier() );
        annotationMemberDeclarationEClass.getEGenericSuperTypes().add( g1 );
        bodyDeclarationEClass.getESuperTypes().add( this.getJavaNode() );
        bodyDeclarationEClass.getESuperTypes().add( this.getNodeWithAnnotations() );
        callableDeclarationEClass.getESuperTypes().add( this.getBodyDeclaration() );
        callableDeclarationEClass.getESuperTypes().add( this.getNodeWithAccessModifiers() );
        callableDeclarationEClass.getESuperTypes().add( this.getNodeWithSimpleName() );
        callableDeclarationEClass.getESuperTypes().add( this.getNodeWithParameters() );
        callableDeclarationEClass.getESuperTypes().add( this.getNodeWithThrownExceptions() );
        callableDeclarationEClass.getESuperTypes().add( this.getNodeWithTypeParameters() );
        callableDeclarationEClass.getESuperTypes().add( this.getNodeWithJavadoc() );
        callableDeclarationEClass.getESuperTypes().add( this.getNodeWithAbstractModifier() );
        callableDeclarationEClass.getESuperTypes().add( this.getNodeWithStaticModifier() );
        callableDeclarationEClass.getESuperTypes().add( this.getNodeWithFinalModifier() );
        callableDeclarationEClass.getESuperTypes().add( this.getNodeWithStrictfpModifier() );
        classOrInterfaceDeclarationEClass.getESuperTypes().add( this.getTypeDeclaration() );
        classOrInterfaceDeclarationEClass.getESuperTypes().add( this.getNodeWithImplements() );
        classOrInterfaceDeclarationEClass.getESuperTypes().add( this.getNodeWithExtends() );
        classOrInterfaceDeclarationEClass.getESuperTypes().add( this.getNodeWithTypeParameters() );
        classOrInterfaceDeclarationEClass.getESuperTypes().add( this.getNodeWithAbstractModifier() );
        classOrInterfaceDeclarationEClass.getESuperTypes().add( this.getNodeWithFinalModifier() );
        constructorDeclarationEClass.getESuperTypes().add( this.getCallableDeclaration() );
        constructorDeclarationEClass.getESuperTypes().add( this.getNodeWithBlockStmt() );
        constructorDeclarationEClass.getESuperTypes().add( this.getNodeWithJavadoc() );
        enumConstantDeclarationEClass.getESuperTypes().add( this.getBodyDeclaration() );
        enumConstantDeclarationEClass.getESuperTypes().add( this.getNodeWithJavadoc() );
        enumConstantDeclarationEClass.getESuperTypes().add( this.getNodeWithSimpleName() );
        enumConstantDeclarationEClass.getESuperTypes().add( this.getNodeWithArguments() );
        enumDeclarationEClass.getESuperTypes().add( this.getTypeDeclaration() );
        enumDeclarationEClass.getESuperTypes().add( this.getNodeWithImplements() );
        fieldDeclarationEClass.getESuperTypes().add( this.getBodyDeclaration() );
        fieldDeclarationEClass.getESuperTypes().add( this.getNodeWithJavadoc() );
        fieldDeclarationEClass.getESuperTypes().add( this.getNodeWithVariables() );
        fieldDeclarationEClass.getESuperTypes().add( this.getNodeWithAccessModifiers() );
        fieldDeclarationEClass.getESuperTypes().add( this.getNodeWithStaticModifier() );
        fieldDeclarationEClass.getESuperTypes().add( this.getNodeWithFinalModifier() );
        fieldDeclarationEClass.getESuperTypes().add( this.getNodeWithTransientModifier() );
        fieldDeclarationEClass.getESuperTypes().add( this.getNodeWithVolatileModifier() );
        initializerDeclarationEClass.getESuperTypes().add( this.getBodyDeclaration() );
        initializerDeclarationEClass.getESuperTypes().add( this.getNodeWithJavadoc() );
        initializerDeclarationEClass.getESuperTypes().add( this.getNodeWithBlockStmt() );
        g1 = createEGenericType( this.getCallableDeclaration() );
        methodDeclarationEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithType() );
        g2 = createEGenericType( this.getType() );
        g1.getETypeArguments().add( g2 );
        methodDeclarationEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithBlockStmt() );
        methodDeclarationEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithNativeModifier() );
        methodDeclarationEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithSynchronizedModifier() );
        methodDeclarationEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithDefaultModifier() );
        methodDeclarationEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getJavaNode() );
        parameterEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithType() );
        g2 = createEGenericType( this.getType() );
        g1.getETypeArguments().add( g2 );
        parameterEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithAnnotations() );
        parameterEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithSimpleName() );
        parameterEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithFinalModifier() );
        parameterEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getJavaNode() );
        receiverParameterEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithType() );
        g2 = createEGenericType( this.getType() );
        g1.getETypeArguments().add( g2 );
        receiverParameterEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithAnnotations() );
        receiverParameterEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithName() );
        receiverParameterEClass.getEGenericSuperTypes().add( g1 );
        typeDeclarationEClass.getESuperTypes().add( this.getBodyDeclaration() );
        typeDeclarationEClass.getESuperTypes().add( this.getNodeWithSimpleName() );
        typeDeclarationEClass.getESuperTypes().add( this.getNodeWithJavadoc() );
        typeDeclarationEClass.getESuperTypes().add( this.getNodeWithMembers() );
        typeDeclarationEClass.getESuperTypes().add( this.getNodeWithAccessModifiers() );
        typeDeclarationEClass.getESuperTypes().add( this.getNodeWithStaticModifier() );
        typeDeclarationEClass.getESuperTypes().add( this.getNodeWithStrictfpModifier() );
        g1 = createEGenericType( this.getJavaNode() );
        variableDeclaratorEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithType() );
        g2 = createEGenericType( this.getType() );
        g1.getETypeArguments().add( g2 );
        variableDeclaratorEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithSimpleName() );
        variableDeclaratorEClass.getEGenericSuperTypes().add( g1 );
        blockCommentEClass.getESuperTypes().add( this.getComment() );
        commentEClass.getESuperTypes().add( this.getJavaNode() );
        javadocCommentEClass.getESuperTypes().add( this.getComment() );
        lineCommentEClass.getESuperTypes().add( this.getComment() );
        annotationExprEClass.getESuperTypes().add( this.getExpression() );
        annotationExprEClass.getESuperTypes().add( this.getNodeWithName() );
        arrayAccessExprEClass.getESuperTypes().add( this.getExpression() );
        arrayCreationExprEClass.getESuperTypes().add( this.getExpression() );
        arrayInitializerExprEClass.getESuperTypes().add( this.getExpression() );
        assignExprEClass.getESuperTypes().add( this.getExpression() );
        binaryExprEClass.getESuperTypes().add( this.getExpression() );
        booleanLiteralExprEClass.getESuperTypes().add( this.getLiteralExpr() );
        g1 = createEGenericType( this.getExpression() );
        castExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithType() );
        g2 = createEGenericType( this.getType() );
        g1.getETypeArguments().add( g2 );
        castExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithExpression() );
        castExprEClass.getEGenericSuperTypes().add( g1 );
        charLiteralExprEClass.getESuperTypes().add( this.getLiteralStringValueExpr() );
        g1 = createEGenericType( this.getExpression() );
        classExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithType() );
        g2 = createEGenericType( this.getType() );
        g1.getETypeArguments().add( g2 );
        classExprEClass.getEGenericSuperTypes().add( g1 );
        conditionalExprEClass.getESuperTypes().add( this.getExpression() );
        conditionalExprEClass.getESuperTypes().add( this.getNodeWithCondition() );
        doubleLiteralExprEClass.getESuperTypes().add( this.getLiteralStringValueExpr() );
        enclosedExprEClass.getESuperTypes().add( this.getExpression() );
        expressionEClass.getESuperTypes().add( this.getJavaNode() );
        g1 = createEGenericType( this.getExpression() );
        fieldAccessExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithSimpleName() );
        fieldAccessExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithTypeArguments() );
        fieldAccessExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithScope() );
        g2 = createEGenericType( this.getExpression() );
        g1.getETypeArguments().add( g2 );
        fieldAccessExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getExpression() );
        instanceOfExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithType() );
        g2 = createEGenericType( this.getReferenceType() );
        g1.getETypeArguments().add( g2 );
        instanceOfExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithExpression() );
        instanceOfExprEClass.getEGenericSuperTypes().add( g1 );
        integerLiteralExprEClass.getESuperTypes().add( this.getLiteralStringValueExpr() );
        lambdaExprEClass.getESuperTypes().add( this.getExpression() );
        lambdaExprEClass.getESuperTypes().add( this.getNodeWithParameters() );
        literalExprEClass.getESuperTypes().add( this.getExpression() );
        literalStringValueExprEClass.getESuperTypes().add( this.getLiteralExpr() );
        longLiteralExprEClass.getESuperTypes().add( this.getLiteralStringValueExpr() );
        markerAnnotationExprEClass.getESuperTypes().add( this.getAnnotationExpr() );
        memberValuePairEClass.getESuperTypes().add( this.getJavaNode() );
        memberValuePairEClass.getESuperTypes().add( this.getNodeWithSimpleName() );
        g1 = createEGenericType( this.getExpression() );
        methodCallExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithTypeArguments() );
        methodCallExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithArguments() );
        methodCallExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithSimpleName() );
        methodCallExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithScope() );
        g2 = createEGenericType( this.getExpression() );
        g1.getETypeArguments().add( g2 );
        methodCallExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getExpression() );
        methodReferenceExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithTypeArguments() );
        methodReferenceExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithIdentifier() );
        methodReferenceExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithScope() );
        g2 = createEGenericType( this.getExpression() );
        g1.getETypeArguments().add( g2 );
        methodReferenceExprEClass.getEGenericSuperTypes().add( g1 );
        nameEClass.getESuperTypes().add( this.getJavaNode() );
        nameEClass.getESuperTypes().add( this.getNodeWithIdentifier() );
        nameExprEClass.getESuperTypes().add( this.getExpression() );
        nameExprEClass.getESuperTypes().add( this.getNodeWithSimpleName() );
        normalAnnotationExprEClass.getESuperTypes().add( this.getAnnotationExpr() );
        nullLiteralExprEClass.getESuperTypes().add( this.getLiteralExpr() );
        g1 = createEGenericType( this.getExpression() );
        objectCreationExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithTypeArguments() );
        objectCreationExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithType() );
        g2 = createEGenericType( this.getClassOrInterfaceType() );
        g1.getETypeArguments().add( g2 );
        objectCreationExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithArguments() );
        objectCreationExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithScope() );
        g2 = createEGenericType( this.getExpression() );
        g1.getETypeArguments().add( g2 );
        objectCreationExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getExpression() );
        patternExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithSimpleName() );
        patternExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithType() );
        g2 = createEGenericType( this.getReferenceType() );
        g1.getETypeArguments().add( g2 );
        patternExprEClass.getEGenericSuperTypes().add( g1 );
        simpleNameEClass.getESuperTypes().add( this.getJavaNode() );
        simpleNameEClass.getESuperTypes().add( this.getNodeWithIdentifier() );
        singleMemberAnnotationExprEClass.getESuperTypes().add( this.getAnnotationExpr() );
        stringLiteralExprEClass.getESuperTypes().add( this.getLiteralStringValueExpr() );
        superExprEClass.getESuperTypes().add( this.getExpression() );
        switchExprEClass.getESuperTypes().add( this.getExpression() );
        switchExprEClass.getESuperTypes().add( this.getSwitchNode() );
        textBlockLiteralExprEClass.getESuperTypes().add( this.getLiteralStringValueExpr() );
        thisExprEClass.getESuperTypes().add( this.getExpression() );
        g1 = createEGenericType( this.getExpression() );
        typeExprEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithType() );
        g2 = createEGenericType( this.getType() );
        g1.getETypeArguments().add( g2 );
        typeExprEClass.getEGenericSuperTypes().add( g1 );
        unaryExprEClass.getESuperTypes().add( this.getExpression() );
        unaryExprEClass.getESuperTypes().add( this.getNodeWithExpression() );
        variableDeclarationExprEClass.getESuperTypes().add( this.getExpression() );
        variableDeclarationExprEClass.getESuperTypes().add( this.getNodeWithFinalModifier() );
        variableDeclarationExprEClass.getESuperTypes().add( this.getNodeWithAnnotations() );
        variableDeclarationExprEClass.getESuperTypes().add( this.getNodeWithVariables() );
        moduleDeclarationEClass.getESuperTypes().add( this.getJavaNode() );
        moduleDeclarationEClass.getESuperTypes().add( this.getNodeWithName() );
        moduleDeclarationEClass.getESuperTypes().add( this.getNodeWithAnnotations() );
        moduleDirectiveEClass.getESuperTypes().add( this.getJavaNode() );
        moduleExportsDirectiveEClass.getESuperTypes().add( this.getModuleDirective() );
        moduleExportsDirectiveEClass.getESuperTypes().add( this.getNodeWithName() );
        moduleOpensDirectiveEClass.getESuperTypes().add( this.getModuleDirective() );
        moduleOpensDirectiveEClass.getESuperTypes().add( this.getNodeWithName() );
        moduleProvidesDirectiveEClass.getESuperTypes().add( this.getModuleDirective() );
        moduleProvidesDirectiveEClass.getESuperTypes().add( this.getNodeWithName() );
        moduleRequiresDirectiveEClass.getESuperTypes().add( this.getModuleDirective() );
        moduleRequiresDirectiveEClass.getESuperTypes().add( this.getNodeWithStaticModifier() );
        moduleRequiresDirectiveEClass.getESuperTypes().add( this.getNodeWithName() );
        moduleRequiresDirectiveEClass.getESuperTypes().add( this.getNodeWithTransitiveModifier() );
        moduleUsesDirectiveEClass.getESuperTypes().add( this.getModuleDirective() );
        moduleUsesDirectiveEClass.getESuperTypes().add( this.getNodeWithName() );
        nodeWithAbstractModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        nodeWithAccessModifiersEClass.getESuperTypes().add( this.getNodeWithPublicModifier() );
        nodeWithAccessModifiersEClass.getESuperTypes().add( this.getNodeWithPrivateModifier() );
        nodeWithAccessModifiersEClass.getESuperTypes().add( this.getNodeWithProtectedModifier() );
        nodeWithDefaultModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        nodeWithFinalModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        nodeWithNativeModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        nodeWithPrivateModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        nodeWithProtectedModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        nodeWithPublicModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        nodeWithStaticModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        nodeWithSynchronizedModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        nodeWithStrictfpModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        nodeWithTransientModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        nodeWithTransitiveModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        nodeWithVolatileModifierEClass.getESuperTypes().add( this.getNodeWithModifiers() );
        assertStmtEClass.getESuperTypes().add( this.getStatement() );
        blockStmtEClass.getESuperTypes().add( this.getStatement() );
        blockStmtEClass.getESuperTypes().add( this.getNodeWithStatements() );
        breakStmtEClass.getESuperTypes().add( this.getStatement() );
        breakStmtEClass.getESuperTypes().add( this.getNodeWithLabel() );
        catchClauseEClass.getESuperTypes().add( this.getJavaNode() );
        catchClauseEClass.getESuperTypes().add( this.getNodeWithBlockStmt() );
        continueStmtEClass.getESuperTypes().add( this.getStatement() );
        continueStmtEClass.getESuperTypes().add( this.getNodeWithLabel() );
        doStmtEClass.getESuperTypes().add( this.getStatement() );
        doStmtEClass.getESuperTypes().add( this.getNodeWithBody() );
        doStmtEClass.getESuperTypes().add( this.getNodeWithCondition() );
        emptyStmtEClass.getESuperTypes().add( this.getStatement() );
        explicitConstructorInvocationStmtEClass.getESuperTypes().add( this.getStatement() );
        explicitConstructorInvocationStmtEClass.getESuperTypes().add( this.getNodeWithTypeArguments() );
        explicitConstructorInvocationStmtEClass.getESuperTypes().add( this.getNodeWithArguments() );
        explicitConstructorInvocationStmtEClass.getESuperTypes().add( this.getNodeWithExpression() );
        expressionStmtEClass.getESuperTypes().add( this.getStatement() );
        expressionStmtEClass.getESuperTypes().add( this.getNodeWithExpression() );
        forEachStmtEClass.getESuperTypes().add( this.getStatement() );
        forEachStmtEClass.getESuperTypes().add( this.getNodeWithBody() );
        forStmtEClass.getESuperTypes().add( this.getStatement() );
        forStmtEClass.getESuperTypes().add( this.getNodeWithBody() );
        ifStmtEClass.getESuperTypes().add( this.getStatement() );
        ifStmtEClass.getESuperTypes().add( this.getNodeWithCondition() );
        labeledStmtEClass.getESuperTypes().add( this.getStatement() );
        labeledStmtEClass.getESuperTypes().add( this.getNodeWithLabel() );
        localClassDeclarationStmtEClass.getESuperTypes().add( this.getStatement() );
        returnStmtEClass.getESuperTypes().add( this.getStatement() );
        returnStmtEClass.getESuperTypes().add( this.getNodeWithExpression() );
        statementEClass.getESuperTypes().add( this.getJavaNode() );
        switchEntryEClass.getESuperTypes().add( this.getJavaNode() );
        switchEntryEClass.getESuperTypes().add( this.getNodeWithStatements() );
        switchStmtEClass.getESuperTypes().add( this.getStatement() );
        switchStmtEClass.getESuperTypes().add( this.getSwitchNode() );
        synchronizedStmtEClass.getESuperTypes().add( this.getStatement() );
        synchronizedStmtEClass.getESuperTypes().add( this.getNodeWithBlockStmt() );
        synchronizedStmtEClass.getESuperTypes().add( this.getNodeWithExpression() );
        throwStmtEClass.getESuperTypes().add( this.getStatement() );
        throwStmtEClass.getESuperTypes().add( this.getNodeWithExpression() );
        tryStmtEClass.getESuperTypes().add( this.getStatement() );
        whileStmtEClass.getESuperTypes().add( this.getStatement() );
        whileStmtEClass.getESuperTypes().add( this.getNodeWithBody() );
        whileStmtEClass.getESuperTypes().add( this.getNodeWithCondition() );
        yieldStmtEClass.getESuperTypes().add( this.getStatement() );
        yieldStmtEClass.getESuperTypes().add( this.getNodeWithExpression() );
        arrayTypeEClass.getESuperTypes().add( this.getReferenceType() );
        arrayTypeEClass.getESuperTypes().add( this.getNodeWithAnnotations() );
        g1 = createEGenericType( this.getReferenceType() );
        classOrInterfaceTypeEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithSimpleName() );
        classOrInterfaceTypeEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithAnnotations() );
        classOrInterfaceTypeEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithTypeArguments() );
        classOrInterfaceTypeEClass.getEGenericSuperTypes().add( g1 );
        g1 = createEGenericType( this.getNodeWithScope() );
        g2 = createEGenericType( this.getClassOrInterfaceType() );
        g1.getETypeArguments().add( g2 );
        classOrInterfaceTypeEClass.getEGenericSuperTypes().add( g1 );
        intersectionTypeEClass.getESuperTypes().add( this.getType() );
        intersectionTypeEClass.getESuperTypes().add( this.getNodeWithAnnotations() );
        primitiveTypeEClass.getESuperTypes().add( this.getType() );
        primitiveTypeEClass.getESuperTypes().add( this.getNodeWithAnnotations() );
        referenceTypeEClass.getESuperTypes().add( this.getType() );
        typeEClass.getESuperTypes().add( this.getJavaNode() );
        typeParameterEClass.getESuperTypes().add( this.getReferenceType() );
        typeParameterEClass.getESuperTypes().add( this.getNodeWithSimpleName() );
        typeParameterEClass.getESuperTypes().add( this.getNodeWithAnnotations() );
        unionTypeEClass.getESuperTypes().add( this.getType() );
        unionTypeEClass.getESuperTypes().add( this.getNodeWithAnnotations() );
        unknownTypeEClass.getESuperTypes().add( this.getType() );
        varTypeEClass.getESuperTypes().add( this.getType() );
        voidTypeEClass.getESuperTypes().add( this.getType() );
        voidTypeEClass.getESuperTypes().add( this.getNodeWithAnnotations() );
        wildcardTypeEClass.getESuperTypes().add( this.getType() );
        wildcardTypeEClass.getESuperTypes().add( this.getNodeWithAnnotations() );

        // Initialize classes, features, and operations; add parameters
        initEClass( javaNodeEClass, JavaNode.class, "JavaNode", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getJavaNode_Comment(), this.getComment(), null, "comment", null, 0, 1, JavaNode.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getJavaNode_OrphanComments(), this.getComment(), null, "orphanComments", null, 0, -1,
                JavaNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( arrayCreationLevelEClass, ArrayCreationLevel.class, "ArrayCreationLevel", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getArrayCreationLevel_Dimension(), this.getExpression(), null, "dimension", null, 0, 1,
                ArrayCreationLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getCompilationUnit_PackageDeclaration(), this.getPackageDeclaration(), null,
                "packageDeclaration", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getCompilationUnit_Imports(), this.getImportDeclaration(), null, "imports", null, 0, -1,
                CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getCompilationUnit_Types(), this.getTypeDeclaration(), null, "types", null, 0, -1,
                CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getCompilationUnit_Module(), this.getModuleDeclaration(), null, "module", null, 0, 1,
                CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( importDeclarationEClass, ImportDeclaration.class, "ImportDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getImportDeclaration_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1,
                ImportDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getImportDeclaration_Asterisk(), ecorePackage.getEBoolean(), "asterisk", null, 0, 1,
                ImportDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( annotationDeclarationEClass, AnnotationDeclaration.class, "AnnotationDeclaration", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( annotationMemberDeclarationEClass, AnnotationMemberDeclaration.class, "AnnotationMemberDeclaration",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getAnnotationMemberDeclaration_DefaultValue(), this.getExpression(), null, "defaultValue", null,
                0, 1, AnnotationMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( bodyDeclarationEClass, BodyDeclaration.class, "BodyDeclaration", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( callableDeclarationEClass, CallableDeclaration.class, "CallableDeclaration", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getCallableDeclaration_ReceiverParameter(), this.getReceiverParameter(), null,
                "receiverParameter", null, 0, 1, CallableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( classOrInterfaceDeclarationEClass, ClassOrInterfaceDeclaration.class, "ClassOrInterfaceDeclaration",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getClassOrInterfaceDeclaration_Interface(), ecorePackage.getEBoolean(), "interface", null, 0, 1,
                ClassOrInterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( constructorDeclarationEClass, ConstructorDeclaration.class, "ConstructorDeclaration", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( enumConstantDeclarationEClass, EnumConstantDeclaration.class, "EnumConstantDeclaration",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getEnumConstantDeclaration_ClassBody(), this.getBodyDeclaration(), null, "classBody", null, 0,
                -1, EnumConstantDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( enumDeclarationEClass, EnumDeclaration.class, "EnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getEnumDeclaration_Entries(), this.getEnumConstantDeclaration(), null, "entries", null, 0, -1,
                EnumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( fieldDeclarationEClass, FieldDeclaration.class, "FieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( initializerDeclarationEClass, InitializerDeclaration.class, "InitializerDeclaration", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getInitializerDeclaration_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1,
                InitializerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( methodDeclarationEClass, MethodDeclaration.class, "MethodDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getParameter_VarArgs(), ecorePackage.getEBoolean(), "varArgs", null, 0, 1, Parameter.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEReference( getParameter_VarArgsAnnotations(), this.getAnnotationExpr(), null, "varArgsAnnotations", null,
                0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( receiverParameterEClass, ReceiverParameter.class, "ReceiverParameter", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( variableDeclaratorEClass, VariableDeclarator.class, "VariableDeclarator", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getVariableDeclarator_Initializer(), this.getExpression(), null, "initializer", null, 0, 1,
                VariableDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( blockCommentEClass, BlockComment.class, "BlockComment", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( commentEClass, Comment.class, "Comment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getComment_Content(), ecorePackage.getEString(), "content", null, 0, 1, Comment.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( javadocCommentEClass, JavadocComment.class, "JavadocComment", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( lineCommentEClass, LineComment.class, "LineComment", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( annotationExprEClass, AnnotationExpr.class, "AnnotationExpr", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( arrayAccessExprEClass, ArrayAccessExpr.class, "ArrayAccessExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getArrayAccessExpr_Name(), this.getExpression(), null, "name", null, 0, 1,
                ArrayAccessExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getArrayAccessExpr_Index(), this.getExpression(), null, "index", null, 0, 1,
                ArrayAccessExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( arrayCreationExprEClass, ArrayCreationExpr.class, "ArrayCreationExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getArrayCreationExpr_Levels(), this.getArrayCreationLevel(), null, "levels", null, 0, -1,
                ArrayCreationExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getArrayCreationExpr_ElementType(), this.getType(), null, "elementType", null, 0, 1,
                ArrayCreationExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getArrayCreationExpr_Initializer(), this.getArrayInitializerExpr(), null, "initializer", null,
                0, 1, ArrayCreationExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( arrayInitializerExprEClass, ArrayInitializerExpr.class, "ArrayInitializerExpr", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getArrayInitializerExpr_Values(), this.getExpression(), null, "values", null, 0, -1,
                ArrayInitializerExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( assignExprEClass, AssignExpr.class, "AssignExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getAssignExpr_Target(), this.getExpression(), null, "target", null, 0, 1, AssignExpr.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getAssignExpr_Value(), this.getExpression(), null, "value", null, 0, 1, AssignExpr.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAssignExpr_Operator(), this.getAssignOperator(), "operator", null, 0, 1, AssignExpr.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( binaryExprEClass, BinaryExpr.class, "BinaryExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getBinaryExpr_Left(), this.getExpression(), null, "left", null, 0, 1, BinaryExpr.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getBinaryExpr_Right(), this.getExpression(), null, "right", null, 0, 1, BinaryExpr.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getBinaryExpr_Operator(), this.getBinaryOperator(), "operator", null, 0, 1, BinaryExpr.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( booleanLiteralExprEClass, BooleanLiteralExpr.class, "BooleanLiteralExpr", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getBooleanLiteralExpr_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1,
                BooleanLiteralExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( castExprEClass, CastExpr.class, "CastExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( charLiteralExprEClass, CharLiteralExpr.class, "CharLiteralExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( classExprEClass, ClassExpr.class, "ClassExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( conditionalExprEClass, ConditionalExpr.class, "ConditionalExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getConditionalExpr_ThenExpr(), this.getExpression(), null, "thenExpr", null, 0, 1,
                ConditionalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getConditionalExpr_ElseExpr(), this.getExpression(), null, "elseExpr", null, 0, 1,
                ConditionalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( doubleLiteralExprEClass, DoubleLiteralExpr.class, "DoubleLiteralExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( enclosedExprEClass, EnclosedExpr.class, "EnclosedExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getEnclosedExpr_Inner(), this.getExpression(), null, "inner", null, 0, 1, EnclosedExpr.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( fieldAccessExprEClass, FieldAccessExpr.class, "FieldAccessExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( instanceOfExprEClass, InstanceOfExpr.class, "InstanceOfExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getInstanceOfExpr_Pattern(), this.getPatternExpr(), null, "pattern", null, 0, 1,
                InstanceOfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( integerLiteralExprEClass, IntegerLiteralExpr.class, "IntegerLiteralExpr", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( lambdaExprEClass, LambdaExpr.class, "LambdaExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getLambdaExpr_EnclosingParameters(), ecorePackage.getEBoolean(), "enclosingParameters", null, 0,
                1, LambdaExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEReference( getLambdaExpr_Body(), this.getStatement(), null, "body", null, 0, 1, LambdaExpr.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( literalExprEClass, LiteralExpr.class, "LiteralExpr", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( literalStringValueExprEClass, LiteralStringValueExpr.class, "LiteralStringValueExpr", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getLiteralStringValueExpr_Value(), ecorePackage.getEString(), "value", null, 0, 1,
                LiteralStringValueExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( longLiteralExprEClass, LongLiteralExpr.class, "LongLiteralExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( markerAnnotationExprEClass, MarkerAnnotationExpr.class, "MarkerAnnotationExpr", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( memberValuePairEClass, MemberValuePair.class, "MemberValuePair", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getMemberValuePair_Value(), this.getExpression(), null, "value", null, 0, 1,
                MemberValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( methodCallExprEClass, MethodCallExpr.class, "MethodCallExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( methodReferenceExprEClass, MethodReferenceExpr.class, "MethodReferenceExpr", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getName_Qualifier(), this.getName_(), null, "qualifier", null, 0, 1, Name.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( nameExprEClass, NameExpr.class, "NameExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( normalAnnotationExprEClass, NormalAnnotationExpr.class, "NormalAnnotationExpr", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNormalAnnotationExpr_Pairs(), this.getMemberValuePair(), null, "pairs", null, 0, -1,
                NormalAnnotationExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nullLiteralExprEClass, NullLiteralExpr.class, "NullLiteralExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( objectCreationExprEClass, ObjectCreationExpr.class, "ObjectCreationExpr", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getObjectCreationExpr_AnonymousClassBody(), this.getBodyDeclaration(), null,
                "anonymousClassBody", null, 0, -1, ObjectCreationExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( patternExprEClass, PatternExpr.class, "PatternExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( simpleNameEClass, SimpleName.class, "SimpleName", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( singleMemberAnnotationExprEClass, SingleMemberAnnotationExpr.class, "SingleMemberAnnotationExpr",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getSingleMemberAnnotationExpr_MemberValue(), this.getExpression(), null, "memberValue", null, 0,
                1, SingleMemberAnnotationExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( stringLiteralExprEClass, StringLiteralExpr.class, "StringLiteralExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( superExprEClass, SuperExpr.class, "SuperExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getSuperExpr_TypeName(), this.getName_(), null, "typeName", null, 0, 1, SuperExpr.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( switchExprEClass, SwitchExpr.class, "SwitchExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( textBlockLiteralExprEClass, TextBlockLiteralExpr.class, "TextBlockLiteralExpr", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( thisExprEClass, ThisExpr.class, "ThisExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getThisExpr_TypeName(), this.getName_(), null, "typeName", null, 0, 1, ThisExpr.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( typeExprEClass, TypeExpr.class, "TypeExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( unaryExprEClass, UnaryExpr.class, "UnaryExpr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getUnaryExpr_Operator(), this.getUnaryOperator(), "operator", null, 0, 1, UnaryExpr.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( variableDeclarationExprEClass, VariableDeclarationExpr.class, "VariableDeclarationExpr",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( moduleDeclarationEClass, ModuleDeclaration.class, "ModuleDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getModuleDeclaration_Open(), ecorePackage.getEBoolean(), "open", null, 0, 1,
                ModuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEReference( getModuleDeclaration_Directives(), this.getModuleDirective(), null, "directives", null, 0, -1,
                ModuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( moduleDirectiveEClass, ModuleDirective.class, "ModuleDirective", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( moduleExportsDirectiveEClass, ModuleExportsDirective.class, "ModuleExportsDirective", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getModuleExportsDirective_ModuleNames(), this.getName_(), null, "moduleNames", null, 0, -1,
                ModuleExportsDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( moduleOpensDirectiveEClass, ModuleOpensDirective.class, "ModuleOpensDirective", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getModuleOpensDirective_ModuleNames(), this.getName_(), null, "moduleNames", null, 0, -1,
                ModuleOpensDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( moduleProvidesDirectiveEClass, ModuleProvidesDirective.class, "ModuleProvidesDirective",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getModuleProvidesDirective_With(), this.getName_(), null, "with", null, 0, -1,
                ModuleProvidesDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( moduleRequiresDirectiveEClass, ModuleRequiresDirective.class, "ModuleRequiresDirective",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( moduleUsesDirectiveEClass, ModuleUsesDirective.class, "ModuleUsesDirective", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( nodeWithAnnotationsEClass, NodeWithAnnotations.class, "NodeWithAnnotations", IS_ABSTRACT,
                IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithAnnotations_Annotations(), this.getAnnotationExpr(), null, "annotations", null, 0,
                -1, NodeWithAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithArgumentsEClass, NodeWithArguments.class, "NodeWithArguments", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithArguments_Arguments(), this.getExpression(), null, "arguments", null, 0, -1,
                NodeWithArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithBlockStmtEClass, NodeWithBlockStmt.class, "NodeWithBlockStmt", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithBlockStmt_Body(), this.getBlockStmt(), null, "body", null, 0, 1,
                NodeWithBlockStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithBodyEClass, NodeWithBody.class, "NodeWithBody", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithBody_Body(), this.getStatement(), null, "body", null, 0, 1, NodeWithBody.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithConditionEClass, NodeWithCondition.class, "NodeWithCondition", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithCondition_Condition(), this.getExpression(), null, "condition", null, 0, 1,
                NodeWithCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithExpressionEClass, NodeWithExpression.class, "NodeWithExpression", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1,
                NodeWithExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithExtendsEClass, NodeWithExtends.class, "NodeWithExtends", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithExtends_ExtendedTypes(), this.getClassOrInterfaceType(), null, "extendedTypes", null,
                0, -1, NodeWithExtends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithIdentifierEClass, NodeWithIdentifier.class, "NodeWithIdentifier", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithIdentifier_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
                NodeWithIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithImplementsEClass, NodeWithImplements.class, "NodeWithImplements", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithImplements_ImplementedTypes(), this.getClassOrInterfaceType(), null,
                "implementedTypes", null, 0, -1, NodeWithImplements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithJavadocEClass, NodeWithJavadoc.class, "NodeWithJavadoc", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( nodeWithMembersEClass, NodeWithMembers.class, "NodeWithMembers", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithMembers_Members(), this.getBodyDeclaration(), null, "members", null, 0, -1,
                NodeWithMembers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithModifiersEClass, NodeWithModifiers.class, "NodeWithModifiers", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithModifiers_Modifiers(), this.getModifierKeyword(), "modifiers", null, 0, -1,
                NodeWithModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithNameEClass, NodeWithName.class, "NodeWithName", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithName_Name(), this.getName_(), null, "name", null, 0, 1, NodeWithName.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithLabelEClass, NodeWithLabel.class, "NodeWithLabel", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithLabel_Label(), this.getSimpleName(), null, "label", null, 0, 1, NodeWithLabel.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithParametersEClass, NodeWithParameters.class, "NodeWithParameters", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithParameters_Parameters(), this.getParameter(), null, "parameters", null, 0, -1,
                NodeWithParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithRangeEClass, NodeWithRange.class, "NodeWithRange", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( nodeWithScopeEClass, NodeWithScope.class, "NodeWithScope", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        g1 = createEGenericType( nodeWithScopeEClass_ScopeType );
        initEReference( getNodeWithScope_Scope(), g1, null, "scope", null, 0, 1, NodeWithScope.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( nodeWithSimpleNameEClass, NodeWithSimpleName.class, "NodeWithSimpleName", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithSimpleName_Name(), this.getSimpleName(), null, "name", null, 0, 1,
                NodeWithSimpleName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithStatementsEClass, NodeWithStatements.class, "NodeWithStatements", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithStatements_Statements(), this.getStatement(), null, "statements", null, 0, -1,
                NodeWithStatements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithThrownExceptionsEClass, NodeWithThrownExceptions.class, "NodeWithThrownExceptions",
                IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithThrownExceptions_ThrownExceptions(), this.getReferenceType(), null,
                "thrownExceptions", null, 0, -1, NodeWithThrownExceptions.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithTokenRangeEClass, NodeWithTokenRange.class, "NodeWithTokenRange", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( nodeWithTypeEClass, NodeWithType.class, "NodeWithType", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        g1 = createEGenericType( nodeWithTypeEClass_TypeUsed );
        initEReference( getNodeWithType_Type(), g1, null, "type", null, 0, 1, NodeWithType.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( nodeWithTypeArgumentsEClass, NodeWithTypeArguments.class, "NodeWithTypeArguments", IS_ABSTRACT,
                IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithTypeArguments_TypeArguments(), this.getType(), null, "typeArguments", null, 0, -1,
                NodeWithTypeArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithTypeParametersEClass, NodeWithTypeParameters.class, "NodeWithTypeParameters", IS_ABSTRACT,
                IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithTypeParameters_TypeParameters(), this.getTypeParameter(), null, "typeParameters",
                null, 0, -1, NodeWithTypeParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithVariablesEClass, NodeWithVariables.class, "NodeWithVariables", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNodeWithVariables_Variables(), this.getVariableDeclarator(), null, "variables", null, 0, -1,
                NodeWithVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( switchNodeEClass, SwitchNode.class, "SwitchNode", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getSwitchNode_Selector(), this.getExpression(), null, "selector", null, 0, 1, SwitchNode.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getSwitchNode_Entries(), this.getSwitchEntry(), null, "entries", null, 0, -1, SwitchNode.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithAbstractModifierEClass, NodeWithAbstractModifier.class, "NodeWithAbstractModifier",
                IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithAbstractModifier_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1,
                NodeWithAbstractModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithAccessModifiersEClass, NodeWithAccessModifiers.class, "NodeWithAccessModifiers",
                IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( nodeWithDefaultModifierEClass, NodeWithDefaultModifier.class, "NodeWithDefaultModifier",
                IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithDefaultModifier_Default(), ecorePackage.getEBoolean(), "default", null, 0, 1,
                NodeWithDefaultModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithFinalModifierEClass, NodeWithFinalModifier.class, "NodeWithFinalModifier", IS_ABSTRACT,
                IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithFinalModifier_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1,
                NodeWithFinalModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithNativeModifierEClass, NodeWithNativeModifier.class, "NodeWithNativeModifier", IS_ABSTRACT,
                IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithNativeModifier_Native(), ecorePackage.getEBoolean(), "native", null, 0, 1,
                NodeWithNativeModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithPrivateModifierEClass, NodeWithPrivateModifier.class, "NodeWithPrivateModifier",
                IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithPrivateModifier_Private(), ecorePackage.getEBoolean(), "private", null, 0, 1,
                NodeWithPrivateModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithProtectedModifierEClass, NodeWithProtectedModifier.class, "NodeWithProtectedModifier",
                IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithProtectedModifier_Protected(), ecorePackage.getEBoolean(), "protected", null, 0, 1,
                NodeWithProtectedModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithPublicModifierEClass, NodeWithPublicModifier.class, "NodeWithPublicModifier", IS_ABSTRACT,
                IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithPublicModifier_Public(), ecorePackage.getEBoolean(), "public", null, 0, 1,
                NodeWithPublicModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithStaticModifierEClass, NodeWithStaticModifier.class, "NodeWithStaticModifier", IS_ABSTRACT,
                IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithStaticModifier_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1,
                NodeWithStaticModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithSynchronizedModifierEClass, NodeWithSynchronizedModifier.class,
                "NodeWithSynchronizedModifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithSynchronizedModifier_Synchronized(), ecorePackage.getEBoolean(), "synchronized",
                null, 0, 1, NodeWithSynchronizedModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithStrictfpModifierEClass, NodeWithStrictfpModifier.class, "NodeWithStrictfpModifier",
                IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithStrictfpModifier_Strictfp(), ecorePackage.getEBoolean(), "strictfp", null, 0, 1,
                NodeWithStrictfpModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithTransientModifierEClass, NodeWithTransientModifier.class, "NodeWithTransientModifier",
                IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithTransientModifier_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1,
                NodeWithTransientModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithTransitiveModifierEClass, NodeWithTransitiveModifier.class, "NodeWithTransitiveModifier",
                IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithTransitiveModifier_Transitive(), ecorePackage.getEBoolean(), "transitive", null, 0,
                1, NodeWithTransitiveModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( nodeWithVolatileModifierEClass, NodeWithVolatileModifier.class, "NodeWithVolatileModifier",
                IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNodeWithVolatileModifier_Volatile(), ecorePackage.getEBoolean(), "volatile", null, 0, 1,
                NodeWithVolatileModifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED );

        initEClass( assertStmtEClass, AssertStmt.class, "AssertStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getAssertStmt_Check(), this.getExpression(), null, "check", null, 0, 1, AssertStmt.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getAssertStmt_Message(), this.getExpression(), null, "message", null, 0, 1, AssertStmt.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( blockStmtEClass, BlockStmt.class, "BlockStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( breakStmtEClass, BreakStmt.class, "BreakStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( catchClauseEClass, CatchClause.class, "CatchClause", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getCatchClause_Parameter(), this.getParameter(), null, "parameter", null, 0, 1,
                CatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( continueStmtEClass, ContinueStmt.class, "ContinueStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( doStmtEClass, DoStmt.class, "DoStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( emptyStmtEClass, EmptyStmt.class, "EmptyStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( explicitConstructorInvocationStmtEClass, ExplicitConstructorInvocationStmt.class,
                "ExplicitConstructorInvocationStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getExplicitConstructorInvocationStmt_IsThis(), ecorePackage.getEBoolean(), "isThis", null, 0, 1,
                ExplicitConstructorInvocationStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( expressionStmtEClass, ExpressionStmt.class, "ExpressionStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( forEachStmtEClass, ForEachStmt.class, "ForEachStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getForEachStmt_Variable(), this.getVariableDeclarationExpr(), null, "variable", null, 0, 1,
                ForEachStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getForEachStmt_Iterable(), this.getExpression(), null, "iterable", null, 0, 1,
                ForEachStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( forStmtEClass, ForStmt.class, "ForStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getForStmt_Initialization(), this.getExpression(), null, "initialization", null, 0, -1,
                ForStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getForStmt_Compare(), this.getExpression(), null, "compare", null, 0, 1, ForStmt.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getForStmt_Update(), this.getExpression(), null, "update", null, 0, -1, ForStmt.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( ifStmtEClass, IfStmt.class, "IfStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getIfStmt_ThenStmt(), this.getStatement(), null, "thenStmt", null, 0, 1, IfStmt.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getIfStmt_ElseStmt(), this.getStatement(), null, "elseStmt", null, 0, 1, IfStmt.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( labeledStmtEClass, LabeledStmt.class, "LabeledStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getLabeledStmt_Statement(), this.getStatement(), null, "statement", null, 0, 1,
                LabeledStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( localClassDeclarationStmtEClass, LocalClassDeclarationStmt.class, "LocalClassDeclarationStmt",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getLocalClassDeclarationStmt_ClassDeclaration(), this.getClassOrInterfaceDeclaration(), null,
                "classDeclaration", null, 0, 1, LocalClassDeclarationStmt.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( returnStmtEClass, ReturnStmt.class, "ReturnStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( switchEntryEClass, SwitchEntry.class, "SwitchEntry", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getSwitchEntry_Labels(), this.getExpression(), null, "labels", null, 0, -1, SwitchEntry.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSwitchEntry_Type(), this.getSwitchEntryType(), "type", null, 0, 1, SwitchEntry.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( switchStmtEClass, SwitchStmt.class, "SwitchStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( synchronizedStmtEClass, SynchronizedStmt.class, "SynchronizedStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( throwStmtEClass, ThrowStmt.class, "ThrowStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( tryStmtEClass, TryStmt.class, "TryStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTryStmt_Resources(), this.getExpression(), null, "resources", null, 0, -1, TryStmt.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTryStmt_TryBlock(), this.getBlockStmt(), null, "tryBlock", null, 0, 1, TryStmt.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTryStmt_CatchClauses(), this.getCatchClause(), null, "catchClauses", null, 0, -1,
                TryStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTryStmt_FinallyBlock(), this.getBlockStmt(), null, "finallyBlock", null, 0, 1, TryStmt.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( whileStmtEClass, WhileStmt.class, "WhileStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( yieldStmtEClass, YieldStmt.class, "YieldStmt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getArrayType_ComponentType(), this.getType(), null, "componentType", null, 0, 1,
                ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getArrayType_Origin(), this.getArrayTypeOrigin(), "origin", null, 0, 1, ArrayType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( classOrInterfaceTypeEClass, ClassOrInterfaceType.class, "ClassOrInterfaceType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( intersectionTypeEClass, IntersectionType.class, "IntersectionType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getIntersectionType_Elements(), this.getReferenceType(), null, "elements", null, 0, -1,
                IntersectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getPrimitiveType_Type(), this.getPrimitive(), "type", null, 0, 1, PrimitiveType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( referenceTypeEClass, ReferenceType.class, "ReferenceType", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( typeParameterEClass, TypeParameter.class, "TypeParameter", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTypeParameter_TypeBound(), this.getClassOrInterfaceType(), null, "typeBound", null, 0, -1,
                TypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( unionTypeEClass, UnionType.class, "UnionType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getUnionType_Elements(), this.getReferenceType(), null, "elements", null, 0, -1,
                UnionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( unknownTypeEClass, UnknownType.class, "UnknownType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( varTypeEClass, VarType.class, "VarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass( voidTypeEClass, VoidType.class, "VoidType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( wildcardTypeEClass, WildcardType.class, "WildcardType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getWildcardType_ExtendedType(), this.getReferenceType(), null, "extendedType", null, 0, 1,
                WildcardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getWildcardType_SuperType(), this.getReferenceType(), null, "superType", null, 0, 1,
                WildcardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        // Initialize enums and add enum literals
        initEEnum( modifierKeywordEEnum, ModifierKeyword.class, "ModifierKeyword" );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.PUBLIC );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.STATIC );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.PROTECTED );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.PRIVATE );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.FINAL );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.ABSTRACT );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.SYNCHRONIZED );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.NATIVE );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.TRANSIENT );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.VOLATILE );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.STRICTFP );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.TRANSITIVE );
        addEEnumLiteral( modifierKeywordEEnum, ModifierKeyword.DEFAULT );

        initEEnum( assignOperatorEEnum, AssignOperator.class, "AssignOperator" );
        addEEnumLiteral( assignOperatorEEnum, AssignOperator.ASSIGN );
        addEEnumLiteral( assignOperatorEEnum, AssignOperator.PLUS );
        addEEnumLiteral( assignOperatorEEnum, AssignOperator.MINUS );
        addEEnumLiteral( assignOperatorEEnum, AssignOperator.MULTIPLY );
        addEEnumLiteral( assignOperatorEEnum, AssignOperator.DIVIDE );
        addEEnumLiteral( assignOperatorEEnum, AssignOperator.BINARY_AND );
        addEEnumLiteral( assignOperatorEEnum, AssignOperator.BINARY_OR );
        addEEnumLiteral( assignOperatorEEnum, AssignOperator.XOR );
        addEEnumLiteral( assignOperatorEEnum, AssignOperator.REMAINDER );
        addEEnumLiteral( assignOperatorEEnum, AssignOperator.LEFT_SHIFT );
        addEEnumLiteral( assignOperatorEEnum, AssignOperator.SIGNED_RIGHT_SHIFT );
        addEEnumLiteral( assignOperatorEEnum, AssignOperator.UNSIGNED_RIGHT_SHIFT );

        initEEnum( binaryOperatorEEnum, BinaryOperator.class, "BinaryOperator" );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.OR );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.AND );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.BINARY_OR );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.BINARY_AND );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.XOR );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.EQUALS );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.NOT_EQUALS );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.LESS );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.GREATER );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.LESS_EQUALS );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.GREATER_EQUALS );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.LEFT_SHIFT );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.SIGNED_RIGHT_SHIFT );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.UNSIGNED_RIGHT_SHIFT );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.PLUS );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.MINUS );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.MULTIPLY );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.DIVIDE );
        addEEnumLiteral( binaryOperatorEEnum, BinaryOperator.REMAINDER );

        initEEnum( unaryOperatorEEnum, UnaryOperator.class, "UnaryOperator" );
        addEEnumLiteral( unaryOperatorEEnum, UnaryOperator.PLUS );
        addEEnumLiteral( unaryOperatorEEnum, UnaryOperator.MINUS );
        addEEnumLiteral( unaryOperatorEEnum, UnaryOperator.PREFIX_INCREMENT );
        addEEnumLiteral( unaryOperatorEEnum, UnaryOperator.PREFIX_DECREMENT );
        addEEnumLiteral( unaryOperatorEEnum, UnaryOperator.LOGICAL_COMPLEMENT );
        addEEnumLiteral( unaryOperatorEEnum, UnaryOperator.BITWISE_COMPLEMENT );
        addEEnumLiteral( unaryOperatorEEnum, UnaryOperator.POSTFIX_INCREMENT );
        addEEnumLiteral( unaryOperatorEEnum, UnaryOperator.POSTFIX_DECREMENT );

        initEEnum( switchEntryTypeEEnum, SwitchEntryType.class, "SwitchEntryType" );
        addEEnumLiteral( switchEntryTypeEEnum, SwitchEntryType.STATEMENT_GROUP );
        addEEnumLiteral( switchEntryTypeEEnum, SwitchEntryType.EXPRESSION );
        addEEnumLiteral( switchEntryTypeEEnum, SwitchEntryType.BLOCK );
        addEEnumLiteral( switchEntryTypeEEnum, SwitchEntryType.THROWS_STATEMENT );

        initEEnum( arrayTypeOriginEEnum, ArrayTypeOrigin.class, "ArrayTypeOrigin" );
        addEEnumLiteral( arrayTypeOriginEEnum, ArrayTypeOrigin.NAME );
        addEEnumLiteral( arrayTypeOriginEEnum, ArrayTypeOrigin.TYPE );

        initEEnum( primitiveEEnum, Primitive.class, "Primitive" );
        addEEnumLiteral( primitiveEEnum, Primitive.BOOLEAN );
        addEEnumLiteral( primitiveEEnum, Primitive.CHAR );
        addEEnumLiteral( primitiveEEnum, Primitive.BYTE );
        addEEnumLiteral( primitiveEEnum, Primitive.SHORT );
        addEEnumLiteral( primitiveEEnum, Primitive.INT );
        addEEnumLiteral( primitiveEEnum, Primitive.LONG );
        addEEnumLiteral( primitiveEEnum, Primitive.FLOAT );
        addEEnumLiteral( primitiveEEnum, Primitive.DOUBLE );

        // Create resource
        createResource( eNS_URI );
    }

} //EJavaPackageImpl
