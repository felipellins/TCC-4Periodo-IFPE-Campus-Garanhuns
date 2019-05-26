
//import fast.delivery.web.model.Fornecedor;
import java.util.ArrayList;
import java.util.List;

import fast_delivery.web.controller.ProdutoController;
import fast_delivery.web.model.Produto;


public class Teste {

	public static void main(String[] args) {

		ProdutoController pc = new ProdutoController();
		
		
		
		Produto p = new Produto("Outra Carroça", 1, 1);
//		pc.inserirProdutoAction(p);
		Produto temp = pc.recuperarProdutoAction(2);
		if(temp != null) {
			System.out.println(temp.toString());
		}
	}
}
