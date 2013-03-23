package om.factory.muster;

import om.factory.muster.interfaces.Kaese;
import om.factory.muster.interfaces.Krabben;
import om.factory.muster.interfaces.PizzaZutatenFabrik;
import om.factory.muster.interfaces.Salami;
import om.factory.muster.interfaces.So�e;
import om.factory.muster.interfaces.Teig;
import om.factory.muster.interfaces.Thunfisch;


public class BerlinerPizzaZutatenFabrik implements PizzaZutatenFabrik{


	public Teig erstelleTeig() {	
		return new TeigMitDuennerKruste();
	}


	public So�e erstelleSo�e() {
		// TODO Auto-generated method stub
		return new MarinaraSo�e();
	}


	public Kaese erstelleKease() {
		// TODO Auto-generated method stub
		return new Parmesan();
	}


	public Salami erstelleSalami() {
		// TODO Auto-generated method stub
		return new SpanischeSalami();
	}


	public Gemuese[] erstelleGemuese() {
		// TODO Auto-generated method stub
		return null;
	}


	public Thunfisch erstelleThunfisch() {
		// TODO Auto-generated method stub
		return new ThunfischSteucke();
	}


	public Krabben erstelleKrabben() {
		// TODO Auto-generated method stub
		return  new FrischeKrabben();
	}

}
