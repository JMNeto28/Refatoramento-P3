package pesca;

import java.util.Scanner;

public class Pacote{
	Scanner sc = new Scanner(System.in);
	int numero, numero1, valorr = 1;
	void Evip(Pescadores pescador, NotaFiscal nota) 
	{
		if (pescador.getVip() == 1)
		{
			System.out.print("Vemos que você é nosso sócio pescador, então temos opções especiais para você.");
			System.out.println(" Existem 3 tipos de pacotes sócios pescadores:\n 1- Luxo no valor de R$ 1000,00\n 2- PRO  no valor de R$2000,00\n 3- Barco Hotel  no valor de R$3000,00\n");
			numero = TraExce.lerInt();
			
			if(numero == 1) 
			{
				System.out.println("Pacote luxo foi escolhido, no valor de R$1000,00");
				nota.pacote =  1000;
		
			}
			else if (numero == 2)
			{
				System.out.println("Pacote PRO foi escolhido, no valor de R$2000,00");
				nota.pacote = 2000;
			}
			else
			{
				System.out.println("Pacote Barco Hotel foi escolhido, no valor de R$3000,00");
				nota.pacote = 3000;
			}
		}
		else
		{
			System.out.println("Cliente para você temos 2 tipos de pacotes, são eles:\n1- Básica no valor R$900,00\n2- Moderada no valor de R$970,00\n");
			numero1 = TraExce.lerInt();
	
			if(numero1 == 1)
			{
				System.out.println("Pacote Básico foi escolhido, no valor de R$900,00");
				nota.pacote = 900;
			}
			else
			{
				System.out.println("Pacote Moderado foi escolhido, no valor de R$970,00");
				nota.pacote = 970;
			}
		}

	}
	double desconto(Pescadores pesc, double somadou)
	{
		if(pesc.getVip() == 1)
		{
			return somadou * 0.9;
		}
		else return somadou * 0.95;
	}
	
	
	}

