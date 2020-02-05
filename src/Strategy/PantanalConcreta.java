package Strategy;

public class PantanalConcreta extends CadastroStrategy {

	@Override
	public void chamador() {
		System.out.println("Pantanal" + "\n");
		tucunare = 1001;
		robalo = 920;
		traira = 1231;
		System.out.printf("1� - Traira = %d especies pescadas\n2� - Tucunare= %d especies pescadas\n3� - Robalo = %d especies pescadas\n", traira, tucunare, robalo);
	}
	

}
