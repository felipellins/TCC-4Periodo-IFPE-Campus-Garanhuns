package fast_delivery.web.model;

import java.util.List;

public class ClienteModel {

	JDBCClienteDAO cli = new JDBCClienteDAO();

	public void inserirCliente(Cliente c) {
		cli.inserir(c);
	}

	public void alterarCliente(Cliente c) {
		cli.alterar(c);

	}

	public Cliente recuperarCliente(Integer c) {

		return cli.recuperar(c);

	}

	public void deletarCliente(Cliente c) {
		cli.deletar(c);

	}

	public List<Cliente> listarTodos() {

		return cli.listarTodos();
	}

}