package fast_delivery.web.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import fast_delivery.web.model.ClienteModel;
import fast_delivery.web.model.entidades.Cliente;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class ClienteController implements Serializable {

	private ClienteModel cm = null;
	private Cliente cliente;
	private Cliente selectedCliente;

	public ClienteController() {

		this.cliente = new Cliente();
		this.cm = new ClienteModel();
		this.selectedCliente = (Cliente) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("clienteLogado");

	}

	public void inserirClienteAction() throws Excecoes {
		try {
			if (cliente != null)
				cm.inserirCliente(cliente);
		} catch (Exception e) {
			throw new Excecoes("Error ao Salvar");
		}
	}

	public Cliente recuperarClienteAction(Integer c) {
		return cm.recuperarCliente(c);
	}

	public Cliente recuperarPorCodigoAction(String codCliente) {
		return cm.recuperarPorCodigo(codCliente);
	}

	public void alterarClienteAction(Cliente c) {
		cm.alterarCliente(c);
	}

	public void deletarClienteAction(Cliente c) {
		cm.deletarCliente(c);

	}

	public List<Cliente> listarTodosClienteAction() {
		return cm.listarTodos();
	}

	public ClienteModel getCm() {
		return cm;
	}

	public void setCm(ClienteModel cm) {
		this.cm = cm;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getSelectedCliente() {
		return selectedCliente;
	}

	public void setSelectedCliente(Cliente selectedCliente) {
		this.selectedCliente = selectedCliente;
	}

	public String linkAlterar() {
		return "alterarcliente.xhtml?faces-redirect=true";
	}

}
