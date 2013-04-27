package om.command.muster;

public class FernSteuerungTest {

	public static void main(String[] args) {
       EinfacheFernSteuerung fernSteuerung = new EinfacheFernSteuerung();
       Licht licht = new Licht("Garage");
       LichtAnBefehl lichtEin = new LichtAnBefehl(licht);
       fernSteuerung.setBefehl(lichtEin);
       fernSteuerung.knopfWurdeGedrückt();
	}

}
