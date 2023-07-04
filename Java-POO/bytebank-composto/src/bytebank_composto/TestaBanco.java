package bytebank_composto;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente sabrina = new Cliente();
		sabrina.nome = "Sabrina Gomes";
		sabrina.cpf = "123.456.789-00";
		sabrina.profissao = "Desenvolvedora de Software";
		
		Conta contaDaSabrina = new Conta();
		contaDaSabrina.deposita(100);
		
		// associa o cliente sabrina a contaDaSabrina
		contaDaSabrina.titular = sabrina;
		
		// mostra apenas o id da instância da classe Cliente
		System.out.println(contaDaSabrina.titular);
		// mostra o atributo da classe
		System.out.println(contaDaSabrina.titular.nome);

		
	}
}
