package Strategy;

public class FozConcreta extends CadastroStrategy{

	@Override
	public void chamador() {
		System.out.println("Foz do Igua�u" + "\n");
		tucunare = 12023;
		robalo = 9123;
		traira = 8733;
		System.out.printf("1� - Tucunare = %d especies pescadas\n2� - Robalo = %d especies pescadas\n3� - Traira = %d especies pescadas\n", tucunare, robalo, traira);
		
	}

	
}
