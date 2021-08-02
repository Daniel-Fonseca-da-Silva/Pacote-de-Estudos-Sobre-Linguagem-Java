package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class EscritaDeArquivo {

	public static void main(String[] args) throws IOException {
		FileOutputStream arquivo = new FileOutputStream("saida.txt");
		PrintStream printstream = new PrintStream(arquivo);
		
		printstream.println("Primeira linha!!!!");
		printstream.println("Segunda linha!!!!");
		printstream.println("Terceira linha!!!!");
		printstream.close();
	}

}
