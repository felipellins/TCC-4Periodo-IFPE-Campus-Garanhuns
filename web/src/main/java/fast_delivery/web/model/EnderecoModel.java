package fast_delivery.web.model;

import java.util.List;

import fast_delivery.web.model.dao.JDBCEnderecoDAO;
import fast_delivery.web.model.entidades.Endereco;

public class EnderecoModel {

	JDBCEnderecoDAO end = new JDBCEnderecoDAO();

	public void inserirEndereco(Endereco e) {
		end.inserir(e);
	}

	public void alterarEndereco(Endereco e) {
		end.alterar(e);

	}

	public Endereco recuperarEndereco(Integer e) {

		return end.recuperar(e);

	}

	public void deletarEndereco(Endereco e) {
		end.deletar(e);

	}

	public List<Endereco> listarTodos() {

		return end.listarTodos();
	}

}
