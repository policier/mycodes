package om.command.muster;

import om.command.muster.interfaces.Befehl;

public class StereoAnlageAnMitCD   implements Befehl{
	StereoAnlage stereo;
	
	public StereoAnlageAnMitCD(StereoAnlage stereo){
		this.stereo= stereo;		
	}
	
	public void ausf�hren(){
		stereo.ein();
		stereo.setCD("Rihanna");
		stereo.setStaeke("11");
	}
	
	public void rueckguangig(){
//		licht.aus();
	}

}
