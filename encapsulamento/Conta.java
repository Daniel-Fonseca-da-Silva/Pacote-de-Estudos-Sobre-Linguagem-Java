package encapsulamento;

public class Conta {
	// Atributos locais
	private int numero;
	private double saldo;
	private double limite;
	private static int aleatorio;
	
	// Construtor
	public Conta()
	{
		Conta.aleatorio++;
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	// Metodos modificadores
	public void setNumero() {
		this.numero = Conta.aleatorio;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	// Metodos acessadores
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public double getLimite() {
		return limite;
	}
	
}
