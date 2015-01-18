/**
 */
package messages.impl;

import java.util.Collection;
import messages.Locale;
import messages.Message;
import messages.MessageManagement;
import messages.MessagesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link messages.impl.MessageManagementImpl#getId <em>Id</em>}</li>
 *   <li>{@link messages.impl.MessageManagementImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link messages.impl.MessageManagementImpl#getLocales <em>Locales</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageManagementImpl extends MinimalEObjectImpl.Container implements MessageManagement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * The cached value of the '{@link #getLocales() <em>Locales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocales()
	 * @generated
	 * @ordered
	 */
	protected EList<Locale> locales;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MessagesPackage.Literals.MESSAGE_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MESSAGE_MANAGEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<Message>(Message.class, this, MessagesPackage.MESSAGE_MANAGEMENT__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Locale> getLocales() {
		if (locales == null) {
			locales = new EObjectContainmentEList<Locale>(Locale.class, this, MessagesPackage.MESSAGE_MANAGEMENT__LOCALES);
		}
		return locales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MessagesPackage.MESSAGE_MANAGEMENT__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
			case MessagesPackage.MESSAGE_MANAGEMENT__LOCALES:
				return ((InternalEList<?>)getLocales()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MessagesPackage.MESSAGE_MANAGEMENT__ID:
				return getId();
			case MessagesPackage.MESSAGE_MANAGEMENT__MESSAGES:
				return getMessages();
			case MessagesPackage.MESSAGE_MANAGEMENT__LOCALES:
				return getLocales();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MessagesPackage.MESSAGE_MANAGEMENT__ID:
				setId((String)newValue);
				return;
			case MessagesPackage.MESSAGE_MANAGEMENT__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends Message>)newValue);
				return;
			case MessagesPackage.MESSAGE_MANAGEMENT__LOCALES:
				getLocales().clear();
				getLocales().addAll((Collection<? extends Locale>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MessagesPackage.MESSAGE_MANAGEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case MessagesPackage.MESSAGE_MANAGEMENT__MESSAGES:
				getMessages().clear();
				return;
			case MessagesPackage.MESSAGE_MANAGEMENT__LOCALES:
				getLocales().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MessagesPackage.MESSAGE_MANAGEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MessagesPackage.MESSAGE_MANAGEMENT__MESSAGES:
				return messages != null && !messages.isEmpty();
			case MessagesPackage.MESSAGE_MANAGEMENT__LOCALES:
				return locales != null && !locales.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //MessageManagementImpl
