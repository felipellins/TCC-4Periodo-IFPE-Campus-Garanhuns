package fast_delivery.web.model;

import java.io.Serializable;

//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(length = 30)
	private String nomeProduto;
	
	@Column(length = 5)
	private double valorProduto;
	
	@Column(length = 5)
	private double quantProduto;
	
	
	//private Fornecedor fornProduto;
	
	
	//List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public double getQuantProduto() {
		return quantProduto;
	}

	public void setQuantProduto(double quantProduto) {
		this.quantProduto = quantProduto;
	}

	//public Fornecedor getFornProduto() {
		//return fornProduto;
	//}

	//public void setFornProduto(Fornecedor fornProduto) {
		//this.fornProduto = fornProduto;
	//}

	//public List<Produto> getListaDeProdutos() {
		//return listaDeProdutos;
	//}

	//public void setListaDeProdutos(List<Produto> listaDeProdutos) {
		//this.listaDeProdutos = listaDeProdutos;
	//}
	
	

	public Produto(String nomeProduto, double valorProduto, double quantProduto) {
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.quantProduto = quantProduto;
		//this.fornProduto = fornProduto;
	}
	
	public Produto() {
		
	}

	public void cadastrarProduto() {
		
	}
	
	public void alterarProduto() {
		
	}
	
	//public List listarProduto() {
		//return listaDeProdutos;
	//}

}
