package om.strategy.muster;

import om.strategie.muster.fliegenverhalten.FliegtReketenGetrieben;

public class main {
	
	public static void main(String[] args) {
		Ente mallard= new StockEnte();
		mallard.toQuaken();
		mallard.toFliegen();
		Ente modell= new ModellEnte();
		modell.toFliegen();
		modell.setFlugVerhalten(new FliegtReketenGetrieben());
		modell.toFliegen();
	}

}
