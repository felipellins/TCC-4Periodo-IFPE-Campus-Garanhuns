package fast_delivery.web.controller;

import java.util.List;

import fast_delivery.web.model.ControleEstoqueModel;
import fast_delivery.web.model.entidades.ControleEstoque;

public class ControleEstoqueController {

	ControleEstoqueModel cem = new ControleEstoqueModel();
	
	public void inserirControleEstoqueAction(ControleEstoque d) {
		cem.inserir(d);
	}

	public void alterarControleEstoqueAction(ControleEstoque d) {
		cem.alterar(d);
	}

	public ControleEstoque recuperarControleEstoqueAction(Integer d) {

		return cem.recuperar(d);
	}

	public void deletarControleEstoqueAction(ControleEstoque d) {
		cem.deletar(d);

	}

	public List<ControleEstoque> listarTodosControleEstoqueAction() {

		return cem.listarTodos();
	}
	
}
