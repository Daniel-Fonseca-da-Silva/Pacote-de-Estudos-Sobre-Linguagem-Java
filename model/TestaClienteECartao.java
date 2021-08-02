
public class TestaClienteECartao {
	public static void main(String[] args) {
		Cliente clienteA = new Cliente();//Relacionamento "Cliente" com "CartaoDeCredito" agregação
		CartaoDeCredito cdc = new CartaoDeCredito(35125412);
		
		clienteA.nome = "Daniel";
		clienteA.codigo = 17;
		
		cdc.dataDeValidade = "12/12/2023";
		
		System.out.println("Dados do cliente");
		System.out.println("Nome " + clienteA.nome + " código " + clienteA.codigo);
		System.out.println("----------------------------------------");
		System.out.println("Dados do cartão do cliente " + clienteA.nome);
		System.out.println("Número " + cdc.numero + ", data de validade " + cdc.dataDeValidade);
	}
}
