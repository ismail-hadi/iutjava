package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationSession {
	
	// Exercice 1 : Gérer l'internationation
	protected /* Objet permettant la gestion des 'resources bundle' */ ResourceBundle resourceBundle;
	protected /* Objet permettant la gestion des Locales */ Locale locale;
	
	// Exercice 2 : Logger
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;


	private /*Qu'est ce qu'un singleton ?*/ static ApplicationSession session = null;
	private ApplicationSession() {
		/* Definir US comme locale par défaut */
		Locale.setDefault(Locale.US); 
		
		locale = Locale.getDefault();
		resourceBundle = ResourceBundle.getBundle("edu.iut.app.ApplicationSession");	/* à compléter */
		sessionGuiLogger = session.getGUILogger();/* Initialiser le logger */
		sessionGuiLogger.setLevel(Level.ALL);/* Tous les message doivent etre affich�s */
		sessionExceptionLogger = session.getExceptionLogger(); /* Logger pour exception */
		sessionExceptionLogger.setLevel(Level.ALL);/* Touls les message doivent être affiché */
	}
	
	
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle= ResourceBundle.getBundle("edu.iut.app.ApplicationSession");/* recuperer les resources */
	}
	
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	
	
}
