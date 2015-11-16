package src.edu.iut.app;

public interface IApplicationLog {
	public void setMessage(String message);
	public String getMessage();
	public void addListener(IApplicationLogListener listener);
	IApplicationLogListener[] getpplicationLogListeners() ;

}
