package interfaces;

public class TestaGeradorDeExtrato {
	public static void main(String[] args) {
		ContaCorrente co1 = new ContaCorrente();
		ContaCorrente co2 = new ContaCorrente();
		
		co1.deposita(893.11);
		co2.deposita(554.11);
		
		co1.saca(125.11);
		co2.saca(550.11);
		
		 GeradorDeExtrato extrato = new GeradorDeExtrato();
		 
		 extrato.geraExtrato(co1);
		 extrato.geraExtrato(co2);
	}
}
