package fast_delivery.web.model;

public class ContaCorrente {
	
	private String numAgencia;
	private String numConta;
	private double saldoConta;
	
	
	
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
	
	

	public ContaCorrente(String numAgencia, String numConta, double saldoConta) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldoConta = saldoConta;
	}

	private void cadastrarConta() {
		
	}
	
	private void alterarConta() {
		
	}
	
	private void gerarRelatorio() {
		
	}
	
	private void realizarLancamento() {
		
	}

}
