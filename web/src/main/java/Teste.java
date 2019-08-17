import java.util.ArrayList;
import java.util.List;

import fast_delivery.web.controller.EstoqueController;
import fast_delivery.web.controller.ProdutoController;
import fast_delivery.web.model.entidades.Produto;

public class Teste {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		p.setCodProduto("Produto123Teste5");
		p.setMargemLucroProduto(30);
		p.setNomeProduto("Cocada de Sal");
		p.setPrecoCustoProduto(0.5);
		p.setPrecoVendaProduto(35);
		p.setQuantProduto(-10);
		
		ProdutoController pc = new ProdutoController();
		
		pc.inserirProdutoAction(p);
		//pc.deletarProdutoAction(p);

		//System.out.println(pc.recuperarPorCodigoAction("Produto123Teste"));
		
		List<Produto> lp = new ArrayList<>();
		lp.add(p);
		
		EstoqueController ec = new EstoqueController();
		
		//ec.adicionarProduto(lp);
		//ec.removerProduto(lp);
		
	}

}
