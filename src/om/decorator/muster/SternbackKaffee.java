package om.decorator.muster;

import om.decorator.muster.abstracts.Getraenk;


public class SternbackKaffee {
	public static void main(String[] args) {
		 Getraenk getraenk = new Erpresso();
		 System.out.println(getraenk.getBescheibung() + ""+getraenk.preis() + "Euro"); 
		 
		 Getraenk getraenk2 = new Hausmischung();
		 getraenk2 = new Schoko(getraenk2);
		 System.out.println(getraenk2.getBescheibung() + ""+getraenk2.preis() + "Euro"); 
		
	}

}
