package fast_delivery.web.model.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VendaDeMercadoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVendaMercadoria;
	
	@Column
	public PedidoVenda pedidoVenda;
	
	@Column
	private boolean statusVendaMercadoria = false;

	public VendaDeMercadoria(PedidoVenda pedidoVenda, boolean statusVendaMercadoria) {
		super();
		this.pedidoVenda = pedidoVenda;
		this.statusVendaMercadoria = statusVendaMercadoria;
	}
	
	public VendaDeMercadoria() {
		
	}

	@Override
	public String toString() {
		return "VendaDeMercadoria [pedidoVenda=" + pedidoVenda + ", statusVendaMercadoria=" + statusVendaMercadoria
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pedidoVenda == null) ? 0 : pedidoVenda.hashCode());
		result = prime * result + (statusVendaMercadoria ? 1231 : 1237);
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
		VendaDeMercadoria other = (VendaDeMercadoria) obj;
		if (pedidoVenda == null) {
			if (other.pedidoVenda != null)
				return false;
		} else if (!pedidoVenda.equals(other.pedidoVenda))
			return false;
		if (statusVendaMercadoria != other.statusVendaMercadoria)
			return false;
		return true;
	}

	public void finalizarVenda(PedidoVenda pedidoVenda) {
		if(pedidoVenda.isStatusPedido() == true) {
			
		}
	}
	
}
