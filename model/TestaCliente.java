
public class TestaCliente {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.nome = "Maria Azuleta";
		cliente1.codigo = 2814;
		cliente2.nome = "Paulo Rojão";
		cliente2.codigo = 87455;
		
		System.out.println(cliente1.nome + " " + cliente1.codigo);
		System.out.println(cliente2.nome + " " + cliente2.codigo);
	}
}
