
//import fast.delivery.web.model.Fornecedor;

import fast_delivery.web.controller.ProdutoController;
import fast_delivery.web.model.Produto;


public class Teste {

	public static void main(String[] args) {

		ProdutoController pc = new ProdutoController();
		
		
		
//		Produto p = new Produto();
//		p.setNomeProduto("Carroça");
//		p.setQuantProduto(1);
//		p.setValorProduto(1);
//		pc.inserirProdutoAction(p);

		Produto t = pc.recuperarProdutoAction(2);
		t.setValorProduto(5);
		System.out.println(t.toString());
		pc.alterarProdutoAction(t);
		//pc.deletarProdutoAction(t);
		
	}
}
