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
		this.atualizarSaldo();
		return saldoConta;
	}

	public ContaCorrente(String numAgencia, String numConta) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
	}
	
	public void registrarLancamento(LancamentoFinanceiro lancFinanceiro) {		
		this.lancFinanceiro.add(lancFinanceiro);
	}
	
	public void atualizarSaldo() {
		for(LancamentoFinanceiro l : this.lancFinanceiro){
			if(l.getTipoLanc() == TipoLancamento.CREDITO) {
				this.saldoConta += l.getValorLanc();
			}else {
				this.saldoConta -= l.getValorLanc();
			}
			
		}
	}

}