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
package fr.centralesupelec.csd.ejava.provider;

import fr.centralesupelec.csd.ejava.AnnotationMemberDeclaration;
import fr.centralesupelec.csd.ejava.EJavaFactory;
import fr.centralesupelec.csd.ejava.EJavaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.csd.ejava.AnnotationMemberDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationMemberDeclarationItemProvider extends BodyDeclarationItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnnotationMemberDeclarationItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addNamePropertyDescriptor( object );
            addModifiersPropertyDescriptor( object );
            addPublicPropertyDescriptor( object );
            addAbstractPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_NodeWithSimpleName_name_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_NodeWithSimpleName_name_feature",
                                "_UI_NodeWithSimpleName_type" ),
                        EJavaPackage.Literals.NODE_WITH_SIMPLE_NAME__NAME,
                        true,
                        false,
                        false,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Modifiers feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModifiersPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_NodeWithModifiers_modifiers_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_NodeWithModifiers_modifiers_feature",
                                "_UI_NodeWithModifiers_type" ),
                        EJavaPackage.Literals.NODE_WITH_MODIFIERS__MODIFIERS,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Public feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPublicPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_NodeWithPublicModifier_public_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_NodeWithPublicModifier_public_feature",
                                "_UI_NodeWithPublicModifier_type" ),
                        EJavaPackage.Literals.NODE_WITH_PUBLIC_MODIFIER__PUBLIC,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Abstract feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAbstractPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_NodeWithAbstractModifier_abstract_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_NodeWithAbstractModifier_abstract_feature", "_UI_NodeWithAbstractModifier_type" ),
                        EJavaPackage.Literals.NODE_WITH_ABSTRACT_MODIFIER__ABSTRACT,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection< ? extends EStructuralFeature > getChildrenFeatures( Object object ) {
        if( childrenFeatures == null ) {
            super.getChildrenFeatures( object );
            childrenFeatures.add( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature( Object object, Object child ) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature( object, child );
    }

    /**
     * This returns AnnotationMemberDeclaration.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/AnnotationMemberDeclaration" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        AnnotationMemberDeclaration annotationMemberDeclaration = ( AnnotationMemberDeclaration ) object;
        return getString( "_UI_AnnotationMemberDeclaration_type" ) + " " + annotationMemberDeclaration.isPublic();
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( AnnotationMemberDeclaration.class ) ) {
        case EJavaPackage.ANNOTATION_MEMBER_DECLARATION__NAME:
        case EJavaPackage.ANNOTATION_MEMBER_DECLARATION__TYPE:
        case EJavaPackage.ANNOTATION_MEMBER_DECLARATION__MODIFIERS:
        case EJavaPackage.ANNOTATION_MEMBER_DECLARATION__PUBLIC:
        case EJavaPackage.ANNOTATION_MEMBER_DECLARATION__ABSTRACT:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case EJavaPackage.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), true, false ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createArrayCreationLevel() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createCompilationUnit() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createImportDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createPackageDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createAnnotationDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createAnnotationMemberDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createClassOrInterfaceDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createConstructorDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createEnumConstantDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createEnumDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createFieldDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createInitializerDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createMethodDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createParameter() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createReceiverParameter() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createVariableDeclarator() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createBlockComment() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createJavadocComment() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createLineComment() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createArrayAccessExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createArrayCreationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createArrayInitializerExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createAssignExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createBinaryExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createBooleanLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createCastExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createCharLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createClassExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createConditionalExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createDoubleLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createEnclosedExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createFieldAccessExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createInstanceOfExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createIntegerLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createLambdaExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createLongLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createMarkerAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createMemberValuePair() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createMethodCallExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createMethodReferenceExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createName() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createNameExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createNormalAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createNullLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createObjectCreationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createPatternExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createSimpleName() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createSingleMemberAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createStringLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createSuperExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createSwitchExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createTextBlockLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createThisExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createTypeExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createUnaryExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createVariableDeclarationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createModuleDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createModuleExportsDirective() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createModuleOpensDirective() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createModuleProvidesDirective() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createModuleRequiresDirective() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createModuleUsesDirective() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createStatement() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createAssertStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createBlockStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createBreakStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createCatchClause() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createContinueStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createDoStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createEmptyStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createExplicitConstructorInvocationStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createExpressionStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createForEachStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createForStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createIfStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createLabeledStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createLocalClassDeclarationStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createReturnStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createSwitchEntry() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createSwitchStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createSynchronizedStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createThrowStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createTryStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createWhileStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createYieldStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createArrayType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createClassOrInterfaceType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createIntersectionType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createPrimitiveType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createTypeParameter() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createUnionType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createUnknownType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createVarType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createVoidType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createWildcardType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createProject() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE,
                EJavaFactory.eINSTANCE.createPackage() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createArrayAccessExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createArrayCreationExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createArrayInitializerExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createAssignExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createBinaryExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createBooleanLiteralExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createCastExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createCharLiteralExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createClassExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createConditionalExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createDoubleLiteralExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createEnclosedExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createFieldAccessExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createInstanceOfExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createIntegerLiteralExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createLambdaExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createLongLiteralExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createMarkerAnnotationExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createMethodCallExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createMethodReferenceExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createNameExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createNormalAnnotationExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createNullLiteralExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createObjectCreationExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createPatternExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createSingleMemberAnnotationExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createStringLiteralExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createSuperExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createSwitchExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createTextBlockLiteralExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createThisExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createTypeExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createUnaryExpr() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE,
                        EJavaFactory.eINSTANCE.createVariableDeclarationExpr() ) );
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText( Object owner, Object feature, Object child, Collection< ? > selection ) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == EJavaPackage.Literals.JAVA_NODE__COMMENT ||
                childFeature == EJavaPackage.Literals.JAVA_NODE__ORPHAN_COMMENTS ||
                childFeature == EJavaPackage.Literals.NODE_WITH_TYPE__TYPE ||
                childFeature == EJavaPackage.Literals.NODE_WITH_ANNOTATIONS__ANNOTATIONS ||
                childFeature == EJavaPackage.Literals.ANNOTATION_MEMBER_DECLARATION__DEFAULT_VALUE;

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
