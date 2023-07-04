package bytebank_composto;

public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(200);
		System.out.println(conta.getSaldo());
		
		
		// apesar de não ser possível deixar a conta negativa através dos métodos de Conta,
		// no momento, está sendo possível atribuir valores negativos ao saldo.
		// Para resolver o problema, o atributo foi declarado como privado.
		// System.out.println(conta.saldo - 101);
		
	
	}
}
