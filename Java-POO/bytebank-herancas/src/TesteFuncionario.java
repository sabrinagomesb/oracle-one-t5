
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario novoFuncionario = new Funcionario();
		novoFuncionario.setNome("João da Silva");
		novoFuncionario.setCpf("123456789-00");
		novoFuncionario.setSalario(3500);
		
		System.out.println(novoFuncionario.getNome());
		System.out.println(novoFuncionario.getBonificacao());
		
	}

}
