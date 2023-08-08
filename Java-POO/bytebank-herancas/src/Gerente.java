// Gerente é um Funcionário e é um Autenticável. Assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}

	
	
}
