package om.decorator.muster;

import om.decorator.muster.abstracts.Getraenk;
import om.decorator.muster.abstracts.ZutatDekoriere;

public class Schoko extends  ZutatDekoriere {
	Getraenk getraenk;
	
	public Schoko (Getraenk getraenk){
		this.getraenk = getraenk;
	}	

	public double preis(){
		return .20+ getraenk.preis();
	}


	public String getBescheibung() {
		// TODO Auto-generated method stub 	
		return getraenk.getBescheibung() + ", Schoko";
	}

}
