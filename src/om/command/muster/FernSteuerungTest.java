package om.command.muster;

public class FernSteuerungTest {

	public static void main(String[] args) {
       EinfacheFernSteuerung fernSteuerung = new EinfacheFernSteuerung();
       Licht licht = new Licht();
       LichtAnBefehl lichtEin = new LichtAnBefehl(licht);
       fernSteuerung.setBefehl(lichtEin);
       fernSteuerung.knopfWurdeGedrückt();
	}

}
