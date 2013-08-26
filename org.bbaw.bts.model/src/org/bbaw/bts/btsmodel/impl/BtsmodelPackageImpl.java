/**
 */
package org.bbaw.bts.btsmodel.impl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSAmbivalence;
import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSCorpusHeader;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSDate;
import org.bbaw.bts.btsmodel.BTSDelimiter;
import org.bbaw.bts.btsmodel.BTSExternalReference;
import org.bbaw.bts.btsmodel.BTSGraphic;
import org.bbaw.bts.btsmodel.BTSImage;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSLease;
import org.bbaw.bts.btsmodel.BTSLemmaCase;
import org.bbaw.bts.btsmodel.BTSList;
import org.bbaw.bts.btsmodel.BTSListEntry;
import org.bbaw.bts.btsmodel.BTSListSubentry;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSObservableObject;
import org.bbaw.bts.btsmodel.BTSPassport;
import org.bbaw.bts.btsmodel.BTSPassportEditorConfig;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.btsmodel.BTSPpSubentry;
import org.bbaw.bts.btsmodel.BTSReferencableItem;
import org.bbaw.bts.btsmodel.BTSReference;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSSentenceItems;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsmodel.BTSTextItems;
import org.bbaw.bts.btsmodel.BTSTextSentenceItem;
import org.bbaw.bts.btsmodel.BTSTimespan;
import org.bbaw.bts.btsmodel.BTSTranslation;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BtsmodelPackageImpl extends EPackageImpl implements BtsmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btstcObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsSenctenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsWordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsDelimiterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsSentenceItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPassportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrativDataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsAmbivalenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsLemmaCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsInterTextReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextSentenceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTranslationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPassportEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsdbBaseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextCorpusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsRevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsLeaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsCorpusHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTimespanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsCorpusObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsExternalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsReferencableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsGraphicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTranslationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsConfigItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPassportEditorConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsUserGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPpSubentryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsListSubentryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsObservableObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeSupportEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeListenerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyChangeEventEDataType = null;

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
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BtsmodelPackageImpl() {
		super(eNS_URI, BtsmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BtsmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BtsmodelPackage init() {
		if (isInited) return (BtsmodelPackage)EPackage.Registry.INSTANCE.getEPackage(BtsmodelPackage.eNS_URI);

		// Obtain or create and register package
		BtsmodelPackageImpl theBtsmodelPackage = (BtsmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BtsmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BtsmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBtsmodelPackage.createPackageContents();

		// Initialize created meta-data
		theBtsmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBtsmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BtsmodelPackage.eNS_URI, theBtsmodelPackage);
		return theBtsmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTCObject() {
		return btstcObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSText() {
		return btsTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSText_TextItems() {
		return (EReference)btsTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSSenctence() {
		return btsSenctenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSSenctence_SentenceItems() {
		return (EReference)btsSenctenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSSenctence_Translation() {
		return (EReference)btsSenctenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSWord() {
		return btsWordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSWord_Translation() {
		return (EReference)btsWordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_WType() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_LType() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_LKey() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_FlexCode() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_WChar() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_Value() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSWord_Graphics() {
		return (EReference)btsWordEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSDelimiter() {
		return btsDelimiterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDelimiter_Value() {
		return (EAttribute)btsDelimiterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTextItems() {
		return btsTextItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSSentenceItems() {
		return btsSentenceItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSListEntry() {
		return btsListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSListEntry_Ignore() {
		return (EAttribute)btsListEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSListEntry_Subentries() {
		return (EReference)btsListEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPassport() {
		return btsPassportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_Protocol() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_Bibliography() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassport_Date() {
		return (EReference)btsPassportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_WbSlips() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_WbFolder() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_Provenance() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassport_PassportEntries() {
		return (EReference)btsPassportEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_Comment() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassport_Descriptions() {
		return (EReference)btsPassportEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrativDataObject() {
		return administrativDataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrativDataObject_Revisions() {
		return (EReference)administrativDataObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativDataObject_State() {
		return (EAttribute)administrativDataObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativDataObject_RevisionState() {
		return (EAttribute)administrativDataObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativDataObject_Visibility() {
		return (EAttribute)administrativDataObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSObject() {
		return btsObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObject_SortKey() {
		return (EAttribute)btsObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObject_Name() {
		return (EAttribute)btsObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObject_Type() {
		return (EAttribute)btsObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObject_Subtype() {
		return (EAttribute)btsObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObject_Code() {
		return (EAttribute)btsObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSAmbivalence() {
		return btsAmbivalenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSAmbivalence_Cases() {
		return (EReference)btsAmbivalenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSLemmaCase() {
		return btsLemmaCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSLemmaCase_Scenario() {
		return (EReference)btsLemmaCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSUser() {
		return btsUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_GroupIds() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_Sigle() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_Description() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_WebDescription() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_UserName() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_ForeName() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_SureName() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_Mail() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_WebURL() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_Comment() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSUser_ExternalReferneces() {
		return (EReference)btsUserEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUser_Roles() {
		return (EAttribute)btsUserEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSComment() {
		return btsCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSComment_Comment() {
		return (EAttribute)btsCommentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSComment_References() {
		return (EReference)btsCommentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSComment_Tags() {
		return (EAttribute)btsCommentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSInterTextReference() {
		return btsInterTextReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSInterTextReference_BeginId() {
		return (EAttribute)btsInterTextReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSInterTextReference_EndId() {
		return (EAttribute)btsInterTextReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTextSentenceItem() {
		return btsTextSentenceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSReference() {
		return btsReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSReference_Parts() {
		return (EReference)btsReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSReference_ObjectId() {
		return (EAttribute)btsReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSAnnotation() {
		return btsAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSAnnotation_References() {
		return (EReference)btsAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTranslation() {
		return btsTranslationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSTranslation_Value() {
		return (EAttribute)btsTranslationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSTranslation_Type() {
		return (EAttribute)btsTranslationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSTranslation_Lang() {
		return (EAttribute)btsTranslationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSDate() {
		return btsDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDate_Type() {
		return (EAttribute)btsDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDate_Year() {
		return (EAttribute)btsDateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDate_Month() {
		return (EAttribute)btsDateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDate_Day() {
		return (EAttribute)btsDateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDate_RelativeRef() {
		return (EAttribute)btsDateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPassportEntry() {
		return btsPassportEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Provider() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Comment() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Type() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Value() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Category() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntry_Subentries() {
		return (EReference)btsPassportEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSRelation() {
		return btsRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRelation_ObjectId() {
		return (EAttribute)btsRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRelation_Type() {
		return (EAttribute)btsRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRelation_Subtype() {
		return (EAttribute)btsRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRelation_Comment() {
		return (EAttribute)btsRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSConfiguration() {
		return btsConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfiguration_Name()
	{
		return (EAttribute)btsConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfiguration_Provider()
	{
		return (EAttribute)btsConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSDBBaseObject() {
		return btsdbBaseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSDBBaseObject_Lease() {
		return (EReference)btsdbBaseObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBBaseObject__id() {
		return (EAttribute)btsdbBaseObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSDBBaseObject__rev() {
		return (EAttribute)btsdbBaseObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTextCorpus() {
		return btsTextCorpusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSTextCorpus_Header() {
		return (EReference)btsTextCorpusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSRevision() {
		return btsRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRevision_Ref() {
		return (EAttribute)btsRevisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRevision_UserId() {
		return (EAttribute)btsRevisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSRevision_TimeStamp() {
		return (EAttribute)btsRevisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSLease() {
		return btsLeaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSLease_LeasingUserId() {
		return (EAttribute)btsLeaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSLease_LeaseTimeStamp() {
		return (EAttribute)btsLeaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSImage() {
		return btsImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSImage_MediaType() {
		return (EAttribute)btsImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSImage__GetAttachement() {
		return btsImageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSCorpusHeader() {
		return btsCorpusHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusHeader_AuthorName() {
		return (EAttribute)btsCorpusHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusHeader_ProjectId() {
		return (EAttribute)btsCorpusHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusHeader_ProjectName() {
		return (EAttribute)btsCorpusHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTimespan() {
		return btsTimespanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSTimespan_From() {
		return (EReference)btsTimespanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSTimespan_To() {
		return (EReference)btsTimespanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSTimespan_Comment() {
		return (EAttribute)btsTimespanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSCorpusObject() {
		return btsCorpusObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSCorpusObject_Relations() {
		return (EReference)btsCorpusObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSCorpusObject_Passport() {
		return (EReference)btsCorpusObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSCorpusObject_Parent() {
		return (EReference)btsCorpusObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusObject_ParentId() {
		return (EAttribute)btsCorpusObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSCorpusObject_Children()
	{
		return (EReference)btsCorpusObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSCorpusObject__GetObjectType()
	{
		return btsCorpusObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSExternalReference() {
		return btsExternalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSExternalReference_Reference() {
		return (EAttribute)btsExternalReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSExternalReference_Provider() {
		return (EAttribute)btsExternalReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSExternalReference_Type() {
		return (EAttribute)btsExternalReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSReferencableItem() {
		return btsReferencableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSReferencableItem_Id() {
		return (EAttribute)btsReferencableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSReferencableItem_Comment() {
		return (EAttribute)btsReferencableItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSReferencableItem_Parent() {
		return (EReference)btsReferencableItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSReferencableItem_ParentId() {
		return (EAttribute)btsReferencableItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSGraphic() {
		return btsGraphicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSGraphic_InnerSentenceOrder() {
		return (EAttribute)btsGraphicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSGraphic_Code() {
		return (EAttribute)btsGraphicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSGraphic_Reference() {
		return (EAttribute)btsGraphicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTranslations() {
		return btsTranslationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSTranslations_Translations() {
		return (EReference)btsTranslationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSConfigItem() {
		return btsConfigItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_Value() {
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSConfigItem_Label() {
		return (EReference)btsConfigItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSConfigItem_Description() {
		return (EReference)btsConfigItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_SortKey() {
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_Ignore() {
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSConfigItem_PassportEditorConfig() {
		return (EReference)btsConfigItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_Type() {
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_Subtype() {
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_OwnerType()
	{
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSConfigItem_ReferencedType()
	{
		return (EAttribute)btsConfigItemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPassportEditorConfig() {
		return btsPassportEditorConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEditorConfig_ShowWidget() {
		return (EAttribute)btsPassportEditorConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEditorConfig_WidgetType() {
		return (EAttribute)btsPassportEditorConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEditorConfig_Required() {
		return (EAttribute)btsPassportEditorConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEditorConfig_AllowMultiple() {
		return (EAttribute)btsPassportEditorConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEditorConfig_HorizontalWidth() {
		return (EAttribute)btsPassportEditorConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEditorConfig_Regex()
	{
		return (EAttribute)btsPassportEditorConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSUserGroup() {
		return btsUserGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUserGroup_Category() {
		return (EAttribute)btsUserGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSUserGroup_Comment() {
		return (EAttribute)btsUserGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSList() {
		return btsListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPpSubentry() {
		return btsPpSubentryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPpSubentry_Type() {
		return (EAttribute)btsPpSubentryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPpSubentry_Subtype() {
		return (EAttribute)btsPpSubentryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPpSubentry_Key() {
		return (EAttribute)btsPpSubentryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPpSubentry_Value() {
		return (EAttribute)btsPpSubentryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPpSubentry_SubValue() {
		return (EAttribute)btsPpSubentryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPpSubentry_Provider() {
		return (EAttribute)btsPpSubentryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPpSubentry_Name() {
		return (EAttribute)btsPpSubentryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPpSubentry_Comment() {
		return (EAttribute)btsPpSubentryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPpSubentry_ExternalReferences() {
		return (EReference)btsPpSubentryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPpSubentry_Timespan() {
		return (EReference)btsPpSubentryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPpSubentry_Description() {
		return (EReference)btsPpSubentryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPpSubentry_Translation() {
		return (EReference)btsPpSubentryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSListSubentry() {
		return btsListSubentryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSListSubentry_Passport() {
		return (EReference)btsListSubentryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSConfig()
	{
		return btsConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSConfig_Children()
	{
		return (EReference)btsConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSObservableObject()
	{
		return btsObservableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSObservableObject_PropertyChangeSupport()
	{
		return (EAttribute)btsObservableObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSObservableObject__AddPropertyChangeListener__PropertyChangeListener()
	{
		return btsObservableObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSObservableObject__RemovePropertyChangeListener__PropertyChangeListener()
	{
		return btsObservableObjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyChangeSupport() {
		return propertyChangeSupportEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyChangeListener() {
		return propertyChangeListenerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyChangeEvent() {
		return propertyChangeEventEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsmodelFactory getBtsmodelFactory() {
		return (BtsmodelFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		btstcObjectEClass = createEClass(BTSTC_OBJECT);

		btsTextEClass = createEClass(BTS_TEXT);
		createEReference(btsTextEClass, BTS_TEXT__TEXT_ITEMS);

		btsSenctenceEClass = createEClass(BTS_SENCTENCE);
		createEReference(btsSenctenceEClass, BTS_SENCTENCE__SENTENCE_ITEMS);
		createEReference(btsSenctenceEClass, BTS_SENCTENCE__TRANSLATION);

		btsWordEClass = createEClass(BTS_WORD);
		createEReference(btsWordEClass, BTS_WORD__TRANSLATION);
		createEAttribute(btsWordEClass, BTS_WORD__WTYPE);
		createEAttribute(btsWordEClass, BTS_WORD__LTYPE);
		createEAttribute(btsWordEClass, BTS_WORD__LKEY);
		createEAttribute(btsWordEClass, BTS_WORD__FLEX_CODE);
		createEAttribute(btsWordEClass, BTS_WORD__WCHAR);
		createEAttribute(btsWordEClass, BTS_WORD__VALUE);
		createEReference(btsWordEClass, BTS_WORD__GRAPHICS);

		btsDelimiterEClass = createEClass(BTS_DELIMITER);
		createEAttribute(btsDelimiterEClass, BTS_DELIMITER__VALUE);

		btsTextItemsEClass = createEClass(BTS_TEXT_ITEMS);

		btsSentenceItemsEClass = createEClass(BTS_SENTENCE_ITEMS);

		btsListEntryEClass = createEClass(BTS_LIST_ENTRY);
		createEAttribute(btsListEntryEClass, BTS_LIST_ENTRY__IGNORE);
		createEReference(btsListEntryEClass, BTS_LIST_ENTRY__SUBENTRIES);

		btsPassportEClass = createEClass(BTS_PASSPORT);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__PROTOCOL);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__BIBLIOGRAPHY);
		createEReference(btsPassportEClass, BTS_PASSPORT__DATE);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__WB_SLIPS);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__WB_FOLDER);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__PROVENANCE);
		createEReference(btsPassportEClass, BTS_PASSPORT__PASSPORT_ENTRIES);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__COMMENT);
		createEReference(btsPassportEClass, BTS_PASSPORT__DESCRIPTIONS);

		administrativDataObjectEClass = createEClass(ADMINISTRATIV_DATA_OBJECT);
		createEReference(administrativDataObjectEClass, ADMINISTRATIV_DATA_OBJECT__REVISIONS);
		createEAttribute(administrativDataObjectEClass, ADMINISTRATIV_DATA_OBJECT__STATE);
		createEAttribute(administrativDataObjectEClass, ADMINISTRATIV_DATA_OBJECT__REVISION_STATE);
		createEAttribute(administrativDataObjectEClass, ADMINISTRATIV_DATA_OBJECT__VISIBILITY);

		btsObjectEClass = createEClass(BTS_OBJECT);
		createEAttribute(btsObjectEClass, BTS_OBJECT__SORT_KEY);
		createEAttribute(btsObjectEClass, BTS_OBJECT__NAME);
		createEAttribute(btsObjectEClass, BTS_OBJECT__TYPE);
		createEAttribute(btsObjectEClass, BTS_OBJECT__SUBTYPE);
		createEAttribute(btsObjectEClass, BTS_OBJECT__CODE);

		btsAmbivalenceEClass = createEClass(BTS_AMBIVALENCE);
		createEReference(btsAmbivalenceEClass, BTS_AMBIVALENCE__CASES);

		btsLemmaCaseEClass = createEClass(BTS_LEMMA_CASE);
		createEReference(btsLemmaCaseEClass, BTS_LEMMA_CASE__SCENARIO);

		btsUserEClass = createEClass(BTS_USER);
		createEAttribute(btsUserEClass, BTS_USER__GROUP_IDS);
		createEAttribute(btsUserEClass, BTS_USER__SIGLE);
		createEAttribute(btsUserEClass, BTS_USER__DESCRIPTION);
		createEAttribute(btsUserEClass, BTS_USER__WEB_DESCRIPTION);
		createEAttribute(btsUserEClass, BTS_USER__USER_NAME);
		createEAttribute(btsUserEClass, BTS_USER__FORE_NAME);
		createEAttribute(btsUserEClass, BTS_USER__SURE_NAME);
		createEAttribute(btsUserEClass, BTS_USER__MAIL);
		createEAttribute(btsUserEClass, BTS_USER__WEB_URL);
		createEAttribute(btsUserEClass, BTS_USER__COMMENT);
		createEReference(btsUserEClass, BTS_USER__EXTERNAL_REFERNECES);
		createEAttribute(btsUserEClass, BTS_USER__ROLES);

		btsCommentEClass = createEClass(BTS_COMMENT);
		createEAttribute(btsCommentEClass, BTS_COMMENT__COMMENT);
		createEReference(btsCommentEClass, BTS_COMMENT__REFERENCES);
		createEAttribute(btsCommentEClass, BTS_COMMENT__TAGS);

		btsInterTextReferenceEClass = createEClass(BTS_INTER_TEXT_REFERENCE);
		createEAttribute(btsInterTextReferenceEClass, BTS_INTER_TEXT_REFERENCE__BEGIN_ID);
		createEAttribute(btsInterTextReferenceEClass, BTS_INTER_TEXT_REFERENCE__END_ID);

		btsTextSentenceItemEClass = createEClass(BTS_TEXT_SENTENCE_ITEM);

		btsReferenceEClass = createEClass(BTS_REFERENCE);
		createEReference(btsReferenceEClass, BTS_REFERENCE__PARTS);
		createEAttribute(btsReferenceEClass, BTS_REFERENCE__OBJECT_ID);

		btsAnnotationEClass = createEClass(BTS_ANNOTATION);
		createEReference(btsAnnotationEClass, BTS_ANNOTATION__REFERENCES);

		btsTranslationEClass = createEClass(BTS_TRANSLATION);
		createEAttribute(btsTranslationEClass, BTS_TRANSLATION__VALUE);
		createEAttribute(btsTranslationEClass, BTS_TRANSLATION__TYPE);
		createEAttribute(btsTranslationEClass, BTS_TRANSLATION__LANG);

		btsDateEClass = createEClass(BTS_DATE);
		createEAttribute(btsDateEClass, BTS_DATE__TYPE);
		createEAttribute(btsDateEClass, BTS_DATE__YEAR);
		createEAttribute(btsDateEClass, BTS_DATE__MONTH);
		createEAttribute(btsDateEClass, BTS_DATE__DAY);
		createEAttribute(btsDateEClass, BTS_DATE__RELATIVE_REF);

		btsPassportEntryEClass = createEClass(BTS_PASSPORT_ENTRY);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__PROVIDER);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__COMMENT);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__TYPE);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__VALUE);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__CATEGORY);
		createEReference(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__SUBENTRIES);

		btsRelationEClass = createEClass(BTS_RELATION);
		createEAttribute(btsRelationEClass, BTS_RELATION__OBJECT_ID);
		createEAttribute(btsRelationEClass, BTS_RELATION__TYPE);
		createEAttribute(btsRelationEClass, BTS_RELATION__SUBTYPE);
		createEAttribute(btsRelationEClass, BTS_RELATION__COMMENT);

		btsConfigurationEClass = createEClass(BTS_CONFIGURATION);
		createEAttribute(btsConfigurationEClass, BTS_CONFIGURATION__NAME);
		createEAttribute(btsConfigurationEClass, BTS_CONFIGURATION__PROVIDER);

		btsdbBaseObjectEClass = createEClass(BTSDB_BASE_OBJECT);
		createEReference(btsdbBaseObjectEClass, BTSDB_BASE_OBJECT__LEASE);
		createEAttribute(btsdbBaseObjectEClass, BTSDB_BASE_OBJECT__ID);
		createEAttribute(btsdbBaseObjectEClass, BTSDB_BASE_OBJECT__REV);

		btsTextCorpusEClass = createEClass(BTS_TEXT_CORPUS);
		createEReference(btsTextCorpusEClass, BTS_TEXT_CORPUS__HEADER);

		btsRevisionEClass = createEClass(BTS_REVISION);
		createEAttribute(btsRevisionEClass, BTS_REVISION__REF);
		createEAttribute(btsRevisionEClass, BTS_REVISION__USER_ID);
		createEAttribute(btsRevisionEClass, BTS_REVISION__TIME_STAMP);

		btsLeaseEClass = createEClass(BTS_LEASE);
		createEAttribute(btsLeaseEClass, BTS_LEASE__LEASING_USER_ID);
		createEAttribute(btsLeaseEClass, BTS_LEASE__LEASE_TIME_STAMP);

		btsImageEClass = createEClass(BTS_IMAGE);
		createEAttribute(btsImageEClass, BTS_IMAGE__MEDIA_TYPE);
		createEOperation(btsImageEClass, BTS_IMAGE___GET_ATTACHEMENT);

		btsCorpusHeaderEClass = createEClass(BTS_CORPUS_HEADER);
		createEAttribute(btsCorpusHeaderEClass, BTS_CORPUS_HEADER__AUTHOR_NAME);
		createEAttribute(btsCorpusHeaderEClass, BTS_CORPUS_HEADER__PROJECT_ID);
		createEAttribute(btsCorpusHeaderEClass, BTS_CORPUS_HEADER__PROJECT_NAME);

		btsTimespanEClass = createEClass(BTS_TIMESPAN);
		createEReference(btsTimespanEClass, BTS_TIMESPAN__FROM);
		createEReference(btsTimespanEClass, BTS_TIMESPAN__TO);
		createEAttribute(btsTimespanEClass, BTS_TIMESPAN__COMMENT);

		btsCorpusObjectEClass = createEClass(BTS_CORPUS_OBJECT);
		createEReference(btsCorpusObjectEClass, BTS_CORPUS_OBJECT__RELATIONS);
		createEReference(btsCorpusObjectEClass, BTS_CORPUS_OBJECT__PASSPORT);
		createEReference(btsCorpusObjectEClass, BTS_CORPUS_OBJECT__PARENT);
		createEAttribute(btsCorpusObjectEClass, BTS_CORPUS_OBJECT__PARENT_ID);
		createEReference(btsCorpusObjectEClass, BTS_CORPUS_OBJECT__CHILDREN);
		createEOperation(btsCorpusObjectEClass, BTS_CORPUS_OBJECT___GET_OBJECT_TYPE);

		btsExternalReferenceEClass = createEClass(BTS_EXTERNAL_REFERENCE);
		createEAttribute(btsExternalReferenceEClass, BTS_EXTERNAL_REFERENCE__REFERENCE);
		createEAttribute(btsExternalReferenceEClass, BTS_EXTERNAL_REFERENCE__PROVIDER);
		createEAttribute(btsExternalReferenceEClass, BTS_EXTERNAL_REFERENCE__TYPE);

		btsReferencableItemEClass = createEClass(BTS_REFERENCABLE_ITEM);
		createEAttribute(btsReferencableItemEClass, BTS_REFERENCABLE_ITEM__ID);
		createEAttribute(btsReferencableItemEClass, BTS_REFERENCABLE_ITEM__COMMENT);
		createEReference(btsReferencableItemEClass, BTS_REFERENCABLE_ITEM__PARENT);
		createEAttribute(btsReferencableItemEClass, BTS_REFERENCABLE_ITEM__PARENT_ID);

		btsGraphicEClass = createEClass(BTS_GRAPHIC);
		createEAttribute(btsGraphicEClass, BTS_GRAPHIC__INNER_SENTENCE_ORDER);
		createEAttribute(btsGraphicEClass, BTS_GRAPHIC__CODE);
		createEAttribute(btsGraphicEClass, BTS_GRAPHIC__REFERENCE);

		btsTranslationsEClass = createEClass(BTS_TRANSLATIONS);
		createEReference(btsTranslationsEClass, BTS_TRANSLATIONS__TRANSLATIONS);

		btsConfigItemEClass = createEClass(BTS_CONFIG_ITEM);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__VALUE);
		createEReference(btsConfigItemEClass, BTS_CONFIG_ITEM__LABEL);
		createEReference(btsConfigItemEClass, BTS_CONFIG_ITEM__DESCRIPTION);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__SORT_KEY);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__IGNORE);
		createEReference(btsConfigItemEClass, BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__TYPE);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__SUBTYPE);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__OWNER_TYPE);
		createEAttribute(btsConfigItemEClass, BTS_CONFIG_ITEM__REFERENCED_TYPE);

		btsPassportEditorConfigEClass = createEClass(BTS_PASSPORT_EDITOR_CONFIG);
		createEAttribute(btsPassportEditorConfigEClass, BTS_PASSPORT_EDITOR_CONFIG__SHOW_WIDGET);
		createEAttribute(btsPassportEditorConfigEClass, BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE);
		createEAttribute(btsPassportEditorConfigEClass, BTS_PASSPORT_EDITOR_CONFIG__REQUIRED);
		createEAttribute(btsPassportEditorConfigEClass, BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE);
		createEAttribute(btsPassportEditorConfigEClass, BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH);
		createEAttribute(btsPassportEditorConfigEClass, BTS_PASSPORT_EDITOR_CONFIG__REGEX);

		btsUserGroupEClass = createEClass(BTS_USER_GROUP);
		createEAttribute(btsUserGroupEClass, BTS_USER_GROUP__CATEGORY);
		createEAttribute(btsUserGroupEClass, BTS_USER_GROUP__COMMENT);

		btsListEClass = createEClass(BTS_LIST);

		btsPpSubentryEClass = createEClass(BTS_PP_SUBENTRY);
		createEAttribute(btsPpSubentryEClass, BTS_PP_SUBENTRY__TYPE);
		createEAttribute(btsPpSubentryEClass, BTS_PP_SUBENTRY__SUBTYPE);
		createEAttribute(btsPpSubentryEClass, BTS_PP_SUBENTRY__KEY);
		createEAttribute(btsPpSubentryEClass, BTS_PP_SUBENTRY__VALUE);
		createEAttribute(btsPpSubentryEClass, BTS_PP_SUBENTRY__SUB_VALUE);
		createEAttribute(btsPpSubentryEClass, BTS_PP_SUBENTRY__PROVIDER);
		createEAttribute(btsPpSubentryEClass, BTS_PP_SUBENTRY__NAME);
		createEAttribute(btsPpSubentryEClass, BTS_PP_SUBENTRY__COMMENT);
		createEReference(btsPpSubentryEClass, BTS_PP_SUBENTRY__EXTERNAL_REFERENCES);
		createEReference(btsPpSubentryEClass, BTS_PP_SUBENTRY__TIMESPAN);
		createEReference(btsPpSubentryEClass, BTS_PP_SUBENTRY__DESCRIPTION);
		createEReference(btsPpSubentryEClass, BTS_PP_SUBENTRY__TRANSLATION);

		btsListSubentryEClass = createEClass(BTS_LIST_SUBENTRY);
		createEReference(btsListSubentryEClass, BTS_LIST_SUBENTRY__PASSPORT);

		btsConfigEClass = createEClass(BTS_CONFIG);
		createEReference(btsConfigEClass, BTS_CONFIG__CHILDREN);

		btsObservableObjectEClass = createEClass(BTS_OBSERVABLE_OBJECT);
		createEAttribute(btsObservableObjectEClass, BTS_OBSERVABLE_OBJECT__PROPERTY_CHANGE_SUPPORT);
		createEOperation(btsObservableObjectEClass, BTS_OBSERVABLE_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER);
		createEOperation(btsObservableObjectEClass, BTS_OBSERVABLE_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER);

		// Create data types
		propertyChangeSupportEDataType = createEDataType(PROPERTY_CHANGE_SUPPORT);
		propertyChangeListenerEDataType = createEDataType(PROPERTY_CHANGE_LISTENER);
		propertyChangeEventEDataType = createEDataType(PROPERTY_CHANGE_EVENT);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		btstcObjectEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsTextEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsSenctenceEClass.getESuperTypes().add(this.getBTSTextItems());
		btsWordEClass.getESuperTypes().add(this.getBTSSentenceItems());
		btsDelimiterEClass.getESuperTypes().add(this.getBTSTextSentenceItem());
		btsTextItemsEClass.getESuperTypes().add(this.getBTSReferencableItem());
		btsSentenceItemsEClass.getESuperTypes().add(this.getBTSReferencableItem());
		btsListEntryEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsObjectEClass.getESuperTypes().add(this.getAdministrativDataObject());
		btsAmbivalenceEClass.getESuperTypes().add(this.getBTSTextSentenceItem());
		btsUserEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		btsUserEClass.getESuperTypes().add(this.getAdministrativDataObject());
		btsCommentEClass.getESuperTypes().add(this.getAdministrativDataObject());
		btsCommentEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		btsTextSentenceItemEClass.getESuperTypes().add(this.getBTSSentenceItems());
		btsTextSentenceItemEClass.getESuperTypes().add(this.getBTSTextItems());
		btsAnnotationEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsConfigurationEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		btsConfigurationEClass.getESuperTypes().add(this.getAdministrativDataObject());
		btsConfigurationEClass.getESuperTypes().add(this.getBTSConfig());
		btsdbBaseObjectEClass.getESuperTypes().add(this.getBTSObservableObject());
		btsTextCorpusEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsImageEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsCorpusObjectEClass.getESuperTypes().add(this.getBTSObject());
		btsCorpusObjectEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		btsReferencableItemEClass.getESuperTypes().add(this.getBTSObject());
		btsConfigItemEClass.getESuperTypes().add(this.getBTSConfig());
		btsConfigItemEClass.getESuperTypes().add(this.getBTSObservableObject());
		btsUserGroupEClass.getESuperTypes().add(this.getBTSDBBaseObject());
		btsUserGroupEClass.getESuperTypes().add(this.getAdministrativDataObject());
		btsListEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsListSubentryEClass.getESuperTypes().add(this.getBTSReferencableItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(btstcObjectEClass, BTSTCObject.class, "BTSTCObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsTextEClass, BTSText.class, "BTSText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSText_TextItems(), this.getBTSTextItems(), null, "textItems", null, 0, -1, BTSText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsSenctenceEClass, BTSSenctence.class, "BTSSenctence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSSenctence_SentenceItems(), this.getBTSSentenceItems(), null, "sentenceItems", null, 0, -1, BTSSenctence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSSenctence_Translation(), this.getBTSTranslations(), null, "translation", null, 0, 1, BTSSenctence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsWordEClass, BTSWord.class, "BTSWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSWord_Translation(), this.getBTSTranslations(), null, "translation", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_WType(), ecorePackage.getEString(), "wType", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_LType(), ecorePackage.getEString(), "lType", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_LKey(), ecorePackage.getEString(), "lKey", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_FlexCode(), ecorePackage.getEString(), "flexCode", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_WChar(), ecorePackage.getEString(), "wChar", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSWord_Graphics(), this.getBTSGraphic(), null, "graphics", null, 0, -1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsDelimiterEClass, BTSDelimiter.class, "BTSDelimiter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSDelimiter_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSDelimiter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTextItemsEClass, BTSTextItems.class, "BTSTextItems", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsSentenceItemsEClass, BTSSentenceItems.class, "BTSSentenceItems", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsListEntryEClass, BTSListEntry.class, "BTSListEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSListEntry_Ignore(), ecorePackage.getEBoolean(), "ignore", null, 0, 1, BTSListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSListEntry_Subentries(), this.getBTSListSubentry(), null, "subentries", null, 0, -1, BTSListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsPassportEClass, BTSPassport.class, "BTSPassport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSPassport_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassport_Bibliography(), ecorePackage.getEString(), "bibliography", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassport_Date(), this.getBTSTimespan(), null, "date", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassport_WbSlips(), ecorePackage.getEString(), "wbSlips", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassport_WbFolder(), ecorePackage.getEString(), "wbFolder", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassport_Provenance(), ecorePackage.getEString(), "provenance", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassport_PassportEntries(), this.getBTSPassportEntry(), null, "passportEntries", null, 0, -1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassport_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassport_Descriptions(), this.getBTSTranslations(), null, "descriptions", null, 0, -1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(administrativDataObjectEClass, AdministrativDataObject.class, "AdministrativDataObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdministrativDataObject_Revisions(), this.getBTSRevision(), null, "revisions", null, 0, -1, AdministrativDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdministrativDataObject_State(), ecorePackage.getEString(), "state", null, 0, 1, AdministrativDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdministrativDataObject_RevisionState(), ecorePackage.getEString(), "revisionState", null, 0, 1, AdministrativDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdministrativDataObject_Visibility(), ecorePackage.getEString(), "visibility", null, 0, 1, AdministrativDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsObjectEClass, BTSObject.class, "BTSObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSObject_SortKey(), ecorePackage.getEInt(), "sortKey", null, 0, 1, BTSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, BTSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSObject_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSObject_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, BTSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSObject_Code(), ecorePackage.getEString(), "code", null, 0, 1, BTSObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsAmbivalenceEClass, BTSAmbivalence.class, "BTSAmbivalence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSAmbivalence_Cases(), this.getBTSLemmaCase(), null, "cases", null, 0, -1, BTSAmbivalence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsLemmaCaseEClass, BTSLemmaCase.class, "BTSLemmaCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSLemmaCase_Scenario(), this.getBTSTextSentenceItem(), null, "scenario", null, 0, -1, BTSLemmaCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsUserEClass, BTSUser.class, "BTSUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSUser_GroupIds(), ecorePackage.getEString(), "groupIds", null, 0, -1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_Sigle(), ecorePackage.getEString(), "sigle", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_Description(), ecorePackage.getEString(), "description", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_WebDescription(), ecorePackage.getEString(), "webDescription", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_ForeName(), ecorePackage.getEString(), "foreName", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_SureName(), ecorePackage.getEString(), "sureName", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_Mail(), ecorePackage.getEString(), "mail", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_WebURL(), ecorePackage.getEString(), "webURL", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSUser_ExternalReferneces(), this.getBTSExternalReference(), null, "externalReferneces", null, 0, -1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUser_Roles(), ecorePackage.getEString(), "roles", null, 0, -1, BTSUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsCommentEClass, BTSComment.class, "BTSComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSComment_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSComment_References(), this.getBTSReference(), null, "references", null, 0, -1, BTSComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSComment_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, BTSComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsInterTextReferenceEClass, BTSInterTextReference.class, "BTSInterTextReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSInterTextReference_BeginId(), ecorePackage.getEString(), "beginId", null, 0, 1, BTSInterTextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSInterTextReference_EndId(), ecorePackage.getEString(), "endId", null, 0, 1, BTSInterTextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTextSentenceItemEClass, BTSTextSentenceItem.class, "BTSTextSentenceItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsReferenceEClass, BTSReference.class, "BTSReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSReference_Parts(), this.getBTSInterTextReference(), null, "parts", null, 0, -1, BTSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSReference_ObjectId(), ecorePackage.getEString(), "objectId", null, 0, 1, BTSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsAnnotationEClass, BTSAnnotation.class, "BTSAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSAnnotation_References(), this.getBTSReference(), null, "references", null, 0, -1, BTSAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTranslationEClass, BTSTranslation.class, "BTSTranslation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSTranslation_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSTranslation_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSTranslation_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, BTSTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsDateEClass, BTSDate.class, "BTSDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSDate_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDate_Year(), ecorePackage.getEInt(), "year", null, 0, 1, BTSDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDate_Month(), ecorePackage.getEInt(), "month", null, 0, 1, BTSDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDate_Day(), ecorePackage.getEInt(), "day", null, 0, 1, BTSDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDate_RelativeRef(), ecorePackage.getEString(), "relativeRef", null, 0, 1, BTSDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsPassportEntryEClass, BTSPassportEntry.class, "BTSPassportEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSPassportEntry_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Category(), ecorePackage.getEString(), "category", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntry_Subentries(), this.getBTSPpSubentry(), null, "subentries", null, 0, -1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsRelationEClass, BTSRelation.class, "BTSRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSRelation_ObjectId(), ecorePackage.getEString(), "objectId", null, 0, 1, BTSRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSRelation_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSRelation_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, BTSRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSRelation_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsConfigurationEClass, BTSConfiguration.class, "BTSConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, BTSConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSConfiguration_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, BTSConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsdbBaseObjectEClass, BTSDBBaseObject.class, "BTSDBBaseObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSDBBaseObject_Lease(), this.getBTSLease(), null, "lease", null, 0, 1, BTSDBBaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDBBaseObject__id(), ecorePackage.getEString(), "_id", null, 0, 1, BTSDBBaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSDBBaseObject__rev(), ecorePackage.getEString(), "_rev", null, 0, 1, BTSDBBaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTextCorpusEClass, BTSTextCorpus.class, "BTSTextCorpus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSTextCorpus_Header(), this.getBTSCorpusHeader(), null, "header", null, 0, 1, BTSTextCorpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsRevisionEClass, BTSRevision.class, "BTSRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSRevision_Ref(), ecorePackage.getEInt(), "ref", null, 0, 1, BTSRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSRevision_UserId(), ecorePackage.getEString(), "userId", null, 0, 1, BTSRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSRevision_TimeStamp(), ecorePackage.getEDate(), "timeStamp", null, 0, 1, BTSRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsLeaseEClass, BTSLease.class, "BTSLease", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSLease_LeasingUserId(), ecorePackage.getEString(), "leasingUserId", null, 0, 1, BTSLease.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSLease_LeaseTimeStamp(), ecorePackage.getEDate(), "leaseTimeStamp", null, 0, 1, BTSLease.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsImageEClass, BTSImage.class, "BTSImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSImage_MediaType(), ecorePackage.getEString(), "mediaType", null, 0, 1, BTSImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBTSImage__GetAttachement(), ecorePackage.getEObject(), "getAttachement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(btsCorpusHeaderEClass, BTSCorpusHeader.class, "BTSCorpusHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSCorpusHeader_AuthorName(), ecorePackage.getEString(), "authorName", null, 0, 1, BTSCorpusHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSCorpusHeader_ProjectId(), ecorePackage.getEString(), "projectId", null, 0, 1, BTSCorpusHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSCorpusHeader_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, BTSCorpusHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTimespanEClass, BTSTimespan.class, "BTSTimespan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSTimespan_From(), this.getBTSDate(), null, "from", null, 0, 1, BTSTimespan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSTimespan_To(), this.getBTSDate(), null, "to", null, 0, 1, BTSTimespan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSTimespan_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSTimespan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsCorpusObjectEClass, BTSCorpusObject.class, "BTSCorpusObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSCorpusObject_Relations(), this.getBTSRelation(), null, "relations", null, 0, -1, BTSCorpusObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSCorpusObject_Passport(), this.getBTSPassport(), null, "passport", null, 0, 1, BTSCorpusObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSCorpusObject_Parent(), this.getBTSCorpusObject(), null, "parent", null, 0, 1, BTSCorpusObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSCorpusObject_ParentId(), ecorePackage.getEString(), "parentId", null, 0, 1, BTSCorpusObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSCorpusObject_Children(), this.getBTSCorpusObject(), null, "children", null, 0, -1, BTSCorpusObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBTSCorpusObject__GetObjectType(), ecorePackage.getEString(), "getObjectType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(btsExternalReferenceEClass, BTSExternalReference.class, "BTSExternalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSExternalReference_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, BTSExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSExternalReference_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, BTSExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSExternalReference_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsReferencableItemEClass, BTSReferencableItem.class, "BTSReferencableItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSReferencableItem_Id(), ecorePackage.getEString(), "id", null, 0, 1, BTSReferencableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSReferencableItem_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSReferencableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSReferencableItem_Parent(), this.getBTSObject(), null, "parent", null, 0, 1, BTSReferencableItem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSReferencableItem_ParentId(), ecorePackage.getEString(), "parentId", null, 0, 1, BTSReferencableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsGraphicEClass, BTSGraphic.class, "BTSGraphic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSGraphic_InnerSentenceOrder(), ecorePackage.getEInt(), "innerSentenceOrder", null, 0, 1, BTSGraphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSGraphic_Code(), ecorePackage.getEString(), "code", null, 0, 1, BTSGraphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSGraphic_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, BTSGraphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTranslationsEClass, BTSTranslations.class, "BTSTranslations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSTranslations_Translations(), this.getBTSTranslation(), null, "translations", null, 0, -1, BTSTranslations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsConfigItemEClass, BTSConfigItem.class, "BTSConfigItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSConfigItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSConfigItem_Label(), this.getBTSTranslations(), null, "label", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSConfigItem_Description(), this.getBTSTranslations(), null, "description", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSConfigItem_SortKey(), ecorePackage.getEInt(), "sortKey", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSConfigItem_Ignore(), ecorePackage.getEBoolean(), "ignore", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSConfigItem_PassportEditorConfig(), this.getBTSPassportEditorConfig(), null, "passportEditorConfig", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSConfigItem_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSConfigItem_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSConfigItem_OwnerType(), ecorePackage.getEString(), "ownerType", null, 0, -1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSConfigItem_ReferencedType(), ecorePackage.getEString(), "referencedType", null, 0, -1, BTSConfigItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsPassportEditorConfigEClass, BTSPassportEditorConfig.class, "BTSPassportEditorConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSPassportEditorConfig_ShowWidget(), ecorePackage.getEBoolean(), "showWidget", null, 0, 1, BTSPassportEditorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEditorConfig_WidgetType(), ecorePackage.getEString(), "widgetType", null, 0, 1, BTSPassportEditorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEditorConfig_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, BTSPassportEditorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEditorConfig_AllowMultiple(), ecorePackage.getEBoolean(), "allowMultiple", null, 0, 1, BTSPassportEditorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEditorConfig_HorizontalWidth(), ecorePackage.getEInt(), "horizontalWidth", null, 0, 1, BTSPassportEditorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEditorConfig_Regex(), ecorePackage.getEString(), "regex", null, 0, 1, BTSPassportEditorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsUserGroupEClass, BTSUserGroup.class, "BTSUserGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSUserGroup_Category(), ecorePackage.getEString(), "category", null, 0, 1, BTSUserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSUserGroup_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSUserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsListEClass, BTSList.class, "BTSList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsPpSubentryEClass, BTSPpSubentry.class, "BTSPpSubentry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSPpSubentry_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSPpSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPpSubentry_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, BTSPpSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPpSubentry_Key(), ecorePackage.getEInt(), "key", null, 0, 1, BTSPpSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPpSubentry_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSPpSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPpSubentry_SubValue(), ecorePackage.getEString(), "subValue", null, 0, 1, BTSPpSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPpSubentry_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, BTSPpSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPpSubentry_Name(), ecorePackage.getEString(), "name", null, 0, 1, BTSPpSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPpSubentry_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSPpSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPpSubentry_ExternalReferences(), this.getBTSExternalReference(), null, "externalReferences", null, 0, -1, BTSPpSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPpSubentry_Timespan(), this.getBTSTimespan(), null, "timespan", null, 0, 1, BTSPpSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPpSubentry_Description(), this.getBTSTranslations(), null, "description", null, 0, 1, BTSPpSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPpSubentry_Translation(), this.getBTSTranslations(), null, "translation", null, 0, 1, BTSPpSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsListSubentryEClass, BTSListSubentry.class, "BTSListSubentry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSListSubentry_Passport(), this.getBTSPassport(), null, "passport", null, 0, 1, BTSListSubentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsConfigEClass, BTSConfig.class, "BTSConfig", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSConfig_Children(), this.getBTSConfig(), null, "children", null, 0, -1, BTSConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsObservableObjectEClass, BTSObservableObject.class, "BTSObservableObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSObservableObject_PropertyChangeSupport(), this.getPropertyChangeSupport(), "propertyChangeSupport", null, 0, 1, BTSObservableObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getBTSObservableObject__AddPropertyChangeListener__PropertyChangeListener(), null, "addPropertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertyChangeListener(), "propertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBTSObservableObject__RemovePropertyChangeListener__PropertyChangeListener(), null, "removePropertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertyChangeListener(), "propertyChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(propertyChangeSupportEDataType, PropertyChangeSupport.class, "PropertyChangeSupport", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyChangeListenerEDataType, PropertyChangeListener.class, "PropertyChangeListener", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyChangeEventEDataType, PropertyChangeEvent.class, "PropertyChangeEvent", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BtsmodelPackageImpl
