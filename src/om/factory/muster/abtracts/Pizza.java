package om.factory.muster.abtracts;



import om.factory.muster.interfaces.Kaese;
import om.factory.muster.interfaces.Krabben;
import om.factory.muster.interfaces.Salami;
import om.factory.muster.interfaces.Soﬂe;
import om.factory.muster.interfaces.Teig;
import om.factory.muster.interfaces.Thunfisch;


public abstract class Pizza {
	String name;
	protected Teig teig;
	protected Soﬂe soﬂe;
	protected Salami salami;
	protected Kaese kaese;
	protected Thunfisch thunfisch;
	protected Krabben krabben;
	
	
	public abstract void vorbereiten();
	void backen(){
		System.out.println("Backe 25 Minuten bei 350 Grad");
	}
	
	
	
	public void schneiden(){
		System.out.println("Schneide die Pizza diagonal in Str¸cke");
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
	public void setSoﬂe(Soﬂe soﬂe) {
		this.soﬂe = soﬂe;
	}
	public Soﬂe getSoﬂe() {
		return soﬂe;
	}
	
}
