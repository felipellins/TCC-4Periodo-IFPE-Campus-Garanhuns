package fast_delivery.web.model;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {

	private String numAgencia;
	private String numConta;
	private double saldoConta;

	private List<LancamentoFinanceiro> lancFinanceiro = new ArrayList<>();
	
	public List<LancamentoFinanceiro> getLancFinanceiro() {
		return lancFinanceiro;
	}

	public void setLancFinanceiro(List<LancamentoFinanceiro> lancFinanceiro) {
		this.lancFinanceiro = lancFinanceiro;
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public ContaCorrente(String numAgencia, String numConta) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		//this.saldoConta = saldoConta;
	}

//	private void gerarRelatorio() {
//
//	}
	
	public void registrarLancamento(LancamentoFinanceiro lancFinanceiro) {
		this.lancFinanceiro.add(lancFinanceiro);	
		atualizarSaldo();
	}
	
	private void atualizarSaldo() {
		for (LancamentoFinanceiro lancamentoFinanceiro : lancFinanceiro) {
			if(lancamentoFinanceiro.tipoLanc.DEBITO.equals(TipoLancamento.DEBITO)) {
				this.saldoConta = this.saldoConta - lancamentoFinanceiro.valorLanc;
			}else if(lancamentoFinanceiro.tipoLanc.CREDITO.equals(TipoLancamento.CREDITO)){
				this.saldoConta = this.saldoConta + lancamentoFinanceiro.valorLanc;
			}else {
				System.out.println("LANCAMENTO INVALIDO");
			}
		}
	}

}
