package pesca;

import java.util.Scanner;

public class Aluguel extends Carro {
	Scanner sc = new Scanner(System.in);
	int esc;
	double som,conta;

		public double somar(double aux) 
		{
		
			if (aux == 1)
			{
				//System.out.println("O carro basico foi escolhido.");
				this.setAr(300); 
				this.setDirecaoEletrica(200);
				som = this.getAr() + this.getDirecaoEletrica();

			}
			if (aux == 2)
			{
				this.setAr(300); 
				this.setDirecaoEletrica(200);
				this.setAlarme(400);
				this.setSeguro(150);
				som = this.getAr() + this.getDirecaoEletrica() + this.getAlarme() + this.getSeguro();
				//System.out.println("O carro m�dio foi escolhido.");
			}
			if (aux == 3)
			{
				//System.out.println("O luxo foi escolhido.");
				this.setAr(300); 
				this.setDirecaoEletrica(200);
				this.setAlarme(400);
				this.setSeguro(150);
				this.setSeguroTotal(350);
				som = this.getAr() + this.getDirecaoEletrica() + this.getAlarme() + this.getSeguro() + this.getSeguroTotal();
			}
			return som;

		}
		int AluguelCarro(){
			System.out.println("Escolha seu tipo de carro para o aluguel.\n1- B�sico no valor de R$500.00\n2- M�dio no valor de R$1050.00\n3- Luxo no valor de R$1400.00");
			
			esc = TraExce.lerInt();
			if (esc == 1)
			{
				System.out.println("O carro basico foi escolhido.");

			}
			else if (esc == 2)
			{
				System.out.println("O m�dio foi escolhido.");
				
			}
			else System.out.println("O carro de luxo foi escolhido.");
		
			return esc;
		}
		
		
	
}
