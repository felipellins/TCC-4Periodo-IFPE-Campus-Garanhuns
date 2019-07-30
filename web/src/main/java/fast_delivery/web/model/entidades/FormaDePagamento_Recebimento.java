package fast_delivery.web.model.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FormaDePagamento_Recebimento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idFormaDePagamento_Recebimento;
	
	@Column
	private String DescricaoFormaPagamento;
	
	@Column
	private int quantidadeDeParcelas;

	public FormaDePagamento_Recebimento(String descricaoFormaPagamento, int quantidadeDeParcelas) {
		super();
		DescricaoFormaPagamento = descricaoFormaPagamento;
		this.quantidadeDeParcelas = quantidadeDeParcelas;
	}
	
	public FormaDePagamento_Recebimento() {
		
	}

	@Override
	public String toString() {
		return "FormaDePagamento_Recebimento [DescricaoFormaPagamento=" + DescricaoFormaPagamento
				+ ", quantidadeDeParcelas=" + quantidadeDeParcelas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DescricaoFormaPagamento == null) ? 0 : DescricaoFormaPagamento.hashCode());
		result = prime * result + quantidadeDeParcelas;
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
		FormaDePagamento_Recebimento other = (FormaDePagamento_Recebimento) obj;
		if (DescricaoFormaPagamento == null) {
			if (other.DescricaoFormaPagamento != null)
				return false;
		} else if (!DescricaoFormaPagamento.equals(other.DescricaoFormaPagamento))
			return false;
		if (quantidadeDeParcelas != other.quantidadeDeParcelas)
			return false;
		return true;
	}
	
	
}
