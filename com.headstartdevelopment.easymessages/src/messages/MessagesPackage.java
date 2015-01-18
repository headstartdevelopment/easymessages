/**
 */
package messages;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see messages.MessagesFactory
 * @model kind="package"
 * @generated
 */
public interface MessagesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "messages";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com/headstartdevelopment/easymessages/messages";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.headstartdevelopment.easymessages.messages";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessagesPackage eINSTANCE = messages.impl.MessagesPackageImpl.init();

	/**
	 * The meta object id for the '{@link messages.impl.MessageManagementImpl <em>Message Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see messages.impl.MessageManagementImpl
	 * @see messages.impl.MessagesPackageImpl#getMessageManagement()
	 * @generated
	 */
	int MESSAGE_MANAGEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MANAGEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MANAGEMENT__MESSAGES = 1;

	/**
	 * The feature id for the '<em><b>Locales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MANAGEMENT__LOCALES = 2;

	/**
	 * The number of structural features of the '<em>Message Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MANAGEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MANAGEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link messages.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see messages.impl.MessageImpl
	 * @see messages.impl.MessagesPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = 0;

	/**
	 * The feature id for the '<em><b>Localized Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__LOCALIZED_TEXTS = 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link messages.impl.LocalizedTextImpl <em>Localized Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see messages.impl.LocalizedTextImpl
	 * @see messages.impl.MessagesPackageImpl#getLocalizedText()
	 * @generated
	 */
	int LOCALIZED_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT__LOCALE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Localized Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Localized Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link messages.impl.LocaleImpl <em>Locale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see messages.impl.LocaleImpl
	 * @see messages.impl.MessagesPackageImpl#getLocale()
	 * @generated
	 */
	int LOCALE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE__ID = 0;

	/**
	 * The feature id for the '<em><b>Localized Texts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE__LOCALIZED_TEXTS = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE__CODE = 2;

	/**
	 * The number of structural features of the '<em>Locale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Locale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link messages.MessageManagement <em>Message Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Management</em>'.
	 * @see messages.MessageManagement
	 * @generated
	 */
	EClass getMessageManagement();

	/**
	 * Returns the meta object for the attribute '{@link messages.MessageManagement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see messages.MessageManagement#getId()
	 * @see #getMessageManagement()
	 * @generated
	 */
	EAttribute getMessageManagement_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link messages.MessageManagement#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see messages.MessageManagement#getMessages()
	 * @see #getMessageManagement()
	 * @generated
	 */
	EReference getMessageManagement_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link messages.MessageManagement#getLocales <em>Locales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locales</em>'.
	 * @see messages.MessageManagement#getLocales()
	 * @see #getMessageManagement()
	 * @generated
	 */
	EReference getMessageManagement_Locales();

	/**
	 * Returns the meta object for class '{@link messages.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see messages.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link messages.Message#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see messages.Message#getId()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link messages.Message#getLocalizedTexts <em>Localized Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized Texts</em>'.
	 * @see messages.Message#getLocalizedTexts()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_LocalizedTexts();

	/**
	 * Returns the meta object for class '{@link messages.LocalizedText <em>Localized Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localized Text</em>'.
	 * @see messages.LocalizedText
	 * @generated
	 */
	EClass getLocalizedText();

	/**
	 * Returns the meta object for the attribute '{@link messages.LocalizedText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see messages.LocalizedText#getText()
	 * @see #getLocalizedText()
	 * @generated
	 */
	EAttribute getLocalizedText_Text();

	/**
	 * Returns the meta object for the reference '{@link messages.LocalizedText#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Locale</em>'.
	 * @see messages.LocalizedText#getLocale()
	 * @see #getLocalizedText()
	 * @generated
	 */
	EReference getLocalizedText_Locale();

	/**
	 * Returns the meta object for the container reference '{@link messages.LocalizedText#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Message</em>'.
	 * @see messages.LocalizedText#getMessage()
	 * @see #getLocalizedText()
	 * @generated
	 */
	EReference getLocalizedText_Message();

	/**
	 * Returns the meta object for class '{@link messages.Locale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locale</em>'.
	 * @see messages.Locale
	 * @generated
	 */
	EClass getLocale();

	/**
	 * Returns the meta object for the attribute '{@link messages.Locale#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see messages.Locale#getId()
	 * @see #getLocale()
	 * @generated
	 */
	EAttribute getLocale_Id();

	/**
	 * Returns the meta object for the reference list '{@link messages.Locale#getLocalizedTexts <em>Localized Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Localized Texts</em>'.
	 * @see messages.Locale#getLocalizedTexts()
	 * @see #getLocale()
	 * @generated
	 */
	EReference getLocale_LocalizedTexts();

	/**
	 * Returns the meta object for the attribute '{@link messages.Locale#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see messages.Locale#getCode()
	 * @see #getLocale()
	 * @generated
	 */
	EAttribute getLocale_Code();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MessagesFactory getMessagesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link messages.impl.MessageManagementImpl <em>Message Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see messages.impl.MessageManagementImpl
		 * @see messages.impl.MessagesPackageImpl#getMessageManagement()
		 * @generated
		 */
		EClass MESSAGE_MANAGEMENT = eINSTANCE.getMessageManagement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_MANAGEMENT__ID = eINSTANCE.getMessageManagement_Id();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_MANAGEMENT__MESSAGES = eINSTANCE.getMessageManagement_Messages();

		/**
		 * The meta object literal for the '<em><b>Locales</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_MANAGEMENT__LOCALES = eINSTANCE.getMessageManagement_Locales();

		/**
		 * The meta object literal for the '{@link messages.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see messages.impl.MessageImpl
		 * @see messages.impl.MessagesPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__ID = eINSTANCE.getMessage_Id();

		/**
		 * The meta object literal for the '<em><b>Localized Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__LOCALIZED_TEXTS = eINSTANCE.getMessage_LocalizedTexts();

		/**
		 * The meta object literal for the '{@link messages.impl.LocalizedTextImpl <em>Localized Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see messages.impl.LocalizedTextImpl
		 * @see messages.impl.MessagesPackageImpl#getLocalizedText()
		 * @generated
		 */
		EClass LOCALIZED_TEXT = eINSTANCE.getLocalizedText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALIZED_TEXT__TEXT = eINSTANCE.getLocalizedText_Text();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALIZED_TEXT__LOCALE = eINSTANCE.getLocalizedText_Locale();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALIZED_TEXT__MESSAGE = eINSTANCE.getLocalizedText_Message();

		/**
		 * The meta object literal for the '{@link messages.impl.LocaleImpl <em>Locale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see messages.impl.LocaleImpl
		 * @see messages.impl.MessagesPackageImpl#getLocale()
		 * @generated
		 */
		EClass LOCALE = eINSTANCE.getLocale();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE__ID = eINSTANCE.getLocale_Id();

		/**
		 * The meta object literal for the '<em><b>Localized Texts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALE__LOCALIZED_TEXTS = eINSTANCE.getLocale_LocalizedTexts();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE__CODE = eINSTANCE.getLocale_Code();

	}

} //MessagesPackage
