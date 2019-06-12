package fast_delivery.web.model;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import fast_delivery.web.conexaobanco.HibernateUtil;



public class JDBCEmpresaDAO implements EmpresaDAO<Empresa> {

	private static EmpresaDAO instance;
	
	private JDBCEmpresaDAO () {
		
	}
	
	
	public static EmpresaDAO getInstance() {
		
		if (instance == null) {
			instance = new JDBCEmpresaDAO();

		}
		return instance;
		
	}
	
	
	
	@Override
	public void inserir(Empresa emp) {
		Session session = HibernateUtil.getSession();
		try {
			session.getTransaction().begin();
			session.save(emp);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Erro ao inserir" + e.toString());
		} finally {
			session.close();
		}
	}

	@Override
	public void alterar(Empresa emp) {
		Session session = HibernateUtil.getSession();
		try {
			session.getTransaction().begin();
			session.update(emp);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Erro ao atualizar " + e.toString());
		} finally {
			session.close();
		}
	}

	@Override
	public Empresa recuperar(Integer emp) {
		Empresa empresa = null;

		Session session = HibernateUtil.getSession();
		try {
			empresa = session.find(Empresa.class, emp);
			session.close();
		} catch (Exception e) {
			System.out.println("Erro ao recuperar " + e.toString());
		}
		return empresa;
	}

	@Override
	public void deletar(Empresa emp) {
		Session session = HibernateUtil.getSession();
		System.out.println(emp.toString());
        try {
            session.getTransaction().begin();
            session.delete(emp);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.err.println("Falha ao remover Produto. Erro: " + e.toString());
        } finally {
            session.close();
        }
	}

	@Override
	public List<Empresa> listarTodos() {
		List<Empresa> empresas;
		try (Session session = HibernateUtil.getSession()) {
			TypedQuery<Empresa> e = session.createNativeQuery("select * from empresa", Empresa.class);
			empresas=e.getResultList();
			if (empresas != null) {
				return empresas;
			}

		} catch (Exception e) {
			System.err.println("Erro ao recuperar todos" + e.toString());
		}
		return null;

	}



}
