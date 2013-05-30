package om.command.muster;

public class FernsteuerungsLader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FernSteuerung fernSteuerung = new FernSteuerung();
		Licht wohnZimmerlicht = new Licht("Wohnzimmer");
		Licht kuechelicht = new Licht("K�che");
		StereoAnlage stereoAnlage = new StereoAnlage("Wohnzimmer");
		LichtAnBefehl wohnZimmerBeleuchtungAn = new LichtAnBefehl(wohnZimmerlicht);
		LichtAusBefehl wohnzimmerBeleuchtungAus = new LichtAusBefehl(wohnZimmerlicht);
		LichtAnBefehl  kuecheBeleuchtungAn = new LichtAnBefehl(kuechelicht);
		LichtAusBefehl  kuecheBeleuchtungAus = new LichtAusBefehl(kuechelicht);
//		StereoAnlageAnMitCD stereoAnlageAnFuerCd = new StereoAnlageAnMitCD(stereoAnlage);
		
		fernSteuerung.setBehehl(0, kuecheBeleuchtungAn, kuecheBeleuchtungAus);
		/*fernSteuerung.setBehehl(1, wohnZimmerBeleuchtungAn, wohnzimmerBeleuchtungAus);
		System.out.println(fernSteuerung);
		
		fernSteuerung.anKnopfWurdeGedr�ckt(0);
		fernSteuerung.ausKnopWurdeGedr�ckt(0);
		fernSteuerung.anKnopfWurdeGedr�ckt(1);
		fernSteuerung.ausKnopWurdeGedr�ckt(1);*/
	
		
		
		fernSteuerung.anKnopfWurdeGedr�ckt(0);
		fernSteuerung.ausKnopWurdeGedr�ckt(0);
		System.out.println(fernSteuerung);
		fernSteuerung.rueckguangigKnopfWuedeGedr�ckt();
		fernSteuerung.ausKnopWurdeGedr�ckt(0);
		fernSteuerung.anKnopfWurdeGedr�ckt(0);
		System.out.println(fernSteuerung);
		fernSteuerung.rueckguangigKnopfWuedeGedr�ckt();
		
		

	}

}
