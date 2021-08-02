package exceptions;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		try
		{
			f.aumentaSalario(-51);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Houve uma IllegalArgumentException");
		}
		
	}
}
