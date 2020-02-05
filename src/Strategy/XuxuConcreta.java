package Strategy;

public class XuxuConcreta extends CadastroStrategy {

	@Override
	public void chamador() {
		System.out.println("Litoral paranaense" + "\n");
		tucunare = 230;
		robalo = 1034;
		traira = 0;
		System.out.printf("1º - Robalo = %d especies pescadas\n2º - Tucunare = %d especies pescadas\n3º - Traira = %d especies pescadas\n", robalo, tucunare, traira);
	}
	


}
