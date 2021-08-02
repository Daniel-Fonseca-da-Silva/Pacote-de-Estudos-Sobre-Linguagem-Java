package estatico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaFuncionario {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do vale");
		
		try
		{
			double valor = sc.nextDouble();
			Funcionario.setvaleRefeicao(valor);
			Funcionario.getvaleRefeicao();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Ocorreu um erro de digitação, 'somente número e virgula'.");
		}
		
		sc.close();
		System.exit(0);
	}
}
