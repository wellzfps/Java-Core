package entities.heranca;

public class ContaPoupanca extends Conta {
	private Double taxaSaque;

	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(Integer numeroConta, String titularConta, Double saldoConta, Double taxaSaque) {
		super(numeroConta, titularConta, saldoConta);
		this.taxaSaque = taxaSaque;
	}
	
	public Double getTaxaSaque() {
		return taxaSaque;
	}

	public void setTaxaSaque(Double taxaSaque) {
		this.taxaSaque = taxaSaque;
	}

	public void saque() {
		saldoConta += saldoConta * taxaSaque;

	}
}
