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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(length = 30)
	private String nomeProduto;

	@Column(length = 5)
	private double valorProduto;

	@Column(length = 5)
	private double quantProduto;

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

	public Produto(String nomeProduto, double valorProduto, double quantProduto) {
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.quantProduto = quantProduto;
		// this.fornProduto = fornProduto;
	}

	public Produto() {

	}

	public String toString() {
		return "Nome do Produto: " + this.nomeProduto + "\n Quantidade do produto: " + this.quantProduto
				+ "\n Valor do produto: " + this.valorProduto;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Produto other = (Produto) obj;
		if (this.id != other.id) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 67 * hash + this.id;
		return hash;
	}

}
