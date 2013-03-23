package om.factory.muster.interfaces;

import om.factory.muster.Gemuese;


public interface PizzaZutatenFabrik {
	
	public Teig erstelleTeig();
	public So�e erstelleSo�e();
	public Kaese erstelleKease();
	public Salami erstelleSalami();
	public Gemuese [] erstelleGemuese();
	public Thunfisch erstelleThunfisch();
	public Krabben erstelleKrabben();
	

}
