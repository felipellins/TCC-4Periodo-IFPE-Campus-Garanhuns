package fast_delivery.web.model.entidades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



public class ControleEstoque {
	
	//private int idControleEstoque;
	private Produto prodEstoque;
	private int quantProdEstoque;
	
	List<Produto> listProdutosEstoque = new ArrayList<>();
	
	public List<Produto> getlistProdutosEstque() {
		return listProdutosEstoque;
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
	
	public ControleEstoque() {
		
	}

	public void inserirProdutoEstoque(Produto p) {
		listProdutosEstoque.add(p);
	}
	
	public void listarProdutosEstoque() {
		for (Produto produto : listProdutosEstoque) {
			System.out.println(produto.toString());
		}
	}

	public void removerQuantidadeProdutoEstoque(Produto p, int quantProduto) {
		for (Produto produto : listProdutosEstoque) {
			if(produto == p) {
				
				System.out.println("Produto passado como parametro " + p.toString());
				produto.getControleEstoque().setQuantProdEstoque(p.getControleEstoque().getQuantProdEstoque() - quantProduto);
				System.out.println("Produto retidado as quantidades " + produto.toString());
			}
		}
	}
	public void adicionarQuantidadeProdutoEstoque(Produto p, int quantProduto) {
		for (Produto produto : listProdutosEstoque) {
			if(produto == p) {
				
				System.out.println("Produto passado como parametro " + p.toString());
				produto.getControleEstoque().setQuantProdEstoque(p.getControleEstoque().getQuantProdEstoque() + quantProduto);
				System.out.println("Produto adicionado as quantidades " + produto.toString());
			}
		}
	}

}
