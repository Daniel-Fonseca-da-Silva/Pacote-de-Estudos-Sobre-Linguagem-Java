package heranca;

public class Telefonista extends Funcionario{
	// Atributos globais
	private int estacaoDeTrabalho;
	
	// Metodos modificadores
	public void setEstacaoDeTrabalho(int valor)
	{
		this.estacaoDeTrabalho = valor;
	}
	// Metodos acessadores
	public int getEstacaoDeTrabalho()
	{
		return this.estacaoDeTrabalho;
	}
	public void mostraDados()
	{
		System.out.println("Exibindo dados");
		System.out.println("Nome: " + getNome());
		System.out.println("Salario: " + getSalario());
		System.out.println("Bonificaçao: " + calculaBonificacao());
	}
}	
