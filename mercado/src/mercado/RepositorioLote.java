package mercado;

import java.util.HashMap;

public class RepositorioLote {
	private HashMap<Integer, Lote> lote;
	
	public RepositorioLote() {
		this.lote = new HashMap<>();
	}

	public void addLote(Produto p, int qtd, String data) {
		this.lote.put(p.getId(), new Lote(p, qtd, data));	
	}
}
