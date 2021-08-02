
public class TestaAgencia {
	public static void main(String[] args) {
		Agencia ag1 = new Agencia(159370);
		Agencia ag2 = new Agencia(159379);
		
		ag1.numero = 245512;
		ag2.numero = 536226;
		
		System.out.println("Dados da 1° agência " + ag1.numero);
		System.out.println("Dados da 2° agência " + ag2.numero);
	}
}
