package om.factory.muster.abtracts;

public abstract class Pizzeria {
	
	public Pizza bestellePizza(String typ){
		Pizza pizza = erstellePizza(typ);
		pizza.vorbereiten();
		pizza.backen();
		pizza.schneiden();
		pizza.verpacke();
		return pizza;
		
	}
    public abstract Pizza erstellePizza(String element);
}
