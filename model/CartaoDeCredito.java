
public class CartaoDeCredito {
	public int numero;
	public String dataDeValidade;
	public Cliente cliente;//relacionamento
	
	//Construtor
	public CartaoDeCredito(int numero) 
	{
		this.numero = numero;
	}
}
