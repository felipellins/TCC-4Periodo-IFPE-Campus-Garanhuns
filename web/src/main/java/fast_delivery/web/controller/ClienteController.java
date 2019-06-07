package fast_delivery.web.controller;

import java.util.List;

import fast_delivery.web.model.Cliente;
import fast_delivery.web.model.ClienteModel;

public class ClienteController {

	ClienteModel cm = new ClienteModel();

	public void inserirClienteAction(Cliente c) {
		cm.inserirCliente(c);
	}

	public void alterarClienteAction(Cliente c) {
		cm.alterarCliente(c);
	}

	public Cliente recuperarClienteAction(Integer c) {

		return cm.recuperarCliente(c);
	}

	public void deletarClienteAction(Cliente c) {
		cm.deletarCliente(c);

	}

	public List<Cliente> listarTodosClienteAction() {

		return cm.listarTodos();
	}

}
