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
import fr.centralesupelec.csd.ejava.MethodReferenceExpr;

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
 * This is the item provider adapter for a {@link fr.centralesupelec.csd.ejava.MethodReferenceExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodReferenceExprItemProvider extends ExpressionItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MethodReferenceExprItemProvider( AdapterFactory adapterFactory ) {
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

            addIdentifierPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Identifier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdentifierPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_NodeWithIdentifier_identifier_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_NodeWithIdentifier_identifier_feature",
                                "_UI_NodeWithIdentifier_type" ),
                        EJavaPackage.Literals.NODE_WITH_IDENTIFIER__IDENTIFIER,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS );
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE );
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
     * This returns MethodReferenceExpr.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/MethodReferenceExpr" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( MethodReferenceExpr ) object ).getIdentifier();
        return label == null || label.length() == 0 ? getString( "_UI_MethodReferenceExpr_type" )
                : getString( "_UI_MethodReferenceExpr_type" ) + " " + label;
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

        switch( notification.getFeatureID( MethodReferenceExpr.class ) ) {
        case EJavaPackage.METHOD_REFERENCE_EXPR__IDENTIFIER:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case EJavaPackage.METHOD_REFERENCE_EXPR__TYPE_ARGUMENTS:
        case EJavaPackage.METHOD_REFERENCE_EXPR__SCOPE:
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

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS,
                EJavaFactory.eINSTANCE.createArrayType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS,
                EJavaFactory.eINSTANCE.createClassOrInterfaceType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS,
                EJavaFactory.eINSTANCE.createIntersectionType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS,
                EJavaFactory.eINSTANCE.createPrimitiveType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS,
                EJavaFactory.eINSTANCE.createTypeParameter() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS,
                EJavaFactory.eINSTANCE.createUnionType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS,
                EJavaFactory.eINSTANCE.createUnknownType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS,
                EJavaFactory.eINSTANCE.createVarType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS,
                EJavaFactory.eINSTANCE.createVoidType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS,
                EJavaFactory.eINSTANCE.createWildcardType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createArrayCreationLevel() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createCompilationUnit() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createImportDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createPackageDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createAnnotationDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createAnnotationMemberDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createClassOrInterfaceDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createConstructorDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createEnumConstantDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createEnumDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createFieldDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createInitializerDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createMethodDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createParameter() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createReceiverParameter() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createVariableDeclarator() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createBlockComment() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createJavadocComment() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createLineComment() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createArrayAccessExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createArrayCreationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createArrayInitializerExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createAssignExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createBinaryExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createBooleanLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createCastExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createCharLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createClassExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createConditionalExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createDoubleLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createEnclosedExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createFieldAccessExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createInstanceOfExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createIntegerLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createLambdaExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createLongLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createMarkerAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createMemberValuePair() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createMethodCallExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createMethodReferenceExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createName() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createNameExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createNormalAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createNullLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createObjectCreationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createPatternExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createSimpleName() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createSingleMemberAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createStringLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createSuperExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createSwitchExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createTextBlockLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createThisExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createTypeExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createUnaryExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createVariableDeclarationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createModuleDeclaration() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createModuleExportsDirective() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createModuleOpensDirective() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createModuleProvidesDirective() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createModuleRequiresDirective() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createModuleUsesDirective() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createStatement() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createAssertStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createBlockStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createBreakStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createCatchClause() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createContinueStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createDoStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createEmptyStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createExplicitConstructorInvocationStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createExpressionStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createForEachStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createForStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createIfStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createLabeledStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createLocalClassDeclarationStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createReturnStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createSwitchEntry() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createSwitchStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createSynchronizedStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createThrowStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createTryStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createWhileStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createYieldStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createArrayType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createClassOrInterfaceType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createIntersectionType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createPrimitiveType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createTypeParameter() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createUnionType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createUnknownType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createVarType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createVoidType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE,
                EJavaFactory.eINSTANCE.createWildcardType() ) );
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
                childFeature == EJavaPackage.Literals.NODE_WITH_SCOPE__SCOPE ||
                childFeature == EJavaPackage.Literals.NODE_WITH_TYPE_ARGUMENTS__TYPE_ARGUMENTS;

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
