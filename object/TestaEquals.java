package object;

public class TestaEquals {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Vladimir");
		f1.setSalario(8542.23);
		
		Funcionario f2 = new Funcionario();
		f1.setNome("Ragnar");
		f1.setSalario(7353.51);
		
		System.out.println(f1 == f2);
		System.out.println(f1.equals(f2));
	}
}
