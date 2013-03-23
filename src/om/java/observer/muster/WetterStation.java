package om.java.observer.muster;


public class WetterStation {
	
	public static void main(String[] args) {
		WetterDaten wetterDaten = new WetterDaten();
//		Registrieren des Beobachters
        AktuelleBedingungenAnzeige aktuelleAnzeige = new  AktuelleBedingungenAnzeige(wetterDaten);
		wetterDaten.setMesswerte(30, 63, 30.4f);
		
		
	}

}
