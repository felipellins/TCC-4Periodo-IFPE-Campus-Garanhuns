package fast_delivery.web.model.entidades;

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
@Table(name = "empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idEmpresa;
	@Column
	private String nomeEmpresa;
	@Column
	private String cnpjEmpresa;
	@ManyToOne(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
	private Endereco endereco;
	
	
	public Empresa() {
		this.endereco= new Endereco();
	}
	
	public Empresa( String nomeEmpresa, String cnpjEmpresa,Endereco endereco) {
		super();
		
		this.nomeEmpresa = nomeEmpresa;
		this.cnpjEmpresa = cnpjEmpresa;
		this.endereco=endereco;
		
	}



	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}


	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}


	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}


	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpjEmpresa == null) ? 0 : cnpjEmpresa.hashCode());
		result = prime * result + ((nomeEmpresa == null) ? 0 : nomeEmpresa.hashCode());
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
		Empresa other = (Empresa) obj;
		if (cnpjEmpresa == null) {
			if (other.cnpjEmpresa != null)
				return false;
		} else if (!cnpjEmpresa.equals(other.cnpjEmpresa))
			return false;
		if (nomeEmpresa == null) {
			if (other.nomeEmpresa != null)
				return false;
		} else if (!nomeEmpresa.equals(other.nomeEmpresa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empresa [nomeEmpresa=" + nomeEmpresa + ", cnpjEmpresa=" + cnpjEmpresa + "]";
	}


	
	
	
}

