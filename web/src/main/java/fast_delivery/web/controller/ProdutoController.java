package fast_delivery.web.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fast_delivery.web.model.ProdutoModel;
import fast_delivery.web.model.entidades.Produto;


@ManagedBean (name = "produtocontroller")
@SessionScoped
public class ProdutoController{
	
	private Produto produto;
	private ProdutoModel produtoModel;
	
	@PostConstruct
    public void init() {
        produto = new Produto();
        produtoModel = new ProdutoModel();
    }
	
	public ProdutoController() {
		
	}

	public void inserirProdutoAction() {
		produtoModel.inserir(produto);
	}

	public void alterarProdutoAction() {
		produtoModel.alterar(produto);
	}

	public Produto recuperarProdutoAction(Integer p) {

		return produtoModel.recuperar(p);
	}

	public void deletarProdutoAction() {
		produtoModel.deletar(produto);

	}

	public List<Produto> listarTodosProdutoAction() {

		return produtoModel.listarTodos();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setP(Produto produto) {
		this.produto = produto;
	}

	public ProdutoModel getprodutoModel() {
		return produtoModel;
	}

	public void setPm(ProdutoModel produtoModel) {
		this.produtoModel = produtoModel;
	}

	
	
}
