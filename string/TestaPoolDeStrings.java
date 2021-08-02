package string;

public class TestaPoolDeStrings {
	public static void main(String[] args) {
		// Strings criadas de forma literal
		String nome1 = "Daniel Fonseca da Silva";
		String nome2 = "Daniel Fonseca da Silva";
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome2));
		
		
		// Usando o construtor da String para criar objetos
		String nome3 = new String("Daniel Fonseca da Silva");
		String nome4 = new String("Daniel Fonseca da Silva");
		
		System.out.println(nome3 == nome4);
		System.out.println(nome3.equals(nome4));
		
		// length() Exibe a quantidade de caracteres
		System.out.println(nome4.length());
		// toUpperCase() transforma para maiusculo
		System.out.println(nome3.toUpperCase());
		// toLowerCase() transforma para minusculo
		System.out.println(nome2.toLowerCase());
		// Pega o atributo sem espaços de começo de final
		String nome5 = "       Daniel        ";
		System.out.println(nome5.trim());
		// split() divide a string em varias de acordo com um separador
		String nomes = "Maria, Carlos, João, Vladimir, Nikolai, Erick, Jhonsom, Jane, Roberto";
		String[] vetorNomes = nomes.split(",");
		
		for(int x = 0; x < vetorNomes.length; x++)
		{
			System.out.println("nome: " + vetorNomes[x] + " na posição [" + x + "]");
		}
		// replaceAll() Substituir um trecho por outro trecho
		String texto = "A melhor escolha de faculdade está ao seu alcance";
		System.out.println(texto.replaceAll("faculdade", "aluguel"));
		
		// Guardando uma string convertida
		String original = "        meu nome       ";
		String convertida = original.toUpperCase();
		convertida  = convertida.trim();
		System.out.println("A String normal (" + original + ")" + ", convertida (" + convertida + ")");
	}
}
