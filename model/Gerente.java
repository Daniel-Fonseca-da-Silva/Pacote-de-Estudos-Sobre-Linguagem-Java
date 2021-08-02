
public class Gerente {
	public String nome;
	public double salario;
	
	public void aumentaSalario()
	{
		this.aumentaSalario(0.1);
	}
	public void aumentaSalario(double taxa)
	{
		this.salario += this.salario * taxa;
	}
}
