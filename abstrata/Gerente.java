package abstrata;

public class Gerente extends Funcionario {
	
	public String mostraDado() {
		return "Funcionario nome " + this.getNome() + ", salario " + this.getSalario();
	}
	
}
