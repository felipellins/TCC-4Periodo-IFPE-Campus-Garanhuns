package fast_delivery.web.model.entidades;

public class ControleEstoque {
	
	private Produto prodEstoque;
	private PedidoVenda quantProdEstoque;
	
	public Produto getProdEstoque() {
		return prodEstoque;
	}
	public void setProdEstoque(Produto prodEstoque) {
		this.prodEstoque = prodEstoque;
	}
	public PedidoVenda getQuantProdEstoque() {
		return quantProdEstoque;
	}
	public void setQuantProdEstoque(PedidoVenda quantProdEstoque) {
		this.quantProdEstoque = quantProdEstoque;
	}
	
	public void adicionarQuantProduto(PedidoVenda quantProdEstoque) {
		
	}
	
}
