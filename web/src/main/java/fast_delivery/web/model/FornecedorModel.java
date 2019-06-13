package fast_delivery.web.model;

import java.util.List;

import fast_delivery.web.model.dao.Dao;
import fast_delivery.web.model.dao.JDBCFornecedorDAO;
import fast_delivery.web.model.entidades.Fornecedor;

public class FornecedorModel {

	Dao<Fornecedor> dao = JDBCFornecedorDAO.getIntance();
	
	public void inserir(Fornecedor f) {
		dao.inserir(f);
	}
	public void alterar(Fornecedor f) {
		dao.alterar(f);

	}

	public Fornecedor recuperar(Integer f) {

		return dao.recuperar(f);
	}

	public void deletar(Fornecedor f) {
		dao.deletar(f);

	}

	public List<Fornecedor> listarTodos() {

		return dao.listarTodos();
	}

	
}
