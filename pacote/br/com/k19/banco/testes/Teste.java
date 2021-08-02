package pacote.br.com.k19.banco.testes;

import pacote.br.com.k19.banco.sistema.Conta;

public class Teste {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.deposita(1582.12);
		c.saca(500);
		System.out.println(c.getSaldo());
	}
}
