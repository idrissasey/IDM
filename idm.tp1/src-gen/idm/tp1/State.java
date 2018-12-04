/**
 */
package idm.tp1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.tp1.State#getOutcoming <em>Outcoming</em>}</li>
 *   <li>{@link idm.tp1.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link idm.tp1.State#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see idm.tp1.Tp1Package#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Outcoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link idm.tp1.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcoming</em>' reference.
	 * @see #setOutcoming(Transition)
	 * @see idm.tp1.Tp1Package#getState_Outcoming()
	 * @see idm.tp1.Transition#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	Transition getOutcoming();

	/**
	 * Sets the value of the '{@link idm.tp1.State#getOutcoming <em>Outcoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcoming</em>' reference.
	 * @see #getOutcoming()
	 * @generated
	 */
	void setOutcoming(Transition value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link idm.tp1.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(Transition)
	 * @see idm.tp1.Tp1Package#getState_Incoming()
	 * @see idm.tp1.Transition#getTo
	 * @model opposite="to"
	 * @generated
	 */
	Transition getIncoming();

	/**
	 * Sets the value of the '{@link idm.tp1.State#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(Transition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see idm.tp1.Tp1Package#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link idm.tp1.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // State