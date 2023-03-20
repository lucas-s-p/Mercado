package mercado;

public class Fachada {
	private Services sev;
	
	public Fachada() {
		this.sev = new Services();
	}
	
	public boolean addProd(int id, String nome, String fab, double preco) {
		return sev.addProd(id, nome, fab, preco);
	}
	
	public boolean addLote(int idProd, int qtd, String data) {
		return sev.addLote(idProd, qtd, data);
	}
}
