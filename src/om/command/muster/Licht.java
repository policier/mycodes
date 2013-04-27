package om.command.muster;

public class Licht {
	String name;
	
	public Licht (String name){
		this.name=name;
	}
	
	public void ein(){
		System.out.println("Das licht ist "+name+" an");
	}
    
	public void aus(){
		System.out.println("Das licht ist "+name+" aus");
	} 
}
