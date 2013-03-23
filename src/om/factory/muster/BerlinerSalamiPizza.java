package om.factory.muster;

import om.factory.muster.abtracts.Pizza;
import om.factory.muster.interfaces.PizzaZutatenFabrik;

public class BerlinerSalamiPizza  extends Pizza{
	PizzaZutatenFabrik zutatenFabrik;
	
	public BerlinerSalamiPizza(PizzaZutatenFabrik zutatenFabrik){
		this.zutatenFabrik = zutatenFabrik;		
	}
	public void vorbereiten(){
		System.out.println("Mache " +getName());
		teig =zutatenFabrik.erstelleTeig();
		soﬂe=zutatenFabrik.erstelleSoﬂe();
		salami=zutatenFabrik.erstelleSalami();
		kaese=zutatenFabrik.erstelleKease();
	}

}
