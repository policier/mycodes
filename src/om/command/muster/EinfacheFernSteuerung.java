package om.command.muster;

import om.command.muster.interfaces.Befehl;

public class EinfacheFernSteuerung {
	Befehl  platz;
	public EinfacheFernSteuerung(){}
	public void setBefehl(Befehl befehl){
		platz=befehl;
	}
	public void knopfWurdeGedrückt(){  
		platz.ausführen();
	}

}
