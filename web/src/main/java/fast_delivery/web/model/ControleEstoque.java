package fast_delivery.web.model;

import java.util.ArrayList;
import java.util.List;

import fast_delivery.web.model.entidades.Produto;

public class ControleEstoque {

	private Produto prodEstoque;
	private int quantProdEstoque;
	
	List<ControleEstoque> listProdutosEstque = new ArrayList<>();
	
	public List<ControleEstoque> getlistProdutosEstque() {
		return listProdutosEstque;
	}

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
