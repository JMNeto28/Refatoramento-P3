package Data;

import pesca.NotaFiscal;

import pesca.Pacote;
import pesca.Pescadores;

public class ObjSingle {
	 
	    private static ObjSingle single_instance = null; 
	    Pescadores p1 = new Pescadores();
		Pacote pacote = new Pacote();
		NotaFiscal nota = new NotaFiscal();
	    
	  
	    
	    private ObjSingle() { 
	        
	    } 
	  
	    
	    public static ObjSingle getInstance() { 

	        if (single_instance == null){ 
	            single_instance = new ObjSingle();
	        }
	        return single_instance; 
	    }
	    
	    public void setp1(Pescadores p1) {
	    	this.p1 = p1;
	    }
	    
	    public Pescadores getp1() {
	    	return p1;
	    }
	    
	    public void setpacote(Pacote pacote) {
	    	this.pacote = pacote;
	    }
	    
	    public Pacote getpacote() {
	    	return pacote;
	    }
	    
	    public void setnota(NotaFiscal nota) {
	    	this.nota = nota;
	    }
	    
	    public NotaFiscal getnota() {
	    	return nota;
	    }
	    
}
