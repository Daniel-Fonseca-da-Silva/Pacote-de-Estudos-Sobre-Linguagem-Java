
public class TestaValorPadrao {
	public static void main(String[] args) {
		Agencia agcia = new Agencia(235647);
		Conta testeConta = new Conta(agcia);
		
		System.out.println("Valores padroes");
		System.out.println("Número da conta " + testeConta.numero + " saldo " + testeConta.saldo + " limite " + testeConta.limite);
		
	}
}
