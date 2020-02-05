package Strategy;

public class MaricaConcreta extends CadastroStrategy {

	@Override
	public void chamador() {
		System.out.println("Barra de Marica" + "\n");
		tucunare = 0;
		robalo = 11034;
		traira = 2335;
		System.out.printf("1º - Robalo = %d especies pescadas\n2º - Traira = %d especies pescadas\n3º - Tucunare = %d especies pescadas\n", robalo, traira, tucunare);
	}
	


}
