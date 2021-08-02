
public class TestaGerente {
	public static void main(String[] args) {
		Gerente gr = new Gerente();
		gr.salario = 1545.31;
		
		System.out.println("Salário " + gr.salario);
		System.out.println("Aumentando salário em 10%");
		gr.aumentaSalario();
		System.out.println("Salário " + gr.salario);
		System.out.println("Aumentando salário em 30%");
		gr.aumentaSalario(0.3);
		System.out.println("Salário " + gr.salario);
	}
}
