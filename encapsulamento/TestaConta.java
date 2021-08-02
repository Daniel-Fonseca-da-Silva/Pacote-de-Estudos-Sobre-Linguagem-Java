package encapsulamento;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		c1.setLimite(551.99);
		c1.setNumero();
		c1.setSaldo(1581.23);
		
		System.out.printf("Limite " + c1.getLimite() + " numero " + c1.getNumero() + " saldo " + c1.getSaldo());
	}
}
