import java.util.List;
import fast_delivery.web.controller.ClienteController;
import fast_delivery.web.controller.EnderecoController;
import fast_delivery.web.model.Cliente;
import fast_delivery.web.model.Endereco;

public class TesteCliente {

	public static void main(String[] args) {

		EnderecoController ec = new EnderecoController();
		ClienteController cc = new ClienteController();

		Endereco e = new Endereco("Rua Sao Luis", 3, "Sao Pedro", "Garanhuns", "55200-11");
		Cliente c = new Cliente("33.333.333/3333-33", "Acai dululu", "37622-1013", e);

//		          Inserir
//		 ec.inserirEnderecoAction(e);
//		 cc.inserirClienteAction(c);

//					Alterar
////	 ClienteModel cm= new ClienteModel();
////	 c=cm.recuperarCliente(2);
////	 c.setRazaoSocial("Sandro Pizaria");
////	 cc.alterarClienteAction(c);

//					Deletar
//		ClienteModel cm = new ClienteModel();
//		c = cm.recuperarCliente(6);
//		cc.deletarClienteAction(c);

//		List<Cliente> clientes = cc.listarTodosClienteAction();
//		for (Cliente lista : clientes) {
//			System.out.println(lista.toString());

		}
	}
