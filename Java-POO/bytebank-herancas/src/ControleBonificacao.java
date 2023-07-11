
public class ControleBonificacao {
	private double soma;
	
	public double getSomna() {
		return soma;
	}
	
	public void registra(Funcionario Funcionario) {
		double bonificacaoFunc = Funcionario.getBonificacao();
		this.soma = this.soma + bonificacaoFunc;
	}
}
