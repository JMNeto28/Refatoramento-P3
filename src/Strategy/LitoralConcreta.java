package Strategy;

public class LitoralConcreta extends CadastroStrategy {

	@Override
	public void chamador() {
		System.out.println("Litoral do Espirito Santo" + "\n");
		tucunare = 2023;
		robalo = 10002;
		traira = 733;
		System.out.printf("1� - Robalo = %d especies pescadas\n2� - Tucunare = %d especies pescadas\n3� - Traira = %d especies pescadas\n", robalo, tucunare, traira);
	}

}
