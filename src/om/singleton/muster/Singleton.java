package om.singleton.muster;

public class Singleton {
	private static Singleton einzigerInstanz;
	private Singleton(){
		
	}
	public static Singleton getInstanz(){
		if(einzigerInstanz == null){
			einzigerInstanz= new Singleton();
		}
		return einzigerInstanz;
	}

}
