package abstrata;

public abstract class Conta {
	
	private String nome;
	private double salario;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String texto) {
		this.nome = texto;
	}
	
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double valor) {
		this.salario = valor;
	}
	
	public abstract String imprimeExtrato();

}
