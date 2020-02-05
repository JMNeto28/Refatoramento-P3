package pesca;

import java.text.ParseException;
import java.util.Scanner;

import Data.ObjSingle;
import Strategy.CadastroContexto;

public class Pesca {

	public static void main(String[] args) throws ParseException {
		ObjSingle obj = ObjSingle.getInstance();
		LocaisPesca local = new LocaisPesca();
		CadastroContexto cadastro = new CadastroContexto();
		Aluguel aluga = new Aluguel();
		Transfer trans = new Transfer();
		Carro carro = new Aluguel();
		Carro carro1 = new Transfer();
		int escolherFuncio = 0, e = 0;
		double aux = 0, somadou = 0, valor = 0;
		String LocalEscolhido = null, cupom;
		Scanner sc = new Scanner(System.in);
		
		
		
		// Menu para escolha da funcionalidade
		while (escolherFuncio != 9)
		{
			System.out.println("Escolha a Funcionalidade: \n1- Cadastro\n2- Pacotes de viagem\n3- Escolher o mes da viagem e o local de pesca conforme o mês\n4- Rank de peixes pescados no lugar de escolha \n5- Aluguel de carro para a viagem ou transfer aero/hotel\n6- Nota fiscal\n7- Inserir cupom de desconto\n8- Editar o cadastro completo\n9- Fechar o programa");
			escolherFuncio = TraExce.lerInt();
			
			if(escolherFuncio == 1) 
			{
				System.out.println("-------------------------------------------------------------");
				System.out.println("Cadastro:");
				obj.getp1().regis1();
				System.out.println("-------------------------------------------------------------");
			}
			else if(escolherFuncio == 2) 
			{
				System.out.println("-------------------------------------------------------------");
				System.out.println("Você está na área de pacotes de viagem");
				obj.getpacote().Evip(obj.getp1(), obj.getnota());
				System.out.println("-------------------------------------------------------------");
			}
			else if(escolherFuncio == 3)
			{
				System.out.println("-------------------------------------------------------------");
				System.out.println("Escolha o mes de pesca:");
				LocalEscolhido = local.escolherlocal();
				System.out.println("-------------------------------------------------------------");
			}
			else if(escolherFuncio == 4)
			{
				System.out.println("-------------------------------------------------------------");
				cadastro.comecarStrategy(LocalEscolhido);
				System.out.println("-------------------------------------------------------------");
			}
		
			else if(escolherFuncio == 5) 
			{
				System.out.println("-------------------------------------------------------------");
				System.out.println("1- Aluguel do carro\n2- Transfer aeroporto/pesqueiro:");
				e = TraExce.lerInt();
				if(e == 1) aux = aluga.AluguelCarro();
				else aux = trans.tran();	
				System.out.println("-------------------------------------------------------------");
			}
			
			else if(escolherFuncio == 6) 
			{
				System.out.println("-------------------------------------------------------------");
				System.out.println("Nota fiscal para o cliente:");
				if (e == 1) somadou = (obj.getnota().Relatorio()+ carro.somar(aux));
				else somadou = (obj.getnota().Relatorio() + carro1.somar(aux));
				obj.getnota().Dados(obj.getp1(), LocalEscolhido);
				System.out.printf("Valor bruto: R$%.2f\n",  somadou);
				System.out.printf("Valor com desconto: R$%.2f\n", valor);
				System.out.println("-------------------------------------------------------------");
				
			}
			else if(escolherFuncio == 7) 
			{
				System.out.println("-------------------------------------------------------------");
				System.out.println("Inserir cupom de desconto\n");
				cupom = sc.nextLine();
				if (e == 1) somadou = (obj.getnota().Relatorio()+ carro.somar(aux));
				else somadou = (obj.getnota().Relatorio() + carro1.somar(aux));
				if(cupom.equals("DESCONTO"))
				{
					valor = obj.getpacote().desconto(obj.getp1(), somadou);
				}
				else System.out.println("O cupom não é válido\n");
				System.out.println("-------------------------------------------------------------");
			}
			
			else if(escolherFuncio == 8) 
			{
				System.out.println("-------------------------------------------------------------");
				System.out.println("Você pode editar o cadastro.\n");
				obj.getp1().regis1();
				System.out.println("-------------------------------------------------------------");
			}

			else
			{
				System.out.println("Obrigado por usar nosso sistema!");
				System.exit(0);
			}
		}
		
		
	}


}