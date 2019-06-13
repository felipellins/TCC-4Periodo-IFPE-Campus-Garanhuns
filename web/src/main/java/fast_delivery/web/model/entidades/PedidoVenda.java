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

import fast_delivery.web.model.RealizaVenda;

@Entity
@Table(name="pedidoVenda")
public class PedidoVenda implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPedido;
	
	private Cliente cliPedido;
	private Produto prodPedido;
	private double quantProdPedido;
	private boolean pedidoFinalizado = false;
	
	public RealizaVenda realizaVenda;
	
	List<PedidoVenda> listPedidoVenda = new ArrayList<>();
	List<Produto> listProdutos = new ArrayList<>();
	
	public List<PedidoVenda> getlistPedidoVenda() {
		return listPedidoVenda;
	}
	
	public Cliente getCliPedido() {
		return cliPedido;
	}
	public void setCliPedido(Cliente cliPedido) {
		this.cliPedido = cliPedido;
	}
	public Produto getProdPedido() {
		return prodPedido;
	}
	public void setProdPedido(Produto prodPedido) {
		this.prodPedido = prodPedido;
	}
	public double getQuantProdPedido() {
		return quantProdPedido;
	}
	public void setQuantProdPedido(double quantProdPedido) {
		this.quantProdPedido = quantProdPedido;
	}
	
	public PedidoVenda(Cliente cliPedido, Produto prodPedido, double quantProdPedido, boolean pedidoFinalizado) {
		
		this.cliPedido = cliPedido;
		this.prodPedido = prodPedido;
		this.quantProdPedido = quantProdPedido;
		this.pedidoFinalizado = pedidoFinalizado;
	}
	
	public void finalizarPedido(PedidoVenda pedVenda) {
		if(verificarDisponibilidadeProduto(pedVenda) == true) {
			this.pedidoFinalizado = true;
			this.listPedidoVenda.add(pedVenda);
			this.realizaVenda.FinalizarVenda(pedVenda);	
		}else {
			System.out.println("Produto não disponivel");
		}
		
	}
	
	public boolean verificarDisponibilidadeProduto(PedidoVenda pv) {
		try {
		if(pv.getProdPedido().getQuantProduto() >0) {
			atualizarEstoque(pv);
			return true;
		}
		}catch(Exception e) {
			System.out.println("Produto indisponivel");
		}
		return false;
	}
	
	public void atualizarEstoque(PedidoVenda pvAtualizarEstoque) {
		for(int i = 0; i < listProdutos.size();i++) {
			if(listProdutos.get(i).equals(pvAtualizarEstoque.getProdPedido())) {
				
			}
		}
	}
	
	
}
