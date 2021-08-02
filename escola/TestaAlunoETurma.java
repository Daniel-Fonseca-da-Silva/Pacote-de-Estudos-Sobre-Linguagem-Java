package escola;

public class TestaAlunoETurma {
	
	public static void main(String[] args) {
		Aluno al1 = new Aluno();
		Turma trm1 = new Turma();
		
		al1.nome = "Erick Macedo";
		al1.rg = "2525-23521-61";
		al1.dtNascimento = "18/07/1993";
		trm1.serie = 8;
		trm1.sigla = "INF";
		trm1.tpEnsino = "EAD";
		al1.trm.serie = 1;
		
		System.out.println("Nome " + al1.nome + ", identidade " + al1.rg + ", nascido em " + al1.dtNascimento + ", série " + trm1.serie + ", curso " + trm1.sigla + ", modo " + trm1.tpEnsino);
	}
}
