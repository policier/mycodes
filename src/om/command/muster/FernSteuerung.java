package om.command.muster;

import om.command.muster.interfaces.Befehl;

public class FernSteuerung {
	public Befehl [] anBefehl;
    public Befehl [] ausBefehl;
    public Befehl rueckguangigBefehl;
    
    public FernSteuerung(){
    	anBefehl = new Befehl[7];
    	ausBefehl = new Befehl [7];    	
    	Befehl keinBefehl=new KeinBefehl();        
        for(int i = 0; i<7 ; i++){
        	anBefehl[i]= keinBefehl;
        	ausBefehl[i]= keinBefehl;
        } 
        rueckguangigBefehl= keinBefehl;
    }    
    public void setBehehl(int platz , Befehl anBefehl, Befehl ausBefehl){
    	this.anBefehl[platz]=anBefehl;
    	this.ausBefehl[platz]=ausBefehl;      	
    }
    
    public void anKnopfWurdeGedrückt(int platz){
    	anBefehl[platz].ausführen();  
    	rueckguangigBefehl=anBefehl[platz];
    }
    
    public void ausKnopWurdeGedrückt(int platz){
    	ausBefehl[platz].ausführen();
    	rueckguangigBefehl=ausBefehl[platz];

    }
    
    public void rueckguangigKnopfWuedeGedrückt(){
    	rueckguangigBefehl.rueckguangig();
    }
    public String toString(){
    	
    	StringBuffer stringBuff = new StringBuffer();
    	stringBuff.append("\n-------------Fernsteuerung--------------\n");
    	for (int i = 0; i < anBefehl.length; i++) {
    		stringBuff.append("[P"+i+"]"+anBefehl[i].getClass().getName()+" "+ausBefehl[i].getClass().getName()+"\n");
			
		}
    	return stringBuff.toString();
    }
 }
    
    
	

