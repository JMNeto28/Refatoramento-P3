package pesca;

import java.text.ParseException;
import java.util.Scanner;

public class Pescadores {
	
		public String nome;
		public String cpf;
		public String endereço;
		public String numero;
		public String numFormatado;
		public int mes;
		private int tipoPescador;
		private int vip;
		int conta;
		
		public void setTipoPescador(int t)
		{
			tipoPescador = t;
		}
		public int getTipoPescador() 
		{
			return tipoPescador;
		}
		
		public void setVip(int r)
		{
			vip = r;
		}
		public int getVip()
		{
			return vip;
		}
		
	
	int tip, tip1;
	void regis1() throws ParseException
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Realizando o cadastro do pescador:");
		System.out.println("Digite o nome:");
		nome = sc.nextLine();
		System.out.println("Digite o CPF: (No formato: 12345678900)");
		cpf = sc.nextLine();
		cpf = cpf.replaceAll("([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})","$1\\.$2\\.$3-$4");
		System.out.println("Digite o endereço:");
		endereço = sc.nextLine();
		System.out.println("Digite o numero: (No formato: 82999990000)");
		numero = sc.nextLine();
		numFormatado = TraExce.lerTele(numero);
		System.out.println("Digite o tipo de pescador:\n1- Esportivo\n2- Amador\n3- Profissional\n");
		tip = TraExce.lerInt();
		setTipoPescador(tip);
		System.out.println("Digite 1 se o cliente for VIP ou 2 se não for VIP:");
		tip1 = TraExce.lerInt();
		setVip(tip1);
	}
}



