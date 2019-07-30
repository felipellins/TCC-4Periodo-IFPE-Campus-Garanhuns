package fast_delivery.web.model.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idProduto;

	@Column
	private String nomeProduto;
	
	@Column
	private double valorProduto;

	@Column
	private double quantProduto;
	
	private Fornecedor fornProduto;

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

	public Produto(String nomeProduto, double valorProduto, double quantProduto, Fornecedor fornProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.quantProduto = quantProduto;
		this.fornProduto = fornProduto;
	}
	
	public Produto () {
		
	}

	@Override
	public String toString() {
		return "Produto [nomeProduto=" + nomeProduto + ", valorProduto=" + valorProduto + ", quantProduto="
				+ quantProduto + ", fornProduto=" + fornProduto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fornProduto == null) ? 0 : fornProduto.hashCode());
		result = prime * result + ((nomeProduto == null) ? 0 : nomeProduto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(quantProduto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (fornProduto == null) {
			if (other.fornProduto != null)
				return false;
		} else if (!fornProduto.equals(other.fornProduto))
			return false;
		if (nomeProduto == null) {
			if (other.nomeProduto != null)
				return false;
		} else if (!nomeProduto.equals(other.nomeProduto))
			return false;
		if (Double.doubleToLongBits(quantProduto) != Double.doubleToLongBits(other.quantProduto))
			return false;
		if (Double.doubleToLongBits(valorProduto) != Double.doubleToLongBits(other.valorProduto))
			return false;
		return true;
	}
}
