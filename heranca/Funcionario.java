package heranca;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	// Metodos modificadores
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setSalario(double valor)
	{
		this.salario = valor;
	}
	// Metodos acessadores
	public String getNome()
	{
		return this.nome;
	}
	public double getSalario()
	{
		return this.salario;
	}
	public double calculaBonificacao()
	{
		return this.salario * 0.1;
	}
	public void mostraDados()
	{
		System.out.println("Exibindo dados");
		System.out.println("Nome: " + getNome());
		System.out.println("Salario: " + getSalario());
		System.out.println("Bonificaçao: " + calculaBonificacao());
	}
}
