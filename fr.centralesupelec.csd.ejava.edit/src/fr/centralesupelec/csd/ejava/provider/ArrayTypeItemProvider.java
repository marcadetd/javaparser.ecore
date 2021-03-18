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

import fr.centralesupelec.csd.ejava.ArrayType;
import fr.centralesupelec.csd.ejava.ArrayTypeOrigin;
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
 * This is the item provider adapter for a {@link fr.centralesupelec.csd.ejava.ArrayType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrayTypeItemProvider extends ReferenceTypeItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ArrayTypeItemProvider( AdapterFactory adapterFactory ) {
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

            addOriginPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Origin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOriginPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ArrayType_origin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ArrayType_origin_feature",
                                "_UI_ArrayType_type" ),
                        EJavaPackage.Literals.ARRAY_TYPE__ORIGIN,
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
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_ANNOTATIONS__ANNOTATIONS );
            childrenFeatures.add( EJavaPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE );
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
     * This returns ArrayType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ArrayType" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getText( Object object ) {
//        ArrayTypeOrigin labelValue = ( ( ArrayType ) object ).getOrigin();
//        String label = labelValue == null ? null : labelValue.toString();
//        return label == null || label.length() == 0 ? getString( "_UI_ArrayType_type" )
//                : getString( "_UI_ArrayType_type" ) + " " + label;
        ArrayType arrayType = ( ArrayType ) object;
        IItemLabelProvider labelProvider = ( IItemLabelProvider ) getAdapterFactory().adapt(
                arrayType.getComponentType(), IItemLabelProvider.class );
        return labelProvider.getText( arrayType.getComponentType() ) + "[]";
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

        switch( notification.getFeatureID( ArrayType.class ) ) {
        case EJavaPackage.ARRAY_TYPE__ORIGIN:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case EJavaPackage.ARRAY_TYPE__ANNOTATIONS:
        case EJavaPackage.ARRAY_TYPE__COMPONENT_TYPE:
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

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_ANNOTATIONS__ANNOTATIONS,
                EJavaFactory.eINSTANCE.createMarkerAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_ANNOTATIONS__ANNOTATIONS,
                EJavaFactory.eINSTANCE.createNormalAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_ANNOTATIONS__ANNOTATIONS,
                EJavaFactory.eINSTANCE.createSingleMemberAnnotationExpr() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE,
                EJavaFactory.eINSTANCE.createArrayType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE,
                EJavaFactory.eINSTANCE.createClassOrInterfaceType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE,
                EJavaFactory.eINSTANCE.createIntersectionType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE,
                EJavaFactory.eINSTANCE.createPrimitiveType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE,
                EJavaFactory.eINSTANCE.createTypeParameter() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE,
                EJavaFactory.eINSTANCE.createUnionType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE,
                EJavaFactory.eINSTANCE.createUnknownType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE,
                EJavaFactory.eINSTANCE.createVarType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE,
                EJavaFactory.eINSTANCE.createVoidType() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE,
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
                childFeature == EJavaPackage.Literals.JAVA_NODE__ORPHAN_COMMENTS;

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
