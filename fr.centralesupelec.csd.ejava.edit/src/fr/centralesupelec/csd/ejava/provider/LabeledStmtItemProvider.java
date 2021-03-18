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
import fr.centralesupelec.csd.ejava.LabeledStmt;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.csd.ejava.LabeledStmt} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LabeledStmtItemProvider extends StatementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LabeledStmtItemProvider( AdapterFactory adapterFactory ) {
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
            childrenFeatures.add( EJavaPackage.Literals.NODE_WITH_LABEL__LABEL );
            childrenFeatures.add( EJavaPackage.Literals.LABELED_STMT__STATEMENT );
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
     * This returns LabeledStmt.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/LabeledStmt" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        return getString( "_UI_LabeledStmt_type" );
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

        switch( notification.getFeatureID( LabeledStmt.class ) ) {
        case EJavaPackage.LABELED_STMT__LABEL:
        case EJavaPackage.LABELED_STMT__STATEMENT:
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

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.NODE_WITH_LABEL__LABEL,
                EJavaFactory.eINSTANCE.createSimpleName() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createStatement() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createAssertStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createBlockStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createBreakStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createContinueStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createDoStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createEmptyStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createExplicitConstructorInvocationStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createExpressionStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createForEachStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createForStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createIfStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createLabeledStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createLocalClassDeclarationStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createReturnStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createSwitchStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createSynchronizedStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createThrowStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createTryStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createWhileStmt() ) );

        newChildDescriptors.add( createChildParameter( EJavaPackage.Literals.LABELED_STMT__STATEMENT,
                EJavaFactory.eINSTANCE.createYieldStmt() ) );
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
