package mercado;

public class Produto {
	private int id;
	private String nome;
	private String fab;
	private double preco;
	
	public Produto(int id, String nome, String fab, double preco) {
		this.nome = nome;
		this.fab = fab;
		this.preco = preco;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
