package sintaxe_variaveis_fluxo;

public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
		System.out.println("Contador antes do loop " + contador);
		while(contador <= 10) {
			System.out.println(contador);
			// contador = contador + 1;
			// contador += 1;
			contador++;

		}
		System.out.println("Contador depois do loop " + contador);
	}
}
