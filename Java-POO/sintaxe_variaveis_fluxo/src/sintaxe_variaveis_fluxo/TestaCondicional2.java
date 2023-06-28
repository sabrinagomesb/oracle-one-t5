package sintaxe_variaveis_fluxo;

// Se for menor de idade, só pode entrar se estiver acompanhando.
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja Bem Vinde!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}
