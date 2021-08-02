public class TestaMetodosConta {
	public static void main(String[] args) {
		Agencia ag = new Agencia(159371);
		Conta c = new Conta(ag);
		
		System.out.println("Chamando o metodo deposita passando valor 1000");
		c.deposita(1000);
		c.imprimeExtrato();
		System.out.println("-----------------------------------------------");
		System.out.println("Chamando o metodo saca passando valor 100");
		c.saca(100);
		c.imprimeExtrato();
		System.out.println("-----------------------------------------------");
		double saldoDisponivel = c.consultaSaldoDisponivel();
		System.out.println("saldo disponível na conta " + saldoDisponivel);
	}
}
