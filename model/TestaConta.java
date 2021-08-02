
public class TestaConta {
	public static void main(String[] args) {
		Agencia a = new Agencia(123);
		Conta conta1 =  new Conta(a);
		Conta conta2 = new Conta(a);
		
		conta1.numero = 31425;
		conta1.saldo = 25.58171;
		conta1.limite = 3.287;
		
		conta2.numero = 212562;
		conta2.saldo = 5.584;
		conta2.limite = 500.00;
		
		System.out.println("Dados da primeira conta");
		System.out.println("Número da conta " + conta1.numero);
		System.out.println("Saldo " + conta1.saldo);
		System.out.println("Limite de saque " + conta1.limite);
		System.out.println("---------------------------------");
		System.out.println("Dados da segunda conta");
		System.out.println("Número da conta " + conta2.numero);
		System.out.println("Saldo " + conta2.saldo);
		System.out.println("Limite de saque " + conta2.limite);

	}
}
