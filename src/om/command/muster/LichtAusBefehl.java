package om.command.muster;

import om.command.muster.interfaces.Befehl;

public class LichtAusBefehl implements Befehl {
	Licht licht;
	
	public LichtAusBefehl(Licht licht){
		this.licht= licht;
	}
    
	public void ausf�hren(){
		licht.aus();
	}
	
	public void rueckguangig(){
		licht.ein();
	}
}
