package fast_delivery.web.model.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import fast_delivery.web.conexaobanco.HibernateUtil;
import fast_delivery.web.model.entidades.Cliente;

	public class JDBCClienteDAO implements ClienteDao {

		public void inserir(Cliente c) {

			Session session = HibernateUtil.getSession();
			try {
				session.getTransaction().begin();
				session.save(c);
				session.getTransaction().commit();
				session.close();
			} catch (Exception e) {
				System.out.println("Erro");
			}
		}

		public void alterar(Cliente c) {

			Session session = HibernateUtil.getSession();
			try {
				session.getTransaction().begin();
				session.update(c);
				session.getTransaction().commit();
			} catch (Exception e) {
				session.getTransaction().rollback();
				System.out.println("Erro ao atualizar " + e.toString());
			} finally {
				session.close();
			}

		}

		public Cliente recuperar(Integer c) {
			Cliente cliente = null;

			Session session = HibernateUtil.getSession();
			try {
				cliente = session.find(Cliente.class, c);
				session.close();
			} catch (Exception e) {
				System.out.println("Erro ao recuperar " + e.toString());
			}
			return cliente;
		}

		public void deletar(Cliente c) {

			Session session = HibernateUtil.getSession();
			System.out.println(c.toString());
			try {
				session.getTransaction().begin();
				session.delete(c);
				session.getTransaction().commit();
			} catch (Exception e) {
				session.getTransaction().rollback();
				System.err.println("Falha ao remover um Cliente. Erro: " + e.toString());
			} finally {
				session.close();
			}
		}

		public List<Cliente> listarTodos() {
            
			List<Cliente> clientes;
					
			try (Session session = HibernateUtil.getSession()) {
				
				TypedQuery<Cliente> c = session.createNativeQuery("select * from cliente", Cliente.class);
				clientes=c.getResultList();
				if (clientes != null) {
					return clientes;
				}

			} catch (Exception e) {
				System.err.println("Erro ao recuperar todos" + e.toString());
			}
			return null;
		}

	}

