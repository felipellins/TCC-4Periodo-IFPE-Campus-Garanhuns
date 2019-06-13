package fast_delivery.web.model;

public class ControleEstoque {

	private Produto prodEstoque;
	private int quantProdEstoque;

	public Produto getProdEstoque() {
		return prodEstoque;
	}

	public void setProdEstoque(Produto prodEstoque) {
		this.prodEstoque = prodEstoque;
	}

	public int getQuantProdEstoque() {
		return quantProdEstoque;
	}

	public void setQuantProdEstoque(int quantProdEstoque) {
		this.quantProdEstoque = quantProdEstoque;
	}

	public ControleEstoque(Produto prodEstoque, int quantProdEstoque) {

		this.prodEstoque = prodEstoque;
		this.quantProdEstoque = quantProdEstoque;
	}

	public void insetirProdutoEstoque() {

	}

	public void removerProdutoEstoque() {

	}

}
