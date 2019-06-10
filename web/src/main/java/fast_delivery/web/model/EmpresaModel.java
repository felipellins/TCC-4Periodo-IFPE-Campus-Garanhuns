package fast_delivery.web.model;

import java.util.List;

public class EmpresaModel {

	EmpresaDAO <Empresa> dao = JDBCEmpresaDAO.getInstance();
	
	
	public void inserir(Empresa em) {
		dao.inserir(em);
	}
	public void alterar(Empresa em) {
		dao.alterar(em);
		
	}

	public Empresa recuperar(Integer em) {

		return dao.recuperar(em);
	}

	public void deletar(Empresa em) {
		dao.deletar(em);

	}

	public List<Empresa> listarTodos() {

		return dao.listarTodos();
	}

	
}
