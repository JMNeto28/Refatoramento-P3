package Strategy;

public class AraguaiaConcreta extends CadastroStrategy {

	@Override
	public void chamador() {
		System.out.println("Araguaia" + "\n");
		tucunare = 10023;
		robalo = 7123;
		traira = 8733;
		System.out.printf("1� - Tucunare = %d especies pescadas\n2� - Traira= %d especies pescadas\n3� - Robalo = %d especies pescadas\n", tucunare, traira, robalo);
	}
	


}
