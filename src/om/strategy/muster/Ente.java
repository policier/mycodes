package om.strategy.muster;

import om.strategie.muster.fliegenverhalten.FlugVerhalten;
import om.strategie.muster.quakverhalten.QuakVerhalten;

public abstract class Ente {
	
	QuakVerhalten quakVerhalten;
	FlugVerhalten flugVerhalten;
	public Ente() {
		// TODO Auto-generated constructor stub
	}
	
	public void toFliegen(){
		flugVerhalten.fliegen();
	}
	public void toQuaken(){
		quakVerhalten.quaken();
	}
	
	public void schwimmen(){
		System.out.println("Alle Enten Schwimmen, auch Holzenten");
	}

	public void setQuakVerhalten(QuakVerhalten quakVerhalten) {
		this.quakVerhalten = quakVerhalten;
	}

	public void setFlugVerhalten(FlugVerhalten flugVerhalten) {
		this.flugVerhalten = flugVerhalten;
	}
}
