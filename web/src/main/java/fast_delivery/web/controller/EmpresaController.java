package fast_delivery.web.controller;

import java.util.List;

import fast_delivery.web.model.Empresa;
import fast_delivery.web.model.EmpresaModel;


public class EmpresaController {

	EmpresaModel em = new EmpresaModel();

	public void inserirEmpresaAction(Empresa e) {
		em.inserir(e);
	}

	public void alterarEmpresaAction(Empresa e) {
		em.alterar(e);
	}

	public Empresa recuperarEmpresaAction(Integer e) {

		return em.recuperar(e);
	}

	public void deletarEmpresaAction(Empresa e) {
		em.deletar(e);

	}

	public List<Empresa> listarTodosEmpresaAction() {

		return em.listarTodos();
	}

}
