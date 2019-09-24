package fast_delivery.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fast_delivery.web.model.ProdutoModel;
import fast_delivery.web.model.entidades.Produto;

@ManagedBean(name = "p")
@SessionScoped
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

	public Produto recuperarPorCodigoAction(String str) {
		return pm.recuperarPorCodigo(str);
	}

	public void deletarProdutoAction(Produto p) {
		pm.deletar(p);

	}

	public List<Produto> listarTodosProdutoAction() {

		return pm.listarTodos();
	}

}