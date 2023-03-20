package mercado;

import javax.xml.crypto.Data;

public class Lote {
	private Produto prod;
	private int qtd;
	private String data;
	
	public Lote(Produto prod, int qtd, String data) {
		this.prod = prod;
		this.qtd = qtd;
		this.data = data;
	}
	
}
