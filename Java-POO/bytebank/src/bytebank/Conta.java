package bytebank;

public class Conta {
	double saldo;
	int agencia = 13;
	int numero;
	String titular;

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
		// System.out.println("Seu depóstio de " + valor + " foi realizado com sucesso!");
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// this.saldo = this.saldo - valor;
			System.out.println("Você sacou " + valor + ". Seu saldo atual é " + this.saldo);
			return true;
		} else {
			System.out.println("Você não tem saldo suficiente.");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

}