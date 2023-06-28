package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		//System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		System.out.println("AGENCIA da primeira conta " + primeiraConta.agencia);
		System.out.println("NUMERO da primeira conta " + primeiraConta.numero);
		System.out.println("TITULAR da primeira conta " + primeiraConta.titular);


	}
}
