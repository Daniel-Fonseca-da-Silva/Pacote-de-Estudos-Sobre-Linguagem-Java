package object;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	
	public void setNome(String texto)
	{
		this.nome = texto;
	}
	public String getNome()
	{
		return this.nome;
	}
	public void setSalario(double valor)
	{
		this.salario = valor;
	}
	public double getSalario()
	{
		return this.salario;
	}
	@Override
	public String toString() {
		return "Funcionario nome: " + nome + ", salario: " + salario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}
	
}
