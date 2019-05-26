package fast_delivery.web.model;

import java.util.List;

import org.hibernate.Session;

import fast_delivery.web.conexaobanco.HibernateUtil;

public class ProdutoModel {

	JDBCProdutoDAO prod = new JDBCProdutoDAO();

	public void inserir(Produto p) {
		prod.inserir(p);
	}

	public void alterar(Produto p) {
		prod.alterar(p);

	}

	public Produto recuperar(Integer p) {

		return prod.recuperar(p);
	}

	public void deletar(Produto p) {
		prod.deletar(p);

	}

	public List<Produto> listarTodos() {

		return prod.listarTodos();
	}

}
