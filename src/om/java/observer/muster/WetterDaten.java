package om.java.observer.muster;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;
import java.util.Observable;


public class WetterDaten  extends Observable{


	private float temperatur;
	private float feuchtigkeit;
	private float luftdruckt;
	
	public float getTemperatur() {
		return temperatur;
	}

	public float getFeuchtigkeit() {
		return feuchtigkeit;
	}
	public float getLuftdruckt() {
		return luftdruckt;
	}
	
	public WetterDaten(){
//		beobachter= new ArrayList();
		
	}	
	
	public void messwertGeeandert(){
		setChanged();
		notifyObservers();
	}
	
	public void setMesswerte(float temp, float feucht, float druck){
		this.temperatur=temp;
		this.feuchtigkeit=feucht;
		this.luftdruckt=druck;
		messwertGeeandert();
			
	}

}
