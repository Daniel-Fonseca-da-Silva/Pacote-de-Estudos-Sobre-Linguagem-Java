package estatico;

public class Funcionario {
	private String nome;
	private double salario;
	private static double valeRefeicao;
	
	public Funcionario()
	{
		this.nome = nome;
		this.salario = salario;
		Funcionario.valeRefeicao = Funcionario.valeRefeicao;
	}
	
	public static void getvaleRefeicao()
	{
		System.out.println("Vale com metodo: " + Funcionario.valeRefeicao + " $ ");
	}
	
	public static double setvaleRefeicao(double valor)
	{
		Funcionario.valeRefeicao =  valor;
		return Funcionario.valeRefeicao;
	}
	
	
}