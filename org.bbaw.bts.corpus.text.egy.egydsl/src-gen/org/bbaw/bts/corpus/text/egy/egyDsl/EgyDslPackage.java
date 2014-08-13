/**
 */
package org.bbaw.bts.corpus.text.egy.egyDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslFactory
 * @model kind="package"
 * @generated
 */
public interface EgyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "egyDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bbaw.org/bts/corpus/text/egy/EgyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "egyDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EgyDslPackage eINSTANCE = org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextContentImpl <em>Text Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextContentImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getTextContent()
   * @generated
   */
  int TEXT_CONTENT = 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONTENT__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Text Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_CONTENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextItemImpl <em>Text Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextItemImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getTextItem()
   * @generated
   */
  int TEXT_ITEM = 1;

  /**
   * The number of structural features of the '<em>Text Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceImpl <em>Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentence()
   * @generated
   */
  int SENTENCE = 2;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE__ITEMS = TEXT_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_FEATURE_COUNT = TEXT_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemImpl <em>Sentence Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentenceItem()
   * @generated
   */
  int SENTENCE_ITEM = 3;

  /**
   * The number of structural features of the '<em>Sentence Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AbstractMarkerImpl <em>Abstract Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AbstractMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAbstractMarker()
   * @generated
   */
  int ABSTRACT_MARKER = 4;

  /**
   * The number of structural features of the '<em>Abstract Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_MARKER_FEATURE_COUNT = SENTENCE_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AmbivalenceImpl <em>Ambivalence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AmbivalenceImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAmbivalence()
   * @generated
   */
  int AMBIVALENCE = 5;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIVALENCE__CASES = SENTENCE_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ambivalence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIVALENCE_FEATURE_COUNT = SENTENCE_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CaseImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getCase()
   * @generated
   */
  int CASE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__ITEMS = 1;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemNoAmbivalenceImpl <em>Sentence Item No Ambivalence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemNoAmbivalenceImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentenceItemNoAmbivalence()
   * @generated
   */
  int SENTENCE_ITEM_NO_AMBIVALENCE = 7;

  /**
   * The number of structural features of the '<em>Sentence Item No Ambivalence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_ITEM_NO_AMBIVALENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersMarkerImpl <em>Vers Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersMarker()
   * @generated
   */
  int VERS_MARKER = 8;

  /**
   * The number of structural features of the '<em>Vers Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERS_MARKER_FEATURE_COUNT = ABSTRACT_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersFrontierMarkerImpl <em>Vers Frontier Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersFrontierMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersFrontierMarker()
   * @generated
   */
  int VERS_FRONTIER_MARKER = 9;

  /**
   * The number of structural features of the '<em>Vers Frontier Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERS_FRONTIER_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersbreakMarkerImpl <em>Versbreak Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersbreakMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersbreakMarker()
   * @generated
   */
  int VERSBREAK_MARKER = 10;

  /**
   * The number of structural features of the '<em>Versbreak Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSBREAK_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.BrokenVersbreakMarkerImpl <em>Broken Versbreak Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.BrokenVersbreakMarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getBrokenVersbreakMarker()
   * @generated
   */
  int BROKEN_VERSBREAK_MARKER = 11;

  /**
   * The number of structural features of the '<em>Broken Versbreak Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROKEN_VERSBREAK_MARKER_FEATURE_COUNT = VERS_MARKER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.MarkerImpl <em>Marker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.MarkerImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getMarker()
   * @generated
   */
  int MARKER = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKER__TYPE = ABSTRACT_MARKER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKER__NAME = ABSTRACT_MARKER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Marker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKER_FEATURE_COUNT = ABSTRACT_MARKER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordImpl <em>Word</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWord()
   * @generated
   */
  int WORD = 13;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD__WCHAR = SENTENCE_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Word</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_FEATURE_COUNT = SENTENCE_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl <em>Word Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordPart()
   * @generated
   */
  int WORD_PART = 14;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_PART__WCHAR = 0;

  /**
   * The number of structural features of the '<em>Word Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordEndingImpl <em>Word Ending</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordEndingImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordEnding()
   * @generated
   */
  int WORD_ENDING = 15;

  /**
   * The number of structural features of the '<em>Word Ending</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_ENDING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DualEndingImpl <em>Dual Ending</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DualEndingImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDualEnding()
   * @generated
   */
  int DUAL_ENDING = 16;

  /**
   * The feature id for the '<em><b>Interfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_ENDING__INTERFIX = WORD_ENDING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Chars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_ENDING__CHARS = WORD_ENDING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dual Ending</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_ENDING_FEATURE_COUNT = WORD_ENDING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DualCharsImpl <em>Dual Chars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DualCharsImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDualChars()
   * @generated
   */
  int DUAL_CHARS = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_CHARS__NAME = 0;

  /**
   * The number of structural features of the '<em>Dual Chars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_CHARS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PluralCharsImpl <em>Plural Chars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PluralCharsImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPluralChars()
   * @generated
   */
  int PLURAL_CHARS = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLURAL_CHARS__NAME = 0;

  /**
   * The number of structural features of the '<em>Plural Chars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLURAL_CHARS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PluralEndingImpl <em>Plural Ending</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PluralEndingImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPluralEnding()
   * @generated
   */
  int PLURAL_ENDING = 19;

  /**
   * The feature id for the '<em><b>Interfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLURAL_ENDING__INTERFIX = WORD_ENDING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Chars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLURAL_ENDING__CHARS = WORD_ENDING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plural Ending</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLURAL_ENDING_FEATURE_COUNT = WORD_ENDING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionEdingImpl <em>Interfix Flexion Eding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionEdingImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixFlexionEding()
   * @generated
   */
  int INTERFIX_FLEXION_EDING = 20;

  /**
   * The feature id for the '<em><b>Interfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_FLEXION_EDING__INTERFIX = WORD_ENDING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Chars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_FLEXION_EDING__CHARS = WORD_ENDING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interfix Flexion Eding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_FLEXION_EDING_FEATURE_COUNT = WORD_ENDING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalEndingImpl <em>Interfix Lexical Ending</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalEndingImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixLexicalEnding()
   * @generated
   */
  int INTERFIX_LEXICAL_ENDING = 21;

  /**
   * The feature id for the '<em><b>Interfix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_LEXICAL_ENDING__INTERFIX = WORD_ENDING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Chars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_LEXICAL_ENDING__CHARS = WORD_ENDING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interfix Lexical Ending</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_LEXICAL_ENDING_FEATURE_COUNT = WORD_ENDING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordMiddleImpl <em>Word Middle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordMiddleImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordMiddle()
   * @generated
   */
  int WORD_MIDDLE = 22;

  /**
   * The number of structural features of the '<em>Word Middle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_MIDDLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CharsImpl <em>Chars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CharsImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getChars()
   * @generated
   */
  int CHARS = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARS__NAME = WORD_MIDDLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Chars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARS_FEATURE_COUNT = WORD_MIDDLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SuffixCharsImpl <em>Suffix Chars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SuffixCharsImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSuffixChars()
   * @generated
   */
  int SUFFIX_CHARS = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUFFIX_CHARS__NAME = 0;

  /**
   * The number of structural features of the '<em>Suffix Chars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUFFIX_CHARS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoCartoucheImpl <em>No Cartouche</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoCartoucheImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoCartouche()
   * @generated
   */
  int NO_CARTOUCHE = 33;

  /**
   * The number of structural features of the '<em>No Cartouche</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_CARTOUCHE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixImpl <em>Interfix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfix()
   * @generated
   */
  int INTERFIX = 25;

  /**
   * The number of structural features of the '<em>Interfix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_FEATURE_COUNT = NO_CARTOUCHE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalImpl <em>Interfix Lexical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixLexical()
   * @generated
   */
  int INTERFIX_LEXICAL = 26;

  /**
   * The number of structural features of the '<em>Interfix Lexical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_LEXICAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionImpl <em>Interfix Flexion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixFlexion()
   * @generated
   */
  int INTERFIX_FLEXION = 27;

  /**
   * The number of structural features of the '<em>Interfix Flexion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_FLEXION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixSuffixPronomLexicalImpl <em>Interfix Suffix Pronom Lexical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixSuffixPronomLexicalImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixSuffixPronomLexical()
   * @generated
   */
  int INTERFIX_SUFFIX_PRONOM_LEXICAL = 28;

  /**
   * The number of structural features of the '<em>Interfix Suffix Pronom Lexical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_SUFFIX_PRONOM_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixNonLexicalImpl <em>Interfix Prefix Non Lexical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixNonLexicalImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPrefixNonLexical()
   * @generated
   */
  int INTERFIX_PREFIX_NON_LEXICAL = 29;

  /**
   * The number of structural features of the '<em>Interfix Prefix Non Lexical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_PREFIX_NON_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixLexicalImpl <em>Interfix Prefix Lexical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixLexicalImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPrefixLexical()
   * @generated
   */
  int INTERFIX_PREFIX_LEXICAL = 30;

  /**
   * The number of structural features of the '<em>Interfix Prefix Lexical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_PREFIX_LEXICAL_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixConnectionSyllabicGroupImpl <em>Interfix Connection Syllabic Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixConnectionSyllabicGroupImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixConnectionSyllabicGroup()
   * @generated
   */
  int INTERFIX_CONNECTION_SYLLABIC_GROUP = 31;

  /**
   * The number of structural features of the '<em>Interfix Connection Syllabic Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFIX_CONNECTION_SYLLABIC_GROUP_FEATURE_COUNT = INTERFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.BracketsImpl <em>Brackets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.BracketsImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getBrackets()
   * @generated
   */
  int BRACKETS = 32;

  /**
   * The number of structural features of the '<em>Brackets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETS_FEATURE_COUNT = WORD_MIDDLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedImpl <em>Expanded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getExpanded()
   * @generated
   */
  int EXPANDED = 34;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDED__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expanded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDED_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedImpl <em>No Expanded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoExpanded()
   * @generated
   */
  int NO_EXPANDED = 35;

  /**
   * The number of structural features of the '<em>No Expanded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_EXPANDED_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationImpl <em>Emendation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getEmendation()
   * @generated
   */
  int EMENDATION = 36;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMENDATION__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Emendation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMENDATION_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoEmendationImpl <em>No Emendation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoEmendationImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoEmendation()
   * @generated
   */
  int NO_EMENDATION = 37;

  /**
   * The number of structural features of the '<em>No Emendation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_EMENDATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableReadingImpl <em>Disputable Reading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableReadingImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableReading()
   * @generated
   */
  int DISPUTABLE_READING = 38;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPUTABLE_READING__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Disputable Reading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPUTABLE_READING_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDisputableReadingImpl <em>No Disputable Reading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDisputableReadingImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoDisputableReading()
   * @generated
   */
  int NO_DISPUTABLE_READING = 39;

  /**
   * The number of structural features of the '<em>No Disputable Reading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_DISPUTABLE_READING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl <em>Lacuna</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getLacuna()
   * @generated
   */
  int LACUNA = 40;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LACUNA__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lacuna</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LACUNA_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoLacunaImpl <em>No Lacuna</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoLacunaImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoLacuna()
   * @generated
   */
  int NO_LACUNA = 41;

  /**
   * The number of structural features of the '<em>No Lacuna</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_LACUNA_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletionImpl <em>Deletion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletionImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletion()
   * @generated
   */
  int DELETION = 42;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETION__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Deletion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETION_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDeletionImpl <em>No Deletion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDeletionImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoDeletion()
   * @generated
   */
  int NO_DELETION = 43;

  /**
   * The number of structural features of the '<em>No Deletion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_DELETION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedColumnImpl <em>Expanded Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedColumnImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getExpandedColumn()
   * @generated
   */
  int EXPANDED_COLUMN = 44;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDED_COLUMN__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expanded Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPANDED_COLUMN_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedColumnImpl <em>No Expanded Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedColumnImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoExpandedColumn()
   * @generated
   */
  int NO_EXPANDED_COLUMN = 45;

  /**
   * The number of structural features of the '<em>No Expanded Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_EXPANDED_COLUMN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurImpl <em>Rasur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRasur()
   * @generated
   */
  int RASUR = 46;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RASUR__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rasur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RASUR_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRasurImpl <em>No Rasur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRasurImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoRasur()
   * @generated
   */
  int NO_RASUR = 47;

  /**
   * The number of structural features of the '<em>No Rasur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_RASUR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedImpl <em>Ancient Expanded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAncientExpanded()
   * @generated
   */
  int ANCIENT_EXPANDED = 48;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCIENT_EXPANDED__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ancient Expanded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCIENT_EXPANDED_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoAncientExpandedImpl <em>No Ancient Expanded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoAncientExpandedImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoAncientExpanded()
   * @generated
   */
  int NO_ANCIENT_EXPANDED = 49;

  /**
   * The number of structural features of the '<em>No Ancient Expanded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_ANCIENT_EXPANDED_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurImpl <em>Restoration Over Rasur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRestorationOverRasur()
   * @generated
   */
  int RESTORATION_OVER_RASUR = 50;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTORATION_OVER_RASUR__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Restoration Over Rasur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTORATION_OVER_RASUR_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRestorationOverRasurImpl <em>No Restoration Over Rasur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRestorationOverRasurImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoRestorationOverRasur()
   * @generated
   */
  int NO_RESTORATION_OVER_RASUR = 51;

  /**
   * The number of structural features of the '<em>No Restoration Over Rasur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_RESTORATION_OVER_RASUR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestructionImpl <em>Partial Destruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestructionImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestruction()
   * @generated
   */
  int PARTIAL_DESTRUCTION = 52;

  /**
   * The feature id for the '<em><b>WChar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_DESTRUCTION__WCHAR = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Partial Destruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_DESTRUCTION_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoPartialDestructionImpl <em>No Partial Destruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoPartialDestructionImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoPartialDestruction()
   * @generated
   */
  int NO_PARTIAL_DESTRUCTION = 53;

  /**
   * The number of structural features of the '<em>No Partial Destruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PARTIAL_DESTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestructionImpl <em>Destruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestructionImpl
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestruction()
   * @generated
   */
  int DESTRUCTION = 54;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTRUCTION__COMMENT = BRACKETS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Destruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTRUCTION_FEATURE_COUNT = BRACKETS_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.TextContent <em>Text Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Content</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.TextContent
   * @generated
   */
  EClass getTextContent();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.TextContent#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.TextContent#getItems()
   * @see #getTextContent()
   * @generated
   */
  EReference getTextContent_Items();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.TextItem <em>Text Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Item</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.TextItem
   * @generated
   */
  EClass getTextItem();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Sentence
   * @generated
   */
  EClass getSentence();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Sentence#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Sentence#getItems()
   * @see #getSentence()
   * @generated
   */
  EReference getSentence_Items();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem <em>Sentence Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence Item</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItem
   * @generated
   */
  EClass getSentenceItem();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AbstractMarker <em>Abstract Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.AbstractMarker
   * @generated
   */
  EClass getAbstractMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence <em>Ambivalence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ambivalence</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence
   * @generated
   */
  EClass getAmbivalence();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Ambivalence#getCases()
   * @see #getAmbivalence()
   * @generated
   */
  EReference getAmbivalence_Cases();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Case#getName()
   * @see #getCase()
   * @generated
   */
  EAttribute getCase_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Case#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Case#getItems()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Items();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence <em>Sentence Item No Ambivalence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence Item No Ambivalence</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.SentenceItemNoAmbivalence
   * @generated
   */
  EClass getSentenceItemNoAmbivalence();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.VersMarker <em>Vers Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vers Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.VersMarker
   * @generated
   */
  EClass getVersMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker <em>Vers Frontier Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vers Frontier Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.VersFrontierMarker
   * @generated
   */
  EClass getVersFrontierMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker <em>Versbreak Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Versbreak Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.VersbreakMarker
   * @generated
   */
  EClass getVersbreakMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker <em>Broken Versbreak Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Broken Versbreak Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.BrokenVersbreakMarker
   * @generated
   */
  EClass getBrokenVersbreakMarker();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Marker <em>Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Marker</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Marker
   * @generated
   */
  EClass getMarker();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Marker#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Marker#getType()
   * @see #getMarker()
   * @generated
   */
  EAttribute getMarker_Type();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Marker#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Marker#getName()
   * @see #getMarker()
   * @generated
   */
  EAttribute getMarker_Name();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Word <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Word
   * @generated
   */
  EClass getWord();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Word#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Word#getWChar()
   * @see #getWord()
   * @generated
   */
  EReference getWord_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordPart <em>Word Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word Part</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.WordPart
   * @generated
   */
  EClass getWordPart();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordPart#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.WordPart#getWChar()
   * @see #getWordPart()
   * @generated
   */
  EReference getWordPart_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordEnding <em>Word Ending</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word Ending</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.WordEnding
   * @generated
   */
  EClass getWordEnding();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DualEnding <em>Dual Ending</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dual Ending</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DualEnding
   * @generated
   */
  EClass getDualEnding();

  /**
   * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DualEnding#getInterfix <em>Interfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interfix</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DualEnding#getInterfix()
   * @see #getDualEnding()
   * @generated
   */
  EReference getDualEnding_Interfix();

  /**
   * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DualEnding#getChars <em>Chars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Chars</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DualEnding#getChars()
   * @see #getDualEnding()
   * @generated
   */
  EReference getDualEnding_Chars();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DualChars <em>Dual Chars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dual Chars</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DualChars
   * @generated
   */
  EClass getDualChars();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DualChars#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DualChars#getName()
   * @see #getDualChars()
   * @generated
   */
  EAttribute getDualChars_Name();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PluralChars <em>Plural Chars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plural Chars</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PluralChars
   * @generated
   */
  EClass getPluralChars();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PluralChars#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PluralChars#getName()
   * @see #getPluralChars()
   * @generated
   */
  EAttribute getPluralChars_Name();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PluralEnding <em>Plural Ending</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plural Ending</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PluralEnding
   * @generated
   */
  EClass getPluralEnding();

  /**
   * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PluralEnding#getInterfix <em>Interfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interfix</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PluralEnding#getInterfix()
   * @see #getPluralEnding()
   * @generated
   */
  EReference getPluralEnding_Interfix();

  /**
   * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PluralEnding#getChars <em>Chars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Chars</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PluralEnding#getChars()
   * @see #getPluralEnding()
   * @generated
   */
  EReference getPluralEnding_Chars();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexionEding <em>Interfix Flexion Eding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Flexion Eding</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexionEding
   * @generated
   */
  EClass getInterfixFlexionEding();

  /**
   * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexionEding#getInterfix <em>Interfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interfix</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexionEding#getInterfix()
   * @see #getInterfixFlexionEding()
   * @generated
   */
  EReference getInterfixFlexionEding_Interfix();

  /**
   * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexionEding#getChars <em>Chars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Chars</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexionEding#getChars()
   * @see #getInterfixFlexionEding()
   * @generated
   */
  EReference getInterfixFlexionEding_Chars();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexicalEnding <em>Interfix Lexical Ending</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Lexical Ending</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexicalEnding
   * @generated
   */
  EClass getInterfixLexicalEnding();

  /**
   * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexicalEnding#getInterfix <em>Interfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interfix</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexicalEnding#getInterfix()
   * @see #getInterfixLexicalEnding()
   * @generated
   */
  EReference getInterfixLexicalEnding_Interfix();

  /**
   * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexicalEnding#getChars <em>Chars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Chars</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexicalEnding#getChars()
   * @see #getInterfixLexicalEnding()
   * @generated
   */
  EReference getInterfixLexicalEnding_Chars();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.WordMiddle <em>Word Middle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word Middle</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.WordMiddle
   * @generated
   */
  EClass getWordMiddle();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Chars <em>Chars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chars</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Chars
   * @generated
   */
  EClass getChars();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Chars#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Chars#getName()
   * @see #getChars()
   * @generated
   */
  EAttribute getChars_Name();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.SuffixChars <em>Suffix Chars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suffix Chars</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.SuffixChars
   * @generated
   */
  EClass getSuffixChars();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.SuffixChars#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.SuffixChars#getName()
   * @see #getSuffixChars()
   * @generated
   */
  EAttribute getSuffixChars_Name();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Interfix <em>Interfix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Interfix
   * @generated
   */
  EClass getInterfix();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexical <em>Interfix Lexical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Lexical</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixLexical
   * @generated
   */
  EClass getInterfixLexical();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexion <em>Interfix Flexion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Flexion</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixFlexion
   * @generated
   */
  EClass getInterfixFlexion();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixSuffixPronomLexical <em>Interfix Suffix Pronom Lexical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Suffix Pronom Lexical</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixSuffixPronomLexical
   * @generated
   */
  EClass getInterfixSuffixPronomLexical();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixNonLexical <em>Interfix Prefix Non Lexical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Prefix Non Lexical</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixNonLexical
   * @generated
   */
  EClass getInterfixPrefixNonLexical();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixLexical <em>Interfix Prefix Lexical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Prefix Lexical</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixPrefixLexical
   * @generated
   */
  EClass getInterfixPrefixLexical();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.InterfixConnectionSyllabicGroup <em>Interfix Connection Syllabic Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfix Connection Syllabic Group</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.InterfixConnectionSyllabicGroup
   * @generated
   */
  EClass getInterfixConnectionSyllabicGroup();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Brackets <em>Brackets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Brackets</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Brackets
   * @generated
   */
  EClass getBrackets();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoCartouche <em>No Cartouche</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Cartouche</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoCartouche
   * @generated
   */
  EClass getNoCartouche();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Expanded <em>Expanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expanded</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Expanded
   * @generated
   */
  EClass getExpanded();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Expanded#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Expanded#getWChar()
   * @see #getExpanded()
   * @generated
   */
  EReference getExpanded_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoExpanded <em>No Expanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Expanded</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoExpanded
   * @generated
   */
  EClass getNoExpanded();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Emendation <em>Emendation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emendation</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Emendation
   * @generated
   */
  EClass getEmendation();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Emendation#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Emendation#getWChar()
   * @see #getEmendation()
   * @generated
   */
  EReference getEmendation_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoEmendation <em>No Emendation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Emendation</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoEmendation
   * @generated
   */
  EClass getNoEmendation();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading <em>Disputable Reading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disputable Reading</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading
   * @generated
   */
  EClass getDisputableReading();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.DisputableReading#getWChar()
   * @see #getDisputableReading()
   * @generated
   */
  EReference getDisputableReading_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoDisputableReading <em>No Disputable Reading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Disputable Reading</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoDisputableReading
   * @generated
   */
  EClass getNoDisputableReading();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna <em>Lacuna</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lacuna</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna
   * @generated
   */
  EClass getLacuna();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Lacuna#getWChar()
   * @see #getLacuna()
   * @generated
   */
  EReference getLacuna_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoLacuna <em>No Lacuna</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Lacuna</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoLacuna
   * @generated
   */
  EClass getNoLacuna();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Deletion <em>Deletion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deletion</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Deletion
   * @generated
   */
  EClass getDeletion();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Deletion#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Deletion#getWChar()
   * @see #getDeletion()
   * @generated
   */
  EReference getDeletion_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoDeletion <em>No Deletion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Deletion</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoDeletion
   * @generated
   */
  EClass getNoDeletion();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn <em>Expanded Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expanded Column</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn
   * @generated
   */
  EClass getExpandedColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.ExpandedColumn#getWChar()
   * @see #getExpandedColumn()
   * @generated
   */
  EReference getExpandedColumn_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoExpandedColumn <em>No Expanded Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Expanded Column</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoExpandedColumn
   * @generated
   */
  EClass getNoExpandedColumn();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Rasur <em>Rasur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rasur</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Rasur
   * @generated
   */
  EClass getRasur();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Rasur#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Rasur#getWChar()
   * @see #getRasur()
   * @generated
   */
  EReference getRasur_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoRasur <em>No Rasur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Rasur</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoRasur
   * @generated
   */
  EClass getNoRasur();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded <em>Ancient Expanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ancient Expanded</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded
   * @generated
   */
  EClass getAncientExpanded();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.AncientExpanded#getWChar()
   * @see #getAncientExpanded()
   * @generated
   */
  EReference getAncientExpanded_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoAncientExpanded <em>No Ancient Expanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Ancient Expanded</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoAncientExpanded
   * @generated
   */
  EClass getNoAncientExpanded();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur <em>Restoration Over Rasur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restoration Over Rasur</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur
   * @generated
   */
  EClass getRestorationOverRasur();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.RestorationOverRasur#getWChar()
   * @see #getRestorationOverRasur()
   * @generated
   */
  EReference getRestorationOverRasur_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoRestorationOverRasur <em>No Restoration Over Rasur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Restoration Over Rasur</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoRestorationOverRasur
   * @generated
   */
  EClass getNoRestorationOverRasur();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction <em>Partial Destruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partial Destruction</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction
   * @generated
   */
  EClass getPartialDestruction();

  /**
   * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction#getWChar <em>WChar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WChar</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.PartialDestruction#getWChar()
   * @see #getPartialDestruction()
   * @generated
   */
  EReference getPartialDestruction_WChar();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.NoPartialDestruction <em>No Partial Destruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Partial Destruction</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.NoPartialDestruction
   * @generated
   */
  EClass getNoPartialDestruction();

  /**
   * Returns the meta object for class '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Destruction <em>Destruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Destruction</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Destruction
   * @generated
   */
  EClass getDestruction();

  /**
   * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.text.egy.egyDsl.Destruction#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.bbaw.bts.corpus.text.egy.egyDsl.Destruction#getComment()
   * @see #getDestruction()
   * @generated
   */
  EAttribute getDestruction_Comment();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EgyDslFactory getEgyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextContentImpl <em>Text Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextContentImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getTextContent()
     * @generated
     */
    EClass TEXT_CONTENT = eINSTANCE.getTextContent();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_CONTENT__ITEMS = eINSTANCE.getTextContent_Items();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextItemImpl <em>Text Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.TextItemImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getTextItem()
     * @generated
     */
    EClass TEXT_ITEM = eINSTANCE.getTextItem();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceImpl <em>Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentence()
     * @generated
     */
    EClass SENTENCE = eINSTANCE.getSentence();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENTENCE__ITEMS = eINSTANCE.getSentence_Items();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemImpl <em>Sentence Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentenceItem()
     * @generated
     */
    EClass SENTENCE_ITEM = eINSTANCE.getSentenceItem();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AbstractMarkerImpl <em>Abstract Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AbstractMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAbstractMarker()
     * @generated
     */
    EClass ABSTRACT_MARKER = eINSTANCE.getAbstractMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AmbivalenceImpl <em>Ambivalence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AmbivalenceImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAmbivalence()
     * @generated
     */
    EClass AMBIVALENCE = eINSTANCE.getAmbivalence();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AMBIVALENCE__CASES = eINSTANCE.getAmbivalence_Cases();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CaseImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE__NAME = eINSTANCE.getCase_Name();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__ITEMS = eINSTANCE.getCase_Items();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemNoAmbivalenceImpl <em>Sentence Item No Ambivalence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SentenceItemNoAmbivalenceImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSentenceItemNoAmbivalence()
     * @generated
     */
    EClass SENTENCE_ITEM_NO_AMBIVALENCE = eINSTANCE.getSentenceItemNoAmbivalence();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersMarkerImpl <em>Vers Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersMarker()
     * @generated
     */
    EClass VERS_MARKER = eINSTANCE.getVersMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersFrontierMarkerImpl <em>Vers Frontier Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersFrontierMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersFrontierMarker()
     * @generated
     */
    EClass VERS_FRONTIER_MARKER = eINSTANCE.getVersFrontierMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersbreakMarkerImpl <em>Versbreak Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.VersbreakMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getVersbreakMarker()
     * @generated
     */
    EClass VERSBREAK_MARKER = eINSTANCE.getVersbreakMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.BrokenVersbreakMarkerImpl <em>Broken Versbreak Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.BrokenVersbreakMarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getBrokenVersbreakMarker()
     * @generated
     */
    EClass BROKEN_VERSBREAK_MARKER = eINSTANCE.getBrokenVersbreakMarker();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.MarkerImpl <em>Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.MarkerImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getMarker()
     * @generated
     */
    EClass MARKER = eINSTANCE.getMarker();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MARKER__TYPE = eINSTANCE.getMarker_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MARKER__NAME = eINSTANCE.getMarker_Name();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordImpl <em>Word</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWord()
     * @generated
     */
    EClass WORD = eINSTANCE.getWord();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORD__WCHAR = eINSTANCE.getWord_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl <em>Word Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordPartImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordPart()
     * @generated
     */
    EClass WORD_PART = eINSTANCE.getWordPart();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORD_PART__WCHAR = eINSTANCE.getWordPart_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordEndingImpl <em>Word Ending</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordEndingImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordEnding()
     * @generated
     */
    EClass WORD_ENDING = eINSTANCE.getWordEnding();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DualEndingImpl <em>Dual Ending</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DualEndingImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDualEnding()
     * @generated
     */
    EClass DUAL_ENDING = eINSTANCE.getDualEnding();

    /**
     * The meta object literal for the '<em><b>Interfix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUAL_ENDING__INTERFIX = eINSTANCE.getDualEnding_Interfix();

    /**
     * The meta object literal for the '<em><b>Chars</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUAL_ENDING__CHARS = eINSTANCE.getDualEnding_Chars();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DualCharsImpl <em>Dual Chars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DualCharsImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDualChars()
     * @generated
     */
    EClass DUAL_CHARS = eINSTANCE.getDualChars();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUAL_CHARS__NAME = eINSTANCE.getDualChars_Name();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PluralCharsImpl <em>Plural Chars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PluralCharsImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPluralChars()
     * @generated
     */
    EClass PLURAL_CHARS = eINSTANCE.getPluralChars();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLURAL_CHARS__NAME = eINSTANCE.getPluralChars_Name();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PluralEndingImpl <em>Plural Ending</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PluralEndingImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPluralEnding()
     * @generated
     */
    EClass PLURAL_ENDING = eINSTANCE.getPluralEnding();

    /**
     * The meta object literal for the '<em><b>Interfix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLURAL_ENDING__INTERFIX = eINSTANCE.getPluralEnding_Interfix();

    /**
     * The meta object literal for the '<em><b>Chars</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLURAL_ENDING__CHARS = eINSTANCE.getPluralEnding_Chars();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionEdingImpl <em>Interfix Flexion Eding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionEdingImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixFlexionEding()
     * @generated
     */
    EClass INTERFIX_FLEXION_EDING = eINSTANCE.getInterfixFlexionEding();

    /**
     * The meta object literal for the '<em><b>Interfix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFIX_FLEXION_EDING__INTERFIX = eINSTANCE.getInterfixFlexionEding_Interfix();

    /**
     * The meta object literal for the '<em><b>Chars</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFIX_FLEXION_EDING__CHARS = eINSTANCE.getInterfixFlexionEding_Chars();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalEndingImpl <em>Interfix Lexical Ending</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalEndingImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixLexicalEnding()
     * @generated
     */
    EClass INTERFIX_LEXICAL_ENDING = eINSTANCE.getInterfixLexicalEnding();

    /**
     * The meta object literal for the '<em><b>Interfix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFIX_LEXICAL_ENDING__INTERFIX = eINSTANCE.getInterfixLexicalEnding_Interfix();

    /**
     * The meta object literal for the '<em><b>Chars</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFIX_LEXICAL_ENDING__CHARS = eINSTANCE.getInterfixLexicalEnding_Chars();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordMiddleImpl <em>Word Middle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.WordMiddleImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getWordMiddle()
     * @generated
     */
    EClass WORD_MIDDLE = eINSTANCE.getWordMiddle();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.CharsImpl <em>Chars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.CharsImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getChars()
     * @generated
     */
    EClass CHARS = eINSTANCE.getChars();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARS__NAME = eINSTANCE.getChars_Name();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.SuffixCharsImpl <em>Suffix Chars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.SuffixCharsImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getSuffixChars()
     * @generated
     */
    EClass SUFFIX_CHARS = eINSTANCE.getSuffixChars();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUFFIX_CHARS__NAME = eINSTANCE.getSuffixChars_Name();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixImpl <em>Interfix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfix()
     * @generated
     */
    EClass INTERFIX = eINSTANCE.getInterfix();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalImpl <em>Interfix Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixLexical()
     * @generated
     */
    EClass INTERFIX_LEXICAL = eINSTANCE.getInterfixLexical();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionImpl <em>Interfix Flexion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixFlexionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixFlexion()
     * @generated
     */
    EClass INTERFIX_FLEXION = eINSTANCE.getInterfixFlexion();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixSuffixPronomLexicalImpl <em>Interfix Suffix Pronom Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixSuffixPronomLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixSuffixPronomLexical()
     * @generated
     */
    EClass INTERFIX_SUFFIX_PRONOM_LEXICAL = eINSTANCE.getInterfixSuffixPronomLexical();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixNonLexicalImpl <em>Interfix Prefix Non Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixNonLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPrefixNonLexical()
     * @generated
     */
    EClass INTERFIX_PREFIX_NON_LEXICAL = eINSTANCE.getInterfixPrefixNonLexical();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixLexicalImpl <em>Interfix Prefix Lexical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixPrefixLexicalImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixPrefixLexical()
     * @generated
     */
    EClass INTERFIX_PREFIX_LEXICAL = eINSTANCE.getInterfixPrefixLexical();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixConnectionSyllabicGroupImpl <em>Interfix Connection Syllabic Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.InterfixConnectionSyllabicGroupImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getInterfixConnectionSyllabicGroup()
     * @generated
     */
    EClass INTERFIX_CONNECTION_SYLLABIC_GROUP = eINSTANCE.getInterfixConnectionSyllabicGroup();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.BracketsImpl <em>Brackets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.BracketsImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getBrackets()
     * @generated
     */
    EClass BRACKETS = eINSTANCE.getBrackets();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoCartoucheImpl <em>No Cartouche</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoCartoucheImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoCartouche()
     * @generated
     */
    EClass NO_CARTOUCHE = eINSTANCE.getNoCartouche();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedImpl <em>Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getExpanded()
     * @generated
     */
    EClass EXPANDED = eINSTANCE.getExpanded();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPANDED__WCHAR = eINSTANCE.getExpanded_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedImpl <em>No Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoExpanded()
     * @generated
     */
    EClass NO_EXPANDED = eINSTANCE.getNoExpanded();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationImpl <em>Emendation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EmendationImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getEmendation()
     * @generated
     */
    EClass EMENDATION = eINSTANCE.getEmendation();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMENDATION__WCHAR = eINSTANCE.getEmendation_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoEmendationImpl <em>No Emendation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoEmendationImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoEmendation()
     * @generated
     */
    EClass NO_EMENDATION = eINSTANCE.getNoEmendation();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableReadingImpl <em>Disputable Reading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DisputableReadingImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDisputableReading()
     * @generated
     */
    EClass DISPUTABLE_READING = eINSTANCE.getDisputableReading();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISPUTABLE_READING__WCHAR = eINSTANCE.getDisputableReading_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDisputableReadingImpl <em>No Disputable Reading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDisputableReadingImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoDisputableReading()
     * @generated
     */
    EClass NO_DISPUTABLE_READING = eINSTANCE.getNoDisputableReading();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl <em>Lacuna</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.LacunaImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getLacuna()
     * @generated
     */
    EClass LACUNA = eINSTANCE.getLacuna();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LACUNA__WCHAR = eINSTANCE.getLacuna_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoLacunaImpl <em>No Lacuna</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoLacunaImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoLacuna()
     * @generated
     */
    EClass NO_LACUNA = eINSTANCE.getNoLacuna();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletionImpl <em>Deletion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DeletionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDeletion()
     * @generated
     */
    EClass DELETION = eINSTANCE.getDeletion();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETION__WCHAR = eINSTANCE.getDeletion_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDeletionImpl <em>No Deletion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoDeletionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoDeletion()
     * @generated
     */
    EClass NO_DELETION = eINSTANCE.getNoDeletion();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedColumnImpl <em>Expanded Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.ExpandedColumnImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getExpandedColumn()
     * @generated
     */
    EClass EXPANDED_COLUMN = eINSTANCE.getExpandedColumn();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPANDED_COLUMN__WCHAR = eINSTANCE.getExpandedColumn_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedColumnImpl <em>No Expanded Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoExpandedColumnImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoExpandedColumn()
     * @generated
     */
    EClass NO_EXPANDED_COLUMN = eINSTANCE.getNoExpandedColumn();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurImpl <em>Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RasurImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRasur()
     * @generated
     */
    EClass RASUR = eINSTANCE.getRasur();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RASUR__WCHAR = eINSTANCE.getRasur_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRasurImpl <em>No Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRasurImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoRasur()
     * @generated
     */
    EClass NO_RASUR = eINSTANCE.getNoRasur();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedImpl <em>Ancient Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.AncientExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getAncientExpanded()
     * @generated
     */
    EClass ANCIENT_EXPANDED = eINSTANCE.getAncientExpanded();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCIENT_EXPANDED__WCHAR = eINSTANCE.getAncientExpanded_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoAncientExpandedImpl <em>No Ancient Expanded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoAncientExpandedImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoAncientExpanded()
     * @generated
     */
    EClass NO_ANCIENT_EXPANDED = eINSTANCE.getNoAncientExpanded();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurImpl <em>Restoration Over Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.RestorationOverRasurImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getRestorationOverRasur()
     * @generated
     */
    EClass RESTORATION_OVER_RASUR = eINSTANCE.getRestorationOverRasur();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTORATION_OVER_RASUR__WCHAR = eINSTANCE.getRestorationOverRasur_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRestorationOverRasurImpl <em>No Restoration Over Rasur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoRestorationOverRasurImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoRestorationOverRasur()
     * @generated
     */
    EClass NO_RESTORATION_OVER_RASUR = eINSTANCE.getNoRestorationOverRasur();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestructionImpl <em>Partial Destruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.PartialDestructionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getPartialDestruction()
     * @generated
     */
    EClass PARTIAL_DESTRUCTION = eINSTANCE.getPartialDestruction();

    /**
     * The meta object literal for the '<em><b>WChar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTIAL_DESTRUCTION__WCHAR = eINSTANCE.getPartialDestruction_WChar();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoPartialDestructionImpl <em>No Partial Destruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.NoPartialDestructionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getNoPartialDestruction()
     * @generated
     */
    EClass NO_PARTIAL_DESTRUCTION = eINSTANCE.getNoPartialDestruction();

    /**
     * The meta object literal for the '{@link org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestructionImpl <em>Destruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.DestructionImpl
     * @see org.bbaw.bts.corpus.text.egy.egyDsl.impl.EgyDslPackageImpl#getDestruction()
     * @generated
     */
    EClass DESTRUCTION = eINSTANCE.getDestruction();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESTRUCTION__COMMENT = eINSTANCE.getDestruction_Comment();

  }

} //EgyDslPackage
