
public class TestaContaEAgencia {
	public static void main(String[] args) {
		Agencia agc = new Agencia(159372);
		Conta c = new Conta(agc);
		
		c.numero = 17;
		c.limite = 325.22;
		c.saldo = 1525.31;
		
		System.out.println("Dados da conta");
		System.out.println("Número " + agc.numero + " número da conta " + c.numero + " limite " + c.limite + " saldo " + c.saldo);
	}
}
