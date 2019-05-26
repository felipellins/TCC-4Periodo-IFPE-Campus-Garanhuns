
//import fast.delivery.web.model.Fornecedor;
import java.util.ArrayList;
import java.util.List;

import fast_delivery.web.controller.ProdutoController;
import fast_delivery.web.model.Produto;


public class Teste {

	public static void main(String[] args) {

		Produto p = new Produto("Arroz", 0, 0);
		
		//System.out.println(p.toString());
		
		List<Produto> t = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			
			
			t.add(p);
			p.setQuantProduto(i);
			System.out.println(p.toString());
		}
		
//		for(Produto produtoTeste : t) {
//			System.out.println(produtoTeste.toString() + "\n");
//		}

	}
}
