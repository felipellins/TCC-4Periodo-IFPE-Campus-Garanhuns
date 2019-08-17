package fast_delivery.web.model.dao;

import fast_delivery.web.model.entidades.Produto;

public interface ProdutoDao extends Dao<Produto> {

	public Produto recuperarPorCodigo(String str);
	public boolean verificarProdutoCadastrado(Produto p);
	
}
