package pesca;

import java.util.Scanner;

public class Transfer extends Carro {
	Scanner sc = new Scanner(System.in);
	int x = 0;
	double soma = 0;
	
	public double somar(double aux)
	{
		aux *= 1.1;
		return aux;
	}
	
	double tran() {
		System.out.println("Voc� pode escolher o que quer no carro que te levar� do aeroporto at� o hotel de pesca. E no final da sua estadia te levar� do hotel at� o aeroporto\n");
		System.out.println("Menu de escolhas:\n1- Ar no valor de R$100\n2- Alarme no valor de R$150\n3- Dire��o Eletrica no valor de R$150\n4- Seguro no valor de R$200\n5- Finalizar a��o");
		while(x != 5)
		{
			x = TraExce.lerInt();
		
			switch(x)
			{
			case 1:
				System.out.println("Voc� adicionou ar.");
				this.setAr(100);
				soma = soma + this.getAr();
				break;
			
			case 2:
				System.out.println("Voc� adicionou alarme.");
				this.setAlarme(150);
				soma = soma + this.getAlarme();
				break;
			
			case 3:
				System.out.println("Voc� adicionou Dire��o Eletrica.");
				this.setDirecaoEletrica(150);
				soma = soma + this.getDirecaoEletrica();
				break;
			
			case 4:
				System.out.println("Voc� adicionou Seguro.");
				this.setSeguro(200);
				soma = soma + this.getSeguro();
				break;		
			}
			
		}
		System.out.println("Foi adicionado uma taxa de 10% para o motorista");
		return soma;
	}

}
