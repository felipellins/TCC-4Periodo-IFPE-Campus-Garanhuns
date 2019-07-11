package fast_delivery.web.model.entidades;

import java.io.Serializable;

//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(length = 30)
	private String nomeProduto;

	@Column(length = 5)
	private double valorProduto;

//	@Embedded
//	private ControleEstoque controleEstoque;

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

//	public ControleEstoque getControleEstoque() {
//		return controleEstoque;
//	}
//
//	public void setControleEstoque(ControleEstoque controleEstoque) {
//		this.controleEstoque = controleEstoque;
//	}

	public Produto(String nomeProduto, double valorProduto) {
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		// this.controleEstoque = controleEstoque;
		// this.quantProduto = quantProduto;
		// this.fornProduto = fornProduto;
	}

	public Produto() {

	}

	public String toString() {
		return "Nome do Produto: " + this.nomeProduto
				+ "\n Valor do produto: " + this.valorProduto /*"\n Quantidade disponivel " + this.controleEstoque.getQuantProdEstoque()*/;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeProduto == null) ? 0 : nomeProduto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorProduto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nomeProduto == null) {
			if (other.nomeProduto != null)
				return false;
		} else if (!nomeProduto.equals(other.nomeProduto))
			return false;
		if (Double.doubleToLongBits(valorProduto) != Double.doubleToLongBits(other.valorProduto))
			return false;
		return true;
	}
}
