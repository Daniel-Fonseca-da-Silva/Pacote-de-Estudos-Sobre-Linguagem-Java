package heranca;

public class Secretaria extends Funcionario{
	// Atributos globais
	private int ramal;
	// Metodos modificadores
	public void setRamal(int valor)
	{
		this.ramal = valor;
	}
	// Metodos acessadores
	public int getRamal()
	{
		return this.ramal;
	}
	public void mostraDados()
	{
		System.out.println("Exibindo dados");
		System.out.println("Nome: " + getNome());
		System.out.println("Salario: " + getSalario());
		System.out.println("Bonificaçao: " + calculaBonificacao());
	}
}
