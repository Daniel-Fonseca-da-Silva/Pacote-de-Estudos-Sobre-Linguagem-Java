
public class Conta {
	public int numero;
	public double saldo;
	public double limite = 100.0;
	public Agencia agencia;//Relacionamento entre Conta e Agencia
	
	//Construtor
	
	public Conta(Agencia agencia)
	{
		this.agencia = agencia;
	}
	
	public void deposita(double valor)
	{
		this.saldo  += valor;
	}
	
	public void saca(double valor)
	{
		this.saldo -= valor;
	}
	
	public void imprimeExtrato(){
		System.out.println("Saldo: " + this.saldo);
	}
	
	public double consultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
	
	public void transfere(Conta destino, double valor)
	{
		this.saldo = saldo;
		destino.saldo += valor;
	}
}
