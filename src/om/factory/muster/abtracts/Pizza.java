package om.factory.muster.abtracts;



import om.factory.muster.interfaces.Kaese;
import om.factory.muster.interfaces.Krabben;
import om.factory.muster.interfaces.Salami;
import om.factory.muster.interfaces.So�e;
import om.factory.muster.interfaces.Teig;
import om.factory.muster.interfaces.Thunfisch;


public abstract class Pizza {
	String name;
	protected Teig teig;
	protected So�e so�e;
	protected Salami salami;
	protected Kaese kaese;
	protected Thunfisch thunfisch;
	protected Krabben krabben;
	
	
	public abstract void vorbereiten();
	void backen(){
		System.out.println("Backe 25 Minuten bei 350 Grad");
	}
	
	
	
	public void schneiden(){
		System.out.println("Schneide die Pizza diagonal in Str�cke");
	}
	
	void verpacke(){
		System.out.println("Packe die pizza in die offizielle Pizzeria-Schachteil");
	}
	public String getName() {
		return name;
	}
	public Teig getTeig() {
		return teig;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTeig(Teig teig) {
		this.teig = teig;
	}
	public void setSo�e(So�e so�e) {
		this.so�e = so�e;
	}
	public So�e getSo�e() {
		return so�e;
	}
	
}
