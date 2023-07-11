
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente Gerente1 = new Gerente();
		Gerente1.setNome("Patricia");
		Gerente1.setSalario(5000.0);
		
		EditorVideo EditorVid = new EditorVideo();
		EditorVid.setSalario(2500.0);
		
		ProductOwner ProdOwner = new ProductOwner();
		ProdOwner.setSalario(8000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(Gerente1);
		controle.registra(EditorVid);
		controle.registra(ProdOwner);
		
		
		
		
		System.out.println(controle.getSomna());
	}
}
