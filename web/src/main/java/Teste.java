import java.util.ArrayList;
import java.util.List;

import fast_delivery.web.controller.EstoqueController;
import fast_delivery.web.controller.ProdutoController;
import fast_delivery.web.model.entidades.Produto;

public class Teste {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		p.setCodProduto("123456");
		p.setMargemLucroProduto(30);
		p.setNomeProduto("Amortecedor dianteiro");
		p.setPrecoCustoProduto(200);
		p.setPrecoVendaProduto(250);
		p.setQuantProduto(5);
		
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
