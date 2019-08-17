package fast_delivery.web.controller;

import java.util.List;

import fast_delivery.web.model.ProdutoModel;
import fast_delivery.web.model.entidades.Produto;

public class EstoqueController {

	ProdutoModel pm = new ProdutoModel();

	public void removerProduto(List<Produto> produtos) {
		for (Produto produto : produtos) {
			Produto produtoAux = pm.recuperarPorCodigo(produto.getCodProduto());
			produtoAux.setQuantProduto(produtoAux.getQuantProduto() - produto.getQuantProduto());
			if (verificarDisponibilidadeProduto(produtoAux) == true) {
				pm.alterar(produtoAux);
			} else {
				produtoAux.setQuantProduto(produtoAux.getQuantProduto() + produto.getQuantProduto());
				System.out.println("Quantidade INDISPONIVEL");
			}
		}
	}

	public void adicionarProduto(List<Produto> produtos) {
		for (Produto produto : produtos) {
			Produto produtoAux = pm.recuperarPorCodigo(produto.getCodProduto());
			produtoAux.setQuantProduto(produtoAux.getQuantProduto() + produto.getQuantProduto());
			pm.alterar(produtoAux);
		}
	}

	public boolean verificarDisponibilidadeProduto(Produto produto) {
		
		if (produto.getQuantProduto() >= 0) {
			return true;
		}

		return false;
	}

}
