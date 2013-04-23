package om.command.muster;

import om.command.muster.interfaces.Befehl;

public class LichtAnBefehl implements Befehl{
     Licht licht  =new Licht();
     
    public LichtAnBefehl (Licht licht) {
    	this.licht=licht;
    }
	public void ausführen() {
		// TODO Auto-generated method stub
		licht.ein();		
	}

}
