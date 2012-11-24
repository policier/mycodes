package om.observer.muster;

import om.observer.muster.interfaces.AnzeigeElement;
import om.observer.muster.interfaces.Beobachter;
import om.observer.muster.interfaces.Subjekt;

public class AktuelleBedingungenAnzeige implements Beobachter, AnzeigeElement {
	private float temperatur;
	private float feuchtigkeit;
	private Subjekt wetterDaten;
	
	public AktuelleBedingungenAnzeige (Subjekt wetterDaten){
		this.wetterDaten=wetterDaten;
		wetterDaten.registriereBeobachter(this);		
	}
	
	public void aktualisieren(float temp, float feucht, float druck){
		this.temperatur=temp;
		this.feuchtigkeit=feucht;
		anzeigen();
	}
	public void anzeigen(){
		System.out.println("Aktuelle Wetterbedingungen "+temperatur+" Grab C und "+ feuchtigkeit + "% feuchtigkeit");
	}

}
