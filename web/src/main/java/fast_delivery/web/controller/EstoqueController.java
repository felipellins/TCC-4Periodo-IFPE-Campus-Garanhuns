package fast_delivery.web.controller;

import java.util.List;

import fast_delivery.web.model.ProdutoModel;
import fast_delivery.web.model.entidades.Produto;

public class EstoqueController {

	ProdutoModel pm = new ProdutoModel();
	
	public void removerProduto(List<Produto> produtos) {
		for (Produto produto : produtos) {
			Produto produtoAux = pm.recuperar(produto.getIdProduto());
			produtoAux.setQuantProduto(produtoAux.getQuantProduto()-produto.getQuantProduto());
			pm.alterar(produtoAux);
		}
	}

	public void adicionarProduto(List<Produto> produtos) {
		for (Produto produto : produtos) {
			Produto produtoAux = pm.recuperar(produto.getIdProduto());
			produtoAux.setQuantProduto(produtoAux.getQuantProduto()+produto.getQuantProduto());
			pm.alterar(produtoAux);
		}
	}

	public boolean verificarDisponibilidadeProduto(List<Produto> produtos) {
		for (Produto produto : produtos) {
			Produto produtoAux = pm.recuperar(produto.getIdProduto());
			if(produtoAux.getQuantProduto()>0) {
				return true;
			}
		}
		return false;
	}

}
