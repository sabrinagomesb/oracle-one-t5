package sintaxe_variaveis_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 16;
		int idadeVoto = 16;
		if (idade >= 18) {
			System.out.println("Você é maior de idade.");
		} else {
			if (idade == idadeVoto) {
				System.out.println("Você é menor de idade, mas pode votar.");
			} else {
				System.out.println("Você é menor de idade.");
			}
		}
	}
}
