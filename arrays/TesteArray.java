package arrays;

import java.util.Scanner;
import java.util.Arrays; 

public class TesteArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int[10];
		double numeros[] = new double[]{0.5,5.1,4.4,5.4,8.1,9.8,7.1,8.5,9.5,10.1};
		String nomes[] = new String[]{"Daniel F S", "Chiquinha", "Chaves", "Leandro", "Marcao", "Ruana", "Luana", "Maria", "Fernando"};
		Arrays.sort(nomes);
		String CopiaDosNomes[] = Arrays.copyOf(nomes, 9);
		Arrays.fill(nomes, "Daniel");
		
		/*for(int x = 0; x < vet.length; x++)
		{
			System.out.println("Entre com valor para vetor da posição" + x);
			vet[x] = sc.nextInt();
		}
		
		for(double numero : numeros)
		{
			System.out.println("valor do vetor na posição" + numeros);
		}
		*/
		for(String nome : nomes)
		{
			System.out.println(nome);
		}
		
		sc.close();
		
	}
}
