package fast_delivery.web.model.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class PedidoVenda implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPedidoVenda;
	
	@Column
	private Cliente clientePedido;
	
	@OneToMany
	private List<Produto> produtosPedido;
	
	@Column
	private LocalDate DataPedido;
	
	@Column
	private double quantidadeDeProdutosPedido;
	
	@OneToOne
	private FormaDePagamento formaDePagamentoPedido;
	
	@Column
	private double valorTotalPedido;
	
	@Column
	private boolean statusPedido = false;

	public Cliente getClientePedido() {
		return clientePedido;
	}

	public void setClientePedido(Cliente clientePedido) {
		this.clientePedido = clientePedido;
	}

	public List<Produto> getProdutosPedido() {
		return produtosPedido;
	}

	public void setProdutosPedido(List<Produto> produtosPedido) {
		this.produtosPedido = produtosPedido;
	}

	public LocalDate getDataPedido() {
		return DataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		DataPedido = dataPedido;
	}

	public double getQuantidadeDeProdutosPedido() {
		return quantidadeDeProdutosPedido;
	}

	public void setQuantidadeDeProdutosPedido(double quantidadeDeProdutosPedido) {
		this.quantidadeDeProdutosPedido = quantidadeDeProdutosPedido;
	}

	public FormaDePagamento getFormaDePagamentoPedido() {
		return formaDePagamentoPedido;
	}

	public void setFormaDePagamentoPedido(FormaDePagamento formaDePagamentoPedido) {
		this.formaDePagamentoPedido = formaDePagamentoPedido;
	}

	public double getValorTotalPedido() {
		return valorTotalPedido;
	}

	public void setValorTotalPedido(double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}

	public boolean isStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(boolean statusPedido) {
		this.statusPedido = statusPedido;
	}

	public PedidoVenda(Cliente clientePedido, List<Produto> produtosPedido, LocalDate dataPedido,
			double quantidadeDeProdutosPedido, FormaDePagamento formaDePagamentoPedido,
			double valorTotalPedido, boolean statusPedido) {
		super();
		this.clientePedido = clientePedido;
		this.produtosPedido = produtosPedido;
		DataPedido = dataPedido;
		this.quantidadeDeProdutosPedido = quantidadeDeProdutosPedido;
		this.formaDePagamentoPedido = formaDePagamentoPedido;
		this.valorTotalPedido = valorTotalPedido;
		this.statusPedido = statusPedido;
	}

	public PedidoVenda() {
		
	}

	@Override
	public String toString() {
		return "PedidoVenda [clientePedido=" + clientePedido + ", produtosPedido=" + produtosPedido + ", DataPedido="
				+ DataPedido + ", quantidadeDeProdutosPedido=" + quantidadeDeProdutosPedido
				+ ", formaDePagamentoPedido=" + formaDePagamentoPedido + ", valorTotalPedido=" + valorTotalPedido
				+ ", statusPedido=" + statusPedido + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientePedido == null) ? 0 : clientePedido.hashCode());
		result = prime * result + idPedidoVenda;
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
		PedidoVenda other = (PedidoVenda) obj;
		if (clientePedido == null) {
			if (other.clientePedido != null)
				return false;
		} else if (!clientePedido.equals(other.clientePedido))
			return false;
		if (idPedidoVenda != other.idPedidoVenda)
			return false;
		return true;
	}
	
	
	
	
}
