package mercado;

import java.util.HashMap;

public class RepositorioProduto {
	private HashMap<Integer, Produto> produtos;
	
	public RepositorioProduto() {
		this.produtos = new HashMap<>();
	}
	
	public boolean addProd(int id, String nome, String fab, double preco) {
		if (!this.produtos.containsKey(id)) {
			this.produtos.put(id, new Produto(id, nome, fab, preco));
			return true;
		}
		return false;
	}
	
	public Produto getProduto(int id) {
		return this.produtos.get(id);
	}
	
	public boolean existeProduto(int id) {
		return this.produtos.containsKey(id);
	}	
}
