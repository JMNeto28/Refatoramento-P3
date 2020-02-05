package Strategy;

public class LitoralConcreta extends CadastroStrategy {

	@Override
	public void chamador() {
		System.out.println("Litoral do Espirito Santo" + "\n");
		tucunare = 2023;
		robalo = 10002;
		traira = 733;
		System.out.printf("1º - Robalo = %d especies pescadas\n2º - Tucunare = %d especies pescadas\n3º - Traira = %d especies pescadas\n", robalo, tucunare, traira);
	}

}
