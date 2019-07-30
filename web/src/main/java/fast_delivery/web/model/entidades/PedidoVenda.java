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
import javax.persistence.Table;

@Entity
public class PedidoVenda implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPedidoVenda;
	
	@Column
	private Cliente nomeClientePedido;
	
	@Column
	private Produto produtosPedido;
	
	@Column
	private LocalDate DataPedido;
	
	@Column
	private double quantidadeDeProdutosPedido;
	
	@Column
	private FormaDePagamento_Recebimento formaDePagamentoPedido;
	
	@Column
	private double valorTotalPedido;
	
	@Column
	private boolean statusPedido = false;

	public Cliente getNomeClientePedido() {
		return nomeClientePedido;
	}

	public void setNomeClientePedido(Cliente nomeClientePedido) {
		this.nomeClientePedido = nomeClientePedido;
	}

	public Produto getProdutosPedido() {
		return produtosPedido;
	}

	public void setProdutosPedido(Produto produtosPedido) {
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

	public FormaDePagamento_Recebimento getFormaDePagamentoPedido() {
		return formaDePagamentoPedido;
	}

	public void setFormaDePagamentoPedido(FormaDePagamento_Recebimento formaDePagamentoPedido) {
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

	public PedidoVenda(Cliente nomeClientePedido, Produto produtosPedido, LocalDate dataPedido,
			double quantidadeDeProdutosPedido, FormaDePagamento_Recebimento formaDePagamentoPedido,
			double valorTotalPedido, boolean statusPedido) {
		super();
		this.nomeClientePedido = nomeClientePedido;
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
		return "PedidoVenda [nomeClientePedido=" + nomeClientePedido + ", produtosPedido=" + produtosPedido
				+ ", DataPedido=" + DataPedido + ", quantidadeDeProdutosPedido=" + quantidadeDeProdutosPedido
				+ ", formaDePagamentoPedido=" + formaDePagamentoPedido + ", valorTotalPedido=" + valorTotalPedido
				+ ", statusPedido=" + statusPedido + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DataPedido == null) ? 0 : DataPedido.hashCode());
		result = prime * result + ((formaDePagamentoPedido == null) ? 0 : formaDePagamentoPedido.hashCode());
		result = prime * result + ((nomeClientePedido == null) ? 0 : nomeClientePedido.hashCode());
		result = prime * result + ((produtosPedido == null) ? 0 : produtosPedido.hashCode());
		long temp;
		temp = Double.doubleToLongBits(quantidadeDeProdutosPedido);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (statusPedido ? 1231 : 1237);
		temp = Double.doubleToLongBits(valorTotalPedido);
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
		PedidoVenda other = (PedidoVenda) obj;
		if (DataPedido == null) {
			if (other.DataPedido != null)
				return false;
		} else if (!DataPedido.equals(other.DataPedido))
			return false;
		if (formaDePagamentoPedido == null) {
			if (other.formaDePagamentoPedido != null)
				return false;
		} else if (!formaDePagamentoPedido.equals(other.formaDePagamentoPedido))
			return false;
		if (nomeClientePedido == null) {
			if (other.nomeClientePedido != null)
				return false;
		} else if (!nomeClientePedido.equals(other.nomeClientePedido))
			return false;
		if (produtosPedido == null) {
			if (other.produtosPedido != null)
				return false;
		} else if (!produtosPedido.equals(other.produtosPedido))
			return false;
		if (Double.doubleToLongBits(quantidadeDeProdutosPedido) != Double
				.doubleToLongBits(other.quantidadeDeProdutosPedido))
			return false;
		if (statusPedido != other.statusPedido)
			return false;
		if (Double.doubleToLongBits(valorTotalPedido) != Double.doubleToLongBits(other.valorTotalPedido))
			return false;
		return true;
	}

	private VendaDeMercadoria vendaDeMercadoria;
	
	public void finalizarPedido(PedidoVenda pedidoVenda) {
		if(verificarDisponibilidadeProduto(pedidoVenda.getProdutosPedido()) == true) {
			vendaDeMercadoria.finalizarVenda(pedidoVenda);
			pedidoVenda.statusPedido = true;
		}
		System.out.println("Produto indisponivel!");
	}
	
	public boolean verificarDisponibilidadeProduto(Produto produto) {
		if(produto.getQuantProduto()>0) {
			return true;
		}
		return false;
	}

	
}
