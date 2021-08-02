package abstrata;

public abstract class Funcionario {
	// Atributos globais
	private String nome;
	private double salario;
	private String cargo;
	// Construtor
	
	// Metodos modificadores
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	// Metodos acessadores
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public abstract String mostraDado();

	
}
