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

import fr.centralesupelec.csd.ejava.AssignExpr;
import fr.centralesupelec.csd.ejava.AssignOperator;
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
 * This is the item provider adapter for a {@link fr.centralesupelec.csd.ejava.AssignExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignExprItemProvider extends ExpressionItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssignExprItemProvider( AdapterFactory adapterFactory ) {
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

            addOperatorPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Operator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperatorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AssignExpr_operator_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AssignExpr_operator_feature",
                                "_UI_AssignExpr_type" ),
                        EJavaPackage.Literals.ASSIGN_EXPR__OPERATOR,
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
            childrenFeatures.add( EJavaPackage.Literals.ASSIGN_EXPR__TARGET );
            childrenFeatures.add( EJavaPackage.Literals.ASSIGN_EXPR__VALUE );
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
     * This returns AssignExpr.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/AssignExpr" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        AssignOperator labelValue = ( ( AssignExpr ) object ).getOperator();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ? getString( "_UI_AssignExpr_type" )
                : getString( "_UI_AssignExpr_type" ) + " " + label;
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

        switch( notification.getFeatureID( AssignExpr.class ) ) {
        case EJavaPackage.ASSIGN_EXPR__OPERATOR:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case EJavaPackage.ASSIGN_EXPR__TARGET:
        case EJavaPackage.ASSIGN_EXPR__VALUE:
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

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createArrayAccessExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createArrayCreationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createArrayInitializerExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createAssignExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createBinaryExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createBooleanLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createCastExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createCharLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createClassExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createConditionalExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createDoubleLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createEnclosedExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createFieldAccessExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createInstanceOfExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createIntegerLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createLambdaExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createLongLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createMarkerAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createMethodCallExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createMethodReferenceExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createNameExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createNormalAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createNullLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createObjectCreationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createPatternExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createSingleMemberAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createStringLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createSuperExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createSwitchExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createTextBlockLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createThisExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createTypeExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createUnaryExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__TARGET,
                EJavaFactory.eINSTANCE.createVariableDeclarationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createArrayAccessExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createArrayCreationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createArrayInitializerExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createAssignExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createBinaryExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createBooleanLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createCastExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createCharLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createClassExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createConditionalExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createDoubleLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createEnclosedExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createFieldAccessExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createInstanceOfExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createIntegerLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createLambdaExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createLongLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createMarkerAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createMethodCallExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createMethodReferenceExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createNameExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createNormalAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createNullLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createObjectCreationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createPatternExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createSingleMemberAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createStringLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createSuperExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createSwitchExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createTextBlockLiteralExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createThisExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createTypeExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
                EJavaFactory.eINSTANCE.createUnaryExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ASSIGN_EXPR__VALUE,
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
                childFeature == EJavaPackage.Literals.ASSIGN_EXPR__TARGET ||
                childFeature == EJavaPackage.Literals.ASSIGN_EXPR__VALUE;

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
