package fast_delivery.web.conexaobanco;
import java.time.LocalDate;

import fast_delivery.web.model.entidades.ContaCorrente;
import fast_delivery.web.model.entidades.LancamentoFinanceiro;
import fast_delivery.web.model.entidades.TipoLancamento;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente("00", "00");
		
		LancamentoFinanceiro lf = new LancamentoFinanceiro();
		lf.setDataLanc(LocalDate.now());
		lf.setTipoLanc(TipoLancamento.CREDITO);
		lf.setValorLanc(100.0);
		lf.setHistLanc("Lancamento inicial para teste");
		
		cc.registrarLancamento(lf);
		
		LancamentoFinanceiro lf2 = new LancamentoFinanceiro();
		lf2.setDataLanc(LocalDate.now());
		lf2.setTipoLanc(TipoLancamento.DEBITO);
		lf2.setValorLanc(40.0);
		lf2.setHistLanc("Lancamento inicial para teste");
		
		cc.registrarLancamento(lf2);
		
		System.out.println(cc.getSaldoConta());
		
	}
}
