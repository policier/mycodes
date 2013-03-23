package om.decorator.muster;

import om.decorator.muster.abstracts.Getraenk;

public class Erpresso extends Getraenk {
	
	public Erpresso(){
		setBeschreibung("Espresso");
	}
	
	public double preis(){
		return 1.99;
		
	}

}
