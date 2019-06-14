import fast_delivery.web.controller.ControleEstoqueController;
import fast_delivery.web.controller.ProdutoController;
import fast_delivery.web.model.entidades.ControleEstoque;
import fast_delivery.web.model.entidades.Produto;

public class Teste {

	public static void main(String[] args) {

		ControleEstoque ce = new ControleEstoque();
		ce.setQuantProdEstoque(10);
		
		
		Produto p = new Produto("Teste", 5.0, ce);

		Produto p1 = new Produto("Test2", 10.0, ce);
		
		Produto p2 = new Produto("Test3", 12.0, ce);
		
		ce.inserirProdutoEstoque(p);
		ce.inserirProdutoEstoque(p1);
		ce.inserirProdutoEstoque(p2);
		
		ce.removerQuantidadeProdutoEstoque(p1, 6);
		ce.adicionarQuantidadeProdutoEstoque(p1, 5);
		
		//ce.listarProdutosEstoque();
		
	}
}
