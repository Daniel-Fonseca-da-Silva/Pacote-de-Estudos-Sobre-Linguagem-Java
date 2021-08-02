
public class TestaCartaoDeCredito {
	public static void main(String[] args) {
		
		CartaoDeCredito cartao1 = new CartaoDeCredito(25125432);
		CartaoDeCredito cartao2 = new CartaoDeCredito(35155112);
		
		cartao1.dataDeValidade = "18/02/2025";
		cartao2.dataDeValidade = "05/07/2020";
		
		System.out.println("Cartão de numero " + cartao1.numero + " com validade até " + cartao1.dataDeValidade);
		System.out.println("Cartão de numero " + cartao2.numero + " com validade até " + cartao2.dataDeValidade);
	}
}
