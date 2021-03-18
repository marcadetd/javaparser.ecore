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

import fr.centralesupelec.csd.ejava.CallableDeclaration;
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
 * This is the item provider adapter for a {@link fr.centralesupelec.csd.ejava.CallableDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CallableDeclarationItemProvider extends BodyDeclarationItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallableDeclarationItemProvider( AdapterFactory adapterFactory ) {
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

            addModifiersPropertyDescriptor( object );
            addPublicPropertyDescriptor( object );
            addPrivatePropertyDescriptor( object );
            addProtectedPropertyDescriptor( object );
            addNamePropertyDescriptor( object );
            addAbstractPropertyDescriptor( object );
            addStaticPropertyDescriptor( object );
            addFinalPropertyDescriptor( object );
            addStrictfpPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
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
     * This adds a property descriptor for the Private feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrivatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_NodeWithPrivateModifier_private_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_NodeWithPrivateModifier_private_feature",
                                "_UI_NodeWithPrivateModifier_type" ),
                        EJavaPackage.Literals.NODE_WITH_PRIVATE_MODIFIER__PRIVATE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Protected feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProtectedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_NodeWithProtectedModifier_protected_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_NodeWithProtectedModifier_protected_feature",
                        "_UI_NodeWithProtectedModifier_type" ),
                EJavaPackage.Literals.NODE_WITH_PROTECTED_MODIFIER__PROTECTED,
                true,
                false,
                false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                null,
                null ) );
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
     * This adds a property descriptor for the Static feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStaticPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_NodeWithStaticModifier_static_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_NodeWithStaticModifier_static_feature",
                                "_UI_NodeWithStaticModifier_type" ),
                        EJavaPackage.Literals.NODE_WITH_STATIC_MODIFIER__STATIC,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Final feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFinalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_NodeWithFinalModifier_final_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_NodeWithFinalModifier_final_feature",
                                "_UI_NodeWithFinalModifier_type" ),
                        EJavaPackage.Literals.NODE_WITH_FINAL_MODIFIER__FINAL,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Strictfp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStrictfpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_NodeWithStrictfpModifier_strictfp_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_NodeWithStrictfpModifier_strictfp_feature", "_UI_NodeWithStrictfpModifier_type" ),
                        EJavaPackage.Literals.NODE_WITH_STRICTFP_MODIFIER__STRICTFP,
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
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_PARAMETERS__PARAMETERS );
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_THROWN_EXCEPTIONS__THROWN_EXCEPTIONS );
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_TYPE_PARAMETERS__TYPE_PARAMETERS );
            childrenFeatures.add( EJavaPackage.Literals.CALLABLE_DECLARATION__RECEIVER_PARAMETER );
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
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        CallableDeclaration callableDeclaration = ( CallableDeclaration ) object;
        return getString( "_UI_CallableDeclaration_type" ) + " " + callableDeclaration.isPublic();
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

        switch( notification.getFeatureID( CallableDeclaration.class ) ) {
        case EJavaPackage.CALLABLE_DECLARATION__MODIFIERS:
        case EJavaPackage.CALLABLE_DECLARATION__PUBLIC:
        case EJavaPackage.CALLABLE_DECLARATION__PRIVATE:
        case EJavaPackage.CALLABLE_DECLARATION__PROTECTED:
        case EJavaPackage.CALLABLE_DECLARATION__NAME:
        case EJavaPackage.CALLABLE_DECLARATION__ABSTRACT:
        case EJavaPackage.CALLABLE_DECLARATION__STATIC:
        case EJavaPackage.CALLABLE_DECLARATION__FINAL:
        case EJavaPackage.CALLABLE_DECLARATION__STRICTFP:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case EJavaPackage.CALLABLE_DECLARATION__PARAMETERS:
        case EJavaPackage.CALLABLE_DECLARATION__THROWN_EXCEPTIONS:
        case EJavaPackage.CALLABLE_DECLARATION__TYPE_PARAMETERS:
        case EJavaPackage.CALLABLE_DECLARATION__RECEIVER_PARAMETER:
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

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_PARAMETERS__PARAMETERS,
                EJavaFactory.eINSTANCE.createParameter() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.NODE_WITH_THROWN_EXCEPTIONS__THROWN_EXCEPTIONS,
                        EJavaFactory.eINSTANCE.createArrayType() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.NODE_WITH_THROWN_EXCEPTIONS__THROWN_EXCEPTIONS,
                        EJavaFactory.eINSTANCE.createClassOrInterfaceType() ) );

        newChildDescriptors
                .add( createChildParameter( EJavaPackage.Literals.NODE_WITH_THROWN_EXCEPTIONS__THROWN_EXCEPTIONS,
                        EJavaFactory.eINSTANCE.createTypeParameter() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE_PARAMETERS__TYPE_PARAMETERS,
                EJavaFactory.eINSTANCE.createTypeParameter() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.CALLABLE_DECLARATION__RECEIVER_PARAMETER,
                EJavaFactory.eINSTANCE.createReceiverParameter() ) );
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
                childFeature == EJavaPackage.Literals.NODE_WITH_THROWN_EXCEPTIONS__THROWN_EXCEPTIONS ||
                childFeature == EJavaPackage.Literals.NODE_WITH_TYPE_PARAMETERS__TYPE_PARAMETERS;

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
