package Strategy;

public class FozConcreta extends CadastroStrategy{

	@Override
	public void chamador() {
		System.out.println("Foz do Iguaçu" + "\n");
		tucunare = 12023;
		robalo = 9123;
		traira = 8733;
		System.out.printf("1º - Tucunare = %d especies pescadas\n2º - Robalo = %d especies pescadas\n3º - Traira = %d especies pescadas\n", tucunare, robalo, traira);
		
	}

	
}
