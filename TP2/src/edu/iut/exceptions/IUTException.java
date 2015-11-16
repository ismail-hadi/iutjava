package edu.iut.exceptions;

import edu.iut.app.ApplicationSession;

// Exercice 2 
public class IUTException extends Exception /* Etendre les exceptions */{
	public IUTException() {
		super();
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe("Empty");
		// Logger une erreur avec le message empty en utilisant le singleton session, ie le logger défini dans la session */

	}
	public IUTException(IUTException e) {
		super (e);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(e.getMessage());
		// Logger une erreur avec le message contenu dans 'e'  en utilisant le singleton session, ie le logger défini dans la session */
	}
	public IUTException(String message) {
		super(message);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(message);
		// Logger une erreur avec le message contenu dans 'message'  en utilisant le singleton session, ie le logger défini dans la session */
	}
	
}
