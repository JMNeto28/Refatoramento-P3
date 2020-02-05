package pesca;



public class NotaFiscal {
	int pacote;
	double aluguel;
	int translado;
	
	
	double Relatorio() {
		
		return pacote;
	}
	
	void Dados(Pescadores cadas, String local)
	{
		System.out.println("Nome: " + cadas.nome + "\n");
		System.out.println("CPF: " + cadas.cpf + "\n");
		System.out.println("Numero Telefone: " + cadas.numFormatado + "\n");
		System.out.print("Tipo de pescador: ");
		if(cadas.getTipoPescador() == 1) System.out.println("Pescador esportivo.\n");
		else if(cadas.getTipoPescador() == 2) System.out.println("Pescador amador.\n");
		else System.out.println("Pescador profissional.\n");
		System.out.println("Local escolhido: " + local + "\n");
		
	}




}
