package fast_delivery.web;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fast_delivery.web.model.entidades.ContaCorrente;
import fast_delivery.web.model.entidades.LancamentoFinanceiro;
import fast_delivery.web.model.entidades.TipoLancamento;
import junit.framework.Assert;

public class TesteContaCorrente {

	private ContaCorrente contaCorrente;
	private List<LancamentoFinanceiro> listaDeLancamentosFinanceiros = new ArrayList<>();

	private String numAgencia = "1";
	private String numConta = "2";

	@Before
	public void inicializacao() {
		contaCorrente = new ContaCorrente(numAgencia, numConta);
		listaDeLancamentosFinanceiros = Arrays.asList(
				new LancamentoFinanceiro(LocalDate.now(), TipoLancamento.CREDITO, 252.25, "Lançamento inicial"),
				new LancamentoFinanceiro(LocalDate.now(), TipoLancamento.DEBITO, 52.25, "Lançamento inicial"));
		adicionarLancamentosNaConta(listaDeLancamentosFinanceiros);
	}

	@Test
	public void saldo() {
		Double saldoEsperado = 200.0;		
		Assert.assertEquals(saldoEsperado, contaCorrente.getSaldoConta());		
	}

	private void adicionarLancamentosNaConta(List<LancamentoFinanceiro> listaDeLancamentos) {
		for (LancamentoFinanceiro lancamento : listaDeLancamentosFinanceiros) {
			contaCorrente.registrarLancamento(lancamento);
		}
	}

}
