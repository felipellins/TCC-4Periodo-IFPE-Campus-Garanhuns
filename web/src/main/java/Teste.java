import java.time.LocalDate;

import fast_delivery.web.model.ContaCorrente;
import fast_delivery.web.model.LancamentoFinanceiro;
import fast_delivery.web.model.TipoLancamento;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente("00", "00");
		
		LancamentoFinanceiro lf = new LancamentoFinanceiro();
		lf.setDataLanc(LocalDate.now());
		lf.setTipoLanc(TipoLancamento.CREDITO);
		lf.setValorLanc(100.25);
		lf.setHistLanc("Lancamento inicial para teste");
		
		cc.registrarLancamento(lf);
		
		LancamentoFinanceiro lf2 = new LancamentoFinanceiro();
		lf2.setDataLanc(LocalDate.now());
		lf2.setTipoLanc(TipoLancamento.DEBITO);
		lf2.setValorLanc(50.25);
		lf2.setHistLanc("Lancamento inicial para teste");
		
		cc.registrarLancamento(lf2);
		
		System.out.println(cc.getSaldoConta());
		
	}
}
