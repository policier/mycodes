package om.command.muster;

public class StereoAnlage {
	String cd;
	String dvd;
	String radio;
	String staeke;
	String name;
	
	public StereoAnlage(String name){
		this.name= name;
		
	}
	public void ein(){
		System.out.println("StereoAnlage ist in"+name+"an");
	}
	public void aud (){
		System.out.println("StereoAnlage ist"+name+" aus");
	}
	
	public void setCD(String cd){
		this.cd =cd;
	}
	public void setDvd(String dvd){
		this.dvd= dvd;
	}
	public void setRadio(String radio){
		this.radio =radio;
	}
	public void setStaeke(String staeke){
		this.staeke =staeke;
	}

}
