package heranca;

public class TestaFuncionarios {
	public static void main(String[] args) {
		
		//Gerente
		Gerente g = new Gerente();
		g.setNome("Marcelo Ribeiro");
		g.setSalario(8592.32);
		g.setSenha("asf3243dg");
		System.out.printf("Gerente ");
		System.out.println("Nome: " + g.getNome() + ", salario " + g.getSalario() + "$," + " senha " + g.getSenha() + ", bonificação " + g.calculaBonificacao());
		g.mostraDados();
		// Telefonista
		Telefonista te = new Telefonista();
		te.setNome("Marcela de Alcantara");
		te.setSalario(1171.23);
		te.setEstacaoDeTrabalho(34);
		System.out.printf("Telefonista ");
		System.out.println("Nome: " + te.getNome() + ", salario " + te.getSalario() + ", estação " + te.getEstacaoDeTrabalho() + ", bonificação " + te.calculaBonificacao());
		te.mostraDados();
		// Secretaria
		Secretaria se = new Secretaria();
		se.setNome("Carolina Marques Biscoir");
		se.setRamal(8);
		se.setSalario(2572.91);
		System.out.printf("Secretaria ");
		System.out.println("Nome: " + se.getNome() + ", salario " + se.getSalario() + ", ramal " + se.getRamal() + ", bonificação " + se.calculaBonificacao());
		se.mostraDados();
	}
}
