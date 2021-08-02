package estatico;

public class TestaContador {
	public static void main(String[] args) {
		
		System.out.println("Contador: " + Conta.contador);
		Conta c1 = new Conta();
		System.out.println("Contador: " + Conta.contador);
		System.out.println("Conta do cliente Andre: " + c1.numero);
		Conta c2 = new Conta();
		System.out.println("Contador: " + Conta.contador);
		System.out.println("Conta da cliente Maria: " + c2.numero);
		
		Conta.zeraContador();
		Conta.numeroContas();
	}
}
