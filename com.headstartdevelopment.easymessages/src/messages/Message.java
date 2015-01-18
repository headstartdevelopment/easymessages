/**
 */
package messages;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link messages.Message#getId <em>Id</em>}</li>
 *   <li>{@link messages.Message#getLocalizedTexts <em>Localized Texts</em>}</li>
 * </ul>
 * </p>
 *
 * @see messages.MessagesPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see messages.MessagesPackage#getMessage_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link messages.Message#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Localized Texts</b></em>' containment reference list.
	 * The list contents are of type {@link messages.LocalizedText}.
	 * It is bidirectional and its opposite is '{@link messages.LocalizedText#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localized Texts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localized Texts</em>' containment reference list.
	 * @see messages.MessagesPackage#getMessage_LocalizedTexts()
	 * @see messages.LocalizedText#getMessage
	 * @model opposite="message" containment="true"
	 * @generated
	 */
	EList<LocalizedText> getLocalizedTexts();

} // Message
