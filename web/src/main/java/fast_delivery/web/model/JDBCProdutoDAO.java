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
		} catch (Exception e) {
			System.out.println("Erro ao inserir" + e.toString());
		} finally {
			session.close();
		}
	}

	public void alterar(Produto p) {
		Session session = HibernateUtil.getSession();
		try {
			session.getTransaction().begin();
			session.update(p);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Erro ao atualizar " + e.toString());
		} finally {
			session.close();
		}

	}

	public Produto recuperar(Produto p) {
		Produto produto = null;

		Session session = HibernateUtil.getSession();
		try {
			produto = session.find(Produto.class, p);
			session.close();
		} catch (Exception e) {
			System.out.println("Erro ao recuperar " + e.toString());
		}
		return produto;
	}

	public void deletar(Produto p) {
		Session session = HibernateUtil.getSession();
		try {
			session.getTransaction().begin();
			session.delete(p);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Erro ao deletar " + e.toString());
		} finally {
			session.close();
		}
	}

	public List<Produto> listarTodos() {
		try (Session session = HibernateUtil.getSession()) {
			List<Produto> produtos = session.createNativeQuery("select * from produto").list();
			if (produtos != null) {
				return produtos;
			}

		} catch (Exception e) {
			System.err.println("Erro ao recuperar todos" + e.toString());
		}
		return null;

	}

}
