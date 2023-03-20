package mercado;

import javax.xml.crypto.Data;

public class Services {
	private RepositorioLote repLote;
	private RepositorioProduto repProd;
	
	public Services() {
		this.repProd = new RepositorioProduto();
		this.repLote = new RepositorioLote();
	}	
	
	public boolean addProd(int id, String nome, String fab, double preco) {
		return repProd.addProd(id, nome, fab, preco);
	}
	
	public boolean addLote(int idProd, int qtd, String data) {
		if (this.repProd.existeProduto(idProd)) {
			Produto p = this.repProd.getProduto(idProd);
			this.repLote.addLote(p, qtd, data);
			return true;
		}
		return false;
	}
}
