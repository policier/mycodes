package om.command.muster;

import om.command.muster.interfaces.Befehl;

public class LichtAnBefehl implements Befehl{
     Licht licht  =new Licht("Garage");
     
    public LichtAnBefehl (Licht licht) {
    	this.licht=licht;
    }
	public void ausf�hren() {
		// TODO Auto-generated method stub
		licht.ein();		
	}
	
	public void rueckguangig(){
		licht.aus();
	}

}
