package om.strategy.muster;

import om.strategie.muster.fliegenverhalten.FliegGarNicht;
import om.strategie.muster.quakverhalten.Quaken;

public class ModellEnte extends Ente{
	public ModellEnte() {
		// TODO Auto-generated constructor stub
		flugVerhalten= new FliegGarNicht();
		quakVerhalten = new Quaken();
	}
	
	public void anzeige(){
		System.out.println("Ich bin eine Midellente");
	}
}
