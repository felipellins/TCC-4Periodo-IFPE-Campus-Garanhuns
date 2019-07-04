import fast_delivery.web.model.entidades.ControleEstoque;
import fast_delivery.web.model.entidades.Produto;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ControleEstoque ce = new ControleEstoque();
		ce.setQuantProdEstoque(0);
		
		Produto p = new Produto();
		Produto p2 = new Produto();
		
		p.setNomeProduto("Arroz verde");
		p.setValorProduto(6.5);
		p.setControleEstoque(ce);
		
		p2.setNomeProduto("Arroz verde");
		p2.setValorProduto(6.8);
		p2.setControleEstoque(ce);
		
		ce.inserirProdutoEstoque(p);
		ce.inserirProdutoEstoque(p2);
		
		
		
		ce.listarProdutosEstoque();
		
		//ce.removerProdutoEstoque(p2);
		
		//ce.listarProdutosEstoque();
		
		
	}

}
