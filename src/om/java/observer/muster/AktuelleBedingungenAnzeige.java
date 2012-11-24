package om.java.observer.muster;

import java.util.Observable;
import java.util.Observer;

import om.observer.muster.WetterStation;
import om.observer.muster.interfaces.AnzeigeElement;
import om.observer.muster.interfaces.Beobachter;
import om.observer.muster.interfaces.Subjekt;

public class AktuelleBedingungenAnzeige implements Observer, AnzeigeElement {
	Observable observable;
	private float temperatur;
	private float feuchtigkeit;
	private Subjekt wetterDaten;
	
	public AktuelleBedingungenAnzeige (Observable observable){
		this.observable=observable;
		observable.addObserver(this);		
	}
	
	public void update(Observable obs, Object args){
		if(obs instanceof WetterDaten){
			WetterDaten wetterdaten =(WetterDaten)obs;
			this.temperatur= wetterdaten.getTemperatur();
			this.feuchtigkeit= wetterdaten.getFeuchtigkeit();
			anzeigen();
		}
	}
	public void anzeigen(){
		System.out.println("Aktuelle Wetterbedingungen "+temperatur+" Grab C und "+ feuchtigkeit + "% feuchtigkeit");
	}

}
