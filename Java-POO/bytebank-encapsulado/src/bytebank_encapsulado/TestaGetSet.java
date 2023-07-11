package bytebank_encapsulado;

public class TestaGetSet {
	public static void main(String[] args) {
		Conta contaTeste = new Conta(1337, 456789);
		contaTeste.setNumero(1337);
		System.out.println(contaTeste.getNumero());
		
		Cliente sabrina = new Cliente();
		
		sabrina.setNome("Sabrina Gomes");
		contaTeste.setTitular(sabrina);
		
		// mostra apenas o id
		System.out.println(contaTeste.getTitular());

		System.out.println(contaTeste.getTitular().getNome());
		
		contaTeste.getTitular().setProfissao("Programadora");

	}
}
