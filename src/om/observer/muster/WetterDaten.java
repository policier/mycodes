package om.observer.muster;

import java.util.ArrayList;
import java.util.Iterator;

import om.observer.muster.interfaces.Beobachter;
import om.observer.muster.interfaces.Subjekt;

public class WetterDaten  implements Subjekt{
	private ArrayList <Beobachter> beobachter;
	private float temperatur;
	private float feuchtigkeit;
	private float luftdruckt;
	
	public WetterDaten(){
		beobachter= new ArrayList<Beobachter>() ;
		
	}
	
	
	
	public void registriereBeobachter(Beobachter b) {
		// TODO Auto-generated method stub
		
		beobachter.add(b);
	}
	
	
	public void entferneBeobachter(Beobachter b) {
		// TODO Auto-generated method stub
		int i = beobachter.indexOf(b);
		if(i>=0){
			beobachter.remove(i);
		}
	}
	
	public void benachrichtigeBeobachter() {
		// TODO Auto-generated method stub
		for (int i = 0; i < beobachter.size(); i++) {
			Beobachter b=(Beobachter)beobachter.get(i);
			b.aktualisieren(temperatur, feuchtigkeit, luftdruckt);
			
		}		
	}
	public void messwertGeeandert(){
		benachrichtigeBeobachter();
	}
	
	public void setMesswerte(float temp, float feucht, float druck){
		this.temperatur=temp;
		this.feuchtigkeit=feucht;
		this.luftdruckt=druck;
		messwertGeeandert();
			
	}

}
