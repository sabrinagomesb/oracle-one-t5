package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaSabrina = new Conta();
		contaDaSabrina.saldo = 300;
		
		contaDaSabrina.deposita(50);
		System.out.println(contaDaSabrina.saldo);
		
		//contaDaSabrina.saca(30);
		//contaDaSabrina.saca(500);
		//contaDaSabrina.saca(10);
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(950);
		
		contaDoPaulo.transfere(15, contaDaSabrina);
		
		System.out.println(contaDaSabrina.saldo);
		System.out.println(contaDoPaulo.saldo);


	}
}
