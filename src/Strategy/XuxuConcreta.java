package Strategy;

public class XuxuConcreta extends CadastroStrategy {

	@Override
	public void chamador() {
		System.out.println("Litoral paranaense" + "\n");
		tucunare = 230;
		robalo = 1034;
		traira = 0;
		System.out.printf("1� - Robalo = %d especies pescadas\n2� - Tucunare = %d especies pescadas\n3� - Traira = %d especies pescadas\n", robalo, tucunare, traira);
	}
	


}
