package bytebank_composto;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDoGuilherme = new Conta();
		System.out.println(contaDoGuilherme.getSaldo());
		
		contaDoGuilherme.titular = new Cliente();
		
		// a atribuição para "nome" não pode acontecer antes da instância da classe Cliente acontecer,
		// pois a informação abaixo geraria uma exception, já que está apontando para uma informção
		// que tem valor 'null'.
		// A instância da classe pode ser feita já sendo atribuida a uma variável.
		// Dessa forma, a atribuição de valor ao atributo "nome" acontece normalmente, no ex. abaixo.
	
		contaDoGuilherme.titular.nome = "Guilherme Andrade";
		System.out.println(contaDoGuilherme.titular.nome);
	}

}
