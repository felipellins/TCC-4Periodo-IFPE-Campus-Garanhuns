package fast_delivery.web.model.dao;

import java.util.List;

import org.hibernate.Session;

import fast_delivery.web.conexaobanco.HibernateUtil;
import fast_delivery.web.model.entidades.ControleEstoque;
import fast_delivery.web.model.entidades.Produto;

public class JDBCControleEstoqueDAO implements ControleEstoqueDao {

	@Override
	public void inserir(ControleEstoque d) {
		Session session = HibernateUtil.getSession();
		try {
			session.getTransaction().begin();
			session.save(d);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Erro ao inserir" + e.toString());
		} finally {
			session.close();
		}	
	}

	@Override
	public void alterar(ControleEstoque d) {
		Session session = HibernateUtil.getSession();
		try {
			session.getTransaction().begin();
			session.update(d);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Erro ao atualizar " + e.toString());
		} finally {
			session.close();
		}
	}

	@Override
	public ControleEstoque recuperar(Integer d) {
		ControleEstoque controleEstoque = null;

		Session session = HibernateUtil.getSession();
		try {
			controleEstoque = session.find(ControleEstoque.class, d);
			session.close();
		} catch (Exception e) {
			System.out.println("Erro ao recuperar " + e.toString());
		}
		return controleEstoque;

	}

	@Override
	public void deletar(ControleEstoque d) {
		Session session = HibernateUtil.getSession();
		System.out.println(d.toString());
        try {
            session.getTransaction().begin();
            session.delete(d);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.err.println("Falha ao remover Produto do controle de estoque. Erro: " + e.toString());
        } finally {
            session.close();
        }	
	}

	@Override
	public List<ControleEstoque> listarTodos() {
		try (Session session = HibernateUtil.getSession()) {
			List<ControleEstoque> controleEstoque = session.createNativeQuery("select * from controleEstoque").list();
			if (controleEstoque != null) {
				return controleEstoque;
			}

		} catch (Exception e) {
			System.err.println("Erro ao recuperar todos" + e.toString());
		}
		return null;

	}

}
