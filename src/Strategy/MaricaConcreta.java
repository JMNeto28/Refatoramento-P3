package Strategy;

public class MaricaConcreta extends CadastroStrategy {

	@Override
	public void chamador() {
		System.out.println("Barra de Marica" + "\n");
		tucunare = 0;
		robalo = 11034;
		traira = 2335;
		System.out.printf("1� - Robalo = %d especies pescadas\n2� - Traira = %d especies pescadas\n3� - Tucunare = %d especies pescadas\n", robalo, traira, tucunare);
	}
	


}
