package encapsulamento;

public class Funcionario {
	
	private double salario;
	private String nome;
	
	public double getSalario() {
		return salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
