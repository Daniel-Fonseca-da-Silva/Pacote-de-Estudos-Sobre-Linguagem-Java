package abstrata;

class TestaConta extends ContaPoupanca {
	
	public static void main(String[] args) {
		
		Conta ct = new ContaPoupanca();
		
		ct.setNome("Ragnar");
		ct.setSalario(8567.23);
		
		System.out.println(ct.imprimeExtrato());
	}
}
