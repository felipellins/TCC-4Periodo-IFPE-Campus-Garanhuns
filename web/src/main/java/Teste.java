//import fast.delivery.web.model.Fornecedor;
import fast_delivery.web.controller.ProdutoController;
import fast_delivery.web.model.Produto;

public class Teste {

	public static void main(String[] args) {

		
		ProdutoController pc = new ProdutoController();
		
		//Fornecedor forn = new Fornecedor();
		
		Produto pr = new Produto("ArrozBranco", 1.0, 1.0);
		
		//pr.setNomeProduto("Arroz");
		//pr.setQuantProduto(1);
		//pr.setValorProduto(3);
		
		
		//Produto pr2 = new Produto();
		
		pc.inserirProdutoAction(pr);
		
		
		//System.out.println("teste " + pr.getNomeProduto());
	}

}
