package Strategy;

public class JumaConcreta extends CadastroStrategy {

	@Override
	public void chamador() {
		System.out.println("Rio Juma" + "\n");
		tucunare = 423;
		robalo = 1002;
		traira = 7335;
		System.out.printf("1º - Traira = %d especies pescadas\n2º - Robalo = %d especies pescadas\n3º - Tucunare = %d especies pescadas\n", traira, robalo, tucunare);
	}
	


}
