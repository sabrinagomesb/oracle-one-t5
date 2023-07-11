package bytebank_encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 123456);
		
		System.out.println(conta.getAgencia());
		
		Conta outraConta = new Conta(1337, 123457);
		
		System.out.println(Conta.getTotal());

	}
}
