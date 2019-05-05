package fast_delivery.web.model;

import java.util.List;

import org.hibernate.Session;

import fast_delivery.web.conexaobanco.HibernateUtil;

public class JDBCProdutoDAO implements ProdutoDAO {

	public void inserir(Produto p) {
		
		Session session = HibernateUtil.getSession();
		try {
			session.getTransaction().begin();
			session.save(p);
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			System.out.println("Erro");
		}
	}

	public void alterar(Produto p) {
		// TODO Auto-generated method stub

	}

	public Produto recuperar(Produto p) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletar(Produto p) {
		// TODO Auto-generated method stub

	}

	public List<Produto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
