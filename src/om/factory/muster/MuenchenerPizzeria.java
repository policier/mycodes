package om.factory.muster;

import om.factory.muster.abtracts.Pizza;
import om.factory.muster.abtracts.Pizzeria;
import om.factory.muster.interfaces.PizzaZutatenFabrik;

public class MuenchenerPizzeria extends Pizzeria {
	Pizza pizza =null;
	public Pizza erstellePizza(String element){
		PizzaZutatenFabrik zutatenFabrik = new MuenchenerPizzaZutatenFabrik();
		
		
		if(element.equals("Salami")){
			pizza = new MuenchenerSalamiPizza(zutatenFabrik);
			pizza.setName("Salami Muenchener Art");
		}
		return pizza;
	}

}
