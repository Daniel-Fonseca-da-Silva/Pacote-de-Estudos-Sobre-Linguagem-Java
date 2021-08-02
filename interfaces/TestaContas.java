package interfaces;

public class TestaContas {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		
		c1.deposita(531.58);
		c2.deposita(1573.58);
		
		c1.saca(235.58);
		c2.saca(455.91);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());

	}
}
