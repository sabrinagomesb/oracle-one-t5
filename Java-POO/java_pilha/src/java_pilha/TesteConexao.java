package java_pilha;

public class TesteConexao {

	public static void main(String[] args) {
		Conexao con = null;
		
		try {
			con = new Conexao();
			con.leDados();
		} catch(IllegalStateException exception) {
			System.out.println("Erro na conexão");
		} finally {
			con.fecha();
		}

}
	}
