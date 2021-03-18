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

import fr.centralesupelec.csd.ejava.EJavaFactory;
import fr.centralesupelec.csd.ejava.EJavaPackage;
import fr.centralesupelec.csd.ejava.ReceiverParameter;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.csd.ejava.ReceiverParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReceiverParameterItemProvider extends JavaNodeItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReceiverParameterItemProvider( AdapterFactory adapterFactory ) {
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

        }
        return itemPropertyDescriptors;
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
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_TYPE__TYPE );
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_ANNOTATIONS__ANNOTATIONS );
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_NAME__NAME );
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
     * This returns ReceiverParameter.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ReceiverParameter" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        return getString( "_UI_ReceiverParameter_type" );
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

        switch( notification.getFeatureID( ReceiverParameter.class ) ) {
        case EJavaPackage.RECEIVER_PARAMETER__TYPE:
        case EJavaPackage.RECEIVER_PARAMETER__ANNOTATIONS:
        case EJavaPackage.RECEIVER_PARAMETER__NAME:
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

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_ANNOTATIONS__ANNOTATIONS,
                EJavaFactory.eINSTANCE.createMarkerAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_ANNOTATIONS__ANNOTATIONS,
                EJavaFactory.eINSTANCE.createNormalAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_ANNOTATIONS__ANNOTATIONS,
                EJavaFactory.eINSTANCE.createSingleMemberAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_NAME__NAME,
                EJavaFactory.eINSTANCE.createName() ) );
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
                childFeature == EJavaPackage.Literals.NODE_WITH_NAME__NAME;

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
