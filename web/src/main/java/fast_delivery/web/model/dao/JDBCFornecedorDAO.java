package fast_delivery.web.model.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import fast_delivery.web.conexaobanco.HibernateUtil;
import fast_delivery.web.model.entidades.Fornecedor;

public class JDBCFornecedorDAO implements FornecedorDao<Fornecedor>{
 
	private static FornecedorDao instance;
	
	private JDBCFornecedorDAO () {
		
	}
	
	public static FornecedorDao getIntance() {
		
		if(instance == null) {
		   instance = new JDBCFornecedorDAO();
		}
		return instance;
	}
	
	
	
	@Override
	public void inserir(Fornecedor f) {
		Session session = HibernateUtil.getSession();
		try {
			session.getTransaction().begin();
			session.save(f);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Erro ao inserir" + e.toString());
		} finally {
			session.close();
		}
	}

	@Override
	public void alterar(Fornecedor f) {
		Session session = HibernateUtil.getSession();
		try {
			session.getTransaction().begin();
			session.update(f);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Erro ao atualizar " + e.toString());
		} finally {
			session.close();
		}
	}

	@Override
	public Fornecedor recuperar(Integer f) {
		Fornecedor fornecedor = null;

		Session session = HibernateUtil.getSession();
		try {
			fornecedor = session.find(Fornecedor.class, f);
			session.close();
		} catch (Exception e) {
			System.out.println("Erro ao recuperar " + e.toString());
		}
		return fornecedor;
	}

	@Override
	public void deletar(Fornecedor f) {
		Session session = HibernateUtil.getSession();
		System.out.println(f.toString());
        try {
            session.getTransaction().begin();
            session.delete(f);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.err.println("Falha ao remover Produto. Erro: " + e.toString());
        } finally {
            session.close();
        }
	}

	@Override
	public List<Fornecedor> listarTodos() {
		List<Fornecedor> fornecedores;
		try (Session session = HibernateUtil.getSession()) {
			TypedQuery<Fornecedor> e = session.createNativeQuery("select * from fornecedor", Fornecedor.class);
			fornecedores=e.getResultList();
			if (fornecedores != null) {
				return fornecedores;
			}

		} catch (Exception e) {
			System.err.println("Erro ao recuperar todos" + e.toString());
		}
		return null;

	}
	

}
