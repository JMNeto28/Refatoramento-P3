package pesca;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class TraExce {
	
	private static Scanner input;

	public static int lerInt() {
		input = new Scanner(System.in);
		
		while (true) {
			try {
				int valor = input.nextInt();
				return valor;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
			} finally {
				input.nextLine();
			}
		}
	
	}
	public static String lerTele(String phone) throws ParseException {

		MaskFormatter phoneFormatter = new MaskFormatter("(##) #####-####");
		JFormattedTextField txtPhone = new JFormattedTextField(phoneFormatter);
		txtPhone.setText(phone);

	
	return txtPhone.getText();
	}
	
		
}
