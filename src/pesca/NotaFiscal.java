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
		System.out.println(Interpreter1(cadas.cpf));
		System.out.println("Numero Telefone: " + cadas.numFormatado + "\n");
		System.out.print("Tipo de pescador: ");
		if(cadas.getTipoPescador() == 1) System.out.println("Pescador esportivo.\n");
		else if(cadas.getTipoPescador() == 2) System.out.println("Pescador amador.\n");
		else System.out.println("Pescador profissional.\n");
		System.out.println("Local escolhido: " + local + "\n");
		
	}
	
	String Interpreter1(String cpf)
	{
		cpf = cpf.replaceAll("([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})","$1\\.$2\\.$3-$4");
		return cpf;
	}




}
