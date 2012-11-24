package om.observer.muster.interfaces;

public interface Subjekt {
	public void registriereBeobachter(Beobachter b);
	public void entferneBeobachter(Beobachter b);
	public void benachrichtigeBeobachter();

}
