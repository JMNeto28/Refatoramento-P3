package Strategy;

public class JumaConcreta extends CadastroStrategy {

	@Override
	public void chamador() {
		System.out.println("Rio Juma" + "\n");
		tucunare = 423;
		robalo = 1002;
		traira = 7335;
		System.out.printf("1� - Traira = %d especies pescadas\n2� - Robalo = %d especies pescadas\n3� - Tucunare = %d especies pescadas\n", traira, robalo, tucunare);
	}
	


}
