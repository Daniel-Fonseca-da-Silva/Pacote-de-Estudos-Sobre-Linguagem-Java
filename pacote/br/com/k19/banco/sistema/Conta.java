package pacote.br.com.k19.banco.sistema;

public class Conta {
	private double saldo;
	
	public void deposita(double valor)
	{
		this.saldo += valor;
	}
	public void saca(double valor)
	{
		this.saldo -= valor;
	}
	public double getSaldo()
	{
		return this.saldo;
	}
}
