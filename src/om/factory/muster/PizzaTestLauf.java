package om.factory.muster;

import om.factory.muster.abtracts.Pizza;
import om.factory.muster.abtracts.Pizzeria;

public class PizzaTestLauf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizzeria berlinerPizzeria = new BerlinerPizzeria();
		Pizzeria muenchenerPizzeria = new MuenchenerPizzeria();
		Pizza pizza = berlinerPizzeria.bestellePizza("Salami");
		System.out.println("Ben hat eine "+ pizza.getName() +"bestell\n");
		
		 pizza = muenchenerPizzeria.bestellePizza("Salami");
		System.out.println("Tassilo hat eine "+ pizza.getName() +"bestell\n");
		
		

	}

}
