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

import fr.centralesupelec.csd.ejava.ClassOrInterfaceDeclaration;
import fr.centralesupelec.csd.ejava.EJavaFactory;
import fr.centralesupelec.csd.ejava.EJavaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.csd.ejava.ClassOrInterfaceDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassOrInterfaceDeclarationItemProvider extends TypeDeclarationItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClassOrInterfaceDeclarationItemProvider( AdapterFactory adapterFactory ) {
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

            addAbstractPropertyDescriptor( object );
            addFinalPropertyDescriptor( object );
            addInterfacePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
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
     * This adds a property descriptor for the Interface feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInterfacePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_ClassOrInterfaceDeclaration_interface_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ClassOrInterfaceDeclaration_interface_feature",
                        "_UI_ClassOrInterfaceDeclaration_type" ),
                EJavaPackage.Literals.CLASS_OR_INTERFACE_DECLARATION__INTERFACE,
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
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_IMPLEMENTS__IMPLEMENTED_TYPES );
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_EXTENDS__EXTENDED_TYPES );
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_TYPE_PARAMETERS__TYPE_PARAMETERS );
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
     * This returns ClassOrInterfaceDeclaration.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ClassOrInterfaceDeclaration" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getText( Object object ) {
        ClassOrInterfaceDeclaration classOrInterfaceDeclaration = ( ClassOrInterfaceDeclaration ) object;
        //        return getString( "_UI_ClassOrInterfaceDeclaration_type" ) + " " + classOrInterfaceDeclaration.isPublic();
        IItemLabelProvider labelProvider = ( IItemLabelProvider ) getAdapterFactory().adapt(
                classOrInterfaceDeclaration.getName(),
                IItemLabelProvider.class );
        return ( classOrInterfaceDeclaration.isInterface() ? "interface " : "class " )
                + labelProvider.getText( classOrInterfaceDeclaration.getName() );
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

        switch( notification.getFeatureID( ClassOrInterfaceDeclaration.class ) ) {
        case EJavaPackage.CLASS_OR_INTERFACE_DECLARATION__ABSTRACT:
        case EJavaPackage.CLASS_OR_INTERFACE_DECLARATION__FINAL:
        case EJavaPackage.CLASS_OR_INTERFACE_DECLARATION__INTERFACE:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case EJavaPackage.CLASS_OR_INTERFACE_DECLARATION__IMPLEMENTED_TYPES:
        case EJavaPackage.CLASS_OR_INTERFACE_DECLARATION__EXTENDED_TYPES:
        case EJavaPackage.CLASS_OR_INTERFACE_DECLARATION__TYPE_PARAMETERS:
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

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_IMPLEMENTS__IMPLEMENTED_TYPES,
                EJavaFactory.eINSTANCE.createClassOrInterfaceType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_EXTENDS__EXTENDED_TYPES,
                EJavaFactory.eINSTANCE.createClassOrInterfaceType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_TYPE_PARAMETERS__TYPE_PARAMETERS,
                EJavaFactory.eINSTANCE.createTypeParameter() ) );
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
                childFeature == EJavaPackage.Literals.NODE_WITH_IMPLEMENTS__IMPLEMENTED_TYPES ||
                childFeature == EJavaPackage.Literals.NODE_WITH_EXTENDS__EXTENDED_TYPES;

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
