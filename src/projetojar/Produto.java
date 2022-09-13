package projetojar;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEmEstoque( ) {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;  
	}

	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
		
	}
	
		
}

