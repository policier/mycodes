package om.decorator.muster;

import om.decorator.muster.abstracts.Getraenk;

public class Hausmischung extends Getraenk {
	
	public Hausmischung(){
		setBeschreibung("Hausmischung");
	}
	
	public double preis(){
		return .89;
		
	}

}
