package abstrata;

public class TestaFuncionario{
	
	public static void main(String[] args) {
		
		Funcionario fun = new Gerente();
		
		fun.setNome("Joaneber");
		fun.setSalario(6545.32);
		
		System.out.println(fun.mostraDado());
	}
}
