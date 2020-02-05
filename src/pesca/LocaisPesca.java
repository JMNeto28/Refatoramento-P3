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
			System.out.println("No mes de janeiro existem duas opções de locais para pesca:\n1- Pantanal - MS\n2- Rio Araguaia");
			escolha = TraExce.lerInt();
			if(escolha == 1) local = "Pantanal";
			else local = "Rio Araguaia";
		}
		
		else if(this.mes == 2) 
		{
			System.out.println("No mes de abril existem duas opções de locais para pesca:\n1- Foz do Iguaçu\n2- Litoral do Espírito Santo");
			escolha = TraExce.lerInt();
			if(escolha == 1) local = "Foz do Iguaçu";
			else local = "Litoral do Espírito Santo";
		}
		
		else if(this.mes == 3) 
		{
			System.out.println("No mes de julho existe uma opções de locais para pesca:\n1- Rio Juma");
			escolha = TraExce.lerInt();
			if(escolha == 1) local = "Rio Juma";
		}
		
		else
		{
			System.out.println("No mes de dezembro existe três opções de locais para pesca:\n1- Rio Negro\n2- Barra de Maricá\n3- Litoral paranaense");
			escolha = TraExce.lerInt();
			if(escolha == 1) local = "Rio Negro";
			else if(escolha == 2) local = "Barra de Maricá";
			else local = "Litoral paranaense";
		}
		
		return local;
	}
	
}
