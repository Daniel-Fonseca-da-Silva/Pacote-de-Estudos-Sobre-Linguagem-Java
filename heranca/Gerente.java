package heranca;

public class Gerente extends Funcionario{
	
	// Atributos globais
	private String nome;
	private String senha;
	// Metodos modificadores
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setSenha(String senha)
	{
		this.senha = senha;
	}
	// Metodos acessadores
	public String getNome()
	{
		return nome;
	}
	public String getSenha()
	{
		return senha;
	}
	public void mostraDados()
	{
		System.out.println("Exibindo dados");
		System.out.println("Nome: " + getNome());
		System.out.println("Salario: " + getSalario());
		System.out.println("Bonificaçao: " + calculaBonificacao());
	}
}
