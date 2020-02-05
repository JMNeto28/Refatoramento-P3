package Strategy;

public class PantanalConcreta extends CadastroStrategy {

	@Override
	public void chamador() {
		System.out.println("Pantanal" + "\n");
		tucunare = 1001;
		robalo = 920;
		traira = 1231;
		System.out.printf("1º - Traira = %d especies pescadas\n2º - Tucunare= %d especies pescadas\n3º - Robalo = %d especies pescadas\n", traira, tucunare, robalo);
	}
	

}
