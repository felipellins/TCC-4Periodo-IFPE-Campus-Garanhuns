package fast_delivery.web.model.entidades;

import java.time.LocalDate;

public class LancamentoFinanceiro {
	
	public LocalDate dataLanc;
	public TipoLancamento tipoLanc;
	public Double valorLanc;
	public String histLanc;

	public LancamentoFinanceiro(LocalDate dataLanc, TipoLancamento tipoLanc,
			Double valorLanc, String histLanc) {
		
		this.dataLanc = dataLanc;
		this.tipoLanc = tipoLanc;
		this.valorLanc = valorLanc;
		this.histLanc = histLanc;
		
	}
	
	public LancamentoFinanceiro() {
		
	}

	public LocalDate getDataLanc() {
		return dataLanc;
	}

	public void setDataLanc(LocalDate dataLanc) {
		this.dataLanc = dataLanc;
	}

	public TipoLancamento getTipoLanc() {
		return tipoLanc;
	}

	public void setTipoLanc(TipoLancamento tipoLanc) {
		this.tipoLanc = tipoLanc;
	}

	public Double getValorLanc() {
		return valorLanc;
	}

	public void setValorLanc(Double valorLanc) {
		this.valorLanc = valorLanc;
	}

	public String getHistLanc() {
		return histLanc;
	}

	public void setHistLanc(String histLanc) {
		this.histLanc = histLanc;
	}
	
}
