package fast_delivery.web.controller;

import java.util.List;

import fast_delivery.web.model.Produto;
import fast_delivery.web.model.ProdutoModel;

public class ProdutoController {

	ProdutoModel pm = new ProdutoModel();

	public void inserirProdutoAction(Produto p) {
		pm.inserir(p);
	}

	public void alterarProdutoAction(Produto p) {
		pm.alterar(p);
	}

	public Produto recuperarProdutoAction(Integer p) {

		return pm.recuperar(p);
	}

	public void deletarProdutoAction(Produto p) {
		pm.deletar(p);

	}

	public List<Produto> listarTodosProdutoAction() {

		return pm.listarTodos();
	}

}
