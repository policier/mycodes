package om.factory.muster.interfaces;

import om.factory.muster.Gemuese;


public interface PizzaZutatenFabrik {
	
	public Teig erstelleTeig();
	public Soﬂe erstelleSoﬂe();
	public Kaese erstelleKease();
	public Salami erstelleSalami();
	public Gemuese [] erstelleGemuese();
	public Thunfisch erstelleThunfisch();
	public Krabben erstelleKrabben();
	

}
