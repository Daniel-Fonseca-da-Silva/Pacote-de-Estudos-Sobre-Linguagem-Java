package escola;

public class Funcionario {
	public String nome;
	public double salario = 521.5;
	
	public void setSalario(double valor)
	{
		this.salario += valor;
	}
	
	public double getSalario()
	{
		return this.salario;
	}
	
	public void ImprimePagamento()
	{
		System.out.println("Seu salário é " + this.salario);
	}
}
