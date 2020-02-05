package Strategy;

public class NegroConcreta extends CadastroStrategy {

	@Override
	public void chamador() {
		System.out.println("Rio Negro" + "\n");
		tucunare = 4230;
		robalo = 0;
		traira = 2335;
		System.out.printf("1º - Tucunare = %d especies pescadas\n2º - Traira = %d especies pescadas\n3º - Robalo = %d especies pescadas\n", tucunare, traira, robalo);
	}
	


}
