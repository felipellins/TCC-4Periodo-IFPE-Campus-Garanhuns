package fast_delivery.web.model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	
	private String nomeProduto;
	private double valorProduto;
	private double quantProduto;
	private Fornecedor fornProduto;
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	
	
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

	public Fornecedor getFornProduto() {
		return fornProduto;
	}

	public void setFornProduto(Fornecedor fornProduto) {
		this.fornProduto = fornProduto;
	}

	public List<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

	public void setListaDeProdutos(List<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}
	
	

	public Produto(String nomeProduto, double valorProduto, double quantProduto, Fornecedor fornProduto) {
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.quantProduto = quantProduto;
		this.fornProduto = fornProduto;
	}

	public void cadastrarProduto() {
		
	}
	
	public void alterarProduto() {
		
	}
	
	public List listarProduto() {
		return listaDeProdutos;
	}

}
