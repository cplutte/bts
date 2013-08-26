/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage
 * @generated
 */
public interface BtsmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtsmodelFactory eINSTANCE = org.bbaw.bts.btsmodel.impl.BtsmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BTSTC Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTSTC Object</em>'.
	 * @generated
	 */
	BTSTCObject createBTSTCObject();

	/**
	 * Returns a new object of class '<em>BTS Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Text</em>'.
	 * @generated
	 */
	BTSText createBTSText();

	/**
	 * Returns a new object of class '<em>BTS Senctence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Senctence</em>'.
	 * @generated
	 */
	BTSSenctence createBTSSenctence();

	/**
	 * Returns a new object of class '<em>BTS Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Word</em>'.
	 * @generated
	 */
	BTSWord createBTSWord();

	/**
	 * Returns a new object of class '<em>BTS Delimiter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Delimiter</em>'.
	 * @generated
	 */
	BTSDelimiter createBTSDelimiter();

	/**
	 * Returns a new object of class '<em>BTS List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS List Entry</em>'.
	 * @generated
	 */
	BTSListEntry createBTSListEntry();

	/**
	 * Returns a new object of class '<em>BTS Passport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Passport</em>'.
	 * @generated
	 */
	BTSPassport createBTSPassport();

	/**
	 * Returns a new object of class '<em>BTS Ambivalence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Ambivalence</em>'.
	 * @generated
	 */
	BTSAmbivalence createBTSAmbivalence();

	/**
	 * Returns a new object of class '<em>BTS Lemma Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Lemma Case</em>'.
	 * @generated
	 */
	BTSLemmaCase createBTSLemmaCase();

	/**
	 * Returns a new object of class '<em>BTS User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS User</em>'.
	 * @generated
	 */
	BTSUser createBTSUser();

	/**
	 * Returns a new object of class '<em>BTS Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Comment</em>'.
	 * @generated
	 */
	BTSComment createBTSComment();

	/**
	 * Returns a new object of class '<em>BTS Inter Text Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Inter Text Reference</em>'.
	 * @generated
	 */
	BTSInterTextReference createBTSInterTextReference();

	/**
	 * Returns a new object of class '<em>BTS Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Annotation</em>'.
	 * @generated
	 */
	BTSAnnotation createBTSAnnotation();

	/**
	 * Returns a new object of class '<em>BTS Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Translation</em>'.
	 * @generated
	 */
	BTSTranslation createBTSTranslation();

	/**
	 * Returns a new object of class '<em>BTS Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Date</em>'.
	 * @generated
	 */
	BTSDate createBTSDate();

	/**
	 * Returns a new object of class '<em>BTS Passport Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Passport Entry</em>'.
	 * @generated
	 */
	BTSPassportEntry createBTSPassportEntry();

	/**
	 * Returns a new object of class '<em>BTS Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Relation</em>'.
	 * @generated
	 */
	BTSRelation createBTSRelation();

	/**
	 * Returns a new object of class '<em>BTS Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Configuration</em>'.
	 * @generated
	 */
	BTSConfiguration createBTSConfiguration();

	/**
	 * Returns a new object of class '<em>BTS Text Corpus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Text Corpus</em>'.
	 * @generated
	 */
	BTSTextCorpus createBTSTextCorpus();

	/**
	 * Returns a new object of class '<em>BTS Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Revision</em>'.
	 * @generated
	 */
	BTSRevision createBTSRevision();

	/**
	 * Returns a new object of class '<em>BTS Lease</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Lease</em>'.
	 * @generated
	 */
	BTSLease createBTSLease();

	/**
	 * Returns a new object of class '<em>BTS Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Image</em>'.
	 * @generated
	 */
	BTSImage createBTSImage();

	/**
	 * Returns a new object of class '<em>BTS Corpus Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Corpus Header</em>'.
	 * @generated
	 */
	BTSCorpusHeader createBTSCorpusHeader();

	/**
	 * Returns a new object of class '<em>BTS Timespan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Timespan</em>'.
	 * @generated
	 */
	BTSTimespan createBTSTimespan();

	/**
	 * Returns a new object of class '<em>BTS External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS External Reference</em>'.
	 * @generated
	 */
	BTSExternalReference createBTSExternalReference();

	/**
	 * Returns a new object of class '<em>BTS Graphic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Graphic</em>'.
	 * @generated
	 */
	BTSGraphic createBTSGraphic();

	/**
	 * Returns a new object of class '<em>BTS Translations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Translations</em>'.
	 * @generated
	 */
	BTSTranslations createBTSTranslations();

	/**
	 * Returns a new object of class '<em>BTS Config Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Config Item</em>'.
	 * @generated
	 */
	BTSConfigItem createBTSConfigItem();

	/**
	 * Returns a new object of class '<em>BTS Passport Editor Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Passport Editor Config</em>'.
	 * @generated
	 */
	BTSPassportEditorConfig createBTSPassportEditorConfig();

	/**
	 * Returns a new object of class '<em>BTS User Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS User Group</em>'.
	 * @generated
	 */
	BTSUserGroup createBTSUserGroup();

	/**
	 * Returns a new object of class '<em>BTS List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS List</em>'.
	 * @generated
	 */
	BTSList createBTSList();

	/**
	 * Returns a new object of class '<em>BTS Pp Subentry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Pp Subentry</em>'.
	 * @generated
	 */
	BTSPpSubentry createBTSPpSubentry();

	/**
	 * Returns a new object of class '<em>BTS List Subentry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS List Subentry</em>'.
	 * @generated
	 */
	BTSListSubentry createBTSListSubentry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BtsmodelPackage getBtsmodelPackage();

} //BtsmodelFactory
