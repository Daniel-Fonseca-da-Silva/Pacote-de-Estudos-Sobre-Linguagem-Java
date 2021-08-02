package estatico;

public class Conta {
	public static int contador;
	public int numero;
	public static int guardaNumero;
	
	public Conta()
	{
		Conta.contador++;
		this.numero = Conta.contador;
		this.guardaNumero = Conta.contador;
	}
	
	public static void zeraContador()
	{
		System.out.println("Valor atual do contador: " + Conta.contador);
		System.out.println("Zerando o Contador");
		Conta.contador = 0;
	}
	public static void numeroContas()
	{
		System.out.println("Total de Contas: " + Conta.guardaNumero);
	}

}
