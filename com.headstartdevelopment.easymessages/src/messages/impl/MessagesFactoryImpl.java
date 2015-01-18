/**
 */
package messages.impl;

import messages.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessagesFactoryImpl extends EFactoryImpl implements MessagesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessagesFactory init() {
		try {
			MessagesFactory theMessagesFactory = (MessagesFactory)EPackage.Registry.INSTANCE.getEFactory(MessagesPackage.eNS_URI);
			if (theMessagesFactory != null) {
				return theMessagesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MessagesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MessagesPackage.MESSAGE_MANAGEMENT: return createMessageManagement();
			case MessagesPackage.MESSAGE: return createMessage();
			case MessagesPackage.LOCALIZED_TEXT: return createLocalizedText();
			case MessagesPackage.LOCALE: return createLocale();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageManagement createMessageManagement() {
		MessageManagementImpl messageManagement = new MessageManagementImpl();
		return messageManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedText createLocalizedText() {
		LocalizedTextImpl localizedText = new LocalizedTextImpl();
		return localizedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locale createLocale() {
		LocaleImpl locale = new LocaleImpl();
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagesPackage getMessagesPackage() {
		return (MessagesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MessagesPackage getPackage() {
		return MessagesPackage.eINSTANCE;
	}

} //MessagesFactoryImpl
