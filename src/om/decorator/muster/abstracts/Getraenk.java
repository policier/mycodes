package om.decorator.muster.abstracts;

public  abstract class Getraenk {
	
	private String beschreibung = "unbekanntes Getr�nk";

	public String getBescheibung() {
		return getBeschreibung();
	}
	
	public abstract double preis(  );

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	

}
