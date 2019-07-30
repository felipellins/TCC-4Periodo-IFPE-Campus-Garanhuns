package fast_delivery.web.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fast_delivery.web.model.entidades.FormaDePagamento_Recebimento;
import fast_delivery.web.model.entidades.PedidoVenda;

public class RealizaVenda {
	
	private int idVenda;
	private LocalDate dataVenda;
	private FormaDePagamento_Recebimento formaPagamentoVenda;
	private boolean statusVenda = false;
	
	public PedidoVenda pedVenda;
	
	List<RealizaVenda> listRealizaVenda = new ArrayList<>();
	
	public List<RealizaVenda> getlistRealizaVenda() {
		return listRealizaVenda;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public FormaDePagamento_Recebimento getFormaPagamentoVenda() {
		return formaPagamentoVenda;
	}

	public void setFormaPagamentoVenda(FormaDePagamento_Recebimento formaPagamentoVenda) {
		this.formaPagamentoVenda = formaPagamentoVenda;
	}

	public PedidoVenda getPedVenda() {
		return pedVenda;
	}

	public void setPedVenda(PedidoVenda pedVenda) {
		this.pedVenda = pedVenda;
	}

	public RealizaVenda(LocalDate dataVenda, FormaDePagamento_Recebimento formaPagamentoVenda, PedidoVenda pedVenda, boolean statusVenda) {
		
		this.dataVenda = dataVenda;
		this.formaPagamentoVenda = formaPagamentoVenda;
		this.pedVenda = pedVenda;
		this.statusVenda = statusVenda;
	}
	
	public void FinalizarVenda(PedidoVenda pedVenda) {
		
	}
	
	
}
