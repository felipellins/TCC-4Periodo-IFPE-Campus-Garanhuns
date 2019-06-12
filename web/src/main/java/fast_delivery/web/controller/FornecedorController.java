package fast_delivery.web.controller;

import java.util.List;

import fast_delivery.web.model.Fornecedor;
import fast_delivery.web.model.FornecedorModel;



public class FornecedorController {
	FornecedorModel fm = new FornecedorModel();

	public void inserirForncedorAction(Fornecedor f) {
		fm.inserir(f);
	}

	public void alterarForncedorAction(Fornecedor f) {
		fm.alterar(f);
	}

	public Fornecedor recuperarForncedorAction(Integer f) {

		return fm.recuperar(f);
	}

	public void deletarForncedorAction(Fornecedor f) {
		fm.deletar(f);

	}

	public List<Fornecedor> listarTodosFornecedorAction() {

		return fm.listarTodos();
	}

}