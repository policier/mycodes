package om.strategy.muster;

import om.strategie.muster.fliegenverhalten.FliegtMitFluegel;
import om.strategie.muster.quakverhalten.Quaken;

public class StockEnte extends Ente {
	public StockEnte() {
		// TODO Auto-generated constructor stub
		quakVerhalten = new Quaken();
		flugVerhalten = new FliegtMitFluegel();
	}
	
	public void anzeige(){
		System.out.println("ich bin eine echte Stockende");
	}

}
