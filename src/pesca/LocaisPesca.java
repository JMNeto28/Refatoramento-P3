package pesca;

import java.util.Scanner;

public class LocaisPesca extends Pescadores{
	Scanner sc = new Scanner(System.in);
	int escolha;
	String local;
	
	String escolherlocal(){
		System.out.println("Temos 4 meses para escolha:\n1- Janeir0\n2- Abril\n3- Julho\n4- Dezembro (apenas pesca esportiva, por conta da Piracema)");
		this.mes = TraExce.lerInt();;
		if(this.mes == 1) 
		{
			System.out.println("No mes de janeiro existem duas op��es de locais para pesca:\n1- Pantanal - MS\n2- Rio Araguaia");
			escolha = TraExce.lerInt();
			if(escolha == 1) local = "Pantanal";
			else local = "Rio Araguaia";
		}
		
		else if(this.mes == 2) 
		{
			System.out.println("No mes de abril existem duas op��es de locais para pesca:\n1- Foz do Igua�u\n2- Litoral do Esp�rito Santo");
			escolha = TraExce.lerInt();
			if(escolha == 1) local = "Foz do Igua�u";
			else local = "Litoral do Esp�rito Santo";
		}
		
		else if(this.mes == 3) 
		{
			System.out.println("No mes de julho existe uma op��es de locais para pesca:\n1- Rio Juma");
			escolha = TraExce.lerInt();
			if(escolha == 1) local = "Rio Juma";
		}
		
		else
		{
			System.out.println("No mes de dezembro existe tr�s op��es de locais para pesca:\n1- Rio Negro\n2- Barra de Maric�\n3- Litoral paranaense");
			escolha = TraExce.lerInt();
			if(escolha == 1) local = "Rio Negro";
			else if(escolha == 2) local = "Barra de Maric�";
			else local = "Litoral paranaense";
		}
		
		return local;
	}
	
}
