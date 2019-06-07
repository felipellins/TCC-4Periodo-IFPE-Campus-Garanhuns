package fast_delivery.web.model;

import java.util.List;
import org.hibernate.Session;
import fast_delivery.web.conexaobanco.HibernateUtil;

	public class JDBCEnderecoDAO implements EnderecoDAO {

		public void inserir(Endereco e) {

			Session session = HibernateUtil.getSession();
			try {
				session.getTransaction().begin();
				session.save(e);
				session.getTransaction().commit();
				session.close();
			} catch (Exception er) {
				System.out.println("Erro");
			}
		}

		public void alterar(Endereco e) {

			Session session = HibernateUtil.getSession();
			try {
				session.getTransaction().begin();
				session.update(e);
				session.getTransaction().commit();
			} catch (Exception er) {
				session.getTransaction().rollback();
				System.out.println("Erro ao atualizar " + e.toString());
			} finally {
				session.close();
			}

		}

		public Endereco recuperar(Integer e) {
			Endereco endereco = null;

			Session session = HibernateUtil.getSession();
			try {
				endereco = session.find(Endereco.class, e);
				session.close();
			} catch (Exception er) {
				System.out.println("Erro ao recuperar " + e.toString());
			}
			return endereco;
		}

		public void deletar(Endereco e) {

			Session session = HibernateUtil.getSession();
			System.out.println(e.toString());
			try {
				session.getTransaction().begin();
				session.delete(e);
				session.getTransaction().commit();
			} catch (Exception er) {
				session.getTransaction().rollback();
				System.err.println("Falha ao remover um Endereco. Erro: " + e.toString());
			} finally {
				session.close();
			}
		}

		public List<Endereco> listarTodos() {

			try (Session session = HibernateUtil.getSession()) {
				List<Endereco> enderecos = session.createNativeQuery("select * from endereco").list();
				if (enderecos != null) {
					return enderecos;
				}

			} catch (Exception e) {
				System.err.println("Erro ao recuperar todos" + e.toString());
			}
			return null;
		}

	}

