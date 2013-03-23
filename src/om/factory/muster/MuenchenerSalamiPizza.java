package om.factory.muster;

import om.factory.muster.abtracts.Pizza;
import om.factory.muster.interfaces.PizzaZutatenFabrik;

public class MuenchenerSalamiPizza  extends Pizza{
PizzaZutatenFabrik zutatenFabrik;

	
	public MuenchenerSalamiPizza(PizzaZutatenFabrik zutatenFabrik){
		this.zutatenFabrik = zutatenFabrik;		
	}
	public void vorbereiten(){
		System.out.println("Mache " +getName());
		teig =zutatenFabrik.erstelleTeig();
		soße=zutatenFabrik.erstelleSoße();
		salami=zutatenFabrik.erstelleSalami();
		kaese=zutatenFabrik.erstelleKease();
	}
	public void schneiden(){
		System.out.println("Schneiden die Pizza in rechteckige Stücke");
	}


}
