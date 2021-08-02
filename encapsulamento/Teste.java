package encapsulamento;

public class Teste {
	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		func.setNome("Sudo su");
		func.setSalario(851.23);
		
		System.out.println("Nome: " + func.getNome());
		System.out.println("Salario: " + func.getSalario());
		
	}
}
