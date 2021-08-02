package interfaces;

public class ContaCorrente implements Conta{
	private double saldo;
	private double taxaOperacao = 0.45;
	
	public void deposita(double valor)
	{
		this.saldo += valor - this.taxaOperacao;
	}
	public void saca(double valor)
	{
		this.saldo -= valor + this.taxaOperacao;
	}
	public double getSaldo()
	{
		return this.saldo;
	}
}
