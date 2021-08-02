package abstrata;

public class ContaPoupanca extends Conta{
	
	private int diaDoAniversario = 1;

	public int getDiaDoAniversario() {
		return diaDoAniversario;
	}

	public void setDiaDoAniversario(int dia) {
		this.diaDoAniversario = dia;
	}
	
	public String imprimeExtrato()
	{
		return "Conta nome " + this.getNome() + ", salario " + this.getSalario();
	}
	
	
}
