package om.factory.muster;

import om.factory.muster.abtracts.Pizza;
import om.factory.muster.abtracts.Pizzeria;
import om.factory.muster.interfaces.PizzaZutatenFabrik;

public class BerlinerPizzeria  extends Pizzeria{
	Pizza pizza =null;
	
	public Pizza erstellePizza(String element){
		PizzaZutatenFabrik zutatenFabrik = new BerlinerPizzaZutatenFabrik();
		if(element.equals("Salami")){
			pizza =new BerlinerSalamiPizza(zutatenFabrik);
			pizza.setName("Salami Berliner Art");
		}
		return pizza;
	}

}
