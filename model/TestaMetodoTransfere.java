
public class TestaMetodoTransfere {
	public static void main(String[] args) {
		Agencia a = new Agencia(1234);
		
		Conta origem = new Conta(a);
		origem.saldo = 1528.48;
		System.out.println("Saldo da primeira conta: " + origem.saldo);
		
		Conta destino = new Conta(a);
		origem.saldo = 2528.48;
		System.out.println("Saldo da segunda conta: " + destino.saldo);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Realizando a transferência");
		origem.transfere(destino, 500);
		System.out.println("---------------------------------------");
		
		System.out.println("Realizando a transferência");
		System.out.println("Saldo da primeira conta: " + origem.saldo);
		System.out.println("Saldo da segunda conta: " + destino.saldo);
	}
}
