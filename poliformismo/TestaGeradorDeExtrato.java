package poliformismo;

public class TestaGeradorDeExtrato {

	public static void main(String[] args) {
		GeradorDeExtrato gerador = new GeradorDeExtrato();
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setSaldo(1541.97);
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(1541.97);
		
		gerador.imprimeExtratoBasico(cp);
		gerador.imprimeExtratoBasico(cc);
	}

}
