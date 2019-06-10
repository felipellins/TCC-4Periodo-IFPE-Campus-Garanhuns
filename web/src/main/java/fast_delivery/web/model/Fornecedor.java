package fast_delivery.web.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {
    
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idFornecedor;
	@Column
	private String nomeFornecedor;
	@Column
	private String cpfFornecedor;
	
	@ManyToOne(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
	private Endereco endereco;
	
	
	//List<Fornecedor>listaDeFornecedores = new  ArrayList <Fornecedor>();
		
	public Fornecedor() {
		this.endereco= new Endereco();
	}
	
	public Fornecedor( String nomeFornecedor, String cpfFornecedor, Endereco endereco) {
		super();
		
		this.nomeFornecedor = nomeFornecedor;
		this.cpfFornecedor = cpfFornecedor;
		this.endereco=endereco;
	}


	public int getIdFornecedor() {
		return idFornecedor;
	}


	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}


	public String getNomeFornecedor() {
		return nomeFornecedor;
	}


	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}


	public String getCpfFornecedor() {
		return cpfFornecedor;
	}


	public void setCpfFornecedor(String cpfFornecedor) {
		this.cpfFornecedor = cpfFornecedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfFornecedor == null) ? 0 : cpfFornecedor.hashCode());
		result = prime * result + ((nomeFornecedor == null) ? 0 : nomeFornecedor.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
		if (cpfFornecedor == null) {
			if (other.cpfFornecedor != null)
				return false;
		} else if (!cpfFornecedor.equals(other.cpfFornecedor))
			return false;
		if (nomeFornecedor == null) {
			if (other.nomeFornecedor != null)
				return false;
		} else if (!nomeFornecedor.equals(other.nomeFornecedor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fornecedor [nomeFornecedor=" + nomeFornecedor + ", cpfFornecedor=" + cpfFornecedor + ", endereco="
				+ endereco + "]";
	}


	
	
	
	
	
	
}

