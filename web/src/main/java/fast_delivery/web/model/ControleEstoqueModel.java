package fast_delivery.web.model;

import java.util.List;

import fast_delivery.web.model.dao.JDBCControleEstoqueDAO;
import fast_delivery.web.model.entidades.ControleEstoque;

public class ControleEstoqueModel {

	JDBCControleEstoqueDAO controleEstoque = new JDBCControleEstoqueDAO();

	public void inserir(ControleEstoque d) {
		controleEstoque.inserir(d);
	}

	public void alterar(ControleEstoque d) {
		controleEstoque.alterar(d);

	}

	public ControleEstoque recuperar(Integer d) {

		return controleEstoque.recuperar(d);
	}

	public void deletar(ControleEstoque d) {
		controleEstoque.deletar(d);

	}

	public List<ControleEstoque> listarTodos() {

		return controleEstoque.listarTodos();
	}
	
}
