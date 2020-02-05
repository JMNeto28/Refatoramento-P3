package Strategy;

public class CadastroContexto {
	private CadastroStrategy cadastroStrategy = null;
   
 
    public CadastroStrategy getCadastroStrategy() {
        return this.cadastroStrategy;
    }

    public void setCadastroStrategy(CadastroStrategy cadastroStrategy) {
        if (cadastroStrategy == null) return;
        this.cadastroStrategy = cadastroStrategy;
    }

    public void configurarCadastro() {
	cadastroStrategy.chamador();
    }
    

    public void cleanContext(){
        this.cadastroStrategy = null;
    }
 
    public void comecarStrategy(String loc) {
    	
    	if (loc == "Pantanal") 
		{
			setCadastroStrategy(new PantanalConcreta());
		}
		else if (loc == "Rio Araguaia") 
		{
			setCadastroStrategy(new AraguaiaConcreta());
		}
		else if (loc == "Foz do Iguaçu") 
		{
			setCadastroStrategy(new FozConcreta());
		}
		else if (loc == "Litoral do Espírito Santo") 
		{
			setCadastroStrategy(new LitoralConcreta());
		}
		else if (loc == "Rio Juma") 
		{
			setCadastroStrategy(new JumaConcreta());
		}
		else if (loc == "Rio Negro") 
		{
			setCadastroStrategy(new NegroConcreta());
		}
		else if (loc == "Barra de Maricá") 
		{
			setCadastroStrategy(new MaricaConcreta());
		}
		else
		{
			setCadastroStrategy(new XuxuConcreta());
		}
  
                
                
                
            configurarCadastro();
            cleanContext();
            
    }
}  

