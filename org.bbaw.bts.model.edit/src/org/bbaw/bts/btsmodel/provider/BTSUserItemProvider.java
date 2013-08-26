/**
 */
package org.bbaw.bts.btsmodel.provider;


import java.util.Collection;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bbaw.bts.btsmodel.BTSUser} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BTSUserItemProvider
	extends BTSDBBaseObjectItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTSUserItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addStatePropertyDescriptor(object);
			addRevisionStatePropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
			addGroupIdsPropertyDescriptor(object);
			addSiglePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addWebDescriptionPropertyDescriptor(object);
			addUserNamePropertyDescriptor(object);
			addForeNamePropertyDescriptor(object);
			addSureNamePropertyDescriptor(object);
			addMailPropertyDescriptor(object);
			addWebURLPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addRolesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativDataObject_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativDataObject_state_feature", "_UI_AdministrativDataObject_type"),
				 BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Revision State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevisionStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativDataObject_revisionState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativDataObject_revisionState_feature", "_UI_AdministrativDataObject_type"),
				 BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativDataObject_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativDataObject_visibility_feature", "_UI_AdministrativDataObject_type"),
				 BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__VISIBILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group Ids feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupIdsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSUser_groupIds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_groupIds_feature", "_UI_BTSUser_type"),
				 BtsmodelPackage.Literals.BTS_USER__GROUP_IDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sigle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSiglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSUser_sigle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_sigle_feature", "_UI_BTSUser_type"),
				 BtsmodelPackage.Literals.BTS_USER__SIGLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSUser_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_description_feature", "_UI_BTSUser_type"),
				 BtsmodelPackage.Literals.BTS_USER__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSUser_webDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_webDescription_feature", "_UI_BTSUser_type"),
				 BtsmodelPackage.Literals.BTS_USER__WEB_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSUser_userName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_userName_feature", "_UI_BTSUser_type"),
				 BtsmodelPackage.Literals.BTS_USER__USER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fore Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForeNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSUser_foreName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_foreName_feature", "_UI_BTSUser_type"),
				 BtsmodelPackage.Literals.BTS_USER__FORE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sure Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSureNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSUser_sureName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_sureName_feature", "_UI_BTSUser_type"),
				 BtsmodelPackage.Literals.BTS_USER__SURE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mail feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSUser_mail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_mail_feature", "_UI_BTSUser_type"),
				 BtsmodelPackage.Literals.BTS_USER__MAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSUser_webURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_webURL_feature", "_UI_BTSUser_type"),
				 BtsmodelPackage.Literals.BTS_USER__WEB_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSUser_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_comment_feature", "_UI_BTSUser_type"),
				 BtsmodelPackage.Literals.BTS_USER__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Roles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BTSUser_roles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BTSUser_roles_feature", "_UI_BTSUser_type"),
				 BtsmodelPackage.Literals.BTS_USER__ROLES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__REVISIONS);
			childrenFeatures.add(BtsmodelPackage.Literals.BTS_USER__EXTERNAL_REFERNECES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BTSUser.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BTSUser"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BTSUser)object).getUserName();
		return label == null || label.length() == 0 ?
			getString("_UI_BTSUser_type") :
			getString("_UI_BTSUser_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BTSUser.class))
		{
			case BtsmodelPackage.BTS_USER__STATE:
			case BtsmodelPackage.BTS_USER__REVISION_STATE:
			case BtsmodelPackage.BTS_USER__VISIBILITY:
			case BtsmodelPackage.BTS_USER__GROUP_IDS:
			case BtsmodelPackage.BTS_USER__SIGLE:
			case BtsmodelPackage.BTS_USER__DESCRIPTION:
			case BtsmodelPackage.BTS_USER__WEB_DESCRIPTION:
			case BtsmodelPackage.BTS_USER__USER_NAME:
			case BtsmodelPackage.BTS_USER__FORE_NAME:
			case BtsmodelPackage.BTS_USER__SURE_NAME:
			case BtsmodelPackage.BTS_USER__MAIL:
			case BtsmodelPackage.BTS_USER__WEB_URL:
			case BtsmodelPackage.BTS_USER__COMMENT:
			case BtsmodelPackage.BTS_USER__ROLES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BtsmodelPackage.BTS_USER__REVISIONS:
			case BtsmodelPackage.BTS_USER__EXTERNAL_REFERNECES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__REVISIONS,
				 BtsmodelFactory.eINSTANCE.createBTSRevision()));

		newChildDescriptors.add
			(createChildParameter
				(BtsmodelPackage.Literals.BTS_USER__EXTERNAL_REFERNECES,
				 BtsmodelFactory.eINSTANCE.createBTSExternalReference()));
	}

}
